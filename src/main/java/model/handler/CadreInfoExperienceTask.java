package model.handler;

import model.from.EmpA02;
import model.from.EmpA08;
import model.mapper.cadredb.CadreInfoExperienceMapper;
import model.to.cadredb.CadreInfoEducation;
import model.to.cadredb.CadreInfoExperience;
import org.hibernate.*;
import org.mapstruct.factory.Mappers;
import util.PageBean;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class CadreInfoExperienceTask implements Runnable {

    private static SessionFactory fromSessionFactory;
    private static SessionFactory toSessionFactory;
    private static Session fromSession;
    private static Session toSession;
    private static List<String> cadreInfoIds;
    private static CadreInfoExperienceMapper mapper;
    private CountDownLatch cdl;

    public CadreInfoExperienceTask(SessionFactory fromSessionFactory,
                                   SessionFactory toSessionFactory,
                                   CountDownLatch cdl){
        this.fromSessionFactory = fromSessionFactory;
        this.toSessionFactory = toSessionFactory;
        this.cdl = cdl;
    }

    @Override
    public void run() {
        try {
            this.fromSession = fromSessionFactory.openSession();
            this.toSession   = toSessionFactory.openSession();
            //查询cadreInfoIds
            cadreInfoIds = CadreInfoBasictTask.getCadreInfoIds(toSessionFactory);
            //查询 EmpA08 表的总条数
            int totalCount = getEmpA02Count();

            mapper = Mappers.getMapper(CadreInfoExperienceMapper.class);
            PageBean pageBean = new PageBean(0,5000,totalCount);
            for (int i=0; i<pageBean.getBatch(); i++) {
                execute(pageBean.getFirstResult(),pageBean.getMaxResult());
                pageBean.setFirstResult(pageBean.getFirstResult() + pageBean.getMaxResult());
            }

            //最后一次执行
            execute(pageBean.getFirstResult(),pageBean.getLastResult());
            System.out.println("CadreInfoExperience 表插入完成......");
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

    public int getEmpA02Count() {
        Query query = fromSession.createQuery("select count(1) from EmpA02");
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
        Criteria criteria = fromSession.createCriteria(EmpA02.class);
        criteria.setFirstResult(firstResult).setMaxResults(maxResults);
        List listData = criteria.list();
        System.out.println("CadreInfoExperience 表插入了:"+firstResult+"条");

        Transaction transaction = toSession.getTransaction();
        transaction.begin();
        for (Object o : listData) {
            EmpA02 empA02 = (EmpA02) o;
            if (cadreInfoIds.contains(empA02.getEmpId())) {
                CadreInfoExperience cadreInfoExperience = mapper.empA02ToCadreInfoExperience(empA02);
                toSession.save(cadreInfoExperience);
            }
        }
        toSession.flush();
        toSession.clear();
        fromSession.clear();
        transaction.commit();
    }
}
