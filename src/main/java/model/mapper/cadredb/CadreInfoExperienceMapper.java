package model.mapper.cadredb;

import model.from.EmpA02;
import model.to.cadredb.CadreInfoExperience;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Named;
import util.ConcurrentHashMapCache;
import util.SystemCodeConverter;

import static util.SystemCodeConverter.getAddressByDepId;

/**
 * Created by rain chen on 2017/11/23.
 *
 * @author rain chen
 * @version 1.0
 * @since 1.0
 * Copyright (C) 2017. SinoSoft All Rights Received
 */
@Mapper
public interface CadreInfoExperienceMapper {

    @Mappings({
            @Mapping(source = "subId", target = "id"),
            @Mapping(source = "empId", target = "cadreId"),
            @Mapping(source = "a02001A", target = "organizationName"),
            @Mapping(source = "a02001B", target = "organizationCode"),
            @Mapping(source = "a02001B", target = "organizationAddress", qualifiedByName = "getAddress"),
            @Mapping(source = "a02003", target = "divisionCode"),
            @Mapping(source = "a02003", target = "divisionCodeValue", qualifiedByName = "divisionCodeToValue"),
            @Mapping(source = "a02004", target = "affiliation"),
            @Mapping(source = "a02004", target = "affiliationValue", qualifiedByName = "affiliationValue"),
            @Mapping(source = "a02006", target = "effectiveDate"),
            @Mapping(source = "a02007", target = "organizationLevel"),
            @Mapping(source = "a02007", target = "organizationLevelValue", qualifiedByName = "organizationLevelCodeToValue"),
            @Mapping(source = "a02008", target = "dutyProperty"),
            @Mapping(source = "a02008", target = "dutyPropertyValue", qualifiedByName = "dutyPropertyCodeToValue"),
            @Mapping(source = "a02009", target = "divisionType"),
            @Mapping(source = "a02009", target = "divisionTypeValue", qualifiedByName = "divisionTypeCodeToValue"),
            @Mapping(source = "a02011", target = "divisionIndustry"),
            @Mapping(source = "a02011", target = "divisionIndustryValue", qualifiedByName = "divisionIndustryCodeToValue"),
            @Mapping(source = "a02016A", target = "dutyName"),
            @Mapping(source = "a02028", target = "jobType"),
            @Mapping(source = "a02028", target = "jobTypeValue", qualifiedByName = "jobTypeCodeToValue"),
            @Mapping(source = "a02016C", target = "dutyShort"),
            @Mapping(source = "a02017", target = "dutyExplain"),
            @Mapping(source = "a02020", target = "positionType"),
            @Mapping(source = "a02020", target = "positionTypeValue", qualifiedByName = "positionTypeCodeToValue"),
            @Mapping(source = "a02023", target = "dutyOrder"),
            @Mapping(source = "a02025", target = "orderInLeadership"),
            @Mapping(source = "a02029", target = "work"),
            @Mapping(source = "a02033", target = "workDomain"),
            @Mapping(source = "a02033", target = "workDomainValue", qualifiedByName = "workDomainCodeToValue"),
            @Mapping(source = "a02043", target = "nominationDate"),
            @Mapping(source = "a02047", target = "assignWay"),
            @Mapping(source = "a02047", target = "assignWayValue", qualifiedByName = "assignWayCodeToValue"),
            @Mapping(source = "a02049", target = "assignReason"),
            @Mapping(source = "a02049", target = "assignReasonValue", qualifiedByName = "assignReasonCodeToValue"),
            @Mapping(source = "a02051", target = "assignChangeType"),
            @Mapping(source = "a02051", target = "assignChangeTypeValue", qualifiedByName = "assignChangeTypeCodeToValue"),
            @Mapping(source = "a02055", target = "assignStatus"),
            @Mapping(source = "a02055", target = "assignStatusValue", qualifiedByName = "assignStatusCodeToValue"),
            @Mapping(source = "a02065", target = "removalDate"),
            @Mapping(source = "a02069", target = "removalWay"),
            @Mapping(source = "a02069", target = "removalWayValue", qualifiedByName = "removalWayCodeToValue"),
            @Mapping(source = "a02071", target = "removalReason"),
            @Mapping(source = "a02071", target = "removalReasonValue", qualifiedByName = "removalReasonCodeToValue"),
            @Mapping(source = "a02075", target = "dutyStatistic"),
            @Mapping(source = "a02075", target = "dutyStatisticValue", qualifiedByName = "dutyStatisticCodeToValue"),
            @Mapping(source = "a02076", target = "demotionReason"),
            @Mapping(source = "a02076", target = "demotionReasonValue", qualifiedByName = "demotionReasonCodeToValue"),
            @Mapping(source = "a02095", target = "partTime"),
            @Mapping(source = "a02097", target = "dutyYears")
    })
    CadreInfoExperience empA02ToCadreInfoExperience(EmpA02 empA02);

    @Named("getAddress")
    default String getAddress(String code) {
        //return getAddressByDepId(code);
        return ConcurrentHashMapCache.getAddressCache(code);
    }

    @Named("divisionCodeToValue")
    default String divisionCodeToValue(String code) {
        //return SystemCodeConverter.getCodeValue("99", code);
        return ConcurrentHashMapCache.getCache("99-"+code);
    }

    @Named("affiliationValue")
    default String affiliationValue(String code) {
        //return SystemCodeConverter.getCodeValue("9", code);
        return ConcurrentHashMapCache.getCache("9-"+code);
    }

    @Named("organizationLevelCodeToValue")
    default String organizationLevelCodeToValue(String code) {
        //return SystemCodeConverter.getCodeValue("166", code);
        return ConcurrentHashMapCache.getCache("166-"+code);
    }

    @Named("dutyPropertyCodeToValue")
    default String dutyPropertyCodeToValue(String code) {
        //return SystemCodeConverter.getCodeValue("137", code);
        return ConcurrentHashMapCache.getCache("137-"+code);
    }

    @Named("divisionTypeCodeToValue")
    default String divisionTypeCodeToValue(String code) {
        //return SystemCodeConverter.getCodeValue("86", code);
        return ConcurrentHashMapCache.getCache("86-"+code);
    }

    @Named("divisionIndustryCodeToValue")
    default String divisionIndustryCodeToValue(String code) {
        //return SystemCodeConverter.getCodeValue("1", code);
        return ConcurrentHashMapCache.getCache("1-"+code);
    }

    @Named("jobTypeCodeToValue")
    default String jobTypeCodeToValue(String code) {
        //return SystemCodeConverter.getCodeValue("161", code);
        return ConcurrentHashMapCache.getCache("161-"+code);
    }

    @Named("positionTypeCodeToValue")
    default String positionTypeCodeToValue(String code) {
        //return SystemCodeConverter.getCodeValue("139", code);
        return ConcurrentHashMapCache.getCache("139-"+code);
    }

    @Named("workDomainCodeToValue")
    default String workDomainCodeToValue(String code) {
        //return SystemCodeConverter.getCodeValue("12", code);
        return ConcurrentHashMapCache.getCache("12-"+code);
    }

    @Named("assignWayCodeToValue")
    default String assignWayCodeToValue(String code) {
        //return SystemCodeConverter.getCodeValue("54", code);
        return ConcurrentHashMapCache.getCache("54-"+code);
    }

    @Named("assignReasonCodeToValue")
    default String assignReasonCodeToValue(String code) {
        //return SystemCodeConverter.getCodeValue("100", code);
        return ConcurrentHashMapCache.getCache("100-"+code);
    }

    @Named("assignChangeTypeCodeToValue")
    default String assignChangeTypeCodeToValue(String code) {
        //return SystemCodeConverter.getCodeValue("81", code);
        return ConcurrentHashMapCache.getCache("81-"+code);
    }

    @Named("assignStatusCodeToValue")
    default String assignStatusCodeToValue(String code) {
        //return SystemCodeConverter.getCodeValue("141", code);
        return ConcurrentHashMapCache.getCache("141-"+code);
    }

    @Named("removalWayCodeToValue")
    default String removalWayCodeToValue(String code) {
        //return SystemCodeConverter.getCodeValue("192", code);
        return ConcurrentHashMapCache.getCache("192-"+code);
    }

    @Named("removalReasonCodeToValue")
    default String removalReasonCodeToValue(String code) {
        //return SystemCodeConverter.getCodeValue("43", code);
        return ConcurrentHashMapCache.getCache("43-"+code);
    }

    @Named("dutyStatisticCodeToValue")
    default String dutyStatisticCodeToValue(String code) {
        //return SystemCodeConverter.getCodeValue("122", code);
        return ConcurrentHashMapCache.getCache("122-"+code);
    }

    @Named("demotionReasonCodeToValue")
    default String demotionReasonCodeToValue(String code) {
        //return SystemCodeConverter.getCodeValue("104", code);
        return ConcurrentHashMapCache.getCache("104-"+code);
    }
}
