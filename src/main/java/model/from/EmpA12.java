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
@Table(name = "EMP_A12", catalog = "")
public class EmpA12 {
    private String id;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String a12001B;
    private String a12017;
    private String a12036;
    private String a12001A;
    private String a12040;
    private String a12020;
    private String a12034;
    private String a12060;
    private String a12061;
    private Long a12012;
    private String a12014;
    private String a12035;
    private String a12018;
    private String a12021;
    private String a12050;
    private String status;
    private String status2;
    private Long seqid;
    private String empId;
    private String subId;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private Timestamp a12037;
    private Timestamp a12045;
    private Timestamp a12041;

    @Basic
    @Column(name = "A12001_B", nullable = true, length = 3)
    public String getA12001B() {
        return a12001B;
    }

    public void setA12001B(String a12001B) {
        this.a12001B = a12001B;
    }

    @Basic
    @Column(name = "A12017", nullable = true, length = 120)
    public String getA12017() {
        return a12017;
    }

    public void setA12017(String a12017) {
        this.a12017 = a12017;
    }

    @Basic
    @Column(name = "A12036", nullable = true, length = 80)
    public String getA12036() {
        return a12036;
    }

    public void setA12036(String a12036) {
        this.a12036 = a12036;
    }

    @Basic
    @Column(name = "A12001_A", nullable = true, length = 80)
    public String getA12001A() {
        return a12001A;
    }

    public void setA12001A(String a12001A) {
        this.a12001A = a12001A;
    }

    @Basic
    @Column(name = "A12040", nullable = true, length = 120)
    public String getA12040() {
        return a12040;
    }

    public void setA12040(String a12040) {
        this.a12040 = a12040;
    }

    @Basic
    @Column(name = "A12020", nullable = true, length = 120)
    public String getA12020() {
        return a12020;
    }

    public void setA12020(String a12020) {
        this.a12020 = a12020;
    }

    @Basic
    @Column(name = "A12034", nullable = true, length = 100)
    public String getA12034() {
        return a12034;
    }

    public void setA12034(String a12034) {
        this.a12034 = a12034;
    }

    @Basic
    @Column(name = "A12060", nullable = true, length = 40)
    public String getA12060() {
        return a12060;
    }

    public void setA12060(String a12060) {
        this.a12060 = a12060;
    }

    @Basic
    @Column(name = "A12061", nullable = true, length = 100)
    public String getA12061() {
        return a12061;
    }

    public void setA12061(String a12061) {
        this.a12061 = a12061;
    }

    @Basic
    @Column(name = "A12012", nullable = true, precision = 2)
    public Long getA12012() {
        return a12012;
    }

    public void setA12012(Long a12012) {
        this.a12012 = a12012;
    }

    @Basic
    @Column(name = "A12014", nullable = true, length = 100)
    public String getA12014() {
        return a12014;
    }

    public void setA12014(String a12014) {
        this.a12014 = a12014;
    }

    @Basic
    @Column(name = "A12035", nullable = true, length = 100)
    public String getA12035() {
        return a12035;
    }

    public void setA12035(String a12035) {
        this.a12035 = a12035;
    }

    @Basic
    @Column(name = "A12018", nullable = true, length = 120)
    public String getA12018() {
        return a12018;
    }

    public void setA12018(String a12018) {
        this.a12018 = a12018;
    }

    @Basic
    @Column(name = "A12021", nullable = true, length = 120)
    public String getA12021() {
        return a12021;
    }

    public void setA12021(String a12021) {
        this.a12021 = a12021;
    }

    @Basic
    @Column(name = "A12050", nullable = true, length = 48)
    public String getA12050() {
        return a12050;
    }

    public void setA12050(String a12050) {
        this.a12050 = a12050;
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
    @Column(name = "A12037", nullable = true)
    public Timestamp getA12037() {
        return a12037;
    }

    public void setA12037(Timestamp a12037) {
        this.a12037 = a12037;
    }

    @Basic
    @Column(name = "A12045", nullable = true)
    public Timestamp getA12045() {
        return a12045;
    }

    public void setA12045(Timestamp a12045) {
        this.a12045 = a12045;
    }

    @Basic
    @Column(name = "A12041", nullable = true)
    public Timestamp getA12041() {
        return a12041;
    }

    public void setA12041(Timestamp a12041) {
        this.a12041 = a12041;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpA12 empA12 = (EmpA12) o;

        if (a12001B != null ? !a12001B.equals(empA12.a12001B) : empA12.a12001B != null) return false;
        if (a12017 != null ? !a12017.equals(empA12.a12017) : empA12.a12017 != null) return false;
        if (a12036 != null ? !a12036.equals(empA12.a12036) : empA12.a12036 != null) return false;
        if (a12001A != null ? !a12001A.equals(empA12.a12001A) : empA12.a12001A != null) return false;
        if (a12040 != null ? !a12040.equals(empA12.a12040) : empA12.a12040 != null) return false;
        if (a12020 != null ? !a12020.equals(empA12.a12020) : empA12.a12020 != null) return false;
        if (a12034 != null ? !a12034.equals(empA12.a12034) : empA12.a12034 != null) return false;
        if (a12060 != null ? !a12060.equals(empA12.a12060) : empA12.a12060 != null) return false;
        if (a12061 != null ? !a12061.equals(empA12.a12061) : empA12.a12061 != null) return false;
        if (a12012 != null ? !a12012.equals(empA12.a12012) : empA12.a12012 != null) return false;
        if (a12014 != null ? !a12014.equals(empA12.a12014) : empA12.a12014 != null) return false;
        if (a12035 != null ? !a12035.equals(empA12.a12035) : empA12.a12035 != null) return false;
        if (a12018 != null ? !a12018.equals(empA12.a12018) : empA12.a12018 != null) return false;
        if (a12021 != null ? !a12021.equals(empA12.a12021) : empA12.a12021 != null) return false;
        if (a12050 != null ? !a12050.equals(empA12.a12050) : empA12.a12050 != null) return false;
        if (status != null ? !status.equals(empA12.status) : empA12.status != null) return false;
        if (status2 != null ? !status2.equals(empA12.status2) : empA12.status2 != null) return false;
        if (seqid != null ? !seqid.equals(empA12.seqid) : empA12.seqid != null) return false;
        if (empId != null ? !empId.equals(empA12.empId) : empA12.empId != null) return false;
        if (subId != null ? !subId.equals(empA12.subId) : empA12.subId != null) return false;
        if (lastUpdatedStamp != null ? !lastUpdatedStamp.equals(empA12.lastUpdatedStamp) : empA12.lastUpdatedStamp != null)
            return false;
        if (lastUpdatedTxStamp != null ? !lastUpdatedTxStamp.equals(empA12.lastUpdatedTxStamp) : empA12.lastUpdatedTxStamp != null)
            return false;
        if (createdStamp != null ? !createdStamp.equals(empA12.createdStamp) : empA12.createdStamp != null)
            return false;
        if (createdTxStamp != null ? !createdTxStamp.equals(empA12.createdTxStamp) : empA12.createdTxStamp != null)
            return false;
        if (a12037 != null ? !a12037.equals(empA12.a12037) : empA12.a12037 != null) return false;
        if (a12045 != null ? !a12045.equals(empA12.a12045) : empA12.a12045 != null) return false;
        if (a12041 != null ? !a12041.equals(empA12.a12041) : empA12.a12041 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = a12001B != null ? a12001B.hashCode() : 0;
        result = 31 * result + (a12017 != null ? a12017.hashCode() : 0);
        result = 31 * result + (a12036 != null ? a12036.hashCode() : 0);
        result = 31 * result + (a12001A != null ? a12001A.hashCode() : 0);
        result = 31 * result + (a12040 != null ? a12040.hashCode() : 0);
        result = 31 * result + (a12020 != null ? a12020.hashCode() : 0);
        result = 31 * result + (a12034 != null ? a12034.hashCode() : 0);
        result = 31 * result + (a12060 != null ? a12060.hashCode() : 0);
        result = 31 * result + (a12061 != null ? a12061.hashCode() : 0);
        result = 31 * result + (a12012 != null ? a12012.hashCode() : 0);
        result = 31 * result + (a12014 != null ? a12014.hashCode() : 0);
        result = 31 * result + (a12035 != null ? a12035.hashCode() : 0);
        result = 31 * result + (a12018 != null ? a12018.hashCode() : 0);
        result = 31 * result + (a12021 != null ? a12021.hashCode() : 0);
        result = 31 * result + (a12050 != null ? a12050.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (status2 != null ? status2.hashCode() : 0);
        result = 31 * result + (seqid != null ? seqid.hashCode() : 0);
        result = 31 * result + (empId != null ? empId.hashCode() : 0);
        result = 31 * result + (subId != null ? subId.hashCode() : 0);
        result = 31 * result + (lastUpdatedStamp != null ? lastUpdatedStamp.hashCode() : 0);
        result = 31 * result + (lastUpdatedTxStamp != null ? lastUpdatedTxStamp.hashCode() : 0);
        result = 31 * result + (createdStamp != null ? createdStamp.hashCode() : 0);
        result = 31 * result + (createdTxStamp != null ? createdTxStamp.hashCode() : 0);
        result = 31 * result + (a12037 != null ? a12037.hashCode() : 0);
        result = 31 * result + (a12045 != null ? a12045.hashCode() : 0);
        result = 31 * result + (a12041 != null ? a12041.hashCode() : 0);
        return result;
    }
}
