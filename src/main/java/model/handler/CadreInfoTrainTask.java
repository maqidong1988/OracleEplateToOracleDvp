package model.handler;

import model.to.cadredb.CadreInfoTrain;
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

public class CadreInfoTrainTask implements Runnable {

    private SessionFactory fromSessionFactory;
    private SessionFactory toSessionFactory;
    private Session toSession;
    private List<String> cadreInfoIds;

    public CadreInfoTrainTask(SessionFactory fromSessionFactory,
                          SessionFactory toSessionFactory) {
        this.fromSessionFactory = fromSessionFactory;
        this.toSessionFactory = toSessionFactory;
    }

    @Override
    public void run() {
        try {
            toSession = toSessionFactory.openSession();
            cadreInfoIds = CadreInfoBasictTask.getCadreInfoIds(toSessionFactory);
            AtomicInteger s_sums = new AtomicInteger();
            Random random = new Random();
            Transaction transaction = toSession.getTransaction();
            transaction.begin();
            for (String cadreId: cadreInfoIds) {
                for (int j = 2014; j < 2017; j++) {
                    CadreInfoTrain cadreInfoTrain = new CadreInfoTrain();
                    cadreInfoTrain.setCadreId(cadreId);
                    int times = random.nextInt(100);
                    double avgDouble = random.nextDouble();
                    cadreInfoTrain.setAvgHours(avgDouble * times);
                    double trainDouble = random.nextDouble();
                    cadreInfoTrain.setTrainingHours(trainDouble * times);
                    cadreInfoTrain.setId(UUID.randomUUID().toString());
                    cadreInfoTrain.setYears(new Timestamp(LocalDateTime.of(j, 3, 25, 18, 32).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli()));
                    boolean isInsert = random.nextBoolean();
                    if (isInsert) {
                        toSession.save(cadreInfoTrain);
                    }
                }

                s_sums.incrementAndGet();
                if (s_sums.get()!= 0 && s_sums.get() % 1000 == 0) {
                    System.out.println("cadreInfoTrain 表插入了:"+s_sums.get()+"条");
                    transaction.commit();
                    transaction.begin();
                }
            }
            //最后一次提交
            transaction.commit();
            System.out.println("CadreInfoTrain 表插入完成......");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (toSession!=null) {
                toSession.close();
            }
        }
    }
}
