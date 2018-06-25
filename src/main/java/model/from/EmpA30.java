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
@Table(name = "EMP_A30", catalog = "")
public class EmpA30 {
    private String id;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String a30017;
    private String a30031;
    private String a30002;
    private String a30007A;
    private String a30015;
    private String a30024;
    private String a30007B;
    private String a30011;
    private String a30021;
    private String a30037;
    private String status;
    private String status2;
    private Long seqid;
    private String empId;
    private String subId;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private Timestamp a30004;
    private String a30034;

    @Basic
    @Column(name = "A30017", nullable = true, length = 100)
    public String getA30017() {
        return a30017;
    }

    public void setA30017(String a30017) {
        this.a30017 = a30017;
    }

    @Basic
    @Column(name = "A30031", nullable = true, length = 100)
    public String getA30031() {
        return a30031;
    }

    public void setA30031(String a30031) {
        this.a30031 = a30031;
    }

    @Basic
    @Column(name = "A30002", nullable = true, length = 100)
    public String getA30002() {
        return a30002;
    }

    public void setA30002(String a30002) {
        this.a30002 = a30002;
    }

    @Basic
    @Column(name = "A30007_A", nullable = true, length = 120)
    public String getA30007A() {
        return a30007A;
    }

    public void setA30007A(String a30007A) {
        this.a30007A = a30007A;
    }

    @Basic
    @Column(name = "A30015", nullable = true, length = 100)
    public String getA30015() {
        return a30015;
    }

    public void setA30015(String a30015) {
        this.a30015 = a30015;
    }

    @Basic
    @Column(name = "A30024", nullable = true, length = 100)
    public String getA30024() {
        return a30024;
    }

    public void setA30024(String a30024) {
        this.a30024 = a30024;
    }

    @Basic
    @Column(name = "A30007_B", nullable = true, length = 50)
    public String getA30007B() {
        return a30007B;
    }

    public void setA30007B(String a30007B) {
        this.a30007B = a30007B;
    }

    @Basic
    @Column(name = "A30011", nullable = true, length = 100)
    public String getA30011() {
        return a30011;
    }

    public void setA30011(String a30011) {
        this.a30011 = a30011;
    }

    @Basic
    @Column(name = "A30021", nullable = true, length = 100)
    public String getA30021() {
        return a30021;
    }

    public void setA30021(String a30021) {
        this.a30021 = a30021;
    }

    @Basic
    @Column(name = "A30037", nullable = true, length = 100)
    public String getA30037() {
        return a30037;
    }

    public void setA30037(String a30037) {
        this.a30037 = a30037;
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
    @Column(name = "A30004", nullable = true)
    public Timestamp getA30004() {
        return a30004;
    }

    public void setA30004(Timestamp a30004) {
        this.a30004 = a30004;
    }

    @Basic
    @Column(name = "A30034", nullable = true, length = 4000)
    public String getA30034() {
        return a30034;
    }

    public void setA30034(String a30034) {
        this.a30034 = a30034;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpA30 empA30 = (EmpA30) o;

        if (a30017 != null ? !a30017.equals(empA30.a30017) : empA30.a30017 != null) return false;
        if (a30031 != null ? !a30031.equals(empA30.a30031) : empA30.a30031 != null) return false;
        if (a30002 != null ? !a30002.equals(empA30.a30002) : empA30.a30002 != null) return false;
        if (a30007A != null ? !a30007A.equals(empA30.a30007A) : empA30.a30007A != null) return false;
        if (a30015 != null ? !a30015.equals(empA30.a30015) : empA30.a30015 != null) return false;
        if (a30024 != null ? !a30024.equals(empA30.a30024) : empA30.a30024 != null) return false;
        if (a30007B != null ? !a30007B.equals(empA30.a30007B) : empA30.a30007B != null) return false;
        if (a30011 != null ? !a30011.equals(empA30.a30011) : empA30.a30011 != null) return false;
        if (a30021 != null ? !a30021.equals(empA30.a30021) : empA30.a30021 != null) return false;
        if (a30037 != null ? !a30037.equals(empA30.a30037) : empA30.a30037 != null) return false;
        if (status != null ? !status.equals(empA30.status) : empA30.status != null) return false;
        if (status2 != null ? !status2.equals(empA30.status2) : empA30.status2 != null) return false;
        if (seqid != null ? !seqid.equals(empA30.seqid) : empA30.seqid != null) return false;
        if (empId != null ? !empId.equals(empA30.empId) : empA30.empId != null) return false;
        if (subId != null ? !subId.equals(empA30.subId) : empA30.subId != null) return false;
        if (lastUpdatedStamp != null ? !lastUpdatedStamp.equals(empA30.lastUpdatedStamp) : empA30.lastUpdatedStamp != null)
            return false;
        if (lastUpdatedTxStamp != null ? !lastUpdatedTxStamp.equals(empA30.lastUpdatedTxStamp) : empA30.lastUpdatedTxStamp != null)
            return false;
        if (createdStamp != null ? !createdStamp.equals(empA30.createdStamp) : empA30.createdStamp != null)
            return false;
        if (createdTxStamp != null ? !createdTxStamp.equals(empA30.createdTxStamp) : empA30.createdTxStamp != null)
            return false;
        if (a30004 != null ? !a30004.equals(empA30.a30004) : empA30.a30004 != null) return false;
        if (a30034 != null ? !a30034.equals(empA30.a30034) : empA30.a30034 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = a30017 != null ? a30017.hashCode() : 0;
        result = 31 * result + (a30031 != null ? a30031.hashCode() : 0);
        result = 31 * result + (a30002 != null ? a30002.hashCode() : 0);
        result = 31 * result + (a30007A != null ? a30007A.hashCode() : 0);
        result = 31 * result + (a30015 != null ? a30015.hashCode() : 0);
        result = 31 * result + (a30024 != null ? a30024.hashCode() : 0);
        result = 31 * result + (a30007B != null ? a30007B.hashCode() : 0);
        result = 31 * result + (a30011 != null ? a30011.hashCode() : 0);
        result = 31 * result + (a30021 != null ? a30021.hashCode() : 0);
        result = 31 * result + (a30037 != null ? a30037.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (status2 != null ? status2.hashCode() : 0);
        result = 31 * result + (seqid != null ? seqid.hashCode() : 0);
        result = 31 * result + (empId != null ? empId.hashCode() : 0);
        result = 31 * result + (subId != null ? subId.hashCode() : 0);
        result = 31 * result + (lastUpdatedStamp != null ? lastUpdatedStamp.hashCode() : 0);
        result = 31 * result + (lastUpdatedTxStamp != null ? lastUpdatedTxStamp.hashCode() : 0);
        result = 31 * result + (createdStamp != null ? createdStamp.hashCode() : 0);
        result = 31 * result + (createdTxStamp != null ? createdTxStamp.hashCode() : 0);
        result = 31 * result + (a30004 != null ? a30004.hashCode() : 0);
        result = 31 * result + (a30034 != null ? a30034.hashCode() : 0);
        return result;
    }
}
