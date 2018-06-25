package model.to.cadredb;

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
@Table(name = "CADRE_INFO_POLITICAL_VISAGE", catalog = "")
public class CadreInfoPoliticalVisage {
    private String id;
    private String isCpcMember;
    private Timestamp partyDate;
    private String politicalVisageChanges;
    private String politicalVisageChangesValue;
    private String politicalVisageCode;
    private String politicalVisageCodeValue;
    private String politicalVisageName;
    private String politicalVisageReason;
    private String cadreId;
    private Timestamp storeTimeFromEplatform;

    @Id
    @Column(name = "ID", nullable = false, length = 50)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "IS_CPC_MEMBER", nullable = true, length = 1000)
    public String getIsCpcMember() {
        return isCpcMember;
    }

    public void setIsCpcMember(String isCpcMember) {
        this.isCpcMember = isCpcMember;
    }

    @Basic
    @Column(name = "PARTY_DATE", nullable = true)
    public Timestamp getPartyDate() {
        return partyDate;
    }

    public void setPartyDate(Timestamp partyDate) {
        this.partyDate = partyDate;
    }

    @Basic
    @Column(name = "POLITICAL_VISAGE_CHANGES", nullable = true, length = 200)
    public String getPoliticalVisageChanges() {
        return politicalVisageChanges;
    }

    public void setPoliticalVisageChanges(String politicalVisageChanges) {
        this.politicalVisageChanges = politicalVisageChanges;
    }

    @Basic
    @Column(name = "POLITICAL_VISAGE_CHANGES_VALUE", nullable = true, length = 1000)
    public String getPoliticalVisageChangesValue() {
        return politicalVisageChangesValue;
    }

    public void setPoliticalVisageChangesValue(String politicalVisageChangesValue) {
        this.politicalVisageChangesValue = politicalVisageChangesValue;
    }

    @Basic
    @Column(name = "POLITICAL_VISAGE_CODE", nullable = true, length = 40)
    public String getPoliticalVisageCode() {
        return politicalVisageCode;
    }

    public void setPoliticalVisageCode(String politicalVisageCode) {
        this.politicalVisageCode = politicalVisageCode;
    }

    @Basic
    @Column(name = "POLITICAL_VISAGE_CODE_VALUE", nullable = true, length = 1000)
    public String getPoliticalVisageCodeValue() {
        return politicalVisageCodeValue;
    }

    public void setPoliticalVisageCodeValue(String politicalVisageCodeValue) {
        this.politicalVisageCodeValue = politicalVisageCodeValue;
    }

    @Basic
    @Column(name = "POLITICAL_VISAGE_NAME", nullable = true, length = 60)
    public String getPoliticalVisageName() {
        return politicalVisageName;
    }

    public void setPoliticalVisageName(String politicalVisageName) {
        this.politicalVisageName = politicalVisageName;
    }

    @Basic
    @Column(name = "POLITICAL_VISAGE_REASON", nullable = true, length = 96)
    public String getPoliticalVisageReason() {
        return politicalVisageReason;
    }

    public void setPoliticalVisageReason(String politicalVisageReason) {
        this.politicalVisageReason = politicalVisageReason;
    }

    @Basic
    @Column(name = "CADRE_ID", nullable = true, length = 50)
    public String getCadreId() {
        return cadreId;
    }

    public void setCadreId(String cadreId) {
        this.cadreId = cadreId;
    }

    @Basic
    @Column(name = "STORE_TIME_FROM_EPLATFORM", nullable = true)
    public Timestamp getStoreTimeFromEplatform() {
        return storeTimeFromEplatform;
    }

    public void setStoreTimeFromEplatform(Timestamp storeTimeFromEplatform) {
        this.storeTimeFromEplatform = storeTimeFromEplatform;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CadreInfoPoliticalVisage that = (CadreInfoPoliticalVisage) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (isCpcMember != null ? !isCpcMember.equals(that.isCpcMember) : that.isCpcMember != null) return false;
        if (partyDate != null ? !partyDate.equals(that.partyDate) : that.partyDate != null) return false;
        if (politicalVisageChanges != null ? !politicalVisageChanges.equals(that.politicalVisageChanges) : that.politicalVisageChanges != null)
            return false;
        if (politicalVisageChangesValue != null ? !politicalVisageChangesValue.equals(that.politicalVisageChangesValue) : that.politicalVisageChangesValue != null)
            return false;
        if (politicalVisageCode != null ? !politicalVisageCode.equals(that.politicalVisageCode) : that.politicalVisageCode != null)
            return false;
        if (politicalVisageCodeValue != null ? !politicalVisageCodeValue.equals(that.politicalVisageCodeValue) : that.politicalVisageCodeValue != null)
            return false;
        if (politicalVisageName != null ? !politicalVisageName.equals(that.politicalVisageName) : that.politicalVisageName != null)
            return false;
        if (politicalVisageReason != null ? !politicalVisageReason.equals(that.politicalVisageReason) : that.politicalVisageReason != null)
            return false;
        if (cadreId != null ? !cadreId.equals(that.cadreId) : that.cadreId != null) return false;
        if (storeTimeFromEplatform != null ? !storeTimeFromEplatform.equals(that.storeTimeFromEplatform) : that.storeTimeFromEplatform != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (isCpcMember != null ? isCpcMember.hashCode() : 0);
        result = 31 * result + (partyDate != null ? partyDate.hashCode() : 0);
        result = 31 * result + (politicalVisageChanges != null ? politicalVisageChanges.hashCode() : 0);
        result = 31 * result + (politicalVisageChangesValue != null ? politicalVisageChangesValue.hashCode() : 0);
        result = 31 * result + (politicalVisageCode != null ? politicalVisageCode.hashCode() : 0);
        result = 31 * result + (politicalVisageCodeValue != null ? politicalVisageCodeValue.hashCode() : 0);
        result = 31 * result + (politicalVisageName != null ? politicalVisageName.hashCode() : 0);
        result = 31 * result + (politicalVisageReason != null ? politicalVisageReason.hashCode() : 0);
        result = 31 * result + (cadreId != null ? cadreId.hashCode() : 0);
        result = 31 * result + (storeTimeFromEplatform != null ? storeTimeFromEplatform.hashCode() : 0);
        return result;
    }
}
