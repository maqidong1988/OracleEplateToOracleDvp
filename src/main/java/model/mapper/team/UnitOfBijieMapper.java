package model.mapper.team;

import model.from.DepB001;
import model.to.teamdb.UnitOfBijie;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 * Created by Jay on 2018/1/16.
 *
 * @author Jay
 * @version 1.0
 * @since 1.0
 * Copyright (C) 2017. SinoSoft All Rights Received
 */
@Mapper
public interface UnitOfBijieMapper {
    @Mappings({
            @Mapping(source = "depId", target = "id"),
            @Mapping(source = "lastUpdatedStamp", target = "storeTimeFromEplatform")
    })
    UnitOfBijie depB001ToUnitOfBijie(DepB001 depB001);
}
