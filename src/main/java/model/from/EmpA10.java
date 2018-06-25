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
@Table(name = "EMP_A10", catalog = "")
public class EmpA10 {
    private String id;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String a10015;
    private String a10001;
    private String a10004;
    private String status;
    private String status2;
    private Long seqid;
    private String empId;
    private String subId;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;

    @Basic
    @Column(name = "A10015", nullable = true, length = 100)
    public String getA10015() {
        return a10015;
    }

    public void setA10015(String a10015) {
        this.a10015 = a10015;
    }

    @Basic
    @Column(name = "A10001", nullable = true, length = 100)
    public String getA10001() {
        return a10001;
    }

    public void setA10001(String a10001) {
        this.a10001 = a10001;
    }

    @Basic
    @Column(name = "A10004", nullable = true, length = 100)
    public String getA10004() {
        return a10004;
    }

    public void setA10004(String a10004) {
        this.a10004 = a10004;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpA10 empA10 = (EmpA10) o;

        if (a10015 != null ? !a10015.equals(empA10.a10015) : empA10.a10015 != null) return false;
        if (a10001 != null ? !a10001.equals(empA10.a10001) : empA10.a10001 != null) return false;
        if (a10004 != null ? !a10004.equals(empA10.a10004) : empA10.a10004 != null) return false;
        if (status != null ? !status.equals(empA10.status) : empA10.status != null) return false;
        if (status2 != null ? !status2.equals(empA10.status2) : empA10.status2 != null) return false;
        if (seqid != null ? !seqid.equals(empA10.seqid) : empA10.seqid != null) return false;
        if (empId != null ? !empId.equals(empA10.empId) : empA10.empId != null) return false;
        if (subId != null ? !subId.equals(empA10.subId) : empA10.subId != null) return false;
        if (lastUpdatedStamp != null ? !lastUpdatedStamp.equals(empA10.lastUpdatedStamp) : empA10.lastUpdatedStamp != null)
            return false;
        if (lastUpdatedTxStamp != null ? !lastUpdatedTxStamp.equals(empA10.lastUpdatedTxStamp) : empA10.lastUpdatedTxStamp != null)
            return false;
        if (createdStamp != null ? !createdStamp.equals(empA10.createdStamp) : empA10.createdStamp != null)
            return false;
        if (createdTxStamp != null ? !createdTxStamp.equals(empA10.createdTxStamp) : empA10.createdTxStamp != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = a10015 != null ? a10015.hashCode() : 0;
        result = 31 * result + (a10001 != null ? a10001.hashCode() : 0);
        result = 31 * result + (a10004 != null ? a10004.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (status2 != null ? status2.hashCode() : 0);
        result = 31 * result + (seqid != null ? seqid.hashCode() : 0);
        result = 31 * result + (empId != null ? empId.hashCode() : 0);
        result = 31 * result + (subId != null ? subId.hashCode() : 0);
        result = 31 * result + (lastUpdatedStamp != null ? lastUpdatedStamp.hashCode() : 0);
        result = 31 * result + (lastUpdatedTxStamp != null ? lastUpdatedTxStamp.hashCode() : 0);
        result = 31 * result + (createdStamp != null ? createdStamp.hashCode() : 0);
        result = 31 * result + (createdTxStamp != null ? createdTxStamp.hashCode() : 0);
        return result;
    }
}
