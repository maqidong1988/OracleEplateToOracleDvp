package model.mapper.cadredb;

import model.from.EmpA08;
import model.to.cadredb.CadreInfoEducation;
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
public interface CadreInfoEducationMapper {

    @Mappings({
            @Mapping(source = "subId", target = "id"),
            @Mapping(source = "empId", target = "cadreId"),
            @Mapping(source = "a08002A", target = "educationName"),
            @Mapping(source = "a08002B", target = "educationCode"),
            @Mapping(source = "a08002B", target = "educationCodeValue", qualifiedByName = "educationCodeToValue"),
            @Mapping(source = "a08015", target = "className"),
            @Mapping(source = "a08016", target = "collegeName"),
            @Mapping(source = "a08004", target = "startEducationTime"),
            @Mapping(source = "a08006", target = "diplomaNumber"),
            @Mapping(source = "a08007", target = "endEducationTime"),
            @Mapping(source = "a08011", target = "educationYear"),
            @Mapping(source = "a08014", target = "schoolName"),
            @Mapping(source = "a08020", target = "educationType"),
            @Mapping(source = "a08020", target = "educationTypeValue", qualifiedByName = "educationTypeCodeToValue"),
            @Mapping(source = "a08021", target = "educationFrom"),
            @Mapping(source = "a08021", target = "educationFromValue", qualifiedByName = "educationFromCodeToValue"),
            @Mapping(source = "a08024", target = "majorName"),
            @Mapping(source = "a08027", target = "majorType"),
            @Mapping(source = "a08027", target = "majorTypeValue", qualifiedByName = "majorTypeCodeToValue"),
            @Mapping(source = "a08031", target = "educationStatus"),
            @Mapping(source = "a08031", target = "educationStatusValue", qualifiedByName = "educationStatusCodeToValue"),
            @Mapping(source = "a08034", target = "highestEducation"),
            @Mapping(source = "a08034", target = "highestEducationValue", qualifiedByName = "highestEducationCodeToValue"),
    })
    CadreInfoEducation empA08ToCadreInfoEducation(EmpA08 empA08);

    @Named("educationCodeToValue")
    default String educationCodeToValue(String code) {
        //return SystemCodeConverter.getCodeValue("7", code);
        return ConcurrentHashMapCache.getCache("7"+"-"+code);
    }

    @Named("educationTypeCodeToValue")
    default String educationTypeCodeToValue(String code) {
        //return SystemCodeConverter.getCodeValue("74", code);
        return ConcurrentHashMapCache.getCache("74"+"-"+code);
    }

    @Named("educationFromCodeToValue")
    default String educationFromCodeToValue(String code) {
        //return SystemCodeConverter.getCodeValue("94", code);
        return ConcurrentHashMapCache.getCache("94"+"-"+code);
    }

    @Named("majorTypeCodeToValue")
    default String majorTypeCodeToValue(String code) {
        //return SystemCodeConverter.getCodeValue("12", code);
        return ConcurrentHashMapCache.getCache("12"+"-"+code);
    }

    @Named("educationStatusCodeToValue")
    default String educationStatusCodeToValue(String code) {
        //return SystemCodeConverter.getCodeValue("136", code);
        return ConcurrentHashMapCache.getCache("136"+"-"+code);
    }

    @Named("highestEducationCodeToValue")
    default String highestEducationCodeToValue(String code) {
        //return SystemCodeConverter.getCodeValue("122", code);
        return ConcurrentHashMapCache.getCache("122"+"-"+code);
    }

}
