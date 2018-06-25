package model.from;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Arrays;

/**
 * Created by Jay on 2018/1/16.
 *
 * @author Jay
 * @version 1.0
 * @since 1.0
 * Copyright (C) 2017. SinoSoft All Rights Received
 */
@Entity
@Table(name = "EMP_A15", catalog = "")
public class EmpA15 {
    private String id;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private Long a15047;
    private String a15007;
    private String a15017;
    private String a15030;
    private Timestamp a15021;
    private String a15014;
    private String a15001;
    private String status2;
    private Long seqid;
    private String empId;
    private String subId;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private Timestamp a15004;
    private Timestamp a15005;
    private String a15051;
    private String a15011;
    private Long ordinal;
    private long status;
    private Timestamp createdTime;
    private byte[] createdBy;
    private Timestamp lastModifiedTime;
    private byte[] lastModifiedBy;

    @Basic
    @Column(name = "A15047", nullable = true, precision = 2)
    public Long getA15047() {
        return a15047;
    }

    public void setA15047(Long a15047) {
        this.a15047 = a15047;
    }

    @Basic
    @Column(name = "A15007", nullable = true, length = 120)
    public String getA15007() {
        return a15007;
    }

    public void setA15007(String a15007) {
        this.a15007 = a15007;
    }

    @Basic
    @Column(name = "A15017", nullable = true, length = 100)
    public String getA15017() {
        return a15017;
    }

    public void setA15017(String a15017) {
        this.a15017 = a15017;
    }

    @Basic
    @Column(name = "A15030", nullable = true, length = 100)
    public String getA15030() {
        return a15030;
    }

    public void setA15030(String a15030) {
        this.a15030 = a15030;
    }

    @Basic
    @Column(name = "A15021", nullable = true)
    public Timestamp getA15021() {
        return a15021;
    }

    public void setA15021(Timestamp a15021) {
        this.a15021 = a15021;
    }

    @Basic
    @Column(name = "A15014", nullable = true, length = 50)
    public String getA15014() {
        return a15014;
    }

    public void setA15014(String a15014) {
        this.a15014 = a15014;
    }

    @Basic
    @Column(name = "A15001", nullable = true, length = 100)
    public String getA15001() {
        return a15001;
    }

    public void setA15001(String a15001) {
        this.a15001 = a15001;
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
    @Column(name = "EMP_ID", nullable = true, length = 50)
    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    @Basic
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
    @Column(name = "A15004", nullable = true)
    public Timestamp getA15004() {
        return a15004;
    }

    public void setA15004(Timestamp a15004) {
        this.a15004 = a15004;
    }

    @Basic
    @Column(name = "A15005", nullable = true)
    public Timestamp getA15005() {
        return a15005;
    }

    public void setA15005(Timestamp a15005) {
        this.a15005 = a15005;
    }

    @Basic
    @Column(name = "A15051", nullable = true, length = 4000)
    public String getA15051() {
        return a15051;
    }

    public void setA15051(String a15051) {
        this.a15051 = a15051;
    }

    @Basic
    @Column(name = "A15011", nullable = true, length = 4000)
    public String getA15011() {
        return a15011;
    }

    public void setA15011(String a15011) {
        this.a15011 = a15011;
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

        EmpA15 empA15 = (EmpA15) o;

        if (status != empA15.status) return false;
        if (a15047 != null ? !a15047.equals(empA15.a15047) : empA15.a15047 != null) return false;
        if (a15007 != null ? !a15007.equals(empA15.a15007) : empA15.a15007 != null) return false;
        if (a15017 != null ? !a15017.equals(empA15.a15017) : empA15.a15017 != null) return false;
        if (a15030 != null ? !a15030.equals(empA15.a15030) : empA15.a15030 != null) return false;
        if (a15021 != null ? !a15021.equals(empA15.a15021) : empA15.a15021 != null) return false;
        if (a15014 != null ? !a15014.equals(empA15.a15014) : empA15.a15014 != null) return false;
        if (a15001 != null ? !a15001.equals(empA15.a15001) : empA15.a15001 != null) return false;
        if (status2 != null ? !status2.equals(empA15.status2) : empA15.status2 != null) return false;
        if (seqid != null ? !seqid.equals(empA15.seqid) : empA15.seqid != null) return false;
        if (empId != null ? !empId.equals(empA15.empId) : empA15.empId != null) return false;
        if (subId != null ? !subId.equals(empA15.subId) : empA15.subId != null) return false;
        if (lastUpdatedStamp != null ? !lastUpdatedStamp.equals(empA15.lastUpdatedStamp) : empA15.lastUpdatedStamp != null)
            return false;
        if (lastUpdatedTxStamp != null ? !lastUpdatedTxStamp.equals(empA15.lastUpdatedTxStamp) : empA15.lastUpdatedTxStamp != null)
            return false;
        if (createdStamp != null ? !createdStamp.equals(empA15.createdStamp) : empA15.createdStamp != null)
            return false;
        if (createdTxStamp != null ? !createdTxStamp.equals(empA15.createdTxStamp) : empA15.createdTxStamp != null)
            return false;
        if (a15004 != null ? !a15004.equals(empA15.a15004) : empA15.a15004 != null) return false;
        if (a15005 != null ? !a15005.equals(empA15.a15005) : empA15.a15005 != null) return false;
        if (a15051 != null ? !a15051.equals(empA15.a15051) : empA15.a15051 != null) return false;
        if (a15011 != null ? !a15011.equals(empA15.a15011) : empA15.a15011 != null) return false;
        if (ordinal != null ? !ordinal.equals(empA15.ordinal) : empA15.ordinal != null) return false;
        if (createdTime != null ? !createdTime.equals(empA15.createdTime) : empA15.createdTime != null) return false;
        if (!Arrays.equals(createdBy, empA15.createdBy)) return false;
        if (lastModifiedTime != null ? !lastModifiedTime.equals(empA15.lastModifiedTime) : empA15.lastModifiedTime != null)
            return false;
        if (!Arrays.equals(lastModifiedBy, empA15.lastModifiedBy)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = a15047 != null ? a15047.hashCode() : 0;
        result = 31 * result + (a15007 != null ? a15007.hashCode() : 0);
        result = 31 * result + (a15017 != null ? a15017.hashCode() : 0);
        result = 31 * result + (a15030 != null ? a15030.hashCode() : 0);
        result = 31 * result + (a15021 != null ? a15021.hashCode() : 0);
        result = 31 * result + (a15014 != null ? a15014.hashCode() : 0);
        result = 31 * result + (a15001 != null ? a15001.hashCode() : 0);
        result = 31 * result + (status2 != null ? status2.hashCode() : 0);
        result = 31 * result + (seqid != null ? seqid.hashCode() : 0);
        result = 31 * result + (empId != null ? empId.hashCode() : 0);
        result = 31 * result + (subId != null ? subId.hashCode() : 0);
        result = 31 * result + (lastUpdatedStamp != null ? lastUpdatedStamp.hashCode() : 0);
        result = 31 * result + (lastUpdatedTxStamp != null ? lastUpdatedTxStamp.hashCode() : 0);
        result = 31 * result + (createdStamp != null ? createdStamp.hashCode() : 0);
        result = 31 * result + (createdTxStamp != null ? createdTxStamp.hashCode() : 0);
        result = 31 * result + (a15004 != null ? a15004.hashCode() : 0);
        result = 31 * result + (a15005 != null ? a15005.hashCode() : 0);
        result = 31 * result + (a15051 != null ? a15051.hashCode() : 0);
        result = 31 * result + (a15011 != null ? a15011.hashCode() : 0);
        result = 31 * result + (ordinal != null ? ordinal.hashCode() : 0);
        result = 31 * result + (int) (status ^ (status >>> 32));
        result = 31 * result + (createdTime != null ? createdTime.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(createdBy);
        result = 31 * result + (lastModifiedTime != null ? lastModifiedTime.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(lastModifiedBy);
        return result;
    }
}
