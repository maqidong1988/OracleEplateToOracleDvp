package model.handler;
import model.from.EmpA001;
import model.mapper.cadredb.CadreInfoMapper;
import model.to.cadredb.CadreInfo;
import org.hibernate.*;
import org.mapstruct.factory.Mappers;
import util.PageBean;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

public class CadreInfoBasictTask implements Runnable {
    private static SessionFactory fromSessionFactory;
    private static SessionFactory toSessionFactory;
    private static Session fromSession;
    private static Session toSession;
    private static Transaction transaction;
    private static Map existsDataMap;
    private static Map empA02DataMap;
    private static CadreInfoMapper mapper;
    private CountDownLatch cdl;

    public CadreInfoBasictTask(SessionFactory fromSessionFactory,
                               SessionFactory toSessionFactory,
                               CountDownLatch cdl
                               ) {
        this.fromSessionFactory = fromSessionFactory;
        this.toSessionFactory = toSessionFactory;
        this.cdl = cdl;
    }

    @Override
    public void run() {
        try {
            //得到总条数
            this.fromSession = fromSessionFactory.openSession();
            this.toSession   = toSessionFactory.openSession();

            //查询总条数
            int totalCounts = getTotalCounts();
            System.out.println(String.format("查询数据总条数:%d",totalCounts));
            System.out.println(String.format("线程 %s 共获取到数据:%s 条", Thread.currentThread().getName(), totalCounts));
            mapper = Mappers.getMapper(CadreInfoMapper.class);

            //在查询 to 表里面的所有的 CadreInfo,如果存在就不插入了
            existsDataMap = getExistsData();

            //从EmpA02 表中查询数据,以便关联RelationUnitDivisionCode字段
            empA02DataMap = getEmpA02Info();

            //toSession.setHibernateFlushMode(FlushMode.MANUAL);
            PageBean pageBean = new PageBean(0,1000,totalCounts);
            for (int i=0; i<pageBean.getBatch(); i++) {
                execute(pageBean.getFirstResult(),pageBean.getMaxResult());
                pageBean.setFirstResult(pageBean.getFirstResult() + pageBean.getMaxResult());
            }
            //最后一次入库
            execute(pageBean.getFirstResult(),pageBean.getLastResult());
            System.out.println("主表插入完成");
            cdl.countDown();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fromSession!=null) {
                fromSession.close();
            }
            if (toSession!=null) {
                toSession.close();
            }
        }
    }

    void execute(int firstResult, int maxResults) {
        transaction = toSession.getTransaction();
        transaction.begin();
        Criteria criteria = fromSession.createCriteria(EmpA001.class);
        criteria.setFirstResult(firstResult).setMaxResults(maxResults);
        List listData = criteria.list();
        System.out.println("CadreInfo 表插入了:"+firstResult+"条");
        Set<String> existKeys = existsDataMap.keySet();
        Set<String> empA02Keys = empA02DataMap.keySet();
        for (Object o: listData) {
            EmpA001 empA001 = (EmpA001)o;
            //只有不存在时才插入数据
            if (!existKeys.contains(empA001.getEmpId())) {
                CadreInfo cadreInfo = mapper.empA001ToCadreInfo(empA001);
                if (empA02Keys.contains(cadreInfo.getId())) {
                    //如果能查询到,则关联  RelationUnitDivisionCode
                    String relationUnitDivisionCode = (String)empA02DataMap.get(cadreInfo.getId());
                    cadreInfo.setRelationUnitDivisionCode(relationUnitDivisionCode);
                }
                toSession.save(cadreInfo);
            }
        }
        //toSession.flush();
        transaction.commit();
    }

    //得到总条数
    public int getTotalCounts() {
        Query fromCountQuery = fromSession.createQuery("SELECT COUNT(1) AS COUNTS FROM EmpA001");
        List countLst = fromCountQuery.list();
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

    //查询to表里面的所有数据
    public Map getExistsData() {
        Map<String,Object> resultMap = new HashMap<String,Object>();
        Query query = toSession.createQuery("select new Map(id as id,storeTimeFromEplatform as storeTimeFromEplatform) from CadreInfo");
        List cadreInfoLst = query.list();
        for (Object o: cadreInfoLst) {
            Map map = (Map) o;
            String id = (String)map.get("id");
            Object storeTimepFromEplatform = map.get("storeTimeFromEplatform");
            resultMap.put(id,storeTimepFromEplatform);
        }
        return resultMap;
    }

    // 从EmpA02中查询所有数据,绑定RelationUnitDivisionCode 字段
    public Map getEmpA02Info() {
        Map<String,Object> resultMap = new HashMap<String,Object>();
        Query query = fromSession.createQuery("select new Map(empId as empId, a02003 as a02003) from EmpA02 where a02055 = :status");
        query.setParameter("status","2");
        List empA02Lst = query.list();
        for (Object o: empA02Lst) {
            Map map = (Map) o;
            String empId  = (String) map.get("empId");
            String a02003 = (String) map.get("a02003");
            resultMap.put(empId,a02003);
        }
        return resultMap;
    }

    public static List<String> getCadreInfoIds(SessionFactory toSessionFactory) {
        Session toSession = toSessionFactory.openSession();
        Query query = toSession.createQuery("SELECT id from CadreInfo");
        List<String> list = query.list();
        return list;
    }

    public static Map<String,Object> getCadreInfoMaps(SessionFactory toSessionFactory) {
        Map<String,Object> hashMap = new HashMap<>();
        Session toSession = toSessionFactory.openSession();
        Query query = toSession.createQuery("SELECT id from CadreInfo");
        List<String> list = query.list();
        for (String cadreId: list) {
            hashMap.put(cadreId,null);
        }
        return hashMap;
    }

    void updateOrgId() {
        //先查询总条数,在批量更新
        Query countQuery = fromSession.createQuery("select count(1) from EmpA001  where a001004A is not null");
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
        Query query = fromSession.createQuery("select new Map(a001004A as a001004A,empId as empId) from EmpA001  where a001004A is not null");
        query.setFirstResult(firstResult);
        query.setMaxResults(maxResults);
        List<Map<String,String>> list = query.list();
        Transaction transaction = toSession.getTransaction();
        transaction.begin();
        for(Map map : list) {
            String empId = (String) map.get("empId");
            String orgId = (String) map.get("a001004A");
            Query query1 = toSession.createQuery("update CadreInfo set orgId = :orgId where id = :id");
            query1.setParameter("orgId", orgId);
            query1.setParameter("id", empId);
            query1.executeUpdate();
        }
        transaction.commit();
    }

}
