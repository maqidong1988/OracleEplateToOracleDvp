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
@Table(name = "EMP_A39", catalog = "")
public class EmpA39 {
    private String id;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String a39002;
    private String a39006;
    private String a39007;
    private String a39010;
    private String a39027;
    private String a39064;
    private String a39011;
    private String a39021;
    private String a39054;
    private String a39071;
    private String a39081;
    private String a39001;
    private Long a39084;
    private String a39009;
    private String a39074;
    private String a39003;
    private String a39061;
    private Long a39077;
    private String a39004;
    private String a39008;
    private String a39067;
    private String status;
    private String status2;
    private Long seqid;
    private String empId;
    private String subId;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private Timestamp a39005;
    private Timestamp a39024;
    private String a39031;
    private String a39037;
    private String a39051;
    private String a39034;
    private String a39087;
    private Timestamp a39027A;

    @Basic
    @Column(name = "A39002", nullable = true, length = 100)
    public String getA39002() {
        return a39002;
    }

    public void setA39002(String a39002) {
        this.a39002 = a39002;
    }

    @Basic
    @Column(name = "A39006", nullable = true, length = 80)
    public String getA39006() {
        return a39006;
    }

    public void setA39006(String a39006) {
        this.a39006 = a39006;
    }

    @Basic
    @Column(name = "A39007", nullable = true, length = 100)
    public String getA39007() {
        return a39007;
    }

    public void setA39007(String a39007) {
        this.a39007 = a39007;
    }

    @Basic
    @Column(name = "A39010", nullable = true, length = 100)
    public String getA39010() {
        return a39010;
    }

    public void setA39010(String a39010) {
        this.a39010 = a39010;
    }

    @Basic
    @Column(name = "A39027", nullable = true, length = 100)
    public String getA39027() {
        return a39027;
    }

    public void setA39027(String a39027) {
        this.a39027 = a39027;
    }

    @Basic
    @Column(name = "A39064", nullable = true, length = 100)
    public String getA39064() {
        return a39064;
    }

    public void setA39064(String a39064) {
        this.a39064 = a39064;
    }

    @Basic
    @Column(name = "A39011", nullable = true, length = 1)
    public String getA39011() {
        return a39011;
    }

    public void setA39011(String a39011) {
        this.a39011 = a39011;
    }

    @Basic
    @Column(name = "A39021", nullable = true, length = 100)
    public String getA39021() {
        return a39021;
    }

    public void setA39021(String a39021) {
        this.a39021 = a39021;
    }

    @Basic
    @Column(name = "A39054", nullable = true, length = 100)
    public String getA39054() {
        return a39054;
    }

    public void setA39054(String a39054) {
        this.a39054 = a39054;
    }

    @Basic
    @Column(name = "A39071", nullable = true, length = 100)
    public String getA39071() {
        return a39071;
    }

    public void setA39071(String a39071) {
        this.a39071 = a39071;
    }

    @Basic
    @Column(name = "A39081", nullable = true, length = 100)
    public String getA39081() {
        return a39081;
    }

    public void setA39081(String a39081) {
        this.a39081 = a39081;
    }

    @Basic
    @Column(name = "A39001", nullable = true, length = 50)
    public String getA39001() {
        return a39001;
    }

    public void setA39001(String a39001) {
        this.a39001 = a39001;
    }

    @Basic
    @Column(name = "A39084", nullable = true, precision = 2)
    public Long getA39084() {
        return a39084;
    }

    public void setA39084(Long a39084) {
        this.a39084 = a39084;
    }

    @Basic
    @Column(name = "A39009", nullable = true, length = 120)
    public String getA39009() {
        return a39009;
    }

    public void setA39009(String a39009) {
        this.a39009 = a39009;
    }

    @Basic
    @Column(name = "A39074", nullable = true, length = 100)
    public String getA39074() {
        return a39074;
    }

    public void setA39074(String a39074) {
        this.a39074 = a39074;
    }

    @Basic
    @Column(name = "A39003", nullable = true, length = 100)
    public String getA39003() {
        return a39003;
    }

    public void setA39003(String a39003) {
        this.a39003 = a39003;
    }

    @Basic
    @Column(name = "A39061", nullable = true, length = 100)
    public String getA39061() {
        return a39061;
    }

    public void setA39061(String a39061) {
        this.a39061 = a39061;
    }

    @Basic
    @Column(name = "A39077", nullable = true, precision = 2)
    public Long getA39077() {
        return a39077;
    }

    public void setA39077(Long a39077) {
        this.a39077 = a39077;
    }

    @Basic
    @Column(name = "A39004", nullable = true, length = 100)
    public String getA39004() {
        return a39004;
    }

    public void setA39004(String a39004) {
        this.a39004 = a39004;
    }

    @Basic
    @Column(name = "A39008", nullable = true, length = 100)
    public String getA39008() {
        return a39008;
    }

    public void setA39008(String a39008) {
        this.a39008 = a39008;
    }

    @Basic
    @Column(name = "A39067", nullable = true, length = 100)
    public String getA39067() {
        return a39067;
    }

    public void setA39067(String a39067) {
        this.a39067 = a39067;
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
    @Column(name = "A39005", nullable = true)
    public Timestamp getA39005() {
        return a39005;
    }

    public void setA39005(Timestamp a39005) {
        this.a39005 = a39005;
    }

    @Basic
    @Column(name = "A39024", nullable = true)
    public Timestamp getA39024() {
        return a39024;
    }

    public void setA39024(Timestamp a39024) {
        this.a39024 = a39024;
    }

    @Basic
    @Column(name = "A39031", nullable = true, length = 4000)
    public String getA39031() {
        return a39031;
    }

    public void setA39031(String a39031) {
        this.a39031 = a39031;
    }

    @Basic
    @Column(name = "A39037", nullable = true, length = 4000)
    public String getA39037() {
        return a39037;
    }

    public void setA39037(String a39037) {
        this.a39037 = a39037;
    }

    @Basic
    @Column(name = "A39051", nullable = true, length = 4000)
    public String getA39051() {
        return a39051;
    }

    public void setA39051(String a39051) {
        this.a39051 = a39051;
    }

    @Basic
    @Column(name = "A39034", nullable = true, length = 4000)
    public String getA39034() {
        return a39034;
    }

    public void setA39034(String a39034) {
        this.a39034 = a39034;
    }

    @Basic
    @Column(name = "A39087", nullable = true, length = 4000)
    public String getA39087() {
        return a39087;
    }

    public void setA39087(String a39087) {
        this.a39087 = a39087;
    }

    @Basic
    @Column(name = "A39027_A", nullable = true)
    public Timestamp getA39027A() {
        return a39027A;
    }

    public void setA39027A(Timestamp a39027A) {
        this.a39027A = a39027A;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpA39 empA39 = (EmpA39) o;

        if (a39002 != null ? !a39002.equals(empA39.a39002) : empA39.a39002 != null) return false;
        if (a39006 != null ? !a39006.equals(empA39.a39006) : empA39.a39006 != null) return false;
        if (a39007 != null ? !a39007.equals(empA39.a39007) : empA39.a39007 != null) return false;
        if (a39010 != null ? !a39010.equals(empA39.a39010) : empA39.a39010 != null) return false;
        if (a39027 != null ? !a39027.equals(empA39.a39027) : empA39.a39027 != null) return false;
        if (a39064 != null ? !a39064.equals(empA39.a39064) : empA39.a39064 != null) return false;
        if (a39011 != null ? !a39011.equals(empA39.a39011) : empA39.a39011 != null) return false;
        if (a39021 != null ? !a39021.equals(empA39.a39021) : empA39.a39021 != null) return false;
        if (a39054 != null ? !a39054.equals(empA39.a39054) : empA39.a39054 != null) return false;
        if (a39071 != null ? !a39071.equals(empA39.a39071) : empA39.a39071 != null) return false;
        if (a39081 != null ? !a39081.equals(empA39.a39081) : empA39.a39081 != null) return false;
        if (a39001 != null ? !a39001.equals(empA39.a39001) : empA39.a39001 != null) return false;
        if (a39084 != null ? !a39084.equals(empA39.a39084) : empA39.a39084 != null) return false;
        if (a39009 != null ? !a39009.equals(empA39.a39009) : empA39.a39009 != null) return false;
        if (a39074 != null ? !a39074.equals(empA39.a39074) : empA39.a39074 != null) return false;
        if (a39003 != null ? !a39003.equals(empA39.a39003) : empA39.a39003 != null) return false;
        if (a39061 != null ? !a39061.equals(empA39.a39061) : empA39.a39061 != null) return false;
        if (a39077 != null ? !a39077.equals(empA39.a39077) : empA39.a39077 != null) return false;
        if (a39004 != null ? !a39004.equals(empA39.a39004) : empA39.a39004 != null) return false;
        if (a39008 != null ? !a39008.equals(empA39.a39008) : empA39.a39008 != null) return false;
        if (a39067 != null ? !a39067.equals(empA39.a39067) : empA39.a39067 != null) return false;
        if (status != null ? !status.equals(empA39.status) : empA39.status != null) return false;
        if (status2 != null ? !status2.equals(empA39.status2) : empA39.status2 != null) return false;
        if (seqid != null ? !seqid.equals(empA39.seqid) : empA39.seqid != null) return false;
        if (empId != null ? !empId.equals(empA39.empId) : empA39.empId != null) return false;
        if (subId != null ? !subId.equals(empA39.subId) : empA39.subId != null) return false;
        if (lastUpdatedStamp != null ? !lastUpdatedStamp.equals(empA39.lastUpdatedStamp) : empA39.lastUpdatedStamp != null)
            return false;
        if (lastUpdatedTxStamp != null ? !lastUpdatedTxStamp.equals(empA39.lastUpdatedTxStamp) : empA39.lastUpdatedTxStamp != null)
            return false;
        if (createdStamp != null ? !createdStamp.equals(empA39.createdStamp) : empA39.createdStamp != null)
            return false;
        if (createdTxStamp != null ? !createdTxStamp.equals(empA39.createdTxStamp) : empA39.createdTxStamp != null)
            return false;
        if (a39005 != null ? !a39005.equals(empA39.a39005) : empA39.a39005 != null) return false;
        if (a39024 != null ? !a39024.equals(empA39.a39024) : empA39.a39024 != null) return false;
        if (a39031 != null ? !a39031.equals(empA39.a39031) : empA39.a39031 != null) return false;
        if (a39037 != null ? !a39037.equals(empA39.a39037) : empA39.a39037 != null) return false;
        if (a39051 != null ? !a39051.equals(empA39.a39051) : empA39.a39051 != null) return false;
        if (a39034 != null ? !a39034.equals(empA39.a39034) : empA39.a39034 != null) return false;
        if (a39087 != null ? !a39087.equals(empA39.a39087) : empA39.a39087 != null) return false;
        if (a39027A != null ? !a39027A.equals(empA39.a39027A) : empA39.a39027A != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = a39002 != null ? a39002.hashCode() : 0;
        result = 31 * result + (a39006 != null ? a39006.hashCode() : 0);
        result = 31 * result + (a39007 != null ? a39007.hashCode() : 0);
        result = 31 * result + (a39010 != null ? a39010.hashCode() : 0);
        result = 31 * result + (a39027 != null ? a39027.hashCode() : 0);
        result = 31 * result + (a39064 != null ? a39064.hashCode() : 0);
        result = 31 * result + (a39011 != null ? a39011.hashCode() : 0);
        result = 31 * result + (a39021 != null ? a39021.hashCode() : 0);
        result = 31 * result + (a39054 != null ? a39054.hashCode() : 0);
        result = 31 * result + (a39071 != null ? a39071.hashCode() : 0);
        result = 31 * result + (a39081 != null ? a39081.hashCode() : 0);
        result = 31 * result + (a39001 != null ? a39001.hashCode() : 0);
        result = 31 * result + (a39084 != null ? a39084.hashCode() : 0);
        result = 31 * result + (a39009 != null ? a39009.hashCode() : 0);
        result = 31 * result + (a39074 != null ? a39074.hashCode() : 0);
        result = 31 * result + (a39003 != null ? a39003.hashCode() : 0);
        result = 31 * result + (a39061 != null ? a39061.hashCode() : 0);
        result = 31 * result + (a39077 != null ? a39077.hashCode() : 0);
        result = 31 * result + (a39004 != null ? a39004.hashCode() : 0);
        result = 31 * result + (a39008 != null ? a39008.hashCode() : 0);
        result = 31 * result + (a39067 != null ? a39067.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (status2 != null ? status2.hashCode() : 0);
        result = 31 * result + (seqid != null ? seqid.hashCode() : 0);
        result = 31 * result + (empId != null ? empId.hashCode() : 0);
        result = 31 * result + (subId != null ? subId.hashCode() : 0);
        result = 31 * result + (lastUpdatedStamp != null ? lastUpdatedStamp.hashCode() : 0);
        result = 31 * result + (lastUpdatedTxStamp != null ? lastUpdatedTxStamp.hashCode() : 0);
        result = 31 * result + (createdStamp != null ? createdStamp.hashCode() : 0);
        result = 31 * result + (createdTxStamp != null ? createdTxStamp.hashCode() : 0);
        result = 31 * result + (a39005 != null ? a39005.hashCode() : 0);
        result = 31 * result + (a39024 != null ? a39024.hashCode() : 0);
        result = 31 * result + (a39031 != null ? a39031.hashCode() : 0);
        result = 31 * result + (a39037 != null ? a39037.hashCode() : 0);
        result = 31 * result + (a39051 != null ? a39051.hashCode() : 0);
        result = 31 * result + (a39034 != null ? a39034.hashCode() : 0);
        result = 31 * result + (a39087 != null ? a39087.hashCode() : 0);
        result = 31 * result + (a39027A != null ? a39027A.hashCode() : 0);
        return result;
    }
}
