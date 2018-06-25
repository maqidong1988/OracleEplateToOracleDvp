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
@Table(name = "CADRE_INFO_NEGATIVE_WARNING", catalog = "")
public class CadreInfoNegativeWarning {
    private String id;
    private String auditDepartment;
    private String comprehensiveManagement;
    private String disciplineInspection;
    private Timestamp endTime;
    private String healthInspection;
    private String land;
    private String lawProcurator;
    private String organization;
    private String others;
    private String police;
    private Timestamp startTime;
    private String cadreId;
    private Timestamp storeTimeFromDip;

    @Id
    @Column(name = "ID", nullable = false, length = 36)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "AUDIT_DEPARTMENT", nullable = true, length = 2)
    public String getAuditDepartment() {
        return auditDepartment;
    }

    public void setAuditDepartment(String auditDepartment) {
        this.auditDepartment = auditDepartment;
    }

    @Basic
    @Column(name = "COMPREHENSIVE_MANAGEMENT", nullable = true, length = 2)
    public String getComprehensiveManagement() {
        return comprehensiveManagement;
    }

    public void setComprehensiveManagement(String comprehensiveManagement) {
        this.comprehensiveManagement = comprehensiveManagement;
    }

    @Basic
    @Column(name = "DISCIPLINE_INSPECTION", nullable = true, length = 2)
    public String getDisciplineInspection() {
        return disciplineInspection;
    }

    public void setDisciplineInspection(String disciplineInspection) {
        this.disciplineInspection = disciplineInspection;
    }

    @Basic
    @Column(name = "END_TIME", nullable = true)
    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    @Basic
    @Column(name = "HEALTH_INSPECTION", nullable = true, length = 2)
    public String getHealthInspection() {
        return healthInspection;
    }

    public void setHealthInspection(String healthInspection) {
        this.healthInspection = healthInspection;
    }

    @Basic
    @Column(name = "LAND", nullable = true, length = 2)
    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }

    @Basic
    @Column(name = "LAW_PROCURATOR", nullable = true, length = 2)
    public String getLawProcurator() {
        return lawProcurator;
    }

    public void setLawProcurator(String lawProcurator) {
        this.lawProcurator = lawProcurator;
    }

    @Basic
    @Column(name = "ORGANIZATION", nullable = true, length = 2)
    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    @Basic
    @Column(name = "OTHERS", nullable = true, length = 2)
    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    @Basic
    @Column(name = "POLICE", nullable = true, length = 2)
    public String getPolice() {
        return police;
    }

    public void setPolice(String police) {
        this.police = police;
    }

    @Basic
    @Column(name = "START_TIME", nullable = true)
    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
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
    @Column(name = "STORE_TIME_FROM_DIP", nullable = true)
    public Timestamp getStoreTimeFromDip() {
        return storeTimeFromDip;
    }

    public void setStoreTimeFromDip(Timestamp storeTimeFromDip) {
        this.storeTimeFromDip = storeTimeFromDip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CadreInfoNegativeWarning that = (CadreInfoNegativeWarning) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (auditDepartment != null ? !auditDepartment.equals(that.auditDepartment) : that.auditDepartment != null)
            return false;
        if (comprehensiveManagement != null ? !comprehensiveManagement.equals(that.comprehensiveManagement) : that.comprehensiveManagement != null)
            return false;
        if (disciplineInspection != null ? !disciplineInspection.equals(that.disciplineInspection) : that.disciplineInspection != null)
            return false;
        if (endTime != null ? !endTime.equals(that.endTime) : that.endTime != null) return false;
        if (healthInspection != null ? !healthInspection.equals(that.healthInspection) : that.healthInspection != null)
            return false;
        if (land != null ? !land.equals(that.land) : that.land != null) return false;
        if (lawProcurator != null ? !lawProcurator.equals(that.lawProcurator) : that.lawProcurator != null)
            return false;
        if (organization != null ? !organization.equals(that.organization) : that.organization != null) return false;
        if (others != null ? !others.equals(that.others) : that.others != null) return false;
        if (police != null ? !police.equals(that.police) : that.police != null) return false;
        if (startTime != null ? !startTime.equals(that.startTime) : that.startTime != null) return false;
        if (cadreId != null ? !cadreId.equals(that.cadreId) : that.cadreId != null) return false;
        if (storeTimeFromDip != null ? !storeTimeFromDip.equals(that.storeTimeFromDip) : that.storeTimeFromDip != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (auditDepartment != null ? auditDepartment.hashCode() : 0);
        result = 31 * result + (comprehensiveManagement != null ? comprehensiveManagement.hashCode() : 0);
        result = 31 * result + (disciplineInspection != null ? disciplineInspection.hashCode() : 0);
        result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
        result = 31 * result + (healthInspection != null ? healthInspection.hashCode() : 0);
        result = 31 * result + (land != null ? land.hashCode() : 0);
        result = 31 * result + (lawProcurator != null ? lawProcurator.hashCode() : 0);
        result = 31 * result + (organization != null ? organization.hashCode() : 0);
        result = 31 * result + (others != null ? others.hashCode() : 0);
        result = 31 * result + (police != null ? police.hashCode() : 0);
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + (cadreId != null ? cadreId.hashCode() : 0);
        result = 31 * result + (storeTimeFromDip != null ? storeTimeFromDip.hashCode() : 0);
        return result;
    }
}
