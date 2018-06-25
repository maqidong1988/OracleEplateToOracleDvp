package model;

import model.handler.*;
import org.hibernate.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import util.ConcurrentHashMapCache;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainFactory {

    private static SessionFactory fromSessionFactory;
    private static SessionFactory toSessionFactory;

    private static ExecutorService executorService = Executors.newFixedThreadPool(6);

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        fromSessionFactory = (SessionFactory) applicationContext.getBean("fromSessionFactory");
        toSessionFactory = (SessionFactory) applicationContext.getBean("toSessionFactory");

        CountDownLatch cdl = new CountDownLatch(1);
        System.out.println("先执行初始化数据操作");
        executorService.execute(new SysCodeItemTask(fromSessionFactory,toSessionFactory,cdl));


        cdl.await();
        System.out.println("缓存数据 CacahSysCodeItem.size:"+ConcurrentHashMapCache.cacheMap.size());
        System.out.println("缓存数据 CacheAddress.size:"+ConcurrentHashMapCache.addressCache.size());

        //在插入CadreInfo表数据
        System.out.println("在执行主表操作");
        CountDownLatch cdl2 = new CountDownLatch(1);
        executorService.execute(new CadreInfoBasictTask(fromSessionFactory,toSessionFactory,cdl2));


        cdl2.await();


        System.out.println("最后开始执行从表操作");

        System.out.println("慢悠悠插入Photo表...");
        //插入 CadrePhotoInfo
        executorService.execute(new CadreInfoPhotoTask(fromSessionFactory,toSessionFactory));

        CountDownLatch cdl3 = new CountDownLatch(6);
        // 插入 CadreCharacteristic表
        executorService.execute(new CadreInfoCharacteristicTask(fromSessionFactory,toSessionFactory,cdl3));
        // 插入 CadreInfoDegree表
        executorService.execute(new CadreInfoDegreeTask(fromSessionFactory,toSessionFactory,cdl3));
        // 插入 CadreInfoEducation表
        executorService.execute(new CadreInfoEducationTask(fromSessionFactory,toSessionFactory,cdl3));
        // 插入 CadreInfoEvaluate表
        executorService.execute(new CadreInfoEvaluateTask(fromSessionFactory,toSessionFactory,cdl3));
        // 插入 CadreInfoExperience表
        executorService.execute(new CadreInfoExperienceTask(fromSessionFactory,toSessionFactory,cdl3));
        //插入 CadreInfoRelationship
        executorService.execute(new CadreInfoRelationshipTask(fromSessionFactory,toSessionFactory,cdl3));

        cdl3.await();
        // 插入 CadreInfoFocus 表
        executorService.execute(new CadreInfoFocusTask(fromSessionFactory,toSessionFactory));
        // 插入 CadreInfoDutyLevel
        executorService.execute(new CadreInfoDutyLevelTask(fromSessionFactory,toSessionFactory));
        //插入 CadreInfoJobCompletion
        executorService.execute(new CadreInfoJobCompletionTask(fromSessionFactory,toSessionFactory));
        //插入 CadreKeyJobPromotion
        executorService.execute(new CadreKeyJobPromotionTask(fromSessionFactory,toSessionFactory));


        //插入 CadreInfoNegativeWarning
        executorService.execute(new CadreInfoNegativeWarningTask(fromSessionFactory,toSessionFactory));
        // 插入 CadrePoliticalVisage
        executorService.execute(new CadrePoliticalVisageTask(fromSessionFactory,toSessionFactory));
        // 插入 CadreInfoRewardDiscipline
        executorService.execute(new CadreInfoRewardDisciplineTask(fromSessionFactory,toSessionFactory));
        // 插入 CadreTeamNegativeWarn
        executorService.execute(new CadreTeamNegativeWarnTask(fromSessionFactory,toSessionFactory));


        //插入 CadreInfoTrain
        executorService.execute(new CadreInfoTrainTask(fromSessionFactory,toSessionFactory));
         //插入 CadreInfoWorkLog
        executorService.execute(new CadreInfoWorkLogTask(fromSessionFactory,toSessionFactory));
         //插入 EducationDegree
        executorService.execute(new EducationDegreeTask(fromSessionFactory,toSessionFactory));
         //插入 EducationIdToTrace
        executorService.execute(new EducationIdToTraceTask(fromSessionFactory,toSessionFactory));
        //插入 CadreTeam
        executorService.execute(new CadreTeamTask(fromSessionFactory,toSessionFactory));


        //插入 LeaderShipOverviewTransform
        executorService.execute(new LeadershipOverviewTransformTask(fromSessionFactory,toSessionFactory));

        CountDownLatch cdl4 = new CountDownLatch(1);
        //插入 LeaderShipOverview
        executorService.execute(new LeaderShipOverviewTask(fromSessionFactory,toSessionFactory,cdl4));
        cdl4.await();
        //插入 EcologicalConstruction
         executorService.execute(new EcologicalConstructionTask(fromSessionFactory,toSessionFactory));
        //插入 AssessmentScore
        executorService.execute(new AssessmentScoreTask(fromSessionFactory,toSessionFactory));
        //插入 EconomicDevelopment
        executorService.execute(new EconomicDevelopmentTask(fromSessionFactory,toSessionFactory));
        //插入LeaderShipLocation
        executorService.execute(new LeaderShipLocationTask(fromSessionFactory,toSessionFactory));
        //插入 NegativePublicOpinion
        executorService.execute(new NegativePublicOpinionTask(fromSessionFactory,toSessionFactory));
         //插入 PositivePublicOpinion
        executorService.execute(new PositivePublicOpinionTask(fromSessionFactory,toSessionFactory));
         //插入 PovertyAlleviationWork
        executorService.execute(new PovertyAlleviationWorkTask(fromSessionFactory,toSessionFactory));
        //插入 SocialComprehensive
        executorService.execute(new SocialComprehensiveTask(fromSessionFactory,toSessionFactory));
        //插入 RelationShipChange
        executorService.execute(new RelationShipChangesTask(fromSessionFactory,toSessionFactory));


        //最后更新任务 更新 CadreInfo表的(orgId,levelCode,unitCode,unitId四个字段)
        // 和 LeaderShipOverview(unitId,unitCode字段)
        executorService.execute(new UpdateDataTask(fromSessionFactory,toSessionFactory));

        //插入 RelationNode表
        CountDownLatch  cdl5= new CountDownLatch(1);
        executorService.execute(new RelationNodeTask(fromSessionFactory,toSessionFactory,cdl5));
        cdl5.await();
        //插入 RelationLink表
        executorService.execute(new RelationLinkColleagueTask(fromSessionFactory,toSessionFactory));
        executorService.execute(new RelationLinkEducationTask(fromSessionFactory,toSessionFactory));
        executorService.execute(new RelationFamiliesTask(fromSessionFactory,toSessionFactory));


    }
}
