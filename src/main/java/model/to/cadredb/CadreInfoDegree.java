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
@Table(name = "CADRE_INFO_DEGREE", catalog = "")
public class CadreInfoDegree {
    private String id;
    private String degreeCode;
    private String degreeCodeValue;
    private Timestamp degreeGrantDate;
    private String degreeGrantDepartment;
    private String degreeName;
    private String degreeNumber;
    private String educationId;
    private String highestEducation;
    private String highestEducationValue;
    private String secondDegree;
    private String secondDegreeValue;
    private String cadreId;
    private Timestamp storeTimeFromEplatform;

    @Id
    @Column(name = "ID", nullable = false, length = 50)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "DEGREE_CODE", nullable = true, length = 20)
    public String getDegreeCode() {
        return degreeCode;
    }

    public void setDegreeCode(String degreeCode) {
        this.degreeCode = degreeCode;
    }

    @Basic
    @Column(name = "DEGREE_CODE_VALUE", nullable = true, length = 1000)
    public String getDegreeCodeValue() {
        return degreeCodeValue;
    }

    public void setDegreeCodeValue(String degreeCodeValue) {
        this.degreeCodeValue = degreeCodeValue;
    }

    @Basic
    @Column(name = "DEGREE_GRANT_DATE", nullable = true)
    public Timestamp getDegreeGrantDate() {
        return degreeGrantDate;
    }

    public void setDegreeGrantDate(Timestamp degreeGrantDate) {
        this.degreeGrantDate = degreeGrantDate;
    }

    @Basic
    @Column(name = "DEGREE_GRANT_DEPARTMENT", nullable = true, length = 240)
    public String getDegreeGrantDepartment() {
        return degreeGrantDepartment;
    }

    public void setDegreeGrantDepartment(String degreeGrantDepartment) {
        this.degreeGrantDepartment = degreeGrantDepartment;
    }

    @Basic
    @Column(name = "DEGREE_NAME", nullable = true, length = 80)
    public String getDegreeName() {
        return degreeName;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
    }

    @Basic
    @Column(name = "DEGREE_NUMBER", nullable = true, length = 40)
    public String getDegreeNumber() {
        return degreeNumber;
    }

    public void setDegreeNumber(String degreeNumber) {
        this.degreeNumber = degreeNumber;
    }

    @Basic
    @Column(name = "EDUCATION_ID", nullable = true, length = 36)
    public String getEducationId() {
        return educationId;
    }

    public void setEducationId(String educationId) {
        this.educationId = educationId;
    }

    @Basic
    @Column(name = "HIGHEST_EDUCATION", nullable = true, length = 200)
    public String getHighestEducation() {
        return highestEducation;
    }

    public void setHighestEducation(String highestEducation) {
        this.highestEducation = highestEducation;
    }

    @Basic
    @Column(name = "HIGHEST_EDUCATION_VALUE", nullable = true, length = 1000)
    public String getHighestEducationValue() {
        return highestEducationValue;
    }

    public void setHighestEducationValue(String highestEducationValue) {
        this.highestEducationValue = highestEducationValue;
    }

    @Basic
    @Column(name = "SECOND_DEGREE", nullable = true, length = 200)
    public String getSecondDegree() {
        return secondDegree;
    }

    public void setSecondDegree(String secondDegree) {
        this.secondDegree = secondDegree;
    }

    @Basic
    @Column(name = "SECOND_DEGREE_VALUE", nullable = true, length = 1000)
    public String getSecondDegreeValue() {
        return secondDegreeValue;
    }

    public void setSecondDegreeValue(String secondDegreeValue) {
        this.secondDegreeValue = secondDegreeValue;
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

        CadreInfoDegree that = (CadreInfoDegree) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (degreeCode != null ? !degreeCode.equals(that.degreeCode) : that.degreeCode != null) return false;
        if (degreeCodeValue != null ? !degreeCodeValue.equals(that.degreeCodeValue) : that.degreeCodeValue != null)
            return false;
        if (degreeGrantDate != null ? !degreeGrantDate.equals(that.degreeGrantDate) : that.degreeGrantDate != null)
            return false;
        if (degreeGrantDepartment != null ? !degreeGrantDepartment.equals(that.degreeGrantDepartment) : that.degreeGrantDepartment != null)
            return false;
        if (degreeName != null ? !degreeName.equals(that.degreeName) : that.degreeName != null) return false;
        if (degreeNumber != null ? !degreeNumber.equals(that.degreeNumber) : that.degreeNumber != null) return false;
        if (educationId != null ? !educationId.equals(that.educationId) : that.educationId != null) return false;
        if (highestEducation != null ? !highestEducation.equals(that.highestEducation) : that.highestEducation != null)
            return false;
        if (highestEducationValue != null ? !highestEducationValue.equals(that.highestEducationValue) : that.highestEducationValue != null)
            return false;
        if (secondDegree != null ? !secondDegree.equals(that.secondDegree) : that.secondDegree != null) return false;
        if (secondDegreeValue != null ? !secondDegreeValue.equals(that.secondDegreeValue) : that.secondDegreeValue != null)
            return false;
        if (cadreId != null ? !cadreId.equals(that.cadreId) : that.cadreId != null) return false;
        if (storeTimeFromEplatform != null ? !storeTimeFromEplatform.equals(that.storeTimeFromEplatform) : that.storeTimeFromEplatform != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (degreeCode != null ? degreeCode.hashCode() : 0);
        result = 31 * result + (degreeCodeValue != null ? degreeCodeValue.hashCode() : 0);
        result = 31 * result + (degreeGrantDate != null ? degreeGrantDate.hashCode() : 0);
        result = 31 * result + (degreeGrantDepartment != null ? degreeGrantDepartment.hashCode() : 0);
        result = 31 * result + (degreeName != null ? degreeName.hashCode() : 0);
        result = 31 * result + (degreeNumber != null ? degreeNumber.hashCode() : 0);
        result = 31 * result + (educationId != null ? educationId.hashCode() : 0);
        result = 31 * result + (highestEducation != null ? highestEducation.hashCode() : 0);
        result = 31 * result + (highestEducationValue != null ? highestEducationValue.hashCode() : 0);
        result = 31 * result + (secondDegree != null ? secondDegree.hashCode() : 0);
        result = 31 * result + (secondDegreeValue != null ? secondDegreeValue.hashCode() : 0);
        result = 31 * result + (cadreId != null ? cadreId.hashCode() : 0);
        result = 31 * result + (storeTimeFromEplatform != null ? storeTimeFromEplatform.hashCode() : 0);
        return result;
    }
}
