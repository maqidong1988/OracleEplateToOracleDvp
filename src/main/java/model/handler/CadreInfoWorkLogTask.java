package model.handler;

import model.to.cadredb.CadreInfoWorkLog;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.sql.Timestamp;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class CadreInfoWorkLogTask implements Runnable {
    private SessionFactory fromSessionFactory;
    private SessionFactory toSessionFactory;
    private Session toSession;
    private List<String> cadreInfoIds;

    public CadreInfoWorkLogTask(SessionFactory fromSessionFactory,
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
            Map<String, String> workPosAndContent = new HashMap<>(4);
            workPosAndContent.put("百纳彝族乡", "百纳走访慰问困难群众");
            workPosAndContent.put("贵阳南明区", "赴贵阳参加全国大数据产业博览会");
            workPosAndContent.put("威宁县城", "按市委组织部安排参加复旦大学专项培训");
            workPosAndContent.put("大方县县城", "大方县参加全市扶贫攻坚现场会议");
            Double[] posX = new Double[]{105.29807, 105.361886, 106.21966, 106.596805};
            Double[] posY = new Double[]{27.291511, 26.806574, 27.481404, 26.860216};
            Random random = new Random();

            Transaction transaction = toSession.getTransaction();
            transaction.begin();
            for (String cadreId: cadreInfoIds) {
                CadreInfoWorkLog cadreInfoWorkLog = new CadreInfoWorkLog();
                cadreInfoWorkLog.setId(UUID.randomUUID().toString());
                cadreInfoWorkLog.setCadreId(cadreId);
                cadreInfoWorkLog.setStartDateTime(new Timestamp(System.currentTimeMillis()));
                int workContentIndex = random.nextInt(4);
                String key = workPosAndContent.keySet().toArray(new String[]{})[workContentIndex];
                cadreInfoWorkLog.setWorkPosition(key);

                cadreInfoWorkLog.setWorkContent(workPosAndContent.get(key));
                int isOccur = random.nextInt(2);
                cadreInfoWorkLog.setOccur(String.valueOf(isOccur));
                int posXIndex = random.nextInt(4);
                int posYIndex = random.nextInt(4);
                cadreInfoWorkLog.setWorkPositionx(posX[posXIndex]);
                cadreInfoWorkLog.setWorkPositiony(posY[posYIndex]);

                toSession.save(cadreInfoWorkLog);

                s_sums.incrementAndGet();
                if (s_sums.get()!= 0 && s_sums.get() % 1000 == 0) {
                    System.out.println("cadreInfoWorkLog 表插入了:"+s_sums.get()+"条");
                    transaction.commit();
                    transaction.begin();
                }
            }
            //最后一次提交
            transaction.commit();
            System.out.println("CadreInfoWorkLog 表插入完成......");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (toSession!=null) {
                toSession.close();
            }
        }
    }
}
