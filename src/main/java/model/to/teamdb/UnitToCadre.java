package model.to.teamdb;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Jay on 2018/1/23.
 *
 * @author Jay
 * @version 1.0
 * @since 1.0
 * Copyright (C) 2017. SinoSoft All Rights Received
 */
@Entity
@Table(name = "UNIT_TO_CADRE", catalog = "")
public class UnitToCadre {
    private String id;
    private String categoryId;
    private String depId;
    private String empId;
    private String levelCode;
    private Timestamp storeTimeFromEplatform;
    private String getDepId;

    @Id
    @Column(name = "ID", nullable = false, length = 36)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "CATEGORY_ID", nullable = true, length = 50)
    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    @Basic
    @Column(name = "DEP_ID", nullable = true, length = 36)
    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    @Basic
    @Column(name = "EMP_ID", nullable = true, length = 36)
    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    @Basic
    @Column(name = "LEVEL_CODE", nullable = true, length = 200)
    public String getLevelCode() {
        return levelCode;
    }

    public void setLevelCode(String levelCode) {
        this.levelCode = levelCode;
    }

    @Basic
    @Column(name = "STORE_TIME_FROM_EPLATFORM", nullable = true)
    public Timestamp getStoreTimeFromEplatform() {
        return storeTimeFromEplatform;
    }

    public void setStoreTimeFromEplatform(Timestamp storeTimeFromEplatform) {
        this.storeTimeFromEplatform = storeTimeFromEplatform;
    }

    @Basic
    @Column(name = "GET_DEP_ID", nullable = false, length = 36)
    public String getGetDepId() {
        return getDepId;
    }

    public void setGetDepId(String getDepId) {
        this.getDepId = getDepId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UnitToCadre that = (UnitToCadre) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (categoryId != null ? !categoryId.equals(that.categoryId) : that.categoryId != null) return false;
        if (depId != null ? !depId.equals(that.depId) : that.depId != null) return false;
        if (empId != null ? !empId.equals(that.empId) : that.empId != null) return false;
        if (levelCode != null ? !levelCode.equals(that.levelCode) : that.levelCode != null) return false;
        if (storeTimeFromEplatform != null ? !storeTimeFromEplatform.equals(that.storeTimeFromEplatform) : that.storeTimeFromEplatform != null)
            return false;
        if (getDepId != null ? !getDepId.equals(that.getDepId) : that.getDepId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (categoryId != null ? categoryId.hashCode() : 0);
        result = 31 * result + (depId != null ? depId.hashCode() : 0);
        result = 31 * result + (empId != null ? empId.hashCode() : 0);
        result = 31 * result + (levelCode != null ? levelCode.hashCode() : 0);
        result = 31 * result + (storeTimeFromEplatform != null ? storeTimeFromEplatform.hashCode() : 0);
        result = 31 * result + (getDepId != null ? getDepId.hashCode() : 0);
        return result;
    }
}
