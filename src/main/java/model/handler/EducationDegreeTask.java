package model.handler;
import model.to.cadredb.CadreInfoDegree;
import model.to.cadredb.CadreInfoEducation;
import org.hibernate.*;
import org.springframework.util.StringUtils;
import util.PageBean;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class EducationDegreeTask implements Runnable {

    private SessionFactory fromSessionFactory;
    private SessionFactory toSessionFactory;
    private Session fromSession;
    private Session toSession;
    private Map<String,Object> cadreInfoMap;
    private List<CadreInfoDegree> cadreInfoDegreeList;
    public EducationDegreeTask(SessionFactory fromSessionFactory,
                               SessionFactory toSessionFactory){
        this.fromSessionFactory = fromSessionFactory;
        this.toSessionFactory   = toSessionFactory;
    }

    @Override
    public void run() {
        try {
            fromSession = fromSessionFactory.openSession();
            toSession   = toSessionFactory.openSession();
            //先查询cadreInfoIds
            cadreInfoMap = CadreInfoBasictTask.getCadreInfoMaps(toSessionFactory);

            //查询 CadreInfoDegree信息
            cadreInfoDegreeList = getCadreInfoDegreeLst();

            int totalCount = getEducationCount();
            PageBean pageBean = new PageBean(0,1000,totalCount);
            //查询 CadreInfoEducation信息
            for (int i=0; i<pageBean.getBatch();i++) {
                execute(pageBean.getFirstResult(),pageBean.getMaxResult());
                pageBean.setFirstResult(pageBean.getFirstResult()+pageBean.getMaxResult());
            }

            //最后一次入库
            execute(pageBean.getFirstResult(),pageBean.getLastResult());
            System.out.println("EducationDegreeTask 执行完毕");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fromSession!=null) {
                fromSession.close();
            }
            if (toSession!=null) {
                toSession.close();
            }
        }
    }

    List<CadreInfoDegree> getCadreInfoDegreeLst() {
        Criteria criteria = toSession.createCriteria(CadreInfoDegree.class);
        List<CadreInfoDegree> CadreInfoDegreeLst = (List<CadreInfoDegree>)criteria.list();
        return CadreInfoDegreeLst;
    }

    List<CadreInfoEducation> getCadreInfoEducationLst(int firstResult,int maxResults){
        Criteria criteria = toSession.createCriteria(CadreInfoEducation.class);
        criteria.setFirstResult(firstResult).setMaxResults(maxResults);
        List<CadreInfoEducation> CadreInfoEducationLst = (List<CadreInfoEducation>)criteria.list();
        return CadreInfoEducationLst;
    }

    public int getEducationCount() {
        Query query = toSession.createQuery("select count(1) from CadreInfoEducation");
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

    void execute(int firstResult,int maxResults) {
        Transaction transaction = toSession.getTransaction();
        transaction.begin();
        List<CadreInfoEducation> cadreInfoEducationList =
                getCadreInfoEducationLst(firstResult,maxResults);
        System.out.println("EducationDegree 表插入了:"+firstResult+"条");
        long currentStart = System.currentTimeMillis();

        for (CadreInfoDegree cadreInfoDegree : cadreInfoDegreeList) {
            if (cadreInfoMap.containsKey(cadreInfoDegree.getCadreId())) {
                String a09SchoolName = cadreInfoDegree.getDegreeGrantDepartment();
                Timestamp a09EduEndTime = cadreInfoDegree.getDegreeGrantDate();

                for (CadreInfoEducation cadreInfoEducation : cadreInfoEducationList) {
                    if (cadreInfoMap.containsKey(cadreInfoEducation.getCadreId())) {
                        String a08SchoolName = cadreInfoEducation.getSchoolName();
                        Timestamp a08EduEndTime = cadreInfoEducation.getEndEducationTime();
                        if (StringUtils.hasText(a09SchoolName)
                                && StringUtils.pathEquals(a09SchoolName, a08SchoolName)
                                && a09EduEndTime != null
                                && a09EduEndTime.equals(a08EduEndTime)) {
                            String id = cadreInfoEducation.getId();
                            cadreInfoDegree.setEducationId(id);
                            toSession.saveOrUpdate(cadreInfoDegree);
                        }
                    }
                }
            }
        }
        transaction.commit();

    }
}
