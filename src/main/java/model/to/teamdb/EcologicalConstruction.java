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
@Table(name = "ECOLOGICAL_CONSTRUCTION", catalog = "")
public class EcologicalConstruction {
    private String id;
    private Long forestCoverRate;
    private Integer modelVillage;
    private Long otherIndustry;
    private Long potatoIndustry;
    private Integer recordYears;
    private Long teaIndustry;
    private Integer universalVillage;
    private Long vegetableBaseIndustry;
    private Integer welloffVillage;
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
    @Column(name = "FOREST_COVER_RATE", nullable = true, precision = 1)
    public Long getForestCoverRate() {
        return forestCoverRate;
    }

    public void setForestCoverRate(Long forestCoverRate) {
        this.forestCoverRate = forestCoverRate;
    }

    @Basic
    @Column(name = "MODEL_VILLAGE", nullable = true, precision = 0)
    public Integer getModelVillage() {
        return modelVillage;
    }

    public void setModelVillage(Integer modelVillage) {
        this.modelVillage = modelVillage;
    }

    @Basic
    @Column(name = "OTHER_INDUSTRY", nullable = true, precision = 2)
    public Long getOtherIndustry() {
        return otherIndustry;
    }

    public void setOtherIndustry(Long otherIndustry) {
        this.otherIndustry = otherIndustry;
    }

    @Basic
    @Column(name = "POTATO_INDUSTRY", nullable = true, precision = 2)
    public Long getPotatoIndustry() {
        return potatoIndustry;
    }

    public void setPotatoIndustry(Long potatoIndustry) {
        this.potatoIndustry = potatoIndustry;
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
    @Column(name = "TEA_INDUSTRY", nullable = true, precision = 2)
    public Long getTeaIndustry() {
        return teaIndustry;
    }

    public void setTeaIndustry(Long teaIndustry) {
        this.teaIndustry = teaIndustry;
    }

    @Basic
    @Column(name = "UNIVERSAL_VILLAGE", nullable = true, precision = 0)
    public Integer getUniversalVillage() {
        return universalVillage;
    }

    public void setUniversalVillage(Integer universalVillage) {
        this.universalVillage = universalVillage;
    }

    @Basic
    @Column(name = "VEGETABLE_BASE_INDUSTRY", nullable = true, precision = 2)
    public Long getVegetableBaseIndustry() {
        return vegetableBaseIndustry;
    }

    public void setVegetableBaseIndustry(Long vegetableBaseIndustry) {
        this.vegetableBaseIndustry = vegetableBaseIndustry;
    }

    @Basic
    @Column(name = "WELLOFF_VILLAGE", nullable = true, precision = 0)
    public Integer getWelloffVillage() {
        return welloffVillage;
    }

    public void setWelloffVillage(Integer welloffVillage) {
        this.welloffVillage = welloffVillage;
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

        EcologicalConstruction that = (EcologicalConstruction) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (forestCoverRate != null ? !forestCoverRate.equals(that.forestCoverRate) : that.forestCoverRate != null)
            return false;
        if (modelVillage != null ? !modelVillage.equals(that.modelVillage) : that.modelVillage != null) return false;
        if (otherIndustry != null ? !otherIndustry.equals(that.otherIndustry) : that.otherIndustry != null)
            return false;
        if (potatoIndustry != null ? !potatoIndustry.equals(that.potatoIndustry) : that.potatoIndustry != null)
            return false;
        if (recordYears != null ? !recordYears.equals(that.recordYears) : that.recordYears != null) return false;
        if (teaIndustry != null ? !teaIndustry.equals(that.teaIndustry) : that.teaIndustry != null) return false;
        if (universalVillage != null ? !universalVillage.equals(that.universalVillage) : that.universalVillage != null)
            return false;
        if (vegetableBaseIndustry != null ? !vegetableBaseIndustry.equals(that.vegetableBaseIndustry) : that.vegetableBaseIndustry != null)
            return false;
        if (welloffVillage != null ? !welloffVillage.equals(that.welloffVillage) : that.welloffVillage != null)
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
        result = 31 * result + (forestCoverRate != null ? forestCoverRate.hashCode() : 0);
        result = 31 * result + (modelVillage != null ? modelVillage.hashCode() : 0);
        result = 31 * result + (otherIndustry != null ? otherIndustry.hashCode() : 0);
        result = 31 * result + (potatoIndustry != null ? potatoIndustry.hashCode() : 0);
        result = 31 * result + (recordYears != null ? recordYears.hashCode() : 0);
        result = 31 * result + (teaIndustry != null ? teaIndustry.hashCode() : 0);
        result = 31 * result + (universalVillage != null ? universalVillage.hashCode() : 0);
        result = 31 * result + (vegetableBaseIndustry != null ? vegetableBaseIndustry.hashCode() : 0);
        result = 31 * result + (welloffVillage != null ? welloffVillage.hashCode() : 0);
        result = 31 * result + (leadershipOverviewId != null ? leadershipOverviewId.hashCode() : 0);
        result = 31 * result + (storeTimeFromEplatform != null ? storeTimeFromEplatform.hashCode() : 0);
        return result;
    }
}
