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
@Table(name = "EMP_A20", catalog = "")
public class EmpA20 {
    private String id;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String a20008B;
    private String a20020;
    private Long a20021;
    private String a20004;
    private String a20014;
    private Long a20017;
    private String a20008A;
    private String a20011A;
    private String a20011B;
    private String status;
    private String status2;
    private Long seqid;
    private String empId;
    private String subId;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private Timestamp a20001;
    private String a20024;

    @Basic
    @Column(name = "A20008_B", nullable = true, length = 5)
    public String getA20008B() {
        return a20008B;
    }

    public void setA20008B(String a20008B) {
        this.a20008B = a20008B;
    }

    @Basic
    @Column(name = "A20020", nullable = true, length = 100)
    public String getA20020() {
        return a20020;
    }

    public void setA20020(String a20020) {
        this.a20020 = a20020;
    }

    @Basic
    @Column(name = "A20021", nullable = true, precision = 2)
    public Long getA20021() {
        return a20021;
    }

    public void setA20021(Long a20021) {
        this.a20021 = a20021;
    }

    @Basic
    @Column(name = "A20004", nullable = true, length = 120)
    public String getA20004() {
        return a20004;
    }

    public void setA20004(String a20004) {
        this.a20004 = a20004;
    }

    @Basic
    @Column(name = "A20014", nullable = true, length = 100)
    public String getA20014() {
        return a20014;
    }

    public void setA20014(String a20014) {
        this.a20014 = a20014;
    }

    @Basic
    @Column(name = "A20017", nullable = true, precision = 2)
    public Long getA20017() {
        return a20017;
    }

    public void setA20017(Long a20017) {
        this.a20017 = a20017;
    }

    @Basic
    @Column(name = "A20008_A", nullable = true, length = 120)
    public String getA20008A() {
        return a20008A;
    }

    public void setA20008A(String a20008A) {
        this.a20008A = a20008A;
    }

    @Basic
    @Column(name = "A20011_A", nullable = true, length = 120)
    public String getA20011A() {
        return a20011A;
    }

    public void setA20011A(String a20011A) {
        this.a20011A = a20011A;
    }

    @Basic
    @Column(name = "A20011_B", nullable = true, length = 18)
    public String getA20011B() {
        return a20011B;
    }

    public void setA20011B(String a20011B) {
        this.a20011B = a20011B;
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
    @Column(name = "A20001", nullable = true)
    public Timestamp getA20001() {
        return a20001;
    }

    public void setA20001(Timestamp a20001) {
        this.a20001 = a20001;
    }

    @Basic
    @Column(name = "A20024", nullable = true, length = 4000)
    public String getA20024() {
        return a20024;
    }

    public void setA20024(String a20024) {
        this.a20024 = a20024;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpA20 empA20 = (EmpA20) o;

        if (a20008B != null ? !a20008B.equals(empA20.a20008B) : empA20.a20008B != null) return false;
        if (a20020 != null ? !a20020.equals(empA20.a20020) : empA20.a20020 != null) return false;
        if (a20021 != null ? !a20021.equals(empA20.a20021) : empA20.a20021 != null) return false;
        if (a20004 != null ? !a20004.equals(empA20.a20004) : empA20.a20004 != null) return false;
        if (a20014 != null ? !a20014.equals(empA20.a20014) : empA20.a20014 != null) return false;
        if (a20017 != null ? !a20017.equals(empA20.a20017) : empA20.a20017 != null) return false;
        if (a20008A != null ? !a20008A.equals(empA20.a20008A) : empA20.a20008A != null) return false;
        if (a20011A != null ? !a20011A.equals(empA20.a20011A) : empA20.a20011A != null) return false;
        if (a20011B != null ? !a20011B.equals(empA20.a20011B) : empA20.a20011B != null) return false;
        if (status != null ? !status.equals(empA20.status) : empA20.status != null) return false;
        if (status2 != null ? !status2.equals(empA20.status2) : empA20.status2 != null) return false;
        if (seqid != null ? !seqid.equals(empA20.seqid) : empA20.seqid != null) return false;
        if (empId != null ? !empId.equals(empA20.empId) : empA20.empId != null) return false;
        if (subId != null ? !subId.equals(empA20.subId) : empA20.subId != null) return false;
        if (lastUpdatedStamp != null ? !lastUpdatedStamp.equals(empA20.lastUpdatedStamp) : empA20.lastUpdatedStamp != null)
            return false;
        if (lastUpdatedTxStamp != null ? !lastUpdatedTxStamp.equals(empA20.lastUpdatedTxStamp) : empA20.lastUpdatedTxStamp != null)
            return false;
        if (createdStamp != null ? !createdStamp.equals(empA20.createdStamp) : empA20.createdStamp != null)
            return false;
        if (createdTxStamp != null ? !createdTxStamp.equals(empA20.createdTxStamp) : empA20.createdTxStamp != null)
            return false;
        if (a20001 != null ? !a20001.equals(empA20.a20001) : empA20.a20001 != null) return false;
        if (a20024 != null ? !a20024.equals(empA20.a20024) : empA20.a20024 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = a20008B != null ? a20008B.hashCode() : 0;
        result = 31 * result + (a20020 != null ? a20020.hashCode() : 0);
        result = 31 * result + (a20021 != null ? a20021.hashCode() : 0);
        result = 31 * result + (a20004 != null ? a20004.hashCode() : 0);
        result = 31 * result + (a20014 != null ? a20014.hashCode() : 0);
        result = 31 * result + (a20017 != null ? a20017.hashCode() : 0);
        result = 31 * result + (a20008A != null ? a20008A.hashCode() : 0);
        result = 31 * result + (a20011A != null ? a20011A.hashCode() : 0);
        result = 31 * result + (a20011B != null ? a20011B.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (status2 != null ? status2.hashCode() : 0);
        result = 31 * result + (seqid != null ? seqid.hashCode() : 0);
        result = 31 * result + (empId != null ? empId.hashCode() : 0);
        result = 31 * result + (subId != null ? subId.hashCode() : 0);
        result = 31 * result + (lastUpdatedStamp != null ? lastUpdatedStamp.hashCode() : 0);
        result = 31 * result + (lastUpdatedTxStamp != null ? lastUpdatedTxStamp.hashCode() : 0);
        result = 31 * result + (createdStamp != null ? createdStamp.hashCode() : 0);
        result = 31 * result + (createdTxStamp != null ? createdTxStamp.hashCode() : 0);
        result = 31 * result + (a20001 != null ? a20001.hashCode() : 0);
        result = 31 * result + (a20024 != null ? a20024.hashCode() : 0);
        return result;
    }
}
