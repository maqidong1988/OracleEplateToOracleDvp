package model.from;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by Jay on 2017/12/15.
 *
 * @author Jay
 * @version 1.0
 * @since 1.0
 * Copyright (C) 2017. SinoSoft All Rights Received
 */
@Entity
@Table(name = "SYSTEM_CODE_ITEM", catalog = "")
public class SystemCodeItem implements Serializable {
    private static final long serialVersionUID = -7871375530964353654L;
    private String codeType;
    private String code;
    private String description;
    private String memo;
    private String pptr;
    private String cptr;
    private String spell;
    private String remark;
    private String isHide;
    private String codeFlag;
    private Long zorder;
    private Timestamp lastUpdatedStamp;
    private Timestamp lastUpdatedTxStamp;
    private Timestamp createdStamp;
    private Timestamp createdTxStamp;
    private String icon;
    private Long seqid;
    private String cn;

    @Id
    @Column(name = "CODE_TYPE", nullable = false, length = 50)
    public String getCodeType() {
        return codeType;
    }

    public void setCodeType(String codeType) {
        this.codeType = codeType;
    }

    @Id
    @Column(name = "CODE", nullable = false, length = 20)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "DESCRIPTION", nullable = true, length = 500)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "MEMO", nullable = true, length = 500)
    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Basic
    @Column(name = "PPTR", nullable = true, length = 20)
    public String getPptr() {
        return pptr;
    }

    public void setPptr(String pptr) {
        this.pptr = pptr;
    }

    @Basic
    @Column(name = "CPTR", nullable = true, length = 20)
    public String getCptr() {
        return cptr;
    }

    public void setCptr(String cptr) {
        this.cptr = cptr;
    }

    @Basic
    @Column(name = "SPELL", nullable = true, length = 50)
    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }

    @Basic
    @Column(name = "REMARK", nullable = true, length = 100)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "IS_HIDE", nullable = true, length = 1)
    public String getIsHide() {
        return isHide;
    }

    public void setIsHide(String isHide) {
        this.isHide = isHide;
    }

    @Basic
    @Column(name = "CODE_FLAG", nullable = true, length = 1)
    public String getCodeFlag() {
        return codeFlag;
    }

    public void setCodeFlag(String codeFlag) {
        this.codeFlag = codeFlag;
    }

    @Basic
    @Column(name = "ZORDER", nullable = true, precision = 0)
    public Long getZorder() {
        return zorder;
    }

    public void setZorder(Long zorder) {
        this.zorder = zorder;
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
    @Column(name = "ICON", nullable = true, length = 50)
    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Basic
    @Column(name = "SEQID", nullable = true, precision = 0)
    public Long getSeqid() {
        return seqid;
    }

    public void setSeqid(Long seqid) {
        this.seqid = seqid;
    }

    @Id
    @Column(name = "CN", nullable = false, length = 50)
    public String getCn() {
        return cn;
    }

    public void setCn(String cn) {
        this.cn = cn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SystemCodeItem that = (SystemCodeItem) o;

        if (codeType != null ? !codeType.equals(that.codeType) : that.codeType != null) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (memo != null ? !memo.equals(that.memo) : that.memo != null) return false;
        if (pptr != null ? !pptr.equals(that.pptr) : that.pptr != null) return false;
        if (cptr != null ? !cptr.equals(that.cptr) : that.cptr != null) return false;
        if (spell != null ? !spell.equals(that.spell) : that.spell != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (isHide != null ? !isHide.equals(that.isHide) : that.isHide != null) return false;
        if (codeFlag != null ? !codeFlag.equals(that.codeFlag) : that.codeFlag != null) return false;
        if (zorder != null ? !zorder.equals(that.zorder) : that.zorder != null) return false;
        if (lastUpdatedStamp != null ? !lastUpdatedStamp.equals(that.lastUpdatedStamp) : that.lastUpdatedStamp != null)
            return false;
        if (lastUpdatedTxStamp != null ? !lastUpdatedTxStamp.equals(that.lastUpdatedTxStamp) : that.lastUpdatedTxStamp != null)
            return false;
        if (createdStamp != null ? !createdStamp.equals(that.createdStamp) : that.createdStamp != null) return false;
        if (createdTxStamp != null ? !createdTxStamp.equals(that.createdTxStamp) : that.createdTxStamp != null)
            return false;
        if (icon != null ? !icon.equals(that.icon) : that.icon != null) return false;
        if (seqid != null ? !seqid.equals(that.seqid) : that.seqid != null) return false;
        if (cn != null ? !cn.equals(that.cn) : that.cn != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codeType != null ? codeType.hashCode() : 0;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (memo != null ? memo.hashCode() : 0);
        result = 31 * result + (pptr != null ? pptr.hashCode() : 0);
        result = 31 * result + (cptr != null ? cptr.hashCode() : 0);
        result = 31 * result + (spell != null ? spell.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (isHide != null ? isHide.hashCode() : 0);
        result = 31 * result + (codeFlag != null ? codeFlag.hashCode() : 0);
        result = 31 * result + (zorder != null ? zorder.hashCode() : 0);
        result = 31 * result + (lastUpdatedStamp != null ? lastUpdatedStamp.hashCode() : 0);
        result = 31 * result + (lastUpdatedTxStamp != null ? lastUpdatedTxStamp.hashCode() : 0);
        result = 31 * result + (createdStamp != null ? createdStamp.hashCode() : 0);
        result = 31 * result + (createdTxStamp != null ? createdTxStamp.hashCode() : 0);
        result = 31 * result + (icon != null ? icon.hashCode() : 0);
        result = 31 * result + (seqid != null ? seqid.hashCode() : 0);
        result = 31 * result + (cn != null ? cn.hashCode() : 0);
        return result;
    }
}
