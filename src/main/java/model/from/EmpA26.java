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
@Table(name = "EMP_A26", catalog = "")
public class EmpA26 {
    private String id;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String a26025;
    private String a26007;
    private String a26037;
    private String a26001;
    private String a26014B;
    private String a26017B;
    private String a26034;
    private String a26041;
    private String a26021;
    private Long a26016;
    private String a26017A;
    private String a26014A;
    private String a26031;
    private String a26027;
    private String status;
    private String status2;
    private Long seqid;
    private String empId;
    private String subId;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private Timestamp a26011;
    private Timestamp a26004;
    private String a26024;

    @Basic
    @Column(name = "A26025", nullable = true, length = 100)
    public String getA26025() {
        return a26025;
    }

    public void setA26025(String a26025) {
        this.a26025 = a26025;
    }

    @Basic
    @Column(name = "A26007", nullable = true, length = 100)
    public String getA26007() {
        return a26007;
    }

    public void setA26007(String a26007) {
        this.a26007 = a26007;
    }

    @Basic
    @Column(name = "A26037", nullable = true, length = 100)
    public String getA26037() {
        return a26037;
    }

    public void setA26037(String a26037) {
        this.a26037 = a26037;
    }

    @Basic
    @Column(name = "A26001", nullable = true, length = 100)
    public String getA26001() {
        return a26001;
    }

    public void setA26001(String a26001) {
        this.a26001 = a26001;
    }

    @Basic
    @Column(name = "A26014_B", nullable = true, length = 50)
    public String getA26014B() {
        return a26014B;
    }

    public void setA26014B(String a26014B) {
        this.a26014B = a26014B;
    }

    @Basic
    @Column(name = "A26017_B", nullable = true, length = 18)
    public String getA26017B() {
        return a26017B;
    }

    public void setA26017B(String a26017B) {
        this.a26017B = a26017B;
    }

    @Basic
    @Column(name = "A26034", nullable = true, length = 100)
    public String getA26034() {
        return a26034;
    }

    public void setA26034(String a26034) {
        this.a26034 = a26034;
    }

    @Basic
    @Column(name = "A26041", nullable = true, length = 100)
    public String getA26041() {
        return a26041;
    }

    public void setA26041(String a26041) {
        this.a26041 = a26041;
    }

    @Basic
    @Column(name = "A26021", nullable = true, length = 100)
    public String getA26021() {
        return a26021;
    }

    public void setA26021(String a26021) {
        this.a26021 = a26021;
    }

    @Basic
    @Column(name = "A26016", nullable = true, precision = 0)
    public Long getA26016() {
        return a26016;
    }

    public void setA26016(Long a26016) {
        this.a26016 = a26016;
    }

    @Basic
    @Column(name = "A26017_A", nullable = true, length = 120)
    public String getA26017A() {
        return a26017A;
    }

    public void setA26017A(String a26017A) {
        this.a26017A = a26017A;
    }

    @Basic
    @Column(name = "A26014_A", nullable = true, length = 120)
    public String getA26014A() {
        return a26014A;
    }

    public void setA26014A(String a26014A) {
        this.a26014A = a26014A;
    }

    @Basic
    @Column(name = "A26031", nullable = true, length = 100)
    public String getA26031() {
        return a26031;
    }

    public void setA26031(String a26031) {
        this.a26031 = a26031;
    }

    @Basic
    @Column(name = "A26027", nullable = true, length = 100)
    public String getA26027() {
        return a26027;
    }

    public void setA26027(String a26027) {
        this.a26027 = a26027;
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
    @Column(name = "A26011", nullable = true)
    public Timestamp getA26011() {
        return a26011;
    }

    public void setA26011(Timestamp a26011) {
        this.a26011 = a26011;
    }

    @Basic
    @Column(name = "A26004", nullable = true)
    public Timestamp getA26004() {
        return a26004;
    }

    public void setA26004(Timestamp a26004) {
        this.a26004 = a26004;
    }

    @Basic
    @Column(name = "A26024", nullable = true, length = 100)
    public String getA26024() {
        return a26024;
    }

    public void setA26024(String a26024) {
        this.a26024 = a26024;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpA26 empA26 = (EmpA26) o;

        if (a26025 != null ? !a26025.equals(empA26.a26025) : empA26.a26025 != null) return false;
        if (a26007 != null ? !a26007.equals(empA26.a26007) : empA26.a26007 != null) return false;
        if (a26037 != null ? !a26037.equals(empA26.a26037) : empA26.a26037 != null) return false;
        if (a26001 != null ? !a26001.equals(empA26.a26001) : empA26.a26001 != null) return false;
        if (a26014B != null ? !a26014B.equals(empA26.a26014B) : empA26.a26014B != null) return false;
        if (a26017B != null ? !a26017B.equals(empA26.a26017B) : empA26.a26017B != null) return false;
        if (a26034 != null ? !a26034.equals(empA26.a26034) : empA26.a26034 != null) return false;
        if (a26041 != null ? !a26041.equals(empA26.a26041) : empA26.a26041 != null) return false;
        if (a26021 != null ? !a26021.equals(empA26.a26021) : empA26.a26021 != null) return false;
        if (a26016 != null ? !a26016.equals(empA26.a26016) : empA26.a26016 != null) return false;
        if (a26017A != null ? !a26017A.equals(empA26.a26017A) : empA26.a26017A != null) return false;
        if (a26014A != null ? !a26014A.equals(empA26.a26014A) : empA26.a26014A != null) return false;
        if (a26031 != null ? !a26031.equals(empA26.a26031) : empA26.a26031 != null) return false;
        if (a26027 != null ? !a26027.equals(empA26.a26027) : empA26.a26027 != null) return false;
        if (status != null ? !status.equals(empA26.status) : empA26.status != null) return false;
        if (status2 != null ? !status2.equals(empA26.status2) : empA26.status2 != null) return false;
        if (seqid != null ? !seqid.equals(empA26.seqid) : empA26.seqid != null) return false;
        if (empId != null ? !empId.equals(empA26.empId) : empA26.empId != null) return false;
        if (subId != null ? !subId.equals(empA26.subId) : empA26.subId != null) return false;
        if (lastUpdatedStamp != null ? !lastUpdatedStamp.equals(empA26.lastUpdatedStamp) : empA26.lastUpdatedStamp != null)
            return false;
        if (lastUpdatedTxStamp != null ? !lastUpdatedTxStamp.equals(empA26.lastUpdatedTxStamp) : empA26.lastUpdatedTxStamp != null)
            return false;
        if (createdStamp != null ? !createdStamp.equals(empA26.createdStamp) : empA26.createdStamp != null)
            return false;
        if (createdTxStamp != null ? !createdTxStamp.equals(empA26.createdTxStamp) : empA26.createdTxStamp != null)
            return false;
        if (a26011 != null ? !a26011.equals(empA26.a26011) : empA26.a26011 != null) return false;
        if (a26004 != null ? !a26004.equals(empA26.a26004) : empA26.a26004 != null) return false;
        if (a26024 != null ? !a26024.equals(empA26.a26024) : empA26.a26024 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = a26025 != null ? a26025.hashCode() : 0;
        result = 31 * result + (a26007 != null ? a26007.hashCode() : 0);
        result = 31 * result + (a26037 != null ? a26037.hashCode() : 0);
        result = 31 * result + (a26001 != null ? a26001.hashCode() : 0);
        result = 31 * result + (a26014B != null ? a26014B.hashCode() : 0);
        result = 31 * result + (a26017B != null ? a26017B.hashCode() : 0);
        result = 31 * result + (a26034 != null ? a26034.hashCode() : 0);
        result = 31 * result + (a26041 != null ? a26041.hashCode() : 0);
        result = 31 * result + (a26021 != null ? a26021.hashCode() : 0);
        result = 31 * result + (a26016 != null ? a26016.hashCode() : 0);
        result = 31 * result + (a26017A != null ? a26017A.hashCode() : 0);
        result = 31 * result + (a26014A != null ? a26014A.hashCode() : 0);
        result = 31 * result + (a26031 != null ? a26031.hashCode() : 0);
        result = 31 * result + (a26027 != null ? a26027.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (status2 != null ? status2.hashCode() : 0);
        result = 31 * result + (seqid != null ? seqid.hashCode() : 0);
        result = 31 * result + (empId != null ? empId.hashCode() : 0);
        result = 31 * result + (subId != null ? subId.hashCode() : 0);
        result = 31 * result + (lastUpdatedStamp != null ? lastUpdatedStamp.hashCode() : 0);
        result = 31 * result + (lastUpdatedTxStamp != null ? lastUpdatedTxStamp.hashCode() : 0);
        result = 31 * result + (createdStamp != null ? createdStamp.hashCode() : 0);
        result = 31 * result + (createdTxStamp != null ? createdTxStamp.hashCode() : 0);
        result = 31 * result + (a26011 != null ? a26011.hashCode() : 0);
        result = 31 * result + (a26004 != null ? a26004.hashCode() : 0);
        result = 31 * result + (a26024 != null ? a26024.hashCode() : 0);
        return result;
    }
}
