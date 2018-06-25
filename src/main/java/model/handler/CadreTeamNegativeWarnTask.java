package model.handler;

import model.to.cadredb.CadreInfoNegativeWarn;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

public class CadreTeamNegativeWarnTask implements Runnable {

    private SessionFactory fromSessionFactory;
    private SessionFactory toSessionFactory;
    private Session toSession;
    private List<String> cadreInfoIds;

    public CadreTeamNegativeWarnTask(SessionFactory fromSessionFactory,
                                     SessionFactory toSessionFactory) {
        this.fromSessionFactory = fromSessionFactory;
        this.toSessionFactory = toSessionFactory;
    }


    @Override
    public void run() {
        try {
            toSession = toSessionFactory.openSession();
            cadreInfoIds = CadreInfoBasictTask.getCadreInfoIds(toSessionFactory);
            String[] arr = {"市纪委", "督办督察局", "群众工作部", "组织部", "实绩考核办"
                    , "宣传部", "政法委", "中级人民医院", "人民检察院", "公安局"
                    , "交警大队", "民政局", "国土局", "环保局", "城乡规划局"
                    , "住建局", "卫计委", "审计局", "安监局", "工商局"};
            List<String> list = Arrays.asList(arr);

            AtomicInteger s_sums = new AtomicInteger();
            Transaction transaction = toSession.getTransaction();
            transaction.begin();
            for (String cadreId: cadreInfoIds) {
                for (String depCode : list) {
                    CadreInfoNegativeWarn cadreInfoNegativeWarn = new CadreInfoNegativeWarn();
                    cadreInfoNegativeWarn.setId(UUID.randomUUID().toString());
                    cadreInfoNegativeWarn.setCadreId(cadreId);
                    cadreInfoNegativeWarn.setDepartment(depCode);
                    cadreInfoNegativeWarn.setRecord("0");
                    cadreInfoNegativeWarn.setRecordContent(null);
                    int r = list.indexOf(depCode);
                    cadreInfoNegativeWarn.setDepartmentCode(String.valueOf(r));
                    cadreInfoNegativeWarn.setStartTime(new Timestamp(System.currentTimeMillis()));
                    cadreInfoNegativeWarn.setEndTime(new Timestamp(System.currentTimeMillis()));
                    toSession.save(cadreInfoNegativeWarn);
                }

                s_sums.incrementAndGet();
                if (s_sums.get()!= 0 && s_sums.get() % 1000 == 0) {
                    System.out.println("cadreInfoNegativeWarn 表插入了:"+s_sums.get()+"条");
                    transaction.commit();
                    transaction.begin();
                }
            }
            //最后一次提交
            transaction.commit();
            System.out.println("CadreInfoNegativeWarn 表插入完成......");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (toSession!=null) {
                toSession.close();
            }
        }
    }
}
