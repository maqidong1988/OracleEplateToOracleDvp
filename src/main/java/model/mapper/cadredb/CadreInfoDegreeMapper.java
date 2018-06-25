package model.mapper.cadredb;

import model.from.EmpA09;
import model.to.cadredb.CadreInfoDegree;
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
public interface CadreInfoDegreeMapper {

    @Mappings({
            @Mapping(source = "subId", target = "id"),
            @Mapping(source = "empId", target = "cadreId"),
            @Mapping(source = "a09001A", target = "degreeName"),
            @Mapping(source = "a09001B", target = "degreeCode"),
            @Mapping(source = "a09001B", target = "degreeCodeValue", qualifiedByName = "degreeCodeToValue"),
            @Mapping(source = "a09004", target = "degreeGrantDate"),
            @Mapping(source = "a09007", target = "degreeGrantDepartment"),
            @Mapping(source = "a09014", target = "highestEducation"),
            @Mapping(source = "a09014", target = "highestEducationValue", qualifiedByName = "highestEducationCodeToValue"),
            @Mapping(source = "a09043", target = "degreeNumber"),
            @Mapping(source = "a09061", target = "secondDegree"),
            @Mapping(source = "a09061", target = "secondDegreeValue", qualifiedByName = "degreeCodeToValue")
    })
    CadreInfoDegree empA09ToCadreInfoDegree(EmpA09 empA09);

    @Named("degreeCodeToValue")
    default String degreeCodeToValue(String code) {
        //return SystemCodeConverter.getCodeValue("5", code);
        return ConcurrentHashMapCache.getCache("5"+"-"+code);
    }

    @Named("highestEducationCodeToValue")
    default String highestEducationCodeToValue(String code) {
        //return SystemCodeConverter.getCodeValue("122", code);
        return ConcurrentHashMapCache.getCache("122"+"-"+code);
    }
}
