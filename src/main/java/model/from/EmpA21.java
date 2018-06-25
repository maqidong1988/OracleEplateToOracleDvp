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
@Table(name = "EMP_A21", catalog = "")
public class EmpA21 {
    private String id;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String a21011;
    private String a21004;
    private String a21007;
    private String status;
    private String status2;
    private Long seqid;
    private String empId;
    private String subId;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private Timestamp a21001;

    @Basic
    @Column(name = "A21011", nullable = true, length = 100)
    public String getA21011() {
        return a21011;
    }

    public void setA21011(String a21011) {
        this.a21011 = a21011;
    }

    @Basic
    @Column(name = "A21004", nullable = true, length = 120)
    public String getA21004() {
        return a21004;
    }

    public void setA21004(String a21004) {
        this.a21004 = a21004;
    }

    @Basic
    @Column(name = "A21007", nullable = true, length = 15)
    public String getA21007() {
        return a21007;
    }

    public void setA21007(String a21007) {
        this.a21007 = a21007;
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
    @Column(name = "A21001", nullable = true)
    public Timestamp getA21001() {
        return a21001;
    }

    public void setA21001(Timestamp a21001) {
        this.a21001 = a21001;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpA21 empA21 = (EmpA21) o;

        if (a21011 != null ? !a21011.equals(empA21.a21011) : empA21.a21011 != null) return false;
        if (a21004 != null ? !a21004.equals(empA21.a21004) : empA21.a21004 != null) return false;
        if (a21007 != null ? !a21007.equals(empA21.a21007) : empA21.a21007 != null) return false;
        if (status != null ? !status.equals(empA21.status) : empA21.status != null) return false;
        if (status2 != null ? !status2.equals(empA21.status2) : empA21.status2 != null) return false;
        if (seqid != null ? !seqid.equals(empA21.seqid) : empA21.seqid != null) return false;
        if (empId != null ? !empId.equals(empA21.empId) : empA21.empId != null) return false;
        if (subId != null ? !subId.equals(empA21.subId) : empA21.subId != null) return false;
        if (lastUpdatedStamp != null ? !lastUpdatedStamp.equals(empA21.lastUpdatedStamp) : empA21.lastUpdatedStamp != null)
            return false;
        if (lastUpdatedTxStamp != null ? !lastUpdatedTxStamp.equals(empA21.lastUpdatedTxStamp) : empA21.lastUpdatedTxStamp != null)
            return false;
        if (createdStamp != null ? !createdStamp.equals(empA21.createdStamp) : empA21.createdStamp != null)
            return false;
        if (createdTxStamp != null ? !createdTxStamp.equals(empA21.createdTxStamp) : empA21.createdTxStamp != null)
            return false;
        if (a21001 != null ? !a21001.equals(empA21.a21001) : empA21.a21001 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = a21011 != null ? a21011.hashCode() : 0;
        result = 31 * result + (a21004 != null ? a21004.hashCode() : 0);
        result = 31 * result + (a21007 != null ? a21007.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (status2 != null ? status2.hashCode() : 0);
        result = 31 * result + (seqid != null ? seqid.hashCode() : 0);
        result = 31 * result + (empId != null ? empId.hashCode() : 0);
        result = 31 * result + (subId != null ? subId.hashCode() : 0);
        result = 31 * result + (lastUpdatedStamp != null ? lastUpdatedStamp.hashCode() : 0);
        result = 31 * result + (lastUpdatedTxStamp != null ? lastUpdatedTxStamp.hashCode() : 0);
        result = 31 * result + (createdStamp != null ? createdStamp.hashCode() : 0);
        result = 31 * result + (createdTxStamp != null ? createdTxStamp.hashCode() : 0);
        result = 31 * result + (a21001 != null ? a21001.hashCode() : 0);
        return result;
    }
}
