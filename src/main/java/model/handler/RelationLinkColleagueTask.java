package model.handler;

import model.to.cadredb.CadreInfoExperience;
import model.to.cadredb.RelationLink;
import model.to.cadredb.RelationNode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import util.PageBean;
import util.TimeBucket;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class RelationLinkColleagueTask implements Runnable {

    private SessionFactory fromSessionFactory;
    private SessionFactory toSessionFactory;
    private Session fromSession;
    private Session toSession;
    private List<RelationNode> relationNodeList;
    private static final String COLLEAGUE = "同事";
    private AtomicInteger s_sums = new AtomicInteger(0);

    public RelationLinkColleagueTask(SessionFactory fromSessionFactory,
                                     SessionFactory toSessionFactory) {
        this.fromSessionFactory = fromSessionFactory;
        this.toSessionFactory = toSessionFactory;
    }

    @Override
    public void run() {
        fromSession = fromSessionFactory.openSession();
        toSession   = toSessionFactory.openSession();

        //得到工作经历符合条件的总条数
        int totalCount = getTotalCount();
        //得到Relation的总条数
        relationNodeList = lstRelationNode();
        PageBean pageBean = new PageBean(0,5000,totalCount);

        Transaction transaction = toSession.getTransaction();
        transaction.begin();
        for (int i=0;i<pageBean.getBatch(); i++) {
            execute(pageBean.getFirstResult(),pageBean.getMaxResult());
            transaction.commit();
            transaction.begin();
            pageBean.setFirstResult(pageBean.getFirstResult()+pageBean.getMaxResult());
        }
        execute(pageBean.getFirstResult(),pageBean.getLastResult());
        transaction.commit();
        System.out.println("RelationLinkColleagueTask 执行完成..");
    }

    public int getTotalCount() {
        String sql = "select count(1) from CadreInfoExperience where nominationDate is not null and organizationName not like  '%待分配%' and organizationName not like '%待业%'";
        Query query = toSession.createQuery(sql);
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

    public void execute(int firstResult, int maxResults) {
        Query query =
                toSession.createQuery("select new CadreInfoExperience(organizationCode,organizationName,cadreId,nominationDate,removalDate,assignStatus) from CadreInfoExperience where nominationDate is not null and organizationName not like  '%待分配%' and organizationName not like '%待业%'");
         query.setFirstResult(firstResult).setMaxResults(maxResults);
        List<CadreInfoExperience> experienceListMain = query.list();
        relationNodeList.forEach(note ->{
            Map<String,Object> resMap = new HashMap<>();
            List<CadreInfoExperience> cadreInfoExperienceList = experienceListMain.stream().filter(e -> e.getCadreId().equals(note.getOriginalId())).collect(Collectors.toList());
            if (cadreInfoExperienceList.size() == 0) {
                return;
            }
            cadreInfoExperienceList.forEach(cadreInfoExperience -> {
                if (cadreInfoExperience.getNominationDate() == null) {
                    return;
                }

                if (cadreInfoExperience.getRemovalDate() == null) {
                    cadreInfoExperience.setRemovalDate(stringToTimestamp("2100-01-01 00:00:01"));
                }

                final String[] organizationName = {cadreInfoExperience.getOrganizationName()};
                final String[] organizationCode = {cadreInfoExperience.getOrganizationCode()};
                if (organizationName[0] == null || organizationName[0] == "") {
                    organizationName[0] = "$xxxx";
                }
                if (organizationCode[0] == null || organizationCode[0] == "") {
                    organizationCode[0] = "$xxxx";
                }

                List<CadreInfoExperience> findbynameOrCodeList = experienceListMain.stream().filter(
                        e -> !e.getCadreId().equals(cadreInfoExperience.getCadreId())
                                && e.getNominationDate() != null
                                && (organizationName[0].equals(e.getOrganizationName()) || organizationCode[0].equals(e.getOrganizationCode()))
                                && !e.getOrganizationName().contains("待分配")
                                && !e.getOrganizationName().contains("待业"))
                        .collect(Collectors.toList());


                if (findbynameOrCodeList.size() == 0) {
                    return;
                }

                findbynameOrCodeList.forEach(findex -> {
                    if (resMap.containsKey(findex.getCadreId() + findex.getOrganizationName())) {
                        return;
                    }

                    if (resMap.containsKey(findex.getCadreId() + findex.getOrganizationCode())) {
                        return;
                    }

                    if (findex.getAssignStatus() == "2" && cadreInfoExperience.getAssignStatus() == "2") {
                        List<RelationNode> mianNote_list_two = relationNodeList.stream().filter(e -> e.getOriginalId().equals(findex.getCadreId())).collect(Collectors.toList());
                        if (mianNote_list_two.size() > 0) {
                            RelationLink relationLink = new RelationLink();
                            relationLink.setLinkId(UUID.randomUUID().toString());
                            relationLink.setMainId(note.getNodeId());
                            relationLink.setBeRelatedId(mianNote_list_two.get(0).getNodeId());
                            relationLink.setRelationType(COLLEAGUE);
                            relationLink.setStatusCode(cadreInfoExperience.getAssignStatus());
                            relationLink.setIds(cadreInfoExperience.getId());
                            relationLink.setRelationDescription(connectString(cadreInfoExperience.getOrganizationName(), cadreInfoExperience.getDutyName()));
                            toSession.saveOrUpdate(relationLink);

                            s_sums.incrementAndGet();

                            if (findex.getOrganizationName() != null && findex.getOrganizationName() != "") {
                                resMap.put(findex.getCadreId() + findex.getOrganizationName(),null);
                            }
                            if (findex.getOrganizationCode() != null && findex.getOrganizationCode() != "") {
                                resMap.put(findex.getCadreId() + findex.getOrganizationCode(),null);
                            }
                        }
                    } else {
                        if (findex.getRemovalDate() == null) {
                            findex.setRemovalDate(stringToTimestamp("2100-01-01 00:00:01"));
                        }

                        if (cadreInfoExperience.getNominationDate().getTime() > cadreInfoExperience.getRemovalDate().getTime()
                                || findex.getNominationDate().getTime() > findex.getRemovalDate().getTime()) {
                            return;
                        }

                        TimeBucket[] buckets = {
                                new TimeBucket(cadreInfoExperience.getNominationDate().getTime(), cadreInfoExperience.getRemovalDate().getTime()),
                                new TimeBucket(findex.getNominationDate().getTime(), findex.getRemovalDate().getTime()),
                        };

                        TimeBucket union = TimeBucket.union(buckets);
                        if (union == null) {
                            return;
                        }
                        int timespan = (int) ((union.getEnd().getTime() - union.getStart().getTime()) / (1000 * 3600 * 24));
                        if (timespan <= 90) {
                            return;
                        }
                        List<RelationNode> mianNote_list_two = relationNodeList.stream().filter(e -> e.getOriginalId().equals(findex.getCadreId())).collect(Collectors.toList());
                        if (mianNote_list_two.size() > 0) {
                            RelationLink relationLink = new RelationLink();
                            relationLink.setLinkId(UUID.randomUUID().toString());
                            relationLink.setMainId(note.getNodeId());
                            relationLink.setBeRelatedId(mianNote_list_two.get(0).getNodeId());
                            relationLink.setRelationType(COLLEAGUE);
                            relationLink.setStatusCode(cadreInfoExperience.getAssignStatus());
                            relationLink.setIds(cadreInfoExperience.getId());
                            relationLink.setRelationDescription(connectString(findex.getOrganizationName(), findex.getDutyName()));
                            toSession.saveOrUpdate(relationLink);
                            s_sums.incrementAndGet();
                            if (findex.getOrganizationName() != null && findex.getOrganizationName() != "") {
                                resMap.put(findex.getCadreId() + findex.getOrganizationName(),null);
                            }

                            if (findex.getOrganizationCode() != null && findex.getOrganizationCode() != "") {
                                resMap.put(findex.getCadreId() + findex.getOrganizationCode(),null);
                            }
                        }
                    }

                });
            });

        });
        System.out.println("RelationLinkColleageTask 插入了 "+s_sums+" 条数据");

    }

    public List<RelationNode> lstRelationNode() {
        Query query = toSession.createQuery("select new RelationNode(nodeId,originalId) from RelationNode where nodeType='干部'");
        List<RelationNode> relationNodeLst = query.list();
        return relationNodeLst;
    }

    public static Timestamp stringToTimestamp(String dateStr) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        try {
            Date date = sdf.parse(dateStr);
            cal.setTime(date);
            return new Timestamp(cal.getTimeInMillis());
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            cal.setTime(new Date());
            return new Timestamp(cal.getTimeInMillis());
        }
    }

    private String connectString(String... strings) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String string : strings) {
            stringBuilder.append(string == null ? "" : string);
        }
        return stringBuilder.toString();
    }


}
