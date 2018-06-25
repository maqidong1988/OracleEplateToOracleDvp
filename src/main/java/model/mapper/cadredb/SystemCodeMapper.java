package model.mapper.cadredb;

import model.from.SystemCodeItem;
import model.to.cadredb.SystemCode;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Named;

import java.util.UUID;

/**
 * Created by rain chen on 2017/11/20.
 *
 * @author rain chen
 * @version 1.0
 * @since 1.0
 * Copyright (C) 2017. SinoSoft All Rights Received
 */
@Mapper
public interface SystemCodeMapper {

    @Mappings({
            @Mapping(source = "cn",target = "id", qualifiedByName = "getUUID"),
            @Mapping(source = "codeType", target = "codeType"),
            @Mapping(source = "code", target = "code"),
            @Mapping(source = "description", target = "description"),
            @Mapping(source = "memo", target = "memo"),
            @Mapping(source = "pptr", target = "pptr"),
    })
    SystemCode fromCodeToSystemCode(SystemCodeItem systemCodeItem);

    @Named("getUUID")
    default String getUUID(String cn) {
        return UUID.randomUUID().toString();
    }
}
