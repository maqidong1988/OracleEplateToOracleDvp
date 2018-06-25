package model.to.cadredb;

import javax.persistence.*;

/**
 * Created by Jay on 2018/1/23.
 *
 * @author Jay
 * @version 1.0
 * @since 1.0
 * Copyright (C) 2017. SinoSoft All Rights Received
 */
@Entity
@Table(name = "SYSTEM_CODE", catalog = "")
public class SystemCode {
    private String id;
    private String code;
    private String codeType;
    private String description;
    private String memo;
    private String pptr;

    @Id
    @Column(name = "ID", nullable = false, length = 50)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "CODE", nullable = true, length = 40)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "CODE_TYPE", nullable = true, length = 100)
    public String getCodeType() {
        return codeType;
    }

    public void setCodeType(String codeType) {
        this.codeType = codeType;
    }

    @Basic
    @Column(name = "DESCRIPTION", nullable = true, length = 1000)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "MEMO", nullable = true, length = 1000)
    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Basic
    @Column(name = "PPTR", nullable = true, length = 40)
    public String getPptr() {
        return pptr;
    }

    public void setPptr(String pptr) {
        this.pptr = pptr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SystemCode that = (SystemCode) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (codeType != null ? !codeType.equals(that.codeType) : that.codeType != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (memo != null ? !memo.equals(that.memo) : that.memo != null) return false;
        if (pptr != null ? !pptr.equals(that.pptr) : that.pptr != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (codeType != null ? codeType.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (memo != null ? memo.hashCode() : 0);
        result = 31 * result + (pptr != null ? pptr.hashCode() : 0);
        return result;
    }
}
