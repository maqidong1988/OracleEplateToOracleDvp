package model.handler;

import model.from.EmpA58;
import model.mapper.cadredb.CadreInfoPoliticalVisageMapper;
import model.to.cadredb.CadreInfoPoliticalVisage;
import org.hibernate.*;
import org.mapstruct.factory.Mappers;
import util.PageBean;

import java.util.ArrayList;
import java.util.List;

public class CadrePoliticalVisageTask implements Runnable {
    private SessionFactory fromSessionFactory;
    private SessionFactory toSessionFactory;
    private Session fromSession;
    private Session toSession;
    private CadreInfoPoliticalVisageMapper mapper;
    private List<String> cadreInfoIds;

    public CadrePoliticalVisageTask(SessionFactory fromSessionFactory,
                                    SessionFactory toSessionFactory) {
        this.fromSessionFactory = fromSessionFactory;
        this.toSessionFactory = toSessionFactory;
    }

    @Override
    public void run() {
        try {
            fromSession = fromSessionFactory.openSession();
            toSession   = toSessionFactory.openSession();
            mapper = Mappers.getMapper(CadreInfoPoliticalVisageMapper.class);
            //查询cadreInfoIds
            cadreInfoIds = CadreInfoBasictTask.getCadreInfoIds(toSessionFactory);
            //查询 EmpPhoto数量
            int totalCount = getEmpA58Count();
            PageBean pageBean = new PageBean(0,5000,totalCount);
            for (int i=0; i<pageBean.getBatch(); i++) {
                execute(pageBean.getFirstResult(),pageBean.getMaxResult());
                pageBean.setFirstResult(pageBean.getFirstResult() + pageBean.getMaxResult());
            }

            //最后一次执行
            execute(pageBean.getFirstResult(),pageBean.getLastResult());
            System.out.println("CadrePoliticalVisage 表插入完成......");
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

    int getEmpA58Count() {
        Query query = fromSession.createQuery("select count(1) from EmpA58");
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
        Criteria criteria = fromSession.createCriteria(EmpA58.class);
        criteria.setFirstResult(firstResult).setMaxResults(maxResults);
        List listData = criteria.list();
        System.out.println("CadreInfoPoliticalVisage 表插入了:"+firstResult+"条");

        Transaction transaction = toSession.getTransaction();
        transaction.begin();
        for (Object o : listData) {
            EmpA58 empA58 = (EmpA58) o;
            if (cadreInfoIds.contains(empA58.getEmpId())) {
                CadreInfoPoliticalVisage cadreInfoPoliticalVisage =
                        mapper.empA58ToCadreInfoPoliticalVisage(empA58);
                toSession.save(cadreInfoPoliticalVisage);
            }
        }
        transaction.commit();
    }
}
