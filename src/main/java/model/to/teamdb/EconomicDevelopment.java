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
@Table(name = "ECONOMIC_DEVELOPMENT", catalog = "")
public class EconomicDevelopment {
    private String id;
    private Long fiscalRevenue;
    private Long fixedAssets;
    private Long gdp;
    private Long investment;
    private Integer recordYears;
    private Long residenceIncome;
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
    @Column(name = "FISCAL_REVENUE", nullable = true, precision = 4)
    public Long getFiscalRevenue() {
        return fiscalRevenue;
    }

    public void setFiscalRevenue(Long fiscalRevenue) {
        this.fiscalRevenue = fiscalRevenue;
    }

    @Basic
    @Column(name = "FIXED_ASSETS", nullable = true, precision = 4)
    public Long getFixedAssets() {
        return fixedAssets;
    }

    public void setFixedAssets(Long fixedAssets) {
        this.fixedAssets = fixedAssets;
    }

    @Basic
    @Column(name = "GDP", nullable = true, precision = 4)
    public Long getGdp() {
        return gdp;
    }

    public void setGdp(Long gdp) {
        this.gdp = gdp;
    }

    @Basic
    @Column(name = "INVESTMENT", nullable = true, precision = 4)
    public Long getInvestment() {
        return investment;
    }

    public void setInvestment(Long investment) {
        this.investment = investment;
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
    @Column(name = "RESIDENCE_INCOME", nullable = true, precision = 4)
    public Long getResidenceIncome() {
        return residenceIncome;
    }

    public void setResidenceIncome(Long residenceIncome) {
        this.residenceIncome = residenceIncome;
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

        EconomicDevelopment that = (EconomicDevelopment) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (fiscalRevenue != null ? !fiscalRevenue.equals(that.fiscalRevenue) : that.fiscalRevenue != null)
            return false;
        if (fixedAssets != null ? !fixedAssets.equals(that.fixedAssets) : that.fixedAssets != null) return false;
        if (gdp != null ? !gdp.equals(that.gdp) : that.gdp != null) return false;
        if (investment != null ? !investment.equals(that.investment) : that.investment != null) return false;
        if (recordYears != null ? !recordYears.equals(that.recordYears) : that.recordYears != null) return false;
        if (residenceIncome != null ? !residenceIncome.equals(that.residenceIncome) : that.residenceIncome != null)
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
        result = 31 * result + (fiscalRevenue != null ? fiscalRevenue.hashCode() : 0);
        result = 31 * result + (fixedAssets != null ? fixedAssets.hashCode() : 0);
        result = 31 * result + (gdp != null ? gdp.hashCode() : 0);
        result = 31 * result + (investment != null ? investment.hashCode() : 0);
        result = 31 * result + (recordYears != null ? recordYears.hashCode() : 0);
        result = 31 * result + (residenceIncome != null ? residenceIncome.hashCode() : 0);
        result = 31 * result + (leadershipOverviewId != null ? leadershipOverviewId.hashCode() : 0);
        result = 31 * result + (storeTimeFromEplatform != null ? storeTimeFromEplatform.hashCode() : 0);
        return result;
    }
}
