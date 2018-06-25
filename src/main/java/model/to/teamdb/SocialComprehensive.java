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
@Table(name = "SOCIAL_COMPREHENSIVE", catalog = "")
public class SocialComprehensive {
    private String id;
    private Long majorCaseDetectionRate;
    private Integer petitionCaseCracked;
    private Integer recordYears;
    private Long safetySatisfaction;
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
    @Column(name = "MAJOR_CASE_DETECTION_RATE", nullable = true, precision = 1)
    public Long getMajorCaseDetectionRate() {
        return majorCaseDetectionRate;
    }

    public void setMajorCaseDetectionRate(Long majorCaseDetectionRate) {
        this.majorCaseDetectionRate = majorCaseDetectionRate;
    }

    @Basic
    @Column(name = "PETITION_CASE_CRACKED", nullable = true, precision = 0)
    public Integer getPetitionCaseCracked() {
        return petitionCaseCracked;
    }

    public void setPetitionCaseCracked(Integer petitionCaseCracked) {
        this.petitionCaseCracked = petitionCaseCracked;
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
    @Column(name = "SAFETY_SATISFACTION", nullable = true, precision = 1)
    public Long getSafetySatisfaction() {
        return safetySatisfaction;
    }

    public void setSafetySatisfaction(Long safetySatisfaction) {
        this.safetySatisfaction = safetySatisfaction;
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

        SocialComprehensive that = (SocialComprehensive) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (majorCaseDetectionRate != null ? !majorCaseDetectionRate.equals(that.majorCaseDetectionRate) : that.majorCaseDetectionRate != null)
            return false;
        if (petitionCaseCracked != null ? !petitionCaseCracked.equals(that.petitionCaseCracked) : that.petitionCaseCracked != null)
            return false;
        if (recordYears != null ? !recordYears.equals(that.recordYears) : that.recordYears != null) return false;
        if (safetySatisfaction != null ? !safetySatisfaction.equals(that.safetySatisfaction) : that.safetySatisfaction != null)
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
        result = 31 * result + (majorCaseDetectionRate != null ? majorCaseDetectionRate.hashCode() : 0);
        result = 31 * result + (petitionCaseCracked != null ? petitionCaseCracked.hashCode() : 0);
        result = 31 * result + (recordYears != null ? recordYears.hashCode() : 0);
        result = 31 * result + (safetySatisfaction != null ? safetySatisfaction.hashCode() : 0);
        result = 31 * result + (leadershipOverviewId != null ? leadershipOverviewId.hashCode() : 0);
        result = 31 * result + (storeTimeFromEplatform != null ? storeTimeFromEplatform.hashCode() : 0);
        return result;
    }
}
