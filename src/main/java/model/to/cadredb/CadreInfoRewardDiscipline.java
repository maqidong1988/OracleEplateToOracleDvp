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
@Table(name = "CADRE_INFO_REWARD_DISCIPLINE", catalog = "")
public class CadreInfoRewardDiscipline {
    private String id;
    private String disciplineCode;
    private String disciplineCodeValue;
    private Timestamp disciplineEndTime;
    private String disciplineExplain;
    private String disciplineFrom;
    private String disciplineFromCode;
    private String disciplineName;
    private String disciplineReason;
    private String disciplineReasonValue;
    private Timestamp disciplineStartTime;
    private String honorFrom;
    private String honorName;
    private String isCriminalDiscipline;
    private String isCriminalDisciplineValue;
    private String isPunishment;
    private String isPunishmentValue;
    private String rewardCode;
    private String rewardCodeValue;
    private String rewardDisciplineSummary;
    private String rewardDisciplineType;
    private String rewardDisciplineTypeValue;
    private String rewardExplain;
    private String rewardFrom;
    private String rewardFromCode;
    private String rewardName;
    private String rewardReason;
    private String rewardReasonValue;
    private String rewardRevokeReason;
    private String rewardRevokeReasonValue;
    private Timestamp rewardRevokeTime;
    private Timestamp rewardStartTime;
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
    @Column(name = "DISCIPLINE_CODE", nullable = true, length = 4)
    public String getDisciplineCode() {
        return disciplineCode;
    }

    public void setDisciplineCode(String disciplineCode) {
        this.disciplineCode = disciplineCode;
    }

    @Basic
    @Column(name = "DISCIPLINE_CODE_VALUE", nullable = true, length = 1000)
    public String getDisciplineCodeValue() {
        return disciplineCodeValue;
    }

    public void setDisciplineCodeValue(String disciplineCodeValue) {
        this.disciplineCodeValue = disciplineCodeValue;
    }

    @Basic
    @Column(name = "DISCIPLINE_END_TIME", nullable = true)
    public Timestamp getDisciplineEndTime() {
        return disciplineEndTime;
    }

    public void setDisciplineEndTime(Timestamp disciplineEndTime) {
        this.disciplineEndTime = disciplineEndTime;
    }

    @Basic
    @Column(name = "DISCIPLINE_EXPLAIN", nullable = true, length = 4000)
    public String getDisciplineExplain() {
        return disciplineExplain;
    }

    public void setDisciplineExplain(String disciplineExplain) {
        this.disciplineExplain = disciplineExplain;
    }

    @Basic
    @Column(name = "DISCIPLINE_FROM", nullable = true, length = 240)
    public String getDisciplineFrom() {
        return disciplineFrom;
    }

    public void setDisciplineFrom(String disciplineFrom) {
        this.disciplineFrom = disciplineFrom;
    }

    @Basic
    @Column(name = "DISCIPLINE_FROM_CODE", nullable = true, length = 36)
    public String getDisciplineFromCode() {
        return disciplineFromCode;
    }

    public void setDisciplineFromCode(String disciplineFromCode) {
        this.disciplineFromCode = disciplineFromCode;
    }

    @Basic
    @Column(name = "DISCIPLINE_NAME", nullable = true, length = 400)
    public String getDisciplineName() {
        return disciplineName;
    }

    public void setDisciplineName(String disciplineName) {
        this.disciplineName = disciplineName;
    }

    @Basic
    @Column(name = "DISCIPLINE_REASON", nullable = true, length = 200)
    public String getDisciplineReason() {
        return disciplineReason;
    }

    public void setDisciplineReason(String disciplineReason) {
        this.disciplineReason = disciplineReason;
    }

    @Basic
    @Column(name = "DISCIPLINE_REASON_VALUE", nullable = true, length = 1000)
    public String getDisciplineReasonValue() {
        return disciplineReasonValue;
    }

    public void setDisciplineReasonValue(String disciplineReasonValue) {
        this.disciplineReasonValue = disciplineReasonValue;
    }

    @Basic
    @Column(name = "DISCIPLINE_START_TIME", nullable = true)
    public Timestamp getDisciplineStartTime() {
        return disciplineStartTime;
    }

    public void setDisciplineStartTime(Timestamp disciplineStartTime) {
        this.disciplineStartTime = disciplineStartTime;
    }

    @Basic
    @Column(name = "HONOR_FROM", nullable = true, length = 240)
    public String getHonorFrom() {
        return honorFrom;
    }

    public void setHonorFrom(String honorFrom) {
        this.honorFrom = honorFrom;
    }

    @Basic
    @Column(name = "HONOR_NAME", nullable = true, length = 1000)
    public String getHonorName() {
        return honorName;
    }

    public void setHonorName(String honorName) {
        this.honorName = honorName;
    }

    @Basic
    @Column(name = "IS_CRIMINAL_DISCIPLINE", nullable = true, length = 200)
    public String getIsCriminalDiscipline() {
        return isCriminalDiscipline;
    }

    public void setIsCriminalDiscipline(String isCriminalDiscipline) {
        this.isCriminalDiscipline = isCriminalDiscipline;
    }

    @Basic
    @Column(name = "IS_CRIMINAL_DISCIPLINE_VALUE", nullable = true, length = 1000)
    public String getIsCriminalDisciplineValue() {
        return isCriminalDisciplineValue;
    }

    public void setIsCriminalDisciplineValue(String isCriminalDisciplineValue) {
        this.isCriminalDisciplineValue = isCriminalDisciplineValue;
    }

    @Basic
    @Column(name = "IS_PUNISHMENT", nullable = true, length = 200)
    public String getIsPunishment() {
        return isPunishment;
    }

    public void setIsPunishment(String isPunishment) {
        this.isPunishment = isPunishment;
    }

    @Basic
    @Column(name = "IS_PUNISHMENT_VALUE", nullable = true, length = 1000)
    public String getIsPunishmentValue() {
        return isPunishmentValue;
    }

    public void setIsPunishmentValue(String isPunishmentValue) {
        this.isPunishmentValue = isPunishmentValue;
    }

    @Basic
    @Column(name = "REWARD_CODE", nullable = true, length = 8)
    public String getRewardCode() {
        return rewardCode;
    }

    public void setRewardCode(String rewardCode) {
        this.rewardCode = rewardCode;
    }

    @Basic
    @Column(name = "REWARD_CODE_VALUE", nullable = true, length = 1000)
    public String getRewardCodeValue() {
        return rewardCodeValue;
    }

    public void setRewardCodeValue(String rewardCodeValue) {
        this.rewardCodeValue = rewardCodeValue;
    }

    @Basic
    @Column(name = "REWARD_DISCIPLINE_SUMMARY", nullable = true, length = 4000)
    public String getRewardDisciplineSummary() {
        return rewardDisciplineSummary;
    }

    public void setRewardDisciplineSummary(String rewardDisciplineSummary) {
        this.rewardDisciplineSummary = rewardDisciplineSummary;
    }

    @Basic
    @Column(name = "REWARD_DISCIPLINE_TYPE", nullable = true, length = 200)
    public String getRewardDisciplineType() {
        return rewardDisciplineType;
    }

    public void setRewardDisciplineType(String rewardDisciplineType) {
        this.rewardDisciplineType = rewardDisciplineType;
    }

    @Basic
    @Column(name = "REWARD_DISCIPLINE_TYPE_VALUE", nullable = true, length = 1000)
    public String getRewardDisciplineTypeValue() {
        return rewardDisciplineTypeValue;
    }

    public void setRewardDisciplineTypeValue(String rewardDisciplineTypeValue) {
        this.rewardDisciplineTypeValue = rewardDisciplineTypeValue;
    }

    @Basic
    @Column(name = "REWARD_EXPLAIN", nullable = true, length = 4000)
    public String getRewardExplain() {
        return rewardExplain;
    }

    public void setRewardExplain(String rewardExplain) {
        this.rewardExplain = rewardExplain;
    }

    @Basic
    @Column(name = "REWARD_FROM", nullable = true, length = 1000)
    public String getRewardFrom() {
        return rewardFrom;
    }

    public void setRewardFrom(String rewardFrom) {
        this.rewardFrom = rewardFrom;
    }

    @Basic
    @Column(name = "REWARD_FROM_CODE", nullable = true, length = 140)
    public String getRewardFromCode() {
        return rewardFromCode;
    }

    public void setRewardFromCode(String rewardFromCode) {
        this.rewardFromCode = rewardFromCode;
    }

    @Basic
    @Column(name = "REWARD_NAME", nullable = true, length = 200)
    public String getRewardName() {
        return rewardName;
    }

    public void setRewardName(String rewardName) {
        this.rewardName = rewardName;
    }

    @Basic
    @Column(name = "REWARD_REASON", nullable = true, length = 200)
    public String getRewardReason() {
        return rewardReason;
    }

    public void setRewardReason(String rewardReason) {
        this.rewardReason = rewardReason;
    }

    @Basic
    @Column(name = "REWARD_REASON_VALUE", nullable = true, length = 1000)
    public String getRewardReasonValue() {
        return rewardReasonValue;
    }

    public void setRewardReasonValue(String rewardReasonValue) {
        this.rewardReasonValue = rewardReasonValue;
    }

    @Basic
    @Column(name = "REWARD_REVOKE_REASON", nullable = true, length = 200)
    public String getRewardRevokeReason() {
        return rewardRevokeReason;
    }

    public void setRewardRevokeReason(String rewardRevokeReason) {
        this.rewardRevokeReason = rewardRevokeReason;
    }

    @Basic
    @Column(name = "REWARD_REVOKE_REASON_VALUE", nullable = true, length = 1000)
    public String getRewardRevokeReasonValue() {
        return rewardRevokeReasonValue;
    }

    public void setRewardRevokeReasonValue(String rewardRevokeReasonValue) {
        this.rewardRevokeReasonValue = rewardRevokeReasonValue;
    }

    @Basic
    @Column(name = "REWARD_REVOKE_TIME", nullable = true)
    public Timestamp getRewardRevokeTime() {
        return rewardRevokeTime;
    }

    public void setRewardRevokeTime(Timestamp rewardRevokeTime) {
        this.rewardRevokeTime = rewardRevokeTime;
    }

    @Basic
    @Column(name = "REWARD_START_TIME", nullable = true)
    public Timestamp getRewardStartTime() {
        return rewardStartTime;
    }

    public void setRewardStartTime(Timestamp rewardStartTime) {
        this.rewardStartTime = rewardStartTime;
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

        CadreInfoRewardDiscipline that = (CadreInfoRewardDiscipline) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (disciplineCode != null ? !disciplineCode.equals(that.disciplineCode) : that.disciplineCode != null)
            return false;
        if (disciplineCodeValue != null ? !disciplineCodeValue.equals(that.disciplineCodeValue) : that.disciplineCodeValue != null)
            return false;
        if (disciplineEndTime != null ? !disciplineEndTime.equals(that.disciplineEndTime) : that.disciplineEndTime != null)
            return false;
        if (disciplineExplain != null ? !disciplineExplain.equals(that.disciplineExplain) : that.disciplineExplain != null)
            return false;
        if (disciplineFrom != null ? !disciplineFrom.equals(that.disciplineFrom) : that.disciplineFrom != null)
            return false;
        if (disciplineFromCode != null ? !disciplineFromCode.equals(that.disciplineFromCode) : that.disciplineFromCode != null)
            return false;
        if (disciplineName != null ? !disciplineName.equals(that.disciplineName) : that.disciplineName != null)
            return false;
        if (disciplineReason != null ? !disciplineReason.equals(that.disciplineReason) : that.disciplineReason != null)
            return false;
        if (disciplineReasonValue != null ? !disciplineReasonValue.equals(that.disciplineReasonValue) : that.disciplineReasonValue != null)
            return false;
        if (disciplineStartTime != null ? !disciplineStartTime.equals(that.disciplineStartTime) : that.disciplineStartTime != null)
            return false;
        if (honorFrom != null ? !honorFrom.equals(that.honorFrom) : that.honorFrom != null) return false;
        if (honorName != null ? !honorName.equals(that.honorName) : that.honorName != null) return false;
        if (isCriminalDiscipline != null ? !isCriminalDiscipline.equals(that.isCriminalDiscipline) : that.isCriminalDiscipline != null)
            return false;
        if (isCriminalDisciplineValue != null ? !isCriminalDisciplineValue.equals(that.isCriminalDisciplineValue) : that.isCriminalDisciplineValue != null)
            return false;
        if (isPunishment != null ? !isPunishment.equals(that.isPunishment) : that.isPunishment != null) return false;
        if (isPunishmentValue != null ? !isPunishmentValue.equals(that.isPunishmentValue) : that.isPunishmentValue != null)
            return false;
        if (rewardCode != null ? !rewardCode.equals(that.rewardCode) : that.rewardCode != null) return false;
        if (rewardCodeValue != null ? !rewardCodeValue.equals(that.rewardCodeValue) : that.rewardCodeValue != null)
            return false;
        if (rewardDisciplineSummary != null ? !rewardDisciplineSummary.equals(that.rewardDisciplineSummary) : that.rewardDisciplineSummary != null)
            return false;
        if (rewardDisciplineType != null ? !rewardDisciplineType.equals(that.rewardDisciplineType) : that.rewardDisciplineType != null)
            return false;
        if (rewardDisciplineTypeValue != null ? !rewardDisciplineTypeValue.equals(that.rewardDisciplineTypeValue) : that.rewardDisciplineTypeValue != null)
            return false;
        if (rewardExplain != null ? !rewardExplain.equals(that.rewardExplain) : that.rewardExplain != null)
            return false;
        if (rewardFrom != null ? !rewardFrom.equals(that.rewardFrom) : that.rewardFrom != null) return false;
        if (rewardFromCode != null ? !rewardFromCode.equals(that.rewardFromCode) : that.rewardFromCode != null)
            return false;
        if (rewardName != null ? !rewardName.equals(that.rewardName) : that.rewardName != null) return false;
        if (rewardReason != null ? !rewardReason.equals(that.rewardReason) : that.rewardReason != null) return false;
        if (rewardReasonValue != null ? !rewardReasonValue.equals(that.rewardReasonValue) : that.rewardReasonValue != null)
            return false;
        if (rewardRevokeReason != null ? !rewardRevokeReason.equals(that.rewardRevokeReason) : that.rewardRevokeReason != null)
            return false;
        if (rewardRevokeReasonValue != null ? !rewardRevokeReasonValue.equals(that.rewardRevokeReasonValue) : that.rewardRevokeReasonValue != null)
            return false;
        if (rewardRevokeTime != null ? !rewardRevokeTime.equals(that.rewardRevokeTime) : that.rewardRevokeTime != null)
            return false;
        if (rewardStartTime != null ? !rewardStartTime.equals(that.rewardStartTime) : that.rewardStartTime != null)
            return false;
        if (cadreId != null ? !cadreId.equals(that.cadreId) : that.cadreId != null) return false;
        if (storeTimeFromEplatform != null ? !storeTimeFromEplatform.equals(that.storeTimeFromEplatform) : that.storeTimeFromEplatform != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (disciplineCode != null ? disciplineCode.hashCode() : 0);
        result = 31 * result + (disciplineCodeValue != null ? disciplineCodeValue.hashCode() : 0);
        result = 31 * result + (disciplineEndTime != null ? disciplineEndTime.hashCode() : 0);
        result = 31 * result + (disciplineExplain != null ? disciplineExplain.hashCode() : 0);
        result = 31 * result + (disciplineFrom != null ? disciplineFrom.hashCode() : 0);
        result = 31 * result + (disciplineFromCode != null ? disciplineFromCode.hashCode() : 0);
        result = 31 * result + (disciplineName != null ? disciplineName.hashCode() : 0);
        result = 31 * result + (disciplineReason != null ? disciplineReason.hashCode() : 0);
        result = 31 * result + (disciplineReasonValue != null ? disciplineReasonValue.hashCode() : 0);
        result = 31 * result + (disciplineStartTime != null ? disciplineStartTime.hashCode() : 0);
        result = 31 * result + (honorFrom != null ? honorFrom.hashCode() : 0);
        result = 31 * result + (honorName != null ? honorName.hashCode() : 0);
        result = 31 * result + (isCriminalDiscipline != null ? isCriminalDiscipline.hashCode() : 0);
        result = 31 * result + (isCriminalDisciplineValue != null ? isCriminalDisciplineValue.hashCode() : 0);
        result = 31 * result + (isPunishment != null ? isPunishment.hashCode() : 0);
        result = 31 * result + (isPunishmentValue != null ? isPunishmentValue.hashCode() : 0);
        result = 31 * result + (rewardCode != null ? rewardCode.hashCode() : 0);
        result = 31 * result + (rewardCodeValue != null ? rewardCodeValue.hashCode() : 0);
        result = 31 * result + (rewardDisciplineSummary != null ? rewardDisciplineSummary.hashCode() : 0);
        result = 31 * result + (rewardDisciplineType != null ? rewardDisciplineType.hashCode() : 0);
        result = 31 * result + (rewardDisciplineTypeValue != null ? rewardDisciplineTypeValue.hashCode() : 0);
        result = 31 * result + (rewardExplain != null ? rewardExplain.hashCode() : 0);
        result = 31 * result + (rewardFrom != null ? rewardFrom.hashCode() : 0);
        result = 31 * result + (rewardFromCode != null ? rewardFromCode.hashCode() : 0);
        result = 31 * result + (rewardName != null ? rewardName.hashCode() : 0);
        result = 31 * result + (rewardReason != null ? rewardReason.hashCode() : 0);
        result = 31 * result + (rewardReasonValue != null ? rewardReasonValue.hashCode() : 0);
        result = 31 * result + (rewardRevokeReason != null ? rewardRevokeReason.hashCode() : 0);
        result = 31 * result + (rewardRevokeReasonValue != null ? rewardRevokeReasonValue.hashCode() : 0);
        result = 31 * result + (rewardRevokeTime != null ? rewardRevokeTime.hashCode() : 0);
        result = 31 * result + (rewardStartTime != null ? rewardStartTime.hashCode() : 0);
        result = 31 * result + (cadreId != null ? cadreId.hashCode() : 0);
        result = 31 * result + (storeTimeFromEplatform != null ? storeTimeFromEplatform.hashCode() : 0);
        return result;
    }
}
