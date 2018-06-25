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
@Table(name = "EMP_A38", catalog = "")
public class EmpA38 {
    private String id;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private Long a38027;
    private String a38034;
    private String a38010;
    private String a38051;
    private String a38021A;
    private Long a38031;
    private String a38007B;
    private String a38021B;
    private String a38037;
    private String a38004B;
    private String a38007A;
    private String a38011;
    private String a38014;
    private String a38004A;
    private String status;
    private String status2;
    private Long seqid;
    private String empId;
    private String subId;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private Timestamp a38017;
    private Timestamp a38001;
    private String a38024;

    @Basic
    @Column(name = "A38027", nullable = true, precision = 2)
    public Long getA38027() {
        return a38027;
    }

    public void setA38027(Long a38027) {
        this.a38027 = a38027;
    }

    @Basic
    @Column(name = "A38034", nullable = true, length = 40)
    public String getA38034() {
        return a38034;
    }

    public void setA38034(String a38034) {
        this.a38034 = a38034;
    }

    @Basic
    @Column(name = "A38010", nullable = true, length = 100)
    public String getA38010() {
        return a38010;
    }

    public void setA38010(String a38010) {
        this.a38010 = a38010;
    }

    @Basic
    @Column(name = "A38051", nullable = true, length = 100)
    public String getA38051() {
        return a38051;
    }

    public void setA38051(String a38051) {
        this.a38051 = a38051;
    }

    @Basic
    @Column(name = "A38021_A", nullable = true, length = 120)
    public String getA38021A() {
        return a38021A;
    }

    public void setA38021A(String a38021A) {
        this.a38021A = a38021A;
    }

    @Basic
    @Column(name = "A38031", nullable = true, precision = 2)
    public Long getA38031() {
        return a38031;
    }

    public void setA38031(Long a38031) {
        this.a38031 = a38031;
    }

    @Basic
    @Column(name = "A38007_B", nullable = true, length = 18)
    public String getA38007B() {
        return a38007B;
    }

    public void setA38007B(String a38007B) {
        this.a38007B = a38007B;
    }

    @Basic
    @Column(name = "A38021_B", nullable = true, length = 18)
    public String getA38021B() {
        return a38021B;
    }

    public void setA38021B(String a38021B) {
        this.a38021B = a38021B;
    }

    @Basic
    @Column(name = "A38037", nullable = true, length = 48)
    public String getA38037() {
        return a38037;
    }

    public void setA38037(String a38037) {
        this.a38037 = a38037;
    }

    @Basic
    @Column(name = "A38004_B", nullable = true, length = 18)
    public String getA38004B() {
        return a38004B;
    }

    public void setA38004B(String a38004B) {
        this.a38004B = a38004B;
    }

    @Basic
    @Column(name = "A38007_A", nullable = true, length = 120)
    public String getA38007A() {
        return a38007A;
    }

    public void setA38007A(String a38007A) {
        this.a38007A = a38007A;
    }

    @Basic
    @Column(name = "A38011", nullable = true, length = 6)
    public String getA38011() {
        return a38011;
    }

    public void setA38011(String a38011) {
        this.a38011 = a38011;
    }

    @Basic
    @Column(name = "A38014", nullable = true, length = 100)
    public String getA38014() {
        return a38014;
    }

    public void setA38014(String a38014) {
        this.a38014 = a38014;
    }

    @Basic
    @Column(name = "A38004_A", nullable = true, length = 120)
    public String getA38004A() {
        return a38004A;
    }

    public void setA38004A(String a38004A) {
        this.a38004A = a38004A;
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
    @Column(name = "A38017", nullable = true)
    public Timestamp getA38017() {
        return a38017;
    }

    public void setA38017(Timestamp a38017) {
        this.a38017 = a38017;
    }

    @Basic
    @Column(name = "A38001", nullable = true)
    public Timestamp getA38001() {
        return a38001;
    }

    public void setA38001(Timestamp a38001) {
        this.a38001 = a38001;
    }

    @Basic
    @Column(name = "A38024", nullable = true, length = 4000)
    public String getA38024() {
        return a38024;
    }

    public void setA38024(String a38024) {
        this.a38024 = a38024;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpA38 empA38 = (EmpA38) o;

        if (a38027 != null ? !a38027.equals(empA38.a38027) : empA38.a38027 != null) return false;
        if (a38034 != null ? !a38034.equals(empA38.a38034) : empA38.a38034 != null) return false;
        if (a38010 != null ? !a38010.equals(empA38.a38010) : empA38.a38010 != null) return false;
        if (a38051 != null ? !a38051.equals(empA38.a38051) : empA38.a38051 != null) return false;
        if (a38021A != null ? !a38021A.equals(empA38.a38021A) : empA38.a38021A != null) return false;
        if (a38031 != null ? !a38031.equals(empA38.a38031) : empA38.a38031 != null) return false;
        if (a38007B != null ? !a38007B.equals(empA38.a38007B) : empA38.a38007B != null) return false;
        if (a38021B != null ? !a38021B.equals(empA38.a38021B) : empA38.a38021B != null) return false;
        if (a38037 != null ? !a38037.equals(empA38.a38037) : empA38.a38037 != null) return false;
        if (a38004B != null ? !a38004B.equals(empA38.a38004B) : empA38.a38004B != null) return false;
        if (a38007A != null ? !a38007A.equals(empA38.a38007A) : empA38.a38007A != null) return false;
        if (a38011 != null ? !a38011.equals(empA38.a38011) : empA38.a38011 != null) return false;
        if (a38014 != null ? !a38014.equals(empA38.a38014) : empA38.a38014 != null) return false;
        if (a38004A != null ? !a38004A.equals(empA38.a38004A) : empA38.a38004A != null) return false;
        if (status != null ? !status.equals(empA38.status) : empA38.status != null) return false;
        if (status2 != null ? !status2.equals(empA38.status2) : empA38.status2 != null) return false;
        if (seqid != null ? !seqid.equals(empA38.seqid) : empA38.seqid != null) return false;
        if (empId != null ? !empId.equals(empA38.empId) : empA38.empId != null) return false;
        if (subId != null ? !subId.equals(empA38.subId) : empA38.subId != null) return false;
        if (lastUpdatedStamp != null ? !lastUpdatedStamp.equals(empA38.lastUpdatedStamp) : empA38.lastUpdatedStamp != null)
            return false;
        if (lastUpdatedTxStamp != null ? !lastUpdatedTxStamp.equals(empA38.lastUpdatedTxStamp) : empA38.lastUpdatedTxStamp != null)
            return false;
        if (createdStamp != null ? !createdStamp.equals(empA38.createdStamp) : empA38.createdStamp != null)
            return false;
        if (createdTxStamp != null ? !createdTxStamp.equals(empA38.createdTxStamp) : empA38.createdTxStamp != null)
            return false;
        if (a38017 != null ? !a38017.equals(empA38.a38017) : empA38.a38017 != null) return false;
        if (a38001 != null ? !a38001.equals(empA38.a38001) : empA38.a38001 != null) return false;
        if (a38024 != null ? !a38024.equals(empA38.a38024) : empA38.a38024 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = a38027 != null ? a38027.hashCode() : 0;
        result = 31 * result + (a38034 != null ? a38034.hashCode() : 0);
        result = 31 * result + (a38010 != null ? a38010.hashCode() : 0);
        result = 31 * result + (a38051 != null ? a38051.hashCode() : 0);
        result = 31 * result + (a38021A != null ? a38021A.hashCode() : 0);
        result = 31 * result + (a38031 != null ? a38031.hashCode() : 0);
        result = 31 * result + (a38007B != null ? a38007B.hashCode() : 0);
        result = 31 * result + (a38021B != null ? a38021B.hashCode() : 0);
        result = 31 * result + (a38037 != null ? a38037.hashCode() : 0);
        result = 31 * result + (a38004B != null ? a38004B.hashCode() : 0);
        result = 31 * result + (a38007A != null ? a38007A.hashCode() : 0);
        result = 31 * result + (a38011 != null ? a38011.hashCode() : 0);
        result = 31 * result + (a38014 != null ? a38014.hashCode() : 0);
        result = 31 * result + (a38004A != null ? a38004A.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (status2 != null ? status2.hashCode() : 0);
        result = 31 * result + (seqid != null ? seqid.hashCode() : 0);
        result = 31 * result + (empId != null ? empId.hashCode() : 0);
        result = 31 * result + (subId != null ? subId.hashCode() : 0);
        result = 31 * result + (lastUpdatedStamp != null ? lastUpdatedStamp.hashCode() : 0);
        result = 31 * result + (lastUpdatedTxStamp != null ? lastUpdatedTxStamp.hashCode() : 0);
        result = 31 * result + (createdStamp != null ? createdStamp.hashCode() : 0);
        result = 31 * result + (createdTxStamp != null ? createdTxStamp.hashCode() : 0);
        result = 31 * result + (a38017 != null ? a38017.hashCode() : 0);
        result = 31 * result + (a38001 != null ? a38001.hashCode() : 0);
        result = 31 * result + (a38024 != null ? a38024.hashCode() : 0);
        return result;
    }
}
