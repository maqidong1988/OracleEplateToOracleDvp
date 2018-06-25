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
@Table(name = "CADRE_INFO_WORK_LOG", catalog = "")
public class CadreInfoWorkLog {
    private String id;
    private Timestamp endDateTime;
    private String occur;
    private Timestamp startDateTime;
    private String workContent;
    private String workPosition;
    private Double workPositionx;
    private Double workPositiony;
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
    @Column(name = "END_DATE_TIME", nullable = true)
    public Timestamp getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(Timestamp endDateTime) {
        this.endDateTime = endDateTime;
    }

    @Basic
    @Column(name = "OCCUR", nullable = true, length = 2)
    public String getOccur() {
        return occur;
    }

    public void setOccur(String occur) {
        this.occur = occur;
    }

    @Basic
    @Column(name = "START_DATE_TIME", nullable = true)
    public Timestamp getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(Timestamp startDateTime) {
        this.startDateTime = startDateTime;
    }

    @Basic
    @Column(name = "WORK_CONTENT", nullable = true, length = 1000)
    public String getWorkContent() {
        return workContent;
    }

    public void setWorkContent(String workContent) {
        this.workContent = workContent;
    }

    @Basic
    @Column(name = "WORK_POSITION", nullable = true, length = 100)
    public String getWorkPosition() {
        return workPosition;
    }

    public void setWorkPosition(String workPosition) {
        this.workPosition = workPosition;
    }

    @Basic
    @Column(name = "WORK_POSITIONX", nullable = true, precision = 6)
    public Double getWorkPositionx() {
        return workPositionx;
    }

    public void setWorkPositionx(Double workPositionx) {
        this.workPositionx = workPositionx;
    }

    @Basic
    @Column(name = "WORK_POSITIONY", nullable = true, precision = 6)
    public Double getWorkPositiony() {
        return workPositiony;
    }

    public void setWorkPositiony(Double workPositiony) {
        this.workPositiony = workPositiony;
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

        CadreInfoWorkLog that = (CadreInfoWorkLog) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (endDateTime != null ? !endDateTime.equals(that.endDateTime) : that.endDateTime != null) return false;
        if (occur != null ? !occur.equals(that.occur) : that.occur != null) return false;
        if (startDateTime != null ? !startDateTime.equals(that.startDateTime) : that.startDateTime != null)
            return false;
        if (workContent != null ? !workContent.equals(that.workContent) : that.workContent != null) return false;
        if (workPosition != null ? !workPosition.equals(that.workPosition) : that.workPosition != null) return false;
        if (workPositionx != null ? !workPositionx.equals(that.workPositionx) : that.workPositionx != null)
            return false;
        if (workPositiony != null ? !workPositiony.equals(that.workPositiony) : that.workPositiony != null)
            return false;
        if (cadreId != null ? !cadreId.equals(that.cadreId) : that.cadreId != null) return false;
        if (storeTimeFromEplatform != null ? !storeTimeFromEplatform.equals(that.storeTimeFromEplatform) : that.storeTimeFromEplatform != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (endDateTime != null ? endDateTime.hashCode() : 0);
        result = 31 * result + (occur != null ? occur.hashCode() : 0);
        result = 31 * result + (startDateTime != null ? startDateTime.hashCode() : 0);
        result = 31 * result + (workContent != null ? workContent.hashCode() : 0);
        result = 31 * result + (workPosition != null ? workPosition.hashCode() : 0);
        result = 31 * result + (workPositionx != null ? workPositionx.hashCode() : 0);
        result = 31 * result + (workPositiony != null ? workPositiony.hashCode() : 0);
        result = 31 * result + (cadreId != null ? cadreId.hashCode() : 0);
        result = 31 * result + (storeTimeFromEplatform != null ? storeTimeFromEplatform.hashCode() : 0);
        return result;
    }
}
