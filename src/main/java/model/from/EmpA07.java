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
@Table(name = "EMP_A07", catalog = "")
public class EmpA07 {
    private String id;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String a07007A;
    private String a07007B;
    private String a07011;
    private String status;
    private String status2;
    private Long seqid;
    private String empId;
    private String subId;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private Timestamp a07014;
    private String a07001;
    private Timestamp a07004;
    private String a07012;

    @Basic
    @Column(name = "A07007_A", nullable = true, length = 120)
    public String getA07007A() {
        return a07007A;
    }

    public void setA07007A(String a07007A) {
        this.a07007A = a07007A;
    }

    @Basic
    @Column(name = "A07007_B", nullable = true, length = 32)
    public String getA07007B() {
        return a07007B;
    }

    public void setA07007B(String a07007B) {
        this.a07007B = a07007B;
    }

    @Basic
    @Column(name = "A07011", nullable = true, length = 48)
    public String getA07011() {
        return a07011;
    }

    public void setA07011(String a07011) {
        this.a07011 = a07011;
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
    @Column(name = "A07014", nullable = true)
    public Timestamp getA07014() {
        return a07014;
    }

    public void setA07014(Timestamp a07014) {
        this.a07014 = a07014;
    }

    @Basic
    @Column(name = "A07001", nullable = true, length = 3)
    public String getA07001() {
        return a07001;
    }

    public void setA07001(String a07001) {
        this.a07001 = a07001;
    }

    @Basic
    @Column(name = "A07004", nullable = true)
    public Timestamp getA07004() {
        return a07004;
    }

    public void setA07004(Timestamp a07004) {
        this.a07004 = a07004;
    }

    @Basic
    @Column(name = "A07012", nullable = true, length = 500)
    public String getA07012() {
        return a07012;
    }

    public void setA07012(String a07012) {
        this.a07012 = a07012;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpA07 empA07 = (EmpA07) o;

        if (a07007A != null ? !a07007A.equals(empA07.a07007A) : empA07.a07007A != null) return false;
        if (a07007B != null ? !a07007B.equals(empA07.a07007B) : empA07.a07007B != null) return false;
        if (a07011 != null ? !a07011.equals(empA07.a07011) : empA07.a07011 != null) return false;
        if (status != null ? !status.equals(empA07.status) : empA07.status != null) return false;
        if (status2 != null ? !status2.equals(empA07.status2) : empA07.status2 != null) return false;
        if (seqid != null ? !seqid.equals(empA07.seqid) : empA07.seqid != null) return false;
        if (empId != null ? !empId.equals(empA07.empId) : empA07.empId != null) return false;
        if (subId != null ? !subId.equals(empA07.subId) : empA07.subId != null) return false;
        if (lastUpdatedStamp != null ? !lastUpdatedStamp.equals(empA07.lastUpdatedStamp) : empA07.lastUpdatedStamp != null)
            return false;
        if (lastUpdatedTxStamp != null ? !lastUpdatedTxStamp.equals(empA07.lastUpdatedTxStamp) : empA07.lastUpdatedTxStamp != null)
            return false;
        if (createdStamp != null ? !createdStamp.equals(empA07.createdStamp) : empA07.createdStamp != null)
            return false;
        if (createdTxStamp != null ? !createdTxStamp.equals(empA07.createdTxStamp) : empA07.createdTxStamp != null)
            return false;
        if (a07014 != null ? !a07014.equals(empA07.a07014) : empA07.a07014 != null) return false;
        if (a07001 != null ? !a07001.equals(empA07.a07001) : empA07.a07001 != null) return false;
        if (a07004 != null ? !a07004.equals(empA07.a07004) : empA07.a07004 != null) return false;
        if (a07012 != null ? !a07012.equals(empA07.a07012) : empA07.a07012 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = a07007A != null ? a07007A.hashCode() : 0;
        result = 31 * result + (a07007B != null ? a07007B.hashCode() : 0);
        result = 31 * result + (a07011 != null ? a07011.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (status2 != null ? status2.hashCode() : 0);
        result = 31 * result + (seqid != null ? seqid.hashCode() : 0);
        result = 31 * result + (empId != null ? empId.hashCode() : 0);
        result = 31 * result + (subId != null ? subId.hashCode() : 0);
        result = 31 * result + (lastUpdatedStamp != null ? lastUpdatedStamp.hashCode() : 0);
        result = 31 * result + (lastUpdatedTxStamp != null ? lastUpdatedTxStamp.hashCode() : 0);
        result = 31 * result + (createdStamp != null ? createdStamp.hashCode() : 0);
        result = 31 * result + (createdTxStamp != null ? createdTxStamp.hashCode() : 0);
        result = 31 * result + (a07014 != null ? a07014.hashCode() : 0);
        result = 31 * result + (a07001 != null ? a07001.hashCode() : 0);
        result = 31 * result + (a07004 != null ? a07004.hashCode() : 0);
        result = 31 * result + (a07012 != null ? a07012.hashCode() : 0);
        return result;
    }
}
