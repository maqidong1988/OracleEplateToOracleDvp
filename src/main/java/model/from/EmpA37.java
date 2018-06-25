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
@Table(name = "EMP_A37", catalog = "")
public class EmpA37 {
    private String id;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String a37007;
    private String a37017;
    private String a37009;
    private String a37001;
    private String a37008;
    private String a37011;
    private String a37005;
    private String a37014;
    private String a37004;
    private String a37006;
    private String status;
    private String status2;
    private Long seqid;
    private String empId;
    private String subId;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;

    @Basic
    @Column(name = "A37007", nullable = true, length = 20)
    public String getA37007() {
        return a37007;
    }

    public void setA37007(String a37007) {
        this.a37007 = a37007;
    }

    @Basic
    @Column(name = "A37017", nullable = true, length = 50)
    public String getA37017() {
        return a37017;
    }

    public void setA37017(String a37017) {
        this.a37017 = a37017;
    }

    @Basic
    @Column(name = "A37009", nullable = true, length = 20)
    public String getA37009() {
        return a37009;
    }

    public void setA37009(String a37009) {
        this.a37009 = a37009;
    }

    @Basic
    @Column(name = "A37001", nullable = true, length = 80)
    public String getA37001() {
        return a37001;
    }

    public void setA37001(String a37001) {
        this.a37001 = a37001;
    }

    @Basic
    @Column(name = "A37008", nullable = true, length = 100)
    public String getA37008() {
        return a37008;
    }

    public void setA37008(String a37008) {
        this.a37008 = a37008;
    }

    @Basic
    @Column(name = "A37011", nullable = true, length = 120)
    public String getA37011() {
        return a37011;
    }

    public void setA37011(String a37011) {
        this.a37011 = a37011;
    }

    @Basic
    @Column(name = "A37005", nullable = true, length = 20)
    public String getA37005() {
        return a37005;
    }

    public void setA37005(String a37005) {
        this.a37005 = a37005;
    }

    @Basic
    @Column(name = "A37014", nullable = true, length = 6)
    public String getA37014() {
        return a37014;
    }

    public void setA37014(String a37014) {
        this.a37014 = a37014;
    }

    @Basic
    @Column(name = "A37004", nullable = true, length = 6)
    public String getA37004() {
        return a37004;
    }

    public void setA37004(String a37004) {
        this.a37004 = a37004;
    }

    @Basic
    @Column(name = "A37006", nullable = true, length = 20)
    public String getA37006() {
        return a37006;
    }

    public void setA37006(String a37006) {
        this.a37006 = a37006;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpA37 empA37 = (EmpA37) o;

        if (a37007 != null ? !a37007.equals(empA37.a37007) : empA37.a37007 != null) return false;
        if (a37017 != null ? !a37017.equals(empA37.a37017) : empA37.a37017 != null) return false;
        if (a37009 != null ? !a37009.equals(empA37.a37009) : empA37.a37009 != null) return false;
        if (a37001 != null ? !a37001.equals(empA37.a37001) : empA37.a37001 != null) return false;
        if (a37008 != null ? !a37008.equals(empA37.a37008) : empA37.a37008 != null) return false;
        if (a37011 != null ? !a37011.equals(empA37.a37011) : empA37.a37011 != null) return false;
        if (a37005 != null ? !a37005.equals(empA37.a37005) : empA37.a37005 != null) return false;
        if (a37014 != null ? !a37014.equals(empA37.a37014) : empA37.a37014 != null) return false;
        if (a37004 != null ? !a37004.equals(empA37.a37004) : empA37.a37004 != null) return false;
        if (a37006 != null ? !a37006.equals(empA37.a37006) : empA37.a37006 != null) return false;
        if (status != null ? !status.equals(empA37.status) : empA37.status != null) return false;
        if (status2 != null ? !status2.equals(empA37.status2) : empA37.status2 != null) return false;
        if (seqid != null ? !seqid.equals(empA37.seqid) : empA37.seqid != null) return false;
        if (empId != null ? !empId.equals(empA37.empId) : empA37.empId != null) return false;
        if (subId != null ? !subId.equals(empA37.subId) : empA37.subId != null) return false;
        if (lastUpdatedStamp != null ? !lastUpdatedStamp.equals(empA37.lastUpdatedStamp) : empA37.lastUpdatedStamp != null)
            return false;
        if (lastUpdatedTxStamp != null ? !lastUpdatedTxStamp.equals(empA37.lastUpdatedTxStamp) : empA37.lastUpdatedTxStamp != null)
            return false;
        if (createdStamp != null ? !createdStamp.equals(empA37.createdStamp) : empA37.createdStamp != null)
            return false;
        if (createdTxStamp != null ? !createdTxStamp.equals(empA37.createdTxStamp) : empA37.createdTxStamp != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = a37007 != null ? a37007.hashCode() : 0;
        result = 31 * result + (a37017 != null ? a37017.hashCode() : 0);
        result = 31 * result + (a37009 != null ? a37009.hashCode() : 0);
        result = 31 * result + (a37001 != null ? a37001.hashCode() : 0);
        result = 31 * result + (a37008 != null ? a37008.hashCode() : 0);
        result = 31 * result + (a37011 != null ? a37011.hashCode() : 0);
        result = 31 * result + (a37005 != null ? a37005.hashCode() : 0);
        result = 31 * result + (a37014 != null ? a37014.hashCode() : 0);
        result = 31 * result + (a37004 != null ? a37004.hashCode() : 0);
        result = 31 * result + (a37006 != null ? a37006.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (status2 != null ? status2.hashCode() : 0);
        result = 31 * result + (seqid != null ? seqid.hashCode() : 0);
        result = 31 * result + (empId != null ? empId.hashCode() : 0);
        result = 31 * result + (subId != null ? subId.hashCode() : 0);
        result = 31 * result + (lastUpdatedStamp != null ? lastUpdatedStamp.hashCode() : 0);
        result = 31 * result + (lastUpdatedTxStamp != null ? lastUpdatedTxStamp.hashCode() : 0);
        result = 31 * result + (createdStamp != null ? createdStamp.hashCode() : 0);
        result = 31 * result + (createdTxStamp != null ? createdTxStamp.hashCode() : 0);
        return result;
    }
}
