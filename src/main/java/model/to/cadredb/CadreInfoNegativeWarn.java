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
@Table(name = "CADRE_INFO_NEGATIVE_WARN", catalog = "")
public class CadreInfoNegativeWarn {
    private String id;
    private String department;
    private String departmentCode;
    private Timestamp endTime;
    private String record;
    private String recordContent;
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
    @Column(name = "DEPARTMENT", nullable = true, length = 50)
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Basic
    @Column(name = "DEPARTMENT_CODE", nullable = true, length = 10)
    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
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
    @Column(name = "RECORD", nullable = true, length = 2)
    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }

    @Basic
    @Column(name = "RECORD_CONTENT", nullable = true, length = 200)
    public String getRecordContent() {
        return recordContent;
    }

    public void setRecordContent(String recordContent) {
        this.recordContent = recordContent;
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

        CadreInfoNegativeWarn that = (CadreInfoNegativeWarn) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (department != null ? !department.equals(that.department) : that.department != null) return false;
        if (departmentCode != null ? !departmentCode.equals(that.departmentCode) : that.departmentCode != null)
            return false;
        if (endTime != null ? !endTime.equals(that.endTime) : that.endTime != null) return false;
        if (record != null ? !record.equals(that.record) : that.record != null) return false;
        if (recordContent != null ? !recordContent.equals(that.recordContent) : that.recordContent != null)
            return false;
        if (startTime != null ? !startTime.equals(that.startTime) : that.startTime != null) return false;
        if (cadreId != null ? !cadreId.equals(that.cadreId) : that.cadreId != null) return false;
        if (storeTimeFromDip != null ? !storeTimeFromDip.equals(that.storeTimeFromDip) : that.storeTimeFromDip != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (department != null ? department.hashCode() : 0);
        result = 31 * result + (departmentCode != null ? departmentCode.hashCode() : 0);
        result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
        result = 31 * result + (record != null ? record.hashCode() : 0);
        result = 31 * result + (recordContent != null ? recordContent.hashCode() : 0);
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + (cadreId != null ? cadreId.hashCode() : 0);
        result = 31 * result + (storeTimeFromDip != null ? storeTimeFromDip.hashCode() : 0);
        return result;
    }
}
