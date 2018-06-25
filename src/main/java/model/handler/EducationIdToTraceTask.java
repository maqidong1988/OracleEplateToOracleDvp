package model.handler;

import model.from.EmpA36;
import model.to.cadredb.CadreInfoEducation;
import model.to.cadredb.CadreInfoTrace;
import org.hibernate.*;
import util.PageBean;

import java.util.List;

public class EducationIdToTraceTask implements Runnable {
    private SessionFactory fromSessionFactory;
    private SessionFactory toSessionFactory;
    private Session fromSession;
    private Session toSession;
    private int educationCount;
    private List<CadreInfoEducation> cadreInfoEducationLst;

    public EducationIdToTraceTask(SessionFactory fromSessionFactory,
                                  SessionFactory toSessionFactory) {
        this.fromSessionFactory = fromSessionFactory;
        this.toSessionFactory = toSessionFactory;
    }

    @Override
    public void run() {
        try {
            fromSession = fromSessionFactory.openSession();
            toSession   = toSessionFactory.openSession();

            //得到 cadreInfoTrace 总条数
            int cadreInfoTraceCount = getCadreInfoTraceCount();

            //查询 CadreInfoEducation中所有数据
            Criteria criteria2 = toSession.createCriteria(CadreInfoEducation.class);
            cadreInfoEducationLst = (List<CadreInfoEducation>)criteria2.list();
            PageBean traceBean = new PageBean(0,5000,cadreInfoTraceCount);
            for (int i=0; i<traceBean.getBatch(); i++) {
                execute(traceBean.getFirstResult(),traceBean.getMaxResult());
                traceBean.setFirstResult(traceBean.getFirstResult() + traceBean.getMaxResult());
            }

            //最后一次执行
            execute(traceBean.getFirstResult(),traceBean.getLastResult());
            System.out.println("EducationIdToTraceTask 执行完毕");
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

    int getCadreInfoTraceCount() {
        Query query = toSession.createQuery("select count(1) from CadreInfoTrace");
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
        Criteria criteria = toSession.createCriteria(CadreInfoTrace.class);
        criteria.setFirstResult(firstResult).setMaxResults(maxResults);
        List<CadreInfoTrace> cadreTraceLst = (List<CadreInfoTrace>)criteria.list();
        System.out.println("cadreInfoTrace 表插入了:"+firstResult+"条");
        //最后在保存 cadreTraceLst
        Transaction transaction = toSession.getTransaction();
        transaction.begin();
        for (CadreInfoTrace cadreInfoTrace : cadreTraceLst) {
            for (CadreInfoEducation cadreInfoEducation : cadreInfoEducationLst) {
                if (cadreInfoEducation.getCadreId().equals(cadreInfoTrace.getCadreId()) &&
                        cadreInfoEducation.getSchoolName().equals(cadreInfoTrace.getPointName())) {
                    cadreInfoTrace.setStartTime(cadreInfoEducation.getStartEducationTime());
                    cadreInfoTrace.setEndTime(cadreInfoEducation.getEndEducationTime());
                }
            }
            toSession.save(cadreInfoTrace);
        }
        transaction.commit();
    }
}
