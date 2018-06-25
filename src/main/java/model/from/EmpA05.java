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
@Table(name = "EMP_A05", catalog = "")
public class EmpA05 {
    private String a05007A;
    private String a05002B;
    private String a05007B;
    private String a05024;
    private String a05011;
    private String a05002A;
    private String status2;
    private Long seqid;
    private String empId;
    private String subId;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private Timestamp a05017;
    private Timestamp a05004;
    private String a05021;
    private Long ordinal;
    private long status;
    private Timestamp createdTime;
    private byte[] createdBy;
    private Timestamp lastModifiedTime;
    private byte[] lastModifiedBy;

    @Basic
    @Column(name = "A05007_A", nullable = true, length = 120)
    public String getA05007A() {
        return a05007A;
    }

    public void setA05007A(String a05007A) {
        this.a05007A = a05007A;
    }

    @Basic
    @Column(name = "A05002_B", nullable = true, length = 10)
    public String getA05002B() {
        return a05002B;
    }

    public void setA05002B(String a05002B) {
        this.a05002B = a05002B;
    }

    @Basic
    @Column(name = "A05007_B", nullable = true, length = 18)
    public String getA05007B() {
        return a05007B;
    }

    public void setA05007B(String a05007B) {
        this.a05007B = a05007B;
    }

    @Basic
    @Column(name = "A05024", nullable = true, length = 100)
    public String getA05024() {
        return a05024;
    }

    public void setA05024(String a05024) {
        this.a05024 = a05024;
    }

    @Basic
    @Column(name = "A05011", nullable = true, length = 48)
    public String getA05011() {
        return a05011;
    }

    public void setA05011(String a05011) {
        this.a05011 = a05011;
    }

    @Basic
    @Column(name = "A05002_A", nullable = true, length = 60)
    public String getA05002A() {
        return a05002A;
    }

    public void setA05002A(String a05002A) {
        this.a05002A = a05002A;
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
    @Column(name = "A05017", nullable = true)
    public Timestamp getA05017() {
        return a05017;
    }

    public void setA05017(Timestamp a05017) {
        this.a05017 = a05017;
    }

    @Basic
    @Column(name = "A05004", nullable = true)
    public Timestamp getA05004() {
        return a05004;
    }

    public void setA05004(Timestamp a05004) {
        this.a05004 = a05004;
    }

    @Basic
    @Column(name = "A05021", nullable = true, length = 4000)
    public String getA05021() {
        return a05021;
    }

    public void setA05021(String a05021) {
        this.a05021 = a05021;
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

        EmpA05 empA05 = (EmpA05) o;

        if (status != empA05.status) return false;
        if (a05007A != null ? !a05007A.equals(empA05.a05007A) : empA05.a05007A != null) return false;
        if (a05002B != null ? !a05002B.equals(empA05.a05002B) : empA05.a05002B != null) return false;
        if (a05007B != null ? !a05007B.equals(empA05.a05007B) : empA05.a05007B != null) return false;
        if (a05024 != null ? !a05024.equals(empA05.a05024) : empA05.a05024 != null) return false;
        if (a05011 != null ? !a05011.equals(empA05.a05011) : empA05.a05011 != null) return false;
        if (a05002A != null ? !a05002A.equals(empA05.a05002A) : empA05.a05002A != null) return false;
        if (status2 != null ? !status2.equals(empA05.status2) : empA05.status2 != null) return false;
        if (seqid != null ? !seqid.equals(empA05.seqid) : empA05.seqid != null) return false;
        if (empId != null ? !empId.equals(empA05.empId) : empA05.empId != null) return false;
        if (subId != null ? !subId.equals(empA05.subId) : empA05.subId != null) return false;
        if (lastUpdatedStamp != null ? !lastUpdatedStamp.equals(empA05.lastUpdatedStamp) : empA05.lastUpdatedStamp != null)
            return false;
        if (lastUpdatedTxStamp != null ? !lastUpdatedTxStamp.equals(empA05.lastUpdatedTxStamp) : empA05.lastUpdatedTxStamp != null)
            return false;
        if (createdStamp != null ? !createdStamp.equals(empA05.createdStamp) : empA05.createdStamp != null)
            return false;
        if (createdTxStamp != null ? !createdTxStamp.equals(empA05.createdTxStamp) : empA05.createdTxStamp != null)
            return false;
        if (a05017 != null ? !a05017.equals(empA05.a05017) : empA05.a05017 != null) return false;
        if (a05004 != null ? !a05004.equals(empA05.a05004) : empA05.a05004 != null) return false;
        if (a05021 != null ? !a05021.equals(empA05.a05021) : empA05.a05021 != null) return false;
        if (ordinal != null ? !ordinal.equals(empA05.ordinal) : empA05.ordinal != null) return false;
        if (createdTime != null ? !createdTime.equals(empA05.createdTime) : empA05.createdTime != null) return false;
        if (!Arrays.equals(createdBy, empA05.createdBy)) return false;
        if (lastModifiedTime != null ? !lastModifiedTime.equals(empA05.lastModifiedTime) : empA05.lastModifiedTime != null)
            return false;
        if (!Arrays.equals(lastModifiedBy, empA05.lastModifiedBy)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = a05007A != null ? a05007A.hashCode() : 0;
        result = 31 * result + (a05002B != null ? a05002B.hashCode() : 0);
        result = 31 * result + (a05007B != null ? a05007B.hashCode() : 0);
        result = 31 * result + (a05024 != null ? a05024.hashCode() : 0);
        result = 31 * result + (a05011 != null ? a05011.hashCode() : 0);
        result = 31 * result + (a05002A != null ? a05002A.hashCode() : 0);
        result = 31 * result + (status2 != null ? status2.hashCode() : 0);
        result = 31 * result + (seqid != null ? seqid.hashCode() : 0);
        result = 31 * result + (empId != null ? empId.hashCode() : 0);
        result = 31 * result + (subId != null ? subId.hashCode() : 0);
        result = 31 * result + (lastUpdatedStamp != null ? lastUpdatedStamp.hashCode() : 0);
        result = 31 * result + (lastUpdatedTxStamp != null ? lastUpdatedTxStamp.hashCode() : 0);
        result = 31 * result + (createdStamp != null ? createdStamp.hashCode() : 0);
        result = 31 * result + (createdTxStamp != null ? createdTxStamp.hashCode() : 0);
        result = 31 * result + (a05017 != null ? a05017.hashCode() : 0);
        result = 31 * result + (a05004 != null ? a05004.hashCode() : 0);
        result = 31 * result + (a05021 != null ? a05021.hashCode() : 0);
        result = 31 * result + (ordinal != null ? ordinal.hashCode() : 0);
        result = 31 * result + (int) (status ^ (status >>> 32));
        result = 31 * result + (createdTime != null ? createdTime.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(createdBy);
        result = 31 * result + (lastModifiedTime != null ? lastModifiedTime.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(lastModifiedBy);
        return result;
    }
}
