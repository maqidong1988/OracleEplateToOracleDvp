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
@Table(name = "EMP_A14", catalog = "")
public class EmpA14 {
    private String a14311A;
    private String a14201;
    private String a14202;
    private String a14208B;
    private String a14221;
    private String a14314;
    private String a14205B;
    private String a14217;
    private String a14305A;
    private String a14317;
    private String a14351;
    private String a14330;
    private String a14214A;
    private String a14214B;
    private String a14305B;
    private String a14205A;
    private String a14220;
    private String a14230;
    private String a14231;
    private String a14302;
    private String a14311B;
    private String status;
    private String status2;
    private Long seqid;
    private String empId;
    private String subId;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private Timestamp a14307;
    private Timestamp a14227;
    private Timestamp a14225;
    private Timestamp a14324;
    private String a14224;
    private String a14001;
    private String a14321;

    @Basic
    @Column(name = "A14311_A", nullable = true, length = 120)
    public String getA14311A() {
        return a14311A;
    }

    public void setA14311A(String a14311A) {
        this.a14311A = a14311A;
    }

    @Basic
    @Column(name = "A14201", nullable = true, length = 100)
    public String getA14201() {
        return a14201;
    }

    public void setA14201(String a14201) {
        this.a14201 = a14201;
    }

    @Basic
    @Column(name = "A14202", nullable = true, length = 100)
    public String getA14202() {
        return a14202;
    }

    public void setA14202(String a14202) {
        this.a14202 = a14202;
    }

    @Basic
    @Column(name = "A14208_B", nullable = true, length = 30)
    public String getA14208B() {
        return a14208B;
    }

    public void setA14208B(String a14208B) {
        this.a14208B = a14208B;
    }

    @Basic
    @Column(name = "A14221", nullable = true, length = 100)
    public String getA14221() {
        return a14221;
    }

    public void setA14221(String a14221) {
        this.a14221 = a14221;
    }

    @Basic
    @Column(name = "A14314", nullable = true, length = 100)
    public String getA14314() {
        return a14314;
    }

    public void setA14314(String a14314) {
        this.a14314 = a14314;
    }

    @Basic
    @Column(name = "A14205_B", nullable = true, length = 4)
    public String getA14205B() {
        return a14205B;
    }

    public void setA14205B(String a14205B) {
        this.a14205B = a14205B;
    }

    @Basic
    @Column(name = "A14217", nullable = true, length = 100)
    public String getA14217() {
        return a14217;
    }

    public void setA14217(String a14217) {
        this.a14217 = a14217;
    }

    @Basic
    @Column(name = "A14305_A", nullable = true, length = 200)
    public String getA14305A() {
        return a14305A;
    }

    public void setA14305A(String a14305A) {
        this.a14305A = a14305A;
    }

    @Basic
    @Column(name = "A14317", nullable = true, length = 100)
    public String getA14317() {
        return a14317;
    }

    public void setA14317(String a14317) {
        this.a14317 = a14317;
    }

    @Basic
    @Column(name = "A14351", nullable = true, length = 100)
    public String getA14351() {
        return a14351;
    }

    public void setA14351(String a14351) {
        this.a14351 = a14351;
    }

    @Basic
    @Column(name = "A14330", nullable = true, length = 100)
    public String getA14330() {
        return a14330;
    }

    public void setA14330(String a14330) {
        this.a14330 = a14330;
    }

    @Basic
    @Column(name = "A14214_A", nullable = true, length = 500)
    public String getA14214A() {
        return a14214A;
    }

    public void setA14214A(String a14214A) {
        this.a14214A = a14214A;
    }

    @Basic
    @Column(name = "A14214_B", nullable = true, length = 70)
    public String getA14214B() {
        return a14214B;
    }

    public void setA14214B(String a14214B) {
        this.a14214B = a14214B;
    }

    @Basic
    @Column(name = "A14305_B", nullable = true, length = 2)
    public String getA14305B() {
        return a14305B;
    }

    public void setA14305B(String a14305B) {
        this.a14305B = a14305B;
    }

    @Basic
    @Column(name = "A14205_A", nullable = true, length = 100)
    public String getA14205A() {
        return a14205A;
    }

    public void setA14205A(String a14205A) {
        this.a14205A = a14205A;
    }

    @Basic
    @Column(name = "A14220", nullable = true, length = 500)
    public String getA14220() {
        return a14220;
    }

    public void setA14220(String a14220) {
        this.a14220 = a14220;
    }

    @Basic
    @Column(name = "A14230", nullable = true, length = 120)
    public String getA14230() {
        return a14230;
    }

    public void setA14230(String a14230) {
        this.a14230 = a14230;
    }

    @Basic
    @Column(name = "A14231", nullable = true, length = 100)
    public String getA14231() {
        return a14231;
    }

    public void setA14231(String a14231) {
        this.a14231 = a14231;
    }

    @Basic
    @Column(name = "A14302", nullable = true, length = 100)
    public String getA14302() {
        return a14302;
    }

    public void setA14302(String a14302) {
        this.a14302 = a14302;
    }

    @Basic
    @Column(name = "A14311_B", nullable = true, length = 18)
    public String getA14311B() {
        return a14311B;
    }

    public void setA14311B(String a14311B) {
        this.a14311B = a14311B;
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
    @Column(name = "A14307", nullable = true)
    public Timestamp getA14307() {
        return a14307;
    }

    public void setA14307(Timestamp a14307) {
        this.a14307 = a14307;
    }

    @Basic
    @Column(name = "A14227", nullable = true)
    public Timestamp getA14227() {
        return a14227;
    }

    public void setA14227(Timestamp a14227) {
        this.a14227 = a14227;
    }

    @Basic
    @Column(name = "A14225", nullable = true)
    public Timestamp getA14225() {
        return a14225;
    }

    public void setA14225(Timestamp a14225) {
        this.a14225 = a14225;
    }

    @Basic
    @Column(name = "A14324", nullable = true)
    public Timestamp getA14324() {
        return a14324;
    }

    public void setA14324(Timestamp a14324) {
        this.a14324 = a14324;
    }

    @Basic
    @Column(name = "A14224", nullable = true, length = 4000)
    public String getA14224() {
        return a14224;
    }

    public void setA14224(String a14224) {
        this.a14224 = a14224;
    }

    @Basic
    @Column(name = "A14001", nullable = true, length = 4000)
    public String getA14001() {
        return a14001;
    }

    public void setA14001(String a14001) {
        this.a14001 = a14001;
    }

    @Basic
    @Column(name = "A14321", nullable = true, length = 4000)
    public String getA14321() {
        return a14321;
    }

    public void setA14321(String a14321) {
        this.a14321 = a14321;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpA14 empA14 = (EmpA14) o;

        if (a14311A != null ? !a14311A.equals(empA14.a14311A) : empA14.a14311A != null) return false;
        if (a14201 != null ? !a14201.equals(empA14.a14201) : empA14.a14201 != null) return false;
        if (a14202 != null ? !a14202.equals(empA14.a14202) : empA14.a14202 != null) return false;
        if (a14208B != null ? !a14208B.equals(empA14.a14208B) : empA14.a14208B != null) return false;
        if (a14221 != null ? !a14221.equals(empA14.a14221) : empA14.a14221 != null) return false;
        if (a14314 != null ? !a14314.equals(empA14.a14314) : empA14.a14314 != null) return false;
        if (a14205B != null ? !a14205B.equals(empA14.a14205B) : empA14.a14205B != null) return false;
        if (a14217 != null ? !a14217.equals(empA14.a14217) : empA14.a14217 != null) return false;
        if (a14305A != null ? !a14305A.equals(empA14.a14305A) : empA14.a14305A != null) return false;
        if (a14317 != null ? !a14317.equals(empA14.a14317) : empA14.a14317 != null) return false;
        if (a14351 != null ? !a14351.equals(empA14.a14351) : empA14.a14351 != null) return false;
        if (a14330 != null ? !a14330.equals(empA14.a14330) : empA14.a14330 != null) return false;
        if (a14214A != null ? !a14214A.equals(empA14.a14214A) : empA14.a14214A != null) return false;
        if (a14214B != null ? !a14214B.equals(empA14.a14214B) : empA14.a14214B != null) return false;
        if (a14305B != null ? !a14305B.equals(empA14.a14305B) : empA14.a14305B != null) return false;
        if (a14205A != null ? !a14205A.equals(empA14.a14205A) : empA14.a14205A != null) return false;
        if (a14220 != null ? !a14220.equals(empA14.a14220) : empA14.a14220 != null) return false;
        if (a14230 != null ? !a14230.equals(empA14.a14230) : empA14.a14230 != null) return false;
        if (a14231 != null ? !a14231.equals(empA14.a14231) : empA14.a14231 != null) return false;
        if (a14302 != null ? !a14302.equals(empA14.a14302) : empA14.a14302 != null) return false;
        if (a14311B != null ? !a14311B.equals(empA14.a14311B) : empA14.a14311B != null) return false;
        if (status != null ? !status.equals(empA14.status) : empA14.status != null) return false;
        if (status2 != null ? !status2.equals(empA14.status2) : empA14.status2 != null) return false;
        if (seqid != null ? !seqid.equals(empA14.seqid) : empA14.seqid != null) return false;
        if (empId != null ? !empId.equals(empA14.empId) : empA14.empId != null) return false;
        if (subId != null ? !subId.equals(empA14.subId) : empA14.subId != null) return false;
        if (lastUpdatedStamp != null ? !lastUpdatedStamp.equals(empA14.lastUpdatedStamp) : empA14.lastUpdatedStamp != null)
            return false;
        if (lastUpdatedTxStamp != null ? !lastUpdatedTxStamp.equals(empA14.lastUpdatedTxStamp) : empA14.lastUpdatedTxStamp != null)
            return false;
        if (createdStamp != null ? !createdStamp.equals(empA14.createdStamp) : empA14.createdStamp != null)
            return false;
        if (createdTxStamp != null ? !createdTxStamp.equals(empA14.createdTxStamp) : empA14.createdTxStamp != null)
            return false;
        if (a14307 != null ? !a14307.equals(empA14.a14307) : empA14.a14307 != null) return false;
        if (a14227 != null ? !a14227.equals(empA14.a14227) : empA14.a14227 != null) return false;
        if (a14225 != null ? !a14225.equals(empA14.a14225) : empA14.a14225 != null) return false;
        if (a14324 != null ? !a14324.equals(empA14.a14324) : empA14.a14324 != null) return false;
        if (a14224 != null ? !a14224.equals(empA14.a14224) : empA14.a14224 != null) return false;
        if (a14001 != null ? !a14001.equals(empA14.a14001) : empA14.a14001 != null) return false;
        if (a14321 != null ? !a14321.equals(empA14.a14321) : empA14.a14321 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = a14311A != null ? a14311A.hashCode() : 0;
        result = 31 * result + (a14201 != null ? a14201.hashCode() : 0);
        result = 31 * result + (a14202 != null ? a14202.hashCode() : 0);
        result = 31 * result + (a14208B != null ? a14208B.hashCode() : 0);
        result = 31 * result + (a14221 != null ? a14221.hashCode() : 0);
        result = 31 * result + (a14314 != null ? a14314.hashCode() : 0);
        result = 31 * result + (a14205B != null ? a14205B.hashCode() : 0);
        result = 31 * result + (a14217 != null ? a14217.hashCode() : 0);
        result = 31 * result + (a14305A != null ? a14305A.hashCode() : 0);
        result = 31 * result + (a14317 != null ? a14317.hashCode() : 0);
        result = 31 * result + (a14351 != null ? a14351.hashCode() : 0);
        result = 31 * result + (a14330 != null ? a14330.hashCode() : 0);
        result = 31 * result + (a14214A != null ? a14214A.hashCode() : 0);
        result = 31 * result + (a14214B != null ? a14214B.hashCode() : 0);
        result = 31 * result + (a14305B != null ? a14305B.hashCode() : 0);
        result = 31 * result + (a14205A != null ? a14205A.hashCode() : 0);
        result = 31 * result + (a14220 != null ? a14220.hashCode() : 0);
        result = 31 * result + (a14230 != null ? a14230.hashCode() : 0);
        result = 31 * result + (a14231 != null ? a14231.hashCode() : 0);
        result = 31 * result + (a14302 != null ? a14302.hashCode() : 0);
        result = 31 * result + (a14311B != null ? a14311B.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (status2 != null ? status2.hashCode() : 0);
        result = 31 * result + (seqid != null ? seqid.hashCode() : 0);
        result = 31 * result + (empId != null ? empId.hashCode() : 0);
        result = 31 * result + (subId != null ? subId.hashCode() : 0);
        result = 31 * result + (lastUpdatedStamp != null ? lastUpdatedStamp.hashCode() : 0);
        result = 31 * result + (lastUpdatedTxStamp != null ? lastUpdatedTxStamp.hashCode() : 0);
        result = 31 * result + (createdStamp != null ? createdStamp.hashCode() : 0);
        result = 31 * result + (createdTxStamp != null ? createdTxStamp.hashCode() : 0);
        result = 31 * result + (a14307 != null ? a14307.hashCode() : 0);
        result = 31 * result + (a14227 != null ? a14227.hashCode() : 0);
        result = 31 * result + (a14225 != null ? a14225.hashCode() : 0);
        result = 31 * result + (a14324 != null ? a14324.hashCode() : 0);
        result = 31 * result + (a14224 != null ? a14224.hashCode() : 0);
        result = 31 * result + (a14001 != null ? a14001.hashCode() : 0);
        result = 31 * result + (a14321 != null ? a14321.hashCode() : 0);
        return result;
    }
}
