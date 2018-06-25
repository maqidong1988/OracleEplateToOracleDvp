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
@Table(name = "CADRE_INFO_RELATIONSHIP", catalog = "")
public class CadreInfoRelationship {
    private String id;
    private Timestamp birthday;
    private String citizenId;
    private String citizenship;
    private String departmentAndDuty;
    private String duty;
    private String education;
    private String gender;
    private String identity;
    private String name;
    private String nation;
    private String politicalStatus;
    private String politicalStatusCode;
    private String rank;
    private String relationshipCode;
    private String relationshipName;
    private String remarks;
    private Timestamp separationDate;
    private String serialNumber;
    private String status;
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
    @Column(name = "BIRTHDAY", nullable = true)
    public Timestamp getBirthday() {
        return birthday;
    }

    public void setBirthday(Timestamp birthday) {
        this.birthday = birthday;
    }

    @Basic
    @Column(name = "CITIZEN_ID", nullable = true, length = 200)
    public String getCitizenId() {
        return citizenId;
    }

    public void setCitizenId(String citizenId) {
        this.citizenId = citizenId;
    }

    @Basic
    @Column(name = "CITIZENSHIP", nullable = true, length = 200)
    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    @Basic
    @Column(name = "DEPARTMENT_AND_DUTY", nullable = true, length = 4000)
    public String getDepartmentAndDuty() {
        return departmentAndDuty;
    }

    public void setDepartmentAndDuty(String departmentAndDuty) {
        this.departmentAndDuty = departmentAndDuty;
    }

    @Basic
    @Column(name = "DUTY", nullable = true, length = 160)
    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    @Basic
    @Column(name = "EDUCATION", nullable = true, length = 200)
    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Basic
    @Column(name = "GENDER", nullable = true, length = 200)
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "IDENTITY", nullable = true, length = 200)
    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    @Basic
    @Column(name = "NAME", nullable = true, length = 100)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "NATION", nullable = true, length = 200)
    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    @Basic
    @Column(name = "POLITICAL_STATUS", nullable = true, length = 60)
    public String getPoliticalStatus() {
        return politicalStatus;
    }

    public void setPoliticalStatus(String politicalStatus) {
        this.politicalStatus = politicalStatus;
    }

    @Basic
    @Column(name = "POLITICAL_STATUS_CODE", nullable = true, length = 20)
    public String getPoliticalStatusCode() {
        return politicalStatusCode;
    }

    public void setPoliticalStatusCode(String politicalStatusCode) {
        this.politicalStatusCode = politicalStatusCode;
    }

    @Basic
    @Column(name = "RANK", nullable = true, length = 200)
    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Basic
    @Column(name = "RELATIONSHIP_CODE", nullable = true, length = 20)
    public String getRelationshipCode() {
        return relationshipCode;
    }

    public void setRelationshipCode(String relationshipCode) {
        this.relationshipCode = relationshipCode;
    }

    @Basic
    @Column(name = "RELATIONSHIP_NAME", nullable = true, length = 100)
    public String getRelationshipName() {
        return relationshipName;
    }

    public void setRelationshipName(String relationshipName) {
        this.relationshipName = relationshipName;
    }

    @Basic
    @Column(name = "REMARKS", nullable = true, length = 4000)
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Basic
    @Column(name = "SEPARATION_DATE", nullable = true)
    public Timestamp getSeparationDate() {
        return separationDate;
    }

    public void setSeparationDate(Timestamp separationDate) {
        this.separationDate = separationDate;
    }

    @Basic
    @Column(name = "SERIAL_NUMBER", nullable = true, length = 4)
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Basic
    @Column(name = "STATUS", nullable = true, length = 200)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

        CadreInfoRelationship that = (CadreInfoRelationship) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (birthday != null ? !birthday.equals(that.birthday) : that.birthday != null) return false;
        if (citizenId != null ? !citizenId.equals(that.citizenId) : that.citizenId != null) return false;
        if (citizenship != null ? !citizenship.equals(that.citizenship) : that.citizenship != null) return false;
        if (departmentAndDuty != null ? !departmentAndDuty.equals(that.departmentAndDuty) : that.departmentAndDuty != null)
            return false;
        if (duty != null ? !duty.equals(that.duty) : that.duty != null) return false;
        if (education != null ? !education.equals(that.education) : that.education != null) return false;
        if (gender != null ? !gender.equals(that.gender) : that.gender != null) return false;
        if (identity != null ? !identity.equals(that.identity) : that.identity != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (nation != null ? !nation.equals(that.nation) : that.nation != null) return false;
        if (politicalStatus != null ? !politicalStatus.equals(that.politicalStatus) : that.politicalStatus != null)
            return false;
        if (politicalStatusCode != null ? !politicalStatusCode.equals(that.politicalStatusCode) : that.politicalStatusCode != null)
            return false;
        if (rank != null ? !rank.equals(that.rank) : that.rank != null) return false;
        if (relationshipCode != null ? !relationshipCode.equals(that.relationshipCode) : that.relationshipCode != null)
            return false;
        if (relationshipName != null ? !relationshipName.equals(that.relationshipName) : that.relationshipName != null)
            return false;
        if (remarks != null ? !remarks.equals(that.remarks) : that.remarks != null) return false;
        if (separationDate != null ? !separationDate.equals(that.separationDate) : that.separationDate != null)
            return false;
        if (serialNumber != null ? !serialNumber.equals(that.serialNumber) : that.serialNumber != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (cadreId != null ? !cadreId.equals(that.cadreId) : that.cadreId != null) return false;
        if (storeTimeFromEplatform != null ? !storeTimeFromEplatform.equals(that.storeTimeFromEplatform) : that.storeTimeFromEplatform != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (citizenId != null ? citizenId.hashCode() : 0);
        result = 31 * result + (citizenship != null ? citizenship.hashCode() : 0);
        result = 31 * result + (departmentAndDuty != null ? departmentAndDuty.hashCode() : 0);
        result = 31 * result + (duty != null ? duty.hashCode() : 0);
        result = 31 * result + (education != null ? education.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (identity != null ? identity.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (nation != null ? nation.hashCode() : 0);
        result = 31 * result + (politicalStatus != null ? politicalStatus.hashCode() : 0);
        result = 31 * result + (politicalStatusCode != null ? politicalStatusCode.hashCode() : 0);
        result = 31 * result + (rank != null ? rank.hashCode() : 0);
        result = 31 * result + (relationshipCode != null ? relationshipCode.hashCode() : 0);
        result = 31 * result + (relationshipName != null ? relationshipName.hashCode() : 0);
        result = 31 * result + (remarks != null ? remarks.hashCode() : 0);
        result = 31 * result + (separationDate != null ? separationDate.hashCode() : 0);
        result = 31 * result + (serialNumber != null ? serialNumber.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (cadreId != null ? cadreId.hashCode() : 0);
        result = 31 * result + (storeTimeFromEplatform != null ? storeTimeFromEplatform.hashCode() : 0);
        return result;
    }
}
