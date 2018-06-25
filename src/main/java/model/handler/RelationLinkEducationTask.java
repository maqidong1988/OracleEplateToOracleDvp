package model.handler;

import model.to.cadredb.CadreInfoEducation;
import model.to.cadredb.RelationLink;
import model.to.cadredb.RelationNode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import util.PageBean;
import util.TimeBucket;
import util.UUIDUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class RelationLinkEducationTask implements Runnable{

    private SessionFactory fromSessionFactory;
    private SessionFactory toSessionFactory;
    private Session fromSession;
    private static final String COLLEAGUE = "同学";
    private Session toSession;
    private List<RelationNode> relationNodeLst;
    private AtomicInteger s_sums = new AtomicInteger(0);

    public RelationLinkEducationTask(SessionFactory fromSessionFactory,
                                     SessionFactory toSessionFactory) {
        this.fromSessionFactory = fromSessionFactory;
        this.toSessionFactory   = toSessionFactory;
    }

    @Override
    public void run() {
        fromSession = fromSessionFactory.openSession();
        toSession   = toSessionFactory.openSession();
        //得到教育的总条数
        int totalCount = getTotalCount();
        relationNodeLst = lstRelationNode();

        PageBean pageBean = new PageBean(0,5000,totalCount);
        Transaction transaction = toSession.getTransaction();
        transaction.begin();
        for (int i=0; i<pageBean.getBatch();i++) {
            execute(pageBean.getFirstResult(),pageBean.getMaxResult());
            transaction.commit();
            transaction.begin();
            pageBean.setFirstResult(pageBean.getFirstResult()+pageBean.getMaxResult());
        }
        //最后一次
        execute(pageBean.getFirstResult(),pageBean.getLastResult());
        transaction.commit();
        System.out.println("RelationLinkEducationTask 执行完成..");
    }

    public int getTotalCount(){
        Query query =
                toSession.createQuery("select count(1) from CadreInfoEducation where startEducationTime is not null and endEducationTime is not null");
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

    public List<RelationNode> lstRelationNode() {
        Query query = toSession.createQuery("select new RelationNode(nodeId,originalId) from RelationNode where nodeType='干部'");
        List<RelationNode> relationNodeList = query.list();
        return relationNodeList;
    }

    void execute(int firstResult, int maxResults){
        Query query =
                toSession.createQuery("select new CadreInfoEducation(schoolName, className, startEducationTime, endEducationTime, cadreId) from CadreInfoEducation where startEducationTime is not null and endEducationTime is not null");
        query.setFirstResult(firstResult).setMaxResults(maxResults);
        List<CadreInfoEducation> cadreInfoEducationListMain = query.list();

        relationNodeLst.forEach(note ->{
            List<String> listLINK = new ArrayList<>();
            List<CadreInfoEducation> cadreInfoEducationList = cadreInfoEducationListMain.stream().filter(e -> e.getCadreId().equals(note.getOriginalId())).collect(Collectors.toList());
            if (cadreInfoEducationList.size() == 0) {
                return;
            }

            cadreInfoEducationList.forEach(cadreInfoEducation -> {
                if (cadreInfoEducation.getStartEducationTime() == null
                        || cadreInfoEducation.getEndEducationTime() == null) {
                    return;
                }

                final String[] schoolName = {cadreInfoEducation.getSchoolName()};
                final String[] className = {cadreInfoEducation.getClassName()};
                if (schoolName[0] == null || schoolName[0] == "") {
                    schoolName[0] = "$xxxx";
                }
                if (className[0] == null || className[0] == "") {
                    className[0] = "$xxxx";
                }

                List<CadreInfoEducation> findbynameOrCodeList = cadreInfoEducationListMain.stream().filter(
                        e -> !e.getCadreId().equals(cadreInfoEducation.getCadreId())
                                && e.getStartEducationTime() != null
                                && e.getEndEducationTime() != null
                                && schoolName[0].equals(e.getSchoolName())
                                && className[0].equals(e.getClassName()))
                        .collect(Collectors.toList());

                if (findbynameOrCodeList.size() == 0) {
                    return;
                }

                findbynameOrCodeList.forEach(findex -> {
                    if (listLINK.contains(findex.getCadreId() + findex.getSchoolName())) {
                        return;
                    }

                    if (cadreInfoEducation.getStartEducationTime().getTime() > cadreInfoEducation.getEndEducationTime().getTime()
                            || findex.getStartEducationTime().getTime() > findex.getEndEducationTime().getTime()) {
                        return;
                    }

                    TimeBucket[] buckets = {
                            new TimeBucket(cadreInfoEducation.getStartEducationTime().getTime(), cadreInfoEducation.getEndEducationTime().getTime()),
                            new TimeBucket(findex.getStartEducationTime().getTime(), findex.getEndEducationTime().getTime()),
                    };

                    TimeBucket union = TimeBucket.union(buckets);
                    if (union == null) {
                        return;
                    }

                    int timespan = (int) ((union.getEnd().getTime() - union.getStart().getTime()) / (1000 * 3600 * 24));
                    if (timespan <= 90) {
                        return;
                    }

                    List<RelationNode> mianNote_list_two = relationNodeLst.stream().filter(e -> e.getOriginalId().equals(findex.getCadreId())).collect(Collectors.toList());
                    if (mianNote_list_two.size() > 0) {
                        RelationLink relationLink = new RelationLink();
                        relationLink.setLinkId(UUID.randomUUID().toString());
                        relationLink.setMainId(note.getNodeId());
                        relationLink.setBeRelatedId(mianNote_list_two.get(0).getNodeId());
                        relationLink.setRelationType(COLLEAGUE);
                        relationLink.setIds(cadreInfoEducation.getId());
                        relationLink.setRelationDescription(connectString(findex.getSchoolName(), findex.getClassName()));
                        toSession.saveOrUpdate(relationLink);

                        s_sums.incrementAndGet();
                        if (findex.getSchoolName() != null) {
                            listLINK.add(findex.getCadreId() + findex.getSchoolName());
                        }
                    }
                });

            });
        });
        System.out.println("RelationLinkEducationTask 插入了 "+s_sums+" 条数据");
    }

    private String connectString(String... strings) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String string : strings) {
            stringBuilder.append(string == null ? "" : string);
        }
        return stringBuilder.toString();
    }
}
