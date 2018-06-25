package model.handler;

import model.from.EmpA02;
import model.mapper.team.CadreTeamMapper;
import model.to.cadredb.CadreInfoExperience;
import model.to.teamdb.CadreTeam;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.mapstruct.factory.Mappers;
import util.PageBean;

import java.util.List;
import java.util.Map;

public class CadreTeamTask implements Runnable {

    private SessionFactory fromSessionFactory;
    private SessionFactory toSessionFactory;
    private Session toSession;
    private List<Map<String,String>> mapLst;
    private CadreTeamMapper mapper;

    public CadreTeamTask(SessionFactory fromSessionFactory,
                         SessionFactory toSessionFactory) {
        this.fromSessionFactory = fromSessionFactory;
        this.toSessionFactory =  toSessionFactory;
    }

    @Override
    public void run() {
        try {
            toSession = toSessionFactory.openSession();
            Query query = toSession.createQuery("select new Map(divisionType as divisionType,organizationName as organizationName,affiliation as affiliation) " +
                    "from CadreInfoExperience " +
                    "where assignStatus = :assignStatus group by divisionType,organizationName,affiliation");
            query.setParameter("assignStatus", "2");
            mapLst = (List<Map<String,String>>)query.list();
            mapper = Mappers.getMapper(CadreTeamMapper.class);
            //查询 cadreInfoExperience 总条数
            int totalCount = getExperienceCount();
            PageBean pageBean = new PageBean(0,5000,totalCount);
            for (int i=0; i<pageBean.getBatch();i++) {
                execute(pageBean.getFirstResult(),pageBean.getMaxResult());
                pageBean.setFirstResult(pageBean.getFirstResult()+pageBean.getMaxResult());
            }

            //最后一次
            execute(pageBean.getFirstResult(),pageBean.getLastResult());
            System.out.println("CodreTeamTask 执行完毕");
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            if (toSession!=null) {
                toSession.close();
            }
        }
    }

    int getExperienceCount() {
        org.hibernate.Query query = toSession.createQuery("select count(1) from CadreInfoExperience");
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
        Criteria criteria = toSession.createCriteria(CadreInfoExperience.class);
        criteria.setFirstResult(firstResult).setMaxResults(maxResults);
        List<CadreInfoExperience> listData = (List<CadreInfoExperience>)criteria.list();
        System.out.println("CadreTeam 表插入了:"+firstResult+"条");
        Transaction transaction = toSession.getTransaction();
        transaction.begin();
        for (CadreInfoExperience cadreInfoExperience: listData) {
            for (Map map: mapLst) {
                String divisionType = (String) map.get("divisionType");
                String organizationName = (String) map.get("organizationName");
                String affiliation  = (String)map.get("affiliation");

                if ((divisionType!=null && divisionType.equals(cadreInfoExperience.getDivisionType())) &&
                    (organizationName !=null && organizationName.equals(cadreInfoExperience.getOrganizationName())) &&
                    (affiliation!=null && affiliation.equals(cadreInfoExperience.getAffiliation()))) {
                    CadreTeam cadreTeam = mapper.cadreInfoExperienceToCadreTeam(cadreInfoExperience);
                    toSession.save(cadreTeam);
                }
            }
        }
        transaction.commit();
    }

}
