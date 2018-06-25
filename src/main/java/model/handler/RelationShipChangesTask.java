package model.handler;

import model.to.teamdb.RelationshipChanges;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

public class RelationShipChangesTask implements Runnable {

    private SessionFactory fromSessionFactory;
    private SessionFactory toSessionFactory;
    private Session toSession;

    public RelationShipChangesTask(SessionFactory fromSessionFactory,
                                   SessionFactory toSessionFactory) {
        this.fromSessionFactory = fromSessionFactory;
        this.toSessionFactory = toSessionFactory;
    }
    @Override
    public void run() {
        try {
            toSession = toSessionFactory.openSession();
            Query query = toSession.createQuery("select id from LeadershipOverview");
            Query query1 = toSession.createQuery("select id from CadreInfo");
            List<String> list = query.list();
            List<String> list1 = query1.list();
            list.addAll(list1);

            AtomicInteger s_sums = new AtomicInteger();
            Transaction transaction = toSession.getTransaction();
            transaction.begin();
            for (String cadreId : list) {
                for (int i = 2013; i < 2018; i++) {
                    RelationshipChanges relationshipChanges = new RelationshipChanges();
                    relationshipChanges.setId(UUID.randomUUID().toString());
                    relationshipChanges.setRecordYear(String.valueOf(i));
                    relationshipChanges.setRecordNumbers("0");
                    relationshipChanges.setSubId(cadreId);
                    toSession.save(relationshipChanges);
                }
                s_sums.incrementAndGet();
                if ((s_sums.get()!=0) && (s_sums.get() % 5000 == 0)) {
                    System.out.println("RelationshipChanges 表插入了:"+s_sums.get()+"条");
                    transaction.commit();
                    transaction.begin();
                }
            }
            //最后一次提交事务
            transaction.commit();
            System.out.println("RelationShipChangesTask 执行完成");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (toSession != null) {
                toSession.close();
            }
        }
    }
}
