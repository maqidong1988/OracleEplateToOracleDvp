package model.mapper.team;

import model.from.B000A001;
import model.to.teamdb.UnitToCadre;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Named;

import java.util.UUID;

/**
 * Created by Jay on 2018/1/23.
 *
 * @author Jay
 * @version 1.0
 * @since 1.0
 * Copyright (C) 2017. SinoSoft All Rights Received
 */
@Mapper
public interface UnitToCadreMapper {
    @Mappings({
            @Mapping(source = "depId",target = "id", qualifiedByName = "getUUID"),
            @Mapping(source = "categoryId", target = "categoryId"),
            @Mapping(source = "depId", target = "depId"),
            @Mapping(source = "empId", target = "empId"),
            @Mapping(source = "levelCode", target = "levelCode"),
            @Mapping(source = "lastUpdatedStamp", target = "storeTimeFromEplatform")
    })
    UnitToCadre b000A001ToUnitToCadre(B000A001 b000A001);

    @Named("getUUID")
    default String getUUID(String depId) {
        return UUID.randomUUID().toString();
    }
}
