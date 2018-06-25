package util;

import model.from.SysCodeItem;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by rain chen on 2017/11/20.
 *
 * @author rain chen
 * @version 1.0
 * @since 1.0
 * Copyright (C) 2017. SinoSoft All Rights Received
 */
public class SystemCodeConverter {

    private static final SessionFactory FROM_SESSION_FACTORY;
    public static final Map<String, String> DIVISION_CODE = new HashMap<>();
    public static final Map<String, String> DIVISION_NAME = new HashMap<>();

    static {
        FROM_SESSION_FACTORY = SpringContextUtil.getBean("fromSessionFactory");
        DIVISION_CODE.put("001.019.001", "520502");
        DIVISION_CODE.put("001.019.726", "520521");
        DIVISION_CODE.put("001.019.410", "520522");
        DIVISION_CODE.put("001.019.929", "520523");
        DIVISION_CODE.put("001.019.114", "520524");
        DIVISION_CODE.put("001.019.276", "520525");
        DIVISION_CODE.put("001.019.005", "520526");
        DIVISION_CODE.put("001.019.430", "520527");

        DIVISION_NAME.put("001.019.001", "贵州毕节七星关");
        DIVISION_NAME.put("001.019.726", "贵州大方");
        DIVISION_NAME.put("001.019.410", "贵州黔西");
        DIVISION_NAME.put("001.019.929", "贵州金沙");
        DIVISION_NAME.put("001.019.114", "贵州织金");
        DIVISION_NAME.put("001.019.276", "贵州纳雍");
        DIVISION_NAME.put("001.019.005", "贵州威宁");
        DIVISION_NAME.put("001.019.430", "贵州赫章");
    }

    @SuppressWarnings("unchecked")
    public static String getCodeValue(String codeType, String codeValue) {
        Session fromSession = FROM_SESSION_FACTORY.openSession();
        Criteria systemCodeCriteria = fromSession.createCriteria(SysCodeItem.class);
        systemCodeCriteria.add(Restrictions.eq("codeSetId", Long.valueOf(codeType)));
        systemCodeCriteria.add(Restrictions.eq("code", codeValue));
        List<SysCodeItem> systemCodeItemList = systemCodeCriteria.list();
        fromSession.close();
        if (systemCodeItemList != null && systemCodeItemList.size() > 0) {
            return systemCodeItemList.get(0).getName();
        }
        return "";
    }

    @SuppressWarnings("unchecked")
    public static String getCodeValue(String code) {
        Session fromSession = FROM_SESSION_FACTORY.openSession();
        Query query = fromSession.createQuery("select b01001 from DepB001 where b001001A = :code");
        List<String> name = query.setParameter("code", code).list();
        fromSession.close();
        if (name.size() > 0) {
            return name.get(0);
        }
        return "";
    }

    @SuppressWarnings("unchecked")
    public static String getAddressByDepId(String depId) {
        Session fromSession = FROM_SESSION_FACTORY.openSession();
        Query query = fromSession.createQuery("select b04004 from DepB04 where depId = :depId");
        query.setParameter("depId", depId);
        List<String> list = query.list();
        String addr = null;
        if (list.size() > 0) {
            addr = list.get(0);
        }
        fromSession.close();
        return addr;
    }
}
