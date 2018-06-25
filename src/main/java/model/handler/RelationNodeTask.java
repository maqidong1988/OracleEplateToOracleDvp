package model.handler;

import model.mapper.cadredb.RelationNodeMapper;
import model.mapper.cadredb.RelationNodeOfFamilyMapper;
import model.to.cadredb.CadreInfo;
import model.to.cadredb.CadreInfoRelationship;
import model.to.cadredb.RelationNode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.Query;
import org.mapstruct.factory.Mappers;
import util.PageBean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

public class RelationNodeTask implements Runnable {

    private SessionFactory fromSessionFactory;
    private SessionFactory toSessionFactory;
    private Session fromSession;
    private Session toSession;
    private Transaction transaction;
    private RelationNodeMapper mapper;
    private RelationNodeOfFamilyMapper mapper1;
    private Map<String,Object> identityNumbers;
    private CountDownLatch cdl;

    public RelationNodeTask(SessionFactory fromSessionFactory,
                            SessionFactory toSessionFactory,
                            CountDownLatch cdl){
        this.fromSessionFactory = fromSessionFactory;
        this.toSessionFactory = toSessionFactory;
        this.cdl = cdl;
    }

    @Override
    public void run() {
        fromSession = fromSessionFactory.openSession();
        toSession   = toSessionFactory.openSession();
        mapper = Mappers.getMapper(RelationNodeMapper.class);
        mapper1 = Mappers.getMapper(RelationNodeOfFamilyMapper.class);

        //得到总条数 CadreInfo
        int totalCount = getCountTotal();
        PageBean pageBean = new PageBean(0,1000,totalCount);


        for (int i=0; i<pageBean.getBatch();i++) {
            insertRelationNode(pageBean.getFirstResult(),pageBean.getMaxResult());
            pageBean.setFirstResult(pageBean.getFirstResult() + pageBean.getMaxResult());
        }
        //最后一次插入
        insertRelationNode(pageBean.getFirstResult(),pageBean.getLastResult());

        //查询 CadreInfoRelationship 的总条数
        getIdentityNumber();
        int relationShipCount = getRelationShipTotalCount();
        PageBean pageBean2 = new PageBean(0,1000,relationShipCount);
        for (int i=0; i<pageBean2.getBatch(); i++) {
            updateRelationNode(pageBean2.getFirstResult(),pageBean2.getMaxResult());
            pageBean2.setFirstResult(pageBean2.getFirstResult() + pageBean2.getMaxResult());
        }

        //最后一次处理
        updateRelationNode(pageBean2.getFirstResult(),pageBean2.getLastResult());
        System.out.println("RelationNodeTask 执行完成");
        cdl.countDown();
    }

    public int getCountTotal() {
        Query query = toSession.createQuery("select count(1) from CadreInfo");
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

    public int getRelationShipTotalCount() {
        Query query = toSession.createQuery("select count(1) from CadreInfoRelationship");
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

    void insertRelationNode(int firstResult, int maxResults) {
        Query query =
                toSession.createQuery("from CadreInfo").setFirstResult(firstResult).setMaxResults(maxResults);
        List<CadreInfo> cadreInfoList =(List<CadreInfo>) query.list();
        transaction = toSession.getTransaction();
        transaction.begin();
        for (CadreInfo cadreInfo : cadreInfoList) {
            RelationNode relationNode = mapper.empA001ToRelationNode(cadreInfo);
            toSession.save(relationNode);
        }
        transaction.commit();
    }

    void updateRelationNode(int firstResult, int maxResults) {
        Query query = toSession.createQuery("from CadreInfoRelationship").setFirstResult(firstResult).setMaxResults(maxResults);
        List<CadreInfoRelationship> cadreInfoRelationshipLst =(List<CadreInfoRelationship>)query.list();
        transaction = toSession.getTransaction();
        transaction.begin();
        for (CadreInfoRelationship relationship: cadreInfoRelationshipLst) {
            if (relationship.getCitizenId() == null) {
                relationship.setCitizenId(relationship.getId());
            }
            if (identityNumbers.containsKey(relationship.getCitizenId())) {
                continue;  //TODO 这个地方原来写的是 return,待确认
            }
            identityNumbers.put(relationship.getCitizenId(),null);

            RelationNode relationNode = mapper1.cadreInfoRelationshipToRelationNode(relationship);
            toSession.saveOrUpdate(relationNode);
        }
        transaction.commit();
    }

    void getIdentityNumber() {
        Map<String,Object> resMap = new HashMap<>();
        Query query = toSession.createQuery("select identityNumber from CadreInfo");
        List<String> identityNumberLst = (List<String>)query.list();
        for (String idenNum: identityNumberLst) {
            resMap.put(idenNum,null);
        }
        identityNumbers = resMap;
    }

}
