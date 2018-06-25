package model.handler;
import model.from.EmpA14;
import model.from.EmpPhoto;
import model.mapper.cadredb.CadreInfoPhotoMapper;
import model.mapper.cadredb.CadreInfoRewardDisciplineMapper;
import model.to.cadredb.CadreInfo;
import model.to.cadredb.CadreInfoPhoto;
import model.to.cadredb.CadreInfoRewardDiscipline;
import org.hibernate.*;
import org.mapstruct.factory.Mappers;
import util.PageBean;

import java.util.ArrayList;
import java.util.List;

public class CadreInfoRewardDisciplineTask implements Runnable {

    private SessionFactory fromSessionFactory;
    private SessionFactory toSessionFactory;
    private Session fromSession;
    private Session toSession;
    private CadreInfoRewardDisciplineMapper mapper;
    private List<String> cadreInfoIds;

    public CadreInfoRewardDisciplineTask(SessionFactory fromSessionFactory,
                                         SessionFactory toSessionFactory) {
        this.fromSessionFactory = fromSessionFactory;
        this.toSessionFactory = toSessionFactory;
    }
    @Override
    public void run() {
        try {
            fromSession = fromSessionFactory.openSession();
            toSession   = toSessionFactory.openSession();
            mapper = Mappers.getMapper(CadreInfoRewardDisciplineMapper.class);
            //查询cadreInfoIds
            cadreInfoIds = CadreInfoBasictTask.getCadreInfoIds(toSessionFactory);
            //查询 EmpA14数量
            int totalCount = getEmpA14Count();

            PageBean pageBean = new PageBean(0,5000,totalCount);
            for (int i=0; i<pageBean.getBatch(); i++) {
                execute(pageBean.getFirstResult(),pageBean.getMaxResult());
                pageBean.setFirstResult(pageBean.getFirstResult() + pageBean.getMaxResult());
            }

            //最后一次执行
            execute(pageBean.getFirstResult(),pageBean.getLastResult());
            System.out.println("CadreRewardDiscipline 表插入完成......");
        } catch(Exception e) {
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

    int getEmpA14Count() {
        Query query = fromSession.createQuery("select count(1) from EmpA14");
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

    void execute(int firstResult,int maxResults) {
        Criteria criteria = fromSession.createCriteria(EmpA14.class);
        criteria.setFirstResult(firstResult).setMaxResults(maxResults);
        List listData = criteria.list();
        System.out.println("CadreInfoRewardDiscipline 表插入了:"+firstResult+"条");

        Transaction transaction = toSession.getTransaction();
        transaction.begin();
        for (Object o : listData) {
            EmpA14 empA14 = (EmpA14) o;
            if (cadreInfoIds.contains(empA14.getEmpId())) {
                CadreInfoRewardDiscipline cadreInfoRewardDiscipline = mapper.empA14ToCadreInfoRewardDiscipline(empA14);
                toSession.save(cadreInfoRewardDiscipline);
            }
        }
        transaction.commit();
    }
}
