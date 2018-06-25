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
@Table(name = "EMP_A03", catalog = "")
public class EmpA03 {
    private String id;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String a03004;
    private String a03010;
    private Long a03024;
    private String a03031;
    private Long a03095;
    private Long a03027;
    private String a03008;
    private String a03011;
    private Long a03014;
    private Long a03021;
    private Long a03099;
    private String a03005;
    private String a03009;
    private Long a03017;
    private String a03035;
    private String a03080;
    private String status;
    private String status2;
    private Long seqid;
    private String empId;
    private String subId;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private Timestamp a03053;
    private Timestamp a03065;
    private Timestamp a03033;
    private Timestamp a03006;

    @Basic
    @Column(name = "A03004", nullable = true, length = 100)
    public String getA03004() {
        return a03004;
    }

    public void setA03004(String a03004) {
        this.a03004 = a03004;
    }

    @Basic
    @Column(name = "A03010", nullable = true, length = 100)
    public String getA03010() {
        return a03010;
    }

    public void setA03010(String a03010) {
        this.a03010 = a03010;
    }

    @Basic
    @Column(name = "A03024", nullable = true, precision = 2)
    public Long getA03024() {
        return a03024;
    }

    public void setA03024(Long a03024) {
        this.a03024 = a03024;
    }

    @Basic
    @Column(name = "A03031", nullable = true, length = 120)
    public String getA03031() {
        return a03031;
    }

    public void setA03031(String a03031) {
        this.a03031 = a03031;
    }

    @Basic
    @Column(name = "A03095", nullable = true, precision = 2)
    public Long getA03095() {
        return a03095;
    }

    public void setA03095(Long a03095) {
        this.a03095 = a03095;
    }

    @Basic
    @Column(name = "A03027", nullable = true, precision = 2)
    public Long getA03027() {
        return a03027;
    }

    public void setA03027(Long a03027) {
        this.a03027 = a03027;
    }

    @Basic
    @Column(name = "A03008", nullable = true, length = 100)
    public String getA03008() {
        return a03008;
    }

    public void setA03008(String a03008) {
        this.a03008 = a03008;
    }

    @Basic
    @Column(name = "A03011", nullable = true, length = 50)
    public String getA03011() {
        return a03011;
    }

    public void setA03011(String a03011) {
        this.a03011 = a03011;
    }

    @Basic
    @Column(name = "A03014", nullable = true, precision = 2)
    public Long getA03014() {
        return a03014;
    }

    public void setA03014(Long a03014) {
        this.a03014 = a03014;
    }

    @Basic
    @Column(name = "A03021", nullable = true, precision = 2)
    public Long getA03021() {
        return a03021;
    }

    public void setA03021(Long a03021) {
        this.a03021 = a03021;
    }

    @Basic
    @Column(name = "A03099", nullable = true, precision = 2)
    public Long getA03099() {
        return a03099;
    }

    public void setA03099(Long a03099) {
        this.a03099 = a03099;
    }

    @Basic
    @Column(name = "A03005", nullable = true, length = 100)
    public String getA03005() {
        return a03005;
    }

    public void setA03005(String a03005) {
        this.a03005 = a03005;
    }

    @Basic
    @Column(name = "A03009", nullable = true, length = 100)
    public String getA03009() {
        return a03009;
    }

    public void setA03009(String a03009) {
        this.a03009 = a03009;
    }

    @Basic
    @Column(name = "A03017", nullable = true, precision = 2)
    public Long getA03017() {
        return a03017;
    }

    public void setA03017(Long a03017) {
        this.a03017 = a03017;
    }

    @Basic
    @Column(name = "A03035", nullable = true, length = 120)
    public String getA03035() {
        return a03035;
    }

    public void setA03035(String a03035) {
        this.a03035 = a03035;
    }

    @Basic
    @Column(name = "A03080", nullable = true, length = 100)
    public String getA03080() {
        return a03080;
    }

    public void setA03080(String a03080) {
        this.a03080 = a03080;
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
    @Column(name = "A03053", nullable = true)
    public Timestamp getA03053() {
        return a03053;
    }

    public void setA03053(Timestamp a03053) {
        this.a03053 = a03053;
    }

    @Basic
    @Column(name = "A03065", nullable = true)
    public Timestamp getA03065() {
        return a03065;
    }

    public void setA03065(Timestamp a03065) {
        this.a03065 = a03065;
    }

    @Basic
    @Column(name = "A03033", nullable = true)
    public Timestamp getA03033() {
        return a03033;
    }

    public void setA03033(Timestamp a03033) {
        this.a03033 = a03033;
    }

    @Basic
    @Column(name = "A03006", nullable = true)
    public Timestamp getA03006() {
        return a03006;
    }

    public void setA03006(Timestamp a03006) {
        this.a03006 = a03006;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpA03 empA03 = (EmpA03) o;

        if (a03004 != null ? !a03004.equals(empA03.a03004) : empA03.a03004 != null) return false;
        if (a03010 != null ? !a03010.equals(empA03.a03010) : empA03.a03010 != null) return false;
        if (a03024 != null ? !a03024.equals(empA03.a03024) : empA03.a03024 != null) return false;
        if (a03031 != null ? !a03031.equals(empA03.a03031) : empA03.a03031 != null) return false;
        if (a03095 != null ? !a03095.equals(empA03.a03095) : empA03.a03095 != null) return false;
        if (a03027 != null ? !a03027.equals(empA03.a03027) : empA03.a03027 != null) return false;
        if (a03008 != null ? !a03008.equals(empA03.a03008) : empA03.a03008 != null) return false;
        if (a03011 != null ? !a03011.equals(empA03.a03011) : empA03.a03011 != null) return false;
        if (a03014 != null ? !a03014.equals(empA03.a03014) : empA03.a03014 != null) return false;
        if (a03021 != null ? !a03021.equals(empA03.a03021) : empA03.a03021 != null) return false;
        if (a03099 != null ? !a03099.equals(empA03.a03099) : empA03.a03099 != null) return false;
        if (a03005 != null ? !a03005.equals(empA03.a03005) : empA03.a03005 != null) return false;
        if (a03009 != null ? !a03009.equals(empA03.a03009) : empA03.a03009 != null) return false;
        if (a03017 != null ? !a03017.equals(empA03.a03017) : empA03.a03017 != null) return false;
        if (a03035 != null ? !a03035.equals(empA03.a03035) : empA03.a03035 != null) return false;
        if (a03080 != null ? !a03080.equals(empA03.a03080) : empA03.a03080 != null) return false;
        if (status != null ? !status.equals(empA03.status) : empA03.status != null) return false;
        if (status2 != null ? !status2.equals(empA03.status2) : empA03.status2 != null) return false;
        if (seqid != null ? !seqid.equals(empA03.seqid) : empA03.seqid != null) return false;
        if (empId != null ? !empId.equals(empA03.empId) : empA03.empId != null) return false;
        if (subId != null ? !subId.equals(empA03.subId) : empA03.subId != null) return false;
        if (lastUpdatedStamp != null ? !lastUpdatedStamp.equals(empA03.lastUpdatedStamp) : empA03.lastUpdatedStamp != null)
            return false;
        if (lastUpdatedTxStamp != null ? !lastUpdatedTxStamp.equals(empA03.lastUpdatedTxStamp) : empA03.lastUpdatedTxStamp != null)
            return false;
        if (createdStamp != null ? !createdStamp.equals(empA03.createdStamp) : empA03.createdStamp != null)
            return false;
        if (createdTxStamp != null ? !createdTxStamp.equals(empA03.createdTxStamp) : empA03.createdTxStamp != null)
            return false;
        if (a03053 != null ? !a03053.equals(empA03.a03053) : empA03.a03053 != null) return false;
        if (a03065 != null ? !a03065.equals(empA03.a03065) : empA03.a03065 != null) return false;
        if (a03033 != null ? !a03033.equals(empA03.a03033) : empA03.a03033 != null) return false;
        if (a03006 != null ? !a03006.equals(empA03.a03006) : empA03.a03006 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = a03004 != null ? a03004.hashCode() : 0;
        result = 31 * result + (a03010 != null ? a03010.hashCode() : 0);
        result = 31 * result + (a03024 != null ? a03024.hashCode() : 0);
        result = 31 * result + (a03031 != null ? a03031.hashCode() : 0);
        result = 31 * result + (a03095 != null ? a03095.hashCode() : 0);
        result = 31 * result + (a03027 != null ? a03027.hashCode() : 0);
        result = 31 * result + (a03008 != null ? a03008.hashCode() : 0);
        result = 31 * result + (a03011 != null ? a03011.hashCode() : 0);
        result = 31 * result + (a03014 != null ? a03014.hashCode() : 0);
        result = 31 * result + (a03021 != null ? a03021.hashCode() : 0);
        result = 31 * result + (a03099 != null ? a03099.hashCode() : 0);
        result = 31 * result + (a03005 != null ? a03005.hashCode() : 0);
        result = 31 * result + (a03009 != null ? a03009.hashCode() : 0);
        result = 31 * result + (a03017 != null ? a03017.hashCode() : 0);
        result = 31 * result + (a03035 != null ? a03035.hashCode() : 0);
        result = 31 * result + (a03080 != null ? a03080.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (status2 != null ? status2.hashCode() : 0);
        result = 31 * result + (seqid != null ? seqid.hashCode() : 0);
        result = 31 * result + (empId != null ? empId.hashCode() : 0);
        result = 31 * result + (subId != null ? subId.hashCode() : 0);
        result = 31 * result + (lastUpdatedStamp != null ? lastUpdatedStamp.hashCode() : 0);
        result = 31 * result + (lastUpdatedTxStamp != null ? lastUpdatedTxStamp.hashCode() : 0);
        result = 31 * result + (createdStamp != null ? createdStamp.hashCode() : 0);
        result = 31 * result + (createdTxStamp != null ? createdTxStamp.hashCode() : 0);
        result = 31 * result + (a03053 != null ? a03053.hashCode() : 0);
        result = 31 * result + (a03065 != null ? a03065.hashCode() : 0);
        result = 31 * result + (a03033 != null ? a03033.hashCode() : 0);
        result = 31 * result + (a03006 != null ? a03006.hashCode() : 0);
        return result;
    }
}
