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
@Table(name = "CADRE_INFO", catalog = "")
public class CadreInfo {
    private String id;
    private Integer age;
    private String birthPlace;
    private Timestamp birthday;
    private Long creativity;
    private String domicilePlace;
    private String duty;
    private String filePath;
    private String gender;
    private String genderValue;
    private String grassrootsWork;
    private String grassrootsWorkDepartment;
    private Integer grassrootsWorkTime;
    private String grassrootsWorkValue;
    private String growthPlace;
    private String health;
    private String healthValue;
    private String hobby;
    private String identityNumber;
    private String maritalStatus;
    private String maritalStatusValue;
    private String name;
    private String nation;
    private String nationValue;
    private String nativePlace;
    private String nature;
    private String personManageCategory;
    private String personManageCategoryValue;
    private String personStatus;
    private String personStatusValue;
    private String personType;
    private String personTypeValue;
    private String personnelRelationUnitId;
    private String personnelRelationUnitLevel;
    private String personnelRelationUnitName;
    private String relationUnitDivision;
    private String relationUnitDivisionCode;
    private String relationUnitLevelValue;
    private String retire;
    private String retireValue;
    private String specialIdentification;
    private String specialIdentificationValue;
    private String specialty;
    private Timestamp workDate;
    private String leadershipOverviewId;
    private String orgId;
    private String unitId;
    private String levelCode;
    private String unitCode;
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
    @Column(name = "AGE", nullable = true, precision = 0)
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Basic
    @Column(name = "BIRTH_PLACE", nullable = true, length = 160)
    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
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
    @Column(name = "CREATIVITY", nullable = true, precision = 2)
    public Long getCreativity() {
        return creativity;
    }

    public void setCreativity(Long creativity) {
        this.creativity = creativity;
    }

    @Basic
    @Column(name = "DOMICILE_PLACE", nullable = true, length = 160)
    public String getDomicilePlace() {
        return domicilePlace;
    }

    public void setDomicilePlace(String domicilePlace) {
        this.domicilePlace = domicilePlace;
    }

    @Basic
    @Column(name = "DUTY", nullable = true, length = 2000)
    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    @Basic
    @Column(name = "FILE_PATH", nullable = true, length = 200)
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
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
    @Column(name = "GENDER_VALUE", nullable = true, length = 1000)
    public String getGenderValue() {
        return genderValue;
    }

    public void setGenderValue(String genderValue) {
        this.genderValue = genderValue;
    }

    @Basic
    @Column(name = "GRASSROOTS_WORK", nullable = true, length = 200)
    public String getGrassrootsWork() {
        return grassrootsWork;
    }

    public void setGrassrootsWork(String grassrootsWork) {
        this.grassrootsWork = grassrootsWork;
    }

    @Basic
    @Column(name = "GRASSROOTS_WORK_DEPARTMENT", nullable = true, length = 240)
    public String getGrassrootsWorkDepartment() {
        return grassrootsWorkDepartment;
    }

    public void setGrassrootsWorkDepartment(String grassrootsWorkDepartment) {
        this.grassrootsWorkDepartment = grassrootsWorkDepartment;
    }

    @Basic
    @Column(name = "GRASSROOTS_WORK_TIME", nullable = true, precision = 0)
    public Integer getGrassrootsWorkTime() {
        return grassrootsWorkTime;
    }

    public void setGrassrootsWorkTime(Integer grassrootsWorkTime) {
        this.grassrootsWorkTime = grassrootsWorkTime;
    }

    @Basic
    @Column(name = "GRASSROOTS_WORK_VALUE", nullable = true, length = 1000)
    public String getGrassrootsWorkValue() {
        return grassrootsWorkValue;
    }

    public void setGrassrootsWorkValue(String grassrootsWorkValue) {
        this.grassrootsWorkValue = grassrootsWorkValue;
    }

    @Basic
    @Column(name = "GROWTH_PLACE", nullable = true, length = 200)
    public String getGrowthPlace() {
        return growthPlace;
    }

    public void setGrowthPlace(String growthPlace) {
        this.growthPlace = growthPlace;
    }

    @Basic
    @Column(name = "HEALTH", nullable = true, length = 200)
    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    @Basic
    @Column(name = "HEALTH_VALUE", nullable = true, length = 1000)
    public String getHealthValue() {
        return healthValue;
    }

    public void setHealthValue(String healthValue) {
        this.healthValue = healthValue;
    }

    @Basic
    @Column(name = "HOBBY", nullable = true, length = 200)
    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Basic
    @Column(name = "IDENTITY_NUMBER", nullable = true, length = 36)
    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    @Basic
    @Column(name = "MARITAL_STATUS", nullable = true, length = 200)
    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    @Basic
    @Column(name = "MARITAL_STATUS_VALUE", nullable = true, length = 1000)
    public String getMaritalStatusValue() {
        return maritalStatusValue;
    }

    public void setMaritalStatusValue(String maritalStatusValue) {
        this.maritalStatusValue = maritalStatusValue;
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
    @Column(name = "NATION_VALUE", nullable = true, length = 1000)
    public String getNationValue() {
        return nationValue;
    }

    public void setNationValue(String nationValue) {
        this.nationValue = nationValue;
    }

    @Basic
    @Column(name = "NATIVE_PLACE", nullable = true, length = 160)
    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    @Basic
    @Column(name = "NATURE", nullable = true, length = 10)
    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    @Basic
    @Column(name = "PERSON_MANAGE_CATEGORY", nullable = true, length = 200)
    public String getPersonManageCategory() {
        return personManageCategory;
    }

    public void setPersonManageCategory(String personManageCategory) {
        this.personManageCategory = personManageCategory;
    }

    @Basic
    @Column(name = "PERSON_MANAGE_CATEGORY_VALUE", nullable = true, length = 1000)
    public String getPersonManageCategoryValue() {
        return personManageCategoryValue;
    }

    public void setPersonManageCategoryValue(String personManageCategoryValue) {
        this.personManageCategoryValue = personManageCategoryValue;
    }

    @Basic
    @Column(name = "PERSON_STATUS", nullable = true, length = 200)
    public String getPersonStatus() {
        return personStatus;
    }

    public void setPersonStatus(String personStatus) {
        this.personStatus = personStatus;
    }

    @Basic
    @Column(name = "PERSON_STATUS_VALUE", nullable = true, length = 1000)
    public String getPersonStatusValue() {
        return personStatusValue;
    }

    public void setPersonStatusValue(String personStatusValue) {
        this.personStatusValue = personStatusValue;
    }

    @Basic
    @Column(name = "PERSON_TYPE", nullable = true, length = 200)
    public String getPersonType() {
        return personType;
    }

    public void setPersonType(String personType) {
        this.personType = personType;
    }

    @Basic
    @Column(name = "PERSON_TYPE_VALUE", nullable = true, length = 200)
    public String getPersonTypeValue() {
        return personTypeValue;
    }

    public void setPersonTypeValue(String personTypeValue) {
        this.personTypeValue = personTypeValue;
    }

    @Basic
    @Column(name = "PERSONNEL_RELATION_UNIT_ID", nullable = true, length = 64)
    public String getPersonnelRelationUnitId() {
        return personnelRelationUnitId;
    }

    public void setPersonnelRelationUnitId(String personnelRelationUnitId) {
        this.personnelRelationUnitId = personnelRelationUnitId;
    }

    @Basic
    @Column(name = "PERSONNEL_RELATION_UNIT_LEVEL", nullable = true, length = 200)
    public String getPersonnelRelationUnitLevel() {
        return personnelRelationUnitLevel;
    }

    public void setPersonnelRelationUnitLevel(String personnelRelationUnitLevel) {
        this.personnelRelationUnitLevel = personnelRelationUnitLevel;
    }

    @Basic
    @Column(name = "PERSONNEL_RELATION_UNIT_NAME", nullable = true, length = 240)
    public String getPersonnelRelationUnitName() {
        return personnelRelationUnitName;
    }

    public void setPersonnelRelationUnitName(String personnelRelationUnitName) {
        this.personnelRelationUnitName = personnelRelationUnitName;
    }

    @Basic
    @Column(name = "RELATION_UNIT_DIVISION", nullable = true, length = 160)
    public String getRelationUnitDivision() {
        return relationUnitDivision;
    }

    public void setRelationUnitDivision(String relationUnitDivision) {
        this.relationUnitDivision = relationUnitDivision;
    }

    @Basic
    @Column(name = "RELATION_UNIT_DIVISION_CODE", nullable = true, length = 10)
    public String getRelationUnitDivisionCode() {
        return relationUnitDivisionCode;
    }

    public void setRelationUnitDivisionCode(String relationUnitDivisionCode) {
        this.relationUnitDivisionCode = relationUnitDivisionCode;
    }

    @Basic
    @Column(name = "RELATION_UNIT_LEVEL_VALUE", nullable = true, length = 1000)
    public String getRelationUnitLevelValue() {
        return relationUnitLevelValue;
    }

    public void setRelationUnitLevelValue(String relationUnitLevelValue) {
        this.relationUnitLevelValue = relationUnitLevelValue;
    }

    @Basic
    @Column(name = "RETIRE", nullable = true, length = 200)
    public String getRetire() {
        return retire;
    }

    public void setRetire(String retire) {
        this.retire = retire;
    }

    @Basic
    @Column(name = "RETIRE_VALUE", nullable = true, length = 1000)
    public String getRetireValue() {
        return retireValue;
    }

    public void setRetireValue(String retireValue) {
        this.retireValue = retireValue;
    }

    @Basic
    @Column(name = "SPECIAL_IDENTIFICATION", nullable = true, length = 200)
    public String getSpecialIdentification() {
        return specialIdentification;
    }

    public void setSpecialIdentification(String specialIdentification) {
        this.specialIdentification = specialIdentification;
    }

    @Basic
    @Column(name = "SPECIAL_IDENTIFICATION_VALUE", nullable = true, length = 200)
    public String getSpecialIdentificationValue() {
        return specialIdentificationValue;
    }

    public void setSpecialIdentificationValue(String specialIdentificationValue) {
        this.specialIdentificationValue = specialIdentificationValue;
    }

    @Basic
    @Column(name = "SPECIALTY", nullable = true, length = 200)
    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Basic
    @Column(name = "WORK_DATE", nullable = true)
    public Timestamp getWorkDate() {
        return workDate;
    }

    public void setWorkDate(Timestamp workDate) {
        this.workDate = workDate;
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
    @Column(name = "ORG_ID", nullable = true)
    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    @Basic
    @Column(name = "UNIT_ID", nullable = true)
    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }

    @Basic
    @Column(name = "LEVEL_CODE", nullable = true)
    public String getLevelCode() {
        return levelCode;
    }

    public void setLevelCode(String levelCode) {
        this.levelCode = levelCode;
    }

    @Basic
    @Column(name = "UNIT_CODE", nullable = true)
    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }


    @Basic
    @Column(name = "STORE_TIME_FROM_EPLATFORM", nullable = true)
    public Timestamp getStoreTimeFromEplatform() {
        return storeTimeFromEplatform;
    }

    public void setStoreTimeFromEplatform(Timestamp storeTimeFromEplatform) {
        this.storeTimeFromEplatform = storeTimeFromEplatform;
    }


}
