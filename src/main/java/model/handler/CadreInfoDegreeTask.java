package model.handler;

import model.from.EmpA09;
import model.mapper.cadredb.CadreInfoDegreeMapper;
import model.to.cadredb.CadreInfoDegree;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.mapstruct.factory.Mappers;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class CadreInfoDegreeTask implements Runnable {

    private SessionFactory fromSessionFactory;
    private SessionFactory toSessionFactory;
    private Session fromSession;
    private Session toSession;
    private CountDownLatch cdl;
    public CadreInfoDegreeTask(SessionFactory fromSessionFactory,
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

            CadreInfoDegreeMapper mapper = Mappers.getMapper(CadreInfoDegreeMapper.class);
            //查询cadreInfoIds
            List<String> cadreInfoIds = CadreInfoBasictTask.getCadreInfoIds(toSessionFactory);
            // 查询所有 EmpA09 信息
            List<EmpA09> empA09Lst = lstEmpA09();

            List<EmpA09> newEmpA09Lst = new ArrayList<>();
            for (EmpA09 empA09 : empA09Lst) {
                if (cadreInfoIds.contains(empA09.getEmpId())) {
                    newEmpA09Lst.add(empA09);
                }
            }

            Transaction transaction = toSession.getTransaction();
            transaction.begin();
            for (int i=0; i<newEmpA09Lst.size(); i++) {
                CadreInfoDegree cadreInfoDegree = mapper.empA09ToCadreInfoDegree(newEmpA09Lst.get(i));
                toSession.save(cadreInfoDegree);
                if ((i!=0)&&(i%5000==0)) {
                    transaction.commit();
                    transaction.begin();
                }
            }

            //最后一次提交
            transaction.commit();
            System.out.println("CadreInfoDegree表插入完成......");
            cdl.countDown();
        } catch(Exception e) {
            e.printStackTrace();
        } finally{
            if (fromSession!=null) {
                fromSession.close();
            }
            if (toSession!=null) {
                toSession.close();
            }
        }
    }

    public List<EmpA09> lstEmpA09() {
        Query query = fromSession.createQuery("from EmpA09");
        List<EmpA09> list = query.list();
        return list;
    }
}
