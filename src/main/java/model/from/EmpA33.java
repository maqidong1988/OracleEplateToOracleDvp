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
@Table(name = "EMP_A33", catalog = "")
public class EmpA33 {
    private String id;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private Long a33170;
    private String a33233;
    private String a33234;
    private Long a33243;
    private Long a33247;
    private Long a33330;
    private Long a33141;
    private String a33261;
    private Long a33275;
    private Long a33290;
    private Long a33399;
    private Long a33160;
    private Long a33205;
    private String a33240;
    private Long a33250;
    private String a33253;
    private Long a33325;
    private Long a33142;
    private Long a33200;
    private String a33212;
    private Long a33276;
    private Long a33105;
    private String a33210;
    private String a33217;
    private Long a33165;
    private String a33251;
    private String a33238;
    private String a33125;
    private Long a33227;
    private Long a33244;
    private String a33235;
    private Long a33271;
    private Long a33310;
    private Long a33315;
    private String a33001;
    private String a33011;
    private Long a33130;
    private Long a33132;
    private String a33225;
    private String a33229;
    private String a33236;
    private Long a33246;
    private Long a33249;
    private Long a33228;
    private String a33231;
    private String a33252;
    private String a33241;
    private Long a33320;
    private Long a33270;
    private Long a33272;
    private Long a33273;
    private Long a33150;
    private String a33230;
    private String a33237;
    private String a33239;
    private Long a33004;
    private Long a33135;
    private Long a33155;
    private String a33242;
    private Long a33274;
    private Long a33140;
    private Long a33211;
    private String a33232;
    private Long a33305;
    private Long a33180;
    private Long a33245;
    private Long a33248;
    private String status;
    private String status2;
    private Long seqid;
    private String empId;
    private String subId;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private Timestamp a33262;
    private String a33007;

    @Basic
    @Column(name = "A33170", nullable = true, precision = 2)
    public Long getA33170() {
        return a33170;
    }

    public void setA33170(Long a33170) {
        this.a33170 = a33170;
    }

    @Basic
    @Column(name = "A33233", nullable = true, length = 100)
    public String getA33233() {
        return a33233;
    }

    public void setA33233(String a33233) {
        this.a33233 = a33233;
    }

    @Basic
    @Column(name = "A33234", nullable = true, length = 100)
    public String getA33234() {
        return a33234;
    }

    public void setA33234(String a33234) {
        this.a33234 = a33234;
    }

    @Basic
    @Column(name = "A33243", nullable = true, precision = 2)
    public Long getA33243() {
        return a33243;
    }

    public void setA33243(Long a33243) {
        this.a33243 = a33243;
    }

    @Basic
    @Column(name = "A33247", nullable = true, precision = 2)
    public Long getA33247() {
        return a33247;
    }

    public void setA33247(Long a33247) {
        this.a33247 = a33247;
    }

    @Basic
    @Column(name = "A33330", nullable = true, precision = 2)
    public Long getA33330() {
        return a33330;
    }

    public void setA33330(Long a33330) {
        this.a33330 = a33330;
    }

    @Basic
    @Column(name = "A33141", nullable = true, precision = 2)
    public Long getA33141() {
        return a33141;
    }

    public void setA33141(Long a33141) {
        this.a33141 = a33141;
    }

    @Basic
    @Column(name = "A33261", nullable = true, length = 100)
    public String getA33261() {
        return a33261;
    }

    public void setA33261(String a33261) {
        this.a33261 = a33261;
    }

    @Basic
    @Column(name = "A33275", nullable = true, precision = 2)
    public Long getA33275() {
        return a33275;
    }

    public void setA33275(Long a33275) {
        this.a33275 = a33275;
    }

    @Basic
    @Column(name = "A33290", nullable = true, precision = 2)
    public Long getA33290() {
        return a33290;
    }

    public void setA33290(Long a33290) {
        this.a33290 = a33290;
    }

    @Basic
    @Column(name = "A33399", nullable = true, precision = 2)
    public Long getA33399() {
        return a33399;
    }

    public void setA33399(Long a33399) {
        this.a33399 = a33399;
    }

    @Basic
    @Column(name = "A33160", nullable = true, precision = 2)
    public Long getA33160() {
        return a33160;
    }

    public void setA33160(Long a33160) {
        this.a33160 = a33160;
    }

    @Basic
    @Column(name = "A33205", nullable = true, precision = 2)
    public Long getA33205() {
        return a33205;
    }

    public void setA33205(Long a33205) {
        this.a33205 = a33205;
    }

    @Basic
    @Column(name = "A33240", nullable = true, length = 100)
    public String getA33240() {
        return a33240;
    }

    public void setA33240(String a33240) {
        this.a33240 = a33240;
    }

    @Basic
    @Column(name = "A33250", nullable = true, precision = 2)
    public Long getA33250() {
        return a33250;
    }

    public void setA33250(Long a33250) {
        this.a33250 = a33250;
    }

    @Basic
    @Column(name = "A33253", nullable = true, length = 100)
    public String getA33253() {
        return a33253;
    }

    public void setA33253(String a33253) {
        this.a33253 = a33253;
    }

    @Basic
    @Column(name = "A33325", nullable = true, precision = 2)
    public Long getA33325() {
        return a33325;
    }

    public void setA33325(Long a33325) {
        this.a33325 = a33325;
    }

    @Basic
    @Column(name = "A33142", nullable = true, precision = 2)
    public Long getA33142() {
        return a33142;
    }

    public void setA33142(Long a33142) {
        this.a33142 = a33142;
    }

    @Basic
    @Column(name = "A33200", nullable = true, precision = 2)
    public Long getA33200() {
        return a33200;
    }

    public void setA33200(Long a33200) {
        this.a33200 = a33200;
    }

    @Basic
    @Column(name = "A33212", nullable = true, length = 100)
    public String getA33212() {
        return a33212;
    }

    public void setA33212(String a33212) {
        this.a33212 = a33212;
    }

    @Basic
    @Column(name = "A33276", nullable = true, precision = 2)
    public Long getA33276() {
        return a33276;
    }

    public void setA33276(Long a33276) {
        this.a33276 = a33276;
    }

    @Basic
    @Column(name = "A33105", nullable = true, precision = 2)
    public Long getA33105() {
        return a33105;
    }

    public void setA33105(Long a33105) {
        this.a33105 = a33105;
    }

    @Basic
    @Column(name = "A33210", nullable = true, length = 100)
    public String getA33210() {
        return a33210;
    }

    public void setA33210(String a33210) {
        this.a33210 = a33210;
    }

    @Basic
    @Column(name = "A33217", nullable = true, length = 100)
    public String getA33217() {
        return a33217;
    }

    public void setA33217(String a33217) {
        this.a33217 = a33217;
    }

    @Basic
    @Column(name = "A33165", nullable = true, precision = 2)
    public Long getA33165() {
        return a33165;
    }

    public void setA33165(Long a33165) {
        this.a33165 = a33165;
    }

    @Basic
    @Column(name = "A33251", nullable = true, length = 100)
    public String getA33251() {
        return a33251;
    }

    public void setA33251(String a33251) {
        this.a33251 = a33251;
    }

    @Basic
    @Column(name = "A33238", nullable = true, length = 100)
    public String getA33238() {
        return a33238;
    }

    public void setA33238(String a33238) {
        this.a33238 = a33238;
    }

    @Basic
    @Column(name = "A33125", nullable = true, length = 100)
    public String getA33125() {
        return a33125;
    }

    public void setA33125(String a33125) {
        this.a33125 = a33125;
    }

    @Basic
    @Column(name = "A33227", nullable = true, precision = 2)
    public Long getA33227() {
        return a33227;
    }

    public void setA33227(Long a33227) {
        this.a33227 = a33227;
    }

    @Basic
    @Column(name = "A33244", nullable = true, precision = 2)
    public Long getA33244() {
        return a33244;
    }

    public void setA33244(Long a33244) {
        this.a33244 = a33244;
    }

    @Basic
    @Column(name = "A33235", nullable = true, length = 100)
    public String getA33235() {
        return a33235;
    }

    public void setA33235(String a33235) {
        this.a33235 = a33235;
    }

    @Basic
    @Column(name = "A33271", nullable = true, precision = 2)
    public Long getA33271() {
        return a33271;
    }

    public void setA33271(Long a33271) {
        this.a33271 = a33271;
    }

    @Basic
    @Column(name = "A33310", nullable = true, precision = 2)
    public Long getA33310() {
        return a33310;
    }

    public void setA33310(Long a33310) {
        this.a33310 = a33310;
    }

    @Basic
    @Column(name = "A33315", nullable = true, precision = 2)
    public Long getA33315() {
        return a33315;
    }

    public void setA33315(Long a33315) {
        this.a33315 = a33315;
    }

    @Basic
    @Column(name = "A33001", nullable = true, length = 100)
    public String getA33001() {
        return a33001;
    }

    public void setA33001(String a33001) {
        this.a33001 = a33001;
    }

    @Basic
    @Column(name = "A33011", nullable = true, length = 100)
    public String getA33011() {
        return a33011;
    }

    public void setA33011(String a33011) {
        this.a33011 = a33011;
    }

    @Basic
    @Column(name = "A33130", nullable = true, precision = 2)
    public Long getA33130() {
        return a33130;
    }

    public void setA33130(Long a33130) {
        this.a33130 = a33130;
    }

    @Basic
    @Column(name = "A33132", nullable = true, precision = 2)
    public Long getA33132() {
        return a33132;
    }

    public void setA33132(Long a33132) {
        this.a33132 = a33132;
    }

    @Basic
    @Column(name = "A33225", nullable = true, length = 100)
    public String getA33225() {
        return a33225;
    }

    public void setA33225(String a33225) {
        this.a33225 = a33225;
    }

    @Basic
    @Column(name = "A33229", nullable = true, length = 100)
    public String getA33229() {
        return a33229;
    }

    public void setA33229(String a33229) {
        this.a33229 = a33229;
    }

    @Basic
    @Column(name = "A33236", nullable = true, length = 100)
    public String getA33236() {
        return a33236;
    }

    public void setA33236(String a33236) {
        this.a33236 = a33236;
    }

    @Basic
    @Column(name = "A33246", nullable = true, precision = 2)
    public Long getA33246() {
        return a33246;
    }

    public void setA33246(Long a33246) {
        this.a33246 = a33246;
    }

    @Basic
    @Column(name = "A33249", nullable = true, precision = 2)
    public Long getA33249() {
        return a33249;
    }

    public void setA33249(Long a33249) {
        this.a33249 = a33249;
    }

    @Basic
    @Column(name = "A33228", nullable = true, precision = 2)
    public Long getA33228() {
        return a33228;
    }

    public void setA33228(Long a33228) {
        this.a33228 = a33228;
    }

    @Basic
    @Column(name = "A33231", nullable = true, length = 100)
    public String getA33231() {
        return a33231;
    }

    public void setA33231(String a33231) {
        this.a33231 = a33231;
    }

    @Basic
    @Column(name = "A33252", nullable = true, length = 100)
    public String getA33252() {
        return a33252;
    }

    public void setA33252(String a33252) {
        this.a33252 = a33252;
    }

    @Basic
    @Column(name = "A33241", nullable = true, length = 100)
    public String getA33241() {
        return a33241;
    }

    public void setA33241(String a33241) {
        this.a33241 = a33241;
    }

    @Basic
    @Column(name = "A33320", nullable = true, precision = 2)
    public Long getA33320() {
        return a33320;
    }

    public void setA33320(Long a33320) {
        this.a33320 = a33320;
    }

    @Basic
    @Column(name = "A33270", nullable = true, precision = 2)
    public Long getA33270() {
        return a33270;
    }

    public void setA33270(Long a33270) {
        this.a33270 = a33270;
    }

    @Basic
    @Column(name = "A33272", nullable = true, precision = 2)
    public Long getA33272() {
        return a33272;
    }

    public void setA33272(Long a33272) {
        this.a33272 = a33272;
    }

    @Basic
    @Column(name = "A33273", nullable = true, precision = 2)
    public Long getA33273() {
        return a33273;
    }

    public void setA33273(Long a33273) {
        this.a33273 = a33273;
    }

    @Basic
    @Column(name = "A33150", nullable = true, precision = 2)
    public Long getA33150() {
        return a33150;
    }

    public void setA33150(Long a33150) {
        this.a33150 = a33150;
    }

    @Basic
    @Column(name = "A33230", nullable = true, length = 100)
    public String getA33230() {
        return a33230;
    }

    public void setA33230(String a33230) {
        this.a33230 = a33230;
    }

    @Basic
    @Column(name = "A33237", nullable = true, length = 100)
    public String getA33237() {
        return a33237;
    }

    public void setA33237(String a33237) {
        this.a33237 = a33237;
    }

    @Basic
    @Column(name = "A33239", nullable = true, length = 100)
    public String getA33239() {
        return a33239;
    }

    public void setA33239(String a33239) {
        this.a33239 = a33239;
    }

    @Basic
    @Column(name = "A33004", nullable = true, precision = 2)
    public Long getA33004() {
        return a33004;
    }

    public void setA33004(Long a33004) {
        this.a33004 = a33004;
    }

    @Basic
    @Column(name = "A33135", nullable = true, precision = 2)
    public Long getA33135() {
        return a33135;
    }

    public void setA33135(Long a33135) {
        this.a33135 = a33135;
    }

    @Basic
    @Column(name = "A33155", nullable = true, precision = 2)
    public Long getA33155() {
        return a33155;
    }

    public void setA33155(Long a33155) {
        this.a33155 = a33155;
    }

    @Basic
    @Column(name = "A33242", nullable = true, length = 100)
    public String getA33242() {
        return a33242;
    }

    public void setA33242(String a33242) {
        this.a33242 = a33242;
    }

    @Basic
    @Column(name = "A33274", nullable = true, precision = 2)
    public Long getA33274() {
        return a33274;
    }

    public void setA33274(Long a33274) {
        this.a33274 = a33274;
    }

    @Basic
    @Column(name = "A33140", nullable = true, precision = 2)
    public Long getA33140() {
        return a33140;
    }

    public void setA33140(Long a33140) {
        this.a33140 = a33140;
    }

    @Basic
    @Column(name = "A33211", nullable = true, precision = 2)
    public Long getA33211() {
        return a33211;
    }

    public void setA33211(Long a33211) {
        this.a33211 = a33211;
    }

    @Basic
    @Column(name = "A33232", nullable = true, length = 100)
    public String getA33232() {
        return a33232;
    }

    public void setA33232(String a33232) {
        this.a33232 = a33232;
    }

    @Basic
    @Column(name = "A33305", nullable = true, precision = 2)
    public Long getA33305() {
        return a33305;
    }

    public void setA33305(Long a33305) {
        this.a33305 = a33305;
    }

    @Basic
    @Column(name = "A33180", nullable = true, precision = 2)
    public Long getA33180() {
        return a33180;
    }

    public void setA33180(Long a33180) {
        this.a33180 = a33180;
    }

    @Basic
    @Column(name = "A33245", nullable = true, precision = 2)
    public Long getA33245() {
        return a33245;
    }

    public void setA33245(Long a33245) {
        this.a33245 = a33245;
    }

    @Basic
    @Column(name = "A33248", nullable = true, precision = 2)
    public Long getA33248() {
        return a33248;
    }

    public void setA33248(Long a33248) {
        this.a33248 = a33248;
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
    @Column(name = "A33262", nullable = true)
    public Timestamp getA33262() {
        return a33262;
    }

    public void setA33262(Timestamp a33262) {
        this.a33262 = a33262;
    }

    @Basic
    @Column(name = "A33007", nullable = true, length = 4000)
    public String getA33007() {
        return a33007;
    }

    public void setA33007(String a33007) {
        this.a33007 = a33007;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpA33 empA33 = (EmpA33) o;

        if (a33170 != null ? !a33170.equals(empA33.a33170) : empA33.a33170 != null) return false;
        if (a33233 != null ? !a33233.equals(empA33.a33233) : empA33.a33233 != null) return false;
        if (a33234 != null ? !a33234.equals(empA33.a33234) : empA33.a33234 != null) return false;
        if (a33243 != null ? !a33243.equals(empA33.a33243) : empA33.a33243 != null) return false;
        if (a33247 != null ? !a33247.equals(empA33.a33247) : empA33.a33247 != null) return false;
        if (a33330 != null ? !a33330.equals(empA33.a33330) : empA33.a33330 != null) return false;
        if (a33141 != null ? !a33141.equals(empA33.a33141) : empA33.a33141 != null) return false;
        if (a33261 != null ? !a33261.equals(empA33.a33261) : empA33.a33261 != null) return false;
        if (a33275 != null ? !a33275.equals(empA33.a33275) : empA33.a33275 != null) return false;
        if (a33290 != null ? !a33290.equals(empA33.a33290) : empA33.a33290 != null) return false;
        if (a33399 != null ? !a33399.equals(empA33.a33399) : empA33.a33399 != null) return false;
        if (a33160 != null ? !a33160.equals(empA33.a33160) : empA33.a33160 != null) return false;
        if (a33205 != null ? !a33205.equals(empA33.a33205) : empA33.a33205 != null) return false;
        if (a33240 != null ? !a33240.equals(empA33.a33240) : empA33.a33240 != null) return false;
        if (a33250 != null ? !a33250.equals(empA33.a33250) : empA33.a33250 != null) return false;
        if (a33253 != null ? !a33253.equals(empA33.a33253) : empA33.a33253 != null) return false;
        if (a33325 != null ? !a33325.equals(empA33.a33325) : empA33.a33325 != null) return false;
        if (a33142 != null ? !a33142.equals(empA33.a33142) : empA33.a33142 != null) return false;
        if (a33200 != null ? !a33200.equals(empA33.a33200) : empA33.a33200 != null) return false;
        if (a33212 != null ? !a33212.equals(empA33.a33212) : empA33.a33212 != null) return false;
        if (a33276 != null ? !a33276.equals(empA33.a33276) : empA33.a33276 != null) return false;
        if (a33105 != null ? !a33105.equals(empA33.a33105) : empA33.a33105 != null) return false;
        if (a33210 != null ? !a33210.equals(empA33.a33210) : empA33.a33210 != null) return false;
        if (a33217 != null ? !a33217.equals(empA33.a33217) : empA33.a33217 != null) return false;
        if (a33165 != null ? !a33165.equals(empA33.a33165) : empA33.a33165 != null) return false;
        if (a33251 != null ? !a33251.equals(empA33.a33251) : empA33.a33251 != null) return false;
        if (a33238 != null ? !a33238.equals(empA33.a33238) : empA33.a33238 != null) return false;
        if (a33125 != null ? !a33125.equals(empA33.a33125) : empA33.a33125 != null) return false;
        if (a33227 != null ? !a33227.equals(empA33.a33227) : empA33.a33227 != null) return false;
        if (a33244 != null ? !a33244.equals(empA33.a33244) : empA33.a33244 != null) return false;
        if (a33235 != null ? !a33235.equals(empA33.a33235) : empA33.a33235 != null) return false;
        if (a33271 != null ? !a33271.equals(empA33.a33271) : empA33.a33271 != null) return false;
        if (a33310 != null ? !a33310.equals(empA33.a33310) : empA33.a33310 != null) return false;
        if (a33315 != null ? !a33315.equals(empA33.a33315) : empA33.a33315 != null) return false;
        if (a33001 != null ? !a33001.equals(empA33.a33001) : empA33.a33001 != null) return false;
        if (a33011 != null ? !a33011.equals(empA33.a33011) : empA33.a33011 != null) return false;
        if (a33130 != null ? !a33130.equals(empA33.a33130) : empA33.a33130 != null) return false;
        if (a33132 != null ? !a33132.equals(empA33.a33132) : empA33.a33132 != null) return false;
        if (a33225 != null ? !a33225.equals(empA33.a33225) : empA33.a33225 != null) return false;
        if (a33229 != null ? !a33229.equals(empA33.a33229) : empA33.a33229 != null) return false;
        if (a33236 != null ? !a33236.equals(empA33.a33236) : empA33.a33236 != null) return false;
        if (a33246 != null ? !a33246.equals(empA33.a33246) : empA33.a33246 != null) return false;
        if (a33249 != null ? !a33249.equals(empA33.a33249) : empA33.a33249 != null) return false;
        if (a33228 != null ? !a33228.equals(empA33.a33228) : empA33.a33228 != null) return false;
        if (a33231 != null ? !a33231.equals(empA33.a33231) : empA33.a33231 != null) return false;
        if (a33252 != null ? !a33252.equals(empA33.a33252) : empA33.a33252 != null) return false;
        if (a33241 != null ? !a33241.equals(empA33.a33241) : empA33.a33241 != null) return false;
        if (a33320 != null ? !a33320.equals(empA33.a33320) : empA33.a33320 != null) return false;
        if (a33270 != null ? !a33270.equals(empA33.a33270) : empA33.a33270 != null) return false;
        if (a33272 != null ? !a33272.equals(empA33.a33272) : empA33.a33272 != null) return false;
        if (a33273 != null ? !a33273.equals(empA33.a33273) : empA33.a33273 != null) return false;
        if (a33150 != null ? !a33150.equals(empA33.a33150) : empA33.a33150 != null) return false;
        if (a33230 != null ? !a33230.equals(empA33.a33230) : empA33.a33230 != null) return false;
        if (a33237 != null ? !a33237.equals(empA33.a33237) : empA33.a33237 != null) return false;
        if (a33239 != null ? !a33239.equals(empA33.a33239) : empA33.a33239 != null) return false;
        if (a33004 != null ? !a33004.equals(empA33.a33004) : empA33.a33004 != null) return false;
        if (a33135 != null ? !a33135.equals(empA33.a33135) : empA33.a33135 != null) return false;
        if (a33155 != null ? !a33155.equals(empA33.a33155) : empA33.a33155 != null) return false;
        if (a33242 != null ? !a33242.equals(empA33.a33242) : empA33.a33242 != null) return false;
        if (a33274 != null ? !a33274.equals(empA33.a33274) : empA33.a33274 != null) return false;
        if (a33140 != null ? !a33140.equals(empA33.a33140) : empA33.a33140 != null) return false;
        if (a33211 != null ? !a33211.equals(empA33.a33211) : empA33.a33211 != null) return false;
        if (a33232 != null ? !a33232.equals(empA33.a33232) : empA33.a33232 != null) return false;
        if (a33305 != null ? !a33305.equals(empA33.a33305) : empA33.a33305 != null) return false;
        if (a33180 != null ? !a33180.equals(empA33.a33180) : empA33.a33180 != null) return false;
        if (a33245 != null ? !a33245.equals(empA33.a33245) : empA33.a33245 != null) return false;
        if (a33248 != null ? !a33248.equals(empA33.a33248) : empA33.a33248 != null) return false;
        if (status != null ? !status.equals(empA33.status) : empA33.status != null) return false;
        if (status2 != null ? !status2.equals(empA33.status2) : empA33.status2 != null) return false;
        if (seqid != null ? !seqid.equals(empA33.seqid) : empA33.seqid != null) return false;
        if (empId != null ? !empId.equals(empA33.empId) : empA33.empId != null) return false;
        if (subId != null ? !subId.equals(empA33.subId) : empA33.subId != null) return false;
        if (lastUpdatedStamp != null ? !lastUpdatedStamp.equals(empA33.lastUpdatedStamp) : empA33.lastUpdatedStamp != null)
            return false;
        if (lastUpdatedTxStamp != null ? !lastUpdatedTxStamp.equals(empA33.lastUpdatedTxStamp) : empA33.lastUpdatedTxStamp != null)
            return false;
        if (createdStamp != null ? !createdStamp.equals(empA33.createdStamp) : empA33.createdStamp != null)
            return false;
        if (createdTxStamp != null ? !createdTxStamp.equals(empA33.createdTxStamp) : empA33.createdTxStamp != null)
            return false;
        if (a33262 != null ? !a33262.equals(empA33.a33262) : empA33.a33262 != null) return false;
        if (a33007 != null ? !a33007.equals(empA33.a33007) : empA33.a33007 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = a33170 != null ? a33170.hashCode() : 0;
        result = 31 * result + (a33233 != null ? a33233.hashCode() : 0);
        result = 31 * result + (a33234 != null ? a33234.hashCode() : 0);
        result = 31 * result + (a33243 != null ? a33243.hashCode() : 0);
        result = 31 * result + (a33247 != null ? a33247.hashCode() : 0);
        result = 31 * result + (a33330 != null ? a33330.hashCode() : 0);
        result = 31 * result + (a33141 != null ? a33141.hashCode() : 0);
        result = 31 * result + (a33261 != null ? a33261.hashCode() : 0);
        result = 31 * result + (a33275 != null ? a33275.hashCode() : 0);
        result = 31 * result + (a33290 != null ? a33290.hashCode() : 0);
        result = 31 * result + (a33399 != null ? a33399.hashCode() : 0);
        result = 31 * result + (a33160 != null ? a33160.hashCode() : 0);
        result = 31 * result + (a33205 != null ? a33205.hashCode() : 0);
        result = 31 * result + (a33240 != null ? a33240.hashCode() : 0);
        result = 31 * result + (a33250 != null ? a33250.hashCode() : 0);
        result = 31 * result + (a33253 != null ? a33253.hashCode() : 0);
        result = 31 * result + (a33325 != null ? a33325.hashCode() : 0);
        result = 31 * result + (a33142 != null ? a33142.hashCode() : 0);
        result = 31 * result + (a33200 != null ? a33200.hashCode() : 0);
        result = 31 * result + (a33212 != null ? a33212.hashCode() : 0);
        result = 31 * result + (a33276 != null ? a33276.hashCode() : 0);
        result = 31 * result + (a33105 != null ? a33105.hashCode() : 0);
        result = 31 * result + (a33210 != null ? a33210.hashCode() : 0);
        result = 31 * result + (a33217 != null ? a33217.hashCode() : 0);
        result = 31 * result + (a33165 != null ? a33165.hashCode() : 0);
        result = 31 * result + (a33251 != null ? a33251.hashCode() : 0);
        result = 31 * result + (a33238 != null ? a33238.hashCode() : 0);
        result = 31 * result + (a33125 != null ? a33125.hashCode() : 0);
        result = 31 * result + (a33227 != null ? a33227.hashCode() : 0);
        result = 31 * result + (a33244 != null ? a33244.hashCode() : 0);
        result = 31 * result + (a33235 != null ? a33235.hashCode() : 0);
        result = 31 * result + (a33271 != null ? a33271.hashCode() : 0);
        result = 31 * result + (a33310 != null ? a33310.hashCode() : 0);
        result = 31 * result + (a33315 != null ? a33315.hashCode() : 0);
        result = 31 * result + (a33001 != null ? a33001.hashCode() : 0);
        result = 31 * result + (a33011 != null ? a33011.hashCode() : 0);
        result = 31 * result + (a33130 != null ? a33130.hashCode() : 0);
        result = 31 * result + (a33132 != null ? a33132.hashCode() : 0);
        result = 31 * result + (a33225 != null ? a33225.hashCode() : 0);
        result = 31 * result + (a33229 != null ? a33229.hashCode() : 0);
        result = 31 * result + (a33236 != null ? a33236.hashCode() : 0);
        result = 31 * result + (a33246 != null ? a33246.hashCode() : 0);
        result = 31 * result + (a33249 != null ? a33249.hashCode() : 0);
        result = 31 * result + (a33228 != null ? a33228.hashCode() : 0);
        result = 31 * result + (a33231 != null ? a33231.hashCode() : 0);
        result = 31 * result + (a33252 != null ? a33252.hashCode() : 0);
        result = 31 * result + (a33241 != null ? a33241.hashCode() : 0);
        result = 31 * result + (a33320 != null ? a33320.hashCode() : 0);
        result = 31 * result + (a33270 != null ? a33270.hashCode() : 0);
        result = 31 * result + (a33272 != null ? a33272.hashCode() : 0);
        result = 31 * result + (a33273 != null ? a33273.hashCode() : 0);
        result = 31 * result + (a33150 != null ? a33150.hashCode() : 0);
        result = 31 * result + (a33230 != null ? a33230.hashCode() : 0);
        result = 31 * result + (a33237 != null ? a33237.hashCode() : 0);
        result = 31 * result + (a33239 != null ? a33239.hashCode() : 0);
        result = 31 * result + (a33004 != null ? a33004.hashCode() : 0);
        result = 31 * result + (a33135 != null ? a33135.hashCode() : 0);
        result = 31 * result + (a33155 != null ? a33155.hashCode() : 0);
        result = 31 * result + (a33242 != null ? a33242.hashCode() : 0);
        result = 31 * result + (a33274 != null ? a33274.hashCode() : 0);
        result = 31 * result + (a33140 != null ? a33140.hashCode() : 0);
        result = 31 * result + (a33211 != null ? a33211.hashCode() : 0);
        result = 31 * result + (a33232 != null ? a33232.hashCode() : 0);
        result = 31 * result + (a33305 != null ? a33305.hashCode() : 0);
        result = 31 * result + (a33180 != null ? a33180.hashCode() : 0);
        result = 31 * result + (a33245 != null ? a33245.hashCode() : 0);
        result = 31 * result + (a33248 != null ? a33248.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (status2 != null ? status2.hashCode() : 0);
        result = 31 * result + (seqid != null ? seqid.hashCode() : 0);
        result = 31 * result + (empId != null ? empId.hashCode() : 0);
        result = 31 * result + (subId != null ? subId.hashCode() : 0);
        result = 31 * result + (lastUpdatedStamp != null ? lastUpdatedStamp.hashCode() : 0);
        result = 31 * result + (lastUpdatedTxStamp != null ? lastUpdatedTxStamp.hashCode() : 0);
        result = 31 * result + (createdStamp != null ? createdStamp.hashCode() : 0);
        result = 31 * result + (createdTxStamp != null ? createdTxStamp.hashCode() : 0);
        result = 31 * result + (a33262 != null ? a33262.hashCode() : 0);
        result = 31 * result + (a33007 != null ? a33007.hashCode() : 0);
        return result;
    }
}
