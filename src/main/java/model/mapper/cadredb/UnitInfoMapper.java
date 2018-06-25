package model.mapper.cadredb;

import model.from.DepB001;
import model.to.cadredb.UnitInfo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface UnitInfoMapper {
    @Mappings({
            @Mapping(source = "depId", target = "id"),
            @Mapping(source = "b01001", target = "unitName"),
            @Mapping(source = "code", target = "code" ),
            @Mapping(source = "pptr", target = "pptr" ),
            @Mapping(source = "lastModifiedTime", target = "createDateTime")
    })
    UnitInfo depB001ToUnitInfo(DepB001 depB001);

}
