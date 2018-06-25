package model.handler;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.omg.CORBA.TRANSACTION_MODE;
import org.springframework.util.StringUtils;
import util.PageBean;

import java.util.*;

public class UpdateDataTask implements Runnable {

    private SessionFactory fromSessionFactory;
    private SessionFactory toSessionFactory;
    private Session fromSession;
    private Session toSession;

    public UpdateDataTask(SessionFactory fromSessionFactory,
                          SessionFactory toSessionFactory) {
        this.fromSessionFactory = fromSessionFactory;
        this.toSessionFactory = toSessionFactory;
    }

    @Override
    public void run() {
        try {
            fromSession = fromSessionFactory.openSession();
            toSession   = toSessionFactory.openSession();
            //同步orgId
            updateOrgId();
            System.out.println("同步orgId字段完成");
            //同步unit_id 字段
            updateUnitId();
            System.out.println("同步unit_id字段完成");
            //同步levelCode字段
            updateLevelCode();
            System.out.println("同步levelCode字段完成");
            //同步unit_code字段
            updateUnitCode();
            System.out.println("同步unit_code字段完成");
            //同步leaderShipOverview表  unit_code 字段
            updateLeaderShipOverviewUnitCode();
            System.out.println("leaderShipOverview表 unit_code字段同步完成");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fromSession != null) {
                fromSession.close();
            }
            if (toSession != null) {
                toSession.close();
            }
        }
    }

    void updateOrgId() {
        //先查询总条数,在批量更新
        org.hibernate.Query countQuery = fromSession.createQuery("select count(1) from EmpA001  where a001004A is not null");
        List countLst = countQuery.list();
        //得到总条数
        int totalCounts = 0;
        if (countLst.size() > 0) {
            Object o = countLst.get(0);
            if (!org.springframework.util.StringUtils.isEmpty(o)) {
                totalCounts = Integer.parseInt(String.valueOf(o));
            }
        }

        PageBean pageBean = new PageBean(0,1000,totalCounts);
        for (int i=0; i<pageBean.getBatch();i++) {
            executeOrgId(pageBean.getFirstResult(),pageBean.getMaxResult());
            pageBean.setFirstResult(pageBean.getFirstResult()+pageBean.getMaxResult());
        }
        //最后一次
        executeOrgId(pageBean.getFirstResult(),pageBean.getLastResult());
    }

    void executeOrgId(int firstResult, int maxResults) {
        org.hibernate.Query query = fromSession.createQuery("select new Map(a001004A as a001004A,empId as empId) from EmpA001  where a001004A is not null");
        query.setFirstResult(firstResult);
        query.setMaxResults(maxResults);
        List<Map<String,String>> list = query.list();
        Transaction transaction = toSession.getTransaction();
        transaction.begin();
        for(Map map : list) {
            String empId = (String) map.get("empId");
            String orgId = (String) map.get("a001004A");
            org.hibernate.Query query1 = toSession.createQuery("update CadreInfo set orgId = :orgId where id = :id");
            query1.setParameter("orgId", orgId);
            query1.setParameter("id", empId);
            query1.executeUpdate();
        }
        transaction.commit();
    }

    void updateLevelCode() {
        //先查询总条数,在批量更新
        Query countQuery = toSession.createQuery("select count(1) from CadreInfo where orgId is not null");
        List countLst = countQuery.list();
        //得到总条数
        int totalCounts = 0;
        if (countLst.size() > 0) {
            Object o = countLst.get(0);
            if (!org.springframework.util.StringUtils.isEmpty(o)) {
                totalCounts = Integer.parseInt(String.valueOf(o));
            }
        }

        PageBean pageBean = new PageBean(0,1000,totalCounts);
        for (int i=0; i<pageBean.getBatch();i++) {
            executeLevelCode(pageBean.getFirstResult(),pageBean.getMaxResult());
            pageBean.setFirstResult(pageBean.getFirstResult() + pageBean.getMaxResult());
        }
        //最后一次
        executeLevelCode(pageBean.getFirstResult(),pageBean.getLastResult());
    }

    void executeLevelCode(int firstResult, int maxResults){
        org.hibernate.Query query = toSession.createQuery("select orgId from CadreInfo where orgId is not null");
        query.setFirstResult(firstResult);
        query.setMaxResults(maxResults);
        List<String> list = query.list();
        Transaction transaction = toSession.getTransaction();
        transaction.begin();
        list.forEach(orgId -> {
            List<String> orgIdList = Arrays.asList(orgId.split(","));
            String orgCodeStrWithComma = StringUtils.arrayToCommaDelimitedString(orgIdList.stream().map(depId -> {
                org.hibernate.Query query1 = fromSession.createQuery("select code from DepB001 where depId = :orgId and code is not null ");

                query1.setParameter("orgId", depId);
                List<String> list1 = query1.list();
                if (list1.size() > 0) {
                    return list1.get(0);
                }
                return "";
            }).sorted(Comparator.comparingInt(String::length)).toArray());

            org.hibernate.Query query3 = toSession.createQuery("update CadreInfo set levelCode = :levelCode where orgId = :orgId");
            query3.setParameter("levelCode", orgCodeStrWithComma);
            query3.setParameter("orgId", orgId);
            query3.executeUpdate();
        });
        transaction.commit();
    }

    void updateUnitCode(){
        //先查询总条数,在批量更新
        Query countQuery = toSession.createQuery("select count(1) from CadreInfo where unitId is not null");
        List countLst = countQuery.list();
        //得到总条数
        int totalCounts = 0;
        if (countLst.size() > 0) {
            Object o = countLst.get(0);
            if (!org.springframework.util.StringUtils.isEmpty(o)) {
                totalCounts = Integer.parseInt(String.valueOf(o));
            }
        }
        PageBean pageBean = new PageBean(0,1000,totalCounts);
        for (int i=0; i<pageBean.getBatch(); i++) {
            executeUnitCode(pageBean.getFirstResult(),pageBean.getMaxResult());
            pageBean.setFirstResult(pageBean.getFirstResult()+pageBean.getMaxResult());
        }
        //最后一次
        executeUnitCode(pageBean.getFirstResult(),pageBean.getLastResult());
    }

    void executeUnitCode(int firstResult, int maxResults) {
        org.hibernate.Query query = toSession.createQuery("select unitId from CadreInfo where unitId is not null ");
        query.setFirstResult(firstResult);
        query.setMaxResults(maxResults);
        List<String> unitIdList = query.list();
        Transaction transaction = toSession.getTransaction();
        transaction.begin();
        unitIdList.forEach(unitIds -> {
            String orgCodeStrWithComma = StringUtils.arrayToCommaDelimitedString(
                    Arrays.stream(unitIds.split(",")).map(
                            unitId -> {
                                org.hibernate.Query depId2CodeQuery = fromSession.createQuery("select code from DepB001 where depId = :unitId and code is not null");
                                depId2CodeQuery.setParameter("unitId", unitId);
                                List<String> codeList = depId2CodeQuery.list();
                                if (codeList == null || codeList.isEmpty()) {
                                    return "";
                                }
                                return codeList.get(0);
                            }
                    ).sorted(Comparator.comparingInt(String::length)).toArray()
            );

            org.hibernate.Query query3 = toSession.createQuery("update CadreInfo set unitCode = :unitCode where unitId = :unitId");
            query3.setParameter("unitCode", orgCodeStrWithComma);
            query3.setParameter("unitId", unitIds);

            //执行更新
            query3.executeUpdate();
        });
        transaction.commit();
    }

    void updateUnitId() {
        //先查询总条数,在批量更新
        Query query = fromSession.createQuery("select count(1) from EmpA02 where a02001B is not null and a02055 = :assignStatus");
        query.setParameter("assignStatus", "2");
        List countLst = query.list();
        //得到总条数
        int totalCounts = 0;
        if (countLst.size() > 0) {
            Object o = countLst.get(0);
            if (!org.springframework.util.StringUtils.isEmpty(o)) {
                totalCounts = Integer.parseInt(String.valueOf(o));
            }
        }

        PageBean pageBean = new PageBean(0,1000,totalCounts);
        for (int i=0; i<pageBean.getBatch(); i++) {
            executeUnitId(pageBean.getFirstResult(),pageBean.getMaxResult());
            pageBean.setFirstResult(pageBean.getFirstResult() + pageBean.getMaxResult());
        }
        //最后一次
        executeUnitId(pageBean.getFirstResult(),pageBean.getLastResult());
    }

    void executeUnitId(int firstResult, int maxResults) {
        org.hibernate.Query query3 = fromSession.createQuery("select new Map(empId as empId,a02001B as a02001B) from EmpA02 " +
                "where a02001B is not null and a02055 = :assignStatus");
        query3.setParameter("assignStatus", "2");
        query3.setFirstResult(firstResult).setMaxResults(maxResults);
        List<Map<String,String>> list2 = query3.list();
        Map<String, String> idAndUnitId = new HashMap<>();
        list2.forEach(map -> idAndUnitId.merge(map.get("empId"), map.get("a02001B"), (a, b) -> a.concat(",").concat(b)));
        Transaction transaction = toSession.getTransaction();
        transaction.begin();
        idAndUnitId.forEach((a, b) -> {
            org.hibernate.Query query2 = toSession.createQuery("update CadreInfo set unitId = :unitId where id = :id");
            query2.setParameter("unitId", b);
            query2.setParameter("id", a);
            query2.executeUpdate();
        });
        transaction.commit();
    }

    void updateLeaderShipOverviewUnitCode() {
        //先查询总条数,在批量更新
        Query countQuery = toSession.createQuery("select count(1) from LeadershipOverview");
        List countLst = countQuery.list();
        //得到总条数
        int totalCounts = 0;
        if (countLst.size() > 0) {
            Object o = countLst.get(0);
            if (!org.springframework.util.StringUtils.isEmpty(o)) {
                totalCounts = Integer.parseInt(String.valueOf(o));
            }
        }

        PageBean pageBean = new PageBean(0,1000,totalCounts);
        for (int i=0; i<pageBean.getBatch(); i++) {
            executeLeaderShipOverviewUnitCode(pageBean.getFirstResult(),pageBean.getMaxResult());
            pageBean.setFirstResult(pageBean.getFirstResult() + pageBean.getMaxResult());
        }
        //最后一次
        executeLeaderShipOverviewUnitCode(pageBean.getFirstResult(),pageBean.getLastResult());
    }

    void executeLeaderShipOverviewUnitCode(int firstResult,int maxResults) {
        Query query = toSession.createQuery("select id from LeadershipOverview");
        query.setFirstResult(firstResult).setMaxResults(maxResults);
        List<String> unitIdList = query.list();
        Transaction transaction = toSession.getTransaction();
        transaction.begin();
        unitIdList.forEach(unitIds -> {
            String orgCodeStrWithComma = StringUtils.arrayToCommaDelimitedString(
                    Arrays.stream(unitIds.split(",")).map(
                            unitId -> {
                                org.hibernate.Query depId2CodeQuery = fromSession.createQuery("select code from DepB001 where depId = :unitId and code is not null");
                                depId2CodeQuery.setParameter("unitId", unitId);
                                List<String> codeList = depId2CodeQuery.list();
                                if (codeList == null || codeList.isEmpty()) {
                                    return "";
                                }
                                return codeList.get(0);
                            }
                    ).sorted(Comparator.comparingInt(String::length)).toArray()
            );
            System.out.println("orgCodeStrWithComma:"+orgCodeStrWithComma);

            org.hibernate.Query query3 = toSession.createQuery("update LeadershipOverview set unitCode = :unitCode where id = :unitId");
            query3.setParameter("unitCode", orgCodeStrWithComma);
            query3.setParameter("unitId", unitIds);

            //执行更新
            query3.executeUpdate();
        });
        transaction.commit();
    }
}
