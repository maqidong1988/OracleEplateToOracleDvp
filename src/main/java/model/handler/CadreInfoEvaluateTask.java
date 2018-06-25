package model.handler;
import model.to.cadredb.CadreInfoEvaluate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.UUIDUtil;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

public class CadreInfoEvaluateTask implements Runnable {

    private static SessionFactory fromSessionFactory;
    private static SessionFactory toSessionFactory;
    private static Session fromSession;
    private static Session toSession;
    private static List<String> cadreInfoIds;
    private CountDownLatch cdl;

    public CadreInfoEvaluateTask(SessionFactory fromSessionFactory,
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

            //查询cadreInfoIds
            cadreInfoIds = CadreInfoBasictTask.getCadreInfoIds(toSessionFactory);
            Random random = new Random();
            Transaction transaction = toSession.getTransaction();
            transaction.begin();
            AtomicInteger s_sums = new AtomicInteger();
            for (String cadreId :cadreInfoIds) {
                for (int j = 2014; j < 2017; j++) {
                    CadreInfoEvaluate evaluate = new CadreInfoEvaluate();
                    evaluate.setId(UUID.randomUUID().toString());
                    evaluate.setCadreId(cadreId);
                    evaluate.setYears(new Timestamp(LocalDateTime.of(j, 1, 1, 0, 0).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli()));
                    //Double annualTargetScore = random.nextDouble() * 100;
                    Double annualTargetScore = UUIDUtil.generateRandom();
                    evaluate.setAnnualTargetScore(annualTargetScore.longValue());

                    //Double democraticScore = random.nextDouble() * 100;
                    Double democraticScore = UUIDUtil.generateRandom();
                    evaluate.setDemocraticScore(democraticScore.longValue());

                    //Double dynamicTrackingScore = random.nextDouble() * 100;
                    Double dynamicTrackingScore = UUIDUtil.generateRandom();
                    evaluate.setDynamicTrackingScore(dynamicTrackingScore.longValue());

                    Double compositeScore = (annualTargetScore + democraticScore + dynamicTrackingScore) / 3;
                    evaluate.setCompositeScore(compositeScore.longValue());

                    toSession.save(evaluate);
                }

                s_sums.incrementAndGet();
                if (s_sums.get()!= 0 && s_sums.get() % 5000 == 0) {
                    System.out.println("CadreInfoEvaluate 表插入了:"+s_sums.get()+"条");
                    transaction.commit();
                    transaction.begin();
                }
            }
            //最后一次提交
            transaction.commit();
            System.out.println("CadreInfoEvaluate表插入完成......");
            cdl.countDown();
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
}
