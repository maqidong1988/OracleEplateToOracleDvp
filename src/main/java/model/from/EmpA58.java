package model.from;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Jay on 2018/1/16.
 *
 * @author Jay
 * @version 1.0
 * @since 1.0
 * Copyright (C) 2017. SinoSoft All Rights Received
 */
@Entity
@Table(name = "EMP_A58", catalog = "")
public class EmpA58 {
    private String a58001A;
    private String a58001B;
    private String a58015;
    private String a58035;
    private String a58030;
    private String status;
    private String status2;
    private Long seqid;
    private String empId;
    private String subId;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private Timestamp a58005;

    @Basic
    @Column(name = "A58001_A", nullable = true, length = 30)
    public String getA58001A() {
        return a58001A;
    }

    public void setA58001A(String a58001A) {
        this.a58001A = a58001A;
    }

    @Basic
    @Column(name = "A58001_B", nullable = true, length = 20)
    public String getA58001B() {
        return a58001B;
    }

    public void setA58001B(String a58001B) {
        this.a58001B = a58001B;
    }

    @Basic
    @Column(name = "A58015", nullable = true, length = 120)
    public String getA58015() {
        return a58015;
    }

    public void setA58015(String a58015) {
        this.a58015 = a58015;
    }

    @Basic
    @Column(name = "A58035", nullable = true, length = 48)
    public String getA58035() {
        return a58035;
    }

    public void setA58035(String a58035) {
        this.a58035 = a58035;
    }

    @Basic
    @Column(name = "A58030", nullable = true, length = 100)
    public String getA58030() {
        return a58030;
    }

    public void setA58030(String a58030) {
        this.a58030 = a58030;
    }

    @Basic
    @Column(name = "STATUS", nullable = true, length = 10)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
    @Column(name = "A58005", nullable = true)
    public Timestamp getA58005() {
        return a58005;
    }

    public void setA58005(Timestamp a58005) {
        this.a58005 = a58005;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpA58 empA58 = (EmpA58) o;

        if (a58001A != null ? !a58001A.equals(empA58.a58001A) : empA58.a58001A != null) return false;
        if (a58001B != null ? !a58001B.equals(empA58.a58001B) : empA58.a58001B != null) return false;
        if (a58015 != null ? !a58015.equals(empA58.a58015) : empA58.a58015 != null) return false;
        if (a58035 != null ? !a58035.equals(empA58.a58035) : empA58.a58035 != null) return false;
        if (a58030 != null ? !a58030.equals(empA58.a58030) : empA58.a58030 != null) return false;
        if (status != null ? !status.equals(empA58.status) : empA58.status != null) return false;
        if (status2 != null ? !status2.equals(empA58.status2) : empA58.status2 != null) return false;
        if (seqid != null ? !seqid.equals(empA58.seqid) : empA58.seqid != null) return false;
        if (empId != null ? !empId.equals(empA58.empId) : empA58.empId != null) return false;
        if (subId != null ? !subId.equals(empA58.subId) : empA58.subId != null) return false;
        if (lastUpdatedStamp != null ? !lastUpdatedStamp.equals(empA58.lastUpdatedStamp) : empA58.lastUpdatedStamp != null)
            return false;
        if (lastUpdatedTxStamp != null ? !lastUpdatedTxStamp.equals(empA58.lastUpdatedTxStamp) : empA58.lastUpdatedTxStamp != null)
            return false;
        if (createdStamp != null ? !createdStamp.equals(empA58.createdStamp) : empA58.createdStamp != null)
            return false;
        if (createdTxStamp != null ? !createdTxStamp.equals(empA58.createdTxStamp) : empA58.createdTxStamp != null)
            return false;
        if (a58005 != null ? !a58005.equals(empA58.a58005) : empA58.a58005 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = a58001A != null ? a58001A.hashCode() : 0;
        result = 31 * result + (a58001B != null ? a58001B.hashCode() : 0);
        result = 31 * result + (a58015 != null ? a58015.hashCode() : 0);
        result = 31 * result + (a58035 != null ? a58035.hashCode() : 0);
        result = 31 * result + (a58030 != null ? a58030.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (status2 != null ? status2.hashCode() : 0);
        result = 31 * result + (seqid != null ? seqid.hashCode() : 0);
        result = 31 * result + (empId != null ? empId.hashCode() : 0);
        result = 31 * result + (subId != null ? subId.hashCode() : 0);
        result = 31 * result + (lastUpdatedStamp != null ? lastUpdatedStamp.hashCode() : 0);
        result = 31 * result + (lastUpdatedTxStamp != null ? lastUpdatedTxStamp.hashCode() : 0);
        result = 31 * result + (createdStamp != null ? createdStamp.hashCode() : 0);
        result = 31 * result + (createdTxStamp != null ? createdTxStamp.hashCode() : 0);
        result = 31 * result + (a58005 != null ? a58005.hashCode() : 0);
        return result;
    }
}
