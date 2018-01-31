package com.cppib.ifrdh.entity;

import java.util.Date;
import java.util.Date;
import java.util.Date;
import java.util.Date;
import java.util.Date;
import java.util.Date;
import java.util.Date;
import java.util.Date;
import java.util.Date;
import java.util.Date;
import java.util.Date;
import java.util.Date;
import java.util.Date;
import java.util.Date;
import java.util.Date;
import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;
import javax.persistence.*;

@CsvRecord(separator = "\\|", autospanLine = true)
@Entity
@Table(name="DIF_IFRE_Assets")
public class DIF_IFRE_AssetsEntity {

	int Id;

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	public int getId() {
		return Id;
	}
	public void setId(int Id) {
		this.Id = Id;
	}

	@DataField(pos = 1)
	private Date asOfDate;
	public Date getAsOfDate() {
		return asOfDate;
	}
	public void setAsOfDate(Date asOfDate) {
		this.asOfDate = asOfDate;
	}

	@DataField(pos = 2)
	private String assetCode;
	public String getAssetCode() {
		return assetCode;
	}
	public void setAssetCode(String assetCode) {
		this.assetCode = assetCode;
	}

	@DataField(pos = 3)
	private Date finalApprovalDate;
	public Date getFinalApprovalDate() {
		return finalApprovalDate;
	}
	public void setFinalApprovalDate(Date finalApprovalDate) {
		this.finalApprovalDate = finalApprovalDate;
	}

	@DataField(pos = 4)
	private Date cppibCloseDate;
	public Date getCppibCloseDate() {
		return cppibCloseDate;
	}
	public void setCppibCloseDate(Date cppibCloseDate) {
		this.cppibCloseDate = cppibCloseDate;
	}

	@DataField(pos = 5)
	private Date firstFundingDate;
	public Date getFirstFundingDate() {
		return firstFundingDate;
	}
	public void setFirstFundingDate(Date firstFundingDate) {
		this.firstFundingDate = firstFundingDate;
	}

	@DataField(pos = 6)
	private Date commitmentStartDate;
	public Date getCommitmentStartDate() {
		return commitmentStartDate;
	}
	public void setCommitmentStartDate(Date commitmentStartDate) {
		this.commitmentStartDate = commitmentStartDate;
	}

	@DataField(pos = 7)
	private Date ownershipDate;
	public Date getOwnershipDate() {
		return ownershipDate;
	}
	public void setOwnershipDate(Date ownershipDate) {
		this.ownershipDate = ownershipDate;
	}

	@DataField(pos = 8)
	private Date dispositionDate;
	public Date getDispositionDate() {
		return dispositionDate;
	}
	public void setDispositionDate(Date dispositionDate) {
		this.dispositionDate = dispositionDate;
	}

	@DataField(pos = 9)
	private String partnerYearEndDate;
	public String getPartnerYearEndDate() {
		return partnerYearEndDate;
	}
	public void setPartnerYearEndDate(String partnerYearEndDate) {
		this.partnerYearEndDate = partnerYearEndDate;
	}

	@DataField(pos = 10)
	private Date actualConstDate;
	public Date getActualConstDate() {
		return actualConstDate;
	}
	public void setActualConstDate(Date actualConstDate) {
		this.actualConstDate = actualConstDate;
	}

	@DataField(pos = 11)
	private Date projConstCompletionDate;
	public Date getProjConstCompletionDate() {
		return projConstCompletionDate;
	}
	public void setProjConstCompletionDate(Date projConstCompletionDate) {
		this.projConstCompletionDate = projConstCompletionDate;
	}

	@DataField(pos = 12)
	private Date reforecastConstCompletionDate;
	public Date getReforecastConstCompletionDate() {
		return reforecastConstCompletionDate;
	}
	public void setReforecastConstCompletionDate(Date reforecastConstCompletionDate) {
		this.reforecastConstCompletionDate = reforecastConstCompletionDate;
	}

	@DataField(pos = 13)
	private Date projStabDate;
	public Date getProjStabDate() {
		return projStabDate;
	}
	public void setProjStabDate(Date projStabDate) {
		this.projStabDate = projStabDate;
	}

	@DataField(pos = 14)
	private Date reforecastStabDate;
	public Date getReforecastStabDate() {
		return reforecastStabDate;
	}
	public void setReforecastStabDate(Date reforecastStabDate) {
		this.reforecastStabDate = reforecastStabDate;
	}

	@DataField(pos = 15)
	private Date actualConstCompletionDate;
	public Date getActualConstCompletionDate() {
		return actualConstCompletionDate;
	}
	public void setActualConstCompletionDate(Date actualConstCompletionDate) {
		this.actualConstCompletionDate = actualConstCompletionDate;
	}

	@DataField(pos = 16)
	private Date actualStabDate;
	public Date getActualStabDate() {
		return actualStabDate;
	}
	public void setActualStabDate(Date actualStabDate) {
		this.actualStabDate = actualStabDate;
	}

	@DataField(pos = 17)
	private Double debtCarryingValue;
	public Double getDebtCarryingValue() {
		return debtCarryingValue;
	}
	public void setDebtCarryingValue(Double debtCarryingValue) {
		this.debtCarryingValue = debtCarryingValue;
	}

	@DataField(pos = 18)
	private Double assetCarryingValue;
	public Double getAssetCarryingValue() {
		return assetCarryingValue;
	}
	public void setAssetCarryingValue(Double assetCarryingValue) {
		this.assetCarryingValue = assetCarryingValue;
	}

	@DataField(pos = 19)
	private String iLevel;
	public String getILevel() {
		return iLevel;
	}
	public void setILevel(String iLevel) {
		this.iLevel = iLevel;
	}

	@DataField(pos = 20)
	private String investmentTypeIL;
	public String getInvestmentTypeIL() {
		return investmentTypeIL;
	}
	public void setInvestmentTypeIL(String investmentTypeIL) {
		this.investmentTypeIL = investmentTypeIL;
	}

	@DataField(pos = 21)
	private String investmentTypeAL;
	public String getInvestmentTypeAL() {
		return investmentTypeAL;
	}
	public void setInvestmentTypeAL(String investmentTypeAL) {
		this.investmentTypeAL = investmentTypeAL;
	}

	@DataField(pos = 22)
	private String assetCount;
	public String getAssetCount() {
		return assetCount;
	}
	public void setAssetCount(String assetCount) {
		this.assetCount = assetCount;
	}

	@DataField(pos = 23)
	private String investmentCount;
	public String getInvestmentCount() {
		return investmentCount;
	}
	public void setInvestmentCount(String investmentCount) {
		this.investmentCount = investmentCount;
	}

	@DataField(pos = 24)
	private String investmentStageAL;
	public String getInvestmentStageAL() {
		return investmentStageAL;
	}
	public void setInvestmentStageAL(String investmentStageAL) {
		this.investmentStageAL = investmentStageAL;
	}

	@DataField(pos = 25)
	private String marketType;
	public String getMarketType() {
		return marketType;
	}
	public void setMarketType(String marketType) {
		this.marketType = marketType;
	}

	@DataField(pos = 26)
	private String rEIAllocationAL;
	public String getREIAllocationAL() {
		return rEIAllocationAL;
	}
	public void setREIAllocationAL(String rEIAllocationAL) {
		this.rEIAllocationAL = rEIAllocationAL;
	}

	@DataField(pos = 27)
	private String rEIAllocationIL;
	public String getREIAllocationIL() {
		return rEIAllocationIL;
	}
	public void setREIAllocationIL(String rEIAllocationIL) {
		this.rEIAllocationIL = rEIAllocationIL;
	}

	@DataField(pos = 28)
	private String rAHierarchy;
	public String getRAHierarchy() {
		return rAHierarchy;
	}
	public void setRAHierarchy(String rAHierarchy) {
		this.rAHierarchy = rAHierarchy;
	}

	@DataField(pos = 29)
	private String entitySelectionCode;
	public String getEntitySelectionCode() {
		return entitySelectionCode;
	}
	public void setEntitySelectionCode(String entitySelectionCode) {
		this.entitySelectionCode = entitySelectionCode;
	}

	@DataField(pos = 30)
	private String emergingMarketIL;
	public String getEmergingMarketIL() {
		return emergingMarketIL;
	}
	public void setEmergingMarketIL(String emergingMarketIL) {
		this.emergingMarketIL = emergingMarketIL;
	}

	@DataField(pos = 31)
	private String emergingMarketAL;
	public String getEmergingMarketAL() {
		return emergingMarketAL;
	}
	public void setEmergingMarketAL(String emergingMarketAL) {
		this.emergingMarketAL = emergingMarketAL;
	}

	@DataField(pos = 32)
	private String fundingBucketIL;
	public String getFundingBucketIL() {
		return fundingBucketIL;
	}
	public void setFundingBucketIL(String fundingBucketIL) {
		this.fundingBucketIL = fundingBucketIL;
	}

	@DataField(pos = 33)
	private String programAssignmentIL;
	public String getProgramAssignmentIL() {
		return programAssignmentIL;
	}
	public void setProgramAssignmentIL(String programAssignmentIL) {
		this.programAssignmentIL = programAssignmentIL;
	}

	@DataField(pos = 34)
	private String cPPIBInvestmentEntity;
	public String getCPPIBInvestmentEntity() {
		return cPPIBInvestmentEntity;
	}
	public void setCPPIBInvestmentEntity(String cPPIBInvestmentEntity) {
		this.cPPIBInvestmentEntity = cPPIBInvestmentEntity;
	}

	@DataField(pos = 35)
	private String countryRegionIL;
	public String getCountryRegionIL() {
		return countryRegionIL;
	}
	public void setCountryRegionIL(String countryRegionIL) {
		this.countryRegionIL = countryRegionIL;
	}

	@DataField(pos = 36)
	private String countryRegionAL;
	public String getCountryRegionAL() {
		return countryRegionAL;
	}
	public void setCountryRegionAL(String countryRegionAL) {
		this.countryRegionAL = countryRegionAL;
	}

	@DataField(pos = 37)
	private String countryExposureIL;
	public String getCountryExposureIL() {
		return countryExposureIL;
	}
	public void setCountryExposureIL(String countryExposureIL) {
		this.countryExposureIL = countryExposureIL;
	}

	@DataField(pos = 38)
	private String currencyExposureIL;
	public String getCurrencyExposureIL() {
		return currencyExposureIL;
	}
	public void setCurrencyExposureIL(String currencyExposureIL) {
		this.currencyExposureIL = currencyExposureIL;
	}

	@DataField(pos = 39)
	private String legalEntityCurr;
	public String getLegalEntityCurr() {
		return legalEntityCurr;
	}
	public void setLegalEntityCurr(String legalEntityCurr) {
		this.legalEntityCurr = legalEntityCurr;
	}

	@DataField(pos = 40)
	private String ownershipTableCurr;
	public String getOwnershipTableCurr() {
		return ownershipTableCurr;
	}
	public void setOwnershipTableCurr(String ownershipTableCurr) {
		this.ownershipTableCurr = ownershipTableCurr;
	}

	@DataField(pos = 41)
	private String investmentManagerIL;
	public String getInvestmentManagerIL() {
		return investmentManagerIL;
	}
	public void setInvestmentManagerIL(String investmentManagerIL) {
		this.investmentManagerIL = investmentManagerIL;
	}

	@DataField(pos = 42)
	private String investmentManagerAL;
	public String getInvestmentManagerAL() {
		return investmentManagerAL;
	}
	public void setInvestmentManagerAL(String investmentManagerAL) {
		this.investmentManagerAL = investmentManagerAL;
	}

	@DataField(pos = 43)
	private String reportingClassIL;
	public String getReportingClassIL() {
		return reportingClassIL;
	}
	public void setReportingClassIL(String reportingClassIL) {
		this.reportingClassIL = reportingClassIL;
	}

	@DataField(pos = 44)
	private String fVHierarchyIL;
	public String getFVHierarchyIL() {
		return fVHierarchyIL;
	}
	public void setFVHierarchyIL(String fVHierarchyIL) {
		this.fVHierarchyIL = fVHierarchyIL;
	}

	@DataField(pos = 45)
	private String investmentCountIL;
	public String getInvestmentCountIL() {
		return investmentCountIL;
	}
	public void setInvestmentCountIL(String investmentCountIL) {
		this.investmentCountIL = investmentCountIL;
	}

	@DataField(pos = 46)
	private String performanceBenchmarkIL;
	public String getPerformanceBenchmarkIL() {
		return performanceBenchmarkIL;
	}
	public void setPerformanceBenchmarkIL(String performanceBenchmarkIL) {
		this.performanceBenchmarkIL = performanceBenchmarkIL;
	}

	@DataField(pos = 47)
	private String partnerIL;
	public String getPartnerIL() {
		return partnerIL;
	}
	public void setPartnerIL(String partnerIL) {
		this.partnerIL = partnerIL;
	}

	@DataField(pos = 48)
	private String partnerOwnershipIL;
	public String getPartnerOwnershipIL() {
		return partnerOwnershipIL;
	}
	public void setPartnerOwnershipIL(String partnerOwnershipIL) {
		this.partnerOwnershipIL = partnerOwnershipIL;
	}

	@DataField(pos = 49)
	private String reportingCurrencyAL;
	public String getReportingCurrencyAL() {
		return reportingCurrencyAL;
	}
	public void setReportingCurrencyAL(String reportingCurrencyAL) {
		this.reportingCurrencyAL = reportingCurrencyAL;
	}

	@DataField(pos = 50)
	private String reportingCurrencyIL;
	public String getReportingCurrencyIL() {
		return reportingCurrencyIL;
	}
	public void setReportingCurrencyIL(String reportingCurrencyIL) {
		this.reportingCurrencyIL = reportingCurrencyIL;
	}

	@DataField(pos = 51)
	private Double targetUnleveredIRRIL;
	public Double getTargetUnleveredIRRIL() {
		return targetUnleveredIRRIL;
	}
	public void setTargetUnleveredIRRIL(Double targetUnleveredIRRIL) {
		this.targetUnleveredIRRIL = targetUnleveredIRRIL;
	}

	@DataField(pos = 52)
	private Double targetLeveredIRRIL;
	public Double getTargetLeveredIRRIL() {
		return targetLeveredIRRIL;
	}
	public void setTargetLeveredIRRIL(Double targetLeveredIRRIL) {
		this.targetLeveredIRRIL = targetLeveredIRRIL;
	}

	@DataField(pos = 53)
	private Double ownedGrossLeasableArea;
	public Double getOwnedGrossLeasableArea() {
		return ownedGrossLeasableArea;
	}
	public void setOwnedGrossLeasableArea(Double ownedGrossLeasableArea) {
		this.ownedGrossLeasableArea = ownedGrossLeasableArea;
	}

	@DataField(pos = 54)
	private Double ownedOccupiedArea;
	public Double getOwnedOccupiedArea() {
		return ownedOccupiedArea;
	}
	public void setOwnedOccupiedArea(Double ownedOccupiedArea) {
		this.ownedOccupiedArea = ownedOccupiedArea;
	}

	@DataField(pos = 55)
	private Double totalActualDevelopmentCosts;
	public Double getTotalActualDevelopmentCosts() {
		return totalActualDevelopmentCosts;
	}
	public void setTotalActualDevelopmentCosts(Double totalActualDevelopmentCosts) {
		this.totalActualDevelopmentCosts = totalActualDevelopmentCosts;
	}

	@DataField(pos = 56)
	private Double oTHERPARTNER2OWNERSHIP;
	public Double getOTHERPARTNER2OWNERSHIP() {
		return oTHERPARTNER2OWNERSHIP;
	}
	public void setOTHERPARTNER2OWNERSHIP(Double oTHERPARTNER2OWNERSHIP) {
		this.oTHERPARTNER2OWNERSHIP = oTHERPARTNER2OWNERSHIP;
	}

	@DataField(pos = 57)
	private Double oTHERPARTNER3OWNERSHIP;
	public Double getOTHERPARTNER3OWNERSHIP() {
		return oTHERPARTNER3OWNERSHIP;
	}
	public void setOTHERPARTNER3OWNERSHIP(Double oTHERPARTNER3OWNERSHIP) {
		this.oTHERPARTNER3OWNERSHIP = oTHERPARTNER3OWNERSHIP;
	}

	@DataField(pos = 58)
	private Double managerOwnership;
	public Double getManagerOwnership() {
		return managerOwnership;
	}
	public void setManagerOwnership(Double managerOwnership) {
		this.managerOwnership = managerOwnership;
	}

	@DataField(pos = 59)
	private String sectorIL;
	public String getSectorIL() {
		return sectorIL;
	}
	public void setSectorIL(String sectorIL) {
		this.sectorIL = sectorIL;
	}

	@DataField(pos = 60)
	private String investmentName;
	public String getInvestmentName() {
		return investmentName;
	}
	public void setInvestmentName(String investmentName) {
		this.investmentName = investmentName;
	}

	@DataField(pos = 61)
	private Date dateLastRenovated;
	public Date getDateLastRenovated() {
		return dateLastRenovated;
	}
	public void setDateLastRenovated(Date dateLastRenovated) {
		this.dateLastRenovated = dateLastRenovated;
	}

	@DataField(pos = 62)
	private String developmentYield;
	public String getDevelopmentYield() {
		return developmentYield;
	}
	public void setDevelopmentYield(String developmentYield) {
		this.developmentYield = developmentYield;
	}

} 

