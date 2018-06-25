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
@Table(name = "CADRE_INFO_JOB_COMPLETION", catalog = "")
public class CadreInfoJobCompletion {
    private String id;
    private Long actualCompletion;
    private Long expectedCompletion;
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
    @Column(name = "ACTUAL_COMPLETION", nullable = true, precision = 2)
    public Long getActualCompletion() {
        return actualCompletion;
    }

    public void setActualCompletion(Long actualCompletion) {
        this.actualCompletion = actualCompletion;
    }

    @Basic
    @Column(name = "EXPECTED_COMPLETION", nullable = true, precision = 2)
    public Long getExpectedCompletion() {
        return expectedCompletion;
    }

    public void setExpectedCompletion(Long expectedCompletion) {
        this.expectedCompletion = expectedCompletion;
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

        CadreInfoJobCompletion that = (CadreInfoJobCompletion) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (actualCompletion != null ? !actualCompletion.equals(that.actualCompletion) : that.actualCompletion != null)
            return false;
        if (expectedCompletion != null ? !expectedCompletion.equals(that.expectedCompletion) : that.expectedCompletion != null)
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
        result = 31 * result + (actualCompletion != null ? actualCompletion.hashCode() : 0);
        result = 31 * result + (expectedCompletion != null ? expectedCompletion.hashCode() : 0);
        result = 31 * result + (years != null ? years.hashCode() : 0);
        result = 31 * result + (cadreId != null ? cadreId.hashCode() : 0);
        result = 31 * result + (storeTimeFromEplatform != null ? storeTimeFromEplatform.hashCode() : 0);
        return result;
    }
}
