package model.handler;

import model.from.EmpPhoto;
import model.mapper.cadredb.CadreInfoPhotoMapper;
import model.to.cadredb.CadreInfoPhoto;
import org.hibernate.*;
import org.mapstruct.factory.Mappers;
import util.PageBean;

import java.sql.Timestamp;
import java.util.List;

public class CadreInfoPhotoTask implements Runnable {
    private SessionFactory fromSessionFactory;
    private SessionFactory toSessionFactory;
    private Session fromSession;
    private Session toSession;
    private CadreInfoPhotoMapper mapper;
    private List<String> cadreInfoIds;

    public CadreInfoPhotoTask(SessionFactory fromSessionFactory,
                              SessionFactory toSessionFactory) {
        this.fromSessionFactory = fromSessionFactory;
        this.toSessionFactory = toSessionFactory;
    }

    @Override
    public void run() {
        try {
            fromSession = fromSessionFactory.openSession();
            toSession = toSessionFactory.openSession();
            mapper = Mappers.getMapper(CadreInfoPhotoMapper.class);
            //查询cadreInfoIds
            cadreInfoIds = CadreInfoBasictTask.getCadreInfoIds(toSessionFactory);


            //查询 EmpPhoto数量
            int totalCount = getEmpPhotoCount();
            PageBean pageBean = new PageBean(0, 50, totalCount);
            for (int i = 0; i < pageBean.getBatch(); i++) {
                execute(pageBean.getFirstResult(), pageBean.getMaxResult());
                pageBean.setFirstResult(pageBean.getFirstResult() + pageBean.getMaxResult());

            }

            //最后一次执行
            execute(pageBean.getFirstResult(), pageBean.getLastResult());
            System.out.println("CadreInfoPhoto 表插入完成......");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fromSession != null) {
                fromSession.close();
            }
            if (toSession != null) {
                toSession.close();
            }
        }
    }

    int getEmpPhotoCount() {
        Query query = fromSession.createQuery("select count(1) from EmpPhoto");
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

    void execute(int firstResult, int maxResults) {
        Criteria criteria = fromSession.createCriteria(EmpPhoto.class);
        criteria.setFirstResult(firstResult).setMaxResults(maxResults);
        List listData = criteria.list();
        System.out.println("CadrePhoto 表插入了:"+firstResult+"条");
        Transaction transaction = toSession.getTransaction();
        transaction.begin();
        for (Object o : listData) {
            EmpPhoto empPhoto = (EmpPhoto) o;
            if (cadreInfoIds.contains(empPhoto.getEmpId())) {
                CadreInfoPhoto cadreInfoPhoto = mapper.empPhotoToCadreInfoPhoto(empPhoto);
                toSession.save(cadreInfoPhoto);
            }
        }
        toSession.flush();
        toSession.clear();
        fromSession.clear();
        transaction.commit();
    }
}
