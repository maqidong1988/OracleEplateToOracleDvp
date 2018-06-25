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
@Table(name = "UNIT_OF_BIJIE", catalog = "")
public class UnitOfBijie {
    private String id;
    private String abbreviation;
    private String administrativeDivision;
    private String affiliationType;
    private String affiliationUnitCode;
    private String affiliationUnitName;
    private String ageUnderThirtyFiveStaff;
    private String agencyRegistrationCode;
    private String appropriationForm;
    private Timestamp approvalEstablishmentDate;
    private String approveUndoNumber;
    private String approvedEstablishmentCode;
    private String approvedEstablishmentName;
    private String categoryId;
    private String code;
    private String companyName;
    private String corporateIdentity;
    private Timestamp dateOfEstablishment;
    private String description;
    private String economicType;
    private String establishmentSymbol;
    private String fullDescription;
    private String jobFunction;
    private String leadershipTeamCode;
    private String leadershipTeamName;
    private String levelOfUnit;
    private String managementUnitCode;
    private String managementUnitName;
    private String natureCategory;
    private String numberOfStaff;
    private String numberOfTechnicalStaff;
    private String numberOfWorkers;
    private String parentCode;
    private String principal;
    private String revokesApprovalUnitCode;
    private String revokesApprovalUnitName;
    private String spell;
    private String status;
    private Timestamp storeTimeFromEplatform;
    private String teamCooperationCode;
    private String teamCooperationName;
    private String theSecondNameOfTheUnit;
    private String theThirdNameOfTheUnit;
    private String uniformSocialCreditCode;
    private String unitAbbreviation;
    private String unitAffiliationLevel;
    private String unitBelongsToTheIndustry;
    private String unitIsResidentCountry;
    private Timestamp withdrawsApprovalDate;

    @Id
    @Column(name = "ID", nullable = false, length = 36)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ABBREVIATION", nullable = true, length = 20)
    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    @Basic
    @Column(name = "ADMINISTRATIVE_DIVISION", nullable = true, length = 6)
    public String getAdministrativeDivision() {
        return administrativeDivision;
    }

    public void setAdministrativeDivision(String administrativeDivision) {
        this.administrativeDivision = administrativeDivision;
    }

    @Basic
    @Column(name = "AFFILIATION_TYPE", nullable = true, length = 1)
    public String getAffiliationType() {
        return affiliationType;
    }

    public void setAffiliationType(String affiliationType) {
        this.affiliationType = affiliationType;
    }

    @Basic
    @Column(name = "AFFILIATION_UNIT_CODE", nullable = true, length = 15)
    public String getAffiliationUnitCode() {
        return affiliationUnitCode;
    }

    public void setAffiliationUnitCode(String affiliationUnitCode) {
        this.affiliationUnitCode = affiliationUnitCode;
    }

    @Basic
    @Column(name = "AFFILIATION_UNIT_NAME", nullable = true, length = 120)
    public String getAffiliationUnitName() {
        return affiliationUnitName;
    }

    public void setAffiliationUnitName(String affiliationUnitName) {
        this.affiliationUnitName = affiliationUnitName;
    }

    @Basic
    @Column(name = "AGE_UNDER_THIRTY_FIVE_STAFF", nullable = true, length = 10)
    public String getAgeUnderThirtyFiveStaff() {
        return ageUnderThirtyFiveStaff;
    }

    public void setAgeUnderThirtyFiveStaff(String ageUnderThirtyFiveStaff) {
        this.ageUnderThirtyFiveStaff = ageUnderThirtyFiveStaff;
    }

    @Basic
    @Column(name = "AGENCY_REGISTRATION_CODE", nullable = true, length = 30)
    public String getAgencyRegistrationCode() {
        return agencyRegistrationCode;
    }

    public void setAgencyRegistrationCode(String agencyRegistrationCode) {
        this.agencyRegistrationCode = agencyRegistrationCode;
    }

    @Basic
    @Column(name = "APPROPRIATION_FORM", nullable = true, length = 1)
    public String getAppropriationForm() {
        return appropriationForm;
    }

    public void setAppropriationForm(String appropriationForm) {
        this.appropriationForm = appropriationForm;
    }

    @Basic
    @Column(name = "APPROVAL_ESTABLISHMENT_DATE", nullable = true)
    public Timestamp getApprovalEstablishmentDate() {
        return approvalEstablishmentDate;
    }

    public void setApprovalEstablishmentDate(Timestamp approvalEstablishmentDate) {
        this.approvalEstablishmentDate = approvalEstablishmentDate;
    }

    @Basic
    @Column(name = "APPROVE_UNDO_NUMBER", nullable = true, length = 48)
    public String getApproveUndoNumber() {
        return approveUndoNumber;
    }

    public void setApproveUndoNumber(String approveUndoNumber) {
        this.approveUndoNumber = approveUndoNumber;
    }

    @Basic
    @Column(name = "APPROVED_ESTABLISHMENT_CODE", nullable = true, length = 18)
    public String getApprovedEstablishmentCode() {
        return approvedEstablishmentCode;
    }

    public void setApprovedEstablishmentCode(String approvedEstablishmentCode) {
        this.approvedEstablishmentCode = approvedEstablishmentCode;
    }

    @Basic
    @Column(name = "APPROVED_ESTABLISHMENT_NAME", nullable = true, length = 120)
    public String getApprovedEstablishmentName() {
        return approvedEstablishmentName;
    }

    public void setApprovedEstablishmentName(String approvedEstablishmentName) {
        this.approvedEstablishmentName = approvedEstablishmentName;
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
    @Column(name = "CODE", nullable = true, length = 200)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "COMPANY_NAME", nullable = true, length = 120)
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Basic
    @Column(name = "CORPORATE_IDENTITY", nullable = true, length = 1)
    public String getCorporateIdentity() {
        return corporateIdentity;
    }

    public void setCorporateIdentity(String corporateIdentity) {
        this.corporateIdentity = corporateIdentity;
    }

    @Basic
    @Column(name = "DATE_OF_ESTABLISHMENT", nullable = true)
    public Timestamp getDateOfEstablishment() {
        return dateOfEstablishment;
    }

    public void setDateOfEstablishment(Timestamp dateOfEstablishment) {
        this.dateOfEstablishment = dateOfEstablishment;
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
    @Column(name = "ECONOMIC_TYPE", nullable = true, length = 3)
    public String getEconomicType() {
        return economicType;
    }

    public void setEconomicType(String economicType) {
        this.economicType = economicType;
    }

    @Basic
    @Column(name = "ESTABLISHMENT_SYMBOL", nullable = true, length = 48)
    public String getEstablishmentSymbol() {
        return establishmentSymbol;
    }

    public void setEstablishmentSymbol(String establishmentSymbol) {
        this.establishmentSymbol = establishmentSymbol;
    }

    @Basic
    @Column(name = "FULL_DESCRIPTION", nullable = true, length = 200)
    public String getFullDescription() {
        return fullDescription;
    }

    public void setFullDescription(String fullDescription) {
        this.fullDescription = fullDescription;
    }

    @Basic
    @Column(name = "JOB_FUNCTION", nullable = true, length = 1000)
    public String getJobFunction() {
        return jobFunction;
    }

    public void setJobFunction(String jobFunction) {
        this.jobFunction = jobFunction;
    }

    @Basic
    @Column(name = "LEADERSHIP_TEAM_CODE", nullable = true, length = 18)
    public String getLeadershipTeamCode() {
        return leadershipTeamCode;
    }

    public void setLeadershipTeamCode(String leadershipTeamCode) {
        this.leadershipTeamCode = leadershipTeamCode;
    }

    @Basic
    @Column(name = "LEADERSHIP_TEAM_NAME", nullable = true, length = 120)
    public String getLeadershipTeamName() {
        return leadershipTeamName;
    }

    public void setLeadershipTeamName(String leadershipTeamName) {
        this.leadershipTeamName = leadershipTeamName;
    }

    @Basic
    @Column(name = "LEVEL_OF_UNIT", nullable = true, length = 4)
    public String getLevelOfUnit() {
        return levelOfUnit;
    }

    public void setLevelOfUnit(String levelOfUnit) {
        this.levelOfUnit = levelOfUnit;
    }

    @Basic
    @Column(name = "MANAGEMENT_UNIT_CODE", nullable = true, length = 18)
    public String getManagementUnitCode() {
        return managementUnitCode;
    }

    public void setManagementUnitCode(String managementUnitCode) {
        this.managementUnitCode = managementUnitCode;
    }

    @Basic
    @Column(name = "MANAGEMENT_UNIT_NAME", nullable = true, length = 120)
    public String getManagementUnitName() {
        return managementUnitName;
    }

    public void setManagementUnitName(String managementUnitName) {
        this.managementUnitName = managementUnitName;
    }

    @Basic
    @Column(name = "NATURE_CATEGORY", nullable = true, length = 1)
    public String getNatureCategory() {
        return natureCategory;
    }

    public void setNatureCategory(String natureCategory) {
        this.natureCategory = natureCategory;
    }

    @Basic
    @Column(name = "NUMBER_OF_STAFF", nullable = true, length = 10)
    public String getNumberOfStaff() {
        return numberOfStaff;
    }

    public void setNumberOfStaff(String numberOfStaff) {
        this.numberOfStaff = numberOfStaff;
    }

    @Basic
    @Column(name = "NUMBER_OF_TECHNICAL_STAFF", nullable = true, length = 10)
    public String getNumberOfTechnicalStaff() {
        return numberOfTechnicalStaff;
    }

    public void setNumberOfTechnicalStaff(String numberOfTechnicalStaff) {
        this.numberOfTechnicalStaff = numberOfTechnicalStaff;
    }

    @Basic
    @Column(name = "NUMBER_OF_WORKERS", nullable = true, length = 10)
    public String getNumberOfWorkers() {
        return numberOfWorkers;
    }

    public void setNumberOfWorkers(String numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
    }

    @Basic
    @Column(name = "PARENT_CODE", nullable = true, length = 200)
    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    @Basic
    @Column(name = "PRINCIPAL", nullable = true, length = 50)
    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    @Basic
    @Column(name = "REVOKES_APPROVAL_UNIT_CODE", nullable = true, length = 15)
    public String getRevokesApprovalUnitCode() {
        return revokesApprovalUnitCode;
    }

    public void setRevokesApprovalUnitCode(String revokesApprovalUnitCode) {
        this.revokesApprovalUnitCode = revokesApprovalUnitCode;
    }

    @Basic
    @Column(name = "REVOKES_APPROVAL_UNIT_NAME", nullable = true, length = 120)
    public String getRevokesApprovalUnitName() {
        return revokesApprovalUnitName;
    }

    public void setRevokesApprovalUnitName(String revokesApprovalUnitName) {
        this.revokesApprovalUnitName = revokesApprovalUnitName;
    }

    @Basic
    @Column(name = "SPELL", nullable = true, length = 200)
    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
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
    @Column(name = "STORE_TIME_FROM_EPLATFORM", nullable = true)
    public Timestamp getStoreTimeFromEplatform() {
        return storeTimeFromEplatform;
    }

    public void setStoreTimeFromEplatform(Timestamp storeTimeFromEplatform) {
        this.storeTimeFromEplatform = storeTimeFromEplatform;
    }

    @Basic
    @Column(name = "TEAM_COOPERATION_CODE", nullable = true, length = 18)
    public String getTeamCooperationCode() {
        return teamCooperationCode;
    }

    public void setTeamCooperationCode(String teamCooperationCode) {
        this.teamCooperationCode = teamCooperationCode;
    }

    @Basic
    @Column(name = "TEAM_COOPERATION_NAME", nullable = true, length = 120)
    public String getTeamCooperationName() {
        return teamCooperationName;
    }

    public void setTeamCooperationName(String teamCooperationName) {
        this.teamCooperationName = teamCooperationName;
    }

    @Basic
    @Column(name = "THE_SECOND_NAME_OF_THE_UNIT", nullable = true, length = 120)
    public String getTheSecondNameOfTheUnit() {
        return theSecondNameOfTheUnit;
    }

    public void setTheSecondNameOfTheUnit(String theSecondNameOfTheUnit) {
        this.theSecondNameOfTheUnit = theSecondNameOfTheUnit;
    }

    @Basic
    @Column(name = "THE_THIRD_NAME_OF_THE_UNIT", nullable = true, length = 120)
    public String getTheThirdNameOfTheUnit() {
        return theThirdNameOfTheUnit;
    }

    public void setTheThirdNameOfTheUnit(String theThirdNameOfTheUnit) {
        this.theThirdNameOfTheUnit = theThirdNameOfTheUnit;
    }

    @Basic
    @Column(name = "UNIFORM_SOCIAL_CREDIT_CODE", nullable = true, length = 18)
    public String getUniformSocialCreditCode() {
        return uniformSocialCreditCode;
    }

    public void setUniformSocialCreditCode(String uniformSocialCreditCode) {
        this.uniformSocialCreditCode = uniformSocialCreditCode;
    }

    @Basic
    @Column(name = "UNIT_ABBREVIATION", nullable = true, length = 6)
    public String getUnitAbbreviation() {
        return unitAbbreviation;
    }

    public void setUnitAbbreviation(String unitAbbreviation) {
        this.unitAbbreviation = unitAbbreviation;
    }

    @Basic
    @Column(name = "UNIT_AFFILIATION_LEVEL", nullable = true, length = 2)
    public String getUnitAffiliationLevel() {
        return unitAffiliationLevel;
    }

    public void setUnitAffiliationLevel(String unitAffiliationLevel) {
        this.unitAffiliationLevel = unitAffiliationLevel;
    }

    @Basic
    @Column(name = "UNIT_BELONGS_TO_THE_INDUSTRY", nullable = true, length = 5)
    public String getUnitBelongsToTheIndustry() {
        return unitBelongsToTheIndustry;
    }

    public void setUnitBelongsToTheIndustry(String unitBelongsToTheIndustry) {
        this.unitBelongsToTheIndustry = unitBelongsToTheIndustry;
    }

    @Basic
    @Column(name = "UNIT_IS_RESIDENT_COUNTRY", nullable = true, length = 6)
    public String getUnitIsResidentCountry() {
        return unitIsResidentCountry;
    }

    public void setUnitIsResidentCountry(String unitIsResidentCountry) {
        this.unitIsResidentCountry = unitIsResidentCountry;
    }

    @Basic
    @Column(name = "WITHDRAWS_APPROVAL_DATE", nullable = true)
    public Timestamp getWithdrawsApprovalDate() {
        return withdrawsApprovalDate;
    }

    public void setWithdrawsApprovalDate(Timestamp withdrawsApprovalDate) {
        this.withdrawsApprovalDate = withdrawsApprovalDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UnitOfBijie that = (UnitOfBijie) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (abbreviation != null ? !abbreviation.equals(that.abbreviation) : that.abbreviation != null) return false;
        if (administrativeDivision != null ? !administrativeDivision.equals(that.administrativeDivision) : that.administrativeDivision != null)
            return false;
        if (affiliationType != null ? !affiliationType.equals(that.affiliationType) : that.affiliationType != null)
            return false;
        if (affiliationUnitCode != null ? !affiliationUnitCode.equals(that.affiliationUnitCode) : that.affiliationUnitCode != null)
            return false;
        if (affiliationUnitName != null ? !affiliationUnitName.equals(that.affiliationUnitName) : that.affiliationUnitName != null)
            return false;
        if (ageUnderThirtyFiveStaff != null ? !ageUnderThirtyFiveStaff.equals(that.ageUnderThirtyFiveStaff) : that.ageUnderThirtyFiveStaff != null)
            return false;
        if (agencyRegistrationCode != null ? !agencyRegistrationCode.equals(that.agencyRegistrationCode) : that.agencyRegistrationCode != null)
            return false;
        if (appropriationForm != null ? !appropriationForm.equals(that.appropriationForm) : that.appropriationForm != null)
            return false;
        if (approvalEstablishmentDate != null ? !approvalEstablishmentDate.equals(that.approvalEstablishmentDate) : that.approvalEstablishmentDate != null)
            return false;
        if (approveUndoNumber != null ? !approveUndoNumber.equals(that.approveUndoNumber) : that.approveUndoNumber != null)
            return false;
        if (approvedEstablishmentCode != null ? !approvedEstablishmentCode.equals(that.approvedEstablishmentCode) : that.approvedEstablishmentCode != null)
            return false;
        if (approvedEstablishmentName != null ? !approvedEstablishmentName.equals(that.approvedEstablishmentName) : that.approvedEstablishmentName != null)
            return false;
        if (categoryId != null ? !categoryId.equals(that.categoryId) : that.categoryId != null) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (companyName != null ? !companyName.equals(that.companyName) : that.companyName != null) return false;
        if (corporateIdentity != null ? !corporateIdentity.equals(that.corporateIdentity) : that.corporateIdentity != null)
            return false;
        if (dateOfEstablishment != null ? !dateOfEstablishment.equals(that.dateOfEstablishment) : that.dateOfEstablishment != null)
            return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (economicType != null ? !economicType.equals(that.economicType) : that.economicType != null) return false;
        if (establishmentSymbol != null ? !establishmentSymbol.equals(that.establishmentSymbol) : that.establishmentSymbol != null)
            return false;
        if (fullDescription != null ? !fullDescription.equals(that.fullDescription) : that.fullDescription != null)
            return false;
        if (jobFunction != null ? !jobFunction.equals(that.jobFunction) : that.jobFunction != null) return false;
        if (leadershipTeamCode != null ? !leadershipTeamCode.equals(that.leadershipTeamCode) : that.leadershipTeamCode != null)
            return false;
        if (leadershipTeamName != null ? !leadershipTeamName.equals(that.leadershipTeamName) : that.leadershipTeamName != null)
            return false;
        if (levelOfUnit != null ? !levelOfUnit.equals(that.levelOfUnit) : that.levelOfUnit != null) return false;
        if (managementUnitCode != null ? !managementUnitCode.equals(that.managementUnitCode) : that.managementUnitCode != null)
            return false;
        if (managementUnitName != null ? !managementUnitName.equals(that.managementUnitName) : that.managementUnitName != null)
            return false;
        if (natureCategory != null ? !natureCategory.equals(that.natureCategory) : that.natureCategory != null)
            return false;
        if (numberOfStaff != null ? !numberOfStaff.equals(that.numberOfStaff) : that.numberOfStaff != null)
            return false;
        if (numberOfTechnicalStaff != null ? !numberOfTechnicalStaff.equals(that.numberOfTechnicalStaff) : that.numberOfTechnicalStaff != null)
            return false;
        if (numberOfWorkers != null ? !numberOfWorkers.equals(that.numberOfWorkers) : that.numberOfWorkers != null)
            return false;
        if (parentCode != null ? !parentCode.equals(that.parentCode) : that.parentCode != null) return false;
        if (principal != null ? !principal.equals(that.principal) : that.principal != null) return false;
        if (revokesApprovalUnitCode != null ? !revokesApprovalUnitCode.equals(that.revokesApprovalUnitCode) : that.revokesApprovalUnitCode != null)
            return false;
        if (revokesApprovalUnitName != null ? !revokesApprovalUnitName.equals(that.revokesApprovalUnitName) : that.revokesApprovalUnitName != null)
            return false;
        if (spell != null ? !spell.equals(that.spell) : that.spell != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (storeTimeFromEplatform != null ? !storeTimeFromEplatform.equals(that.storeTimeFromEplatform) : that.storeTimeFromEplatform != null)
            return false;
        if (teamCooperationCode != null ? !teamCooperationCode.equals(that.teamCooperationCode) : that.teamCooperationCode != null)
            return false;
        if (teamCooperationName != null ? !teamCooperationName.equals(that.teamCooperationName) : that.teamCooperationName != null)
            return false;
        if (theSecondNameOfTheUnit != null ? !theSecondNameOfTheUnit.equals(that.theSecondNameOfTheUnit) : that.theSecondNameOfTheUnit != null)
            return false;
        if (theThirdNameOfTheUnit != null ? !theThirdNameOfTheUnit.equals(that.theThirdNameOfTheUnit) : that.theThirdNameOfTheUnit != null)
            return false;
        if (uniformSocialCreditCode != null ? !uniformSocialCreditCode.equals(that.uniformSocialCreditCode) : that.uniformSocialCreditCode != null)
            return false;
        if (unitAbbreviation != null ? !unitAbbreviation.equals(that.unitAbbreviation) : that.unitAbbreviation != null)
            return false;
        if (unitAffiliationLevel != null ? !unitAffiliationLevel.equals(that.unitAffiliationLevel) : that.unitAffiliationLevel != null)
            return false;
        if (unitBelongsToTheIndustry != null ? !unitBelongsToTheIndustry.equals(that.unitBelongsToTheIndustry) : that.unitBelongsToTheIndustry != null)
            return false;
        if (unitIsResidentCountry != null ? !unitIsResidentCountry.equals(that.unitIsResidentCountry) : that.unitIsResidentCountry != null)
            return false;
        if (withdrawsApprovalDate != null ? !withdrawsApprovalDate.equals(that.withdrawsApprovalDate) : that.withdrawsApprovalDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (abbreviation != null ? abbreviation.hashCode() : 0);
        result = 31 * result + (administrativeDivision != null ? administrativeDivision.hashCode() : 0);
        result = 31 * result + (affiliationType != null ? affiliationType.hashCode() : 0);
        result = 31 * result + (affiliationUnitCode != null ? affiliationUnitCode.hashCode() : 0);
        result = 31 * result + (affiliationUnitName != null ? affiliationUnitName.hashCode() : 0);
        result = 31 * result + (ageUnderThirtyFiveStaff != null ? ageUnderThirtyFiveStaff.hashCode() : 0);
        result = 31 * result + (agencyRegistrationCode != null ? agencyRegistrationCode.hashCode() : 0);
        result = 31 * result + (appropriationForm != null ? appropriationForm.hashCode() : 0);
        result = 31 * result + (approvalEstablishmentDate != null ? approvalEstablishmentDate.hashCode() : 0);
        result = 31 * result + (approveUndoNumber != null ? approveUndoNumber.hashCode() : 0);
        result = 31 * result + (approvedEstablishmentCode != null ? approvedEstablishmentCode.hashCode() : 0);
        result = 31 * result + (approvedEstablishmentName != null ? approvedEstablishmentName.hashCode() : 0);
        result = 31 * result + (categoryId != null ? categoryId.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (companyName != null ? companyName.hashCode() : 0);
        result = 31 * result + (corporateIdentity != null ? corporateIdentity.hashCode() : 0);
        result = 31 * result + (dateOfEstablishment != null ? dateOfEstablishment.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (economicType != null ? economicType.hashCode() : 0);
        result = 31 * result + (establishmentSymbol != null ? establishmentSymbol.hashCode() : 0);
        result = 31 * result + (fullDescription != null ? fullDescription.hashCode() : 0);
        result = 31 * result + (jobFunction != null ? jobFunction.hashCode() : 0);
        result = 31 * result + (leadershipTeamCode != null ? leadershipTeamCode.hashCode() : 0);
        result = 31 * result + (leadershipTeamName != null ? leadershipTeamName.hashCode() : 0);
        result = 31 * result + (levelOfUnit != null ? levelOfUnit.hashCode() : 0);
        result = 31 * result + (managementUnitCode != null ? managementUnitCode.hashCode() : 0);
        result = 31 * result + (managementUnitName != null ? managementUnitName.hashCode() : 0);
        result = 31 * result + (natureCategory != null ? natureCategory.hashCode() : 0);
        result = 31 * result + (numberOfStaff != null ? numberOfStaff.hashCode() : 0);
        result = 31 * result + (numberOfTechnicalStaff != null ? numberOfTechnicalStaff.hashCode() : 0);
        result = 31 * result + (numberOfWorkers != null ? numberOfWorkers.hashCode() : 0);
        result = 31 * result + (parentCode != null ? parentCode.hashCode() : 0);
        result = 31 * result + (principal != null ? principal.hashCode() : 0);
        result = 31 * result + (revokesApprovalUnitCode != null ? revokesApprovalUnitCode.hashCode() : 0);
        result = 31 * result + (revokesApprovalUnitName != null ? revokesApprovalUnitName.hashCode() : 0);
        result = 31 * result + (spell != null ? spell.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (storeTimeFromEplatform != null ? storeTimeFromEplatform.hashCode() : 0);
        result = 31 * result + (teamCooperationCode != null ? teamCooperationCode.hashCode() : 0);
        result = 31 * result + (teamCooperationName != null ? teamCooperationName.hashCode() : 0);
        result = 31 * result + (theSecondNameOfTheUnit != null ? theSecondNameOfTheUnit.hashCode() : 0);
        result = 31 * result + (theThirdNameOfTheUnit != null ? theThirdNameOfTheUnit.hashCode() : 0);
        result = 31 * result + (uniformSocialCreditCode != null ? uniformSocialCreditCode.hashCode() : 0);
        result = 31 * result + (unitAbbreviation != null ? unitAbbreviation.hashCode() : 0);
        result = 31 * result + (unitAffiliationLevel != null ? unitAffiliationLevel.hashCode() : 0);
        result = 31 * result + (unitBelongsToTheIndustry != null ? unitBelongsToTheIndustry.hashCode() : 0);
        result = 31 * result + (unitIsResidentCountry != null ? unitIsResidentCountry.hashCode() : 0);
        result = 31 * result + (withdrawsApprovalDate != null ? withdrawsApprovalDate.hashCode() : 0);
        return result;
    }
}
