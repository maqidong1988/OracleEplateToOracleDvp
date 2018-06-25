package model.handler;

import model.from.EmpA02;
import model.mapper.team.LeadershipOverviewMapper;
import model.to.cadredb.CadreInfoExperience;
import model.to.teamdb.LeadershipOverview;
import org.hibernate.*;
import org.mapstruct.factory.Mappers;
import util.PageBean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

public class LeaderShipOverviewTask implements Runnable {

    private SessionFactory fromSessionFactory;
    private SessionFactory toSessionFactory;
    private Session toSession;
    private LeadershipOverviewMapper mapper;
    private List<Map<String,Object>> mapLst;
    private CountDownLatch cdl;

    public LeaderShipOverviewTask(SessionFactory fromSessionFactory,
                                  SessionFactory toSessionFactory,
                                  CountDownLatch cdl) {
        this.fromSessionFactory = fromSessionFactory;
        this.toSessionFactory = toSessionFactory;
        this.cdl = cdl;
    }

    @Override
    public void run() {
        try {
            toSession = toSessionFactory.openSession();
            mapper = Mappers.getMapper(LeadershipOverviewMapper.class);

            mapLst = selectByCondition();
            //查询总数量
            int totalCount = CadreInfoExperienceCount();
            PageBean pageBean = new PageBean(0,1000,totalCount);
            for (int i=0; i<pageBean.getBatch(); i++) {
                execute(pageBean.getFirstResult(),pageBean.getMaxResult());
                pageBean.setFirstResult(pageBean.getFirstResult()+pageBean.getMaxResult());
            }

            //最后一次
            execute(pageBean.getFirstResult(),pageBean.getLastResult());
            System.out.println("LeaderShipOverviewTask 执行完毕");
            cdl.countDown();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (toSession!=null) {
                toSession.close();
            }
        }
    }

    List<Map<String,Object>> selectByCondition() {
        List<Map<String,Object>> returnData = new ArrayList<>();
        Query query = toSession.createQuery("select new Map(divisionType as divisionType," +
                "organizationName as organizationName,affiliation as affiliation) " +
                "from CadreInfoExperience where divisionType like :divisionType and assignStatus = :assignStatus " +
                "group by divisionType,organizationName,affiliation");
        query.setParameter("divisionType", "1_1");
        query.setParameter("assignStatus", "2");
        List listData = query.list();
        for (Object o: listData) {
            Map map = (Map) o;
            returnData.add(map);
        }
        return returnData;
    }

    int CadreInfoExperienceCount() {
        Query query = toSession.createQuery("select count(1) from CadreInfoExperience");
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

    void execute(int firstResult, int maxResults){
        Criteria criteria = toSession.createCriteria(CadreInfoExperience.class);
        criteria.setFirstResult(firstResult).setMaxResults(maxResults);
        List<CadreInfoExperience> listData = (List<CadreInfoExperience>)criteria.list();
        System.out.println("LeaderShipOverview 表插入了:"+firstResult+"条");
        Transaction transaction = toSession.getTransaction();
        transaction.begin();
        for (CadreInfoExperience cadreInfoExperience: listData) {
            for(Map mapData: mapLst) {
                String divisionType = (String)mapData.get("divisionType");
                String organizationName = (String)mapData.get("organizationName");
                String affiliation = (String)mapData.get("affiliation");
                if((divisionType!=null && divisionType.equals(cadreInfoExperience.getDivisionType())) &&
                   (organizationName!=null && organizationName.equals(cadreInfoExperience.getOrganizationName()))&&
                   (affiliation!=null && affiliation.equals(cadreInfoExperience.getAffiliation()))&&
                        "2".equals(cadreInfoExperience.getAssignStatus())) {
                    LeadershipOverview leadershipOverview = mapper.cadreInfoExperienceToLeadershiOverview(cadreInfoExperience);
                    toSession.save(leadershipOverview);
                }
            }
        }
        transaction.commit();
    }
}
