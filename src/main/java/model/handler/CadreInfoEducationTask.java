package model.handler;
import model.from.EmpA001;
import model.from.EmpA08;
import model.mapper.cadredb.CadreInfoEducationMapper;
import model.to.cadredb.CadreInfoEducation;
import org.hibernate.*;
import org.mapstruct.factory.Mappers;
import util.PageBean;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class CadreInfoEducationTask implements Runnable {

    private static SessionFactory fromSessionFactory;
    private static SessionFactory toSessionFactory;
    private static Session fromSession;
    private static Session toSession;
    private static List<String> cadreInfoIds;
    private static CadreInfoEducationMapper mapper;
    private CountDownLatch cdl;
    public CadreInfoEducationTask(SessionFactory fromSessionFactory,
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
            mapper = Mappers.getMapper(CadreInfoEducationMapper.class);
            //查询cadreInfoIds
            cadreInfoIds = CadreInfoBasictTask.getCadreInfoIds(toSessionFactory);
            //查询 EmpA08 表的总条数
            int totalCount = getEmpA08Count();
            PageBean pageBean = new PageBean(0,5000,totalCount);
            for (int i=0; i<pageBean.getBatch(); i++) {
                execute(pageBean.getFirstResult(),pageBean.getMaxResult());
                pageBean.setFirstResult(pageBean.getFirstResult() + pageBean.getMaxResult());
            }

            //最后一次执行
            execute(pageBean.getFirstResult(),pageBean.getLastResult());
            System.out.println("CadreInfoEducation 表插入完成......");
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

    private int getEmpA08Count() {
        Query query = fromSession.createQuery("select count(1) from EmpA08");
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

    private void execute(int firstResult, int maxResults) {
        Criteria criteria = fromSession.createCriteria(EmpA08.class);
        criteria.setFirstResult(firstResult).setMaxResults(maxResults);
        List listData = criteria.list();
        System.out.println("cadreInfoEducation 表插入了:"+firstResult+"条");

        List<EmpA08> NewEmpA08List = new ArrayList<>();
        for (Object o : listData) {
            EmpA08 empA08 = (EmpA08) o;
            if (cadreInfoIds.contains(empA08.getEmpId())) {
                NewEmpA08List.add(empA08);
            }
        }
        Transaction transaction = toSession.getTransaction();
        transaction.begin();
        for (EmpA08 empA08 : NewEmpA08List) {
            CadreInfoEducation cadreInfoEducation = mapper.empA08ToCadreInfoEducation(empA08);
            toSession.save(cadreInfoEducation);
        }
        toSession.flush();
        toSession.clear();
        fromSession.clear();
        transaction.commit();
    }

}
