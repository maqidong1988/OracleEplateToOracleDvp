package model.handler;

import model.to.teamdb.EcologicalConstruction;
import model.to.teamdb.LeadershipOverview;
import org.hibernate.*;
import util.PageBean;

import java.util.List;
import java.util.Random;
import java.util.UUID;

public class EcologicalConstructionTask implements Runnable {

    private SessionFactory fromSessionFactory;
    private SessionFactory toSessionFactory;
    private Session   toSession;

    public EcologicalConstructionTask(SessionFactory fromSessionFactory,
                                      SessionFactory toSessionFactory){
        this.fromSessionFactory = fromSessionFactory;
        this.toSessionFactory = toSessionFactory;
    }

    @Override
    public void run() {
        try {
            toSession = toSessionFactory.openSession();
            //得到 LeadershipOverview 总条数
            int totalCount = getLeadershipOverviewCount(toSession);
            PageBean pageBean = new PageBean(0,5000,totalCount);

            for (int i=0; i<pageBean.getBatch(); i++) {
                execute(pageBean.getFirstResult(),pageBean.getMaxResult());
                pageBean.setFirstResult(pageBean.getFirstResult()+pageBean.getMaxResult());
            }
            //最后一次执行
            execute(pageBean.getFirstResult(),pageBean.getLastResult());
            System.out.println("EcologicalConstructionTask 执行完毕");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (toSession!=null) {
                toSession.close();
            }
        }
    }

    public static int getLeadershipOverviewCount(Session toSession) {
        Query query = toSession.createQuery("select count(1) from LeadershipOverview");
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
        Criteria criteria = toSession.createCriteria(LeadershipOverview.class);
        criteria.setFirstResult(firstResult).setMaxResults(maxResults);
        System.out.println("EcologicalConstruction 表插入了:"+firstResult+"条");
        List<LeadershipOverview> list = criteria.list();
        Transaction transaction = toSession.getTransaction();
        transaction.begin();
        for (LeadershipOverview leadershipOverview : list) {
            for (int year = 2013; year < 2017; year++) {
                EcologicalConstruction ecologicalConstruction= new EcologicalConstruction();
                ecologicalConstruction.setId(UUID.randomUUID().toString());
                ecologicalConstruction.setLeadershipOverviewId(leadershipOverview.getId());
                ecologicalConstruction.setRecordYears(year);
                ecologicalConstruction.setModelVillage(getRandomInt());
                ecologicalConstruction.setForestCoverRate(getRandomInt().longValue());
                ecologicalConstruction.setOtherIndustry(getRandomInt().longValue());
                ecologicalConstruction.setPotatoIndustry(getRandomInt().longValue());
                ecologicalConstruction.setTeaIndustry(getRandomInt().longValue());
                ecologicalConstruction.setUniversalVillage(getRandomInt());
                ecologicalConstruction.setVegetableBaseIndustry(getRandomInt().longValue());
                ecologicalConstruction.setWelloffVillage(getRandomInt());
                // NOTE:from Jay 2017/12/15 模拟分数
                toSession.save(ecologicalConstruction);
            }
        }
        transaction.commit();
    }

    private Integer getRandomInt() {
        Random random = new Random();
        return random.nextInt(20) + 80;
    }
}
