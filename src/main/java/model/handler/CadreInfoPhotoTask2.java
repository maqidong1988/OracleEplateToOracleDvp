package model.handler;

import model.from.EmpPhoto;
import model.mapper.cadredb.CadreInfoPhotoMapper;
import model.to.cadredb.CadreInfoPhoto;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Query;
import org.hibernate.Transaction;
import org.mapstruct.factory.Mappers;

import java.awt.geom.QuadCurve2D;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class CadreInfoPhotoTask2 implements Runnable {

    private SessionFactory fromSessionFactory;
    private SessionFactory toSessionFactory;
    private Session fromSession;
    private Session toSession;
    private CadreInfoPhotoMapper mapper;
    private List<String> cadreInfoIds;


    public CadreInfoPhotoTask2(SessionFactory fromSessionFactory,
                               SessionFactory toSessionFactory){
        this.fromSessionFactory = fromSessionFactory;
        this.toSessionFactory   = toSessionFactory;
    }
    @Override
    public void run() {
        try {
            fromSession = fromSessionFactory.openSession();
            toSession   = toSessionFactory.openSession();
            mapper = Mappers.getMapper(CadreInfoPhotoMapper.class);
            //查询cadreInfoIds
            cadreInfoIds = CadreInfoBasictTask.getCadreInfoIds(toSessionFactory);

            AtomicInteger s_sums = new AtomicInteger();
            Transaction transaction = toSession.getTransaction();
            transaction.begin();
            List list;
            Query query = null;
            EmpPhoto empPhoto;
            CadreInfoPhoto cadreInfoPhoto;
            for (String cadreId :cadreInfoIds) {
                query = fromSession.createQuery("from EmpPhoto where empId = :cadreId");
                query.setParameter("cadreId",cadreId);
                list = query.list();
                if (list.size()> 0) {
                    empPhoto = (EmpPhoto)list.get(0);
                    cadreInfoPhoto = mapper.empPhotoToCadreInfoPhoto(empPhoto);
                    toSession.save(cadreInfoPhoto);
                    s_sums.incrementAndGet();
                }
                if (s_sums.get()!=0 && s_sums.get() % 500 ==0) {
                    System.out.println("插入了500条");
                    fromSession.flush();
                    toSession.flush();
                }
            }
            //最后一次提交
            transaction.commit();
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
}
