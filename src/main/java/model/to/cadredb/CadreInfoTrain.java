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
@Table(name = "CADRE_INFO_TRAIN", catalog = "")
public class CadreInfoTrain {
    private String id;
    private Double avgHours;
    private Double trainingHours;
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
    @Column(name = "AVG_HOURS", nullable = true, precision = 2)
    public Double getAvgHours() {
        return avgHours;
    }

    public void setAvgHours(Double avgHours) {
        this.avgHours = avgHours;
    }

    @Basic
    @Column(name = "TRAINING_HOURS", nullable = true, precision = 2)
    public Double getTrainingHours() {
        return trainingHours;
    }

    public void setTrainingHours(Double trainingHours) {
        this.trainingHours = trainingHours;
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

        CadreInfoTrain that = (CadreInfoTrain) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (avgHours != null ? !avgHours.equals(that.avgHours) : that.avgHours != null) return false;
        if (trainingHours != null ? !trainingHours.equals(that.trainingHours) : that.trainingHours != null)
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
        result = 31 * result + (avgHours != null ? avgHours.hashCode() : 0);
        result = 31 * result + (trainingHours != null ? trainingHours.hashCode() : 0);
        result = 31 * result + (years != null ? years.hashCode() : 0);
        result = 31 * result + (cadreId != null ? cadreId.hashCode() : 0);
        result = 31 * result + (storeTimeFromEplatform != null ? storeTimeFromEplatform.hashCode() : 0);
        return result;
    }
}
