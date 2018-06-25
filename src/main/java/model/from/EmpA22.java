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
@Table(name = "EMP_A22", catalog = "")
public class EmpA22 {
    private String id;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private Long a22017;
    private String a22014;
    private String a22037;
    private String a22034;
    private String a22024;
    private String a22041;
    private String a22011;
    private String a22030;
    private String a22031;
    private String a22004;
    private String a22007;
    private String a22021;
    private String status;
    private String status2;
    private Long seqid;
    private String empId;
    private String subId;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private Timestamp a22001;
    private Timestamp a22027;
    private String a22044;

    @Basic
    @Column(name = "A22017", nullable = true, precision = 2)
    public Long getA22017() {
        return a22017;
    }

    public void setA22017(Long a22017) {
        this.a22017 = a22017;
    }

    @Basic
    @Column(name = "A22014", nullable = true, length = 100)
    public String getA22014() {
        return a22014;
    }

    public void setA22014(String a22014) {
        this.a22014 = a22014;
    }

    @Basic
    @Column(name = "A22037", nullable = true, length = 100)
    public String getA22037() {
        return a22037;
    }

    public void setA22037(String a22037) {
        this.a22037 = a22037;
    }

    @Basic
    @Column(name = "A22034", nullable = true, length = 100)
    public String getA22034() {
        return a22034;
    }

    public void setA22034(String a22034) {
        this.a22034 = a22034;
    }

    @Basic
    @Column(name = "A22024", nullable = true, length = 100)
    public String getA22024() {
        return a22024;
    }

    public void setA22024(String a22024) {
        this.a22024 = a22024;
    }

    @Basic
    @Column(name = "A22041", nullable = true, length = 100)
    public String getA22041() {
        return a22041;
    }

    public void setA22041(String a22041) {
        this.a22041 = a22041;
    }

    @Basic
    @Column(name = "A22011", nullable = true, length = 100)
    public String getA22011() {
        return a22011;
    }

    public void setA22011(String a22011) {
        this.a22011 = a22011;
    }

    @Basic
    @Column(name = "A22030", nullable = true, length = 100)
    public String getA22030() {
        return a22030;
    }

    public void setA22030(String a22030) {
        this.a22030 = a22030;
    }

    @Basic
    @Column(name = "A22031", nullable = true, length = 120)
    public String getA22031() {
        return a22031;
    }

    public void setA22031(String a22031) {
        this.a22031 = a22031;
    }

    @Basic
    @Column(name = "A22004", nullable = true, length = 120)
    public String getA22004() {
        return a22004;
    }

    public void setA22004(String a22004) {
        this.a22004 = a22004;
    }

    @Basic
    @Column(name = "A22007", nullable = true, length = 100)
    public String getA22007() {
        return a22007;
    }

    public void setA22007(String a22007) {
        this.a22007 = a22007;
    }

    @Basic
    @Column(name = "A22021", nullable = true, length = 100)
    public String getA22021() {
        return a22021;
    }

    public void setA22021(String a22021) {
        this.a22021 = a22021;
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
    @Column(name = "A22001", nullable = true)
    public Timestamp getA22001() {
        return a22001;
    }

    public void setA22001(Timestamp a22001) {
        this.a22001 = a22001;
    }

    @Basic
    @Column(name = "A22027", nullable = true)
    public Timestamp getA22027() {
        return a22027;
    }

    public void setA22027(Timestamp a22027) {
        this.a22027 = a22027;
    }

    @Basic
    @Column(name = "A22044", nullable = true, length = 4000)
    public String getA22044() {
        return a22044;
    }

    public void setA22044(String a22044) {
        this.a22044 = a22044;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpA22 empA22 = (EmpA22) o;

        if (a22017 != null ? !a22017.equals(empA22.a22017) : empA22.a22017 != null) return false;
        if (a22014 != null ? !a22014.equals(empA22.a22014) : empA22.a22014 != null) return false;
        if (a22037 != null ? !a22037.equals(empA22.a22037) : empA22.a22037 != null) return false;
        if (a22034 != null ? !a22034.equals(empA22.a22034) : empA22.a22034 != null) return false;
        if (a22024 != null ? !a22024.equals(empA22.a22024) : empA22.a22024 != null) return false;
        if (a22041 != null ? !a22041.equals(empA22.a22041) : empA22.a22041 != null) return false;
        if (a22011 != null ? !a22011.equals(empA22.a22011) : empA22.a22011 != null) return false;
        if (a22030 != null ? !a22030.equals(empA22.a22030) : empA22.a22030 != null) return false;
        if (a22031 != null ? !a22031.equals(empA22.a22031) : empA22.a22031 != null) return false;
        if (a22004 != null ? !a22004.equals(empA22.a22004) : empA22.a22004 != null) return false;
        if (a22007 != null ? !a22007.equals(empA22.a22007) : empA22.a22007 != null) return false;
        if (a22021 != null ? !a22021.equals(empA22.a22021) : empA22.a22021 != null) return false;
        if (status != null ? !status.equals(empA22.status) : empA22.status != null) return false;
        if (status2 != null ? !status2.equals(empA22.status2) : empA22.status2 != null) return false;
        if (seqid != null ? !seqid.equals(empA22.seqid) : empA22.seqid != null) return false;
        if (empId != null ? !empId.equals(empA22.empId) : empA22.empId != null) return false;
        if (subId != null ? !subId.equals(empA22.subId) : empA22.subId != null) return false;
        if (lastUpdatedStamp != null ? !lastUpdatedStamp.equals(empA22.lastUpdatedStamp) : empA22.lastUpdatedStamp != null)
            return false;
        if (lastUpdatedTxStamp != null ? !lastUpdatedTxStamp.equals(empA22.lastUpdatedTxStamp) : empA22.lastUpdatedTxStamp != null)
            return false;
        if (createdStamp != null ? !createdStamp.equals(empA22.createdStamp) : empA22.createdStamp != null)
            return false;
        if (createdTxStamp != null ? !createdTxStamp.equals(empA22.createdTxStamp) : empA22.createdTxStamp != null)
            return false;
        if (a22001 != null ? !a22001.equals(empA22.a22001) : empA22.a22001 != null) return false;
        if (a22027 != null ? !a22027.equals(empA22.a22027) : empA22.a22027 != null) return false;
        if (a22044 != null ? !a22044.equals(empA22.a22044) : empA22.a22044 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = a22017 != null ? a22017.hashCode() : 0;
        result = 31 * result + (a22014 != null ? a22014.hashCode() : 0);
        result = 31 * result + (a22037 != null ? a22037.hashCode() : 0);
        result = 31 * result + (a22034 != null ? a22034.hashCode() : 0);
        result = 31 * result + (a22024 != null ? a22024.hashCode() : 0);
        result = 31 * result + (a22041 != null ? a22041.hashCode() : 0);
        result = 31 * result + (a22011 != null ? a22011.hashCode() : 0);
        result = 31 * result + (a22030 != null ? a22030.hashCode() : 0);
        result = 31 * result + (a22031 != null ? a22031.hashCode() : 0);
        result = 31 * result + (a22004 != null ? a22004.hashCode() : 0);
        result = 31 * result + (a22007 != null ? a22007.hashCode() : 0);
        result = 31 * result + (a22021 != null ? a22021.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (status2 != null ? status2.hashCode() : 0);
        result = 31 * result + (seqid != null ? seqid.hashCode() : 0);
        result = 31 * result + (empId != null ? empId.hashCode() : 0);
        result = 31 * result + (subId != null ? subId.hashCode() : 0);
        result = 31 * result + (lastUpdatedStamp != null ? lastUpdatedStamp.hashCode() : 0);
        result = 31 * result + (lastUpdatedTxStamp != null ? lastUpdatedTxStamp.hashCode() : 0);
        result = 31 * result + (createdStamp != null ? createdStamp.hashCode() : 0);
        result = 31 * result + (createdTxStamp != null ? createdTxStamp.hashCode() : 0);
        result = 31 * result + (a22001 != null ? a22001.hashCode() : 0);
        result = 31 * result + (a22027 != null ? a22027.hashCode() : 0);
        result = 31 * result + (a22044 != null ? a22044.hashCode() : 0);
        return result;
    }
}
