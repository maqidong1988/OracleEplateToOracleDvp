package model.handler;

import model.to.cadredb.CadreInfoKeyJobPromotion;
import model.to.cadredb.CadreInfoNegativeWarning;
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

public class CadreInfoNegativeWarningTask implements Runnable {

    private SessionFactory fromSessionFactory;
    private SessionFactory toSessionFactory;
    private Session toSession;
    private List<String> cadreInfoIds;

    public CadreInfoNegativeWarningTask(SessionFactory fromSessionFactory,
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
                    CadreInfoNegativeWarning cadreWarning = new CadreInfoNegativeWarning();
                    cadreWarning.setId(UUID.randomUUID().toString());
                    cadreWarning.setCadreId(cadreId);
                    cadreWarning.setAuditDepartment("0");
                    cadreWarning.setComprehensiveManagement("0");
                    cadreWarning.setDisciplineInspection("0");
                    cadreWarning.setHealthInspection("0");
                    cadreWarning.setLand("0");
                    cadreWarning.setLawProcurator("0");
                    cadreWarning.setOrganization("0");
                    cadreWarning.setOthers("0");
                    cadreWarning.setPolice("0");
                    cadreWarning.setStartTime(new Timestamp(System.currentTimeMillis()));
                    cadreWarning.setEndTime(new Timestamp(System.currentTimeMillis()));
                    toSession.save(cadreWarning);
                }
                s_sums.incrementAndGet();
                if (s_sums.get()!= 0 && s_sums.get() % 500 == 0) {
                    System.out.println("CadreInfoNegativeWarning 表插入了:"+s_sums.get()+"条");
                    transaction.commit();
                    transaction.begin();
                }
            }
            //最后一次提交
            transaction.commit();
            System.out.println("CadreInfoNegativeWarning 表插入完成......");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (toSession!=null) {
                toSession.close();
            }
        }
    }
}
