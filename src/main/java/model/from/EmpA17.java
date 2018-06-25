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
@Table(name = "EMP_A17", catalog = "")
public class EmpA17 {
    private String id;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String a17015;
    private String a17020;
    private String a17025;
    private String a17022;
    private String a17016;
    private String status;
    private String status2;
    private Long seqid;
    private String empId;
    private String subId;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private Timestamp a17010;
    private Timestamp a17005;
    private String a17001;

    @Basic
    @Column(name = "A17015", nullable = true, length = 120)
    public String getA17015() {
        return a17015;
    }

    public void setA17015(String a17015) {
        this.a17015 = a17015;
    }

    @Basic
    @Column(name = "A17020", nullable = true, length = 80)
    public String getA17020() {
        return a17020;
    }

    public void setA17020(String a17020) {
        this.a17020 = a17020;
    }

    @Basic
    @Column(name = "A17025", nullable = true, length = 50)
    public String getA17025() {
        return a17025;
    }

    public void setA17025(String a17025) {
        this.a17025 = a17025;
    }

    @Basic
    @Column(name = "A17022", nullable = true, length = 100)
    public String getA17022() {
        return a17022;
    }

    public void setA17022(String a17022) {
        this.a17022 = a17022;
    }

    @Basic
    @Column(name = "A17016", nullable = true, length = 50)
    public String getA17016() {
        return a17016;
    }

    public void setA17016(String a17016) {
        this.a17016 = a17016;
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
    @Column(name = "A17010", nullable = true)
    public Timestamp getA17010() {
        return a17010;
    }

    public void setA17010(Timestamp a17010) {
        this.a17010 = a17010;
    }

    @Basic
    @Column(name = "A17005", nullable = true)
    public Timestamp getA17005() {
        return a17005;
    }

    public void setA17005(Timestamp a17005) {
        this.a17005 = a17005;
    }

    @Basic
    @Column(name = "A17001", nullable = true, length = 4000)
    public String getA17001() {
        return a17001;
    }

    public void setA17001(String a17001) {
        this.a17001 = a17001;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpA17 empA17 = (EmpA17) o;

        if (a17015 != null ? !a17015.equals(empA17.a17015) : empA17.a17015 != null) return false;
        if (a17020 != null ? !a17020.equals(empA17.a17020) : empA17.a17020 != null) return false;
        if (a17025 != null ? !a17025.equals(empA17.a17025) : empA17.a17025 != null) return false;
        if (a17022 != null ? !a17022.equals(empA17.a17022) : empA17.a17022 != null) return false;
        if (a17016 != null ? !a17016.equals(empA17.a17016) : empA17.a17016 != null) return false;
        if (status != null ? !status.equals(empA17.status) : empA17.status != null) return false;
        if (status2 != null ? !status2.equals(empA17.status2) : empA17.status2 != null) return false;
        if (seqid != null ? !seqid.equals(empA17.seqid) : empA17.seqid != null) return false;
        if (empId != null ? !empId.equals(empA17.empId) : empA17.empId != null) return false;
        if (subId != null ? !subId.equals(empA17.subId) : empA17.subId != null) return false;
        if (lastUpdatedStamp != null ? !lastUpdatedStamp.equals(empA17.lastUpdatedStamp) : empA17.lastUpdatedStamp != null)
            return false;
        if (lastUpdatedTxStamp != null ? !lastUpdatedTxStamp.equals(empA17.lastUpdatedTxStamp) : empA17.lastUpdatedTxStamp != null)
            return false;
        if (createdStamp != null ? !createdStamp.equals(empA17.createdStamp) : empA17.createdStamp != null)
            return false;
        if (createdTxStamp != null ? !createdTxStamp.equals(empA17.createdTxStamp) : empA17.createdTxStamp != null)
            return false;
        if (a17010 != null ? !a17010.equals(empA17.a17010) : empA17.a17010 != null) return false;
        if (a17005 != null ? !a17005.equals(empA17.a17005) : empA17.a17005 != null) return false;
        if (a17001 != null ? !a17001.equals(empA17.a17001) : empA17.a17001 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = a17015 != null ? a17015.hashCode() : 0;
        result = 31 * result + (a17020 != null ? a17020.hashCode() : 0);
        result = 31 * result + (a17025 != null ? a17025.hashCode() : 0);
        result = 31 * result + (a17022 != null ? a17022.hashCode() : 0);
        result = 31 * result + (a17016 != null ? a17016.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (status2 != null ? status2.hashCode() : 0);
        result = 31 * result + (seqid != null ? seqid.hashCode() : 0);
        result = 31 * result + (empId != null ? empId.hashCode() : 0);
        result = 31 * result + (subId != null ? subId.hashCode() : 0);
        result = 31 * result + (lastUpdatedStamp != null ? lastUpdatedStamp.hashCode() : 0);
        result = 31 * result + (lastUpdatedTxStamp != null ? lastUpdatedTxStamp.hashCode() : 0);
        result = 31 * result + (createdStamp != null ? createdStamp.hashCode() : 0);
        result = 31 * result + (createdTxStamp != null ? createdTxStamp.hashCode() : 0);
        result = 31 * result + (a17010 != null ? a17010.hashCode() : 0);
        result = 31 * result + (a17005 != null ? a17005.hashCode() : 0);
        result = 31 * result + (a17001 != null ? a17001.hashCode() : 0);
        return result;
    }
}
