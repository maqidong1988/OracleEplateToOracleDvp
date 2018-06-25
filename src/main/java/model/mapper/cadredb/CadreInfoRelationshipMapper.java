package model.mapper.cadredb;

import model.from.EmpA36;
import model.to.cadredb.CadreInfoRelationship;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 * Created by Jay on 2017/12/5.
 *
 * @author Jay
 * @version 1.0
 * @since 1.0
 * Copyright (C) 2017. SinoSoft All Rights Received
 */
@Mapper
public interface CadreInfoRelationshipMapper {
    @Mappings({
            @Mapping(source = "subId", target = "id"),
            @Mapping(source = "empId", target = "cadreId"),
            @Mapping(source = "a36001", target = "name"),
            @Mapping(source = "a36005A", target = "relationshipName"),
            @Mapping(source = "a36005B", target = "relationshipCode"),
            @Mapping(source = "a36007", target = "birthday"),
            @Mapping(source = "a36011", target = "departmentAndDuty"),
            @Mapping(source = "a36012", target = "gender"),
            @Mapping(source = "a36013", target = "citizenId"),
            @Mapping(source = "a36017", target = "citizenship"),
            @Mapping(source = "a36021", target = "nation"),
            @Mapping(source = "a36025", target = "education"),
            @Mapping(source = "a36027A", target = "politicalStatus"),
            @Mapping(source = "a36027B", target = "politicalStatusCode"),
            @Mapping(source = "a36031", target = "identity"),
            @Mapping(source = "a36032", target = "duty"),
            @Mapping(source = "a36038", target = "rank"),
            @Mapping(source = "a36041", target = "status"),
            @Mapping(source = "a36044", target = "remarks"),
            @Mapping(source = "a36047", target = "serialNumber")
    })
    CadreInfoRelationship empA36ToCadreInfoRelationship(EmpA36 empA36);
}