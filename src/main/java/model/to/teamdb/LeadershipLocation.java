package model.to.teamdb;

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
@Table(name = "LEADERSHIP_LOCATION", catalog = "")
public class LeadershipLocation {
    private String id;
    private String isNewest;
    private String pointName;
    private Long pointx;
    private Long pointy;
    private Timestamp recordTime;
    private String leadershipOverviewId;
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
    @Column(name = "IS_NEWEST", nullable = true, length = 3)
    public String getIsNewest() {
        return isNewest;
    }

    public void setIsNewest(String isNewest) {
        this.isNewest = isNewest;
    }

    @Basic
    @Column(name = "POINT_NAME", nullable = true, length = 1000)
    public String getPointName() {
        return pointName;
    }

    public void setPointName(String pointName) {
        this.pointName = pointName;
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
    @Column(name = "RECORD_TIME", nullable = true)
    public Timestamp getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Timestamp recordTime) {
        this.recordTime = recordTime;
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

        LeadershipLocation that = (LeadershipLocation) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (isNewest != null ? !isNewest.equals(that.isNewest) : that.isNewest != null) return false;
        if (pointName != null ? !pointName.equals(that.pointName) : that.pointName != null) return false;
        if (pointx != null ? !pointx.equals(that.pointx) : that.pointx != null) return false;
        if (pointy != null ? !pointy.equals(that.pointy) : that.pointy != null) return false;
        if (recordTime != null ? !recordTime.equals(that.recordTime) : that.recordTime != null) return false;
        if (leadershipOverviewId != null ? !leadershipOverviewId.equals(that.leadershipOverviewId) : that.leadershipOverviewId != null)
            return false;
        if (storeTimeFromEplatform != null ? !storeTimeFromEplatform.equals(that.storeTimeFromEplatform) : that.storeTimeFromEplatform != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (isNewest != null ? isNewest.hashCode() : 0);
        result = 31 * result + (pointName != null ? pointName.hashCode() : 0);
        result = 31 * result + (pointx != null ? pointx.hashCode() : 0);
        result = 31 * result + (pointy != null ? pointy.hashCode() : 0);
        result = 31 * result + (recordTime != null ? recordTime.hashCode() : 0);
        result = 31 * result + (leadershipOverviewId != null ? leadershipOverviewId.hashCode() : 0);
        result = 31 * result + (storeTimeFromEplatform != null ? storeTimeFromEplatform.hashCode() : 0);
        return result;
    }
}
