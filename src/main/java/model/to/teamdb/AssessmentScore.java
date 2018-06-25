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
@Table(name = "ASSESSMENT_SCORE")
public class AssessmentScore {
    private String id;
    private Long annualWorkObjectivesScore;
    private Long democraticEvaluationScore;
    private Long dynamicTrackingScore;
    private Integer particularYear;
    private Integer rank;
    private Long socialRecognitionScore;
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
    @Column(name = "ANNUAL_WORK_OBJECTIVES_SCORE", nullable = true, precision = 2)
    public Long getAnnualWorkObjectivesScore() {
        return annualWorkObjectivesScore;
    }

    public void setAnnualWorkObjectivesScore(Long annualWorkObjectivesScore) {
        this.annualWorkObjectivesScore = annualWorkObjectivesScore;
    }

    @Basic
    @Column(name = "DEMOCRATIC_EVALUATION_SCORE", nullable = true, precision = 2)
    public Long getDemocraticEvaluationScore() {
        return democraticEvaluationScore;
    }

    public void setDemocraticEvaluationScore(Long democraticEvaluationScore) {
        this.democraticEvaluationScore = democraticEvaluationScore;
    }

    @Basic
    @Column(name = "DYNAMIC_TRACKING_SCORE", nullable = true, precision = 2)
    public Long getDynamicTrackingScore() {
        return dynamicTrackingScore;
    }

    public void setDynamicTrackingScore(Long dynamicTrackingScore) {
        this.dynamicTrackingScore = dynamicTrackingScore;
    }

    @Basic
    @Column(name = "PARTICULAR_YEAR", nullable = true, precision = 0)
    public Integer getParticularYear() {
        return particularYear;
    }

    public void setParticularYear(Integer particularYear) {
        this.particularYear = particularYear;
    }

    @Basic
    @Column(name = "RANK", nullable = true, precision = 0)
    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    @Basic
    @Column(name = "SOCIAL_RECOGNITION_SCORE", nullable = true, precision = 2)
    public Long getSocialRecognitionScore() {
        return socialRecognitionScore;
    }

    public void setSocialRecognitionScore(Long socialRecognitionScore) {
        this.socialRecognitionScore = socialRecognitionScore;
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

        AssessmentScore that = (AssessmentScore) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (annualWorkObjectivesScore != null ? !annualWorkObjectivesScore.equals(that.annualWorkObjectivesScore) : that.annualWorkObjectivesScore != null)
            return false;
        if (democraticEvaluationScore != null ? !democraticEvaluationScore.equals(that.democraticEvaluationScore) : that.democraticEvaluationScore != null)
            return false;
        if (dynamicTrackingScore != null ? !dynamicTrackingScore.equals(that.dynamicTrackingScore) : that.dynamicTrackingScore != null)
            return false;
        if (particularYear != null ? !particularYear.equals(that.particularYear) : that.particularYear != null)
            return false;
        if (rank != null ? !rank.equals(that.rank) : that.rank != null) return false;
        if (socialRecognitionScore != null ? !socialRecognitionScore.equals(that.socialRecognitionScore) : that.socialRecognitionScore != null)
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
        result = 31 * result + (annualWorkObjectivesScore != null ? annualWorkObjectivesScore.hashCode() : 0);
        result = 31 * result + (democraticEvaluationScore != null ? democraticEvaluationScore.hashCode() : 0);
        result = 31 * result + (dynamicTrackingScore != null ? dynamicTrackingScore.hashCode() : 0);
        result = 31 * result + (particularYear != null ? particularYear.hashCode() : 0);
        result = 31 * result + (rank != null ? rank.hashCode() : 0);
        result = 31 * result + (socialRecognitionScore != null ? socialRecognitionScore.hashCode() : 0);
        result = 31 * result + (leadershipOverviewId != null ? leadershipOverviewId.hashCode() : 0);
        result = 31 * result + (storeTimeFromEplatform != null ? storeTimeFromEplatform.hashCode() : 0);
        return result;
    }
}
