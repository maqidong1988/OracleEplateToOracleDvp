package model.mapper.cadredb;

import model.to.cadredb.CadreInfo;
import model.to.cadredb.RelationNode;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Named;

import java.util.UUID;

/**
 * Created by Jay on 2018/1/28.
 *
 * @author Jay
 * @version 1.0
 * @since 1.0
 * Copyright (C) 2017. SinoSoft All Rights Received
 */
@Mapper
public interface RelationNodeMapper {
    @Mappings({
            @Mapping(source = "id", target = "nodeId", qualifiedByName = "getUUID"),
            @Mapping(source = "id", target = "originalId"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "identityNumber", target = "identityNumber"),
            @Mapping(source = "id", target = "nodeType", qualifiedByName = "getNodeType")
    })
    RelationNode empA001ToRelationNode(CadreInfo cadreInfo);

    @Named("getUUID")
    default String getUuid(String id) {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    @Named("getNodeType")
    default String getNodeType(String id) {
        return "干部";
    }
}
