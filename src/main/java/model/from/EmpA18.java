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
@Table(name = "EMP_A18", catalog = "")
public class EmpA18 {
    private String id;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String a18007;
    private String a18011;
    private String status;
    private String status2;
    private Long seqid;
    private String empId;
    private String subId;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private Timestamp a18004;
    private Timestamp a18001;
    private String a18014;

    @Basic
    @Column(name = "A18007", nullable = true, length = 120)
    public String getA18007() {
        return a18007;
    }

    public void setA18007(String a18007) {
        this.a18007 = a18007;
    }

    @Basic
    @Column(name = "A18011", nullable = true, length = 100)
    public String getA18011() {
        return a18011;
    }

    public void setA18011(String a18011) {
        this.a18011 = a18011;
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
    @Column(name = "A18004", nullable = true)
    public Timestamp getA18004() {
        return a18004;
    }

    public void setA18004(Timestamp a18004) {
        this.a18004 = a18004;
    }

    @Basic
    @Column(name = "A18001", nullable = true)
    public Timestamp getA18001() {
        return a18001;
    }

    public void setA18001(Timestamp a18001) {
        this.a18001 = a18001;
    }

    @Basic
    @Column(name = "A18014", nullable = true, length = 4000)
    public String getA18014() {
        return a18014;
    }

    public void setA18014(String a18014) {
        this.a18014 = a18014;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpA18 empA18 = (EmpA18) o;

        if (a18007 != null ? !a18007.equals(empA18.a18007) : empA18.a18007 != null) return false;
        if (a18011 != null ? !a18011.equals(empA18.a18011) : empA18.a18011 != null) return false;
        if (status != null ? !status.equals(empA18.status) : empA18.status != null) return false;
        if (status2 != null ? !status2.equals(empA18.status2) : empA18.status2 != null) return false;
        if (seqid != null ? !seqid.equals(empA18.seqid) : empA18.seqid != null) return false;
        if (empId != null ? !empId.equals(empA18.empId) : empA18.empId != null) return false;
        if (subId != null ? !subId.equals(empA18.subId) : empA18.subId != null) return false;
        if (lastUpdatedStamp != null ? !lastUpdatedStamp.equals(empA18.lastUpdatedStamp) : empA18.lastUpdatedStamp != null)
            return false;
        if (lastUpdatedTxStamp != null ? !lastUpdatedTxStamp.equals(empA18.lastUpdatedTxStamp) : empA18.lastUpdatedTxStamp != null)
            return false;
        if (createdStamp != null ? !createdStamp.equals(empA18.createdStamp) : empA18.createdStamp != null)
            return false;
        if (createdTxStamp != null ? !createdTxStamp.equals(empA18.createdTxStamp) : empA18.createdTxStamp != null)
            return false;
        if (a18004 != null ? !a18004.equals(empA18.a18004) : empA18.a18004 != null) return false;
        if (a18001 != null ? !a18001.equals(empA18.a18001) : empA18.a18001 != null) return false;
        if (a18014 != null ? !a18014.equals(empA18.a18014) : empA18.a18014 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = a18007 != null ? a18007.hashCode() : 0;
        result = 31 * result + (a18011 != null ? a18011.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (status2 != null ? status2.hashCode() : 0);
        result = 31 * result + (seqid != null ? seqid.hashCode() : 0);
        result = 31 * result + (empId != null ? empId.hashCode() : 0);
        result = 31 * result + (subId != null ? subId.hashCode() : 0);
        result = 31 * result + (lastUpdatedStamp != null ? lastUpdatedStamp.hashCode() : 0);
        result = 31 * result + (lastUpdatedTxStamp != null ? lastUpdatedTxStamp.hashCode() : 0);
        result = 31 * result + (createdStamp != null ? createdStamp.hashCode() : 0);
        result = 31 * result + (createdTxStamp != null ? createdTxStamp.hashCode() : 0);
        result = 31 * result + (a18004 != null ? a18004.hashCode() : 0);
        result = 31 * result + (a18001 != null ? a18001.hashCode() : 0);
        result = 31 * result + (a18014 != null ? a18014.hashCode() : 0);
        return result;
    }
}
