package model.from;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Arrays;

/**
 * Created by Jay on 2018/1/23.
 *
 * @author Jay
 * @version 1.0
 * @since 1.0
 * Copyright (C) 2017. SinoSoft All Rights Received
 */
@Entity
@Table(name = "DEP_B04", catalog = "")
public class DepB04 {
    private String b04007;
    private String b04011;
    private String b04001;
    private String b04004;
    private String status2;
    private Long seqid;
    private String depId;
    private String subId;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private String b04017;
    private String b04021;
    private Long ordinal;
    private long status;
    private Timestamp createdTime;
    private byte[] createdBy;
    private Timestamp lastModifiedTime;
    private byte[] lastModifiedBy;

    @Basic
    @Column(name = "B04007", nullable = true, length = 16)
    public String getB04007() {
        return b04007;
    }

    public void setB04007(String b04007) {
        this.b04007 = b04007;
    }

    @Basic
    @Column(name = "B04011", nullable = true, length = 16)
    public String getB04011() {
        return b04011;
    }

    public void setB04011(String b04011) {
        this.b04011 = b04011;
    }

    @Basic
    @Column(name = "B04001", nullable = true, length = 6)
    public String getB04001() {
        return b04001;
    }

    public void setB04001(String b04001) {
        this.b04001 = b04001;
    }

    @Basic
    @Column(name = "B04004", nullable = true, length = 80)
    public String getB04004() {
        return b04004;
    }

    public void setB04004(String b04004) {
        this.b04004 = b04004;
    }

    @Basic
    @Column(name = "STATUS2", nullable = true, length = 30)
    public String getStatus2() {
        return status2;
    }

    public void setStatus2(String status2) {
        this.status2 = status2;
    }

    @Basic
    @Column(name = "SEQID", nullable = true, precision = 0)
    public Long getSeqid() {
        return seqid;
    }

    public void setSeqid(Long seqid) {
        this.seqid = seqid;
    }

    @Basic
    @Column(name = "DEP_ID", nullable = true, length = 50)
    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    @Id
    @Column(name = "SUB_ID", nullable = true, length = 50)
    public String getSubId() {
        return subId;
    }

    public void setSubId(String subId) {
        this.subId = subId;
    }

    @Basic
    @Column(name = "LAST_UPDATED_STAMP", nullable = true)
    public Timestamp getLastUpdatedStamp() {
        return lastUpdatedStamp;
    }

    public void setLastUpdatedStamp(Timestamp lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }

    @Basic
    @Column(name = "LAST_UPDATED_TX_STAMP", nullable = true)
    public Timestamp getLastUpdatedTxStamp() {
        return lastUpdatedTxStamp;
    }

    public void setLastUpdatedTxStamp(Timestamp lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }

    @Basic
    @Column(name = "CREATED_STAMP", nullable = true)
    public Timestamp getCreatedStamp() {
        return createdStamp;
    }

    public void setCreatedStamp(Timestamp createdStamp) {
        this.createdStamp = createdStamp;
    }

    @Basic
    @Column(name = "CREATED_TX_STAMP", nullable = true)
    public Timestamp getCreatedTxStamp() {
        return createdTxStamp;
    }

    public void setCreatedTxStamp(Timestamp createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

    @Basic
    @Column(name = "B04017", nullable = true, length = 4000)
    public String getB04017() {
        return b04017;
    }

    public void setB04017(String b04017) {
        this.b04017 = b04017;
    }

    @Basic
    @Column(name = "B04021", nullable = true, length = 4000)
    public String getB04021() {
        return b04021;
    }

    public void setB04021(String b04021) {
        this.b04021 = b04021;
    }

    @Basic
    @Column(name = "ORDINAL", nullable = true, precision = 0)
    public Long getOrdinal() {
        return ordinal;
    }

    public void setOrdinal(Long ordinal) {
        this.ordinal = ordinal;
    }

    @Basic
    @Column(name = "STATUS", nullable = false, precision = 0)
    public long getStatus() {
        return status;
    }

    public void setStatus(long status) {
        this.status = status;
    }

    @Basic
    @Column(name = "CREATED_TIME", nullable = false)
    public Timestamp getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Timestamp createdTime) {
        this.createdTime = createdTime;
    }

    @Basic
    @Column(name = "CREATED_BY", nullable = true)
    public byte[] getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(byte[] createdBy) {
        this.createdBy = createdBy;
    }

    @Basic
    @Column(name = "LAST_MODIFIED_TIME", nullable = false)
    public Timestamp getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(Timestamp lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    @Basic
    @Column(name = "LAST_MODIFIED_BY", nullable = true)
    public byte[] getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(byte[] lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DepB04 depB04 = (DepB04) o;

        if (status != depB04.status) return false;
        if (b04007 != null ? !b04007.equals(depB04.b04007) : depB04.b04007 != null) return false;
        if (b04011 != null ? !b04011.equals(depB04.b04011) : depB04.b04011 != null) return false;
        if (b04001 != null ? !b04001.equals(depB04.b04001) : depB04.b04001 != null) return false;
        if (b04004 != null ? !b04004.equals(depB04.b04004) : depB04.b04004 != null) return false;
        if (status2 != null ? !status2.equals(depB04.status2) : depB04.status2 != null) return false;
        if (seqid != null ? !seqid.equals(depB04.seqid) : depB04.seqid != null) return false;
        if (depId != null ? !depId.equals(depB04.depId) : depB04.depId != null) return false;
        if (subId != null ? !subId.equals(depB04.subId) : depB04.subId != null) return false;
        if (lastUpdatedStamp != null ? !lastUpdatedStamp.equals(depB04.lastUpdatedStamp) : depB04.lastUpdatedStamp != null)
            return false;
        if (lastUpdatedTxStamp != null ? !lastUpdatedTxStamp.equals(depB04.lastUpdatedTxStamp) : depB04.lastUpdatedTxStamp != null)
            return false;
        if (createdStamp != null ? !createdStamp.equals(depB04.createdStamp) : depB04.createdStamp != null)
            return false;
        if (createdTxStamp != null ? !createdTxStamp.equals(depB04.createdTxStamp) : depB04.createdTxStamp != null)
            return false;
        if (b04017 != null ? !b04017.equals(depB04.b04017) : depB04.b04017 != null) return false;
        if (b04021 != null ? !b04021.equals(depB04.b04021) : depB04.b04021 != null) return false;
        if (ordinal != null ? !ordinal.equals(depB04.ordinal) : depB04.ordinal != null) return false;
        if (createdTime != null ? !createdTime.equals(depB04.createdTime) : depB04.createdTime != null) return false;
        if (!Arrays.equals(createdBy, depB04.createdBy)) return false;
        if (lastModifiedTime != null ? !lastModifiedTime.equals(depB04.lastModifiedTime) : depB04.lastModifiedTime != null)
            return false;
        if (!Arrays.equals(lastModifiedBy, depB04.lastModifiedBy)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = b04007 != null ? b04007.hashCode() : 0;
        result = 31 * result + (b04011 != null ? b04011.hashCode() : 0);
        result = 31 * result + (b04001 != null ? b04001.hashCode() : 0);
        result = 31 * result + (b04004 != null ? b04004.hashCode() : 0);
        result = 31 * result + (status2 != null ? status2.hashCode() : 0);
        result = 31 * result + (seqid != null ? seqid.hashCode() : 0);
        result = 31 * result + (depId != null ? depId.hashCode() : 0);
        result = 31 * result + (subId != null ? subId.hashCode() : 0);
        result = 31 * result + (lastUpdatedStamp != null ? lastUpdatedStamp.hashCode() : 0);
        result = 31 * result + (lastUpdatedTxStamp != null ? lastUpdatedTxStamp.hashCode() : 0);
        result = 31 * result + (createdStamp != null ? createdStamp.hashCode() : 0);
        result = 31 * result + (createdTxStamp != null ? createdTxStamp.hashCode() : 0);
        result = 31 * result + (b04017 != null ? b04017.hashCode() : 0);
        result = 31 * result + (b04021 != null ? b04021.hashCode() : 0);
        result = 31 * result + (ordinal != null ? ordinal.hashCode() : 0);
        result = 31 * result + (int) (status ^ (status >>> 32));
        result = 31 * result + (createdTime != null ? createdTime.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(createdBy);
        result = 31 * result + (lastModifiedTime != null ? lastModifiedTime.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(lastModifiedBy);
        return result;
    }
}
