package util;

import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapCache {

    public static Map<String, String> cacheMap = new HashMap<>();
    public static Map<String,String> addressCache = new HashMap<>();

    public static void setCache(String key, String value) {
        cacheMap.put(key,value);
    }

    public static void setAddressCache(String key,String value) {
        addressCache.put(key,value);
    }

    public static String getCache(String key) {
        String value = cacheMap.get(key);
        if (!StringUtils.isEmpty(value)) {
            return value;
        }
        return null;
    }

    public static String getAddressCache(String key) {
        String value = addressCache.get(key);
        if (!StringUtils.isEmpty(value)) {
            return value;
        }
        return null;
    }

    public static void removeCache(String key) {
        cacheMap.remove(key);
    }

    public static void removeAddressCache(String key) {
        addressCache.remove(key);
    }


    public static void main(String[] args) {
        ConcurrentHashMapCache.cacheMap.put("1","zhangsan");
        ConcurrentHashMapCache.cacheMap.put("2","lisi");
        ConcurrentHashMapCache.cacheMap.put("3","wangwu");

        System.out.println(ConcurrentHashMapCache.cacheMap.get("2"));
        System.out.println(ConcurrentHashMapCache.cacheMap.get("8"));
        ConcurrentHashMapCache.cacheMap.remove("2");
        System.out.println(ConcurrentHashMapCache.cacheMap.get("2"));
    }
}
