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
@Table(name = "EMP_A001", catalog = "")
public class EmpA001 {
    private String a01002B;
    private String a01057;
    private String a01065;
    private String a01071;
    private String a01077;
    private String a01087;
    private String a01088;
    private String a01002A;
    private String a01027;
    private String a01052;
    private String a01062;
    private String a01108;
    private String a01031;
    private String a01061;
    private String a01067;
    private String a01073;
    private String a01090;
    private String a01004;
    private String a01011A;
    private String a01017;
    private String a01051;
    private String a01074;
    private String a01083;
    private String a01084;
    private String a01014A;
    private String a01057A;
    private String a01060;
    private String a01048;
    private String a01063;
    private String a01081;
    private String a01099;
    private Long a01103;
    private String a01014B;
    private Long a01044;
    private String a01057B;
    private String a001003;
    private String a01001;
    private String a01011B;
    private Long a01037;
    private String a01058;
    private String a01097;
    private String a01107;
    private String status2;
    private Long seqid;
    private String empId;
    private String categoryId;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private Timestamp a01007;
    private Timestamp a01034;
    private Timestamp a01040;
    private Timestamp a01054;
    private Timestamp a01094;
    private Timestamp a01095;
    private String a01086;
    private String a01028;
    private String a01014Z;
    private String a01110;
    private String a01111;
    private String a01015;
    private String depId;
    private String a001004A;
    private Long ordinal;
    private long status;
    private Timestamp createdTime;
    private byte[] createdBy;
    private Timestamp lastModifiedTime;
    private byte[] lastModifiedBy;

    @Basic
    @Column(name = "A01002_B", nullable = true, length = 6)
    public String getA01002B() {
        return a01002B;
    }

    public void setA01002B(String a01002B) {
        this.a01002B = a01002B;
    }

    @Basic
    @Column(name = "A01057", nullable = true, length = 100)
    public String getA01057() {
        return a01057;
    }

    public void setA01057(String a01057) {
        this.a01057 = a01057;
    }

    @Basic
    @Column(name = "A01065", nullable = true, length = 100)
    public String getA01065() {
        return a01065;
    }

    public void setA01065(String a01065) {
        this.a01065 = a01065;
    }

    @Basic
    @Column(name = "A01071", nullable = true, length = 100)
    public String getA01071() {
        return a01071;
    }

    public void setA01071(String a01071) {
        this.a01071 = a01071;
    }

    @Basic
    @Column(name = "A01077", nullable = true, length = 100)
    public String getA01077() {
        return a01077;
    }

    public void setA01077(String a01077) {
        this.a01077 = a01077;
    }

    @Basic
    @Column(name = "A01087", nullable = true, length = 100)
    public String getA01087() {
        return a01087;
    }

    public void setA01087(String a01087) {
        this.a01087 = a01087;
    }

    @Basic
    @Column(name = "A01088", nullable = true, length = 100)
    public String getA01088() {
        return a01088;
    }

    public void setA01088(String a01088) {
        this.a01088 = a01088;
    }

    @Basic
    @Column(name = "A01002_A", nullable = true, length = 60)
    public String getA01002A() {
        return a01002A;
    }

    public void setA01002A(String a01002A) {
        this.a01002A = a01002A;
    }

    @Basic
    @Column(name = "A01027", nullable = true, length = 100)
    public String getA01027() {
        return a01027;
    }

    public void setA01027(String a01027) {
        this.a01027 = a01027;
    }

    @Basic
    @Column(name = "A01052", nullable = true, length = 100)
    public String getA01052() {
        return a01052;
    }

    public void setA01052(String a01052) {
        this.a01052 = a01052;
    }

    @Basic
    @Column(name = "A01062", nullable = true, length = 100)
    public String getA01062() {
        return a01062;
    }

    public void setA01062(String a01062) {
        this.a01062 = a01062;
    }

    @Basic
    @Column(name = "A01108", nullable = true, length = 120)
    public String getA01108() {
        return a01108;
    }

    public void setA01108(String a01108) {
        this.a01108 = a01108;
    }

    @Basic
    @Column(name = "A01031", nullable = true, length = 100)
    public String getA01031() {
        return a01031;
    }

    public void setA01031(String a01031) {
        this.a01031 = a01031;
    }

    @Basic
    @Column(name = "A01061", nullable = true, length = 80)
    public String getA01061() {
        return a01061;
    }

    public void setA01061(String a01061) {
        this.a01061 = a01061;
    }

    @Basic
    @Column(name = "A01067", nullable = true, length = 100)
    public String getA01067() {
        return a01067;
    }

    public void setA01067(String a01067) {
        this.a01067 = a01067;
    }

    @Basic
    @Column(name = "A01073", nullable = true, length = 18)
    public String getA01073() {
        return a01073;
    }

    public void setA01073(String a01073) {
        this.a01073 = a01073;
    }

    @Basic
    @Column(name = "A01090", nullable = true, length = 80)
    public String getA01090() {
        return a01090;
    }

    public void setA01090(String a01090) {
        this.a01090 = a01090;
    }

    @Basic
    @Column(name = "A01004", nullable = true, length = 100)
    public String getA01004() {
        return a01004;
    }

    public void setA01004(String a01004) {
        this.a01004 = a01004;
    }

    @Basic
    @Column(name = "A01011_A", nullable = true, length = 80)
    public String getA01011A() {
        return a01011A;
    }

    public void setA01011A(String a01011A) {
        this.a01011A = a01011A;
    }

    @Basic
    @Column(name = "A01017", nullable = true, length = 100)
    public String getA01017() {
        return a01017;
    }

    public void setA01017(String a01017) {
        this.a01017 = a01017;
    }

    @Basic
    @Column(name = "A01051", nullable = true, length = 100)
    public String getA01051() {
        return a01051;
    }

    public void setA01051(String a01051) {
        this.a01051 = a01051;
    }

    @Basic
    @Column(name = "A01074", nullable = true, length = 100)
    public String getA01074() {
        return a01074;
    }

    public void setA01074(String a01074) {
        this.a01074 = a01074;
    }

    @Basic
    @Column(name = "A01083", nullable = true, length = 100)
    public String getA01083() {
        return a01083;
    }

    public void setA01083(String a01083) {
        this.a01083 = a01083;
    }

    @Basic
    @Column(name = "A01084", nullable = true, length = 18)
    public String getA01084() {
        return a01084;
    }

    public void setA01084(String a01084) {
        this.a01084 = a01084;
    }

    @Basic
    @Column(name = "A01014_A", nullable = true, length = 80)
    public String getA01014A() {
        return a01014A;
    }

    public void setA01014A(String a01014A) {
        this.a01014A = a01014A;
    }

    @Basic
    @Column(name = "A01057_A", nullable = true, length = 120)
    public String getA01057A() {
        return a01057A;
    }

    public void setA01057A(String a01057A) {
        this.a01057A = a01057A;
    }

    @Basic
    @Column(name = "A01060", nullable = true, length = 100)
    public String getA01060() {
        return a01060;
    }

    public void setA01060(String a01060) {
        this.a01060 = a01060;
    }

    @Basic
    @Column(name = "A01048", nullable = true, length = 100)
    public String getA01048() {
        return a01048;
    }

    public void setA01048(String a01048) {
        this.a01048 = a01048;
    }

    @Basic
    @Column(name = "A01063", nullable = true, length = 100)
    public String getA01063() {
        return a01063;
    }

    public void setA01063(String a01063) {
        this.a01063 = a01063;
    }

    @Basic
    @Column(name = "A01081", nullable = true, length = 80)
    public String getA01081() {
        return a01081;
    }

    public void setA01081(String a01081) {
        this.a01081 = a01081;
    }

    @Basic
    @Column(name = "A01099", nullable = true, length = 100)
    public String getA01099() {
        return a01099;
    }

    public void setA01099(String a01099) {
        this.a01099 = a01099;
    }

    @Basic
    @Column(name = "A01103", nullable = true, precision = 2)
    public Long getA01103() {
        return a01103;
    }

    public void setA01103(Long a01103) {
        this.a01103 = a01103;
    }

    @Basic
    @Column(name = "A01014_B", nullable = true, length = 100)
    public String getA01014B() {
        return a01014B;
    }

    public void setA01014B(String a01014B) {
        this.a01014B = a01014B;
    }

    @Basic
    @Column(name = "A01044", nullable = true, precision = 2)
    public Long getA01044() {
        return a01044;
    }

    public void setA01044(Long a01044) {
        this.a01044 = a01044;
    }

    @Basic
    @Column(name = "A01057_B", nullable = true, length = 32)
    public String getA01057B() {
        return a01057B;
    }

    public void setA01057B(String a01057B) {
        this.a01057B = a01057B;
    }

    @Basic
    @Column(name = "A001003", nullable = true, length = 18)
    public String getA001003() {
        return a001003;
    }

    public void setA001003(String a001003) {
        this.a001003 = a001003;
    }

    @Basic
    @Column(name = "A01001", nullable = true, length = 50)
    public String getA01001() {
        return a01001;
    }

    public void setA01001(String a01001) {
        this.a01001 = a01001;
    }

    @Basic
    @Column(name = "A01011_B", nullable = true, length = 100)
    public String getA01011B() {
        return a01011B;
    }

    public void setA01011B(String a01011B) {
        this.a01011B = a01011B;
    }

    @Basic
    @Column(name = "A01037", nullable = true, precision = 2)
    public Long getA01037() {
        return a01037;
    }

    public void setA01037(Long a01037) {
        this.a01037 = a01037;
    }

    @Basic
    @Column(name = "A01058", nullable = true, length = 100)
    public String getA01058() {
        return a01058;
    }

    public void setA01058(String a01058) {
        this.a01058 = a01058;
    }

    @Basic
    @Column(name = "A01097", nullable = true, length = 80)
    public String getA01097() {
        return a01097;
    }

    public void setA01097(String a01097) {
        this.a01097 = a01097;
    }

    @Basic
    @Column(name = "A01107", nullable = true, length = 100)
    public String getA01107() {
        return a01107;
    }

    public void setA01107(String a01107) {
        this.a01107 = a01107;
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

    @Id
    @Column(name = "EMP_ID", nullable = true, length = 50)
    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    @Basic
    @Column(name = "CATEGORY_ID", nullable = true, length = 50)
    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
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
    @Column(name = "A01007", nullable = true)
    public Timestamp getA01007() {
        return a01007;
    }

    public void setA01007(Timestamp a01007) {
        this.a01007 = a01007;
    }

    @Basic
    @Column(name = "A01034", nullable = true)
    public Timestamp getA01034() {
        return a01034;
    }

    public void setA01034(Timestamp a01034) {
        this.a01034 = a01034;
    }

    @Basic
    @Column(name = "A01040", nullable = true)
    public Timestamp getA01040() {
        return a01040;
    }

    public void setA01040(Timestamp a01040) {
        this.a01040 = a01040;
    }

    @Basic
    @Column(name = "A01054", nullable = true)
    public Timestamp getA01054() {
        return a01054;
    }

    public void setA01054(Timestamp a01054) {
        this.a01054 = a01054;
    }

    @Basic
    @Column(name = "A01094", nullable = true)
    public Timestamp getA01094() {
        return a01094;
    }

    public void setA01094(Timestamp a01094) {
        this.a01094 = a01094;
    }

    @Basic
    @Column(name = "A01095", nullable = true)
    public Timestamp getA01095() {
        return a01095;
    }

    public void setA01095(Timestamp a01095) {
        this.a01095 = a01095;
    }

    @Basic
    @Column(name = "A01086", nullable = true, length = 4000)
    public String getA01086() {
        return a01086;
    }

    public void setA01086(String a01086) {
        this.a01086 = a01086;
    }

    @Basic
    @Column(name = "A01028", nullable = true, length = 4000)
    public String getA01028() {
        return a01028;
    }

    public void setA01028(String a01028) {
        this.a01028 = a01028;
    }

    @Basic
    @Column(name = "A01014_Z", nullable = true, length = 64)
    public String getA01014Z() {
        return a01014Z;
    }

    public void setA01014Z(String a01014Z) {
        this.a01014Z = a01014Z;
    }

    @Basic
    @Column(name = "A01110", nullable = true, length = 100)
    public String getA01110() {
        return a01110;
    }

    public void setA01110(String a01110) {
        this.a01110 = a01110;
    }

    @Basic
    @Column(name = "A01111", nullable = true, length = 1000)
    public String getA01111() {
        return a01111;
    }

    public void setA01111(String a01111) {
        this.a01111 = a01111;
    }

    @Basic
    @Column(name = "A01015", nullable = true, length = 100)
    public String getA01015() {
        return a01015;
    }

    public void setA01015(String a01015) {
        this.a01015 = a01015;
    }

    @Basic
    @Column(name = "DEP_ID", nullable = true, length = 40)
    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    @Basic
    @Column(name = "A001004_A", nullable = true, length = 100)
    public String getA001004A() {
        return a001004A;
    }

    public void setA001004A(String a001004A) {
        this.a001004A = a001004A;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpA001 empA001 = (EmpA001) o;

        if (status != empA001.status) return false;
        if (a01002B != null ? !a01002B.equals(empA001.a01002B) : empA001.a01002B != null) return false;
        if (a01057 != null ? !a01057.equals(empA001.a01057) : empA001.a01057 != null) return false;
        if (a01065 != null ? !a01065.equals(empA001.a01065) : empA001.a01065 != null) return false;
        if (a01071 != null ? !a01071.equals(empA001.a01071) : empA001.a01071 != null) return false;
        if (a01077 != null ? !a01077.equals(empA001.a01077) : empA001.a01077 != null) return false;
        if (a01087 != null ? !a01087.equals(empA001.a01087) : empA001.a01087 != null) return false;
        if (a01088 != null ? !a01088.equals(empA001.a01088) : empA001.a01088 != null) return false;
        if (a01002A != null ? !a01002A.equals(empA001.a01002A) : empA001.a01002A != null) return false;
        if (a01027 != null ? !a01027.equals(empA001.a01027) : empA001.a01027 != null) return false;
        if (a01052 != null ? !a01052.equals(empA001.a01052) : empA001.a01052 != null) return false;
        if (a01062 != null ? !a01062.equals(empA001.a01062) : empA001.a01062 != null) return false;
        if (a01108 != null ? !a01108.equals(empA001.a01108) : empA001.a01108 != null) return false;
        if (a01031 != null ? !a01031.equals(empA001.a01031) : empA001.a01031 != null) return false;
        if (a01061 != null ? !a01061.equals(empA001.a01061) : empA001.a01061 != null) return false;
        if (a01067 != null ? !a01067.equals(empA001.a01067) : empA001.a01067 != null) return false;
        if (a01073 != null ? !a01073.equals(empA001.a01073) : empA001.a01073 != null) return false;
        if (a01090 != null ? !a01090.equals(empA001.a01090) : empA001.a01090 != null) return false;
        if (a01004 != null ? !a01004.equals(empA001.a01004) : empA001.a01004 != null) return false;
        if (a01011A != null ? !a01011A.equals(empA001.a01011A) : empA001.a01011A != null) return false;
        if (a01017 != null ? !a01017.equals(empA001.a01017) : empA001.a01017 != null) return false;
        if (a01051 != null ? !a01051.equals(empA001.a01051) : empA001.a01051 != null) return false;
        if (a01074 != null ? !a01074.equals(empA001.a01074) : empA001.a01074 != null) return false;
        if (a01083 != null ? !a01083.equals(empA001.a01083) : empA001.a01083 != null) return false;
        if (a01084 != null ? !a01084.equals(empA001.a01084) : empA001.a01084 != null) return false;
        if (a01014A != null ? !a01014A.equals(empA001.a01014A) : empA001.a01014A != null) return false;
        if (a01057A != null ? !a01057A.equals(empA001.a01057A) : empA001.a01057A != null) return false;
        if (a01060 != null ? !a01060.equals(empA001.a01060) : empA001.a01060 != null) return false;
        if (a01048 != null ? !a01048.equals(empA001.a01048) : empA001.a01048 != null) return false;
        if (a01063 != null ? !a01063.equals(empA001.a01063) : empA001.a01063 != null) return false;
        if (a01081 != null ? !a01081.equals(empA001.a01081) : empA001.a01081 != null) return false;
        if (a01099 != null ? !a01099.equals(empA001.a01099) : empA001.a01099 != null) return false;
        if (a01103 != null ? !a01103.equals(empA001.a01103) : empA001.a01103 != null) return false;
        if (a01014B != null ? !a01014B.equals(empA001.a01014B) : empA001.a01014B != null) return false;
        if (a01044 != null ? !a01044.equals(empA001.a01044) : empA001.a01044 != null) return false;
        if (a01057B != null ? !a01057B.equals(empA001.a01057B) : empA001.a01057B != null) return false;
        if (a001003 != null ? !a001003.equals(empA001.a001003) : empA001.a001003 != null) return false;
        if (a01001 != null ? !a01001.equals(empA001.a01001) : empA001.a01001 != null) return false;
        if (a01011B != null ? !a01011B.equals(empA001.a01011B) : empA001.a01011B != null) return false;
        if (a01037 != null ? !a01037.equals(empA001.a01037) : empA001.a01037 != null) return false;
        if (a01058 != null ? !a01058.equals(empA001.a01058) : empA001.a01058 != null) return false;
        if (a01097 != null ? !a01097.equals(empA001.a01097) : empA001.a01097 != null) return false;
        if (a01107 != null ? !a01107.equals(empA001.a01107) : empA001.a01107 != null) return false;
        if (status2 != null ? !status2.equals(empA001.status2) : empA001.status2 != null) return false;
        if (seqid != null ? !seqid.equals(empA001.seqid) : empA001.seqid != null) return false;
        if (empId != null ? !empId.equals(empA001.empId) : empA001.empId != null) return false;
        if (categoryId != null ? !categoryId.equals(empA001.categoryId) : empA001.categoryId != null) return false;
        if (lastUpdatedStamp != null ? !lastUpdatedStamp.equals(empA001.lastUpdatedStamp) : empA001.lastUpdatedStamp != null)
            return false;
        if (lastUpdatedTxStamp != null ? !lastUpdatedTxStamp.equals(empA001.lastUpdatedTxStamp) : empA001.lastUpdatedTxStamp != null)
            return false;
        if (createdStamp != null ? !createdStamp.equals(empA001.createdStamp) : empA001.createdStamp != null)
            return false;
        if (createdTxStamp != null ? !createdTxStamp.equals(empA001.createdTxStamp) : empA001.createdTxStamp != null)
            return false;
        if (a01007 != null ? !a01007.equals(empA001.a01007) : empA001.a01007 != null) return false;
        if (a01034 != null ? !a01034.equals(empA001.a01034) : empA001.a01034 != null) return false;
        if (a01040 != null ? !a01040.equals(empA001.a01040) : empA001.a01040 != null) return false;
        if (a01054 != null ? !a01054.equals(empA001.a01054) : empA001.a01054 != null) return false;
        if (a01094 != null ? !a01094.equals(empA001.a01094) : empA001.a01094 != null) return false;
        if (a01095 != null ? !a01095.equals(empA001.a01095) : empA001.a01095 != null) return false;
        if (a01086 != null ? !a01086.equals(empA001.a01086) : empA001.a01086 != null) return false;
        if (a01028 != null ? !a01028.equals(empA001.a01028) : empA001.a01028 != null) return false;
        if (a01014Z != null ? !a01014Z.equals(empA001.a01014Z) : empA001.a01014Z != null) return false;
        if (a01110 != null ? !a01110.equals(empA001.a01110) : empA001.a01110 != null) return false;
        if (a01111 != null ? !a01111.equals(empA001.a01111) : empA001.a01111 != null) return false;
        if (a01015 != null ? !a01015.equals(empA001.a01015) : empA001.a01015 != null) return false;
        if (depId != null ? !depId.equals(empA001.depId) : empA001.depId != null) return false;
        if (a001004A != null ? !a001004A.equals(empA001.a001004A) : empA001.a001004A != null) return false;
        if (ordinal != null ? !ordinal.equals(empA001.ordinal) : empA001.ordinal != null) return false;
        if (createdTime != null ? !createdTime.equals(empA001.createdTime) : empA001.createdTime != null) return false;
        if (!Arrays.equals(createdBy, empA001.createdBy)) return false;
        if (lastModifiedTime != null ? !lastModifiedTime.equals(empA001.lastModifiedTime) : empA001.lastModifiedTime != null)
            return false;
        if (!Arrays.equals(lastModifiedBy, empA001.lastModifiedBy)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = a01002B != null ? a01002B.hashCode() : 0;
        result = 31 * result + (a01057 != null ? a01057.hashCode() : 0);
        result = 31 * result + (a01065 != null ? a01065.hashCode() : 0);
        result = 31 * result + (a01071 != null ? a01071.hashCode() : 0);
        result = 31 * result + (a01077 != null ? a01077.hashCode() : 0);
        result = 31 * result + (a01087 != null ? a01087.hashCode() : 0);
        result = 31 * result + (a01088 != null ? a01088.hashCode() : 0);
        result = 31 * result + (a01002A != null ? a01002A.hashCode() : 0);
        result = 31 * result + (a01027 != null ? a01027.hashCode() : 0);
        result = 31 * result + (a01052 != null ? a01052.hashCode() : 0);
        result = 31 * result + (a01062 != null ? a01062.hashCode() : 0);
        result = 31 * result + (a01108 != null ? a01108.hashCode() : 0);
        result = 31 * result + (a01031 != null ? a01031.hashCode() : 0);
        result = 31 * result + (a01061 != null ? a01061.hashCode() : 0);
        result = 31 * result + (a01067 != null ? a01067.hashCode() : 0);
        result = 31 * result + (a01073 != null ? a01073.hashCode() : 0);
        result = 31 * result + (a01090 != null ? a01090.hashCode() : 0);
        result = 31 * result + (a01004 != null ? a01004.hashCode() : 0);
        result = 31 * result + (a01011A != null ? a01011A.hashCode() : 0);
        result = 31 * result + (a01017 != null ? a01017.hashCode() : 0);
        result = 31 * result + (a01051 != null ? a01051.hashCode() : 0);
        result = 31 * result + (a01074 != null ? a01074.hashCode() : 0);
        result = 31 * result + (a01083 != null ? a01083.hashCode() : 0);
        result = 31 * result + (a01084 != null ? a01084.hashCode() : 0);
        result = 31 * result + (a01014A != null ? a01014A.hashCode() : 0);
        result = 31 * result + (a01057A != null ? a01057A.hashCode() : 0);
        result = 31 * result + (a01060 != null ? a01060.hashCode() : 0);
        result = 31 * result + (a01048 != null ? a01048.hashCode() : 0);
        result = 31 * result + (a01063 != null ? a01063.hashCode() : 0);
        result = 31 * result + (a01081 != null ? a01081.hashCode() : 0);
        result = 31 * result + (a01099 != null ? a01099.hashCode() : 0);
        result = 31 * result + (a01103 != null ? a01103.hashCode() : 0);
        result = 31 * result + (a01014B != null ? a01014B.hashCode() : 0);
        result = 31 * result + (a01044 != null ? a01044.hashCode() : 0);
        result = 31 * result + (a01057B != null ? a01057B.hashCode() : 0);
        result = 31 * result + (a001003 != null ? a001003.hashCode() : 0);
        result = 31 * result + (a01001 != null ? a01001.hashCode() : 0);
        result = 31 * result + (a01011B != null ? a01011B.hashCode() : 0);
        result = 31 * result + (a01037 != null ? a01037.hashCode() : 0);
        result = 31 * result + (a01058 != null ? a01058.hashCode() : 0);
        result = 31 * result + (a01097 != null ? a01097.hashCode() : 0);
        result = 31 * result + (a01107 != null ? a01107.hashCode() : 0);
        result = 31 * result + (status2 != null ? status2.hashCode() : 0);
        result = 31 * result + (seqid != null ? seqid.hashCode() : 0);
        result = 31 * result + (empId != null ? empId.hashCode() : 0);
        result = 31 * result + (categoryId != null ? categoryId.hashCode() : 0);
        result = 31 * result + (lastUpdatedStamp != null ? lastUpdatedStamp.hashCode() : 0);
        result = 31 * result + (lastUpdatedTxStamp != null ? lastUpdatedTxStamp.hashCode() : 0);
        result = 31 * result + (createdStamp != null ? createdStamp.hashCode() : 0);
        result = 31 * result + (createdTxStamp != null ? createdTxStamp.hashCode() : 0);
        result = 31 * result + (a01007 != null ? a01007.hashCode() : 0);
        result = 31 * result + (a01034 != null ? a01034.hashCode() : 0);
        result = 31 * result + (a01040 != null ? a01040.hashCode() : 0);
        result = 31 * result + (a01054 != null ? a01054.hashCode() : 0);
        result = 31 * result + (a01094 != null ? a01094.hashCode() : 0);
        result = 31 * result + (a01095 != null ? a01095.hashCode() : 0);
        result = 31 * result + (a01086 != null ? a01086.hashCode() : 0);
        result = 31 * result + (a01028 != null ? a01028.hashCode() : 0);
        result = 31 * result + (a01014Z != null ? a01014Z.hashCode() : 0);
        result = 31 * result + (a01110 != null ? a01110.hashCode() : 0);
        result = 31 * result + (a01111 != null ? a01111.hashCode() : 0);
        result = 31 * result + (a01015 != null ? a01015.hashCode() : 0);
        result = 31 * result + (depId != null ? depId.hashCode() : 0);
        result = 31 * result + (a001004A != null ? a001004A.hashCode() : 0);
        result = 31 * result + (ordinal != null ? ordinal.hashCode() : 0);
        result = 31 * result + (int) (status ^ (status >>> 32));
        result = 31 * result + (createdTime != null ? createdTime.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(createdBy);
        result = 31 * result + (lastModifiedTime != null ? lastModifiedTime.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(lastModifiedBy);
        return result;
    }
}
