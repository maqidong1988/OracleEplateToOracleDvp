package model.from;

import javax.persistence.*;
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
@Table(name = "SYS_CODE_SET", catalog = "")
public class SysCodeSet {
    private long id;
    private String name;
    private String nameCn;
    private Long maxCodeLength;
    private Long type;
    private Boolean hierarchical;
    private String description;
    private Long ordinal;
    private String appId;
    private long status;
    private Timestamp createdTime;
    private byte[] createdBy;
    private Timestamp lastModifiedTime;
    private byte[] lastModifiedBy;
    private long version;
    private Boolean leaf;
    private Integer parentId;

    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "NAME", nullable = false, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "NAME_CN", nullable = true, length = 100)
    public String getNameCn() {
        return nameCn;
    }

    public void setNameCn(String nameCn) {
        this.nameCn = nameCn;
    }

    @Basic
    @Column(name = "MAX_CODE_LENGTH", nullable = true, precision = 0)
    public Long getMaxCodeLength() {
        return maxCodeLength;
    }

    public void setMaxCodeLength(Long maxCodeLength) {
        this.maxCodeLength = maxCodeLength;
    }

    @Basic
    @Column(name = "TYPE", nullable = true, precision = 0)
    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    @Basic
    @Column(name = "HIERARCHICAL", nullable = true, precision = 0)
    public Boolean getHierarchical() {
        return hierarchical;
    }

    public void setHierarchical(Boolean hierarchical) {
        this.hierarchical = hierarchical;
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
    @Column(name = "ORDINAL", nullable = true, precision = 0)
    public Long getOrdinal() {
        return ordinal;
    }

    public void setOrdinal(Long ordinal) {
        this.ordinal = ordinal;
    }

    @Basic
    @Column(name = "APP_ID", nullable = true, length = 36)
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
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
    @Column(name = "VERSION", nullable = false, precision = 0)
    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
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
    @Column(name = "PARENT_ID", nullable = true, precision = 0)
    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysCodeSet that = (SysCodeSet) o;

        if (id != that.id) return false;
        if (status != that.status) return false;
        if (version != that.version) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (nameCn != null ? !nameCn.equals(that.nameCn) : that.nameCn != null) return false;
        if (maxCodeLength != null ? !maxCodeLength.equals(that.maxCodeLength) : that.maxCodeLength != null)
            return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (hierarchical != null ? !hierarchical.equals(that.hierarchical) : that.hierarchical != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (ordinal != null ? !ordinal.equals(that.ordinal) : that.ordinal != null) return false;
        if (appId != null ? !appId.equals(that.appId) : that.appId != null) return false;
        if (createdTime != null ? !createdTime.equals(that.createdTime) : that.createdTime != null) return false;
        if (!Arrays.equals(createdBy, that.createdBy)) return false;
        if (lastModifiedTime != null ? !lastModifiedTime.equals(that.lastModifiedTime) : that.lastModifiedTime != null)
            return false;
        if (!Arrays.equals(lastModifiedBy, that.lastModifiedBy)) return false;
        if (leaf != null ? !leaf.equals(that.leaf) : that.leaf != null) return false;
        if (parentId != null ? !parentId.equals(that.parentId) : that.parentId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (nameCn != null ? nameCn.hashCode() : 0);
        result = 31 * result + (maxCodeLength != null ? maxCodeLength.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (hierarchical != null ? hierarchical.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (ordinal != null ? ordinal.hashCode() : 0);
        result = 31 * result + (appId != null ? appId.hashCode() : 0);
        result = 31 * result + (int) (status ^ (status >>> 32));
        result = 31 * result + (createdTime != null ? createdTime.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(createdBy);
        result = 31 * result + (lastModifiedTime != null ? lastModifiedTime.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(lastModifiedBy);
        result = 31 * result + (int) (version ^ (version >>> 32));
        result = 31 * result + (leaf != null ? leaf.hashCode() : 0);
        result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
        return result;
    }
}
