package model.from;

import javax.persistence.*;
import java.io.Serializable;
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
@Table(name = "B000_A001", catalog = "")
public class B000A001 implements Serializable {
    private static final long serialVersionUID = 2662443541206048284L;
    private String depId;
    private String empId;
    private String categoryId;
    private String levelCode;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private Long seqid;

    @Id
    @Column(name = "DEP_ID", nullable = false, length = 50)
    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    @Id
    @Column(name = "EMP_ID", nullable = false, length = 50)
    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    @Basic
    @Column(name = "CATEGORY_ID", nullable = false, length = 50)
    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    @Basic
    @Column(name = "LEVEL_CODE", nullable = true, length = 120)
    public String getLevelCode() {
        return levelCode;
    }

    public void setLevelCode(String levelCode) {
        this.levelCode = levelCode;
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
    @Column(name = "SEQID", nullable = true, precision = 0)
    public Long getSeqid() {
        return seqid;
    }

    public void setSeqid(Long seqid) {
        this.seqid = seqid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        B000A001 b000A001 = (B000A001) o;

        if (depId != null ? !depId.equals(b000A001.depId) : b000A001.depId != null) return false;
        if (empId != null ? !empId.equals(b000A001.empId) : b000A001.empId != null) return false;
        if (categoryId != null ? !categoryId.equals(b000A001.categoryId) : b000A001.categoryId != null) return false;
        if (levelCode != null ? !levelCode.equals(b000A001.levelCode) : b000A001.levelCode != null) return false;
        if (lastUpdatedStamp != null ? !lastUpdatedStamp.equals(b000A001.lastUpdatedStamp) : b000A001.lastUpdatedStamp != null)
            return false;
        if (lastUpdatedTxStamp != null ? !lastUpdatedTxStamp.equals(b000A001.lastUpdatedTxStamp) : b000A001.lastUpdatedTxStamp != null)
            return false;
        if (createdStamp != null ? !createdStamp.equals(b000A001.createdStamp) : b000A001.createdStamp != null)
            return false;
        if (createdTxStamp != null ? !createdTxStamp.equals(b000A001.createdTxStamp) : b000A001.createdTxStamp != null)
            return false;
        if (seqid != null ? !seqid.equals(b000A001.seqid) : b000A001.seqid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = depId != null ? depId.hashCode() : 0;
        result = 31 * result + (empId != null ? empId.hashCode() : 0);
        result = 31 * result + (categoryId != null ? categoryId.hashCode() : 0);
        result = 31 * result + (levelCode != null ? levelCode.hashCode() : 0);
        result = 31 * result + (lastUpdatedStamp != null ? lastUpdatedStamp.hashCode() : 0);
        result = 31 * result + (lastUpdatedTxStamp != null ? lastUpdatedTxStamp.hashCode() : 0);
        result = 31 * result + (createdStamp != null ? createdStamp.hashCode() : 0);
        result = 31 * result + (createdTxStamp != null ? createdTxStamp.hashCode() : 0);
        result = 31 * result + (seqid != null ? seqid.hashCode() : 0);
        return result;
    }
}
