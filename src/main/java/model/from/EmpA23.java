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
@Table(name = "EMP_A23", catalog = "")
public class EmpA23 {
    private String id;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private Timestamp a23311;
    private Timestamp a23104;
    private String a23114;
    private String a23204;
    private String a23209;
    private String a23015;
    private String a23101A;
    private String a23101B;
    private Timestamp a23105;
    private String a23107;
    private String a23201;
    private String a23206;
    private String a23207;
    private String a23301A;
    private String a23304;
    private String a23025;
    private String a23301B;
    private Timestamp a23307;
    private String status;
    private String status2;
    private Long seqid;
    private String empId;
    private String subId;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private String a23111;

    @Basic
    @Column(name = "A23311", nullable = true)
    public Timestamp getA23311() {
        return a23311;
    }

    public void setA23311(Timestamp a23311) {
        this.a23311 = a23311;
    }

    @Basic
    @Column(name = "A23104", nullable = true)
    public Timestamp getA23104() {
        return a23104;
    }

    public void setA23104(Timestamp a23104) {
        this.a23104 = a23104;
    }

    @Basic
    @Column(name = "A23114", nullable = true, length = 1)
    public String getA23114() {
        return a23114;
    }

    public void setA23114(String a23114) {
        this.a23114 = a23114;
    }

    @Basic
    @Column(name = "A23204", nullable = true, length = 40)
    public String getA23204() {
        return a23204;
    }

    public void setA23204(String a23204) {
        this.a23204 = a23204;
    }

    @Basic
    @Column(name = "A23209", nullable = true, length = 2)
    public String getA23209() {
        return a23209;
    }

    public void setA23209(String a23209) {
        this.a23209 = a23209;
    }

    @Basic
    @Column(name = "A23015", nullable = true, length = 10)
    public String getA23015() {
        return a23015;
    }

    public void setA23015(String a23015) {
        this.a23015 = a23015;
    }

    @Basic
    @Column(name = "A23101_A", nullable = true, length = 120)
    public String getA23101A() {
        return a23101A;
    }

    public void setA23101A(String a23101A) {
        this.a23101A = a23101A;
    }

    @Basic
    @Column(name = "A23101_B", nullable = true, length = 18)
    public String getA23101B() {
        return a23101B;
    }

    public void setA23101B(String a23101B) {
        this.a23101B = a23101B;
    }

    @Basic
    @Column(name = "A23105", nullable = true)
    public Timestamp getA23105() {
        return a23105;
    }

    public void setA23105(Timestamp a23105) {
        this.a23105 = a23105;
    }

    @Basic
    @Column(name = "A23107", nullable = true, length = 1)
    public String getA23107() {
        return a23107;
    }

    public void setA23107(String a23107) {
        this.a23107 = a23107;
    }

    @Basic
    @Column(name = "A23201", nullable = true, length = 80)
    public String getA23201() {
        return a23201;
    }

    public void setA23201(String a23201) {
        this.a23201 = a23201;
    }

    @Basic
    @Column(name = "A23206", nullable = true, length = 3)
    public String getA23206() {
        return a23206;
    }

    public void setA23206(String a23206) {
        this.a23206 = a23206;
    }

    @Basic
    @Column(name = "A23207", nullable = true, length = 3)
    public String getA23207() {
        return a23207;
    }

    public void setA23207(String a23207) {
        this.a23207 = a23207;
    }

    @Basic
    @Column(name = "A23301_A", nullable = true, length = 120)
    public String getA23301A() {
        return a23301A;
    }

    public void setA23301A(String a23301A) {
        this.a23301A = a23301A;
    }

    @Basic
    @Column(name = "A23304", nullable = true, length = 60)
    public String getA23304() {
        return a23304;
    }

    public void setA23304(String a23304) {
        this.a23304 = a23304;
    }

    @Basic
    @Column(name = "A23025", nullable = true)
    public String getA23025() {
        return a23025;
    }

    public void setA23025(String a23025) {
        this.a23025 = a23025;
    }

    @Basic
    @Column(name = "A23301_B", nullable = true, length = 2)
    public String getA23301B() {
        return a23301B;
    }

    public void setA23301B(String a23301B) {
        this.a23301B = a23301B;
    }

    @Basic
    @Column(name = "A23307", nullable = true)
    public Timestamp getA23307() {
        return a23307;
    }

    public void setA23307(Timestamp a23307) {
        this.a23307 = a23307;
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
    @Column(name = "A23111", nullable = true, length = 4000)
    public String getA23111() {
        return a23111;
    }

    public void setA23111(String a23111) {
        this.a23111 = a23111;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpA23 empA23 = (EmpA23) o;

        if (a23311 != null ? !a23311.equals(empA23.a23311) : empA23.a23311 != null) return false;
        if (a23104 != null ? !a23104.equals(empA23.a23104) : empA23.a23104 != null) return false;
        if (a23114 != null ? !a23114.equals(empA23.a23114) : empA23.a23114 != null) return false;
        if (a23204 != null ? !a23204.equals(empA23.a23204) : empA23.a23204 != null) return false;
        if (a23209 != null ? !a23209.equals(empA23.a23209) : empA23.a23209 != null) return false;
        if (a23015 != null ? !a23015.equals(empA23.a23015) : empA23.a23015 != null) return false;
        if (a23101A != null ? !a23101A.equals(empA23.a23101A) : empA23.a23101A != null) return false;
        if (a23101B != null ? !a23101B.equals(empA23.a23101B) : empA23.a23101B != null) return false;
        if (a23105 != null ? !a23105.equals(empA23.a23105) : empA23.a23105 != null) return false;
        if (a23107 != null ? !a23107.equals(empA23.a23107) : empA23.a23107 != null) return false;
        if (a23201 != null ? !a23201.equals(empA23.a23201) : empA23.a23201 != null) return false;
        if (a23206 != null ? !a23206.equals(empA23.a23206) : empA23.a23206 != null) return false;
        if (a23207 != null ? !a23207.equals(empA23.a23207) : empA23.a23207 != null) return false;
        if (a23301A != null ? !a23301A.equals(empA23.a23301A) : empA23.a23301A != null) return false;
        if (a23304 != null ? !a23304.equals(empA23.a23304) : empA23.a23304 != null) return false;
        if (a23025 != null ? !a23025.equals(empA23.a23025) : empA23.a23025 != null) return false;
        if (a23301B != null ? !a23301B.equals(empA23.a23301B) : empA23.a23301B != null) return false;
        if (a23307 != null ? !a23307.equals(empA23.a23307) : empA23.a23307 != null) return false;
        if (status != null ? !status.equals(empA23.status) : empA23.status != null) return false;
        if (status2 != null ? !status2.equals(empA23.status2) : empA23.status2 != null) return false;
        if (seqid != null ? !seqid.equals(empA23.seqid) : empA23.seqid != null) return false;
        if (empId != null ? !empId.equals(empA23.empId) : empA23.empId != null) return false;
        if (subId != null ? !subId.equals(empA23.subId) : empA23.subId != null) return false;
        if (lastUpdatedStamp != null ? !lastUpdatedStamp.equals(empA23.lastUpdatedStamp) : empA23.lastUpdatedStamp != null)
            return false;
        if (lastUpdatedTxStamp != null ? !lastUpdatedTxStamp.equals(empA23.lastUpdatedTxStamp) : empA23.lastUpdatedTxStamp != null)
            return false;
        if (createdStamp != null ? !createdStamp.equals(empA23.createdStamp) : empA23.createdStamp != null)
            return false;
        if (createdTxStamp != null ? !createdTxStamp.equals(empA23.createdTxStamp) : empA23.createdTxStamp != null)
            return false;
        if (a23111 != null ? !a23111.equals(empA23.a23111) : empA23.a23111 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = a23311 != null ? a23311.hashCode() : 0;
        result = 31 * result + (a23104 != null ? a23104.hashCode() : 0);
        result = 31 * result + (a23114 != null ? a23114.hashCode() : 0);
        result = 31 * result + (a23204 != null ? a23204.hashCode() : 0);
        result = 31 * result + (a23209 != null ? a23209.hashCode() : 0);
        result = 31 * result + (a23015 != null ? a23015.hashCode() : 0);
        result = 31 * result + (a23101A != null ? a23101A.hashCode() : 0);
        result = 31 * result + (a23101B != null ? a23101B.hashCode() : 0);
        result = 31 * result + (a23105 != null ? a23105.hashCode() : 0);
        result = 31 * result + (a23107 != null ? a23107.hashCode() : 0);
        result = 31 * result + (a23201 != null ? a23201.hashCode() : 0);
        result = 31 * result + (a23206 != null ? a23206.hashCode() : 0);
        result = 31 * result + (a23207 != null ? a23207.hashCode() : 0);
        result = 31 * result + (a23301A != null ? a23301A.hashCode() : 0);
        result = 31 * result + (a23304 != null ? a23304.hashCode() : 0);
        result = 31 * result + (a23025 != null ? a23025.hashCode() : 0);
        result = 31 * result + (a23301B != null ? a23301B.hashCode() : 0);
        result = 31 * result + (a23307 != null ? a23307.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (status2 != null ? status2.hashCode() : 0);
        result = 31 * result + (seqid != null ? seqid.hashCode() : 0);
        result = 31 * result + (empId != null ? empId.hashCode() : 0);
        result = 31 * result + (subId != null ? subId.hashCode() : 0);
        result = 31 * result + (lastUpdatedStamp != null ? lastUpdatedStamp.hashCode() : 0);
        result = 31 * result + (lastUpdatedTxStamp != null ? lastUpdatedTxStamp.hashCode() : 0);
        result = 31 * result + (createdStamp != null ? createdStamp.hashCode() : 0);
        result = 31 * result + (createdTxStamp != null ? createdTxStamp.hashCode() : 0);
        result = 31 * result + (a23111 != null ? a23111.hashCode() : 0);
        return result;
    }
}
