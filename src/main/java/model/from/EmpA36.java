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
@Table(name = "EMP_A36")
public class EmpA36 {
    private String a36031;
    private Long a36047;
    private String a36001;
    private String a36005A;
    private String a36013;
    private String a36027A;
    private String a36041;
    private String a36021;
    private String a36025;
    private String a36032;
    private String a36038;
    private String a36012;
    private String a36005B;
    private String a36017;
    private String a36027B;
    private String status;
    private String status2;
    private Long seqid;
    private String empId;
    private String subId;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private Timestamp a36030;
    private Timestamp a36007;
    private String a36011;
    private String a36044;

    @Basic
    @Column(name = "A36031", nullable = true, length = 100)
    public String getA36031() {
        return a36031;
    }

    public void setA36031(String a36031) {
        this.a36031 = a36031;
    }

    @Basic
    @Column(name = "A36047", nullable = true, precision = 2)
    public Long getA36047() {
        return a36047;
    }

    public void setA36047(Long a36047) {
        this.a36047 = a36047;
    }

    @Basic
    @Column(name = "A36001", nullable = true, length = 50)
    public String getA36001() {
        return a36001;
    }

    public void setA36001(String a36001) {
        this.a36001 = a36001;
    }

    @Basic
    @Column(name = "A36005_A", nullable = true, length = 50)
    public String getA36005A() {
        return a36005A;
    }

    public void setA36005A(String a36005A) {
        this.a36005A = a36005A;
    }

    @Basic
    @Column(name = "A36013", nullable = true, length = 100)
    public String getA36013() {
        return a36013;
    }

    public void setA36013(String a36013) {
        this.a36013 = a36013;
    }

    @Basic
    @Column(name = "A36027_A", nullable = true, length = 30)
    public String getA36027A() {
        return a36027A;
    }

    public void setA36027A(String a36027A) {
        this.a36027A = a36027A;
    }

    @Basic
    @Column(name = "A36041", nullable = true, length = 100)
    public String getA36041() {
        return a36041;
    }

    public void setA36041(String a36041) {
        this.a36041 = a36041;
    }

    @Basic
    @Column(name = "A36021", nullable = true, length = 100)
    public String getA36021() {
        return a36021;
    }

    public void setA36021(String a36021) {
        this.a36021 = a36021;
    }

    @Basic
    @Column(name = "A36025", nullable = true, length = 100)
    public String getA36025() {
        return a36025;
    }

    public void setA36025(String a36025) {
        this.a36025 = a36025;
    }

    @Basic
    @Column(name = "A36032", nullable = true, length = 80)
    public String getA36032() {
        return a36032;
    }

    public void setA36032(String a36032) {
        this.a36032 = a36032;
    }

    @Basic
    @Column(name = "A36038", nullable = true, length = 100)
    public String getA36038() {
        return a36038;
    }

    public void setA36038(String a36038) {
        this.a36038 = a36038;
    }

    @Basic
    @Column(name = "A36012", nullable = true, length = 100)
    public String getA36012() {
        return a36012;
    }

    public void setA36012(String a36012) {
        this.a36012 = a36012;
    }

    @Basic
    @Column(name = "A36005_B", nullable = true, length = 10)
    public String getA36005B() {
        return a36005B;
    }

    public void setA36005B(String a36005B) {
        this.a36005B = a36005B;
    }

    @Basic
    @Column(name = "A36017", nullable = true, length = 100)
    public String getA36017() {
        return a36017;
    }

    public void setA36017(String a36017) {
        this.a36017 = a36017;
    }

    @Basic
    @Column(name = "A36027_B", nullable = true, length = 10)
    public String getA36027B() {
        return a36027B;
    }

    public void setA36027B(String a36027B) {
        this.a36027B = a36027B;
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
    @Column(name = "A36030", nullable = true)
    public Timestamp getA36030() {
        return a36030;
    }

    public void setA36030(Timestamp a36030) {
        this.a36030 = a36030;
    }

    @Basic
    @Column(name = "A36007", nullable = true)
    public Timestamp getA36007() {
        return a36007;
    }

    public void setA36007(Timestamp a36007) {
        this.a36007 = a36007;
    }

    @Basic
    @Column(name = "A36011", nullable = true, length = 4000)
    public String getA36011() {
        return a36011;
    }

    public void setA36011(String a36011) {
        this.a36011 = a36011;
    }

    @Basic
    @Column(name = "A36044", nullable = true, length = 4000)
    public String getA36044() {
        return a36044;
    }

    public void setA36044(String a36044) {
        this.a36044 = a36044;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpA36 empA36 = (EmpA36) o;

        if (a36031 != null ? !a36031.equals(empA36.a36031) : empA36.a36031 != null) return false;
        if (a36047 != null ? !a36047.equals(empA36.a36047) : empA36.a36047 != null) return false;
        if (a36001 != null ? !a36001.equals(empA36.a36001) : empA36.a36001 != null) return false;
        if (a36005A != null ? !a36005A.equals(empA36.a36005A) : empA36.a36005A != null) return false;
        if (a36013 != null ? !a36013.equals(empA36.a36013) : empA36.a36013 != null) return false;
        if (a36027A != null ? !a36027A.equals(empA36.a36027A) : empA36.a36027A != null) return false;
        if (a36041 != null ? !a36041.equals(empA36.a36041) : empA36.a36041 != null) return false;
        if (a36021 != null ? !a36021.equals(empA36.a36021) : empA36.a36021 != null) return false;
        if (a36025 != null ? !a36025.equals(empA36.a36025) : empA36.a36025 != null) return false;
        if (a36032 != null ? !a36032.equals(empA36.a36032) : empA36.a36032 != null) return false;
        if (a36038 != null ? !a36038.equals(empA36.a36038) : empA36.a36038 != null) return false;
        if (a36012 != null ? !a36012.equals(empA36.a36012) : empA36.a36012 != null) return false;
        if (a36005B != null ? !a36005B.equals(empA36.a36005B) : empA36.a36005B != null) return false;
        if (a36017 != null ? !a36017.equals(empA36.a36017) : empA36.a36017 != null) return false;
        if (a36027B != null ? !a36027B.equals(empA36.a36027B) : empA36.a36027B != null) return false;
        if (status != null ? !status.equals(empA36.status) : empA36.status != null) return false;
        if (status2 != null ? !status2.equals(empA36.status2) : empA36.status2 != null) return false;
        if (seqid != null ? !seqid.equals(empA36.seqid) : empA36.seqid != null) return false;
        if (empId != null ? !empId.equals(empA36.empId) : empA36.empId != null) return false;
        if (subId != null ? !subId.equals(empA36.subId) : empA36.subId != null) return false;
        if (lastUpdatedStamp != null ? !lastUpdatedStamp.equals(empA36.lastUpdatedStamp) : empA36.lastUpdatedStamp != null)
            return false;
        if (lastUpdatedTxStamp != null ? !lastUpdatedTxStamp.equals(empA36.lastUpdatedTxStamp) : empA36.lastUpdatedTxStamp != null)
            return false;
        if (createdStamp != null ? !createdStamp.equals(empA36.createdStamp) : empA36.createdStamp != null)
            return false;
        if (createdTxStamp != null ? !createdTxStamp.equals(empA36.createdTxStamp) : empA36.createdTxStamp != null)
            return false;
        if (a36030 != null ? !a36030.equals(empA36.a36030) : empA36.a36030 != null) return false;
        if (a36007 != null ? !a36007.equals(empA36.a36007) : empA36.a36007 != null) return false;
        if (a36011 != null ? !a36011.equals(empA36.a36011) : empA36.a36011 != null) return false;
        if (a36044 != null ? !a36044.equals(empA36.a36044) : empA36.a36044 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = a36031 != null ? a36031.hashCode() : 0;
        result = 31 * result + (a36047 != null ? a36047.hashCode() : 0);
        result = 31 * result + (a36001 != null ? a36001.hashCode() : 0);
        result = 31 * result + (a36005A != null ? a36005A.hashCode() : 0);
        result = 31 * result + (a36013 != null ? a36013.hashCode() : 0);
        result = 31 * result + (a36027A != null ? a36027A.hashCode() : 0);
        result = 31 * result + (a36041 != null ? a36041.hashCode() : 0);
        result = 31 * result + (a36021 != null ? a36021.hashCode() : 0);
        result = 31 * result + (a36025 != null ? a36025.hashCode() : 0);
        result = 31 * result + (a36032 != null ? a36032.hashCode() : 0);
        result = 31 * result + (a36038 != null ? a36038.hashCode() : 0);
        result = 31 * result + (a36012 != null ? a36012.hashCode() : 0);
        result = 31 * result + (a36005B != null ? a36005B.hashCode() : 0);
        result = 31 * result + (a36017 != null ? a36017.hashCode() : 0);
        result = 31 * result + (a36027B != null ? a36027B.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (status2 != null ? status2.hashCode() : 0);
        result = 31 * result + (seqid != null ? seqid.hashCode() : 0);
        result = 31 * result + (empId != null ? empId.hashCode() : 0);
        result = 31 * result + (subId != null ? subId.hashCode() : 0);
        result = 31 * result + (lastUpdatedStamp != null ? lastUpdatedStamp.hashCode() : 0);
        result = 31 * result + (lastUpdatedTxStamp != null ? lastUpdatedTxStamp.hashCode() : 0);
        result = 31 * result + (createdStamp != null ? createdStamp.hashCode() : 0);
        result = 31 * result + (createdTxStamp != null ? createdTxStamp.hashCode() : 0);
        result = 31 * result + (a36030 != null ? a36030.hashCode() : 0);
        result = 31 * result + (a36007 != null ? a36007.hashCode() : 0);
        result = 31 * result + (a36011 != null ? a36011.hashCode() : 0);
        result = 31 * result + (a36044 != null ? a36044.hashCode() : 0);
        return result;
    }
}
