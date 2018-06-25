package model.to.teamdb;

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
@Table(name = "TEAM_CODE_TABLE", catalog = "")
public class TeamCodeTable {
    private String id;
    private String code;
    private String codeType;
    private String conditionName;
    private String conditionNameEnglish;
    private String description;

    @Id
    @Column(name = "ID", nullable = false, length = 36)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "CODE", nullable = true, length = 20)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "CODE_TYPE", nullable = true, length = 50)
    public String getCodeType() {
        return codeType;
    }

    public void setCodeType(String codeType) {
        this.codeType = codeType;
    }

    @Basic
    @Column(name = "CONDITION_NAME", nullable = true, length = 20)
    public String getConditionName() {
        return conditionName;
    }

    public void setConditionName(String conditionName) {
        this.conditionName = conditionName;
    }

    @Basic
    @Column(name = "CONDITION_NAME_ENGLISH", nullable = true, length = 20)
    public String getConditionNameEnglish() {
        return conditionNameEnglish;
    }

    public void setConditionNameEnglish(String conditionNameEnglish) {
        this.conditionNameEnglish = conditionNameEnglish;
    }

    @Basic
    @Column(name = "DESCRIPTION", nullable = true, length = 500)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TeamCodeTable that = (TeamCodeTable) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (codeType != null ? !codeType.equals(that.codeType) : that.codeType != null) return false;
        if (conditionName != null ? !conditionName.equals(that.conditionName) : that.conditionName != null)
            return false;
        if (conditionNameEnglish != null ? !conditionNameEnglish.equals(that.conditionNameEnglish) : that.conditionNameEnglish != null)
            return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (codeType != null ? codeType.hashCode() : 0);
        result = 31 * result + (conditionName != null ? conditionName.hashCode() : 0);
        result = 31 * result + (conditionNameEnglish != null ? conditionNameEnglish.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
