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
@Table(name = "EMP_A31", catalog = "")
public class EmpA31 {
    private String id;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String empId;
    private String subId;
    private Long seqid;
    private String status;
    private String status2;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private String a31001;
    private String a31004;
    private String a31006;
    private String a31010;
    private String a31011;
    private Timestamp a31012;
    private String a31013;
    private String a31014;
    private String a31018;
    private String a31021;
    private Long a31024;
    private String a31030;
    private String a31031;
    private String a31035;
    private String a31037;
    private String a31041;
    private String a31044;
    private String a31034;
    private String a31017B;
    private String a31017A;
    private String a31027A;
    private String a31027B;

    @Basic
    @Column(name = "EMP_ID", nullable = false, length = 50)
    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    @Basic
    @Column(name = "SUB_ID", nullable = false, length = 50)
    public String getSubId() {
        return subId;
    }

    public void setSubId(String subId) {
        this.subId = subId;
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
    @Column(name = "STATUS", nullable = true, length = 10)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "STATUS2", nullable = true, length = 10)
    public String getStatus2() {
        return status2;
    }

    public void setStatus2(String status2) {
        this.status2 = status2;
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
    @Column(name = "A31001", nullable = true, length = 6)
    public String getA31001() {
        return a31001;
    }

    public void setA31001(String a31001) {
        this.a31001 = a31001;
    }

    @Basic
    @Column(name = "A31004", nullable = true, length = 50)
    public String getA31004() {
        return a31004;
    }

    public void setA31004(String a31004) {
        this.a31004 = a31004;
    }

    @Basic
    @Column(name = "A31006", nullable = true, length = 3)
    public String getA31006() {
        return a31006;
    }

    public void setA31006(String a31006) {
        this.a31006 = a31006;
    }

    @Basic
    @Column(name = "A31010", nullable = true, length = 2)
    public String getA31010() {
        return a31010;
    }

    public void setA31010(String a31010) {
        this.a31010 = a31010;
    }

    @Basic
    @Column(name = "A31011", nullable = true, length = 40)
    public String getA31011() {
        return a31011;
    }

    public void setA31011(String a31011) {
        this.a31011 = a31011;
    }

    @Basic
    @Column(name = "A31012", nullable = true)
    public Timestamp getA31012() {
        return a31012;
    }

    public void setA31012(Timestamp a31012) {
        this.a31012 = a31012;
    }

    @Basic
    @Column(name = "A31013", nullable = true, length = 48)
    public String getA31013() {
        return a31013;
    }

    public void setA31013(String a31013) {
        this.a31013 = a31013;
    }

    @Basic
    @Column(name = "A31014", nullable = true, length = 2)
    public String getA31014() {
        return a31014;
    }

    public void setA31014(String a31014) {
        this.a31014 = a31014;
    }

    @Basic
    @Column(name = "A31018", nullable = true, length = 80)
    public String getA31018() {
        return a31018;
    }

    public void setA31018(String a31018) {
        this.a31018 = a31018;
    }

    @Basic
    @Column(name = "A31021", nullable = true, length = 6)
    public String getA31021() {
        return a31021;
    }

    public void setA31021(String a31021) {
        this.a31021 = a31021;
    }

    @Basic
    @Column(name = "A31024", nullable = true, precision = 2)
    public Long getA31024() {
        return a31024;
    }

    public void setA31024(Long a31024) {
        this.a31024 = a31024;
    }

    @Basic
    @Column(name = "A31030", nullable = true, length = 80)
    public String getA31030() {
        return a31030;
    }

    public void setA31030(String a31030) {
        this.a31030 = a31030;
    }

    @Basic
    @Column(name = "A31031", nullable = true, length = 2)
    public String getA31031() {
        return a31031;
    }

    public void setA31031(String a31031) {
        this.a31031 = a31031;
    }

    @Basic
    @Column(name = "A31035", nullable = true)
    public String getA31035() {
        return a31035;
    }

    public void setA31035(String a31035) {
        this.a31035 = a31035;
    }

    @Basic
    @Column(name = "A31037", nullable = true, length = 48)
    public String getA31037() {
        return a31037;
    }

    public void setA31037(String a31037) {
        this.a31037 = a31037;
    }

    @Basic
    @Column(name = "A31041", nullable = true, length = 1)
    public String getA31041() {
        return a31041;
    }

    public void setA31041(String a31041) {
        this.a31041 = a31041;
    }

    @Basic
    @Column(name = "A31044", nullable = true, length = 4000)
    public String getA31044() {
        return a31044;
    }

    public void setA31044(String a31044) {
        this.a31044 = a31044;
    }

    @Basic
    @Column(name = "A31034", nullable = true, length = 4000)
    public String getA31034() {
        return a31034;
    }

    public void setA31034(String a31034) {
        this.a31034 = a31034;
    }

    @Basic
    @Column(name = "A31017_B", nullable = true, length = 18)
    public String getA31017B() {
        return a31017B;
    }

    public void setA31017B(String a31017B) {
        this.a31017B = a31017B;
    }

    @Basic
    @Column(name = "A31017_A", nullable = true, length = 120)
    public String getA31017A() {
        return a31017A;
    }

    public void setA31017A(String a31017A) {
        this.a31017A = a31017A;
    }

    @Basic
    @Column(name = "A31027_A", nullable = true, length = 120)
    public String getA31027A() {
        return a31027A;
    }

    public void setA31027A(String a31027A) {
        this.a31027A = a31027A;
    }

    @Basic
    @Column(name = "A31027_B", nullable = true, length = 18)
    public String getA31027B() {
        return a31027B;
    }

    public void setA31027B(String a31027B) {
        this.a31027B = a31027B;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpA31 empA31 = (EmpA31) o;

        if (empId != null ? !empId.equals(empA31.empId) : empA31.empId != null) return false;
        if (subId != null ? !subId.equals(empA31.subId) : empA31.subId != null) return false;
        if (seqid != null ? !seqid.equals(empA31.seqid) : empA31.seqid != null) return false;
        if (status != null ? !status.equals(empA31.status) : empA31.status != null) return false;
        if (status2 != null ? !status2.equals(empA31.status2) : empA31.status2 != null) return false;
        if (lastUpdatedStamp != null ? !lastUpdatedStamp.equals(empA31.lastUpdatedStamp) : empA31.lastUpdatedStamp != null)
            return false;
        if (lastUpdatedTxStamp != null ? !lastUpdatedTxStamp.equals(empA31.lastUpdatedTxStamp) : empA31.lastUpdatedTxStamp != null)
            return false;
        if (createdStamp != null ? !createdStamp.equals(empA31.createdStamp) : empA31.createdStamp != null)
            return false;
        if (createdTxStamp != null ? !createdTxStamp.equals(empA31.createdTxStamp) : empA31.createdTxStamp != null)
            return false;
        if (a31001 != null ? !a31001.equals(empA31.a31001) : empA31.a31001 != null) return false;
        if (a31004 != null ? !a31004.equals(empA31.a31004) : empA31.a31004 != null) return false;
        if (a31006 != null ? !a31006.equals(empA31.a31006) : empA31.a31006 != null) return false;
        if (a31010 != null ? !a31010.equals(empA31.a31010) : empA31.a31010 != null) return false;
        if (a31011 != null ? !a31011.equals(empA31.a31011) : empA31.a31011 != null) return false;
        if (a31012 != null ? !a31012.equals(empA31.a31012) : empA31.a31012 != null) return false;
        if (a31013 != null ? !a31013.equals(empA31.a31013) : empA31.a31013 != null) return false;
        if (a31014 != null ? !a31014.equals(empA31.a31014) : empA31.a31014 != null) return false;
        if (a31018 != null ? !a31018.equals(empA31.a31018) : empA31.a31018 != null) return false;
        if (a31021 != null ? !a31021.equals(empA31.a31021) : empA31.a31021 != null) return false;
        if (a31024 != null ? !a31024.equals(empA31.a31024) : empA31.a31024 != null) return false;
        if (a31030 != null ? !a31030.equals(empA31.a31030) : empA31.a31030 != null) return false;
        if (a31031 != null ? !a31031.equals(empA31.a31031) : empA31.a31031 != null) return false;
        if (a31035 != null ? !a31035.equals(empA31.a31035) : empA31.a31035 != null) return false;
        if (a31037 != null ? !a31037.equals(empA31.a31037) : empA31.a31037 != null) return false;
        if (a31041 != null ? !a31041.equals(empA31.a31041) : empA31.a31041 != null) return false;
        if (a31044 != null ? !a31044.equals(empA31.a31044) : empA31.a31044 != null) return false;
        if (a31034 != null ? !a31034.equals(empA31.a31034) : empA31.a31034 != null) return false;
        if (a31017B != null ? !a31017B.equals(empA31.a31017B) : empA31.a31017B != null) return false;
        if (a31017A != null ? !a31017A.equals(empA31.a31017A) : empA31.a31017A != null) return false;
        if (a31027A != null ? !a31027A.equals(empA31.a31027A) : empA31.a31027A != null) return false;
        if (a31027B != null ? !a31027B.equals(empA31.a31027B) : empA31.a31027B != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empId != null ? empId.hashCode() : 0;
        result = 31 * result + (subId != null ? subId.hashCode() : 0);
        result = 31 * result + (seqid != null ? seqid.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (status2 != null ? status2.hashCode() : 0);
        result = 31 * result + (lastUpdatedStamp != null ? lastUpdatedStamp.hashCode() : 0);
        result = 31 * result + (lastUpdatedTxStamp != null ? lastUpdatedTxStamp.hashCode() : 0);
        result = 31 * result + (createdStamp != null ? createdStamp.hashCode() : 0);
        result = 31 * result + (createdTxStamp != null ? createdTxStamp.hashCode() : 0);
        result = 31 * result + (a31001 != null ? a31001.hashCode() : 0);
        result = 31 * result + (a31004 != null ? a31004.hashCode() : 0);
        result = 31 * result + (a31006 != null ? a31006.hashCode() : 0);
        result = 31 * result + (a31010 != null ? a31010.hashCode() : 0);
        result = 31 * result + (a31011 != null ? a31011.hashCode() : 0);
        result = 31 * result + (a31012 != null ? a31012.hashCode() : 0);
        result = 31 * result + (a31013 != null ? a31013.hashCode() : 0);
        result = 31 * result + (a31014 != null ? a31014.hashCode() : 0);
        result = 31 * result + (a31018 != null ? a31018.hashCode() : 0);
        result = 31 * result + (a31021 != null ? a31021.hashCode() : 0);
        result = 31 * result + (a31024 != null ? a31024.hashCode() : 0);
        result = 31 * result + (a31030 != null ? a31030.hashCode() : 0);
        result = 31 * result + (a31031 != null ? a31031.hashCode() : 0);
        result = 31 * result + (a31035 != null ? a31035.hashCode() : 0);
        result = 31 * result + (a31037 != null ? a31037.hashCode() : 0);
        result = 31 * result + (a31041 != null ? a31041.hashCode() : 0);
        result = 31 * result + (a31044 != null ? a31044.hashCode() : 0);
        result = 31 * result + (a31034 != null ? a31034.hashCode() : 0);
        result = 31 * result + (a31017B != null ? a31017B.hashCode() : 0);
        result = 31 * result + (a31017A != null ? a31017A.hashCode() : 0);
        result = 31 * result + (a31027A != null ? a31027A.hashCode() : 0);
        result = 31 * result + (a31027B != null ? a31027B.hashCode() : 0);
        return result;
    }
}
