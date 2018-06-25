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
@Table(name = "CADRE_INFO_DUTY_LEVEL", catalog = "")
public class CadreInfoDutyLevel {
    private String id;
    private String currentRankMark;
    private String rankCode;
    private String rankName;
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
    @Column(name = "CURRENT_RANK_MARK", nullable = true, length = 200)
    public String getCurrentRankMark() {
        return currentRankMark;
    }

    public void setCurrentRankMark(String currentRankMark) {
        this.currentRankMark = currentRankMark;
    }

    @Basic
    @Column(name = "RANK_CODE", nullable = true, length = 20)
    public String getRankCode() {
        return rankCode;
    }

    public void setRankCode(String rankCode) {
        this.rankCode = rankCode;
    }

    @Basic
    @Column(name = "RANK_NAME", nullable = true, length = 120)
    public String getRankName() {
        return rankName;
    }

    public void setRankName(String rankName) {
        this.rankName = rankName;
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

        CadreInfoDutyLevel that = (CadreInfoDutyLevel) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (currentRankMark != null ? !currentRankMark.equals(that.currentRankMark) : that.currentRankMark != null)
            return false;
        if (rankCode != null ? !rankCode.equals(that.rankCode) : that.rankCode != null) return false;
        if (rankName != null ? !rankName.equals(that.rankName) : that.rankName != null) return false;
        if (cadreId != null ? !cadreId.equals(that.cadreId) : that.cadreId != null) return false;
        if (storeTimeFromEplatform != null ? !storeTimeFromEplatform.equals(that.storeTimeFromEplatform) : that.storeTimeFromEplatform != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (currentRankMark != null ? currentRankMark.hashCode() : 0);
        result = 31 * result + (rankCode != null ? rankCode.hashCode() : 0);
        result = 31 * result + (rankName != null ? rankName.hashCode() : 0);
        result = 31 * result + (cadreId != null ? cadreId.hashCode() : 0);
        result = 31 * result + (storeTimeFromEplatform != null ? storeTimeFromEplatform.hashCode() : 0);
        return result;
    }
}
