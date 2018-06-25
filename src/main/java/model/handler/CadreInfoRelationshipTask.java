package model.handler;

import model.from.EmpA36;
import model.mapper.cadredb.CadreInfoRelationshipMapper;
import model.to.cadredb.CadreInfoRelationship;
import org.hibernate.*;
import org.mapstruct.factory.Mappers;
import util.PageBean;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class CadreInfoRelationshipTask implements Runnable {

    private SessionFactory fromSessionFactory;
    private SessionFactory toSessionFactory;
    private CountDownLatch cdl;
    private Session fromSession;
    private Session toSession;
    private List<String> cadreInfoIds;
    private CadreInfoRelationshipMapper mapper;

    public CadreInfoRelationshipTask(SessionFactory fromSessionFactory,
                                     SessionFactory toSessionFactory,
                                     CountDownLatch cdl) {
        this.fromSessionFactory = fromSessionFactory;
        this.toSessionFactory = toSessionFactory;
        this.cdl = cdl;
    }

    @Override
    public void run() {
        try {
            fromSession = fromSessionFactory.openSession();
            toSession   = toSessionFactory.openSession();

            //查询cadreInfoIds
            cadreInfoIds = CadreInfoBasictTask.getCadreInfoIds(toSessionFactory);
            //查询 EmpA36 表的总条数
            int totalCount = getEmpA36Count();

            mapper = Mappers.getMapper(CadreInfoRelationshipMapper.class);
            PageBean pageBean = new PageBean(0,5000,totalCount);
            for (int i=0; i<pageBean.getBatch(); i++) {
                execute(pageBean.getFirstResult(),pageBean.getMaxResult());
                pageBean.setFirstResult(pageBean.getFirstResult() + pageBean.getMaxResult());
            }

            //最后一次执行
            execute(pageBean.getFirstResult(),pageBean.getLastResult());
            cdl.countDown();
            System.out.println("CadreInfoRelationShip 表插入完成......");
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

    public int getEmpA36Count() {
        Query query = fromSession.createQuery("select count(1) from EmpA36");
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

    void execute(int firstResult, int maxResults) {
        Criteria criteria = fromSession.createCriteria(EmpA36.class);
        criteria.setFirstResult(firstResult).setMaxResults(maxResults);
        List listData = criteria.list();
        System.out.println("CadreInfoRelationship 表插入了:"+firstResult+"条");
        Transaction transaction = toSession.getTransaction();
        transaction.begin();
        for (Object o : listData) {
            EmpA36 empA36 = (EmpA36) o;
            if (cadreInfoIds.contains(empA36.getEmpId())) {
                CadreInfoRelationship cadreInfoRelationship = mapper.empA36ToCadreInfoRelationship(empA36);
                if (cadreInfoRelationship.getCitizenId() == null) {
                    cadreInfoRelationship.setCitizenId(cadreInfoRelationship.getId());
                }
                toSession.save(cadreInfoRelationship);
            }
        }
        transaction.commit();
    }
}
