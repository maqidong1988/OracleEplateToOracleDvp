package model.handler;

import model.to.cadredb.CadreInfoRelationship;
import model.to.cadredb.RelationLink;
import model.to.cadredb.RelationNode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import util.PageBean;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class RelationFamiliesTask implements Runnable {

    private SessionFactory fromSessionFactory;
    private SessionFactory toSessionFactory;
    private Session fromSession;
    private Session toSession;
    private List<RelationNode> mianRelationLst;
    private AtomicInteger s_sums = new AtomicInteger(0);

    public RelationFamiliesTask(SessionFactory fromSessionFactory,
                                SessionFactory toSessionFactory) {
        this.fromSessionFactory = fromSessionFactory;
        this.toSessionFactory = toSessionFactory;
    }

    @Override
    public void run() {
        fromSession = fromSessionFactory.openSession();
        toSession   = toSessionFactory.openSession();

        mianRelationLst = toSession.createQuery("select new RelationNode(nodeId,originalId) from RelationNode where nodeType='干部'").list();
        //查询总条数
        int totalCount = getTotalCount();
        PageBean pageBean = new PageBean(0,100,totalCount);
        Transaction transaction = toSession.getTransaction();
        transaction.begin();
        for (int i=0; i<pageBean.getBatch(); i++) {
            execute(pageBean.getFirstResult(),pageBean.getMaxResult());
            transaction.commit();
            transaction.begin();
            pageBean.setFirstResult(pageBean.getFirstResult() + pageBean.getMaxResult());
        }
        //最后一次
        execute(pageBean.getFirstResult(),pageBean.getLastResult());
        transaction.commit();
        System.out.println("RelationFamiliesTask 执行完成..");
    }

    public int getTotalCount(){
        Query query = toSession.createQuery("select count(1) from RelationNode where nodeType='干部'");
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
        Query query =
                toSession.createQuery("select new RelationNode(nodeId,originalId) from RelationNode where nodeType='干部'");
        query.setFirstResult(firstResult).setMaxResults(maxResults);
        List<RelationNode> relationNodeLst = query.list();
        List<String> ids = new ArrayList<>();
        relationNodeLst.forEach(relationNode -> {
            ids.add(relationNode.getOriginalId());
        });

        List<CadreInfoRelationship> families = toSession.createQuery("from CadreInfoRelationship where cadreId in :ids")
                .setParameterList("ids", ids).list();
        if (families.size() > 0) {
            List<String> familiesIds = new ArrayList<>();

            families.forEach(family -> {
                //该亲戚对应的nodeId
                if (family.getCitizenId() == null) {
                    family.setCitizenId(family.getId());
                }
                familiesIds.add(family.getCitizenId());
            });

            List<RelationNode> familyNodeIds = toSession.createQuery("from RelationNode where identityNumber in :ids")
                    .setParameterList("ids", familiesIds).list();

            families.forEach(family -> {
                List<RelationNode> relationNode_temp = familyNodeIds.stream().filter(x -> x.getIdentityNumber().equals(family.getCitizenId())).collect(Collectors.toList());
                List<RelationNode> mainNote_temp = mianRelationLst.stream().filter(x -> x.getOriginalId().equals(family.getCadreId())).collect(Collectors.toList());

                if (relationNode_temp.size() > 0 && mainNote_temp.size() > 0) {
                    RelationLink relationLink = new RelationLink();
                    relationLink.setLinkId(UUID.randomUUID().toString());
                    relationLink.setMainId(mainNote_temp.get(0).getNodeId());
                    relationLink.setBeRelatedId(relationNode_temp.get(0).getNodeId());
                    relationLink.setRelationType("家庭");
                    relationLink.setRelationDescription(family.getRelationshipName());
                    toSession.saveOrUpdate(relationLink);
                    s_sums.incrementAndGet();
                } else {
                    System.out.println("空数据");
                }
            });
        }
        System.out.println("RelationFamiliesTask 插入了 "+s_sums+" 条数据");
    }
}
