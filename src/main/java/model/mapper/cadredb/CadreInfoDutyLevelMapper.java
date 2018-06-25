package model.mapper.cadredb;
import model.from.EmpA05;
import model.to.cadredb.CadreInfoDutyLevel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 * Created by Jay on 2017/11/29.
 *
 * @author Jay
 * @version 1.0
 * @since 1.0
 * Copyright (C) 2017. SinoSoft All Rights Received
 */
@Mapper
public interface CadreInfoDutyLevelMapper {

    @Mappings({
            @Mapping(source = "subId", target = "id"),
            @Mapping(source = "empId", target = "cadreId"),
            @Mapping(source = "a05002A", target = "rankName"),
            @Mapping(source = "a05002B", target = "rankCode"),
            @Mapping(source = "a05024", target = "currentRankMark"),
    })
    CadreInfoDutyLevel empA05ToCadreInfoDutyLevel(EmpA05 empA095);
}

