package model.handler;

import model.to.cadredb.CadreInfoCharacteristic;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;

public class CadreInfoCharacteristicTask implements Runnable {
    private SessionFactory fromSessionFactory;
    private SessionFactory toSessionFactory;
    private Session toSession;
    private CountDownLatch cdl;

    public CadreInfoCharacteristicTask(SessionFactory fromSessionFactory,
                                       SessionFactory toSessionFactory,
                                       CountDownLatch cdl) {
        this.fromSessionFactory = fromSessionFactory;
        this.toSessionFactory = toSessionFactory;
        this.cdl = cdl;
    }

    @Override
    public void run() {
        try {
            toSession = toSessionFactory.openSession();
            //先查询cadreInfoIds
            List<String> cadreInfoIds = CadreInfoBasictTask.getCadreInfoIds(toSessionFactory);
            String[] characteristicArrays = new String[]{
                    "完美者", "改进型", "捍卫原则型", "秩序大使", "成就他人者",
                    "助人型", "博爱型", "爱心大使", "成就者", "实践型",
                    "实干型", "浪漫者", "艺术型", "自我型", "观察者",
                    "思考型", "理智型", "寻求安全者", "谨慎型", "忠诚型",
                    "创造可能者", "活跃型", "享乐型", "挑战者", "权威型",
                    "领袖", "维持和谐者", "和谐型", "平淡型"};

            Random random = new Random();

            Transaction transaction = toSession.getTransaction();
            transaction.begin();
            for(int i = 0; i<cadreInfoIds.size(); i++) {
                CadreInfoCharacteristic cadreInfoCharacteristic = new CadreInfoCharacteristic();
                cadreInfoCharacteristic.setCadreId(cadreInfoIds.get(i));
                cadreInfoCharacteristic.setId(UUID.randomUUID().toString());
                int characteristicIndex = random.nextInt(28);
                cadreInfoCharacteristic.setCharacteristic(characteristicArrays[characteristicIndex]);
                int characteristicWeight = random.nextInt(5000);
                cadreInfoCharacteristic.setWeight(characteristicWeight);

                toSession.save(cadreInfoCharacteristic);
                if ((i!=0) && (i%5000==0)) {
                    transaction.commit();
                    transaction.begin();
                }
            }

            //最后一次提交事务
            transaction.commit();
            System.out.println("CadreCharacteristic表插入完成......");
            cdl.countDown();
        } catch(Exception e){
            e.printStackTrace();
        } finally {
            if (toSession!=null) {
                toSession.close();
            }
        }
    }
}
