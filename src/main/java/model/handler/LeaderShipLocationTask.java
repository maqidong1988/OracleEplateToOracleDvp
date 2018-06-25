package model.handler;
import model.to.teamdb.LeadershipLocation;
import model.to.teamdb.LeadershipOverview;
import org.hibernate.*;
import util.PageBean;

import java.util.List;

public class LeaderShipLocationTask implements Runnable {

    private SessionFactory fromSessionFactory;
    private SessionFactory toSessionFactory;
    private Session toSession;
    public LeaderShipLocationTask(SessionFactory fromSessionFactory,
                                  SessionFactory toSessionFactory) {
        this.fromSessionFactory = fromSessionFactory;
        this.toSessionFactory = toSessionFactory;
    }

    @Override
    public void run() {
        try {
            toSession = toSessionFactory.openSession();

            //得到 LeadershipOverview 总条数
            int totalCount = getLeadershipOverviewCount();
            PageBean pageBean = new PageBean(0,5000,totalCount);

            for (int i=0; i<pageBean.getBatch();i++) {
                execute(pageBean.getFirstResult(),pageBean.getMaxResult());
                pageBean.setFirstResult(pageBean.getFirstResult()+pageBean.getMaxResult());
            }

            //最后一次执行
            execute(pageBean.getFirstResult(),pageBean.getLastResult());
            System.out.println("leaderShipLocationTask 执行完成");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (toSession!=null) {
                toSession.close();
            }
        }
    }

    public int getLeadershipOverviewCount() {
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

    void execute(int firstResult, int maxResults){
        Criteria criteria = toSession.createCriteria(LeadershipOverview.class);
        criteria.setFirstResult(firstResult).setMaxResults(maxResults);
        List<LeadershipOverview> list = criteria.list();
        System.out.println("LeadershipLocation 表插入了:"+firstResult+"条");
        Transaction transaction = toSession.getTransaction();
        transaction.begin();
        for (LeadershipOverview leadershipOverview: list) {
            LeadershipLocation leadershipLocation = new LeadershipLocation();
            leadershipLocation.setId(leadershipOverview.getId());
            leadershipLocation.setLeadershipOverviewId(leadershipOverview.getId());
            leadershipLocation.setPointName(leadershipOverview.getLeadershipName());
            toSession.save(leadershipLocation);
        }
        transaction.commit();
    }
}
