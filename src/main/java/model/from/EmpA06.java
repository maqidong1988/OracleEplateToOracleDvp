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
@Table(name = "EMP_A06", catalog = "")
public class EmpA06 {
    private String id;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String a06001A;
    private String a06040;
    private String a06001B;
    private String a06013;
    private String a06020;
    private String a06035;
    private String a06045;
    private String a06051;
    private String a06053;
    private String a06002;
    private String a06007;
    private String status;
    private String status2;
    private Long seqid;
    private String empId;
    private String subId;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private Timestamp a06030;
    private Timestamp a06004;
    private Timestamp a06025;
    private String a06011;

    @Basic
    @Column(name = "A06001_A", nullable = true, length = 40)
    public String getA06001A() {
        return a06001A;
    }

    public void setA06001A(String a06001A) {
        this.a06001A = a06001A;
    }

    @Basic
    @Column(name = "A06040", nullable = true, length = 100)
    public String getA06040() {
        return a06040;
    }

    public void setA06040(String a06040) {
        this.a06040 = a06040;
    }

    @Basic
    @Column(name = "A06001_B", nullable = true, length = 3)
    public String getA06001B() {
        return a06001B;
    }

    public void setA06001B(String a06001B) {
        this.a06001B = a06001B;
    }

    @Basic
    @Column(name = "A06013", nullable = true, length = 120)
    public String getA06013() {
        return a06013;
    }

    public void setA06013(String a06013) {
        this.a06013 = a06013;
    }

    @Basic
    @Column(name = "A06020", nullable = true, length = 100)
    public String getA06020() {
        return a06020;
    }

    public void setA06020(String a06020) {
        this.a06020 = a06020;
    }

    @Basic
    @Column(name = "A06035", nullable = true, length = 120)
    public String getA06035() {
        return a06035;
    }

    public void setA06035(String a06035) {
        this.a06035 = a06035;
    }

    @Basic
    @Column(name = "A06045", nullable = true, length = 100)
    public String getA06045() {
        return a06045;
    }

    public void setA06045(String a06045) {
        this.a06045 = a06045;
    }

    @Basic
    @Column(name = "A06051", nullable = true, length = 100)
    public String getA06051() {
        return a06051;
    }

    public void setA06051(String a06051) {
        this.a06051 = a06051;
    }

    @Basic
    @Column(name = "A06053", nullable = true, length = 100)
    public String getA06053() {
        return a06053;
    }

    public void setA06053(String a06053) {
        this.a06053 = a06053;
    }

    @Basic
    @Column(name = "A06002", nullable = true, length = 100)
    public String getA06002() {
        return a06002;
    }

    public void setA06002(String a06002) {
        this.a06002 = a06002;
    }

    @Basic
    @Column(name = "A06007", nullable = true, length = 100)
    public String getA06007() {
        return a06007;
    }

    public void setA06007(String a06007) {
        this.a06007 = a06007;
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
    @Column(name = "A06030", nullable = true)
    public Timestamp getA06030() {
        return a06030;
    }

    public void setA06030(Timestamp a06030) {
        this.a06030 = a06030;
    }

    @Basic
    @Column(name = "A06004", nullable = true)
    public Timestamp getA06004() {
        return a06004;
    }

    public void setA06004(Timestamp a06004) {
        this.a06004 = a06004;
    }

    @Basic
    @Column(name = "A06025", nullable = true)
    public Timestamp getA06025() {
        return a06025;
    }

    public void setA06025(Timestamp a06025) {
        this.a06025 = a06025;
    }

    @Basic
    @Column(name = "A06011", nullable = true, length = 4000)
    public String getA06011() {
        return a06011;
    }

    public void setA06011(String a06011) {
        this.a06011 = a06011;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpA06 empA06 = (EmpA06) o;

        if (a06001A != null ? !a06001A.equals(empA06.a06001A) : empA06.a06001A != null) return false;
        if (a06040 != null ? !a06040.equals(empA06.a06040) : empA06.a06040 != null) return false;
        if (a06001B != null ? !a06001B.equals(empA06.a06001B) : empA06.a06001B != null) return false;
        if (a06013 != null ? !a06013.equals(empA06.a06013) : empA06.a06013 != null) return false;
        if (a06020 != null ? !a06020.equals(empA06.a06020) : empA06.a06020 != null) return false;
        if (a06035 != null ? !a06035.equals(empA06.a06035) : empA06.a06035 != null) return false;
        if (a06045 != null ? !a06045.equals(empA06.a06045) : empA06.a06045 != null) return false;
        if (a06051 != null ? !a06051.equals(empA06.a06051) : empA06.a06051 != null) return false;
        if (a06053 != null ? !a06053.equals(empA06.a06053) : empA06.a06053 != null) return false;
        if (a06002 != null ? !a06002.equals(empA06.a06002) : empA06.a06002 != null) return false;
        if (a06007 != null ? !a06007.equals(empA06.a06007) : empA06.a06007 != null) return false;
        if (status != null ? !status.equals(empA06.status) : empA06.status != null) return false;
        if (status2 != null ? !status2.equals(empA06.status2) : empA06.status2 != null) return false;
        if (seqid != null ? !seqid.equals(empA06.seqid) : empA06.seqid != null) return false;
        if (empId != null ? !empId.equals(empA06.empId) : empA06.empId != null) return false;
        if (subId != null ? !subId.equals(empA06.subId) : empA06.subId != null) return false;
        if (lastUpdatedStamp != null ? !lastUpdatedStamp.equals(empA06.lastUpdatedStamp) : empA06.lastUpdatedStamp != null)
            return false;
        if (lastUpdatedTxStamp != null ? !lastUpdatedTxStamp.equals(empA06.lastUpdatedTxStamp) : empA06.lastUpdatedTxStamp != null)
            return false;
        if (createdStamp != null ? !createdStamp.equals(empA06.createdStamp) : empA06.createdStamp != null)
            return false;
        if (createdTxStamp != null ? !createdTxStamp.equals(empA06.createdTxStamp) : empA06.createdTxStamp != null)
            return false;
        if (a06030 != null ? !a06030.equals(empA06.a06030) : empA06.a06030 != null) return false;
        if (a06004 != null ? !a06004.equals(empA06.a06004) : empA06.a06004 != null) return false;
        if (a06025 != null ? !a06025.equals(empA06.a06025) : empA06.a06025 != null) return false;
        if (a06011 != null ? !a06011.equals(empA06.a06011) : empA06.a06011 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = a06001A != null ? a06001A.hashCode() : 0;
        result = 31 * result + (a06040 != null ? a06040.hashCode() : 0);
        result = 31 * result + (a06001B != null ? a06001B.hashCode() : 0);
        result = 31 * result + (a06013 != null ? a06013.hashCode() : 0);
        result = 31 * result + (a06020 != null ? a06020.hashCode() : 0);
        result = 31 * result + (a06035 != null ? a06035.hashCode() : 0);
        result = 31 * result + (a06045 != null ? a06045.hashCode() : 0);
        result = 31 * result + (a06051 != null ? a06051.hashCode() : 0);
        result = 31 * result + (a06053 != null ? a06053.hashCode() : 0);
        result = 31 * result + (a06002 != null ? a06002.hashCode() : 0);
        result = 31 * result + (a06007 != null ? a06007.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (status2 != null ? status2.hashCode() : 0);
        result = 31 * result + (seqid != null ? seqid.hashCode() : 0);
        result = 31 * result + (empId != null ? empId.hashCode() : 0);
        result = 31 * result + (subId != null ? subId.hashCode() : 0);
        result = 31 * result + (lastUpdatedStamp != null ? lastUpdatedStamp.hashCode() : 0);
        result = 31 * result + (lastUpdatedTxStamp != null ? lastUpdatedTxStamp.hashCode() : 0);
        result = 31 * result + (createdStamp != null ? createdStamp.hashCode() : 0);
        result = 31 * result + (createdTxStamp != null ? createdTxStamp.hashCode() : 0);
        result = 31 * result + (a06030 != null ? a06030.hashCode() : 0);
        result = 31 * result + (a06004 != null ? a06004.hashCode() : 0);
        result = 31 * result + (a06025 != null ? a06025.hashCode() : 0);
        result = 31 * result + (a06011 != null ? a06011.hashCode() : 0);
        return result;
    }
}
