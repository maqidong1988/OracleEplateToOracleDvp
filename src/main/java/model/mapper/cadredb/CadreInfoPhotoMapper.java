package model.mapper.cadredb;

import model.from.EmpPhoto;
import model.to.cadredb.CadreInfoPhoto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Named;

/**
 * Created by rain chen on 2017/11/23.
 *
 * @author rain chen
 * @version 1.0
 * @since 1.0
 * Copyright (C) 2017. SinoSoft All Rights Received
 */
@Mapper
public interface CadreInfoPhotoMapper {

    @Mappings({
            @Mapping(source = "subId", target = "id"),
            @Mapping(source = "empId", target = "cadreId"),
            @Mapping(source = "filePath", target = "filePath"),
            @Mapping(source = "status", target = "fileStatus"),
            //@Mapping(source = "photoFile", target = "photoFile"),
            @Mapping(source = "photoUuid", target = "photoUuid"),
            @Mapping(source = "lastUpdatedStamp" ,target = "storeTimeFromEplatform")
    })
    CadreInfoPhoto empPhotoToCadreInfoPhoto(EmpPhoto empPhoto);

}
