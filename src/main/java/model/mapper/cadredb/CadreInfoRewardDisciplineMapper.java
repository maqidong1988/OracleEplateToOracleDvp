package model.mapper.cadredb;

import model.from.EmpA14;
import model.to.cadredb.CadreInfoRewardDiscipline;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Named;
import util.ConcurrentHashMapCache;
import util.SystemCodeConverter;

/**
 * Created by rain chen on 2017/11/23.
 *
 * @author rain chen
 * @version 1.0
 * @since 1.0
 * Copyright (C) 2017. SinoSoft All Rights Received
 */
@Mapper
public interface CadreInfoRewardDisciplineMapper {

    @Mappings({
            @Mapping(source = "subId", target = "id"),
            @Mapping(source = "empId", target = "cadreId"),
            @Mapping(source = "a14001", target = "rewardDisciplineSummary"),
            @Mapping(source = "a14201", target = "rewardDisciplineType"),
            @Mapping(source = "a14201", target = "rewardDisciplineTypeValue", qualifiedByName = "rewardDisciplineTypeCodeToValue"),
            @Mapping(source = "a14205A", target = "rewardName"),
            @Mapping(source = "a14205B", target = "rewardCode"),
            @Mapping(source = "a14205B", target = "rewardCodeValue", qualifiedByName = "rewardCodeToValue"),
            @Mapping(source = "a14214A", target = "rewardFrom"),
            @Mapping(source = "a14214B", target = "rewardFromCode"),
            @Mapping(source = "a14220", target = "honorName"),
            @Mapping(source = "a14221", target = "rewardReason"),
            @Mapping(source = "a14221", target = "rewardReasonValue", qualifiedByName = "rewardAndDisciplineReasonCodeToValue"),
            @Mapping(source = "a14224", target = "rewardExplain"),
            @Mapping(source = "a14225", target = "rewardStartTime"),
            @Mapping(source = "a14227", target = "rewardRevokeTime"),
            @Mapping(source = "a14230", target = "honorFrom"),
            @Mapping(source = "a14231", target = "rewardRevokeReason"),
            @Mapping(source = "a14231", target = "rewardRevokeReasonValue", qualifiedByName = "rewardRevokeReasonCodeToValue"),
            @Mapping(source = "a14305A", target = "disciplineName"),
            @Mapping(source = "a14305B", target = "disciplineCode"),
            @Mapping(source = "a14305B", target = "disciplineCodeValue", qualifiedByName = "disciplineCodeToValue"),
            @Mapping(source = "a14307", target = "disciplineStartTime"),
            @Mapping(source = "a14311A", target = "disciplineFrom"),
            @Mapping(source = "a14311B", target = "disciplineFromCode"),
            @Mapping(source = "a14317", target = "disciplineReason"),
            @Mapping(source = "a14317", target = "disciplineReasonValue", qualifiedByName = "rewardAndDisciplineReasonCodeToValue"),
            @Mapping(source = "a14321", target = "disciplineExplain"),
            @Mapping(source = "a14324", target = "disciplineEndTime"),
            @Mapping(source = "a14330", target = "isCriminalDiscipline"),
            @Mapping(source = "a14330", target = "isCriminalDisciplineValue", qualifiedByName = "isCriminalDisciplineCodeToValue"),
            @Mapping(source = "a14351", target = "isPunishment"),
            @Mapping(source = "a14351", target = "isPunishmentValue", qualifiedByName = "isPunishmentCodeToValue")
    }
    )
    CadreInfoRewardDiscipline empA14ToCadreInfoRewardDiscipline(EmpA14 empA14);

    @Named("rewardDisciplineTypeCodeToValue")
    default String rewardDisciplineTypeCodeToValue(String code) {
        //return SystemCodeConverter.getCodeValue("172", code);
        return ConcurrentHashMapCache.getCache("172-"+code);
    }

    @Named("rewardCodeToValue")
    default String rewardCodeToValue(String code) {
        //return SystemCodeConverter.getCodeValue("28", code);
        return ConcurrentHashMapCache.getCache("28-"+code);
    }

    @Named("rewardAndDisciplineReasonCodeToValue")
    default String rewardAndDisciplineReasonCodeToValue(String code) {
        //return SystemCodeConverter.getCodeValue("116", code);
        return ConcurrentHashMapCache.getCache("116-"+code);
    }

    @Named("rewardRevokeReasonCodeToValue")
    default String rewardRevokeReasonCodeToValue(String code) {
        //return SystemCodeConverter.getCodeValue("93", code);
        return ConcurrentHashMapCache.getCache("93-"+code);
    }

    @Named("disciplineCodeToValue")
    default String disciplineCodeToValue(String code) {
        //return SystemCodeConverter.getCodeValue("14", code);
        return ConcurrentHashMapCache.getCache("14-"+code);
    }

    @Named("isCriminalDisciplineCodeToValue")
    default String isCriminalDisciplineCodeToValue(String code) {
        //return SystemCodeConverter.getCodeValue("39", code);
        return ConcurrentHashMapCache.getCache("39-"+code);
    }

    @Named("isPunishmentCodeToValue")
    default String isPunishmentCodeToValue(String code) {
        //return SystemCodeConverter.getCodeValue("122", code);
        return ConcurrentHashMapCache.getCache("122-"+code);
    }

}
