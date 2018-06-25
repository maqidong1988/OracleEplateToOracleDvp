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
@Table(name = "POVERTY_ALLEVIATION_WORK", catalog = "")
public class PovertyAlleviationWork {
    private String id;
    private Long peopleOutOfPoverty;
    private Integer perCapitaIncome;
    private Integer poorTown;
    private Integer poorVillage;
    private Long povertyAlleviationRelocation;
    private Integer recordYears;
    private Long revenueGrowth;
    private String leadershipOverviewId;
    private Timestamp storeTimeFromEplatform;

    @Id
    @Column(name = "ID", nullable = false, length = 36)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "PEOPLE_OUT_OF_POVERTY", nullable = true, precision = 4)
    public Long getPeopleOutOfPoverty() {
        return peopleOutOfPoverty;
    }

    public void setPeopleOutOfPoverty(Long peopleOutOfPoverty) {
        this.peopleOutOfPoverty = peopleOutOfPoverty;
    }

    @Basic
    @Column(name = "PER_CAPITA_INCOME", nullable = true, precision = 0)
    public Integer getPerCapitaIncome() {
        return perCapitaIncome;
    }

    public void setPerCapitaIncome(Integer perCapitaIncome) {
        this.perCapitaIncome = perCapitaIncome;
    }

    @Basic
    @Column(name = "POOR_TOWN", nullable = true, precision = 0)
    public Integer getPoorTown() {
        return poorTown;
    }

    public void setPoorTown(Integer poorTown) {
        this.poorTown = poorTown;
    }

    @Basic
    @Column(name = "POOR_VILLAGE", nullable = true, precision = 0)
    public Integer getPoorVillage() {
        return poorVillage;
    }

    public void setPoorVillage(Integer poorVillage) {
        this.poorVillage = poorVillage;
    }

    @Basic
    @Column(name = "POVERTY_ALLEVIATION_RELOCATION", nullable = true, precision = 4)
    public Long getPovertyAlleviationRelocation() {
        return povertyAlleviationRelocation;
    }

    public void setPovertyAlleviationRelocation(Long povertyAlleviationRelocation) {
        this.povertyAlleviationRelocation = povertyAlleviationRelocation;
    }

    @Basic
    @Column(name = "RECORD_YEARS", nullable = true, precision = 0)
    public Integer getRecordYears() {
        return recordYears;
    }

    public void setRecordYears(Integer recordYears) {
        this.recordYears = recordYears;
    }

    @Basic
    @Column(name = "REVENUE_GROWTH", nullable = true, precision = 2)
    public Long getRevenueGrowth() {
        return revenueGrowth;
    }

    public void setRevenueGrowth(Long revenueGrowth) {
        this.revenueGrowth = revenueGrowth;
    }

    @Basic
    @Column(name = "LEADERSHIP_OVERVIEW_ID", nullable = true, length = 36)
    public String getLeadershipOverviewId() {
        return leadershipOverviewId;
    }

    public void setLeadershipOverviewId(String leadershipOverviewId) {
        this.leadershipOverviewId = leadershipOverviewId;
    }

    @Basic
    @Column(name = "STORE_TIME_FROM_EPLATFORM", nullable = true)
    public Timestamp getStoreTimeFromEplatform() {
        return storeTimeFromEplatform;
    }

    public void setStoreTimeFromEplatform(Timestamp storeTimeFromEplatform) {
        this.storeTimeFromEplatform = storeTimeFromEplatform;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PovertyAlleviationWork that = (PovertyAlleviationWork) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (peopleOutOfPoverty != null ? !peopleOutOfPoverty.equals(that.peopleOutOfPoverty) : that.peopleOutOfPoverty != null)
            return false;
        if (perCapitaIncome != null ? !perCapitaIncome.equals(that.perCapitaIncome) : that.perCapitaIncome != null)
            return false;
        if (poorTown != null ? !poorTown.equals(that.poorTown) : that.poorTown != null) return false;
        if (poorVillage != null ? !poorVillage.equals(that.poorVillage) : that.poorVillage != null) return false;
        if (povertyAlleviationRelocation != null ? !povertyAlleviationRelocation.equals(that.povertyAlleviationRelocation) : that.povertyAlleviationRelocation != null)
            return false;
        if (recordYears != null ? !recordYears.equals(that.recordYears) : that.recordYears != null) return false;
        if (revenueGrowth != null ? !revenueGrowth.equals(that.revenueGrowth) : that.revenueGrowth != null)
            return false;
        if (leadershipOverviewId != null ? !leadershipOverviewId.equals(that.leadershipOverviewId) : that.leadershipOverviewId != null)
            return false;
        if (storeTimeFromEplatform != null ? !storeTimeFromEplatform.equals(that.storeTimeFromEplatform) : that.storeTimeFromEplatform != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (peopleOutOfPoverty != null ? peopleOutOfPoverty.hashCode() : 0);
        result = 31 * result + (perCapitaIncome != null ? perCapitaIncome.hashCode() : 0);
        result = 31 * result + (poorTown != null ? poorTown.hashCode() : 0);
        result = 31 * result + (poorVillage != null ? poorVillage.hashCode() : 0);
        result = 31 * result + (povertyAlleviationRelocation != null ? povertyAlleviationRelocation.hashCode() : 0);
        result = 31 * result + (recordYears != null ? recordYears.hashCode() : 0);
        result = 31 * result + (revenueGrowth != null ? revenueGrowth.hashCode() : 0);
        result = 31 * result + (leadershipOverviewId != null ? leadershipOverviewId.hashCode() : 0);
        result = 31 * result + (storeTimeFromEplatform != null ? storeTimeFromEplatform.hashCode() : 0);
        return result;
    }
}
