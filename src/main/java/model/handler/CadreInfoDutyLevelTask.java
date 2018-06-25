package model.handler;

import model.from.EmpA02;
import model.from.EmpA05;
import model.mapper.cadredb.CadreInfoDutyLevelMapper;
import model.to.cadredb.CadreInfoDutyLevel;
import model.to.cadredb.CadreInfoExperience;
import org.hibernate.*;
import org.mapstruct.factory.Mappers;
import util.PageBean;

import java.util.ArrayList;
import java.util.List;

public class CadreInfoDutyLevelTask implements Runnable {

    private SessionFactory fromSessionFactory;
    private SessionFactory toSessionFactory;
    private Session fromSession;
    private Session toSession;
    private List<String> cadreInfoIds;
    private CadreInfoDutyLevelMapper mapper;

    public CadreInfoDutyLevelTask(SessionFactory fromSessionFactory,
                                  SessionFactory toSessionFactory) {
        this.fromSessionFactory = fromSessionFactory;
        this.toSessionFactory = toSessionFactory;
    }

    @Override
    public void run() {
        try {
            fromSession = fromSessionFactory.openSession();
            toSession   = toSessionFactory.openSession();
            //查询cadreInfoIds
            cadreInfoIds = CadreInfoBasictTask.getCadreInfoIds(toSessionFactory);
            //查询 EmpA05 表的总条数
            int totalCount = getEmpA05Count();

            mapper = Mappers.getMapper(CadreInfoDutyLevelMapper.class);
            PageBean pageBean = new PageBean(0,5000,totalCount);
            for (int i=0; i<pageBean.getBatch(); i++) {
                execute(pageBean.getFirstResult(),pageBean.getMaxResult());
                pageBean.setFirstResult(pageBean.getFirstResult() + pageBean.getMaxResult());
            }

            //最后一次执行
            execute(pageBean.getFirstResult(),pageBean.getLastResult());
            System.out.println("CadreInfoDutyLevel 表插入完成......");

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

    public int getEmpA05Count() {
        Query query = fromSession.createQuery("select count(1) from EmpA05");
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
        Criteria criteria = fromSession.createCriteria(EmpA05.class);
        criteria.setFirstResult(firstResult).setMaxResults(maxResults);
        List listData = criteria.list();
        System.out.println("cadreInfoDutyLevel 表插入了:"+firstResult+"条");

        Transaction transaction = toSession.getTransaction();
        transaction.begin();
        for (Object o : listData) {
            EmpA05 empA05 = (EmpA05) o;
            if (cadreInfoIds.contains(empA05.getEmpId())) {
                CadreInfoDutyLevel cadreInfoDutyLevel = mapper.empA05ToCadreInfoDutyLevel(empA05);
                toSession.save(cadreInfoDutyLevel);
            }
        }
        transaction.commit();
    }
}
