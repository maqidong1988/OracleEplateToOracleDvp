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
@Table(name = "EMP_A09", catalog = "")
public class EmpA09 {
    private String a09001B;
    private String a09007;
    private String a09061;
    private String a09043;
    private String a09011;
    private String a09050;
    private String a09001A;
    private String a09014;
    private String status;
    private String status2;
    private Long seqid;
    private String empId;
    private String subId;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private Timestamp a09004;
    private String a09081;

    @Basic
    @Column(name = "A09001_B", nullable = true, length = 10)
    public String getA09001B() {
        return a09001B;
    }

    public void setA09001B(String a09001B) {
        this.a09001B = a09001B;
    }

    @Basic
    @Column(name = "A09007", nullable = true, length = 120)
    public String getA09007() {
        return a09007;
    }

    public void setA09007(String a09007) {
        this.a09007 = a09007;
    }

    @Basic
    @Column(name = "A09061", nullable = true, length = 100)
    public String getA09061() {
        return a09061;
    }

    public void setA09061(String a09061) {
        this.a09061 = a09061;
    }

    @Basic
    @Column(name = "A09043", nullable = true, length = 20)
    public String getA09043() {
        return a09043;
    }

    public void setA09043(String a09043) {
        this.a09043 = a09043;
    }

    @Basic
    @Column(name = "A09011", nullable = true, length = 100)
    public String getA09011() {
        return a09011;
    }

    public void setA09011(String a09011) {
        this.a09011 = a09011;
    }

    @Basic
    @Column(name = "A09050", nullable = true, length = 100)
    public String getA09050() {
        return a09050;
    }

    public void setA09050(String a09050) {
        this.a09050 = a09050;
    }

    @Basic
    @Column(name = "A09001_A", nullable = true, length = 40)
    public String getA09001A() {
        return a09001A;
    }

    public void setA09001A(String a09001A) {
        this.a09001A = a09001A;
    }

    @Basic
    @Column(name = "A09014", nullable = true, length = 100)
    public String getA09014() {
        return a09014;
    }

    public void setA09014(String a09014) {
        this.a09014 = a09014;
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
    @Column(name = "A09004", nullable = true)
    public Timestamp getA09004() {
        return a09004;
    }

    public void setA09004(Timestamp a09004) {
        this.a09004 = a09004;
    }

    @Basic
    @Column(name = "A09081", nullable = true, length = 10)
    public String getA09081() {
        return a09081;
    }

    public void setA09081(String a09081) {
        this.a09081 = a09081;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpA09 empA09 = (EmpA09) o;

        if (a09001B != null ? !a09001B.equals(empA09.a09001B) : empA09.a09001B != null) return false;
        if (a09007 != null ? !a09007.equals(empA09.a09007) : empA09.a09007 != null) return false;
        if (a09061 != null ? !a09061.equals(empA09.a09061) : empA09.a09061 != null) return false;
        if (a09043 != null ? !a09043.equals(empA09.a09043) : empA09.a09043 != null) return false;
        if (a09011 != null ? !a09011.equals(empA09.a09011) : empA09.a09011 != null) return false;
        if (a09050 != null ? !a09050.equals(empA09.a09050) : empA09.a09050 != null) return false;
        if (a09001A != null ? !a09001A.equals(empA09.a09001A) : empA09.a09001A != null) return false;
        if (a09014 != null ? !a09014.equals(empA09.a09014) : empA09.a09014 != null) return false;
        if (status != null ? !status.equals(empA09.status) : empA09.status != null) return false;
        if (status2 != null ? !status2.equals(empA09.status2) : empA09.status2 != null) return false;
        if (seqid != null ? !seqid.equals(empA09.seqid) : empA09.seqid != null) return false;
        if (empId != null ? !empId.equals(empA09.empId) : empA09.empId != null) return false;
        if (subId != null ? !subId.equals(empA09.subId) : empA09.subId != null) return false;
        if (lastUpdatedStamp != null ? !lastUpdatedStamp.equals(empA09.lastUpdatedStamp) : empA09.lastUpdatedStamp != null)
            return false;
        if (lastUpdatedTxStamp != null ? !lastUpdatedTxStamp.equals(empA09.lastUpdatedTxStamp) : empA09.lastUpdatedTxStamp != null)
            return false;
        if (createdStamp != null ? !createdStamp.equals(empA09.createdStamp) : empA09.createdStamp != null)
            return false;
        if (createdTxStamp != null ? !createdTxStamp.equals(empA09.createdTxStamp) : empA09.createdTxStamp != null)
            return false;
        if (a09004 != null ? !a09004.equals(empA09.a09004) : empA09.a09004 != null) return false;
        if (a09081 != null ? !a09081.equals(empA09.a09081) : empA09.a09081 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = a09001B != null ? a09001B.hashCode() : 0;
        result = 31 * result + (a09007 != null ? a09007.hashCode() : 0);
        result = 31 * result + (a09061 != null ? a09061.hashCode() : 0);
        result = 31 * result + (a09043 != null ? a09043.hashCode() : 0);
        result = 31 * result + (a09011 != null ? a09011.hashCode() : 0);
        result = 31 * result + (a09050 != null ? a09050.hashCode() : 0);
        result = 31 * result + (a09001A != null ? a09001A.hashCode() : 0);
        result = 31 * result + (a09014 != null ? a09014.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (status2 != null ? status2.hashCode() : 0);
        result = 31 * result + (seqid != null ? seqid.hashCode() : 0);
        result = 31 * result + (empId != null ? empId.hashCode() : 0);
        result = 31 * result + (subId != null ? subId.hashCode() : 0);
        result = 31 * result + (lastUpdatedStamp != null ? lastUpdatedStamp.hashCode() : 0);
        result = 31 * result + (lastUpdatedTxStamp != null ? lastUpdatedTxStamp.hashCode() : 0);
        result = 31 * result + (createdStamp != null ? createdStamp.hashCode() : 0);
        result = 31 * result + (createdTxStamp != null ? createdTxStamp.hashCode() : 0);
        result = 31 * result + (a09004 != null ? a09004.hashCode() : 0);
        result = 31 * result + (a09081 != null ? a09081.hashCode() : 0);
        return result;
    }
}
