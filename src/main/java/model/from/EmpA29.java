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
@Table(name = "EMP_A29", catalog = "")
public class EmpA29 {
    private String id;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String a29021B;
    private String a29028;
    private String a29031;
    private String a29072;
    private String a29037;
    private String a29044;
    private String a29121;
    private String a29321;
    private String a29337;
    private String a29347A;
    private String a29351A;
    private String a29021A;
    private String a29034;
    private Long a29073;
    private String a29324A;
    private String a29012;
    private String a29014;
    private String a29017;
    private String a29024;
    private String a29041;
    private String a29324B;
    private Long a29334;
    private Long a29047;
    private String a29327A;
    private String a29347B;
    private String a29314;
    private String a29351B;
    private String a29327B;
    private String a29344;
    private String status;
    private String status2;
    private Long seqid;
    private String empId;
    private String subId;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private Timestamp a29354;
    private Timestamp a29317;
    private Timestamp a29007;
    private Timestamp a29001;
    private Timestamp a29307;
    private Timestamp a29004;
    private Timestamp a29341;

    @Basic
    @Column(name = "A29021_B", nullable = true, length = 18)
    public String getA29021B() {
        return a29021B;
    }

    public void setA29021B(String a29021B) {
        this.a29021B = a29021B;
    }

    @Basic
    @Column(name = "A29028", nullable = true, length = 100)
    public String getA29028() {
        return a29028;
    }

    public void setA29028(String a29028) {
        this.a29028 = a29028;
    }

    @Basic
    @Column(name = "A29031", nullable = true, length = 100)
    public String getA29031() {
        return a29031;
    }

    public void setA29031(String a29031) {
        this.a29031 = a29031;
    }

    @Basic
    @Column(name = "A29072", nullable = true, length = 200)
    public String getA29072() {
        return a29072;
    }

    public void setA29072(String a29072) {
        this.a29072 = a29072;
    }

    @Basic
    @Column(name = "A29037", nullable = true, length = 100)
    public String getA29037() {
        return a29037;
    }

    public void setA29037(String a29037) {
        this.a29037 = a29037;
    }

    @Basic
    @Column(name = "A29044", nullable = true, length = 80)
    public String getA29044() {
        return a29044;
    }

    public void setA29044(String a29044) {
        this.a29044 = a29044;
    }

    @Basic
    @Column(name = "A29121", nullable = true, length = 100)
    public String getA29121() {
        return a29121;
    }

    public void setA29121(String a29121) {
        this.a29121 = a29121;
    }

    @Basic
    @Column(name = "A29321", nullable = true, length = 40)
    public String getA29321() {
        return a29321;
    }

    public void setA29321(String a29321) {
        this.a29321 = a29321;
    }

    @Basic
    @Column(name = "A29337", nullable = true, length = 120)
    public String getA29337() {
        return a29337;
    }

    public void setA29337(String a29337) {
        this.a29337 = a29337;
    }

    @Basic
    @Column(name = "A29347_A", nullable = true, length = 40)
    public String getA29347A() {
        return a29347A;
    }

    public void setA29347A(String a29347A) {
        this.a29347A = a29347A;
    }

    @Basic
    @Column(name = "A29351_A", nullable = true, length = 40)
    public String getA29351A() {
        return a29351A;
    }

    public void setA29351A(String a29351A) {
        this.a29351A = a29351A;
    }

    @Basic
    @Column(name = "A29021_A", nullable = true, length = 120)
    public String getA29021A() {
        return a29021A;
    }

    public void setA29021A(String a29021A) {
        this.a29021A = a29021A;
    }

    @Basic
    @Column(name = "A29034", nullable = true, length = 100)
    public String getA29034() {
        return a29034;
    }

    public void setA29034(String a29034) {
        this.a29034 = a29034;
    }

    @Basic
    @Column(name = "A29073", nullable = true, precision = 2)
    public Long getA29073() {
        return a29073;
    }

    public void setA29073(Long a29073) {
        this.a29073 = a29073;
    }

    @Basic
    @Column(name = "A29324_A", nullable = true, length = 40)
    public String getA29324A() {
        return a29324A;
    }

    public void setA29324A(String a29324A) {
        this.a29324A = a29324A;
    }

    @Basic
    @Column(name = "A29012", nullable = true, length = 100)
    public String getA29012() {
        return a29012;
    }

    public void setA29012(String a29012) {
        this.a29012 = a29012;
    }

    @Basic
    @Column(name = "A29014", nullable = true, length = 100)
    public String getA29014() {
        return a29014;
    }

    public void setA29014(String a29014) {
        this.a29014 = a29014;
    }

    @Basic
    @Column(name = "A29017", nullable = true, length = 100)
    public String getA29017() {
        return a29017;
    }

    public void setA29017(String a29017) {
        this.a29017 = a29017;
    }

    @Basic
    @Column(name = "A29024", nullable = true, length = 100)
    public String getA29024() {
        return a29024;
    }

    public void setA29024(String a29024) {
        this.a29024 = a29024;
    }

    @Basic
    @Column(name = "A29041", nullable = true, length = 80)
    public String getA29041() {
        return a29041;
    }

    public void setA29041(String a29041) {
        this.a29041 = a29041;
    }

    @Basic
    @Column(name = "A29324_B", nullable = true, length = 2)
    public String getA29324B() {
        return a29324B;
    }

    public void setA29324B(String a29324B) {
        this.a29324B = a29324B;
    }

    @Basic
    @Column(name = "A29334", nullable = true, precision = 2)
    public Long getA29334() {
        return a29334;
    }

    public void setA29334(Long a29334) {
        this.a29334 = a29334;
    }

    @Basic
    @Column(name = "A29047", nullable = true, precision = 2)
    public Long getA29047() {
        return a29047;
    }

    public void setA29047(Long a29047) {
        this.a29047 = a29047;
    }

    @Basic
    @Column(name = "A29327_A", nullable = true, length = 40)
    public String getA29327A() {
        return a29327A;
    }

    public void setA29327A(String a29327A) {
        this.a29327A = a29327A;
    }

    @Basic
    @Column(name = "A29347_B", nullable = true, length = 2)
    public String getA29347B() {
        return a29347B;
    }

    public void setA29347B(String a29347B) {
        this.a29347B = a29347B;
    }

    @Basic
    @Column(name = "A29314", nullable = true, length = 100)
    public String getA29314() {
        return a29314;
    }

    public void setA29314(String a29314) {
        this.a29314 = a29314;
    }

    @Basic
    @Column(name = "A29351_B", nullable = true, length = 1)
    public String getA29351B() {
        return a29351B;
    }

    public void setA29351B(String a29351B) {
        this.a29351B = a29351B;
    }

    @Basic
    @Column(name = "A29327_B", nullable = true, length = 1)
    public String getA29327B() {
        return a29327B;
    }

    public void setA29327B(String a29327B) {
        this.a29327B = a29327B;
    }

    @Basic
    @Column(name = "A29344", nullable = true, length = 40)
    public String getA29344() {
        return a29344;
    }

    public void setA29344(String a29344) {
        this.a29344 = a29344;
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
    @Column(name = "A29354", nullable = true)
    public Timestamp getA29354() {
        return a29354;
    }

    public void setA29354(Timestamp a29354) {
        this.a29354 = a29354;
    }

    @Basic
    @Column(name = "A29317", nullable = true)
    public Timestamp getA29317() {
        return a29317;
    }

    public void setA29317(Timestamp a29317) {
        this.a29317 = a29317;
    }

    @Basic
    @Column(name = "A29007", nullable = true)
    public Timestamp getA29007() {
        return a29007;
    }

    public void setA29007(Timestamp a29007) {
        this.a29007 = a29007;
    }

    @Basic
    @Column(name = "A29001", nullable = true)
    public Timestamp getA29001() {
        return a29001;
    }

    public void setA29001(Timestamp a29001) {
        this.a29001 = a29001;
    }

    @Basic
    @Column(name = "A29307", nullable = true)
    public Timestamp getA29307() {
        return a29307;
    }

    public void setA29307(Timestamp a29307) {
        this.a29307 = a29307;
    }

    @Basic
    @Column(name = "A29004", nullable = true)
    public Timestamp getA29004() {
        return a29004;
    }

    public void setA29004(Timestamp a29004) {
        this.a29004 = a29004;
    }

    @Basic
    @Column(name = "A29341", nullable = true)
    public Timestamp getA29341() {
        return a29341;
    }

    public void setA29341(Timestamp a29341) {
        this.a29341 = a29341;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpA29 empA29 = (EmpA29) o;

        if (a29021B != null ? !a29021B.equals(empA29.a29021B) : empA29.a29021B != null) return false;
        if (a29028 != null ? !a29028.equals(empA29.a29028) : empA29.a29028 != null) return false;
        if (a29031 != null ? !a29031.equals(empA29.a29031) : empA29.a29031 != null) return false;
        if (a29072 != null ? !a29072.equals(empA29.a29072) : empA29.a29072 != null) return false;
        if (a29037 != null ? !a29037.equals(empA29.a29037) : empA29.a29037 != null) return false;
        if (a29044 != null ? !a29044.equals(empA29.a29044) : empA29.a29044 != null) return false;
        if (a29121 != null ? !a29121.equals(empA29.a29121) : empA29.a29121 != null) return false;
        if (a29321 != null ? !a29321.equals(empA29.a29321) : empA29.a29321 != null) return false;
        if (a29337 != null ? !a29337.equals(empA29.a29337) : empA29.a29337 != null) return false;
        if (a29347A != null ? !a29347A.equals(empA29.a29347A) : empA29.a29347A != null) return false;
        if (a29351A != null ? !a29351A.equals(empA29.a29351A) : empA29.a29351A != null) return false;
        if (a29021A != null ? !a29021A.equals(empA29.a29021A) : empA29.a29021A != null) return false;
        if (a29034 != null ? !a29034.equals(empA29.a29034) : empA29.a29034 != null) return false;
        if (a29073 != null ? !a29073.equals(empA29.a29073) : empA29.a29073 != null) return false;
        if (a29324A != null ? !a29324A.equals(empA29.a29324A) : empA29.a29324A != null) return false;
        if (a29012 != null ? !a29012.equals(empA29.a29012) : empA29.a29012 != null) return false;
        if (a29014 != null ? !a29014.equals(empA29.a29014) : empA29.a29014 != null) return false;
        if (a29017 != null ? !a29017.equals(empA29.a29017) : empA29.a29017 != null) return false;
        if (a29024 != null ? !a29024.equals(empA29.a29024) : empA29.a29024 != null) return false;
        if (a29041 != null ? !a29041.equals(empA29.a29041) : empA29.a29041 != null) return false;
        if (a29324B != null ? !a29324B.equals(empA29.a29324B) : empA29.a29324B != null) return false;
        if (a29334 != null ? !a29334.equals(empA29.a29334) : empA29.a29334 != null) return false;
        if (a29047 != null ? !a29047.equals(empA29.a29047) : empA29.a29047 != null) return false;
        if (a29327A != null ? !a29327A.equals(empA29.a29327A) : empA29.a29327A != null) return false;
        if (a29347B != null ? !a29347B.equals(empA29.a29347B) : empA29.a29347B != null) return false;
        if (a29314 != null ? !a29314.equals(empA29.a29314) : empA29.a29314 != null) return false;
        if (a29351B != null ? !a29351B.equals(empA29.a29351B) : empA29.a29351B != null) return false;
        if (a29327B != null ? !a29327B.equals(empA29.a29327B) : empA29.a29327B != null) return false;
        if (a29344 != null ? !a29344.equals(empA29.a29344) : empA29.a29344 != null) return false;
        if (status != null ? !status.equals(empA29.status) : empA29.status != null) return false;
        if (status2 != null ? !status2.equals(empA29.status2) : empA29.status2 != null) return false;
        if (seqid != null ? !seqid.equals(empA29.seqid) : empA29.seqid != null) return false;
        if (empId != null ? !empId.equals(empA29.empId) : empA29.empId != null) return false;
        if (subId != null ? !subId.equals(empA29.subId) : empA29.subId != null) return false;
        if (lastUpdatedStamp != null ? !lastUpdatedStamp.equals(empA29.lastUpdatedStamp) : empA29.lastUpdatedStamp != null)
            return false;
        if (lastUpdatedTxStamp != null ? !lastUpdatedTxStamp.equals(empA29.lastUpdatedTxStamp) : empA29.lastUpdatedTxStamp != null)
            return false;
        if (createdStamp != null ? !createdStamp.equals(empA29.createdStamp) : empA29.createdStamp != null)
            return false;
        if (createdTxStamp != null ? !createdTxStamp.equals(empA29.createdTxStamp) : empA29.createdTxStamp != null)
            return false;
        if (a29354 != null ? !a29354.equals(empA29.a29354) : empA29.a29354 != null) return false;
        if (a29317 != null ? !a29317.equals(empA29.a29317) : empA29.a29317 != null) return false;
        if (a29007 != null ? !a29007.equals(empA29.a29007) : empA29.a29007 != null) return false;
        if (a29001 != null ? !a29001.equals(empA29.a29001) : empA29.a29001 != null) return false;
        if (a29307 != null ? !a29307.equals(empA29.a29307) : empA29.a29307 != null) return false;
        if (a29004 != null ? !a29004.equals(empA29.a29004) : empA29.a29004 != null) return false;
        if (a29341 != null ? !a29341.equals(empA29.a29341) : empA29.a29341 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = a29021B != null ? a29021B.hashCode() : 0;
        result = 31 * result + (a29028 != null ? a29028.hashCode() : 0);
        result = 31 * result + (a29031 != null ? a29031.hashCode() : 0);
        result = 31 * result + (a29072 != null ? a29072.hashCode() : 0);
        result = 31 * result + (a29037 != null ? a29037.hashCode() : 0);
        result = 31 * result + (a29044 != null ? a29044.hashCode() : 0);
        result = 31 * result + (a29121 != null ? a29121.hashCode() : 0);
        result = 31 * result + (a29321 != null ? a29321.hashCode() : 0);
        result = 31 * result + (a29337 != null ? a29337.hashCode() : 0);
        result = 31 * result + (a29347A != null ? a29347A.hashCode() : 0);
        result = 31 * result + (a29351A != null ? a29351A.hashCode() : 0);
        result = 31 * result + (a29021A != null ? a29021A.hashCode() : 0);
        result = 31 * result + (a29034 != null ? a29034.hashCode() : 0);
        result = 31 * result + (a29073 != null ? a29073.hashCode() : 0);
        result = 31 * result + (a29324A != null ? a29324A.hashCode() : 0);
        result = 31 * result + (a29012 != null ? a29012.hashCode() : 0);
        result = 31 * result + (a29014 != null ? a29014.hashCode() : 0);
        result = 31 * result + (a29017 != null ? a29017.hashCode() : 0);
        result = 31 * result + (a29024 != null ? a29024.hashCode() : 0);
        result = 31 * result + (a29041 != null ? a29041.hashCode() : 0);
        result = 31 * result + (a29324B != null ? a29324B.hashCode() : 0);
        result = 31 * result + (a29334 != null ? a29334.hashCode() : 0);
        result = 31 * result + (a29047 != null ? a29047.hashCode() : 0);
        result = 31 * result + (a29327A != null ? a29327A.hashCode() : 0);
        result = 31 * result + (a29347B != null ? a29347B.hashCode() : 0);
        result = 31 * result + (a29314 != null ? a29314.hashCode() : 0);
        result = 31 * result + (a29351B != null ? a29351B.hashCode() : 0);
        result = 31 * result + (a29327B != null ? a29327B.hashCode() : 0);
        result = 31 * result + (a29344 != null ? a29344.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (status2 != null ? status2.hashCode() : 0);
        result = 31 * result + (seqid != null ? seqid.hashCode() : 0);
        result = 31 * result + (empId != null ? empId.hashCode() : 0);
        result = 31 * result + (subId != null ? subId.hashCode() : 0);
        result = 31 * result + (lastUpdatedStamp != null ? lastUpdatedStamp.hashCode() : 0);
        result = 31 * result + (lastUpdatedTxStamp != null ? lastUpdatedTxStamp.hashCode() : 0);
        result = 31 * result + (createdStamp != null ? createdStamp.hashCode() : 0);
        result = 31 * result + (createdTxStamp != null ? createdTxStamp.hashCode() : 0);
        result = 31 * result + (a29354 != null ? a29354.hashCode() : 0);
        result = 31 * result + (a29317 != null ? a29317.hashCode() : 0);
        result = 31 * result + (a29007 != null ? a29007.hashCode() : 0);
        result = 31 * result + (a29001 != null ? a29001.hashCode() : 0);
        result = 31 * result + (a29307 != null ? a29307.hashCode() : 0);
        result = 31 * result + (a29004 != null ? a29004.hashCode() : 0);
        result = 31 * result + (a29341 != null ? a29341.hashCode() : 0);
        return result;
    }
}
