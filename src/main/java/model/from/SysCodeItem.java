package model.from;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Arrays;

/**
 * Created by Jay on 2018/1/24.
 *
 * @author Jay
 * @version 1.0
 * @since 1.0
 * Copyright (C) 2017. SinoSoft All Rights Received
 */
@Entity
@Table(name = "SYS_CODE_ITEM", catalog = "")
public class SysCodeItem implements Serializable {
    private long id;
    private long codeSetId;
    private String code;
    private String name;
    private String briefName;
    private String parentCode;
    private String spell;
    private Boolean selectable;
    private Boolean leaf;
    private String description;
    private Boolean invalid;
    private Long ordinal;
    private long status;
    private Timestamp createdTime;
    private byte[] createdBy;
    private Timestamp lastModifiedTime;
    private byte[] lastModifiedBy;
    private Boolean readonly;

    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "CODE_SET_ID", nullable = false, precision = 0)
    public long getCodeSetId() {
        return codeSetId;
    }

    public void setCodeSetId(long codeSetId) {
        this.codeSetId = codeSetId;
    }

    @Basic
    @Column(name = "CODE", nullable = false, length = 50)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "NAME", nullable = false, length = 200)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "BRIEF_NAME", nullable = true, length = 100)
    public String getBriefName() {
        return briefName;
    }

    public void setBriefName(String briefName) {
        this.briefName = briefName;
    }

    @Basic
    @Column(name = "PARENT_CODE", nullable = true, length = 50)
    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
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
    @Column(name = "SELECTABLE", nullable = true, precision = 0)
    public Boolean getSelectable() {
        return selectable;
    }

    public void setSelectable(Boolean selectable) {
        this.selectable = selectable;
    }

    @Basic
    @Column(name = "LEAF", nullable = true, precision = 0)
    public Boolean getLeaf() {
        return leaf;
    }

    public void setLeaf(Boolean leaf) {
        this.leaf = leaf;
    }

    @Basic
    @Column(name = "DESCRIPTION", nullable = true, length = 255)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "INVALID", nullable = true, precision = 0)
    public Boolean getInvalid() {
        return invalid;
    }

    public void setInvalid(Boolean invalid) {
        this.invalid = invalid;
    }

    @Basic
    @Column(name = "ORDINAL", nullable = true, precision = 0)
    public Long getOrdinal() {
        return ordinal;
    }

    public void setOrdinal(Long ordinal) {
        this.ordinal = ordinal;
    }

    @Basic
    @Column(name = "STATUS", nullable = false, precision = 0)
    public long getStatus() {
        return status;
    }

    public void setStatus(long status) {
        this.status = status;
    }

    @Basic
    @Column(name = "CREATED_TIME", nullable = false)
    public Timestamp getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Timestamp createdTime) {
        this.createdTime = createdTime;
    }

    @Basic
    @Column(name = "CREATED_BY", nullable = true)
    public byte[] getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(byte[] createdBy) {
        this.createdBy = createdBy;
    }

    @Basic
    @Column(name = "LAST_MODIFIED_TIME", nullable = false)
    public Timestamp getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(Timestamp lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    @Basic
    @Column(name = "LAST_MODIFIED_BY", nullable = true)
    public byte[] getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(byte[] lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    @Basic
    @Column(name = "READONLY", nullable = true, precision = 0)
    public Boolean getReadonly() {
        return readonly;
    }

    public void setReadonly(Boolean readonly) {
        this.readonly = readonly;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysCodeItem that = (SysCodeItem) o;

        if (id != that.id) return false;
        if (codeSetId != that.codeSetId) return false;
        if (status != that.status) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (briefName != null ? !briefName.equals(that.briefName) : that.briefName != null) return false;
        if (parentCode != null ? !parentCode.equals(that.parentCode) : that.parentCode != null) return false;
        if (spell != null ? !spell.equals(that.spell) : that.spell != null) return false;
        if (selectable != null ? !selectable.equals(that.selectable) : that.selectable != null) return false;
        if (leaf != null ? !leaf.equals(that.leaf) : that.leaf != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (invalid != null ? !invalid.equals(that.invalid) : that.invalid != null) return false;
        if (ordinal != null ? !ordinal.equals(that.ordinal) : that.ordinal != null) return false;
        if (createdTime != null ? !createdTime.equals(that.createdTime) : that.createdTime != null) return false;
        if (!Arrays.equals(createdBy, that.createdBy)) return false;
        if (lastModifiedTime != null ? !lastModifiedTime.equals(that.lastModifiedTime) : that.lastModifiedTime != null)
            return false;
        if (!Arrays.equals(lastModifiedBy, that.lastModifiedBy)) return false;
        if (readonly != null ? !readonly.equals(that.readonly) : that.readonly != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (codeSetId ^ (codeSetId >>> 32));
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (briefName != null ? briefName.hashCode() : 0);
        result = 31 * result + (parentCode != null ? parentCode.hashCode() : 0);
        result = 31 * result + (spell != null ? spell.hashCode() : 0);
        result = 31 * result + (selectable != null ? selectable.hashCode() : 0);
        result = 31 * result + (leaf != null ? leaf.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (invalid != null ? invalid.hashCode() : 0);
        result = 31 * result + (ordinal != null ? ordinal.hashCode() : 0);
        result = 31 * result + (int) (status ^ (status >>> 32));
        result = 31 * result + (createdTime != null ? createdTime.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(createdBy);
        result = 31 * result + (lastModifiedTime != null ? lastModifiedTime.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(lastModifiedBy);
        result = 31 * result + (readonly != null ? readonly.hashCode() : 0);
        return result;
    }
}
