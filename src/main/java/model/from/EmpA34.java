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
@Table(name = "EMP_A34", catalog = "")
public class EmpA34 {
    private String id;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private Long a34015;
    private Long a34022;
    private String a3402X;
    private Long a34006;
    private String a34007;
    private String a34009;
    private String a34001;
    private Long a34013;
    private String a34008;
    private String a34002;
    private Long a34011;
    private Long a34012;
    private Long a34003;
    private Long a34005;
    private Long a34023;
    private Long a34025;
    private String status;
    private String status2;
    private Long seqid;
    private String empId;
    private String subId;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private Timestamp a34017;
    private Timestamp a34021;
    private String a34024;

    @Basic
    @Column(name = "A34015", nullable = true, precision = 2)
    public Long getA34015() {
        return a34015;
    }

    public void setA34015(Long a34015) {
        this.a34015 = a34015;
    }

    @Basic
    @Column(name = "A34022", nullable = true, precision = 2)
    public Long getA34022() {
        return a34022;
    }

    public void setA34022(Long a34022) {
        this.a34022 = a34022;
    }

    @Basic
    @Column(name = "A3402_X", nullable = true, length = 1)
    public String getA3402X() {
        return a3402X;
    }

    public void setA3402X(String a3402X) {
        this.a3402X = a3402X;
    }

    @Basic
    @Column(name = "A34006", nullable = true, precision = 2)
    public Long getA34006() {
        return a34006;
    }

    public void setA34006(Long a34006) {
        this.a34006 = a34006;
    }

    @Basic
    @Column(name = "A34007", nullable = true, length = 120)
    public String getA34007() {
        return a34007;
    }

    public void setA34007(String a34007) {
        this.a34007 = a34007;
    }

    @Basic
    @Column(name = "A34009", nullable = true, length = 100)
    public String getA34009() {
        return a34009;
    }

    public void setA34009(String a34009) {
        this.a34009 = a34009;
    }

    @Basic
    @Column(name = "A34001", nullable = true, length = 100)
    public String getA34001() {
        return a34001;
    }

    public void setA34001(String a34001) {
        this.a34001 = a34001;
    }

    @Basic
    @Column(name = "A34013", nullable = true, precision = 2)
    public Long getA34013() {
        return a34013;
    }

    public void setA34013(Long a34013) {
        this.a34013 = a34013;
    }

    @Basic
    @Column(name = "A34008", nullable = true, length = 100)
    public String getA34008() {
        return a34008;
    }

    public void setA34008(String a34008) {
        this.a34008 = a34008;
    }

    @Basic
    @Column(name = "A34002", nullable = true, length = 100)
    public String getA34002() {
        return a34002;
    }

    public void setA34002(String a34002) {
        this.a34002 = a34002;
    }

    @Basic
    @Column(name = "A34011", nullable = true, precision = 2)
    public Long getA34011() {
        return a34011;
    }

    public void setA34011(Long a34011) {
        this.a34011 = a34011;
    }

    @Basic
    @Column(name = "A34012", nullable = true, precision = 2)
    public Long getA34012() {
        return a34012;
    }

    public void setA34012(Long a34012) {
        this.a34012 = a34012;
    }

    @Basic
    @Column(name = "A34003", nullable = true, precision = 2)
    public Long getA34003() {
        return a34003;
    }

    public void setA34003(Long a34003) {
        this.a34003 = a34003;
    }

    @Basic
    @Column(name = "A34005", nullable = true, precision = 2)
    public Long getA34005() {
        return a34005;
    }

    public void setA34005(Long a34005) {
        this.a34005 = a34005;
    }

    @Basic
    @Column(name = "A34023", nullable = true, precision = 2)
    public Long getA34023() {
        return a34023;
    }

    public void setA34023(Long a34023) {
        this.a34023 = a34023;
    }

    @Basic
    @Column(name = "A34025", nullable = true, precision = 2)
    public Long getA34025() {
        return a34025;
    }

    public void setA34025(Long a34025) {
        this.a34025 = a34025;
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
    @Column(name = "A34017", nullable = true)
    public Timestamp getA34017() {
        return a34017;
    }

    public void setA34017(Timestamp a34017) {
        this.a34017 = a34017;
    }

    @Basic
    @Column(name = "A34021", nullable = true)
    public Timestamp getA34021() {
        return a34021;
    }

    public void setA34021(Timestamp a34021) {
        this.a34021 = a34021;
    }

    @Basic
    @Column(name = "A34024", nullable = true, length = 4000)
    public String getA34024() {
        return a34024;
    }

    public void setA34024(String a34024) {
        this.a34024 = a34024;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpA34 empA34 = (EmpA34) o;

        if (a34015 != null ? !a34015.equals(empA34.a34015) : empA34.a34015 != null) return false;
        if (a34022 != null ? !a34022.equals(empA34.a34022) : empA34.a34022 != null) return false;
        if (a3402X != null ? !a3402X.equals(empA34.a3402X) : empA34.a3402X != null) return false;
        if (a34006 != null ? !a34006.equals(empA34.a34006) : empA34.a34006 != null) return false;
        if (a34007 != null ? !a34007.equals(empA34.a34007) : empA34.a34007 != null) return false;
        if (a34009 != null ? !a34009.equals(empA34.a34009) : empA34.a34009 != null) return false;
        if (a34001 != null ? !a34001.equals(empA34.a34001) : empA34.a34001 != null) return false;
        if (a34013 != null ? !a34013.equals(empA34.a34013) : empA34.a34013 != null) return false;
        if (a34008 != null ? !a34008.equals(empA34.a34008) : empA34.a34008 != null) return false;
        if (a34002 != null ? !a34002.equals(empA34.a34002) : empA34.a34002 != null) return false;
        if (a34011 != null ? !a34011.equals(empA34.a34011) : empA34.a34011 != null) return false;
        if (a34012 != null ? !a34012.equals(empA34.a34012) : empA34.a34012 != null) return false;
        if (a34003 != null ? !a34003.equals(empA34.a34003) : empA34.a34003 != null) return false;
        if (a34005 != null ? !a34005.equals(empA34.a34005) : empA34.a34005 != null) return false;
        if (a34023 != null ? !a34023.equals(empA34.a34023) : empA34.a34023 != null) return false;
        if (a34025 != null ? !a34025.equals(empA34.a34025) : empA34.a34025 != null) return false;
        if (status != null ? !status.equals(empA34.status) : empA34.status != null) return false;
        if (status2 != null ? !status2.equals(empA34.status2) : empA34.status2 != null) return false;
        if (seqid != null ? !seqid.equals(empA34.seqid) : empA34.seqid != null) return false;
        if (empId != null ? !empId.equals(empA34.empId) : empA34.empId != null) return false;
        if (subId != null ? !subId.equals(empA34.subId) : empA34.subId != null) return false;
        if (lastUpdatedStamp != null ? !lastUpdatedStamp.equals(empA34.lastUpdatedStamp) : empA34.lastUpdatedStamp != null)
            return false;
        if (lastUpdatedTxStamp != null ? !lastUpdatedTxStamp.equals(empA34.lastUpdatedTxStamp) : empA34.lastUpdatedTxStamp != null)
            return false;
        if (createdStamp != null ? !createdStamp.equals(empA34.createdStamp) : empA34.createdStamp != null)
            return false;
        if (createdTxStamp != null ? !createdTxStamp.equals(empA34.createdTxStamp) : empA34.createdTxStamp != null)
            return false;
        if (a34017 != null ? !a34017.equals(empA34.a34017) : empA34.a34017 != null) return false;
        if (a34021 != null ? !a34021.equals(empA34.a34021) : empA34.a34021 != null) return false;
        if (a34024 != null ? !a34024.equals(empA34.a34024) : empA34.a34024 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = a34015 != null ? a34015.hashCode() : 0;
        result = 31 * result + (a34022 != null ? a34022.hashCode() : 0);
        result = 31 * result + (a3402X != null ? a3402X.hashCode() : 0);
        result = 31 * result + (a34006 != null ? a34006.hashCode() : 0);
        result = 31 * result + (a34007 != null ? a34007.hashCode() : 0);
        result = 31 * result + (a34009 != null ? a34009.hashCode() : 0);
        result = 31 * result + (a34001 != null ? a34001.hashCode() : 0);
        result = 31 * result + (a34013 != null ? a34013.hashCode() : 0);
        result = 31 * result + (a34008 != null ? a34008.hashCode() : 0);
        result = 31 * result + (a34002 != null ? a34002.hashCode() : 0);
        result = 31 * result + (a34011 != null ? a34011.hashCode() : 0);
        result = 31 * result + (a34012 != null ? a34012.hashCode() : 0);
        result = 31 * result + (a34003 != null ? a34003.hashCode() : 0);
        result = 31 * result + (a34005 != null ? a34005.hashCode() : 0);
        result = 31 * result + (a34023 != null ? a34023.hashCode() : 0);
        result = 31 * result + (a34025 != null ? a34025.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (status2 != null ? status2.hashCode() : 0);
        result = 31 * result + (seqid != null ? seqid.hashCode() : 0);
        result = 31 * result + (empId != null ? empId.hashCode() : 0);
        result = 31 * result + (subId != null ? subId.hashCode() : 0);
        result = 31 * result + (lastUpdatedStamp != null ? lastUpdatedStamp.hashCode() : 0);
        result = 31 * result + (lastUpdatedTxStamp != null ? lastUpdatedTxStamp.hashCode() : 0);
        result = 31 * result + (createdStamp != null ? createdStamp.hashCode() : 0);
        result = 31 * result + (createdTxStamp != null ? createdTxStamp.hashCode() : 0);
        result = 31 * result + (a34017 != null ? a34017.hashCode() : 0);
        result = 31 * result + (a34021 != null ? a34021.hashCode() : 0);
        result = 31 * result + (a34024 != null ? a34024.hashCode() : 0);
        return result;
    }
}
