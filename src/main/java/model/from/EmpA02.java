package model.from;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Arrays;

/**
 * Created by Jay on 2018/1/16.
 *
 * @author Jay
 * @version 1.0
 * @since 1.0
 * Copyright (C) 2017. SinoSoft All Rights Received
 */
@Entity
@Table(name = "EMP_A02", catalog = "")
public class EmpA02 {
    private String a02041A;
    private String a02055;
    private String a02003;
    private String a02029;
    private String a02008;
    private Long a02014;
    private String a02016A;
    private String a02021;
    private String a02057B;
    private String a02069;
    private String a02073;
    private String a02045;
    private String a02049;
    private String a02071;
    private String a02074;
    private String a02001A;
    private String a02039;
    private String a02051;
    private String a02067;
    private String a02001B;
    private String a02004;
    private String a02016B;
    private String a02016C;
    private String a02033;
    private String a02192;
    private String a02151;
    private String a02063A;
    private String a02061;
    private String a02076;
    private String a02057A;
    private String a02075;
    private Long a02025;
    private String a02191;
    private String a02041B;
    private String a02047;
    private String a02084;
    private String a02009;
    private String a02011;
    private String a02020;
    private String a02035A;
    private String a02019;
    private Long a02023;
    private String a02063B;
    private String a02007;
    private Long a02097;
    private String status2;
    private Long seqid;
    private String empId;
    private String subId;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private Timestamp a02059;
    private Timestamp a02065;
    private Timestamp a02053;
    private Timestamp a02006;
    private Timestamp a02043;
    private Timestamp a02037;
    private String a02095;
    private String a02017;
    private String a02028;
    private String a02089;
    private Long ordinal;
    private long status;
    private Timestamp createdTime;
    private byte[] createdBy;
    private Timestamp lastModifiedTime;
    private byte[] lastModifiedBy;
    private String a02085A;

    @Basic
    @Column(name = "A02041_A", nullable = true, length = 120)
    public String getA02041A() {
        return a02041A;
    }

    public void setA02041A(String a02041A) {
        this.a02041A = a02041A;
    }

    @Basic
    @Column(name = "A02055", nullable = true, length = 100)
    public String getA02055() {
        return a02055;
    }

    public void setA02055(String a02055) {
        this.a02055 = a02055;
    }

    @Basic
    @Column(name = "A02003", nullable = true, length = 100)
    public String getA02003() {
        return a02003;
    }

    public void setA02003(String a02003) {
        this.a02003 = a02003;
    }

    @Basic
    @Column(name = "A02029", nullable = true, length = 500)
    public String getA02029() {
        return a02029;
    }

    public void setA02029(String a02029) {
        this.a02029 = a02029;
    }

    @Basic
    @Column(name = "A02008", nullable = true, length = 100)
    public String getA02008() {
        return a02008;
    }

    public void setA02008(String a02008) {
        this.a02008 = a02008;
    }

    @Basic
    @Column(name = "A02014", nullable = true, precision = 2)
    public Long getA02014() {
        return a02014;
    }

    public void setA02014(Long a02014) {
        this.a02014 = a02014;
    }

    @Basic
    @Column(name = "A02016_A", nullable = true, length = 500)
    public String getA02016A() {
        return a02016A;
    }

    public void setA02016A(String a02016A) {
        this.a02016A = a02016A;
    }

    @Basic
    @Column(name = "A02021", nullable = true, length = 100)
    public String getA02021() {
        return a02021;
    }

    public void setA02021(String a02021) {
        this.a02021 = a02021;
    }

    @Basic
    @Column(name = "A02057_B", nullable = true, length = 50)
    public String getA02057B() {
        return a02057B;
    }

    public void setA02057B(String a02057B) {
        this.a02057B = a02057B;
    }

    @Basic
    @Column(name = "A02069", nullable = true, length = 100)
    public String getA02069() {
        return a02069;
    }

    public void setA02069(String a02069) {
        this.a02069 = a02069;
    }

    @Basic
    @Column(name = "A02073", nullable = true, length = 100)
    public String getA02073() {
        return a02073;
    }

    public void setA02073(String a02073) {
        this.a02073 = a02073;
    }

    @Basic
    @Column(name = "A02045", nullable = true, length = 48)
    public String getA02045() {
        return a02045;
    }

    public void setA02045(String a02045) {
        this.a02045 = a02045;
    }

    @Basic
    @Column(name = "A02049", nullable = true, length = 100)
    public String getA02049() {
        return a02049;
    }

    public void setA02049(String a02049) {
        this.a02049 = a02049;
    }

    @Basic
    @Column(name = "A02071", nullable = true, length = 100)
    public String getA02071() {
        return a02071;
    }

    public void setA02071(String a02071) {
        this.a02071 = a02071;
    }

    @Basic
    @Column(name = "A02074", nullable = true, length = 100)
    public String getA02074() {
        return a02074;
    }

    public void setA02074(String a02074) {
        this.a02074 = a02074;
    }

    @Basic
    @Column(name = "A02001_A", nullable = true, length = 500)
    public String getA02001A() {
        return a02001A;
    }

    public void setA02001A(String a02001A) {
        this.a02001A = a02001A;
    }

    @Basic
    @Column(name = "A02039", nullable = true, length = 48)
    public String getA02039() {
        return a02039;
    }

    public void setA02039(String a02039) {
        this.a02039 = a02039;
    }

    @Basic
    @Column(name = "A02051", nullable = true, length = 100)
    public String getA02051() {
        return a02051;
    }

    public void setA02051(String a02051) {
        this.a02051 = a02051;
    }

    @Basic
    @Column(name = "A02067", nullable = true, length = 48)
    public String getA02067() {
        return a02067;
    }

    public void setA02067(String a02067) {
        this.a02067 = a02067;
    }

    @Basic
    @Column(name = "A02001_B", nullable = true, length = 500)
    public String getA02001B() {
        return a02001B;
    }

    public void setA02001B(String a02001B) {
        this.a02001B = a02001B;
    }

    @Basic
    @Column(name = "A02004", nullable = true, length = 100)
    public String getA02004() {
        return a02004;
    }

    public void setA02004(String a02004) {
        this.a02004 = a02004;
    }

    @Basic
    @Column(name = "A02016_B", nullable = true, length = 100)
    public String getA02016B() {
        return a02016B;
    }

    public void setA02016B(String a02016B) {
        this.a02016B = a02016B;
    }

    @Basic
    @Column(name = "A02016_C", nullable = true, length = 10)
    public String getA02016C() {
        return a02016C;
    }

    public void setA02016C(String a02016C) {
        this.a02016C = a02016C;
    }

    @Basic
    @Column(name = "A02033", nullable = true, length = 100)
    public String getA02033() {
        return a02033;
    }

    public void setA02033(String a02033) {
        this.a02033 = a02033;
    }

    @Basic
    @Column(name = "A02192", nullable = true, length = 100)
    public String getA02192() {
        return a02192;
    }

    public void setA02192(String a02192) {
        this.a02192 = a02192;
    }

    @Basic
    @Column(name = "A02151", nullable = true, length = 100)
    public String getA02151() {
        return a02151;
    }

    public void setA02151(String a02151) {
        this.a02151 = a02151;
    }

    @Basic
    @Column(name = "A02063_A", nullable = true, length = 120)
    public String getA02063A() {
        return a02063A;
    }

    public void setA02063A(String a02063A) {
        this.a02063A = a02063A;
    }

    @Basic
    @Column(name = "A02061", nullable = true, length = 48)
    public String getA02061() {
        return a02061;
    }

    public void setA02061(String a02061) {
        this.a02061 = a02061;
    }

    @Basic
    @Column(name = "A02076", nullable = true, length = 100)
    public String getA02076() {
        return a02076;
    }

    public void setA02076(String a02076) {
        this.a02076 = a02076;
    }

    @Basic
    @Column(name = "A02057_A", nullable = true, length = 120)
    public String getA02057A() {
        return a02057A;
    }

    public void setA02057A(String a02057A) {
        this.a02057A = a02057A;
    }

    @Basic
    @Column(name = "A02075", nullable = true, length = 100)
    public String getA02075() {
        return a02075;
    }

    public void setA02075(String a02075) {
        this.a02075 = a02075;
    }

    @Basic
    @Column(name = "A02025", nullable = true, precision = 2)
    public Long getA02025() {
        return a02025;
    }

    public void setA02025(Long a02025) {
        this.a02025 = a02025;
    }

    @Basic
    @Column(name = "A02191", nullable = true, length = 100)
    public String getA02191() {
        return a02191;
    }

    public void setA02191(String a02191) {
        this.a02191 = a02191;
    }

    @Basic
    @Column(name = "A02041_B", nullable = true, length = 50)
    public String getA02041B() {
        return a02041B;
    }

    public void setA02041B(String a02041B) {
        this.a02041B = a02041B;
    }

    @Basic
    @Column(name = "A02047", nullable = true, length = 100)
    public String getA02047() {
        return a02047;
    }

    public void setA02047(String a02047) {
        this.a02047 = a02047;
    }

    @Basic
    @Column(name = "A02084", nullable = true, length = 100)
    public String getA02084() {
        return a02084;
    }

    public void setA02084(String a02084) {
        this.a02084 = a02084;
    }

    @Basic
    @Column(name = "A02009", nullable = true, length = 100)
    public String getA02009() {
        return a02009;
    }

    public void setA02009(String a02009) {
        this.a02009 = a02009;
    }

    @Basic
    @Column(name = "A02011", nullable = true, length = 100)
    public String getA02011() {
        return a02011;
    }

    public void setA02011(String a02011) {
        this.a02011 = a02011;
    }

    @Basic
    @Column(name = "A02020", nullable = true, length = 100)
    public String getA02020() {
        return a02020;
    }

    public void setA02020(String a02020) {
        this.a02020 = a02020;
    }

    @Basic
    @Column(name = "A02035_A", nullable = true, length = 120)
    public String getA02035A() {
        return a02035A;
    }

    public void setA02035A(String a02035A) {
        this.a02035A = a02035A;
    }

    @Basic
    @Column(name = "A02019", nullable = true, length = 100)
    public String getA02019() {
        return a02019;
    }

    public void setA02019(String a02019) {
        this.a02019 = a02019;
    }

    @Basic
    @Column(name = "A02023", nullable = true, precision = 2)
    public Long getA02023() {
        return a02023;
    }

    public void setA02023(Long a02023) {
        this.a02023 = a02023;
    }

    @Basic
    @Column(name = "A02063_B", nullable = true, length = 50)
    public String getA02063B() {
        return a02063B;
    }

    public void setA02063B(String a02063B) {
        this.a02063B = a02063B;
    }

    @Basic
    @Column(name = "A02007", nullable = true, length = 100)
    public String getA02007() {
        return a02007;
    }

    public void setA02007(String a02007) {
        this.a02007 = a02007;
    }

    @Basic
    @Column(name = "A02097", nullable = true, precision = 2)
    public Long getA02097() {
        return a02097;
    }

    public void setA02097(Long a02097) {
        this.a02097 = a02097;
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

    @Id
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
    @Column(name = "A02059", nullable = true)
    public Timestamp getA02059() {
        return a02059;
    }

    public void setA02059(Timestamp a02059) {
        this.a02059 = a02059;
    }

    @Basic
    @Column(name = "A02065", nullable = true)
    public Timestamp getA02065() {
        return a02065;
    }

    public void setA02065(Timestamp a02065) {
        this.a02065 = a02065;
    }

    @Basic
    @Column(name = "A02053", nullable = true)
    public Timestamp getA02053() {
        return a02053;
    }

    public void setA02053(Timestamp a02053) {
        this.a02053 = a02053;
    }

    @Basic
    @Column(name = "A02006", nullable = true)
    public Timestamp getA02006() {
        return a02006;
    }

    public void setA02006(Timestamp a02006) {
        this.a02006 = a02006;
    }

    @Basic
    @Column(name = "A02043", nullable = true)
    public Timestamp getA02043() {
        return a02043;
    }

    public void setA02043(Timestamp a02043) {
        this.a02043 = a02043;
    }

    @Basic
    @Column(name = "A02037", nullable = true)
    public Timestamp getA02037() {
        return a02037;
    }

    public void setA02037(Timestamp a02037) {
        this.a02037 = a02037;
    }

    @Basic
    @Column(name = "A02095", nullable = true, length = 4000)
    public String getA02095() {
        return a02095;
    }

    public void setA02095(String a02095) {
        this.a02095 = a02095;
    }

    @Basic
    @Column(name = "A02017", nullable = true, length = 4000)
    public String getA02017() {
        return a02017;
    }

    public void setA02017(String a02017) {
        this.a02017 = a02017;
    }

    @Basic
    @Column(name = "A02028", nullable = true, length = 2)
    public String getA02028() {
        return a02028;
    }

    public void setA02028(String a02028) {
        this.a02028 = a02028;
    }

    @Basic
    @Column(name = "A02089", nullable = true, length = 100)
    public String getA02089() {
        return a02089;
    }

    public void setA02089(String a02089) {
        this.a02089 = a02089;
    }

    @Basic
    @Column(name = "ORDINAL", nullable = true, precision = 0)
    public Long getOrdinal() {
        return ordinal;
    }

    public void setOrdinal(Long ordinal) {
        this.ordinal = ordinal;
    }

    @Basic
    @Column(name = "STATUS", nullable = false, precision = 0)
    public long getStatus() {
        return status;
    }

    public void setStatus(long status) {
        this.status = status;
    }

    @Basic
    @Column(name = "CREATED_TIME", nullable = false)
    public Timestamp getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Timestamp createdTime) {
        this.createdTime = createdTime;
    }

    @Basic
    @Column(name = "CREATED_BY", nullable = true)
    public byte[] getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(byte[] createdBy) {
        this.createdBy = createdBy;
    }

    @Basic
    @Column(name = "LAST_MODIFIED_TIME", nullable = false)
    public Timestamp getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(Timestamp lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    @Basic
    @Column(name = "LAST_MODIFIED_BY", nullable = true)
    public byte[] getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(byte[] lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    @Basic
    @Column(name = "A02085_A", nullable = true, length = 100)
    public String getA02085A() {
        return a02085A;
    }

    public void setA02085A(String a02085A) {
        this.a02085A = a02085A;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpA02 empA02 = (EmpA02) o;

        if (status != empA02.status) return false;
        if (a02041A != null ? !a02041A.equals(empA02.a02041A) : empA02.a02041A != null) return false;
        if (a02055 != null ? !a02055.equals(empA02.a02055) : empA02.a02055 != null) return false;
        if (a02003 != null ? !a02003.equals(empA02.a02003) : empA02.a02003 != null) return false;
        if (a02029 != null ? !a02029.equals(empA02.a02029) : empA02.a02029 != null) return false;
        if (a02008 != null ? !a02008.equals(empA02.a02008) : empA02.a02008 != null) return false;
        if (a02014 != null ? !a02014.equals(empA02.a02014) : empA02.a02014 != null) return false;
        if (a02016A != null ? !a02016A.equals(empA02.a02016A) : empA02.a02016A != null) return false;
        if (a02021 != null ? !a02021.equals(empA02.a02021) : empA02.a02021 != null) return false;
        if (a02057B != null ? !a02057B.equals(empA02.a02057B) : empA02.a02057B != null) return false;
        if (a02069 != null ? !a02069.equals(empA02.a02069) : empA02.a02069 != null) return false;
        if (a02073 != null ? !a02073.equals(empA02.a02073) : empA02.a02073 != null) return false;
        if (a02045 != null ? !a02045.equals(empA02.a02045) : empA02.a02045 != null) return false;
        if (a02049 != null ? !a02049.equals(empA02.a02049) : empA02.a02049 != null) return false;
        if (a02071 != null ? !a02071.equals(empA02.a02071) : empA02.a02071 != null) return false;
        if (a02074 != null ? !a02074.equals(empA02.a02074) : empA02.a02074 != null) return false;
        if (a02001A != null ? !a02001A.equals(empA02.a02001A) : empA02.a02001A != null) return false;
        if (a02039 != null ? !a02039.equals(empA02.a02039) : empA02.a02039 != null) return false;
        if (a02051 != null ? !a02051.equals(empA02.a02051) : empA02.a02051 != null) return false;
        if (a02067 != null ? !a02067.equals(empA02.a02067) : empA02.a02067 != null) return false;
        if (a02001B != null ? !a02001B.equals(empA02.a02001B) : empA02.a02001B != null) return false;
        if (a02004 != null ? !a02004.equals(empA02.a02004) : empA02.a02004 != null) return false;
        if (a02016B != null ? !a02016B.equals(empA02.a02016B) : empA02.a02016B != null) return false;
        if (a02016C != null ? !a02016C.equals(empA02.a02016C) : empA02.a02016C != null) return false;
        if (a02033 != null ? !a02033.equals(empA02.a02033) : empA02.a02033 != null) return false;
        if (a02192 != null ? !a02192.equals(empA02.a02192) : empA02.a02192 != null) return false;
        if (a02151 != null ? !a02151.equals(empA02.a02151) : empA02.a02151 != null) return false;
        if (a02063A != null ? !a02063A.equals(empA02.a02063A) : empA02.a02063A != null) return false;
        if (a02061 != null ? !a02061.equals(empA02.a02061) : empA02.a02061 != null) return false;
        if (a02076 != null ? !a02076.equals(empA02.a02076) : empA02.a02076 != null) return false;
        if (a02057A != null ? !a02057A.equals(empA02.a02057A) : empA02.a02057A != null) return false;
        if (a02075 != null ? !a02075.equals(empA02.a02075) : empA02.a02075 != null) return false;
        if (a02025 != null ? !a02025.equals(empA02.a02025) : empA02.a02025 != null) return false;
        if (a02191 != null ? !a02191.equals(empA02.a02191) : empA02.a02191 != null) return false;
        if (a02041B != null ? !a02041B.equals(empA02.a02041B) : empA02.a02041B != null) return false;
        if (a02047 != null ? !a02047.equals(empA02.a02047) : empA02.a02047 != null) return false;
        if (a02084 != null ? !a02084.equals(empA02.a02084) : empA02.a02084 != null) return false;
        if (a02009 != null ? !a02009.equals(empA02.a02009) : empA02.a02009 != null) return false;
        if (a02011 != null ? !a02011.equals(empA02.a02011) : empA02.a02011 != null) return false;
        if (a02020 != null ? !a02020.equals(empA02.a02020) : empA02.a02020 != null) return false;
        if (a02035A != null ? !a02035A.equals(empA02.a02035A) : empA02.a02035A != null) return false;
        if (a02019 != null ? !a02019.equals(empA02.a02019) : empA02.a02019 != null) return false;
        if (a02023 != null ? !a02023.equals(empA02.a02023) : empA02.a02023 != null) return false;
        if (a02063B != null ? !a02063B.equals(empA02.a02063B) : empA02.a02063B != null) return false;
        if (a02007 != null ? !a02007.equals(empA02.a02007) : empA02.a02007 != null) return false;
        if (a02097 != null ? !a02097.equals(empA02.a02097) : empA02.a02097 != null) return false;
        if (status2 != null ? !status2.equals(empA02.status2) : empA02.status2 != null) return false;
        if (seqid != null ? !seqid.equals(empA02.seqid) : empA02.seqid != null) return false;
        if (empId != null ? !empId.equals(empA02.empId) : empA02.empId != null) return false;
        if (subId != null ? !subId.equals(empA02.subId) : empA02.subId != null) return false;
        if (lastUpdatedStamp != null ? !lastUpdatedStamp.equals(empA02.lastUpdatedStamp) : empA02.lastUpdatedStamp != null)
            return false;
        if (lastUpdatedTxStamp != null ? !lastUpdatedTxStamp.equals(empA02.lastUpdatedTxStamp) : empA02.lastUpdatedTxStamp != null)
            return false;
        if (createdStamp != null ? !createdStamp.equals(empA02.createdStamp) : empA02.createdStamp != null)
            return false;
        if (createdTxStamp != null ? !createdTxStamp.equals(empA02.createdTxStamp) : empA02.createdTxStamp != null)
            return false;
        if (a02059 != null ? !a02059.equals(empA02.a02059) : empA02.a02059 != null) return false;
        if (a02065 != null ? !a02065.equals(empA02.a02065) : empA02.a02065 != null) return false;
        if (a02053 != null ? !a02053.equals(empA02.a02053) : empA02.a02053 != null) return false;
        if (a02006 != null ? !a02006.equals(empA02.a02006) : empA02.a02006 != null) return false;
        if (a02043 != null ? !a02043.equals(empA02.a02043) : empA02.a02043 != null) return false;
        if (a02037 != null ? !a02037.equals(empA02.a02037) : empA02.a02037 != null) return false;
        if (a02095 != null ? !a02095.equals(empA02.a02095) : empA02.a02095 != null) return false;
        if (a02017 != null ? !a02017.equals(empA02.a02017) : empA02.a02017 != null) return false;
        if (a02028 != null ? !a02028.equals(empA02.a02028) : empA02.a02028 != null) return false;
        if (a02089 != null ? !a02089.equals(empA02.a02089) : empA02.a02089 != null) return false;
        if (ordinal != null ? !ordinal.equals(empA02.ordinal) : empA02.ordinal != null) return false;
        if (createdTime != null ? !createdTime.equals(empA02.createdTime) : empA02.createdTime != null) return false;
        if (!Arrays.equals(createdBy, empA02.createdBy)) return false;
        if (lastModifiedTime != null ? !lastModifiedTime.equals(empA02.lastModifiedTime) : empA02.lastModifiedTime != null)
            return false;
        if (!Arrays.equals(lastModifiedBy, empA02.lastModifiedBy)) return false;
        if (a02085A != null ? !a02085A.equals(empA02.a02085A) : empA02.a02085A != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = a02041A != null ? a02041A.hashCode() : 0;
        result = 31 * result + (a02055 != null ? a02055.hashCode() : 0);
        result = 31 * result + (a02003 != null ? a02003.hashCode() : 0);
        result = 31 * result + (a02029 != null ? a02029.hashCode() : 0);
        result = 31 * result + (a02008 != null ? a02008.hashCode() : 0);
        result = 31 * result + (a02014 != null ? a02014.hashCode() : 0);
        result = 31 * result + (a02016A != null ? a02016A.hashCode() : 0);
        result = 31 * result + (a02021 != null ? a02021.hashCode() : 0);
        result = 31 * result + (a02057B != null ? a02057B.hashCode() : 0);
        result = 31 * result + (a02069 != null ? a02069.hashCode() : 0);
        result = 31 * result + (a02073 != null ? a02073.hashCode() : 0);
        result = 31 * result + (a02045 != null ? a02045.hashCode() : 0);
        result = 31 * result + (a02049 != null ? a02049.hashCode() : 0);
        result = 31 * result + (a02071 != null ? a02071.hashCode() : 0);
        result = 31 * result + (a02074 != null ? a02074.hashCode() : 0);
        result = 31 * result + (a02001A != null ? a02001A.hashCode() : 0);
        result = 31 * result + (a02039 != null ? a02039.hashCode() : 0);
        result = 31 * result + (a02051 != null ? a02051.hashCode() : 0);
        result = 31 * result + (a02067 != null ? a02067.hashCode() : 0);
        result = 31 * result + (a02001B != null ? a02001B.hashCode() : 0);
        result = 31 * result + (a02004 != null ? a02004.hashCode() : 0);
        result = 31 * result + (a02016B != null ? a02016B.hashCode() : 0);
        result = 31 * result + (a02016C != null ? a02016C.hashCode() : 0);
        result = 31 * result + (a02033 != null ? a02033.hashCode() : 0);
        result = 31 * result + (a02192 != null ? a02192.hashCode() : 0);
        result = 31 * result + (a02151 != null ? a02151.hashCode() : 0);
        result = 31 * result + (a02063A != null ? a02063A.hashCode() : 0);
        result = 31 * result + (a02061 != null ? a02061.hashCode() : 0);
        result = 31 * result + (a02076 != null ? a02076.hashCode() : 0);
        result = 31 * result + (a02057A != null ? a02057A.hashCode() : 0);
        result = 31 * result + (a02075 != null ? a02075.hashCode() : 0);
        result = 31 * result + (a02025 != null ? a02025.hashCode() : 0);
        result = 31 * result + (a02191 != null ? a02191.hashCode() : 0);
        result = 31 * result + (a02041B != null ? a02041B.hashCode() : 0);
        result = 31 * result + (a02047 != null ? a02047.hashCode() : 0);
        result = 31 * result + (a02084 != null ? a02084.hashCode() : 0);
        result = 31 * result + (a02009 != null ? a02009.hashCode() : 0);
        result = 31 * result + (a02011 != null ? a02011.hashCode() : 0);
        result = 31 * result + (a02020 != null ? a02020.hashCode() : 0);
        result = 31 * result + (a02035A != null ? a02035A.hashCode() : 0);
        result = 31 * result + (a02019 != null ? a02019.hashCode() : 0);
        result = 31 * result + (a02023 != null ? a02023.hashCode() : 0);
        result = 31 * result + (a02063B != null ? a02063B.hashCode() : 0);
        result = 31 * result + (a02007 != null ? a02007.hashCode() : 0);
        result = 31 * result + (a02097 != null ? a02097.hashCode() : 0);
        result = 31 * result + (status2 != null ? status2.hashCode() : 0);
        result = 31 * result + (seqid != null ? seqid.hashCode() : 0);
        result = 31 * result + (empId != null ? empId.hashCode() : 0);
        result = 31 * result + (subId != null ? subId.hashCode() : 0);
        result = 31 * result + (lastUpdatedStamp != null ? lastUpdatedStamp.hashCode() : 0);
        result = 31 * result + (lastUpdatedTxStamp != null ? lastUpdatedTxStamp.hashCode() : 0);
        result = 31 * result + (createdStamp != null ? createdStamp.hashCode() : 0);
        result = 31 * result + (createdTxStamp != null ? createdTxStamp.hashCode() : 0);
        result = 31 * result + (a02059 != null ? a02059.hashCode() : 0);
        result = 31 * result + (a02065 != null ? a02065.hashCode() : 0);
        result = 31 * result + (a02053 != null ? a02053.hashCode() : 0);
        result = 31 * result + (a02006 != null ? a02006.hashCode() : 0);
        result = 31 * result + (a02043 != null ? a02043.hashCode() : 0);
        result = 31 * result + (a02037 != null ? a02037.hashCode() : 0);
        result = 31 * result + (a02095 != null ? a02095.hashCode() : 0);
        result = 31 * result + (a02017 != null ? a02017.hashCode() : 0);
        result = 31 * result + (a02028 != null ? a02028.hashCode() : 0);
        result = 31 * result + (a02089 != null ? a02089.hashCode() : 0);
        result = 31 * result + (ordinal != null ? ordinal.hashCode() : 0);
        result = 31 * result + (int) (status ^ (status >>> 32));
        result = 31 * result + (createdTime != null ? createdTime.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(createdBy);
        result = 31 * result + (lastModifiedTime != null ? lastModifiedTime.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(lastModifiedBy);
        result = 31 * result + (a02085A != null ? a02085A.hashCode() : 0);
        return result;
    }
}
