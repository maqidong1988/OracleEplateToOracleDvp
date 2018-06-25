package model.handler;

import model.mapper.team.LeadershipOverviewTransformMapper;
import model.to.cadredb.CadreInfoExperience;
import model.to.teamdb.LeadershipOverviewTransform;
import org.hibernate.*;
import org.mapstruct.factory.Mappers;
import util.PageBean;
import java.util.List;

public class LeadershipOverviewTransformTask implements Runnable {

    private SessionFactory fromSessionFactory;
    private SessionFactory toSessionFactory;
    private Session fromSession;
    private Session toSession;
    private LeadershipOverviewTransformMapper mapper;

    public LeadershipOverviewTransformTask(SessionFactory fromSessionFactory,
                                           SessionFactory toSessionFactory){
        this.fromSessionFactory = fromSessionFactory;
        this.toSessionFactory = toSessionFactory;
    }

    @Override
    public void run() {
        try {
            this.toSession = toSessionFactory.openSession();
            //查询  CadreInfoExperience 总条数
            int totalCount = getCadreExperienceCount();

            mapper = Mappers.getMapper(LeadershipOverviewTransformMapper.class);
            PageBean pageBean = new PageBean(0,5000, totalCount);
            for (int i=0; i<pageBean.getBatch(); i++) {
                execute(pageBean.getFirstResult(),pageBean.getMaxResult());
                pageBean.setFirstResult(pageBean.getFirstResult()+pageBean.getMaxResult());
            }

            //最后一次
            execute(pageBean.getFirstResult(),pageBean.getLastResult());
            System.out.println("LeadershipOverviewTransform 表插入完成");
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

    int getCadreExperienceCount() {
        Query query = toSession.createQuery("select count(1) from CadreInfoExperience where divisionType like :divisionType and assignStatus = :assignStatus");
        query.setParameter("divisionType", "1_1");
        query.setParameter("assignStatus", "2");
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
        Query query = toSession.createQuery("from CadreInfoExperience where divisionType like :divisionType and assignStatus = :assignStatus");
        query.setParameter("divisionType", "1_1");
        query.setParameter("assignStatus", "2");
        query.setFirstResult(firstResult).setMaxResults(maxResults);
        List listData = query.list();
        System.out.println("leadershipOverviewTransform 表插入了:"+firstResult+"条");
        Transaction transaction = toSession.getTransaction();
        transaction.begin();
        for (Object o :listData) {
            CadreInfoExperience cadreInfoExperience = (CadreInfoExperience)o;
            LeadershipOverviewTransform leadershipOverviewTransform = mapper.cadreInfoExperienceToLeadershiOverviewTransform(cadreInfoExperience);
            toSession.save(leadershipOverviewTransform);
        }
        transaction.commit();
    }
}
