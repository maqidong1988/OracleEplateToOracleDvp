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
@Table(name = "EMP_A46", catalog = "")
public class EmpA46 {
    private String id;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String a46001;
    private String status;
    private String status2;
    private Long seqid;
    private String empId;
    private String subId;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private Timestamp a46004;
    private Timestamp a46007;

    @Basic
    @Column(name = "A46001", nullable = true, length = 40)
    public String getA46001() {
        return a46001;
    }

    public void setA46001(String a46001) {
        this.a46001 = a46001;
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
    @Column(name = "A46004", nullable = true)
    public Timestamp getA46004() {
        return a46004;
    }

    public void setA46004(Timestamp a46004) {
        this.a46004 = a46004;
    }

    @Basic
    @Column(name = "A46007", nullable = true)
    public Timestamp getA46007() {
        return a46007;
    }

    public void setA46007(Timestamp a46007) {
        this.a46007 = a46007;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpA46 empA46 = (EmpA46) o;

        if (a46001 != null ? !a46001.equals(empA46.a46001) : empA46.a46001 != null) return false;
        if (status != null ? !status.equals(empA46.status) : empA46.status != null) return false;
        if (status2 != null ? !status2.equals(empA46.status2) : empA46.status2 != null) return false;
        if (seqid != null ? !seqid.equals(empA46.seqid) : empA46.seqid != null) return false;
        if (empId != null ? !empId.equals(empA46.empId) : empA46.empId != null) return false;
        if (subId != null ? !subId.equals(empA46.subId) : empA46.subId != null) return false;
        if (lastUpdatedStamp != null ? !lastUpdatedStamp.equals(empA46.lastUpdatedStamp) : empA46.lastUpdatedStamp != null)
            return false;
        if (lastUpdatedTxStamp != null ? !lastUpdatedTxStamp.equals(empA46.lastUpdatedTxStamp) : empA46.lastUpdatedTxStamp != null)
            return false;
        if (createdStamp != null ? !createdStamp.equals(empA46.createdStamp) : empA46.createdStamp != null)
            return false;
        if (createdTxStamp != null ? !createdTxStamp.equals(empA46.createdTxStamp) : empA46.createdTxStamp != null)
            return false;
        if (a46004 != null ? !a46004.equals(empA46.a46004) : empA46.a46004 != null) return false;
        if (a46007 != null ? !a46007.equals(empA46.a46007) : empA46.a46007 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = a46001 != null ? a46001.hashCode() : 0;
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (status2 != null ? status2.hashCode() : 0);
        result = 31 * result + (seqid != null ? seqid.hashCode() : 0);
        result = 31 * result + (empId != null ? empId.hashCode() : 0);
        result = 31 * result + (subId != null ? subId.hashCode() : 0);
        result = 31 * result + (lastUpdatedStamp != null ? lastUpdatedStamp.hashCode() : 0);
        result = 31 * result + (lastUpdatedTxStamp != null ? lastUpdatedTxStamp.hashCode() : 0);
        result = 31 * result + (createdStamp != null ? createdStamp.hashCode() : 0);
        result = 31 * result + (createdTxStamp != null ? createdTxStamp.hashCode() : 0);
        result = 31 * result + (a46004 != null ? a46004.hashCode() : 0);
        result = 31 * result + (a46007 != null ? a46007.hashCode() : 0);
        return result;
    }
}
