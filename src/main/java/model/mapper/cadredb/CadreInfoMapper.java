package model.mapper.cadredb;

import model.from.EmpA001;
import model.from.SysCodeItem;
import model.to.cadredb.CadreInfo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Named;
import org.springframework.util.StringUtils;
import util.ConcurrentHashMapCache;
import util.LocalCache;
import util.SystemCodeConverter;

/**
 * Created by rain chen on 2017/11/20.
 *
 * @author rain chen
 * @version 1.0
 * @since 1.0
 * Copyright (C) 2017. SinoSoft All Rights Received
 */
@Mapper
public interface CadreInfoMapper {
    @Mappings({
            @Mapping(source = "empId", target = "id"),
            @Mapping(source = "a01001", target = "name"),
            @Mapping(source = "empId", target = "filePath"),
            @Mapping(source = "a01004", target = "gender"),
            @Mapping(source = "a01004", target = "genderValue", qualifiedByName = "genderCodeToValue"),
            @Mapping(source = "a01007", target = "birthday"),
            @Mapping(source = "a01011A", target = "nativePlace"),
            @Mapping(source = "a01014A", target = "birthPlace"),
            @Mapping(source = "a01017", target = "nation"),
            @Mapping(source = "a01017", target = "nationValue", qualifiedByName = "nationCodeToValue"),
            @Mapping(source = "a01027", target = "health"),
            @Mapping(source = "a01027", target = "healthValue", qualifiedByName = "healthCodeToValue"),
            @Mapping(source = "a01031", target = "maritalStatus"),
            @Mapping(source = "a01031", target = "maritalStatusValue", qualifiedByName = "maritalStatusCodeToValue"),
            @Mapping(source = "a01034", target = "workDate"),
            @Mapping(source = "a01052", target = "specialIdentification"),
            @Mapping(source = "a01052", target = "specialIdentificationValue", qualifiedByName = "specialIdentificationCodeToValue"),
            @Mapping(source = "a01057A", target = "personnelRelationUnitName"),
            @Mapping(source = "a01057B", target = "personnelRelationUnitId"),
            @Mapping(source = "a01058", target = "retire"),
            @Mapping(source = "a01058", target = "retireValue", qualifiedByName = "retireCodeToValue"),
            @Mapping(source = "a01060", target = "personType"),
            @Mapping(source = "a01060", target = "personTypeValue", qualifiedByName = "personTypeCodeToValue"),
            @Mapping(source = "a01061", target = "relationUnitDivision"),
            @Mapping(source = "a01062", target = "personnelRelationUnitLevel"),
            @Mapping(source = "a01062", target = "relationUnitLevelValue", qualifiedByName = "leadershipLevelCodeToValue"),
            @Mapping(source = "a01063", target = "personStatus"),
            @Mapping(source = "a01063", target = "personStatusValue", qualifiedByName = "personStatusCodeToValue"),
            @Mapping(source = "a01065", target = "personManageCategory"),
            @Mapping(source = "a01065", target = "personManageCategoryValue", qualifiedByName = "personManageCategoryCodeToValue"),
            @Mapping(source = "a01081", target = "domicilePlace"),
            @Mapping(source = "a01110", target = "growthPlace"),
            @Mapping(source = "a01111", target = "duty"),
            @Mapping(source = "a001003", target = "identityNumber"),
            @Mapping(source = "a01087", target = "specialty"),
            @Mapping(source = "a01088", target = "hobby"),
            @Mapping(source = "a01103", target = "grassrootsWorkTime"),
            @Mapping(source = "a01107", target = "grassrootsWork"),
            @Mapping(source = "a01107", target = "grassrootsWorkValue", qualifiedByName = "grassrootsWorkCodeToValue"),
            @Mapping(source = "a01108", target = "grassrootsWorkDepartment"),
            @Mapping(source = "lastModifiedTime", target = "storeTimeFromEplatform")
    })
    CadreInfo empA001ToCadreInfo(EmpA001 empA01);

    @Named("genderCodeToValue")
    default String genderCodeToValue(String genderCode) {
        //return SystemCodeConverter.getCodeValue("18", genderCode);
        return ConcurrentHashMapCache.getCache("18"+"-"+genderCode);
    }

    @Named("nationCodeToValue")
    default String nationCodeToValue(String nationCode) {
        //return SystemCodeConverter.getCodeValue("23", nationCode);
        return ConcurrentHashMapCache.getCache("23"+"-"+nationCode);
    }

    @Named("healthCodeToValue")
    default String healthCodeToValue(String healthCode) {
        //return SystemCodeConverter.getCodeValue("20", healthCode);
        return ConcurrentHashMapCache.getCache("20"+"-"+healthCode);
    }

    @Named("maritalStatusCodeToValue")
    default String maritalStatusCodeToValue(String maritalStatusCode) {
        //return SystemCodeConverter.getCodeValue("24", maritalStatusCode);
        return ConcurrentHashMapCache.getCache("24"+"-"+maritalStatusCode);
    }

    @Named("specialIdentificationCodeToValue")
    default String specialIdentificationCodeToValue(String specialIdentificationCode) {
        //return SystemCodeConverter.getCodeValue("106", specialIdentificationCode);
        return ConcurrentHashMapCache.getCache("106"+"-"+specialIdentificationCode);
    }

    @Named("retireCodeToValue")
    default String retireCodeToValue(String retireCode) {
        //return SystemCodeConverter.getCodeValue("122", retireCode);
        return ConcurrentHashMapCache.getCache("122"+"-"+retireCode);
    }

    @Named("personTypeCodeToValue")
    default String personTypeCodeToValue(String personTypeCode) {
        //return SystemCodeConverter.getCodeValue("161", personTypeCode);
        return ConcurrentHashMapCache.getCache("161"+"-"+personTypeCode);
    }

    @Named("leadershipLevelCodeToValue")
    default String leadershipLevelCodeToValue(String leadershipLevelCode) {
        //return SystemCodeConverter.getCodeValue("9", leadershipLevelCode);
        return ConcurrentHashMapCache.getCache("9"+"-"+leadershipLevelCode);
    }

    @Named("personStatusCodeToValue")
    default String personStatusCodeToValue(String personStatusCode) {
        //return SystemCodeConverter.getCodeValue("101", personStatusCode);
        return ConcurrentHashMapCache.getCache("101"+"-"+personStatusCode);
    }

    @Named("personManageCategoryCodeToValue")
    default String personManageCategoryCodeToValue(String personManageCategoryCode) {
        //return SystemCodeConverter.getCodeValue("162", personManageCategoryCode);
        return ConcurrentHashMapCache.getCache("162" + "-" + personManageCategoryCode);
    }

    @Named("grassrootsWorkCodeToValue")
    default String grassrootsWorkCodeToValue(String grassrootsWorkCode) {
        //return SystemCodeConverter.getCodeValue("122", grassrootsWorkCode);
        return ConcurrentHashMapCache.getCache("122"+"-"+grassrootsWorkCode);
    }

}
