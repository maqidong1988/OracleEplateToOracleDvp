package model.mapper.team;

import model.to.cadredb.CadreInfoExperience;
import model.to.teamdb.CadreTeam;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Named;

import java.util.UUID;

/**
 * Created by Jay on 2017/12/3.
 *
 * @author Jay
 * @version 1.0
 * @since 1.0
 * Copyright (C) 2017. SinoSoft All Rights Received
 */
@Mapper
public interface CadreTeamMapper {
    @Mappings({
            @Mapping(source = "id", target = "id", qualifiedByName = "getUUID"),
            @Mapping(source = "cadreId", target = "cadreId"),
            @Mapping(source = "organizationName", target = "teamName"),
            @Mapping(source = "divisionCode", target = "administrativeDivisionsCode"),
            @Mapping(source = "divisionCodeValue", target = "administrativeDivisions"),
            @Mapping(source = "divisionTypeValue", target = "nature"),
            @Mapping(source = "divisionType", target = "natureCode"),
            @Mapping(source = "affiliationValue", target = "affiliation"),
            @Mapping(source = "affiliation", target = "affiliationCode")
    })
    CadreTeam cadreInfoExperienceToCadreTeam(CadreInfoExperience cadreInfoExperience);

    @Named("getUUID")
    default String getUUId(String id) {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
