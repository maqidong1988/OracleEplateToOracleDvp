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
@Table(name = "EMP_A24", catalog = "")
public class EmpA24 {
    private String id;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String a24001;
    private String a24011A;
    private String a24005;
    private String a24011B;
    private String a24015;
    private String a24021;
    private String a24004;
    private String a24017;
    private String status;
    private String status2;
    private Long seqid;
    private String empId;
    private String subId;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private Timestamp a24007;
    private String a24006;

    @Basic
    @Column(name = "A24001", nullable = true, length = 120)
    public String getA24001() {
        return a24001;
    }

    public void setA24001(String a24001) {
        this.a24001 = a24001;
    }

    @Basic
    @Column(name = "A24011_A", nullable = true, length = 120)
    public String getA24011A() {
        return a24011A;
    }

    public void setA24011A(String a24011A) {
        this.a24011A = a24011A;
    }

    @Basic
    @Column(name = "A24005", nullable = true, length = 100)
    public String getA24005() {
        return a24005;
    }

    public void setA24005(String a24005) {
        this.a24005 = a24005;
    }

    @Basic
    @Column(name = "A24011_B", nullable = true, length = 18)
    public String getA24011B() {
        return a24011B;
    }

    public void setA24011B(String a24011B) {
        this.a24011B = a24011B;
    }

    @Basic
    @Column(name = "A24015", nullable = true, length = 100)
    public String getA24015() {
        return a24015;
    }

    public void setA24015(String a24015) {
        this.a24015 = a24015;
    }

    @Basic
    @Column(name = "A24021", nullable = true, length = 40)
    public String getA24021() {
        return a24021;
    }

    public void setA24021(String a24021) {
        this.a24021 = a24021;
    }

    @Basic
    @Column(name = "A24004", nullable = true, length = 100)
    public String getA24004() {
        return a24004;
    }

    public void setA24004(String a24004) {
        this.a24004 = a24004;
    }

    @Basic
    @Column(name = "A24017", nullable = true, length = 100)
    public String getA24017() {
        return a24017;
    }

    public void setA24017(String a24017) {
        this.a24017 = a24017;
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
    @Column(name = "A24007", nullable = true)
    public Timestamp getA24007() {
        return a24007;
    }

    public void setA24007(Timestamp a24007) {
        this.a24007 = a24007;
    }

    @Basic
    @Column(name = "A24006", nullable = true, length = 4000)
    public String getA24006() {
        return a24006;
    }

    public void setA24006(String a24006) {
        this.a24006 = a24006;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpA24 empA24 = (EmpA24) o;

        if (a24001 != null ? !a24001.equals(empA24.a24001) : empA24.a24001 != null) return false;
        if (a24011A != null ? !a24011A.equals(empA24.a24011A) : empA24.a24011A != null) return false;
        if (a24005 != null ? !a24005.equals(empA24.a24005) : empA24.a24005 != null) return false;
        if (a24011B != null ? !a24011B.equals(empA24.a24011B) : empA24.a24011B != null) return false;
        if (a24015 != null ? !a24015.equals(empA24.a24015) : empA24.a24015 != null) return false;
        if (a24021 != null ? !a24021.equals(empA24.a24021) : empA24.a24021 != null) return false;
        if (a24004 != null ? !a24004.equals(empA24.a24004) : empA24.a24004 != null) return false;
        if (a24017 != null ? !a24017.equals(empA24.a24017) : empA24.a24017 != null) return false;
        if (status != null ? !status.equals(empA24.status) : empA24.status != null) return false;
        if (status2 != null ? !status2.equals(empA24.status2) : empA24.status2 != null) return false;
        if (seqid != null ? !seqid.equals(empA24.seqid) : empA24.seqid != null) return false;
        if (empId != null ? !empId.equals(empA24.empId) : empA24.empId != null) return false;
        if (subId != null ? !subId.equals(empA24.subId) : empA24.subId != null) return false;
        if (lastUpdatedStamp != null ? !lastUpdatedStamp.equals(empA24.lastUpdatedStamp) : empA24.lastUpdatedStamp != null)
            return false;
        if (lastUpdatedTxStamp != null ? !lastUpdatedTxStamp.equals(empA24.lastUpdatedTxStamp) : empA24.lastUpdatedTxStamp != null)
            return false;
        if (createdStamp != null ? !createdStamp.equals(empA24.createdStamp) : empA24.createdStamp != null)
            return false;
        if (createdTxStamp != null ? !createdTxStamp.equals(empA24.createdTxStamp) : empA24.createdTxStamp != null)
            return false;
        if (a24007 != null ? !a24007.equals(empA24.a24007) : empA24.a24007 != null) return false;
        if (a24006 != null ? !a24006.equals(empA24.a24006) : empA24.a24006 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = a24001 != null ? a24001.hashCode() : 0;
        result = 31 * result + (a24011A != null ? a24011A.hashCode() : 0);
        result = 31 * result + (a24005 != null ? a24005.hashCode() : 0);
        result = 31 * result + (a24011B != null ? a24011B.hashCode() : 0);
        result = 31 * result + (a24015 != null ? a24015.hashCode() : 0);
        result = 31 * result + (a24021 != null ? a24021.hashCode() : 0);
        result = 31 * result + (a24004 != null ? a24004.hashCode() : 0);
        result = 31 * result + (a24017 != null ? a24017.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (status2 != null ? status2.hashCode() : 0);
        result = 31 * result + (seqid != null ? seqid.hashCode() : 0);
        result = 31 * result + (empId != null ? empId.hashCode() : 0);
        result = 31 * result + (subId != null ? subId.hashCode() : 0);
        result = 31 * result + (lastUpdatedStamp != null ? lastUpdatedStamp.hashCode() : 0);
        result = 31 * result + (lastUpdatedTxStamp != null ? lastUpdatedTxStamp.hashCode() : 0);
        result = 31 * result + (createdStamp != null ? createdStamp.hashCode() : 0);
        result = 31 * result + (createdTxStamp != null ? createdTxStamp.hashCode() : 0);
        result = 31 * result + (a24007 != null ? a24007.hashCode() : 0);
        result = 31 * result + (a24006 != null ? a24006.hashCode() : 0);
        return result;
    }
}
