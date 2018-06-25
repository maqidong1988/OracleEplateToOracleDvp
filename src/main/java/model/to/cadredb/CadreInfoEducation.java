package model.to.cadredb;

import javax.persistence.*;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Jay on 2018/1/23.
 *
 * @author Jay
 * @version 1.0
 * @since 1.0
 * Copyright (C) 2017. SinoSoft All Rights Received
 */
@Entity
@Table(name = "CADRE_INFO_EDUCATION", catalog = "")
public class CadreInfoEducation {
    private String id;
    private String className;
    private String collegeName;
    private String diplomaNumber;
    private String educationCode;
    private String educationCodeValue;
    private String educationFrom;
    private String educationFromValue;
    private String educationName;
    private String educationStatus;
    private String educationStatusValue;
    private String educationType;
    private String educationTypeValue;
    private String educationYear;
    private Timestamp endEducationTime;
    private String highestEducation;
    private String highestEducationValue;
    private String majorName;
    private String majorType;
    private String majorTypeValue;
    private String schoolName;
    private Timestamp startEducationTime;
    private String cadreId;
    private Timestamp storeTimeFromEplatform;

    public static Timestamp stringToTimestamp(String dateStr) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        try {
            Date date = sdf.parse(dateStr);
            cal.setTime(date);
            return new Timestamp(cal.getTimeInMillis());
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            cal.setTime(new Date());
            return new Timestamp(cal.getTimeInMillis());
        }
    }

    public CadreInfoEducation() {
        super();
    }

    public CadreInfoEducation(String schoolName, String className, Object startEducationTime,Object endEducationTime,String cadreId) {
        this.schoolName = schoolName;
        this.className = className;
        this.majorType = majorType;
        this.collegeName = collegeName;
        this.educationCode = educationCode;
        if (startEducationTime != null) {
            this.startEducationTime = stringToTimestamp(startEducationTime.toString());
        }
        if (endEducationTime != null) {
            this.endEducationTime = stringToTimestamp(endEducationTime.toString());
        }
        this.cadreId = cadreId;
    }

    @Id
    @Column(name = "ID", nullable = false, length = 50)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "CLASS_NAME", nullable = true, length = 200)
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Basic
    @Column(name = "COLLEGE_NAME", nullable = true, length = 200)
    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    @Basic
    @Column(name = "DIPLOMA_NUMBER", nullable = true, length = 40)
    public String getDiplomaNumber() {
        return diplomaNumber;
    }

    public void setDiplomaNumber(String diplomaNumber) {
        this.diplomaNumber = diplomaNumber;
    }

    @Basic
    @Column(name = "EDUCATION_CODE", nullable = true, length = 200)
    public String getEducationCode() {
        return educationCode;
    }

    public void setEducationCode(String educationCode) {
        this.educationCode = educationCode;
    }

    @Basic
    @Column(name = "EDUCATION_CODE_VALUE", nullable = true, length = 1000)
    public String getEducationCodeValue() {
        return educationCodeValue;
    }

    public void setEducationCodeValue(String educationCodeValue) {
        this.educationCodeValue = educationCodeValue;
    }

    @Basic
    @Column(name = "EDUCATION_FROM", nullable = true, length = 200)
    public String getEducationFrom() {
        return educationFrom;
    }

    public void setEducationFrom(String educationFrom) {
        this.educationFrom = educationFrom;
    }

    @Basic
    @Column(name = "EDUCATION_FROM_VALUE", nullable = true, length = 1000)
    public String getEducationFromValue() {
        return educationFromValue;
    }

    public void setEducationFromValue(String educationFromValue) {
        this.educationFromValue = educationFromValue;
    }

    @Basic
    @Column(name = "EDUCATION_NAME", nullable = true, length = 40)
    public String getEducationName() {
        return educationName;
    }

    public void setEducationName(String educationName) {
        this.educationName = educationName;
    }

    @Basic
    @Column(name = "EDUCATION_STATUS", nullable = true, length = 200)
    public String getEducationStatus() {
        return educationStatus;
    }

    public void setEducationStatus(String educationStatus) {
        this.educationStatus = educationStatus;
    }

    @Basic
    @Column(name = "EDUCATION_STATUS_VALUE", nullable = true, length = 1000)
    public String getEducationStatusValue() {
        return educationStatusValue;
    }

    public void setEducationStatusValue(String educationStatusValue) {
        this.educationStatusValue = educationStatusValue;
    }

    @Basic
    @Column(name = "EDUCATION_TYPE", nullable = true, length = 200)
    public String getEducationType() {
        return educationType;
    }

    public void setEducationType(String educationType) {
        this.educationType = educationType;
    }

    @Basic
    @Column(name = "EDUCATION_TYPE_VALUE", nullable = true, length = 1000)
    public String getEducationTypeValue() {
        return educationTypeValue;
    }

    public void setEducationTypeValue(String educationTypeValue) {
        this.educationTypeValue = educationTypeValue;
    }

    @Basic
    @Column(name = "EDUCATION_YEAR", nullable = true, length = 100)
    public String getEducationYear() {
        return educationYear;
    }

    public void setEducationYear(String educationYear) {
        this.educationYear = educationYear;
    }

    @Basic
    @Column(name = "END_EDUCATION_TIME", nullable = true)
    public Timestamp getEndEducationTime() {
        return endEducationTime;
    }

    public void setEndEducationTime(Timestamp endEducationTime) {
        this.endEducationTime = endEducationTime;
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
    @Column(name = "MAJOR_NAME", nullable = true, length = 200)
    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    @Basic
    @Column(name = "MAJOR_TYPE", nullable = true, length = 200)
    public String getMajorType() {
        return majorType;
    }

    public void setMajorType(String majorType) {
        this.majorType = majorType;
    }

    @Basic
    @Column(name = "MAJOR_TYPE_VALUE", nullable = true, length = 1000)
    public String getMajorTypeValue() {
        return majorTypeValue;
    }

    public void setMajorTypeValue(String majorTypeValue) {
        this.majorTypeValue = majorTypeValue;
    }

    @Basic
    @Column(name = "SCHOOL_NAME", nullable = true, length = 240)
    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Basic
    @Column(name = "START_EDUCATION_TIME", nullable = true)
    public Timestamp getStartEducationTime() {
        return startEducationTime;
    }

    public void setStartEducationTime(Timestamp startEducationTime) {
        this.startEducationTime = startEducationTime;
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

        CadreInfoEducation that = (CadreInfoEducation) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (className != null ? !className.equals(that.className) : that.className != null) return false;
        if (collegeName != null ? !collegeName.equals(that.collegeName) : that.collegeName != null) return false;
        if (diplomaNumber != null ? !diplomaNumber.equals(that.diplomaNumber) : that.diplomaNumber != null)
            return false;
        if (educationCode != null ? !educationCode.equals(that.educationCode) : that.educationCode != null)
            return false;
        if (educationCodeValue != null ? !educationCodeValue.equals(that.educationCodeValue) : that.educationCodeValue != null)
            return false;
        if (educationFrom != null ? !educationFrom.equals(that.educationFrom) : that.educationFrom != null)
            return false;
        if (educationFromValue != null ? !educationFromValue.equals(that.educationFromValue) : that.educationFromValue != null)
            return false;
        if (educationName != null ? !educationName.equals(that.educationName) : that.educationName != null)
            return false;
        if (educationStatus != null ? !educationStatus.equals(that.educationStatus) : that.educationStatus != null)
            return false;
        if (educationStatusValue != null ? !educationStatusValue.equals(that.educationStatusValue) : that.educationStatusValue != null)
            return false;
        if (educationType != null ? !educationType.equals(that.educationType) : that.educationType != null)
            return false;
        if (educationTypeValue != null ? !educationTypeValue.equals(that.educationTypeValue) : that.educationTypeValue != null)
            return false;
        if (educationYear != null ? !educationYear.equals(that.educationYear) : that.educationYear != null)
            return false;
        if (endEducationTime != null ? !endEducationTime.equals(that.endEducationTime) : that.endEducationTime != null)
            return false;
        if (highestEducation != null ? !highestEducation.equals(that.highestEducation) : that.highestEducation != null)
            return false;
        if (highestEducationValue != null ? !highestEducationValue.equals(that.highestEducationValue) : that.highestEducationValue != null)
            return false;
        if (majorName != null ? !majorName.equals(that.majorName) : that.majorName != null) return false;
        if (majorType != null ? !majorType.equals(that.majorType) : that.majorType != null) return false;
        if (majorTypeValue != null ? !majorTypeValue.equals(that.majorTypeValue) : that.majorTypeValue != null)
            return false;
        if (schoolName != null ? !schoolName.equals(that.schoolName) : that.schoolName != null) return false;
        if (startEducationTime != null ? !startEducationTime.equals(that.startEducationTime) : that.startEducationTime != null)
            return false;
        if (cadreId != null ? !cadreId.equals(that.cadreId) : that.cadreId != null) return false;
        if (storeTimeFromEplatform != null ? !storeTimeFromEplatform.equals(that.storeTimeFromEplatform) : that.storeTimeFromEplatform != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (className != null ? className.hashCode() : 0);
        result = 31 * result + (collegeName != null ? collegeName.hashCode() : 0);
        result = 31 * result + (diplomaNumber != null ? diplomaNumber.hashCode() : 0);
        result = 31 * result + (educationCode != null ? educationCode.hashCode() : 0);
        result = 31 * result + (educationCodeValue != null ? educationCodeValue.hashCode() : 0);
        result = 31 * result + (educationFrom != null ? educationFrom.hashCode() : 0);
        result = 31 * result + (educationFromValue != null ? educationFromValue.hashCode() : 0);
        result = 31 * result + (educationName != null ? educationName.hashCode() : 0);
        result = 31 * result + (educationStatus != null ? educationStatus.hashCode() : 0);
        result = 31 * result + (educationStatusValue != null ? educationStatusValue.hashCode() : 0);
        result = 31 * result + (educationType != null ? educationType.hashCode() : 0);
        result = 31 * result + (educationTypeValue != null ? educationTypeValue.hashCode() : 0);
        result = 31 * result + (educationYear != null ? educationYear.hashCode() : 0);
        result = 31 * result + (endEducationTime != null ? endEducationTime.hashCode() : 0);
        result = 31 * result + (highestEducation != null ? highestEducation.hashCode() : 0);
        result = 31 * result + (highestEducationValue != null ? highestEducationValue.hashCode() : 0);
        result = 31 * result + (majorName != null ? majorName.hashCode() : 0);
        result = 31 * result + (majorType != null ? majorType.hashCode() : 0);
        result = 31 * result + (majorTypeValue != null ? majorTypeValue.hashCode() : 0);
        result = 31 * result + (schoolName != null ? schoolName.hashCode() : 0);
        result = 31 * result + (startEducationTime != null ? startEducationTime.hashCode() : 0);
        result = 31 * result + (cadreId != null ? cadreId.hashCode() : 0);
        result = 31 * result + (storeTimeFromEplatform != null ? storeTimeFromEplatform.hashCode() : 0);
        return result;
    }
}
