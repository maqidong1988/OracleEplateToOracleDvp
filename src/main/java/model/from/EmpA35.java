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
@Table(name = "EMP_A35", catalog = "")
public class EmpA35 {
    private String id;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String a35001;
    private String status;
    private String status2;
    private Long seqid;
    private String empId;
    private String subId;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private Timestamp a35007;
    private Timestamp a35004;
    private String a35011;

    @Basic
    @Column(name = "A35001", nullable = true, length = 120)
    public String getA35001() {
        return a35001;
    }

    public void setA35001(String a35001) {
        this.a35001 = a35001;
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
    @Column(name = "A35007", nullable = true)
    public Timestamp getA35007() {
        return a35007;
    }

    public void setA35007(Timestamp a35007) {
        this.a35007 = a35007;
    }

    @Basic
    @Column(name = "A35004", nullable = true)
    public Timestamp getA35004() {
        return a35004;
    }

    public void setA35004(Timestamp a35004) {
        this.a35004 = a35004;
    }

    @Basic
    @Column(name = "A35011", nullable = true, length = 4000)
    public String getA35011() {
        return a35011;
    }

    public void setA35011(String a35011) {
        this.a35011 = a35011;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpA35 empA35 = (EmpA35) o;

        if (a35001 != null ? !a35001.equals(empA35.a35001) : empA35.a35001 != null) return false;
        if (status != null ? !status.equals(empA35.status) : empA35.status != null) return false;
        if (status2 != null ? !status2.equals(empA35.status2) : empA35.status2 != null) return false;
        if (seqid != null ? !seqid.equals(empA35.seqid) : empA35.seqid != null) return false;
        if (empId != null ? !empId.equals(empA35.empId) : empA35.empId != null) return false;
        if (subId != null ? !subId.equals(empA35.subId) : empA35.subId != null) return false;
        if (lastUpdatedStamp != null ? !lastUpdatedStamp.equals(empA35.lastUpdatedStamp) : empA35.lastUpdatedStamp != null)
            return false;
        if (lastUpdatedTxStamp != null ? !lastUpdatedTxStamp.equals(empA35.lastUpdatedTxStamp) : empA35.lastUpdatedTxStamp != null)
            return false;
        if (createdStamp != null ? !createdStamp.equals(empA35.createdStamp) : empA35.createdStamp != null)
            return false;
        if (createdTxStamp != null ? !createdTxStamp.equals(empA35.createdTxStamp) : empA35.createdTxStamp != null)
            return false;
        if (a35007 != null ? !a35007.equals(empA35.a35007) : empA35.a35007 != null) return false;
        if (a35004 != null ? !a35004.equals(empA35.a35004) : empA35.a35004 != null) return false;
        if (a35011 != null ? !a35011.equals(empA35.a35011) : empA35.a35011 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = a35001 != null ? a35001.hashCode() : 0;
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (status2 != null ? status2.hashCode() : 0);
        result = 31 * result + (seqid != null ? seqid.hashCode() : 0);
        result = 31 * result + (empId != null ? empId.hashCode() : 0);
        result = 31 * result + (subId != null ? subId.hashCode() : 0);
        result = 31 * result + (lastUpdatedStamp != null ? lastUpdatedStamp.hashCode() : 0);
        result = 31 * result + (lastUpdatedTxStamp != null ? lastUpdatedTxStamp.hashCode() : 0);
        result = 31 * result + (createdStamp != null ? createdStamp.hashCode() : 0);
        result = 31 * result + (createdTxStamp != null ? createdTxStamp.hashCode() : 0);
        result = 31 * result + (a35007 != null ? a35007.hashCode() : 0);
        result = 31 * result + (a35004 != null ? a35004.hashCode() : 0);
        result = 31 * result + (a35011 != null ? a35011.hashCode() : 0);
        return result;
    }
}
