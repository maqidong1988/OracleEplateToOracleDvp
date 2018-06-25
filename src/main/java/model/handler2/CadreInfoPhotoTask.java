package model.handler2;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CadreInfoPhotoTask implements Runnable {

    @Autowired
    private SessionFactory fromSessionFactory;
    @Autowired
    private SessionFactory toSessionFactory;

    public CadreInfoPhotoTask(){

    }

    @Override
    public void run() {

    }

    public int getTotalCount() {
        System.out.println(fromSessionFactory);
        Query query = fromSessionFactory.openSession().createQuery("select count(1) from EmpPhoto");
        List countLst = query.list();
        //得到总条数
        int totalCounts = 0;
        if (countLst.size() > 0) {
            Object o = countLst.get(0);
            if (!org.springframework.util.StringUtils.isEmpty(o)) {
                totalCounts = Integer.parseInt(String.valueOf(o));
            }
        }
        return totalCounts;
    }
}
