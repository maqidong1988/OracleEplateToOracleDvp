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
@Table(name = "CADRE_INFO_STUDY", catalog = "")
public class CadreInfoStudy {
    private String id;
    private Double classHour;
    private Timestamp learnEndtime;
    private Timestamp learnStartTime;
    private String organizerCode;
    private String organizerName;
    private String sponsorCode;
    private String sponsorName;
    private String studyClassName;
    private String studyContent;
    private String studyInOrganization;
    private String studyInOrganizationCode;
    private String studyInOrganizationType;
    private String studyMajor;
    private String studyMajorType;
    private String studyProcess;
    private Long studyScore;
    private Double studyTime;
    private String studyType;
    private String studyWay;
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
    @Column(name = "CLASS_HOUR", nullable = true, precision = 0)
    public Double getClassHour() {
        return classHour;
    }

    public void setClassHour(Double classHour) {
        this.classHour = classHour;
    }

    @Basic
    @Column(name = "LEARN_ENDTIME", nullable = true)
    public Timestamp getLearnEndtime() {
        return learnEndtime;
    }

    public void setLearnEndtime(Timestamp learnEndtime) {
        this.learnEndtime = learnEndtime;
    }

    @Basic
    @Column(name = "LEARN_START_TIME", nullable = true)
    public Timestamp getLearnStartTime() {
        return learnStartTime;
    }

    public void setLearnStartTime(Timestamp learnStartTime) {
        this.learnStartTime = learnStartTime;
    }

    @Basic
    @Column(name = "ORGANIZER_CODE", nullable = true, length = 18)
    public String getOrganizerCode() {
        return organizerCode;
    }

    public void setOrganizerCode(String organizerCode) {
        this.organizerCode = organizerCode;
    }

    @Basic
    @Column(name = "ORGANIZER_NAME", nullable = true, length = 120)
    public String getOrganizerName() {
        return organizerName;
    }

    public void setOrganizerName(String organizerName) {
        this.organizerName = organizerName;
    }

    @Basic
    @Column(name = "SPONSOR_CODE", nullable = true, length = 18)
    public String getSponsorCode() {
        return sponsorCode;
    }

    public void setSponsorCode(String sponsorCode) {
        this.sponsorCode = sponsorCode;
    }

    @Basic
    @Column(name = "SPONSOR_NAME", nullable = true, length = 120)
    public String getSponsorName() {
        return sponsorName;
    }

    public void setSponsorName(String sponsorName) {
        this.sponsorName = sponsorName;
    }

    @Basic
    @Column(name = "STUDY_CLASS_NAME", nullable = true, length = 100)
    public String getStudyClassName() {
        return studyClassName;
    }

    public void setStudyClassName(String studyClassName) {
        this.studyClassName = studyClassName;
    }

    @Basic
    @Column(name = "STUDY_CONTENT", nullable = true, length = 1000)
    public String getStudyContent() {
        return studyContent;
    }

    public void setStudyContent(String studyContent) {
        this.studyContent = studyContent;
    }

    @Basic
    @Column(name = "STUDY_IN_ORGANIZATION", nullable = true, length = 120)
    public String getStudyInOrganization() {
        return studyInOrganization;
    }

    public void setStudyInOrganization(String studyInOrganization) {
        this.studyInOrganization = studyInOrganization;
    }

    @Basic
    @Column(name = "STUDY_IN_ORGANIZATION_CODE", nullable = true, length = 15)
    public String getStudyInOrganizationCode() {
        return studyInOrganizationCode;
    }

    public void setStudyInOrganizationCode(String studyInOrganizationCode) {
        this.studyInOrganizationCode = studyInOrganizationCode;
    }

    @Basic
    @Column(name = "STUDY_IN_ORGANIZATION_TYPE", nullable = true, length = 2)
    public String getStudyInOrganizationType() {
        return studyInOrganizationType;
    }

    public void setStudyInOrganizationType(String studyInOrganizationType) {
        this.studyInOrganizationType = studyInOrganizationType;
    }

    @Basic
    @Column(name = "STUDY_MAJOR", nullable = true, length = 60)
    public String getStudyMajor() {
        return studyMajor;
    }

    public void setStudyMajor(String studyMajor) {
        this.studyMajor = studyMajor;
    }

    @Basic
    @Column(name = "STUDY_MAJOR_TYPE", nullable = true, length = 6)
    public String getStudyMajorType() {
        return studyMajorType;
    }

    public void setStudyMajorType(String studyMajorType) {
        this.studyMajorType = studyMajorType;
    }

    @Basic
    @Column(name = "STUDY_PROCESS", nullable = true, length = 2)
    public String getStudyProcess() {
        return studyProcess;
    }

    public void setStudyProcess(String studyProcess) {
        this.studyProcess = studyProcess;
    }

    @Basic
    @Column(name = "STUDY_SCORE", nullable = true, precision = 2)
    public Long getStudyScore() {
        return studyScore;
    }

    public void setStudyScore(Long studyScore) {
        this.studyScore = studyScore;
    }

    @Basic
    @Column(name = "STUDY_TIME", nullable = true, precision = 0)
    public Double getStudyTime() {
        return studyTime;
    }

    public void setStudyTime(Double studyTime) {
        this.studyTime = studyTime;
    }

    @Basic
    @Column(name = "STUDY_TYPE", nullable = true, length = 2)
    public String getStudyType() {
        return studyType;
    }

    public void setStudyType(String studyType) {
        this.studyType = studyType;
    }

    @Basic
    @Column(name = "STUDY_WAY", nullable = true, length = 2)
    public String getStudyWay() {
        return studyWay;
    }

    public void setStudyWay(String studyWay) {
        this.studyWay = studyWay;
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

        CadreInfoStudy that = (CadreInfoStudy) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (classHour != null ? !classHour.equals(that.classHour) : that.classHour != null) return false;
        if (learnEndtime != null ? !learnEndtime.equals(that.learnEndtime) : that.learnEndtime != null) return false;
        if (learnStartTime != null ? !learnStartTime.equals(that.learnStartTime) : that.learnStartTime != null)
            return false;
        if (organizerCode != null ? !organizerCode.equals(that.organizerCode) : that.organizerCode != null)
            return false;
        if (organizerName != null ? !organizerName.equals(that.organizerName) : that.organizerName != null)
            return false;
        if (sponsorCode != null ? !sponsorCode.equals(that.sponsorCode) : that.sponsorCode != null) return false;
        if (sponsorName != null ? !sponsorName.equals(that.sponsorName) : that.sponsorName != null) return false;
        if (studyClassName != null ? !studyClassName.equals(that.studyClassName) : that.studyClassName != null)
            return false;
        if (studyContent != null ? !studyContent.equals(that.studyContent) : that.studyContent != null) return false;
        if (studyInOrganization != null ? !studyInOrganization.equals(that.studyInOrganization) : that.studyInOrganization != null)
            return false;
        if (studyInOrganizationCode != null ? !studyInOrganizationCode.equals(that.studyInOrganizationCode) : that.studyInOrganizationCode != null)
            return false;
        if (studyInOrganizationType != null ? !studyInOrganizationType.equals(that.studyInOrganizationType) : that.studyInOrganizationType != null)
            return false;
        if (studyMajor != null ? !studyMajor.equals(that.studyMajor) : that.studyMajor != null) return false;
        if (studyMajorType != null ? !studyMajorType.equals(that.studyMajorType) : that.studyMajorType != null)
            return false;
        if (studyProcess != null ? !studyProcess.equals(that.studyProcess) : that.studyProcess != null) return false;
        if (studyScore != null ? !studyScore.equals(that.studyScore) : that.studyScore != null) return false;
        if (studyTime != null ? !studyTime.equals(that.studyTime) : that.studyTime != null) return false;
        if (studyType != null ? !studyType.equals(that.studyType) : that.studyType != null) return false;
        if (studyWay != null ? !studyWay.equals(that.studyWay) : that.studyWay != null) return false;
        if (cadreId != null ? !cadreId.equals(that.cadreId) : that.cadreId != null) return false;
        if (storeTimeFromEplatform != null ? !storeTimeFromEplatform.equals(that.storeTimeFromEplatform) : that.storeTimeFromEplatform != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (classHour != null ? classHour.hashCode() : 0);
        result = 31 * result + (learnEndtime != null ? learnEndtime.hashCode() : 0);
        result = 31 * result + (learnStartTime != null ? learnStartTime.hashCode() : 0);
        result = 31 * result + (organizerCode != null ? organizerCode.hashCode() : 0);
        result = 31 * result + (organizerName != null ? organizerName.hashCode() : 0);
        result = 31 * result + (sponsorCode != null ? sponsorCode.hashCode() : 0);
        result = 31 * result + (sponsorName != null ? sponsorName.hashCode() : 0);
        result = 31 * result + (studyClassName != null ? studyClassName.hashCode() : 0);
        result = 31 * result + (studyContent != null ? studyContent.hashCode() : 0);
        result = 31 * result + (studyInOrganization != null ? studyInOrganization.hashCode() : 0);
        result = 31 * result + (studyInOrganizationCode != null ? studyInOrganizationCode.hashCode() : 0);
        result = 31 * result + (studyInOrganizationType != null ? studyInOrganizationType.hashCode() : 0);
        result = 31 * result + (studyMajor != null ? studyMajor.hashCode() : 0);
        result = 31 * result + (studyMajorType != null ? studyMajorType.hashCode() : 0);
        result = 31 * result + (studyProcess != null ? studyProcess.hashCode() : 0);
        result = 31 * result + (studyScore != null ? studyScore.hashCode() : 0);
        result = 31 * result + (studyTime != null ? studyTime.hashCode() : 0);
        result = 31 * result + (studyType != null ? studyType.hashCode() : 0);
        result = 31 * result + (studyWay != null ? studyWay.hashCode() : 0);
        result = 31 * result + (cadreId != null ? cadreId.hashCode() : 0);
        result = 31 * result + (storeTimeFromEplatform != null ? storeTimeFromEplatform.hashCode() : 0);
        return result;
    }
}
