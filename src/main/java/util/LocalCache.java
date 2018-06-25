package util;

import org.springframework.util.StringUtils;

import java.io.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public class LocalCache {

    private LocalCache() {}
    private static LocalCache singleton = null;
    public static LocalCache getInstance() {
        if (singleton == null) {
            synchronized (LocalCache.class) {
                if (singleton == null) {
                    singleton = new LocalCache();
                }
            }
        }
        return singleton;
    }

    //  默认的缓存容量
    private static int DEFAULT_CAPACITY = 512;
    //  最大容量
    private static int MAX_CAPACITY = 100000;
    //  刷新缓存的频率
    private static int MONITOR_DURATION = 2;  //  2 秒执行一次
    //  启动监控线程
    static {
        //new Thread(new TimeoutThread()).start();
    }


    //使用默认容量创建一个  Map
    private static ConcurrentHashMap<String,CacheEntity> cache =
            new ConcurrentHashMap<String,CacheEntity>(DEFAULT_CAPACITY);


    /**
     *  将 key-value保存到本地缓存并制定该缓存的过期时间
     */
    public boolean putValue(String key, Object value,int expireTime) {
        return putCloneValue(key,value,expireTime);
    }


    /**
     *  将值通过序列化clone处理后保存到缓存中,可以解决值引用的问题
     * */
    private boolean putCloneValue(String key, Object value, int expireTime) {
        try {
            if (cache.size() >= MAX_CAPACITY) {
                return false;
            }
            //序列化赋值
            CacheEntity cloneEntity = clone(new CacheEntity(value, System.nanoTime(), expireTime));
            cache.put(key,cloneEntity);
            return true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }


    /**
     *  序列化  克隆处理
     * @param object
     * @param <T>
     * @return
     */
    private <T extends Serializable> T clone(T object) {
        T cloneObject = null;
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(object);
            objectOutputStream.close();

            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(outputStream.toByteArray());
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            cloneObject = (T) objectInputStream.readObject();
            objectInputStream.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
        return cloneObject;
    }

    /**
     * 从本地缓存中获取 Key 对应的值
     */
    public Object getValue(String key) {
        Object value = cache.get(key).getValue();
        if (!StringUtils.isEmpty(value)) {
            return value;
        }
        return null;
    }

    /**
     * 清空缓存
     */
    public void clear() {
        cache.clear();
    }


    static class TimeoutThread implements Runnable {
        @Override
        public void run() {
            while(true) {
                try {
                    System.out.println("Cache Monitor");
                    TimeUnit.SECONDS.sleep(MONITOR_DURATION);

                    //过期缓存的具体处理方法
                    for (String key: cache.keySet()) {
                        CacheEntity cacheEntity = cache.get(key);
                        long timoutTime = TimeUnit.NANOSECONDS.toSeconds(System.nanoTime() - cacheEntity.getGmtModify());
                        // " 过期时间 : "+timoutTime);
                        if (cacheEntity.getExpire() > timoutTime) {
                            continue;
                        }
                        System.out.println(" 清除过期缓存 ： " + key);
                        // 清除过期缓存和删除对应的缓存队列
                        cache.remove(key);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
