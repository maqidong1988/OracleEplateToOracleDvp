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
@Table(name = "EMP_A32", catalog = "")
public class EmpA32 {
    private String id;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String a32012;
    private String a32017;
    private String a32028A;
    private Long a32031;
    private Long a32040;
    private Long a32043;
    private String a32064;
    private String a32010;
    private String a32018;
    private Long a32030;
    private Long a32037;
    private Long a32044;
    private String a32015B;
    private Long a32009;
    private String a32015A;
    private String a32024B;
    private String a32045;
    private Long a32034;
    private Long a32042;
    private Long a32047;
    private Long a32054;
    private String a32061;
    private String a32039;
    private Long a32008;
    private String a32016;
    private String a32028B;
    private String a32035;
    private Long a32041;
    private Long a32051;
    private String a32004A;
    private String a32004B;
    private String a32011;
    private String a32024A;
    private String status;
    private String status2;
    private Long seqid;
    private String empId;
    private String subId;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private Timestamp a32002;
    private Timestamp a32001;
    private Timestamp a32005;
    private Timestamp a32006;
    private Timestamp a32003;
    private Timestamp a32007;
    private String a32057;

    @Basic
    @Column(name = "A32012", nullable = true, length = 100)
    public String getA32012() {
        return a32012;
    }

    public void setA32012(String a32012) {
        this.a32012 = a32012;
    }

    @Basic
    @Column(name = "A32017", nullable = true, length = 24)
    public String getA32017() {
        return a32017;
    }

    public void setA32017(String a32017) {
        this.a32017 = a32017;
    }

    @Basic
    @Column(name = "A32028_A", nullable = true, length = 20)
    public String getA32028A() {
        return a32028A;
    }

    public void setA32028A(String a32028A) {
        this.a32028A = a32028A;
    }

    @Basic
    @Column(name = "A32031", nullable = true, precision = 2)
    public Long getA32031() {
        return a32031;
    }

    public void setA32031(Long a32031) {
        this.a32031 = a32031;
    }

    @Basic
    @Column(name = "A32040", nullable = true, precision = 2)
    public Long getA32040() {
        return a32040;
    }

    public void setA32040(Long a32040) {
        this.a32040 = a32040;
    }

    @Basic
    @Column(name = "A32043", nullable = true, precision = 2)
    public Long getA32043() {
        return a32043;
    }

    public void setA32043(Long a32043) {
        this.a32043 = a32043;
    }

    @Basic
    @Column(name = "A32064", nullable = true, length = 100)
    public String getA32064() {
        return a32064;
    }

    public void setA32064(String a32064) {
        this.a32064 = a32064;
    }

    @Basic
    @Column(name = "A32010", nullable = true, length = 100)
    public String getA32010() {
        return a32010;
    }

    public void setA32010(String a32010) {
        this.a32010 = a32010;
    }

    @Basic
    @Column(name = "A32018", nullable = true, length = 120)
    public String getA32018() {
        return a32018;
    }

    public void setA32018(String a32018) {
        this.a32018 = a32018;
    }

    @Basic
    @Column(name = "A32030", nullable = true, precision = 2)
    public Long getA32030() {
        return a32030;
    }

    public void setA32030(Long a32030) {
        this.a32030 = a32030;
    }

    @Basic
    @Column(name = "A32037", nullable = true, precision = 2)
    public Long getA32037() {
        return a32037;
    }

    public void setA32037(Long a32037) {
        this.a32037 = a32037;
    }

    @Basic
    @Column(name = "A32044", nullable = true, precision = 2)
    public Long getA32044() {
        return a32044;
    }

    public void setA32044(Long a32044) {
        this.a32044 = a32044;
    }

    @Basic
    @Column(name = "A32015_B", nullable = true, length = 100)
    public String getA32015B() {
        return a32015B;
    }

    public void setA32015B(String a32015B) {
        this.a32015B = a32015B;
    }

    @Basic
    @Column(name = "A32009", nullable = true, precision = 2)
    public Long getA32009() {
        return a32009;
    }

    public void setA32009(Long a32009) {
        this.a32009 = a32009;
    }

    @Basic
    @Column(name = "A32015_A", nullable = true, length = 120)
    public String getA32015A() {
        return a32015A;
    }

    public void setA32015A(String a32015A) {
        this.a32015A = a32015A;
    }

    @Basic
    @Column(name = "A32024_B", nullable = true, length = 100)
    public String getA32024B() {
        return a32024B;
    }

    public void setA32024B(String a32024B) {
        this.a32024B = a32024B;
    }

    @Basic
    @Column(name = "A32045", nullable = true, length = 100)
    public String getA32045() {
        return a32045;
    }

    public void setA32045(String a32045) {
        this.a32045 = a32045;
    }

    @Basic
    @Column(name = "A32034", nullable = true, precision = 2)
    public Long getA32034() {
        return a32034;
    }

    public void setA32034(Long a32034) {
        this.a32034 = a32034;
    }

    @Basic
    @Column(name = "A32042", nullable = true, precision = 2)
    public Long getA32042() {
        return a32042;
    }

    public void setA32042(Long a32042) {
        this.a32042 = a32042;
    }

    @Basic
    @Column(name = "A32047", nullable = true, precision = 2)
    public Long getA32047() {
        return a32047;
    }

    public void setA32047(Long a32047) {
        this.a32047 = a32047;
    }

    @Basic
    @Column(name = "A32054", nullable = true, precision = 2)
    public Long getA32054() {
        return a32054;
    }

    public void setA32054(Long a32054) {
        this.a32054 = a32054;
    }

    @Basic
    @Column(name = "A32061", nullable = true, length = 120)
    public String getA32061() {
        return a32061;
    }

    public void setA32061(String a32061) {
        this.a32061 = a32061;
    }

    @Basic
    @Column(name = "A32039", nullable = true, length = 100)
    public String getA32039() {
        return a32039;
    }

    public void setA32039(String a32039) {
        this.a32039 = a32039;
    }

    @Basic
    @Column(name = "A32008", nullable = true, precision = 2)
    public Long getA32008() {
        return a32008;
    }

    public void setA32008(Long a32008) {
        this.a32008 = a32008;
    }

    @Basic
    @Column(name = "A32016", nullable = true, length = 120)
    public String getA32016() {
        return a32016;
    }

    public void setA32016(String a32016) {
        this.a32016 = a32016;
    }

    @Basic
    @Column(name = "A32028_B", nullable = true, length = 3)
    public String getA32028B() {
        return a32028B;
    }

    public void setA32028B(String a32028B) {
        this.a32028B = a32028B;
    }

    @Basic
    @Column(name = "A32035", nullable = true, length = 100)
    public String getA32035() {
        return a32035;
    }

    public void setA32035(String a32035) {
        this.a32035 = a32035;
    }

    @Basic
    @Column(name = "A32041", nullable = true, precision = 2)
    public Long getA32041() {
        return a32041;
    }

    public void setA32041(Long a32041) {
        this.a32041 = a32041;
    }

    @Basic
    @Column(name = "A32051", nullable = true, precision = 2)
    public Long getA32051() {
        return a32051;
    }

    public void setA32051(Long a32051) {
        this.a32051 = a32051;
    }

    @Basic
    @Column(name = "A32004_A", nullable = true, length = 120)
    public String getA32004A() {
        return a32004A;
    }

    public void setA32004A(String a32004A) {
        this.a32004A = a32004A;
    }

    @Basic
    @Column(name = "A32004_B", nullable = true, length = 18)
    public String getA32004B() {
        return a32004B;
    }

    public void setA32004B(String a32004B) {
        this.a32004B = a32004B;
    }

    @Basic
    @Column(name = "A32011", nullable = true, length = 48)
    public String getA32011() {
        return a32011;
    }

    public void setA32011(String a32011) {
        this.a32011 = a32011;
    }

    @Basic
    @Column(name = "A32024_A", nullable = true, length = 120)
    public String getA32024A() {
        return a32024A;
    }

    public void setA32024A(String a32024A) {
        this.a32024A = a32024A;
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
    @Column(name = "A32002", nullable = true)
    public Timestamp getA32002() {
        return a32002;
    }

    public void setA32002(Timestamp a32002) {
        this.a32002 = a32002;
    }

    @Basic
    @Column(name = "A32001", nullable = true)
    public Timestamp getA32001() {
        return a32001;
    }

    public void setA32001(Timestamp a32001) {
        this.a32001 = a32001;
    }

    @Basic
    @Column(name = "A32005", nullable = true)
    public Timestamp getA32005() {
        return a32005;
    }

    public void setA32005(Timestamp a32005) {
        this.a32005 = a32005;
    }

    @Basic
    @Column(name = "A32006", nullable = true)
    public Timestamp getA32006() {
        return a32006;
    }

    public void setA32006(Timestamp a32006) {
        this.a32006 = a32006;
    }

    @Basic
    @Column(name = "A32003", nullable = true)
    public Timestamp getA32003() {
        return a32003;
    }

    public void setA32003(Timestamp a32003) {
        this.a32003 = a32003;
    }

    @Basic
    @Column(name = "A32007", nullable = true)
    public Timestamp getA32007() {
        return a32007;
    }

    public void setA32007(Timestamp a32007) {
        this.a32007 = a32007;
    }

    @Basic
    @Column(name = "A32057", nullable = true, length = 4000)
    public String getA32057() {
        return a32057;
    }

    public void setA32057(String a32057) {
        this.a32057 = a32057;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpA32 empA32 = (EmpA32) o;

        if (a32012 != null ? !a32012.equals(empA32.a32012) : empA32.a32012 != null) return false;
        if (a32017 != null ? !a32017.equals(empA32.a32017) : empA32.a32017 != null) return false;
        if (a32028A != null ? !a32028A.equals(empA32.a32028A) : empA32.a32028A != null) return false;
        if (a32031 != null ? !a32031.equals(empA32.a32031) : empA32.a32031 != null) return false;
        if (a32040 != null ? !a32040.equals(empA32.a32040) : empA32.a32040 != null) return false;
        if (a32043 != null ? !a32043.equals(empA32.a32043) : empA32.a32043 != null) return false;
        if (a32064 != null ? !a32064.equals(empA32.a32064) : empA32.a32064 != null) return false;
        if (a32010 != null ? !a32010.equals(empA32.a32010) : empA32.a32010 != null) return false;
        if (a32018 != null ? !a32018.equals(empA32.a32018) : empA32.a32018 != null) return false;
        if (a32030 != null ? !a32030.equals(empA32.a32030) : empA32.a32030 != null) return false;
        if (a32037 != null ? !a32037.equals(empA32.a32037) : empA32.a32037 != null) return false;
        if (a32044 != null ? !a32044.equals(empA32.a32044) : empA32.a32044 != null) return false;
        if (a32015B != null ? !a32015B.equals(empA32.a32015B) : empA32.a32015B != null) return false;
        if (a32009 != null ? !a32009.equals(empA32.a32009) : empA32.a32009 != null) return false;
        if (a32015A != null ? !a32015A.equals(empA32.a32015A) : empA32.a32015A != null) return false;
        if (a32024B != null ? !a32024B.equals(empA32.a32024B) : empA32.a32024B != null) return false;
        if (a32045 != null ? !a32045.equals(empA32.a32045) : empA32.a32045 != null) return false;
        if (a32034 != null ? !a32034.equals(empA32.a32034) : empA32.a32034 != null) return false;
        if (a32042 != null ? !a32042.equals(empA32.a32042) : empA32.a32042 != null) return false;
        if (a32047 != null ? !a32047.equals(empA32.a32047) : empA32.a32047 != null) return false;
        if (a32054 != null ? !a32054.equals(empA32.a32054) : empA32.a32054 != null) return false;
        if (a32061 != null ? !a32061.equals(empA32.a32061) : empA32.a32061 != null) return false;
        if (a32039 != null ? !a32039.equals(empA32.a32039) : empA32.a32039 != null) return false;
        if (a32008 != null ? !a32008.equals(empA32.a32008) : empA32.a32008 != null) return false;
        if (a32016 != null ? !a32016.equals(empA32.a32016) : empA32.a32016 != null) return false;
        if (a32028B != null ? !a32028B.equals(empA32.a32028B) : empA32.a32028B != null) return false;
        if (a32035 != null ? !a32035.equals(empA32.a32035) : empA32.a32035 != null) return false;
        if (a32041 != null ? !a32041.equals(empA32.a32041) : empA32.a32041 != null) return false;
        if (a32051 != null ? !a32051.equals(empA32.a32051) : empA32.a32051 != null) return false;
        if (a32004A != null ? !a32004A.equals(empA32.a32004A) : empA32.a32004A != null) return false;
        if (a32004B != null ? !a32004B.equals(empA32.a32004B) : empA32.a32004B != null) return false;
        if (a32011 != null ? !a32011.equals(empA32.a32011) : empA32.a32011 != null) return false;
        if (a32024A != null ? !a32024A.equals(empA32.a32024A) : empA32.a32024A != null) return false;
        if (status != null ? !status.equals(empA32.status) : empA32.status != null) return false;
        if (status2 != null ? !status2.equals(empA32.status2) : empA32.status2 != null) return false;
        if (seqid != null ? !seqid.equals(empA32.seqid) : empA32.seqid != null) return false;
        if (empId != null ? !empId.equals(empA32.empId) : empA32.empId != null) return false;
        if (subId != null ? !subId.equals(empA32.subId) : empA32.subId != null) return false;
        if (lastUpdatedStamp != null ? !lastUpdatedStamp.equals(empA32.lastUpdatedStamp) : empA32.lastUpdatedStamp != null)
            return false;
        if (lastUpdatedTxStamp != null ? !lastUpdatedTxStamp.equals(empA32.lastUpdatedTxStamp) : empA32.lastUpdatedTxStamp != null)
            return false;
        if (createdStamp != null ? !createdStamp.equals(empA32.createdStamp) : empA32.createdStamp != null)
            return false;
        if (createdTxStamp != null ? !createdTxStamp.equals(empA32.createdTxStamp) : empA32.createdTxStamp != null)
            return false;
        if (a32002 != null ? !a32002.equals(empA32.a32002) : empA32.a32002 != null) return false;
        if (a32001 != null ? !a32001.equals(empA32.a32001) : empA32.a32001 != null) return false;
        if (a32005 != null ? !a32005.equals(empA32.a32005) : empA32.a32005 != null) return false;
        if (a32006 != null ? !a32006.equals(empA32.a32006) : empA32.a32006 != null) return false;
        if (a32003 != null ? !a32003.equals(empA32.a32003) : empA32.a32003 != null) return false;
        if (a32007 != null ? !a32007.equals(empA32.a32007) : empA32.a32007 != null) return false;
        if (a32057 != null ? !a32057.equals(empA32.a32057) : empA32.a32057 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = a32012 != null ? a32012.hashCode() : 0;
        result = 31 * result + (a32017 != null ? a32017.hashCode() : 0);
        result = 31 * result + (a32028A != null ? a32028A.hashCode() : 0);
        result = 31 * result + (a32031 != null ? a32031.hashCode() : 0);
        result = 31 * result + (a32040 != null ? a32040.hashCode() : 0);
        result = 31 * result + (a32043 != null ? a32043.hashCode() : 0);
        result = 31 * result + (a32064 != null ? a32064.hashCode() : 0);
        result = 31 * result + (a32010 != null ? a32010.hashCode() : 0);
        result = 31 * result + (a32018 != null ? a32018.hashCode() : 0);
        result = 31 * result + (a32030 != null ? a32030.hashCode() : 0);
        result = 31 * result + (a32037 != null ? a32037.hashCode() : 0);
        result = 31 * result + (a32044 != null ? a32044.hashCode() : 0);
        result = 31 * result + (a32015B != null ? a32015B.hashCode() : 0);
        result = 31 * result + (a32009 != null ? a32009.hashCode() : 0);
        result = 31 * result + (a32015A != null ? a32015A.hashCode() : 0);
        result = 31 * result + (a32024B != null ? a32024B.hashCode() : 0);
        result = 31 * result + (a32045 != null ? a32045.hashCode() : 0);
        result = 31 * result + (a32034 != null ? a32034.hashCode() : 0);
        result = 31 * result + (a32042 != null ? a32042.hashCode() : 0);
        result = 31 * result + (a32047 != null ? a32047.hashCode() : 0);
        result = 31 * result + (a32054 != null ? a32054.hashCode() : 0);
        result = 31 * result + (a32061 != null ? a32061.hashCode() : 0);
        result = 31 * result + (a32039 != null ? a32039.hashCode() : 0);
        result = 31 * result + (a32008 != null ? a32008.hashCode() : 0);
        result = 31 * result + (a32016 != null ? a32016.hashCode() : 0);
        result = 31 * result + (a32028B != null ? a32028B.hashCode() : 0);
        result = 31 * result + (a32035 != null ? a32035.hashCode() : 0);
        result = 31 * result + (a32041 != null ? a32041.hashCode() : 0);
        result = 31 * result + (a32051 != null ? a32051.hashCode() : 0);
        result = 31 * result + (a32004A != null ? a32004A.hashCode() : 0);
        result = 31 * result + (a32004B != null ? a32004B.hashCode() : 0);
        result = 31 * result + (a32011 != null ? a32011.hashCode() : 0);
        result = 31 * result + (a32024A != null ? a32024A.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (status2 != null ? status2.hashCode() : 0);
        result = 31 * result + (seqid != null ? seqid.hashCode() : 0);
        result = 31 * result + (empId != null ? empId.hashCode() : 0);
        result = 31 * result + (subId != null ? subId.hashCode() : 0);
        result = 31 * result + (lastUpdatedStamp != null ? lastUpdatedStamp.hashCode() : 0);
        result = 31 * result + (lastUpdatedTxStamp != null ? lastUpdatedTxStamp.hashCode() : 0);
        result = 31 * result + (createdStamp != null ? createdStamp.hashCode() : 0);
        result = 31 * result + (createdTxStamp != null ? createdTxStamp.hashCode() : 0);
        result = 31 * result + (a32002 != null ? a32002.hashCode() : 0);
        result = 31 * result + (a32001 != null ? a32001.hashCode() : 0);
        result = 31 * result + (a32005 != null ? a32005.hashCode() : 0);
        result = 31 * result + (a32006 != null ? a32006.hashCode() : 0);
        result = 31 * result + (a32003 != null ? a32003.hashCode() : 0);
        result = 31 * result + (a32007 != null ? a32007.hashCode() : 0);
        result = 31 * result + (a32057 != null ? a32057.hashCode() : 0);
        return result;
    }
}
