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
@Table(name = "EMP_A19", catalog = "")
public class EmpA19 {
    private String id;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String a19037;
    private String a19057B;
    private String a19001;
    private String a19007;
    private String a19014B;
    private String a19022;
    private String a19051;
    private String a19067;
    private String a19004;
    private Long a19041;
    private String a19017;
    private String a19047;
    private String a19021;
    private String a19025;
    private String a19044;
    private String a19054;
    private String a19014A;
    private String a19056B;
    private String a19056A;
    private String a19057A;
    private String a19011;
    private String status;
    private String status2;
    private Long seqid;
    private String empId;
    private String subId;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private Timestamp a19024;
    private Timestamp a19027;
    private Timestamp a19031;
    private Timestamp a19034;
    private String a19064;
    private String a19045;

    @Basic
    @Column(name = "A19037", nullable = true, length = 100)
    public String getA19037() {
        return a19037;
    }

    public void setA19037(String a19037) {
        this.a19037 = a19037;
    }

    @Basic
    @Column(name = "A19057_B", nullable = true, length = 18)
    public String getA19057B() {
        return a19057B;
    }

    public void setA19057B(String a19057B) {
        this.a19057B = a19057B;
    }

    @Basic
    @Column(name = "A19001", nullable = true, length = 120)
    public String getA19001() {
        return a19001;
    }

    public void setA19001(String a19001) {
        this.a19001 = a19001;
    }

    @Basic
    @Column(name = "A19007", nullable = true, length = 100)
    public String getA19007() {
        return a19007;
    }

    public void setA19007(String a19007) {
        this.a19007 = a19007;
    }

    @Basic
    @Column(name = "A19014_B", nullable = true, length = 18)
    public String getA19014B() {
        return a19014B;
    }

    public void setA19014B(String a19014B) {
        this.a19014B = a19014B;
    }

    @Basic
    @Column(name = "A19022", nullable = true, length = 120)
    public String getA19022() {
        return a19022;
    }

    public void setA19022(String a19022) {
        this.a19022 = a19022;
    }

    @Basic
    @Column(name = "A19051", nullable = true, length = 100)
    public String getA19051() {
        return a19051;
    }

    public void setA19051(String a19051) {
        this.a19051 = a19051;
    }

    @Basic
    @Column(name = "A19067", nullable = true, length = 100)
    public String getA19067() {
        return a19067;
    }

    public void setA19067(String a19067) {
        this.a19067 = a19067;
    }

    @Basic
    @Column(name = "A19004", nullable = true, length = 14)
    public String getA19004() {
        return a19004;
    }

    public void setA19004(String a19004) {
        this.a19004 = a19004;
    }

    @Basic
    @Column(name = "A19041", nullable = true, precision = 2)
    public Long getA19041() {
        return a19041;
    }

    public void setA19041(Long a19041) {
        this.a19041 = a19041;
    }

    @Basic
    @Column(name = "A19017", nullable = true, length = 120)
    public String getA19017() {
        return a19017;
    }

    public void setA19017(String a19017) {
        this.a19017 = a19017;
    }

    @Basic
    @Column(name = "A19047", nullable = true, length = 14)
    public String getA19047() {
        return a19047;
    }

    public void setA19047(String a19047) {
        this.a19047 = a19047;
    }

    @Basic
    @Column(name = "A19021", nullable = true, length = 100)
    public String getA19021() {
        return a19021;
    }

    public void setA19021(String a19021) {
        this.a19021 = a19021;
    }

    @Basic
    @Column(name = "A19025", nullable = true, length = 100)
    public String getA19025() {
        return a19025;
    }

    public void setA19025(String a19025) {
        this.a19025 = a19025;
    }

    @Basic
    @Column(name = "A19044", nullable = true, length = 120)
    public String getA19044() {
        return a19044;
    }

    public void setA19044(String a19044) {
        this.a19044 = a19044;
    }

    @Basic
    @Column(name = "A19054", nullable = true, length = 100)
    public String getA19054() {
        return a19054;
    }

    public void setA19054(String a19054) {
        this.a19054 = a19054;
    }

    @Basic
    @Column(name = "A19014_A", nullable = true, length = 120)
    public String getA19014A() {
        return a19014A;
    }

    public void setA19014A(String a19014A) {
        this.a19014A = a19014A;
    }

    @Basic
    @Column(name = "A19056_B", nullable = true, length = 18)
    public String getA19056B() {
        return a19056B;
    }

    public void setA19056B(String a19056B) {
        this.a19056B = a19056B;
    }

    @Basic
    @Column(name = "A19056_A", nullable = true, length = 120)
    public String getA19056A() {
        return a19056A;
    }

    public void setA19056A(String a19056A) {
        this.a19056A = a19056A;
    }

    @Basic
    @Column(name = "A19057_A", nullable = true, length = 120)
    public String getA19057A() {
        return a19057A;
    }

    public void setA19057A(String a19057A) {
        this.a19057A = a19057A;
    }

    @Basic
    @Column(name = "A19011", nullable = true, length = 100)
    public String getA19011() {
        return a19011;
    }

    public void setA19011(String a19011) {
        this.a19011 = a19011;
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
    @Column(name = "A19024", nullable = true)
    public Timestamp getA19024() {
        return a19024;
    }

    public void setA19024(Timestamp a19024) {
        this.a19024 = a19024;
    }

    @Basic
    @Column(name = "A19027", nullable = true)
    public Timestamp getA19027() {
        return a19027;
    }

    public void setA19027(Timestamp a19027) {
        this.a19027 = a19027;
    }

    @Basic
    @Column(name = "A19031", nullable = true)
    public Timestamp getA19031() {
        return a19031;
    }

    public void setA19031(Timestamp a19031) {
        this.a19031 = a19031;
    }

    @Basic
    @Column(name = "A19034", nullable = true)
    public Timestamp getA19034() {
        return a19034;
    }

    public void setA19034(Timestamp a19034) {
        this.a19034 = a19034;
    }

    @Basic
    @Column(name = "A19064", nullable = true, length = 4000)
    public String getA19064() {
        return a19064;
    }

    public void setA19064(String a19064) {
        this.a19064 = a19064;
    }

    @Basic
    @Column(name = "A19045", nullable = true, length = 4000)
    public String getA19045() {
        return a19045;
    }

    public void setA19045(String a19045) {
        this.a19045 = a19045;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpA19 empA19 = (EmpA19) o;

        if (a19037 != null ? !a19037.equals(empA19.a19037) : empA19.a19037 != null) return false;
        if (a19057B != null ? !a19057B.equals(empA19.a19057B) : empA19.a19057B != null) return false;
        if (a19001 != null ? !a19001.equals(empA19.a19001) : empA19.a19001 != null) return false;
        if (a19007 != null ? !a19007.equals(empA19.a19007) : empA19.a19007 != null) return false;
        if (a19014B != null ? !a19014B.equals(empA19.a19014B) : empA19.a19014B != null) return false;
        if (a19022 != null ? !a19022.equals(empA19.a19022) : empA19.a19022 != null) return false;
        if (a19051 != null ? !a19051.equals(empA19.a19051) : empA19.a19051 != null) return false;
        if (a19067 != null ? !a19067.equals(empA19.a19067) : empA19.a19067 != null) return false;
        if (a19004 != null ? !a19004.equals(empA19.a19004) : empA19.a19004 != null) return false;
        if (a19041 != null ? !a19041.equals(empA19.a19041) : empA19.a19041 != null) return false;
        if (a19017 != null ? !a19017.equals(empA19.a19017) : empA19.a19017 != null) return false;
        if (a19047 != null ? !a19047.equals(empA19.a19047) : empA19.a19047 != null) return false;
        if (a19021 != null ? !a19021.equals(empA19.a19021) : empA19.a19021 != null) return false;
        if (a19025 != null ? !a19025.equals(empA19.a19025) : empA19.a19025 != null) return false;
        if (a19044 != null ? !a19044.equals(empA19.a19044) : empA19.a19044 != null) return false;
        if (a19054 != null ? !a19054.equals(empA19.a19054) : empA19.a19054 != null) return false;
        if (a19014A != null ? !a19014A.equals(empA19.a19014A) : empA19.a19014A != null) return false;
        if (a19056B != null ? !a19056B.equals(empA19.a19056B) : empA19.a19056B != null) return false;
        if (a19056A != null ? !a19056A.equals(empA19.a19056A) : empA19.a19056A != null) return false;
        if (a19057A != null ? !a19057A.equals(empA19.a19057A) : empA19.a19057A != null) return false;
        if (a19011 != null ? !a19011.equals(empA19.a19011) : empA19.a19011 != null) return false;
        if (status != null ? !status.equals(empA19.status) : empA19.status != null) return false;
        if (status2 != null ? !status2.equals(empA19.status2) : empA19.status2 != null) return false;
        if (seqid != null ? !seqid.equals(empA19.seqid) : empA19.seqid != null) return false;
        if (empId != null ? !empId.equals(empA19.empId) : empA19.empId != null) return false;
        if (subId != null ? !subId.equals(empA19.subId) : empA19.subId != null) return false;
        if (lastUpdatedStamp != null ? !lastUpdatedStamp.equals(empA19.lastUpdatedStamp) : empA19.lastUpdatedStamp != null)
            return false;
        if (lastUpdatedTxStamp != null ? !lastUpdatedTxStamp.equals(empA19.lastUpdatedTxStamp) : empA19.lastUpdatedTxStamp != null)
            return false;
        if (createdStamp != null ? !createdStamp.equals(empA19.createdStamp) : empA19.createdStamp != null)
            return false;
        if (createdTxStamp != null ? !createdTxStamp.equals(empA19.createdTxStamp) : empA19.createdTxStamp != null)
            return false;
        if (a19024 != null ? !a19024.equals(empA19.a19024) : empA19.a19024 != null) return false;
        if (a19027 != null ? !a19027.equals(empA19.a19027) : empA19.a19027 != null) return false;
        if (a19031 != null ? !a19031.equals(empA19.a19031) : empA19.a19031 != null) return false;
        if (a19034 != null ? !a19034.equals(empA19.a19034) : empA19.a19034 != null) return false;
        if (a19064 != null ? !a19064.equals(empA19.a19064) : empA19.a19064 != null) return false;
        if (a19045 != null ? !a19045.equals(empA19.a19045) : empA19.a19045 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = a19037 != null ? a19037.hashCode() : 0;
        result = 31 * result + (a19057B != null ? a19057B.hashCode() : 0);
        result = 31 * result + (a19001 != null ? a19001.hashCode() : 0);
        result = 31 * result + (a19007 != null ? a19007.hashCode() : 0);
        result = 31 * result + (a19014B != null ? a19014B.hashCode() : 0);
        result = 31 * result + (a19022 != null ? a19022.hashCode() : 0);
        result = 31 * result + (a19051 != null ? a19051.hashCode() : 0);
        result = 31 * result + (a19067 != null ? a19067.hashCode() : 0);
        result = 31 * result + (a19004 != null ? a19004.hashCode() : 0);
        result = 31 * result + (a19041 != null ? a19041.hashCode() : 0);
        result = 31 * result + (a19017 != null ? a19017.hashCode() : 0);
        result = 31 * result + (a19047 != null ? a19047.hashCode() : 0);
        result = 31 * result + (a19021 != null ? a19021.hashCode() : 0);
        result = 31 * result + (a19025 != null ? a19025.hashCode() : 0);
        result = 31 * result + (a19044 != null ? a19044.hashCode() : 0);
        result = 31 * result + (a19054 != null ? a19054.hashCode() : 0);
        result = 31 * result + (a19014A != null ? a19014A.hashCode() : 0);
        result = 31 * result + (a19056B != null ? a19056B.hashCode() : 0);
        result = 31 * result + (a19056A != null ? a19056A.hashCode() : 0);
        result = 31 * result + (a19057A != null ? a19057A.hashCode() : 0);
        result = 31 * result + (a19011 != null ? a19011.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (status2 != null ? status2.hashCode() : 0);
        result = 31 * result + (seqid != null ? seqid.hashCode() : 0);
        result = 31 * result + (empId != null ? empId.hashCode() : 0);
        result = 31 * result + (subId != null ? subId.hashCode() : 0);
        result = 31 * result + (lastUpdatedStamp != null ? lastUpdatedStamp.hashCode() : 0);
        result = 31 * result + (lastUpdatedTxStamp != null ? lastUpdatedTxStamp.hashCode() : 0);
        result = 31 * result + (createdStamp != null ? createdStamp.hashCode() : 0);
        result = 31 * result + (createdTxStamp != null ? createdTxStamp.hashCode() : 0);
        result = 31 * result + (a19024 != null ? a19024.hashCode() : 0);
        result = 31 * result + (a19027 != null ? a19027.hashCode() : 0);
        result = 31 * result + (a19031 != null ? a19031.hashCode() : 0);
        result = 31 * result + (a19034 != null ? a19034.hashCode() : 0);
        result = 31 * result + (a19064 != null ? a19064.hashCode() : 0);
        result = 31 * result + (a19045 != null ? a19045.hashCode() : 0);
        return result;
    }
}
