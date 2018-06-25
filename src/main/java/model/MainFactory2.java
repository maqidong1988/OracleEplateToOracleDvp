package model;

import model.handler2.CadreInfoPhotoTask;
import org.hibernate.SessionFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import util.PageBean;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class MainFactory2 {

    private static SessionFactory fromSessionFactory;
    private static SessionFactory toSessionFactory;
    private static ExecutorService executorService = Executors.newFixedThreadPool(6);
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        fromSessionFactory = (SessionFactory) applicationContext.getBean("fromSessionFactory");
        toSessionFactory = (SessionFactory) applicationContext.getBean("toSessionFactory");

        //查询 photo的总条数
        CadreInfoPhotoTask photoTask = new CadreInfoPhotoTask();
        int totalCount = photoTask.getTotalCount();
        PageBean pageBean = new PageBean(0,50,totalCount);

        for (int i=0; i<pageBean.getBatch(); i++) {
            executorService.execute(new CadreInfoPhotoTask());
        }


    }
}
