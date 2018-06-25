package model.handler;

import model.to.cadredb.*;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.PageBean;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class RelationLinkTask implements Runnable {

    private SessionFactory fromSessionFactory;
    private SessionFactory toSessionFactory;
    private Session fromSession;
    private Session toSession;

    public RelationLinkTask(SessionFactory fromSessionFactory,
                            SessionFactory toSessionFactory) {
        this.fromSessionFactory = fromSessionFactory;
        this.toSessionFactory   = toSessionFactory;
    }

    @Override
    public void run() {
        fromSession = fromSessionFactory.openSession();
        toSession   = toSessionFactory.openSession();

        //得到 relationNode的所有id
        int totalNodeIds = nodeIdCounts();
        PageBean pageBean = new PageBean(0,1000,totalNodeIds);
        for (int i=0; i<pageBean.getBatch(); i++) {
            List<String> nodeIds = getNodeIds(pageBean.getFirstResult(), pageBean.getMaxResult());
            execute(nodeIds);
            pageBean.setFirstResult(pageBean.getFirstResult() + pageBean.getMaxResult());
        }

        //最后一次
        List<String> nodeIds = getNodeIds(pageBean.getFirstResult(),pageBean.getLastResult());
        execute(nodeIds);


    }

    public List<String> getNodeIds(int firstResult, int maxResults){
        Query query = toSession.createQuery("select nodeId from RelationNode ");
        query.setFirstResult(firstResult).setMaxResults(maxResults);
        List<String> list = query.list();
        return list;
    }

    public int nodeIdCounts() {
        Query query = toSession.createQuery("select count(1) from RelationNode");
        List countLst = query.list();
        //得到总条数
        int totalCounts = 0;
        if (countLst.size() > 0) {
            Object o = countLst.get(0);
            if (!org.springframework.util.StringUtils.isEmpty(o)) {
                totalCounts = Integer.parseInt(String.valueOf(o));
            }
        }
        return totalCounts;
    }

    void execute(List<String> nodeIds) {
        AtomicInteger counts = new AtomicInteger();
        Query query2 = toSession.createQuery("from RelationNode where nodeId in :ids and nodeType =:nodeType");
        List<RelationNode> nodeInfos = query2.setParameterList("ids", nodeIds).setParameter("nodeType", "干部").list();
        List<String> cadreIds = new ArrayList<>();
        for (RelationNode relationNode: nodeInfos) {
            cadreIds.add(relationNode.getOriginalId());
        }

        //同事,工作经验表中查询
        List<Map<String,Object>>  listData = new ArrayList<>();
        List<CadreInfoExperience> cadreInfoExperiences = toSession.createQuery("from CadreInfoExperience where cadreId in :cadreIds").setParameter("cadreIds", cadreIds).list();
        System.out.println("cadreInfoExperience.size=="+cadreInfoExperiences.size());
        Map<String,Object> resMap = null;
        for (CadreInfoExperience cadreInfoExperience: cadreInfoExperiences) {
            resMap = new HashMap<>();
            resMap.put("start",cadreInfoExperience.getNominationDate());
            resMap.put("end",cadreInfoExperience.getRemovalDate());
            resMap.put("code",cadreInfoExperience.getOrganizationCode());
            listData.add(resMap);
        }

        System.out.println("listData.size=="+listData.size());
        StringBuffer hql = new StringBuffer("select * from CADRE_INFO_EXPERIENCE where (");
        for (Map<String,Object> map :listData) {
            Timestamp nominationDate = (Timestamp)map.get("start");
            Timestamp removalDate    = (Timestamp)map.get("end");
            String code   =(String) map.get("code");
            hql.append(" (NOMINATION_DATE between '"+nominationDate+"' and '"+removalDate+"' or REMOVAL_DATE between '"+nominationDate+"' and '"+removalDate+"') and ORGANIZATION_CODE ="+code+") or(");
        }
        String queryHql = hql.toString().substring(0,hql.length()-2);
        System.out.println("queryHql=="+queryHql);
        List<CadreInfoExperience> cadreInfoExperienceList =
                (List<CadreInfoExperience>)toSession.createNativeQuery(queryHql).list();

        System.out.println("cadreInfoExperienceList.size()=="+cadreInfoExperienceList.size());






        /*
        //亲戚
        List<CadreInfoRelationship> families = toSession.createQuery("from CadreInfoRelationship where cadreId in :cadreIds").setParameter("cadreIds", cadreIds).list();
        System.out.println("cadreInfoRelationShip.size=="+families.size());

        //获取所有的学校列表
        List<CadreInfoEducation> educations = toSession.createQuery("from CadreInfoEducation where cadreId in :cadreIds").setParameter("cadreIds", cadreIds).list();
        System.out.println("cadreInfoEducation.size=="+educations.size());
        */
    }


}
