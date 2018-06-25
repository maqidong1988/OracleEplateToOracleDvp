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
@Table(name = "CADRE_INFO_TRACE", catalog = "")
public class CadreInfoTrace {
    private String id;
    private Timestamp endTime;
    private String pointName;
    private String pointType;
    private Integer pointWeight;
    private Long pointx;
    private Long pointy;
    private Timestamp startTime;
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
    @Column(name = "END_TIME", nullable = true)
    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    @Basic
    @Column(name = "POINT_NAME", nullable = true, length = 200)
    public String getPointName() {
        return pointName;
    }

    public void setPointName(String pointName) {
        this.pointName = pointName;
    }

    @Basic
    @Column(name = "POINT_TYPE", nullable = true, length = 2)
    public String getPointType() {
        return pointType;
    }

    public void setPointType(String pointType) {
        this.pointType = pointType;
    }

    @Basic
    @Column(name = "POINT_WEIGHT", nullable = true, precision = 0)
    public Integer getPointWeight() {
        return pointWeight;
    }

    public void setPointWeight(Integer pointWeight) {
        this.pointWeight = pointWeight;
    }

    @Basic
    @Column(name = "POINTX", nullable = true, precision = 6)
    public Long getPointx() {
        return pointx;
    }

    public void setPointx(Long pointx) {
        this.pointx = pointx;
    }

    @Basic
    @Column(name = "POINTY", nullable = true, precision = 6)
    public Long getPointy() {
        return pointy;
    }

    public void setPointy(Long pointy) {
        this.pointy = pointy;
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

        CadreInfoTrace that = (CadreInfoTrace) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (endTime != null ? !endTime.equals(that.endTime) : that.endTime != null) return false;
        if (pointName != null ? !pointName.equals(that.pointName) : that.pointName != null) return false;
        if (pointType != null ? !pointType.equals(that.pointType) : that.pointType != null) return false;
        if (pointWeight != null ? !pointWeight.equals(that.pointWeight) : that.pointWeight != null) return false;
        if (pointx != null ? !pointx.equals(that.pointx) : that.pointx != null) return false;
        if (pointy != null ? !pointy.equals(that.pointy) : that.pointy != null) return false;
        if (startTime != null ? !startTime.equals(that.startTime) : that.startTime != null) return false;
        if (cadreId != null ? !cadreId.equals(that.cadreId) : that.cadreId != null) return false;
        if (storeTimeFromEplatform != null ? !storeTimeFromEplatform.equals(that.storeTimeFromEplatform) : that.storeTimeFromEplatform != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
        result = 31 * result + (pointName != null ? pointName.hashCode() : 0);
        result = 31 * result + (pointType != null ? pointType.hashCode() : 0);
        result = 31 * result + (pointWeight != null ? pointWeight.hashCode() : 0);
        result = 31 * result + (pointx != null ? pointx.hashCode() : 0);
        result = 31 * result + (pointy != null ? pointy.hashCode() : 0);
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + (cadreId != null ? cadreId.hashCode() : 0);
        result = 31 * result + (storeTimeFromEplatform != null ? storeTimeFromEplatform.hashCode() : 0);
        return result;
    }
}
