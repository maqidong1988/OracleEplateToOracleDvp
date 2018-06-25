package model.to.cadredb;

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
@Table(name = "CADRE_INFO_EVALUATE", catalog = "")
public class CadreInfoEvaluate {
    private String id;
    private Long annualTargetScore;
    private Long compositeScore;
    private Long democraticScore;
    private Long dynamicTrackingScore;
    private Timestamp years;
    private String cadreId;
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
    @Column(name = "ANNUAL_TARGET_SCORE", nullable = true, precision = 2)
    public Long getAnnualTargetScore() {
        return annualTargetScore;
    }

    public void setAnnualTargetScore(Long annualTargetScore) {
        this.annualTargetScore = annualTargetScore;
    }

    @Basic
    @Column(name = "COMPOSITE_SCORE", nullable = true, precision = 2)
    public Long getCompositeScore() {
        return compositeScore;
    }

    public void setCompositeScore(Long compositeScore) {
        this.compositeScore = compositeScore;
    }

    @Basic
    @Column(name = "DEMOCRATIC_SCORE", nullable = true, precision = 2)
    public Long getDemocraticScore() {
        return democraticScore;
    }

    public void setDemocraticScore(Long democraticScore) {
        this.democraticScore = democraticScore;
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
    @Column(name = "YEARS", nullable = true)
    public Timestamp getYears() {
        return years;
    }

    public void setYears(Timestamp years) {
        this.years = years;
    }

    @Basic
    @Column(name = "CADRE_ID", nullable = true, length = 36)
    public String getCadreId() {
        return cadreId;
    }

    public void setCadreId(String cadreId) {
        this.cadreId = cadreId;
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

        CadreInfoEvaluate that = (CadreInfoEvaluate) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (annualTargetScore != null ? !annualTargetScore.equals(that.annualTargetScore) : that.annualTargetScore != null)
            return false;
        if (compositeScore != null ? !compositeScore.equals(that.compositeScore) : that.compositeScore != null)
            return false;
        if (democraticScore != null ? !democraticScore.equals(that.democraticScore) : that.democraticScore != null)
            return false;
        if (dynamicTrackingScore != null ? !dynamicTrackingScore.equals(that.dynamicTrackingScore) : that.dynamicTrackingScore != null)
            return false;
        if (years != null ? !years.equals(that.years) : that.years != null) return false;
        if (cadreId != null ? !cadreId.equals(that.cadreId) : that.cadreId != null) return false;
        if (storeTimeFromEplatform != null ? !storeTimeFromEplatform.equals(that.storeTimeFromEplatform) : that.storeTimeFromEplatform != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (annualTargetScore != null ? annualTargetScore.hashCode() : 0);
        result = 31 * result + (compositeScore != null ? compositeScore.hashCode() : 0);
        result = 31 * result + (democraticScore != null ? democraticScore.hashCode() : 0);
        result = 31 * result + (dynamicTrackingScore != null ? dynamicTrackingScore.hashCode() : 0);
        result = 31 * result + (years != null ? years.hashCode() : 0);
        result = 31 * result + (cadreId != null ? cadreId.hashCode() : 0);
        result = 31 * result + (storeTimeFromEplatform != null ? storeTimeFromEplatform.hashCode() : 0);
        return result;
    }
}
