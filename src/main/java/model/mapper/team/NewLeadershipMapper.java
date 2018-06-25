package model.mapper.team;

import model.from.DepB001;
import model.to.teamdb.LeadershipOverview;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Named;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.util.regex.Pattern.compile;
import static util.SystemCodeConverter.*;


/**
 * Created by Jay on 2018/1/26.
 *
 * @author Jay
 * @version 1.0
 * @since 1.0
 * Copyright (C) 2017. SinoSoft All Rights Received
 */
@Mapper
public interface NewLeadershipMapper {
    @Mappings({
            @Mapping(source = "depId", target = "id"),
            @Mapping(source = "b01001", target = "leadershipName"),
            @Mapping(source = "b001001A", target = "administrativeDivisionsCode", qualifiedByName = "getDivisionCode"),
            @Mapping(source = "b001001A", target = "administrativeDivisions", qualifiedByName = "getDivisionName"),
            @Mapping(source = "b01031", target = "nature", qualifiedByName = "getNature"),
            @Mapping(source = "b01031", target = "natureCode"),
            @Mapping(source = "b01025", target = "affiliation", qualifiedByName = "getAffiliation"),
            @Mapping(source = "b01025", target = "affiliationCode"),
            @Mapping(source = "depId", target = "leadershipAddress", qualifiedByName = "getAddress"),
            @Mapping(source = "depId", target = "teamQuota", qualifiedByName = "defaultQuota")
    })
    LeadershipOverview depB001ToLeadershiOverview(DepB001 depB001);


    @Named("getDivisionCode")
    default String getDivisionCode(String b001001A) {
        if (b001001A == null) {
            return null;
        }
        if (b001001A.startsWith("001.019.001.")) {
            return DIVISION_CODE.get("001.019.001");
        }
        if (b001001A.startsWith("001.019.726.")) {
            return DIVISION_CODE.get("001.019.726");
        }
        if (b001001A.startsWith("001.019.410.")) {
            return DIVISION_CODE.get("001.019.410");
        }
        if (b001001A.startsWith("001.019.929.")) {
            return DIVISION_CODE.get("001.019.929");
        }
        if (b001001A.startsWith("001.019.114.")) {
            return DIVISION_CODE.get("001.019.114");
        }
        if (b001001A.startsWith("001.019.276.")) {
            return DIVISION_CODE.get("001.019.276");
        }
        if (b001001A.startsWith("001.019.005.")) {
            return DIVISION_CODE.get("001.019.005");
        }
        if (b001001A.startsWith("001.019.430.")) {
            return DIVISION_CODE.get("001.019.430");
        }
        return "520500";
    }

    @Named("getDivisionName")
    default String getDivisionName(String b001001A) {
        if (b001001A == null) {
            return null;
        }
        if (b001001A.startsWith("001.019.001.")) {
            return DIVISION_NAME.get("001.019.001");
        }
        if (b001001A.startsWith("001.019.726.")) {
            return DIVISION_NAME.get("001.019.726");
        }
        if (b001001A.startsWith("001.019.410.")) {
            return DIVISION_NAME.get("001.019.410");
        }
        if (b001001A.startsWith("001.019.929.")) {
            return DIVISION_NAME.get("001.019.929");
        }
        if (b001001A.startsWith("001.019.114.")) {
            return DIVISION_NAME.get("001.019.114");
        }
        if (b001001A.startsWith("001.019.276.")) {
            return DIVISION_NAME.get("001.019.276");
        }
        if (b001001A.startsWith("001.019.005.")) {
            return DIVISION_NAME.get("001.019.005");
        }
        if (b001001A.startsWith("001.019.430.")) {
            return DIVISION_NAME.get("001.019.430");
        }
        return "贵州毕节";
    }

    @Named("getNature")
    default String getNature(String b01031) {
        Pattern pattern = compile("[0-9]*");
        if (b01031 != null) {
            Matcher isNum = pattern.matcher(b01031);
            if (isNum.matches()) {
                return getCodeValue("86", b01031);
            }
        }
        return null;
    }

    @Named("getAffiliation")
    default String getAffiliation(String b01025) {
        Pattern pattern = compile("[0-9]*");
        if (b01025 != null) {
            Matcher isNum = pattern.matcher(b01025);
            if (isNum.matches()) {
                return getCodeValue("9", b01025);
            }
        }
        return null;
    }

    @Named("getAddress")
    default String getAddress(String depId) {
        return getAddressByDepId(depId);
    }

    @Named("defaultQuota")
    default Long getQuota(String depId) {
        return 10L;
    }
}
