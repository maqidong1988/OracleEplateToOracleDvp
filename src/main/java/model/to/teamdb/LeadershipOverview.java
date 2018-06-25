package model.to.teamdb;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Jay on 2018/1/23.
 *
 * @author Jay
 * @version 1.0
 * @since 1.0
 * Copyright (C) 2017. SinoSoft All Rights Received
 */
@Entity
@Table(name = "LEADERSHIP_OVERVIEW", catalog = "")
public class LeadershipOverview {
    private String id;
    private String administrativeDivisions;
    private String administrativeDivisionsCode;
    private String affiliation;
    private String affiliationCode;
    private String cadreId;
    private String leadershipName;
    private String nature;
    private String natureCode;
    private Long teamQuota;
    private Timestamp storeTimeFromEplatform;
    private String leadershipAddress;
    private String unitCode;

    @Id
    @Column(name = "ID", nullable = false, length = 50)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ADMINISTRATIVE_DIVISIONS", nullable = true, length = 1000)
    public String getAdministrativeDivisions() {
        return administrativeDivisions;
    }

    public void setAdministrativeDivisions(String administrativeDivisions) {
        this.administrativeDivisions = administrativeDivisions;
    }

    @Basic
    @Column(name = "ADMINISTRATIVE_DIVISIONS_CODE", nullable = true, length = 200)
    public String getAdministrativeDivisionsCode() {
        return administrativeDivisionsCode;
    }

    public void setAdministrativeDivisionsCode(String administrativeDivisionsCode) {
        this.administrativeDivisionsCode = administrativeDivisionsCode;
    }

    @Basic
    @Column(name = "AFFILIATION", nullable = true, length = 1000)
    public String getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    @Basic
    @Column(name = "AFFILIATION_CODE", nullable = true, length = 200)
    public String getAffiliationCode() {
        return affiliationCode;
    }

    public void setAffiliationCode(String affiliationCode) {
        this.affiliationCode = affiliationCode;
    }

    @Basic
    @Column(name = "CADRE_ID", nullable = true, length = 50)
    public String getCadreId() {
        return cadreId;
    }

    public void setCadreId(String cadreId) {
        this.cadreId = cadreId;
    }

    @Basic
    @Column(name = "LEADERSHIP_NAME", nullable = true, length = 1000)
    public String getLeadershipName() {
        return leadershipName;
    }

    public void setLeadershipName(String leadershipName) {
        this.leadershipName = leadershipName;
    }

    @Basic
    @Column(name = "NATURE", nullable = true, length = 1000)
    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    @Basic
    @Column(name = "NATURE_CODE", nullable = true, length = 200)
    public String getNatureCode() {
        return natureCode;
    }

    public void setNatureCode(String natureCode) {
        this.natureCode = natureCode;
    }

    @Basic
    @Column(name = "TEAM_QUOTA", nullable = true, precision = 0)
    public Long getTeamQuota() {
        return teamQuota;
    }

    public void setTeamQuota(Long teamQuota) {
        this.teamQuota = teamQuota;
    }

    @Basic
    @Column(name = "STORE_TIME_FROM_EPLATFORM", nullable = true)
    public Timestamp getStoreTimeFromEplatform() {
        return storeTimeFromEplatform;
    }

    public void setStoreTimeFromEplatform(Timestamp storeTimeFromEplatform) {
        this.storeTimeFromEplatform = storeTimeFromEplatform;
    }

    @Basic
    @Column(name = "LEADERSHIP_ADDRESS", nullable = true, length = 160)
    public String getLeadershipAddress() {
        return leadershipAddress;
    }

    public void setLeadershipAddress(String leadershipAddress) {
        this.leadershipAddress = leadershipAddress;
    }

    @Basic
    @Column(name = "UNIT_CODE", nullable = true, length = 160)
    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LeadershipOverview that = (LeadershipOverview) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (administrativeDivisions != null ? !administrativeDivisions.equals(that.administrativeDivisions) : that.administrativeDivisions != null)
            return false;
        if (administrativeDivisionsCode != null ? !administrativeDivisionsCode.equals(that.administrativeDivisionsCode) : that.administrativeDivisionsCode != null)
            return false;
        if (affiliation != null ? !affiliation.equals(that.affiliation) : that.affiliation != null) return false;
        if (affiliationCode != null ? !affiliationCode.equals(that.affiliationCode) : that.affiliationCode != null)
            return false;
        if (cadreId != null ? !cadreId.equals(that.cadreId) : that.cadreId != null) return false;
        if (leadershipName != null ? !leadershipName.equals(that.leadershipName) : that.leadershipName != null)
            return false;
        if (nature != null ? !nature.equals(that.nature) : that.nature != null) return false;
        if (natureCode != null ? !natureCode.equals(that.natureCode) : that.natureCode != null) return false;
        if (teamQuota != null ? !teamQuota.equals(that.teamQuota) : that.teamQuota != null) return false;
        if (storeTimeFromEplatform != null ? !storeTimeFromEplatform.equals(that.storeTimeFromEplatform) : that.storeTimeFromEplatform != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (administrativeDivisions != null ? administrativeDivisions.hashCode() : 0);
        result = 31 * result + (administrativeDivisionsCode != null ? administrativeDivisionsCode.hashCode() : 0);
        result = 31 * result + (affiliation != null ? affiliation.hashCode() : 0);
        result = 31 * result + (affiliationCode != null ? affiliationCode.hashCode() : 0);
        result = 31 * result + (cadreId != null ? cadreId.hashCode() : 0);
        result = 31 * result + (leadershipName != null ? leadershipName.hashCode() : 0);
        result = 31 * result + (nature != null ? nature.hashCode() : 0);
        result = 31 * result + (natureCode != null ? natureCode.hashCode() : 0);
        result = 31 * result + (teamQuota != null ? teamQuota.hashCode() : 0);
        result = 31 * result + (storeTimeFromEplatform != null ? storeTimeFromEplatform.hashCode() : 0);
        return result;
    }
}
