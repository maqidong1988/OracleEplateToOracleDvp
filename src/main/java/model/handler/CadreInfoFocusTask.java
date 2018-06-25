package model.handler;

import model.to.cadredb.CadreInfoFocus;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

public class CadreInfoFocusTask implements Runnable {

    private SessionFactory fromSessionFactory;
    private SessionFactory toSessionFactory;
    private Session toSession;
    private List<String> cadreInfoIds;

    public CadreInfoFocusTask(SessionFactory fromSessionFactory,
                              SessionFactory toSessionFactory) {
        this.fromSessionFactory = fromSessionFactory;
        this.toSessionFactory = toSessionFactory;
    }


    @Override
    public void run() {
        try {
            toSession = toSessionFactory.openSession();
            //查询cadreInfoIds
            cadreInfoIds = CadreInfoBasictTask.getCadreInfoIds(toSessionFactory);
            Random random = new Random();
            AtomicInteger s_sums = new AtomicInteger();
            Transaction transaction = toSession.getTransaction();
            transaction.begin();
            for (String cadreId :cadreInfoIds) {
                for (int j = 2014; j < 2017; j++) {
                    CadreInfoFocus cadreInfoFocus = new CadreInfoFocus();
                    cadreInfoFocus.setId(UUID.randomUUID().toString());
                    cadreInfoFocus.setCadreId(cadreId);
                    cadreInfoFocus.setYears(new Timestamp(LocalDateTime.of(j, 1, 1, 0, 0).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli()));
                    //int focus = random.nextInt(100);
                    int focus = 80 +random.nextInt(20);
                    cadreInfoFocus.setScott((long) focus);
                    toSession.save(cadreInfoFocus);
                }
                s_sums.incrementAndGet();
                if (s_sums.get()!= 0 && s_sums.get() % 5000 == 0) {
                    System.out.println("CadreInfoFocus 表插入了:"+s_sums.get()+"条");
                    toSession.flush();
                    toSession.clear();
                    transaction.commit();
                    transaction.begin();
                }
            }
            //最后一次提交
            transaction.commit();
            System.out.println("CadreInfoFocus表插入完成......");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (toSession!=null) {
                toSession.close();
            }
        }
    }
}
