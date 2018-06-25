package model.mapper.cadredb;

import model.from.EmpA58;
import model.to.cadredb.CadreInfoPoliticalVisage;
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
public interface CadreInfoPoliticalVisageMapper {

    @Mappings({
            @Mapping(source = "empId", target = "cadreId"),
            @Mapping(source = "subId", target = "id"),
            @Mapping(source = "a58001A", target = "politicalVisageName"),
            @Mapping(source = "a58001A", target = "isCpcMember",qualifiedByName = "isCpcMember"),
            @Mapping(source = "a58001B", target = "politicalVisageCode"),
            @Mapping(source = "a58001B", target = "politicalVisageCodeValue", qualifiedByName = "politicalVisageCodeToValue"),
            @Mapping(source = "a58005", target = "partyDate"),
            @Mapping(source = "a58030", target = "politicalVisageChanges"),
            @Mapping(source = "a58030", target = "politicalVisageChangesValue", qualifiedByName = "politicalVisageChangesCodeToValue"),
            @Mapping(source = "a58035", target = "politicalVisageReason"),
    })
    CadreInfoPoliticalVisage empA58ToCadreInfoPoliticalVisage(EmpA58 empA58);

    @Named("politicalVisageCodeToValue")
    default String politicalVisageCodeToValue(String code) {
        //return SystemCodeConverter.getCodeValue("22", code);
        return ConcurrentHashMapCache.getCache("22-"+code);
    }

    @Named("politicalVisageChangesCodeToValue")
    default String politicalVisageChangesCodeToValue(String code) {
        //return SystemCodeConverter.getCodeValue("91", code);
        return ConcurrentHashMapCache.getCache("91-"+code);
    }

    @Named("isCpcMember")
    default String isCpcMember(String name) {
        return "中共党员".equals(name) ? "1" : "0";
    }
}
