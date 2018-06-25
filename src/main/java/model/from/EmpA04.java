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
@Table(name = "EMP_A04", catalog = "")
public class EmpA04 {
    private String id;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String a04005;
    private String a04020;
    private String a04027;
    private String status;
    private String status2;
    private Long seqid;
    private String empId;
    private String subId;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private Timestamp a04025;
    private Timestamp a04015;
    private Timestamp a04010;
    private String a04006;

    @Basic
    @Column(name = "A04005", nullable = true, length = 100)
    public String getA04005() {
        return a04005;
    }

    public void setA04005(String a04005) {
        this.a04005 = a04005;
    }

    @Basic
    @Column(name = "A04020", nullable = true, length = 100)
    public String getA04020() {
        return a04020;
    }

    public void setA04020(String a04020) {
        this.a04020 = a04020;
    }

    @Basic
    @Column(name = "A04027", nullable = true, length = 48)
    public String getA04027() {
        return a04027;
    }

    public void setA04027(String a04027) {
        this.a04027 = a04027;
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
    @Column(name = "A04025", nullable = true)
    public Timestamp getA04025() {
        return a04025;
    }

    public void setA04025(Timestamp a04025) {
        this.a04025 = a04025;
    }

    @Basic
    @Column(name = "A04015", nullable = true)
    public Timestamp getA04015() {
        return a04015;
    }

    public void setA04015(Timestamp a04015) {
        this.a04015 = a04015;
    }

    @Basic
    @Column(name = "A04010", nullable = true)
    public Timestamp getA04010() {
        return a04010;
    }

    public void setA04010(Timestamp a04010) {
        this.a04010 = a04010;
    }

    @Basic
    @Column(name = "A04006", nullable = true, length = 4000)
    public String getA04006() {
        return a04006;
    }

    public void setA04006(String a04006) {
        this.a04006 = a04006;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpA04 empA04 = (EmpA04) o;

        if (a04005 != null ? !a04005.equals(empA04.a04005) : empA04.a04005 != null) return false;
        if (a04020 != null ? !a04020.equals(empA04.a04020) : empA04.a04020 != null) return false;
        if (a04027 != null ? !a04027.equals(empA04.a04027) : empA04.a04027 != null) return false;
        if (status != null ? !status.equals(empA04.status) : empA04.status != null) return false;
        if (status2 != null ? !status2.equals(empA04.status2) : empA04.status2 != null) return false;
        if (seqid != null ? !seqid.equals(empA04.seqid) : empA04.seqid != null) return false;
        if (empId != null ? !empId.equals(empA04.empId) : empA04.empId != null) return false;
        if (subId != null ? !subId.equals(empA04.subId) : empA04.subId != null) return false;
        if (lastUpdatedStamp != null ? !lastUpdatedStamp.equals(empA04.lastUpdatedStamp) : empA04.lastUpdatedStamp != null)
            return false;
        if (lastUpdatedTxStamp != null ? !lastUpdatedTxStamp.equals(empA04.lastUpdatedTxStamp) : empA04.lastUpdatedTxStamp != null)
            return false;
        if (createdStamp != null ? !createdStamp.equals(empA04.createdStamp) : empA04.createdStamp != null)
            return false;
        if (createdTxStamp != null ? !createdTxStamp.equals(empA04.createdTxStamp) : empA04.createdTxStamp != null)
            return false;
        if (a04025 != null ? !a04025.equals(empA04.a04025) : empA04.a04025 != null) return false;
        if (a04015 != null ? !a04015.equals(empA04.a04015) : empA04.a04015 != null) return false;
        if (a04010 != null ? !a04010.equals(empA04.a04010) : empA04.a04010 != null) return false;
        if (a04006 != null ? !a04006.equals(empA04.a04006) : empA04.a04006 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = a04005 != null ? a04005.hashCode() : 0;
        result = 31 * result + (a04020 != null ? a04020.hashCode() : 0);
        result = 31 * result + (a04027 != null ? a04027.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (status2 != null ? status2.hashCode() : 0);
        result = 31 * result + (seqid != null ? seqid.hashCode() : 0);
        result = 31 * result + (empId != null ? empId.hashCode() : 0);
        result = 31 * result + (subId != null ? subId.hashCode() : 0);
        result = 31 * result + (lastUpdatedStamp != null ? lastUpdatedStamp.hashCode() : 0);
        result = 31 * result + (lastUpdatedTxStamp != null ? lastUpdatedTxStamp.hashCode() : 0);
        result = 31 * result + (createdStamp != null ? createdStamp.hashCode() : 0);
        result = 31 * result + (createdTxStamp != null ? createdTxStamp.hashCode() : 0);
        result = 31 * result + (a04025 != null ? a04025.hashCode() : 0);
        result = 31 * result + (a04015 != null ? a04015.hashCode() : 0);
        result = 31 * result + (a04010 != null ? a04010.hashCode() : 0);
        result = 31 * result + (a04006 != null ? a04006.hashCode() : 0);
        return result;
    }
}
