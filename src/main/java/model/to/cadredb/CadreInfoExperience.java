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
//@Table(name = "CADRE_INFO_EXPERIENCE", catalog = "", schema = "OPS_DVP_DEV")
@Table(name = "CADRE_INFO_EXPERIENCE", catalog = "", schema = "OPS_DVP")
public class CadreInfoExperience {
    private String id;
    private String affiliation;
    private String affiliationValue;
    private String assignChangeType;
    private String assignChangeTypeValue;
    private String assignReason;
    private String assignReasonValue;
    private String assignStatus;
    private String assignStatusValue;
    private String assignWay;
    private String assignWayValue;
    private String demotionReason;
    private String demotionReasonValue;
    private String divisionCode;
    private String divisionCodeValue;
    private String divisionIndustry;
    private String divisionIndustryValue;
    private String divisionType;
    private String divisionTypeValue;
    private String dutyExplain;
    private String dutyName;
    private Integer dutyOrder;
    private String dutyProperty;
    private String dutyPropertyValue;
    private String dutyShort;
    private String dutyStatistic;
    private String dutyStatisticValue;
    private Integer dutyYears;
    private Timestamp effectiveDate;
    private String jobType;
    private String jobTypeValue;
    private Timestamp nominationDate;
    private Integer orderInLeadership;
    private String organizationCode;
    private String organizationLevel;
    private String organizationLevelValue;
    private String organizationName;
    private String partTime;
    private String positionType;
    private String positionTypeValue;
    private Timestamp removalDate;
    private String removalReason;
    private String removalReasonValue;
    private String removalWay;
    private String removalWayValue;
    private String traceId;
    private String work;
    private String workDomain;
    private String workDomainValue;
    private String cadreId;
    private Timestamp storeTimeFromEplatform;
    private String organizationAddress;

    public CadreInfoExperience() {
        super();
    }

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

    public CadreInfoExperience(String organizationCode, String organizationName, String cadreId, Object nominationDate, Object removalDate, String assignStatus) {
        if (organizationCode == null || organizationCode == "") {
            organizationCode = "";
        }
        if (organizationName == null || organizationName == "") {
            organizationName = "";
        }
        this.organizationCode = organizationCode;
        this.organizationName = organizationName;
        this.cadreId = cadreId;
        if (nominationDate != null) {
            this.nominationDate = stringToTimestamp(nominationDate.toString());
        }
        if (removalDate != null) {
            this.removalDate = stringToTimestamp(removalDate.toString());
        }
        this.assignStatus = assignStatus;
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
    @Column(name = "AFFILIATION", nullable = true, length = 200)
    public String getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    @Basic
    @Column(name = "AFFILIATION_VALUE", nullable = true, length = 1000)
    public String getAffiliationValue() {
        return affiliationValue;
    }

    public void setAffiliationValue(String affiliationValue) {
        this.affiliationValue = affiliationValue;
    }

    @Basic
    @Column(name = "ASSIGN_CHANGE_TYPE", nullable = true, length = 200)
    public String getAssignChangeType() {
        return assignChangeType;
    }

    public void setAssignChangeType(String assignChangeType) {
        this.assignChangeType = assignChangeType;
    }

    @Basic
    @Column(name = "ASSIGN_CHANGE_TYPE_VALUE", nullable = true, length = 1000)
    public String getAssignChangeTypeValue() {
        return assignChangeTypeValue;
    }

    public void setAssignChangeTypeValue(String assignChangeTypeValue) {
        this.assignChangeTypeValue = assignChangeTypeValue;
    }

    @Basic
    @Column(name = "ASSIGN_REASON", nullable = true, length = 200)
    public String getAssignReason() {
        return assignReason;
    }

    public void setAssignReason(String assignReason) {
        this.assignReason = assignReason;
    }

    @Basic
    @Column(name = "ASSIGN_REASON_VALUE", nullable = true, length = 1000)
    public String getAssignReasonValue() {
        return assignReasonValue;
    }

    public void setAssignReasonValue(String assignReasonValue) {
        this.assignReasonValue = assignReasonValue;
    }

    @Basic
    @Column(name = "ASSIGN_STATUS", nullable = true, length = 200)
    public String getAssignStatus() {
        return assignStatus;
    }

    public void setAssignStatus(String assignStatus) {
        this.assignStatus = assignStatus;
    }

    @Basic
    @Column(name = "ASSIGN_STATUS_VALUE", nullable = true, length = 1000)
    public String getAssignStatusValue() {
        return assignStatusValue;
    }

    public void setAssignStatusValue(String assignStatusValue) {
        this.assignStatusValue = assignStatusValue;
    }

    @Basic
    @Column(name = "ASSIGN_WAY", nullable = true, length = 200)
    public String getAssignWay() {
        return assignWay;
    }

    public void setAssignWay(String assignWay) {
        this.assignWay = assignWay;
    }

    @Basic
    @Column(name = "ASSIGN_WAY_VALUE", nullable = true, length = 1000)
    public String getAssignWayValue() {
        return assignWayValue;
    }

    public void setAssignWayValue(String assignWayValue) {
        this.assignWayValue = assignWayValue;
    }

    @Basic
    @Column(name = "DEMOTION_REASON", nullable = true, length = 200)
    public String getDemotionReason() {
        return demotionReason;
    }

    public void setDemotionReason(String demotionReason) {
        this.demotionReason = demotionReason;
    }

    @Basic
    @Column(name = "DEMOTION_REASON_VALUE", nullable = true, length = 1000)
    public String getDemotionReasonValue() {
        return demotionReasonValue;
    }

    public void setDemotionReasonValue(String demotionReasonValue) {
        this.demotionReasonValue = demotionReasonValue;
    }

    @Basic
    @Column(name = "DIVISION_CODE", nullable = true, length = 200)
    public String getDivisionCode() {
        return divisionCode;
    }

    public void setDivisionCode(String divisionCode) {
        this.divisionCode = divisionCode;
    }

    @Basic
    @Column(name = "DIVISION_CODE_VALUE", nullable = true, length = 1000)
    public String getDivisionCodeValue() {
        return divisionCodeValue;
    }

    public void setDivisionCodeValue(String divisionCodeValue) {
        this.divisionCodeValue = divisionCodeValue;
    }

    @Basic
    @Column(name = "DIVISION_INDUSTRY", nullable = true, length = 200)
    public String getDivisionIndustry() {
        return divisionIndustry;
    }

    public void setDivisionIndustry(String divisionIndustry) {
        this.divisionIndustry = divisionIndustry;
    }

    @Basic
    @Column(name = "DIVISION_INDUSTRY_VALUE", nullable = true, length = 1000)
    public String getDivisionIndustryValue() {
        return divisionIndustryValue;
    }

    public void setDivisionIndustryValue(String divisionIndustryValue) {
        this.divisionIndustryValue = divisionIndustryValue;
    }

    @Basic
    @Column(name = "DIVISION_TYPE", nullable = true, length = 200)
    public String getDivisionType() {
        return divisionType;
    }

    public void setDivisionType(String divisionType) {
        this.divisionType = divisionType;
    }

    @Basic
    @Column(name = "DIVISION_TYPE_VALUE", nullable = true, length = 1000)
    public String getDivisionTypeValue() {
        return divisionTypeValue;
    }

    public void setDivisionTypeValue(String divisionTypeValue) {
        this.divisionTypeValue = divisionTypeValue;
    }

    @Basic
    @Column(name = "DUTY_EXPLAIN", nullable = true, length = 4000)
    public String getDutyExplain() {
        return dutyExplain;
    }

    public void setDutyExplain(String dutyExplain) {
        this.dutyExplain = dutyExplain;
    }

    @Basic
    @Column(name = "DUTY_NAME", nullable = true, length = 1000)
    public String getDutyName() {
        return dutyName;
    }

    public void setDutyName(String dutyName) {
        this.dutyName = dutyName;
    }

    @Basic
    @Column(name = "DUTY_ORDER", nullable = true, precision = 0)
    public Integer getDutyOrder() {
        return dutyOrder;
    }

    public void setDutyOrder(Integer dutyOrder) {
        this.dutyOrder = dutyOrder;
    }

    @Basic
    @Column(name = "DUTY_PROPERTY", nullable = true, length = 200)
    public String getDutyProperty() {
        return dutyProperty;
    }

    public void setDutyProperty(String dutyProperty) {
        this.dutyProperty = dutyProperty;
    }

    @Basic
    @Column(name = "DUTY_PROPERTY_VALUE", nullable = true, length = 1000)
    public String getDutyPropertyValue() {
        return dutyPropertyValue;
    }

    public void setDutyPropertyValue(String dutyPropertyValue) {
        this.dutyPropertyValue = dutyPropertyValue;
    }

    @Basic
    @Column(name = "DUTY_SHORT", nullable = true, length = 20)
    public String getDutyShort() {
        return dutyShort;
    }

    public void setDutyShort(String dutyShort) {
        this.dutyShort = dutyShort;
    }

    @Basic
    @Column(name = "DUTY_STATISTIC", nullable = true, length = 200)
    public String getDutyStatistic() {
        return dutyStatistic;
    }

    public void setDutyStatistic(String dutyStatistic) {
        this.dutyStatistic = dutyStatistic;
    }

    @Basic
    @Column(name = "DUTY_STATISTIC_VALUE", nullable = true, length = 1000)
    public String getDutyStatisticValue() {
        return dutyStatisticValue;
    }

    public void setDutyStatisticValue(String dutyStatisticValue) {
        this.dutyStatisticValue = dutyStatisticValue;
    }

    @Basic
    @Column(name = "DUTY_YEARS", nullable = true, precision = 0)
    public Integer getDutyYears() {
        return dutyYears;
    }

    public void setDutyYears(Integer dutyYears) {
        this.dutyYears = dutyYears;
    }

    @Basic
    @Column(name = "EFFECTIVE_DATE", nullable = true)
    public Timestamp getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Timestamp effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    @Basic
    @Column(name = "JOB_TYPE", nullable = true, length = 4)
    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    @Basic
    @Column(name = "JOB_TYPE_VALUE", nullable = true, length = 1000)
    public String getJobTypeValue() {
        return jobTypeValue;
    }

    public void setJobTypeValue(String jobTypeValue) {
        this.jobTypeValue = jobTypeValue;
    }

    @Basic
    @Column(name = "NOMINATION_DATE", nullable = true)
    public Timestamp getNominationDate() {
        return nominationDate;
    }

    public void setNominationDate(Timestamp nominationDate) {
        this.nominationDate = nominationDate;
    }

    @Basic
    @Column(name = "ORDER_IN_LEADERSHIP", nullable = true, precision = 0)
    public Integer getOrderInLeadership() {
        return orderInLeadership;
    }

    public void setOrderInLeadership(Integer orderInLeadership) {
        this.orderInLeadership = orderInLeadership;
    }

    @Basic
    @Column(name = "ORGANIZATION_CODE", nullable = true, length = 1000)
    public String getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    @Basic
    @Column(name = "ORGANIZATION_LEVEL", nullable = true, length = 200)
    public String getOrganizationLevel() {
        return organizationLevel;
    }

    public void setOrganizationLevel(String organizationLevel) {
        this.organizationLevel = organizationLevel;
    }

    @Basic
    @Column(name = "ORGANIZATION_LEVEL_VALUE", nullable = true, length = 1000)
    public String getOrganizationLevelValue() {
        return organizationLevelValue;
    }

    public void setOrganizationLevelValue(String organizationLevelValue) {
        this.organizationLevelValue = organizationLevelValue;
    }

    @Basic
    @Column(name = "ORGANIZATION_NAME", nullable = true, length = 1000)
    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    @Basic
    @Column(name = "PART_TIME", nullable = true, length = 4000)
    public String getPartTime() {
        return partTime;
    }

    public void setPartTime(String partTime) {
        this.partTime = partTime;
    }

    @Basic
    @Column(name = "POSITION_TYPE", nullable = true, length = 200)
    public String getPositionType() {
        return positionType;
    }

    public void setPositionType(String positionType) {
        this.positionType = positionType;
    }

    @Basic
    @Column(name = "POSITION_TYPE_VALUE", nullable = true, length = 1000)
    public String getPositionTypeValue() {
        return positionTypeValue;
    }

    public void setPositionTypeValue(String positionTypeValue) {
        this.positionTypeValue = positionTypeValue;
    }

    @Basic
    @Column(name = "REMOVAL_DATE", nullable = true)
    public Timestamp getRemovalDate() {
        return removalDate;
    }

    public void setRemovalDate(Timestamp removalDate) {
        this.removalDate = removalDate;
    }

    @Basic
    @Column(name = "REMOVAL_REASON", nullable = true, length = 200)
    public String getRemovalReason() {
        return removalReason;
    }

    public void setRemovalReason(String removalReason) {
        this.removalReason = removalReason;
    }

    @Basic
    @Column(name = "REMOVAL_REASON_VALUE", nullable = true, length = 1000)
    public String getRemovalReasonValue() {
        return removalReasonValue;
    }

    public void setRemovalReasonValue(String removalReasonValue) {
        this.removalReasonValue = removalReasonValue;
    }

    @Basic
    @Column(name = "REMOVAL_WAY", nullable = true, length = 200)
    public String getRemovalWay() {
        return removalWay;
    }

    public void setRemovalWay(String removalWay) {
        this.removalWay = removalWay;
    }

    @Basic
    @Column(name = "REMOVAL_WAY_VALUE", nullable = true, length = 200)
    public String getRemovalWayValue() {
        return removalWayValue;
    }

    public void setRemovalWayValue(String removalWayValue) {
        this.removalWayValue = removalWayValue;
    }

    @Basic
    @Column(name = "TRACE_ID", nullable = true, length = 36)
    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    @Basic
    @Column(name = "WORK", nullable = true, length = 1000)
    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Basic
    @Column(name = "WORK_DOMAIN", nullable = true, length = 200)
    public String getWorkDomain() {
        return workDomain;
    }

    public void setWorkDomain(String workDomain) {
        this.workDomain = workDomain;
    }

    @Basic
    @Column(name = "WORK_DOMAIN_VALUE", nullable = true, length = 1000)
    public String getWorkDomainValue() {
        return workDomainValue;
    }

    public void setWorkDomainValue(String workDomainValue) {
        this.workDomainValue = workDomainValue;
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

        CadreInfoExperience that = (CadreInfoExperience) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (affiliation != null ? !affiliation.equals(that.affiliation) : that.affiliation != null) return false;
        if (affiliationValue != null ? !affiliationValue.equals(that.affiliationValue) : that.affiliationValue != null)
            return false;
        if (assignChangeType != null ? !assignChangeType.equals(that.assignChangeType) : that.assignChangeType != null)
            return false;
        if (assignChangeTypeValue != null ? !assignChangeTypeValue.equals(that.assignChangeTypeValue) : that.assignChangeTypeValue != null)
            return false;
        if (assignReason != null ? !assignReason.equals(that.assignReason) : that.assignReason != null) return false;
        if (assignReasonValue != null ? !assignReasonValue.equals(that.assignReasonValue) : that.assignReasonValue != null)
            return false;
        if (assignStatus != null ? !assignStatus.equals(that.assignStatus) : that.assignStatus != null) return false;
        if (assignStatusValue != null ? !assignStatusValue.equals(that.assignStatusValue) : that.assignStatusValue != null)
            return false;
        if (assignWay != null ? !assignWay.equals(that.assignWay) : that.assignWay != null) return false;
        if (assignWayValue != null ? !assignWayValue.equals(that.assignWayValue) : that.assignWayValue != null)
            return false;
        if (demotionReason != null ? !demotionReason.equals(that.demotionReason) : that.demotionReason != null)
            return false;
        if (demotionReasonValue != null ? !demotionReasonValue.equals(that.demotionReasonValue) : that.demotionReasonValue != null)
            return false;
        if (divisionCode != null ? !divisionCode.equals(that.divisionCode) : that.divisionCode != null) return false;
        if (divisionCodeValue != null ? !divisionCodeValue.equals(that.divisionCodeValue) : that.divisionCodeValue != null)
            return false;
        if (divisionIndustry != null ? !divisionIndustry.equals(that.divisionIndustry) : that.divisionIndustry != null)
            return false;
        if (divisionIndustryValue != null ? !divisionIndustryValue.equals(that.divisionIndustryValue) : that.divisionIndustryValue != null)
            return false;
        if (divisionType != null ? !divisionType.equals(that.divisionType) : that.divisionType != null) return false;
        if (divisionTypeValue != null ? !divisionTypeValue.equals(that.divisionTypeValue) : that.divisionTypeValue != null)
            return false;
        if (dutyExplain != null ? !dutyExplain.equals(that.dutyExplain) : that.dutyExplain != null) return false;
        if (dutyName != null ? !dutyName.equals(that.dutyName) : that.dutyName != null) return false;
        if (dutyOrder != null ? !dutyOrder.equals(that.dutyOrder) : that.dutyOrder != null) return false;
        if (dutyProperty != null ? !dutyProperty.equals(that.dutyProperty) : that.dutyProperty != null) return false;
        if (dutyPropertyValue != null ? !dutyPropertyValue.equals(that.dutyPropertyValue) : that.dutyPropertyValue != null)
            return false;
        if (dutyShort != null ? !dutyShort.equals(that.dutyShort) : that.dutyShort != null) return false;
        if (dutyStatistic != null ? !dutyStatistic.equals(that.dutyStatistic) : that.dutyStatistic != null)
            return false;
        if (dutyStatisticValue != null ? !dutyStatisticValue.equals(that.dutyStatisticValue) : that.dutyStatisticValue != null)
            return false;
        if (dutyYears != null ? !dutyYears.equals(that.dutyYears) : that.dutyYears != null) return false;
        if (effectiveDate != null ? !effectiveDate.equals(that.effectiveDate) : that.effectiveDate != null)
            return false;
        if (jobType != null ? !jobType.equals(that.jobType) : that.jobType != null) return false;
        if (jobTypeValue != null ? !jobTypeValue.equals(that.jobTypeValue) : that.jobTypeValue != null) return false;
        if (nominationDate != null ? !nominationDate.equals(that.nominationDate) : that.nominationDate != null)
            return false;
        if (orderInLeadership != null ? !orderInLeadership.equals(that.orderInLeadership) : that.orderInLeadership != null)
            return false;
        if (organizationCode != null ? !organizationCode.equals(that.organizationCode) : that.organizationCode != null)
            return false;
        if (organizationLevel != null ? !organizationLevel.equals(that.organizationLevel) : that.organizationLevel != null)
            return false;
        if (organizationLevelValue != null ? !organizationLevelValue.equals(that.organizationLevelValue) : that.organizationLevelValue != null)
            return false;
        if (organizationName != null ? !organizationName.equals(that.organizationName) : that.organizationName != null)
            return false;
        if (partTime != null ? !partTime.equals(that.partTime) : that.partTime != null) return false;
        if (positionType != null ? !positionType.equals(that.positionType) : that.positionType != null) return false;
        if (positionTypeValue != null ? !positionTypeValue.equals(that.positionTypeValue) : that.positionTypeValue != null)
            return false;
        if (removalDate != null ? !removalDate.equals(that.removalDate) : that.removalDate != null) return false;
        if (removalReason != null ? !removalReason.equals(that.removalReason) : that.removalReason != null)
            return false;
        if (removalReasonValue != null ? !removalReasonValue.equals(that.removalReasonValue) : that.removalReasonValue != null)
            return false;
        if (removalWay != null ? !removalWay.equals(that.removalWay) : that.removalWay != null) return false;
        if (removalWayValue != null ? !removalWayValue.equals(that.removalWayValue) : that.removalWayValue != null)
            return false;
        if (traceId != null ? !traceId.equals(that.traceId) : that.traceId != null) return false;
        if (work != null ? !work.equals(that.work) : that.work != null) return false;
        if (workDomain != null ? !workDomain.equals(that.workDomain) : that.workDomain != null) return false;
        if (workDomainValue != null ? !workDomainValue.equals(that.workDomainValue) : that.workDomainValue != null)
            return false;
        if (cadreId != null ? !cadreId.equals(that.cadreId) : that.cadreId != null) return false;
        if (storeTimeFromEplatform != null ? !storeTimeFromEplatform.equals(that.storeTimeFromEplatform) : that.storeTimeFromEplatform != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (affiliation != null ? affiliation.hashCode() : 0);
        result = 31 * result + (affiliationValue != null ? affiliationValue.hashCode() : 0);
        result = 31 * result + (assignChangeType != null ? assignChangeType.hashCode() : 0);
        result = 31 * result + (assignChangeTypeValue != null ? assignChangeTypeValue.hashCode() : 0);
        result = 31 * result + (assignReason != null ? assignReason.hashCode() : 0);
        result = 31 * result + (assignReasonValue != null ? assignReasonValue.hashCode() : 0);
        result = 31 * result + (assignStatus != null ? assignStatus.hashCode() : 0);
        result = 31 * result + (assignStatusValue != null ? assignStatusValue.hashCode() : 0);
        result = 31 * result + (assignWay != null ? assignWay.hashCode() : 0);
        result = 31 * result + (assignWayValue != null ? assignWayValue.hashCode() : 0);
        result = 31 * result + (demotionReason != null ? demotionReason.hashCode() : 0);
        result = 31 * result + (demotionReasonValue != null ? demotionReasonValue.hashCode() : 0);
        result = 31 * result + (divisionCode != null ? divisionCode.hashCode() : 0);
        result = 31 * result + (divisionCodeValue != null ? divisionCodeValue.hashCode() : 0);
        result = 31 * result + (divisionIndustry != null ? divisionIndustry.hashCode() : 0);
        result = 31 * result + (divisionIndustryValue != null ? divisionIndustryValue.hashCode() : 0);
        result = 31 * result + (divisionType != null ? divisionType.hashCode() : 0);
        result = 31 * result + (divisionTypeValue != null ? divisionTypeValue.hashCode() : 0);
        result = 31 * result + (dutyExplain != null ? dutyExplain.hashCode() : 0);
        result = 31 * result + (dutyName != null ? dutyName.hashCode() : 0);
        result = 31 * result + (dutyOrder != null ? dutyOrder.hashCode() : 0);
        result = 31 * result + (dutyProperty != null ? dutyProperty.hashCode() : 0);
        result = 31 * result + (dutyPropertyValue != null ? dutyPropertyValue.hashCode() : 0);
        result = 31 * result + (dutyShort != null ? dutyShort.hashCode() : 0);
        result = 31 * result + (dutyStatistic != null ? dutyStatistic.hashCode() : 0);
        result = 31 * result + (dutyStatisticValue != null ? dutyStatisticValue.hashCode() : 0);
        result = 31 * result + (dutyYears != null ? dutyYears.hashCode() : 0);
        result = 31 * result + (effectiveDate != null ? effectiveDate.hashCode() : 0);
        result = 31 * result + (jobType != null ? jobType.hashCode() : 0);
        result = 31 * result + (jobTypeValue != null ? jobTypeValue.hashCode() : 0);
        result = 31 * result + (nominationDate != null ? nominationDate.hashCode() : 0);
        result = 31 * result + (orderInLeadership != null ? orderInLeadership.hashCode() : 0);
        result = 31 * result + (organizationCode != null ? organizationCode.hashCode() : 0);
        result = 31 * result + (organizationLevel != null ? organizationLevel.hashCode() : 0);
        result = 31 * result + (organizationLevelValue != null ? organizationLevelValue.hashCode() : 0);
        result = 31 * result + (organizationName != null ? organizationName.hashCode() : 0);
        result = 31 * result + (partTime != null ? partTime.hashCode() : 0);
        result = 31 * result + (positionType != null ? positionType.hashCode() : 0);
        result = 31 * result + (positionTypeValue != null ? positionTypeValue.hashCode() : 0);
        result = 31 * result + (removalDate != null ? removalDate.hashCode() : 0);
        result = 31 * result + (removalReason != null ? removalReason.hashCode() : 0);
        result = 31 * result + (removalReasonValue != null ? removalReasonValue.hashCode() : 0);
        result = 31 * result + (removalWay != null ? removalWay.hashCode() : 0);
        result = 31 * result + (removalWayValue != null ? removalWayValue.hashCode() : 0);
        result = 31 * result + (traceId != null ? traceId.hashCode() : 0);
        result = 31 * result + (work != null ? work.hashCode() : 0);
        result = 31 * result + (workDomain != null ? workDomain.hashCode() : 0);
        result = 31 * result + (workDomainValue != null ? workDomainValue.hashCode() : 0);
        result = 31 * result + (cadreId != null ? cadreId.hashCode() : 0);
        result = 31 * result + (storeTimeFromEplatform != null ? storeTimeFromEplatform.hashCode() : 0);
        return result;
    }

    @Basic
    @Column(name = "ORGANIZATION_ADDRESS", nullable = true, length = 160)
    public String getOrganizationAddress() {
        return organizationAddress;
    }

    public void setOrganizationAddress(String organizationAddress) {
        this.organizationAddress = organizationAddress;
    }
}
