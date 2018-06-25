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
@Table(name = "EMP_A11", catalog = "")
public class EmpA11 {
    private String id;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String a11001;
    private String a11014A;
    private String a11048;
    private String a11054;
    private String a11017;
    private String a11021A;
    private String a11037;
    private Long a11081;
    private String a11018B;
    private String a11031;
    private Long a11066;
    private String a11067;
    private String a11004;
    private String a11014B;
    private String a11024;
    private String a11034;
    private Long a11046;
    private Long a11057;
    private String a11041;
    private Long a11074;
    private Long a11077;
    private String a11018A;
    private String a11019;
    private String a11021B;
    private String a11044;
    private Long a11071;
    private String a11027;
    private Long a11035;
    private String a11051;
    private String status;
    private String status2;
    private Long seqid;
    private String empId;
    private String subId;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private Timestamp a11007;
    private Timestamp a11011;
    private String a11047;
    private String a11032;
    private String a11045;

    @Basic
    @Column(name = "A11001", nullable = true, length = 100)
    public String getA11001() {
        return a11001;
    }

    public void setA11001(String a11001) {
        this.a11001 = a11001;
    }

    @Basic
    @Column(name = "A11014_A", nullable = true, length = 120)
    public String getA11014A() {
        return a11014A;
    }

    public void setA11014A(String a11014A) {
        this.a11014A = a11014A;
    }

    @Basic
    @Column(name = "A11048", nullable = true, length = 100)
    public String getA11048() {
        return a11048;
    }

    public void setA11048(String a11048) {
        this.a11048 = a11048;
    }

    @Basic
    @Column(name = "A11054", nullable = true, length = 100)
    public String getA11054() {
        return a11054;
    }

    public void setA11054(String a11054) {
        this.a11054 = a11054;
    }

    @Basic
    @Column(name = "A11017", nullable = true, length = 100)
    public String getA11017() {
        return a11017;
    }

    public void setA11017(String a11017) {
        this.a11017 = a11017;
    }

    @Basic
    @Column(name = "A11021_A", nullable = true, length = 120)
    public String getA11021A() {
        return a11021A;
    }

    public void setA11021A(String a11021A) {
        this.a11021A = a11021A;
    }

    @Basic
    @Column(name = "A11037", nullable = true, length = 60)
    public String getA11037() {
        return a11037;
    }

    public void setA11037(String a11037) {
        this.a11037 = a11037;
    }

    @Basic
    @Column(name = "A11081", nullable = true, precision = 2)
    public Long getA11081() {
        return a11081;
    }

    public void setA11081(Long a11081) {
        this.a11081 = a11081;
    }

    @Basic
    @Column(name = "A11018_B", nullable = true, length = 18)
    public String getA11018B() {
        return a11018B;
    }

    public void setA11018B(String a11018B) {
        this.a11018B = a11018B;
    }

    @Basic
    @Column(name = "A11031", nullable = true, length = 100)
    public String getA11031() {
        return a11031;
    }

    public void setA11031(String a11031) {
        this.a11031 = a11031;
    }

    @Basic
    @Column(name = "A11066", nullable = true, precision = 2)
    public Long getA11066() {
        return a11066;
    }

    public void setA11066(Long a11066) {
        this.a11066 = a11066;
    }

    @Basic
    @Column(name = "A11067", nullable = true, length = 60)
    public String getA11067() {
        return a11067;
    }

    public void setA11067(String a11067) {
        this.a11067 = a11067;
    }

    @Basic
    @Column(name = "A11004", nullable = true, length = 100)
    public String getA11004() {
        return a11004;
    }

    public void setA11004(String a11004) {
        this.a11004 = a11004;
    }

    @Basic
    @Column(name = "A11014_B", nullable = true, length = 18)
    public String getA11014B() {
        return a11014B;
    }

    public void setA11014B(String a11014B) {
        this.a11014B = a11014B;
    }

    @Basic
    @Column(name = "A11024", nullable = true, length = 100)
    public String getA11024() {
        return a11024;
    }

    public void setA11024(String a11024) {
        this.a11024 = a11024;
    }

    @Basic
    @Column(name = "A11034", nullable = true, length = 100)
    public String getA11034() {
        return a11034;
    }

    public void setA11034(String a11034) {
        this.a11034 = a11034;
    }

    @Basic
    @Column(name = "A11046", nullable = true, precision = 2)
    public Long getA11046() {
        return a11046;
    }

    public void setA11046(Long a11046) {
        this.a11046 = a11046;
    }

    @Basic
    @Column(name = "A11057", nullable = true, precision = 2)
    public Long getA11057() {
        return a11057;
    }

    public void setA11057(Long a11057) {
        this.a11057 = a11057;
    }

    @Basic
    @Column(name = "A11041", nullable = true, length = 100)
    public String getA11041() {
        return a11041;
    }

    public void setA11041(String a11041) {
        this.a11041 = a11041;
    }

    @Basic
    @Column(name = "A11074", nullable = true, precision = 2)
    public Long getA11074() {
        return a11074;
    }

    public void setA11074(Long a11074) {
        this.a11074 = a11074;
    }

    @Basic
    @Column(name = "A11077", nullable = true, precision = 2)
    public Long getA11077() {
        return a11077;
    }

    public void setA11077(Long a11077) {
        this.a11077 = a11077;
    }

    @Basic
    @Column(name = "A11018_A", nullable = true, length = 120)
    public String getA11018A() {
        return a11018A;
    }

    public void setA11018A(String a11018A) {
        this.a11018A = a11018A;
    }

    @Basic
    @Column(name = "A11019", nullable = true, length = 120)
    public String getA11019() {
        return a11019;
    }

    public void setA11019(String a11019) {
        this.a11019 = a11019;
    }

    @Basic
    @Column(name = "A11021_B", nullable = true, length = 15)
    public String getA11021B() {
        return a11021B;
    }

    public void setA11021B(String a11021B) {
        this.a11021B = a11021B;
    }

    @Basic
    @Column(name = "A11044", nullable = true, length = 100)
    public String getA11044() {
        return a11044;
    }

    public void setA11044(String a11044) {
        this.a11044 = a11044;
    }

    @Basic
    @Column(name = "A11071", nullable = true, precision = 2)
    public Long getA11071() {
        return a11071;
    }

    public void setA11071(Long a11071) {
        this.a11071 = a11071;
    }

    @Basic
    @Column(name = "A11027", nullable = true, length = 100)
    public String getA11027() {
        return a11027;
    }

    public void setA11027(String a11027) {
        this.a11027 = a11027;
    }

    @Basic
    @Column(name = "A11035", nullable = true, precision = 2)
    public Long getA11035() {
        return a11035;
    }

    public void setA11035(Long a11035) {
        this.a11035 = a11035;
    }

    @Basic
    @Column(name = "A11051", nullable = true, length = 100)
    public String getA11051() {
        return a11051;
    }

    public void setA11051(String a11051) {
        this.a11051 = a11051;
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
    @Column(name = "A11007", nullable = true)
    public Timestamp getA11007() {
        return a11007;
    }

    public void setA11007(Timestamp a11007) {
        this.a11007 = a11007;
    }

    @Basic
    @Column(name = "A11011", nullable = true)
    public Timestamp getA11011() {
        return a11011;
    }

    public void setA11011(Timestamp a11011) {
        this.a11011 = a11011;
    }

    @Basic
    @Column(name = "A11047", nullable = true, length = 4000)
    public String getA11047() {
        return a11047;
    }

    public void setA11047(String a11047) {
        this.a11047 = a11047;
    }

    @Basic
    @Column(name = "A11032", nullable = true, length = 4000)
    public String getA11032() {
        return a11032;
    }

    public void setA11032(String a11032) {
        this.a11032 = a11032;
    }

    @Basic
    @Column(name = "A11045", nullable = true, length = 4000)
    public String getA11045() {
        return a11045;
    }

    public void setA11045(String a11045) {
        this.a11045 = a11045;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpA11 empA11 = (EmpA11) o;

        if (a11001 != null ? !a11001.equals(empA11.a11001) : empA11.a11001 != null) return false;
        if (a11014A != null ? !a11014A.equals(empA11.a11014A) : empA11.a11014A != null) return false;
        if (a11048 != null ? !a11048.equals(empA11.a11048) : empA11.a11048 != null) return false;
        if (a11054 != null ? !a11054.equals(empA11.a11054) : empA11.a11054 != null) return false;
        if (a11017 != null ? !a11017.equals(empA11.a11017) : empA11.a11017 != null) return false;
        if (a11021A != null ? !a11021A.equals(empA11.a11021A) : empA11.a11021A != null) return false;
        if (a11037 != null ? !a11037.equals(empA11.a11037) : empA11.a11037 != null) return false;
        if (a11081 != null ? !a11081.equals(empA11.a11081) : empA11.a11081 != null) return false;
        if (a11018B != null ? !a11018B.equals(empA11.a11018B) : empA11.a11018B != null) return false;
        if (a11031 != null ? !a11031.equals(empA11.a11031) : empA11.a11031 != null) return false;
        if (a11066 != null ? !a11066.equals(empA11.a11066) : empA11.a11066 != null) return false;
        if (a11067 != null ? !a11067.equals(empA11.a11067) : empA11.a11067 != null) return false;
        if (a11004 != null ? !a11004.equals(empA11.a11004) : empA11.a11004 != null) return false;
        if (a11014B != null ? !a11014B.equals(empA11.a11014B) : empA11.a11014B != null) return false;
        if (a11024 != null ? !a11024.equals(empA11.a11024) : empA11.a11024 != null) return false;
        if (a11034 != null ? !a11034.equals(empA11.a11034) : empA11.a11034 != null) return false;
        if (a11046 != null ? !a11046.equals(empA11.a11046) : empA11.a11046 != null) return false;
        if (a11057 != null ? !a11057.equals(empA11.a11057) : empA11.a11057 != null) return false;
        if (a11041 != null ? !a11041.equals(empA11.a11041) : empA11.a11041 != null) return false;
        if (a11074 != null ? !a11074.equals(empA11.a11074) : empA11.a11074 != null) return false;
        if (a11077 != null ? !a11077.equals(empA11.a11077) : empA11.a11077 != null) return false;
        if (a11018A != null ? !a11018A.equals(empA11.a11018A) : empA11.a11018A != null) return false;
        if (a11019 != null ? !a11019.equals(empA11.a11019) : empA11.a11019 != null) return false;
        if (a11021B != null ? !a11021B.equals(empA11.a11021B) : empA11.a11021B != null) return false;
        if (a11044 != null ? !a11044.equals(empA11.a11044) : empA11.a11044 != null) return false;
        if (a11071 != null ? !a11071.equals(empA11.a11071) : empA11.a11071 != null) return false;
        if (a11027 != null ? !a11027.equals(empA11.a11027) : empA11.a11027 != null) return false;
        if (a11035 != null ? !a11035.equals(empA11.a11035) : empA11.a11035 != null) return false;
        if (a11051 != null ? !a11051.equals(empA11.a11051) : empA11.a11051 != null) return false;
        if (status != null ? !status.equals(empA11.status) : empA11.status != null) return false;
        if (status2 != null ? !status2.equals(empA11.status2) : empA11.status2 != null) return false;
        if (seqid != null ? !seqid.equals(empA11.seqid) : empA11.seqid != null) return false;
        if (empId != null ? !empId.equals(empA11.empId) : empA11.empId != null) return false;
        if (subId != null ? !subId.equals(empA11.subId) : empA11.subId != null) return false;
        if (lastUpdatedStamp != null ? !lastUpdatedStamp.equals(empA11.lastUpdatedStamp) : empA11.lastUpdatedStamp != null)
            return false;
        if (lastUpdatedTxStamp != null ? !lastUpdatedTxStamp.equals(empA11.lastUpdatedTxStamp) : empA11.lastUpdatedTxStamp != null)
            return false;
        if (createdStamp != null ? !createdStamp.equals(empA11.createdStamp) : empA11.createdStamp != null)
            return false;
        if (createdTxStamp != null ? !createdTxStamp.equals(empA11.createdTxStamp) : empA11.createdTxStamp != null)
            return false;
        if (a11007 != null ? !a11007.equals(empA11.a11007) : empA11.a11007 != null) return false;
        if (a11011 != null ? !a11011.equals(empA11.a11011) : empA11.a11011 != null) return false;
        if (a11047 != null ? !a11047.equals(empA11.a11047) : empA11.a11047 != null) return false;
        if (a11032 != null ? !a11032.equals(empA11.a11032) : empA11.a11032 != null) return false;
        if (a11045 != null ? !a11045.equals(empA11.a11045) : empA11.a11045 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = a11001 != null ? a11001.hashCode() : 0;
        result = 31 * result + (a11014A != null ? a11014A.hashCode() : 0);
        result = 31 * result + (a11048 != null ? a11048.hashCode() : 0);
        result = 31 * result + (a11054 != null ? a11054.hashCode() : 0);
        result = 31 * result + (a11017 != null ? a11017.hashCode() : 0);
        result = 31 * result + (a11021A != null ? a11021A.hashCode() : 0);
        result = 31 * result + (a11037 != null ? a11037.hashCode() : 0);
        result = 31 * result + (a11081 != null ? a11081.hashCode() : 0);
        result = 31 * result + (a11018B != null ? a11018B.hashCode() : 0);
        result = 31 * result + (a11031 != null ? a11031.hashCode() : 0);
        result = 31 * result + (a11066 != null ? a11066.hashCode() : 0);
        result = 31 * result + (a11067 != null ? a11067.hashCode() : 0);
        result = 31 * result + (a11004 != null ? a11004.hashCode() : 0);
        result = 31 * result + (a11014B != null ? a11014B.hashCode() : 0);
        result = 31 * result + (a11024 != null ? a11024.hashCode() : 0);
        result = 31 * result + (a11034 != null ? a11034.hashCode() : 0);
        result = 31 * result + (a11046 != null ? a11046.hashCode() : 0);
        result = 31 * result + (a11057 != null ? a11057.hashCode() : 0);
        result = 31 * result + (a11041 != null ? a11041.hashCode() : 0);
        result = 31 * result + (a11074 != null ? a11074.hashCode() : 0);
        result = 31 * result + (a11077 != null ? a11077.hashCode() : 0);
        result = 31 * result + (a11018A != null ? a11018A.hashCode() : 0);
        result = 31 * result + (a11019 != null ? a11019.hashCode() : 0);
        result = 31 * result + (a11021B != null ? a11021B.hashCode() : 0);
        result = 31 * result + (a11044 != null ? a11044.hashCode() : 0);
        result = 31 * result + (a11071 != null ? a11071.hashCode() : 0);
        result = 31 * result + (a11027 != null ? a11027.hashCode() : 0);
        result = 31 * result + (a11035 != null ? a11035.hashCode() : 0);
        result = 31 * result + (a11051 != null ? a11051.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (status2 != null ? status2.hashCode() : 0);
        result = 31 * result + (seqid != null ? seqid.hashCode() : 0);
        result = 31 * result + (empId != null ? empId.hashCode() : 0);
        result = 31 * result + (subId != null ? subId.hashCode() : 0);
        result = 31 * result + (lastUpdatedStamp != null ? lastUpdatedStamp.hashCode() : 0);
        result = 31 * result + (lastUpdatedTxStamp != null ? lastUpdatedTxStamp.hashCode() : 0);
        result = 31 * result + (createdStamp != null ? createdStamp.hashCode() : 0);
        result = 31 * result + (createdTxStamp != null ? createdTxStamp.hashCode() : 0);
        result = 31 * result + (a11007 != null ? a11007.hashCode() : 0);
        result = 31 * result + (a11011 != null ? a11011.hashCode() : 0);
        result = 31 * result + (a11047 != null ? a11047.hashCode() : 0);
        result = 31 * result + (a11032 != null ? a11032.hashCode() : 0);
        result = 31 * result + (a11045 != null ? a11045.hashCode() : 0);
        return result;
    }
}
