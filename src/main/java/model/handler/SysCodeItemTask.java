package model.handler;

import model.from.DepB04;
import model.from.SysCodeItem;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.util.StringUtils;
import util.ConcurrentHashMapCache;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

public class SysCodeItemTask implements Runnable {

    private SessionFactory fromSessionFactory;
    private SessionFactory toSessionFactory;
    private Session fromSession;
    private CountDownLatch cdl;
    private int m_total = 0;
    private AtomicInteger c_sums = new AtomicInteger();

    public SysCodeItemTask(SessionFactory fromSessionFactory, SessionFactory toSessionFactory, CountDownLatch cdl) {
        this.fromSessionFactory = fromSessionFactory;
        this.toSessionFactory = toSessionFactory;
        this.cdl = cdl;
    }
    @Override
    public void run() {
        try {
            this.fromSession = this.fromSessionFactory.openSession();
            Query fromCountQuery = this.fromSession.createQuery("SELECT count(*) AS counts FROM  SysCodeItem");
            List countLst = fromCountQuery.list();
            int totalCounts = 0;
            if (countLst.size() > 0) {
                Object o = countLst.get(0);
                if (!StringUtils.isEmpty(o)) {
                    totalCounts = Integer.parseInt(String.valueOf(o));
                }
            }
            System.out.println("totalCounts:"+totalCounts);

            m_total = totalCounts;
            int firstResult = 0;
            int maxResults = 5000;
            //5000条插入一次
            int batch = totalCounts / maxResults;
            int lastResults = totalCounts % 5000;

            for (int i = 0; i < batch; i++) {
                cacheSysCodeItem(firstResult, maxResults);
                firstResult += maxResults;
            }

            //最后一次插入
            cacheSysCodeItem(firstResult, lastResults);
            //缓存addressCache
            cacheAddress();
        }catch(Exception e){
            e.printStackTrace();
        } finally {
            if (fromSession!=null) {
                fromSession.close();
            }
        }
    }

    //缓存 SysCodeItem 信息
    void cacheSysCodeItem(int firstResult, int maxResults) throws Exception {
        Criteria criteria = fromSession.createCriteria(SysCodeItem.class);
        criteria.setFirstResult(firstResult).setMaxResults(maxResults);
        List listData = criteria.list();
        for(Object o: listData) {
            SysCodeItem sysCodeItem = (SysCodeItem) o;
            String key = sysCodeItem.getCodeSetId()+"-"+sysCodeItem.getCode();
            ConcurrentHashMapCache.setCache(key,sysCodeItem.getName());
            c_sums.incrementAndGet();
        }
    }

    //缓存 Address信息
    void cacheAddress() {
        Criteria criteria = fromSession.createCriteria(DepB04.class);
        List listData = criteria.list();
        for (Object o : listData) {
            DepB04 depB04 = (DepB04) o;
            String key = depB04.getDepId();
            String value = depB04.getB04004();
            ConcurrentHashMapCache.setAddressCache(key,value);
        }
        if (c_sums.get() >= m_total) {
            cdl.countDown();
        }
    }
}
