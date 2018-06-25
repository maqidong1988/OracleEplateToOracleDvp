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
@Table(name = "EMP_A27", catalog = "")
public class EmpA27 {
    private String id;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String a27001;
    private String a27007;
    private Long a27012;
    private String a27011;
    private String a27005;
    private String a27007B;
    private String a27015;
    private Long a27016;
    private String a27003;
    private String a27007A;
    private String a27017;
    private Long a27013;
    private String status;
    private String status2;
    private Long seqid;
    private String empId;
    private String subId;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private Timestamp a27014;
    private Timestamp a27010;
    private Timestamp a27004;

    @Basic
    @Column(name = "A27001", nullable = true, length = 100)
    public String getA27001() {
        return a27001;
    }

    public void setA27001(String a27001) {
        this.a27001 = a27001;
    }

    @Basic
    @Column(name = "A27007", nullable = true, length = 16)
    public String getA27007() {
        return a27007;
    }

    public void setA27007(String a27007) {
        this.a27007 = a27007;
    }

    @Basic
    @Column(name = "A27012", nullable = true, precision = 2)
    public Long getA27012() {
        return a27012;
    }

    public void setA27012(Long a27012) {
        this.a27012 = a27012;
    }

    @Basic
    @Column(name = "A27011", nullable = true, length = 100)
    public String getA27011() {
        return a27011;
    }

    public void setA27011(String a27011) {
        this.a27011 = a27011;
    }

    @Basic
    @Column(name = "A27005", nullable = true, length = 100)
    public String getA27005() {
        return a27005;
    }

    public void setA27005(String a27005) {
        this.a27005 = a27005;
    }

    @Basic
    @Column(name = "A27007_B", nullable = true, length = 18)
    public String getA27007B() {
        return a27007B;
    }

    public void setA27007B(String a27007B) {
        this.a27007B = a27007B;
    }

    @Basic
    @Column(name = "A27015", nullable = true, length = 120)
    public String getA27015() {
        return a27015;
    }

    public void setA27015(String a27015) {
        this.a27015 = a27015;
    }

    @Basic
    @Column(name = "A27016", nullable = true, precision = 2)
    public Long getA27016() {
        return a27016;
    }

    public void setA27016(Long a27016) {
        this.a27016 = a27016;
    }

    @Basic
    @Column(name = "A27003", nullable = true, length = 60)
    public String getA27003() {
        return a27003;
    }

    public void setA27003(String a27003) {
        this.a27003 = a27003;
    }

    @Basic
    @Column(name = "A27007_A", nullable = true, length = 120)
    public String getA27007A() {
        return a27007A;
    }

    public void setA27007A(String a27007A) {
        this.a27007A = a27007A;
    }

    @Basic
    @Column(name = "A27017", nullable = true, length = 100)
    public String getA27017() {
        return a27017;
    }

    public void setA27017(String a27017) {
        this.a27017 = a27017;
    }

    @Basic
    @Column(name = "A27013", nullable = true, precision = 2)
    public Long getA27013() {
        return a27013;
    }

    public void setA27013(Long a27013) {
        this.a27013 = a27013;
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
    @Column(name = "A27014", nullable = true)
    public Timestamp getA27014() {
        return a27014;
    }

    public void setA27014(Timestamp a27014) {
        this.a27014 = a27014;
    }

    @Basic
    @Column(name = "A27010", nullable = true)
    public Timestamp getA27010() {
        return a27010;
    }

    public void setA27010(Timestamp a27010) {
        this.a27010 = a27010;
    }

    @Basic
    @Column(name = "A27004", nullable = true)
    public Timestamp getA27004() {
        return a27004;
    }

    public void setA27004(Timestamp a27004) {
        this.a27004 = a27004;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpA27 empA27 = (EmpA27) o;

        if (a27001 != null ? !a27001.equals(empA27.a27001) : empA27.a27001 != null) return false;
        if (a27007 != null ? !a27007.equals(empA27.a27007) : empA27.a27007 != null) return false;
        if (a27012 != null ? !a27012.equals(empA27.a27012) : empA27.a27012 != null) return false;
        if (a27011 != null ? !a27011.equals(empA27.a27011) : empA27.a27011 != null) return false;
        if (a27005 != null ? !a27005.equals(empA27.a27005) : empA27.a27005 != null) return false;
        if (a27007B != null ? !a27007B.equals(empA27.a27007B) : empA27.a27007B != null) return false;
        if (a27015 != null ? !a27015.equals(empA27.a27015) : empA27.a27015 != null) return false;
        if (a27016 != null ? !a27016.equals(empA27.a27016) : empA27.a27016 != null) return false;
        if (a27003 != null ? !a27003.equals(empA27.a27003) : empA27.a27003 != null) return false;
        if (a27007A != null ? !a27007A.equals(empA27.a27007A) : empA27.a27007A != null) return false;
        if (a27017 != null ? !a27017.equals(empA27.a27017) : empA27.a27017 != null) return false;
        if (a27013 != null ? !a27013.equals(empA27.a27013) : empA27.a27013 != null) return false;
        if (status != null ? !status.equals(empA27.status) : empA27.status != null) return false;
        if (status2 != null ? !status2.equals(empA27.status2) : empA27.status2 != null) return false;
        if (seqid != null ? !seqid.equals(empA27.seqid) : empA27.seqid != null) return false;
        if (empId != null ? !empId.equals(empA27.empId) : empA27.empId != null) return false;
        if (subId != null ? !subId.equals(empA27.subId) : empA27.subId != null) return false;
        if (lastUpdatedStamp != null ? !lastUpdatedStamp.equals(empA27.lastUpdatedStamp) : empA27.lastUpdatedStamp != null)
            return false;
        if (lastUpdatedTxStamp != null ? !lastUpdatedTxStamp.equals(empA27.lastUpdatedTxStamp) : empA27.lastUpdatedTxStamp != null)
            return false;
        if (createdStamp != null ? !createdStamp.equals(empA27.createdStamp) : empA27.createdStamp != null)
            return false;
        if (createdTxStamp != null ? !createdTxStamp.equals(empA27.createdTxStamp) : empA27.createdTxStamp != null)
            return false;
        if (a27014 != null ? !a27014.equals(empA27.a27014) : empA27.a27014 != null) return false;
        if (a27010 != null ? !a27010.equals(empA27.a27010) : empA27.a27010 != null) return false;
        if (a27004 != null ? !a27004.equals(empA27.a27004) : empA27.a27004 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = a27001 != null ? a27001.hashCode() : 0;
        result = 31 * result + (a27007 != null ? a27007.hashCode() : 0);
        result = 31 * result + (a27012 != null ? a27012.hashCode() : 0);
        result = 31 * result + (a27011 != null ? a27011.hashCode() : 0);
        result = 31 * result + (a27005 != null ? a27005.hashCode() : 0);
        result = 31 * result + (a27007B != null ? a27007B.hashCode() : 0);
        result = 31 * result + (a27015 != null ? a27015.hashCode() : 0);
        result = 31 * result + (a27016 != null ? a27016.hashCode() : 0);
        result = 31 * result + (a27003 != null ? a27003.hashCode() : 0);
        result = 31 * result + (a27007A != null ? a27007A.hashCode() : 0);
        result = 31 * result + (a27017 != null ? a27017.hashCode() : 0);
        result = 31 * result + (a27013 != null ? a27013.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (status2 != null ? status2.hashCode() : 0);
        result = 31 * result + (seqid != null ? seqid.hashCode() : 0);
        result = 31 * result + (empId != null ? empId.hashCode() : 0);
        result = 31 * result + (subId != null ? subId.hashCode() : 0);
        result = 31 * result + (lastUpdatedStamp != null ? lastUpdatedStamp.hashCode() : 0);
        result = 31 * result + (lastUpdatedTxStamp != null ? lastUpdatedTxStamp.hashCode() : 0);
        result = 31 * result + (createdStamp != null ? createdStamp.hashCode() : 0);
        result = 31 * result + (createdTxStamp != null ? createdTxStamp.hashCode() : 0);
        result = 31 * result + (a27014 != null ? a27014.hashCode() : 0);
        result = 31 * result + (a27010 != null ? a27010.hashCode() : 0);
        result = 31 * result + (a27004 != null ? a27004.hashCode() : 0);
        return result;
    }
}
