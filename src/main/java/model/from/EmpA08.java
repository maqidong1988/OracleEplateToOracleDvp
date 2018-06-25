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
@Table(name = "EMP_A08", catalog = "")
public class EmpA08 {
    private String a08006;
    private String a08024;
    private String a08034;
    private String a08011;
    private String a08002B;
    private String a08017;
    private String a08020;
    private String a08002A;
    private String a08027;
    private String a08014;
    private String a08021;
    private String a08031;
    private String status;
    private String status2;
    private Long seqid;
    private String empId;
    private String subId;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private Timestamp a08004;
    private Timestamp a08007;
    private String a08015;
    private String a08016;

    @Basic
    @Column(name = "A08006", nullable = true, length = 20)
    public String getA08006() {
        return a08006;
    }

    public void setA08006(String a08006) {
        this.a08006 = a08006;
    }

    @Basic
    @Column(name = "A08024", nullable = true, length = 100)
    public String getA08024() {
        return a08024;
    }

    public void setA08024(String a08024) {
        this.a08024 = a08024;
    }

    @Basic
    @Column(name = "A08034", nullable = true, length = 100)
    public String getA08034() {
        return a08034;
    }

    public void setA08034(String a08034) {
        this.a08034 = a08034;
    }

    @Basic
    @Column(name = "A08011", nullable = true, length = 50)
    public String getA08011() {
        return a08011;
    }

    public void setA08011(String a08011) {
        this.a08011 = a08011;
    }

    @Basic
    @Column(name = "A08002_B", nullable = true, length = 100)
    public String getA08002B() {
        return a08002B;
    }

    public void setA08002B(String a08002B) {
        this.a08002B = a08002B;
    }

    @Basic
    @Column(name = "A08017", nullable = true, length = 100)
    public String getA08017() {
        return a08017;
    }

    public void setA08017(String a08017) {
        this.a08017 = a08017;
    }

    @Basic
    @Column(name = "A08020", nullable = true, length = 100)
    public String getA08020() {
        return a08020;
    }

    public void setA08020(String a08020) {
        this.a08020 = a08020;
    }

    @Basic
    @Column(name = "A08002_A", nullable = true, length = 20)
    public String getA08002A() {
        return a08002A;
    }

    public void setA08002A(String a08002A) {
        this.a08002A = a08002A;
    }

    @Basic
    @Column(name = "A08027", nullable = true, length = 100)
    public String getA08027() {
        return a08027;
    }

    public void setA08027(String a08027) {
        this.a08027 = a08027;
    }

    @Basic
    @Column(name = "A08014", nullable = true, length = 120)
    public String getA08014() {
        return a08014;
    }

    public void setA08014(String a08014) {
        this.a08014 = a08014;
    }

    @Basic
    @Column(name = "A08021", nullable = true, length = 100)
    public String getA08021() {
        return a08021;
    }

    public void setA08021(String a08021) {
        this.a08021 = a08021;
    }

    @Basic
    @Column(name = "A08031", nullable = true, length = 100)
    public String getA08031() {
        return a08031;
    }

    public void setA08031(String a08031) {
        this.a08031 = a08031;
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
    @Column(name = "A08004", nullable = true)
    public Timestamp getA08004() {
        return a08004;
    }

    public void setA08004(Timestamp a08004) {
        this.a08004 = a08004;
    }

    @Basic
    @Column(name = "A08007", nullable = true)
    public Timestamp getA08007() {
        return a08007;
    }

    public void setA08007(Timestamp a08007) {
        this.a08007 = a08007;
    }

    @Basic
    @Column(name = "A08015", nullable = true, length = 100)
    public String getA08015() {
        return a08015;
    }

    public void setA08015(String a08015) {
        this.a08015 = a08015;
    }

    @Basic
    @Column(name = "A08016", nullable = true, length = 100)
    public String getA08016() {
        return a08016;
    }

    public void setA08016(String a08016) {
        this.a08016 = a08016;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpA08 empA08 = (EmpA08) o;

        if (a08006 != null ? !a08006.equals(empA08.a08006) : empA08.a08006 != null) return false;
        if (a08024 != null ? !a08024.equals(empA08.a08024) : empA08.a08024 != null) return false;
        if (a08034 != null ? !a08034.equals(empA08.a08034) : empA08.a08034 != null) return false;
        if (a08011 != null ? !a08011.equals(empA08.a08011) : empA08.a08011 != null) return false;
        if (a08002B != null ? !a08002B.equals(empA08.a08002B) : empA08.a08002B != null) return false;
        if (a08017 != null ? !a08017.equals(empA08.a08017) : empA08.a08017 != null) return false;
        if (a08020 != null ? !a08020.equals(empA08.a08020) : empA08.a08020 != null) return false;
        if (a08002A != null ? !a08002A.equals(empA08.a08002A) : empA08.a08002A != null) return false;
        if (a08027 != null ? !a08027.equals(empA08.a08027) : empA08.a08027 != null) return false;
        if (a08014 != null ? !a08014.equals(empA08.a08014) : empA08.a08014 != null) return false;
        if (a08021 != null ? !a08021.equals(empA08.a08021) : empA08.a08021 != null) return false;
        if (a08031 != null ? !a08031.equals(empA08.a08031) : empA08.a08031 != null) return false;
        if (status != null ? !status.equals(empA08.status) : empA08.status != null) return false;
        if (status2 != null ? !status2.equals(empA08.status2) : empA08.status2 != null) return false;
        if (seqid != null ? !seqid.equals(empA08.seqid) : empA08.seqid != null) return false;
        if (empId != null ? !empId.equals(empA08.empId) : empA08.empId != null) return false;
        if (subId != null ? !subId.equals(empA08.subId) : empA08.subId != null) return false;
        if (lastUpdatedStamp != null ? !lastUpdatedStamp.equals(empA08.lastUpdatedStamp) : empA08.lastUpdatedStamp != null)
            return false;
        if (lastUpdatedTxStamp != null ? !lastUpdatedTxStamp.equals(empA08.lastUpdatedTxStamp) : empA08.lastUpdatedTxStamp != null)
            return false;
        if (createdStamp != null ? !createdStamp.equals(empA08.createdStamp) : empA08.createdStamp != null)
            return false;
        if (createdTxStamp != null ? !createdTxStamp.equals(empA08.createdTxStamp) : empA08.createdTxStamp != null)
            return false;
        if (a08004 != null ? !a08004.equals(empA08.a08004) : empA08.a08004 != null) return false;
        if (a08007 != null ? !a08007.equals(empA08.a08007) : empA08.a08007 != null) return false;
        if (a08015 != null ? !a08015.equals(empA08.a08015) : empA08.a08015 != null) return false;
        if (a08016 != null ? !a08016.equals(empA08.a08016) : empA08.a08016 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = a08006 != null ? a08006.hashCode() : 0;
        result = 31 * result + (a08024 != null ? a08024.hashCode() : 0);
        result = 31 * result + (a08034 != null ? a08034.hashCode() : 0);
        result = 31 * result + (a08011 != null ? a08011.hashCode() : 0);
        result = 31 * result + (a08002B != null ? a08002B.hashCode() : 0);
        result = 31 * result + (a08017 != null ? a08017.hashCode() : 0);
        result = 31 * result + (a08020 != null ? a08020.hashCode() : 0);
        result = 31 * result + (a08002A != null ? a08002A.hashCode() : 0);
        result = 31 * result + (a08027 != null ? a08027.hashCode() : 0);
        result = 31 * result + (a08014 != null ? a08014.hashCode() : 0);
        result = 31 * result + (a08021 != null ? a08021.hashCode() : 0);
        result = 31 * result + (a08031 != null ? a08031.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (status2 != null ? status2.hashCode() : 0);
        result = 31 * result + (seqid != null ? seqid.hashCode() : 0);
        result = 31 * result + (empId != null ? empId.hashCode() : 0);
        result = 31 * result + (subId != null ? subId.hashCode() : 0);
        result = 31 * result + (lastUpdatedStamp != null ? lastUpdatedStamp.hashCode() : 0);
        result = 31 * result + (lastUpdatedTxStamp != null ? lastUpdatedTxStamp.hashCode() : 0);
        result = 31 * result + (createdStamp != null ? createdStamp.hashCode() : 0);
        result = 31 * result + (createdTxStamp != null ? createdTxStamp.hashCode() : 0);
        result = 31 * result + (a08004 != null ? a08004.hashCode() : 0);
        result = 31 * result + (a08007 != null ? a08007.hashCode() : 0);
        result = 31 * result + (a08015 != null ? a08015.hashCode() : 0);
        result = 31 * result + (a08016 != null ? a08016.hashCode() : 0);
        return result;
    }
}
