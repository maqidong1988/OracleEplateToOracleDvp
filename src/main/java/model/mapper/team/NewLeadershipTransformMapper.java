package model.mapper.team;

import model.to.teamdb.LeadershipOverview;
import model.to.teamdb.LeadershipOverviewTransform;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Named;

import java.util.UUID;

/**
 * Created by Jay on 2018/1/26.
 *
 * @author Jay
 * @version 1.0
 * @since 1.0
 * Copyright (C) 2017. SinoSoft All Rights Received
 */
@Mapper
public interface NewLeadershipTransformMapper {
    @Mappings({
            @Mapping(source = "id", target = "id", qualifiedByName = "getUUID"),
            @Mapping(source = "id", target = "leadershipId"),
            @Mapping(source = "leadershipName", target = "leadershipName"),
            @Mapping(source = "administrativeDivisionsCode", target = "administrativeDivisionsCode"),
            @Mapping(source = "administrativeDivisions", target = "administrativeDivisions"),
            @Mapping(source = "nature", target = "nature"),
            @Mapping(source = "natureCode", target = "natureCode"),
            @Mapping(source = "affiliation", target = "affiliation"),
            @Mapping(source = "affiliationCode", target = "affiliationCode")
    })
    LeadershipOverviewTransform leadershipOverviewToLeadershiOverviewTransform(LeadershipOverview leadershipOverview);


    @Named("getUUID")
    default String getUUId(String id) {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
