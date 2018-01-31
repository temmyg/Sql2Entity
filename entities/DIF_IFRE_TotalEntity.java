package com.cppib.ifrdh.entity;

import java.util.Date;
import java.util.Date;
import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;
import javax.persistence.*;

@CsvRecord(separator = "\\|", autospanLine = true)
@Entity
@Table(name="DIF_IFRE_Total")
public class DIF_IFRE_TotalEntity {

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
	private Date dtdate;
	public Date getDtdate() {
		return dtdate;
	}
	public void setDtdate(Date dtdate) {
		this.dtdate = dtdate;
	}

	@DataField(pos = 3)
	private String assetCode;
	public String getAssetCode() {
		return assetCode;
	}
	public void setAssetCode(String assetCode) {
		this.assetCode = assetCode;
	}

	@DataField(pos = 4)
	private Double deferredTaxLiability;
	public Double getDeferredTaxLiability() {
		return deferredTaxLiability;
	}
	public void setDeferredTaxLiability(Double deferredTaxLiability) {
		this.deferredTaxLiability = deferredTaxLiability;
	}

	@DataField(pos = 5)
	private Double deferredTaxExpense;
	public Double getDeferredTaxExpense() {
		return deferredTaxExpense;
	}
	public void setDeferredTaxExpense(Double deferredTaxExpense) {
		this.deferredTaxExpense = deferredTaxExpense;
	}

	@DataField(pos = 6)
	private Double assetPrice;
	public Double getAssetPrice() {
		return assetPrice;
	}
	public void setAssetPrice(Double assetPrice) {
		this.assetPrice = assetPrice;
	}

	@DataField(pos = 7)
	private Double debtPrice;
	public Double getDebtPrice() {
		return debtPrice;
	}
	public void setDebtPrice(Double debtPrice) {
		this.debtPrice = debtPrice;
	}

	@DataField(pos = 8)
	private String ilevel;
	public String getIlevel() {
		return ilevel;
	}
	public void setIlevel(String ilevel) {
		this.ilevel = ilevel;
	}

	@DataField(pos = 9)
	private Double assetManagementFeesAccountTreeAcc;
	public Double getAssetManagementFeesAccountTreeAcc() {
		return assetManagementFeesAccountTreeAcc;
	}
	public void setAssetManagementFeesAccountTreeAcc(Double assetManagementFeesAccountTreeAcc) {
		this.assetManagementFeesAccountTreeAcc = assetManagementFeesAccountTreeAcc;
	}

	@DataField(pos = 10)
	private Double assetManagementFeesAccountTreeCdn;
	public Double getAssetManagementFeesAccountTreeCdn() {
		return assetManagementFeesAccountTreeCdn;
	}
	public void setAssetManagementFeesAccountTreeCdn(Double assetManagementFeesAccountTreeCdn) {
		this.assetManagementFeesAccountTreeCdn = assetManagementFeesAccountTreeCdn;
	}

	@DataField(pos = 11)
	private Double assetValuationAccountTreeAcc;
	public Double getAssetValuationAccountTreeAcc() {
		return assetValuationAccountTreeAcc;
	}
	public void setAssetValuationAccountTreeAcc(Double assetValuationAccountTreeAcc) {
		this.assetValuationAccountTreeAcc = assetValuationAccountTreeAcc;
	}

	@DataField(pos = 12)
	private Double assetValuationAccountTreeCdn;
	public Double getAssetValuationAccountTreeCdn() {
		return assetValuationAccountTreeCdn;
	}
	public void setAssetValuationAccountTreeCdn(Double assetValuationAccountTreeCdn) {
		this.assetValuationAccountTreeCdn = assetValuationAccountTreeCdn;
	}

	@DataField(pos = 13)
	private Double debtValuationAccountTreeAcc;
	public Double getDebtValuationAccountTreeAcc() {
		return debtValuationAccountTreeAcc;
	}
	public void setDebtValuationAccountTreeAcc(Double debtValuationAccountTreeAcc) {
		this.debtValuationAccountTreeAcc = debtValuationAccountTreeAcc;
	}

	@DataField(pos = 14)
	private Double debtValuationAccountTreeCdn;
	public Double getDebtValuationAccountTreeCdn() {
		return debtValuationAccountTreeCdn;
	}
	public void setDebtValuationAccountTreeCdn(Double debtValuationAccountTreeCdn) {
		this.debtValuationAccountTreeCdn = debtValuationAccountTreeCdn;
	}

	@DataField(pos = 15)
	private Double interestExpenseAccountTreeAcc;
	public Double getInterestExpenseAccountTreeAcc() {
		return interestExpenseAccountTreeAcc;
	}
	public void setInterestExpenseAccountTreeAcc(Double interestExpenseAccountTreeAcc) {
		this.interestExpenseAccountTreeAcc = interestExpenseAccountTreeAcc;
	}

	@DataField(pos = 16)
	private Double interestExpenseAccountTreeCdn;
	public Double getInterestExpenseAccountTreeCdn() {
		return interestExpenseAccountTreeCdn;
	}
	public void setInterestExpenseAccountTreeCdn(Double interestExpenseAccountTreeCdn) {
		this.interestExpenseAccountTreeCdn = interestExpenseAccountTreeCdn;
	}

	@DataField(pos = 17)
	private Double netInvestmentIncomeAccountTreeALAcc;
	public Double getNetInvestmentIncomeAccountTreeALAcc() {
		return netInvestmentIncomeAccountTreeALAcc;
	}
	public void setNetInvestmentIncomeAccountTreeALAcc(Double netInvestmentIncomeAccountTreeALAcc) {
		this.netInvestmentIncomeAccountTreeALAcc = netInvestmentIncomeAccountTreeALAcc;
	}

	@DataField(pos = 18)
	private Double netInvestmentIncomeAccountTreeALCdn;
	public Double getNetInvestmentIncomeAccountTreeALCdn() {
		return netInvestmentIncomeAccountTreeALCdn;
	}
	public void setNetInvestmentIncomeAccountTreeALCdn(Double netInvestmentIncomeAccountTreeALCdn) {
		this.netInvestmentIncomeAccountTreeALCdn = netInvestmentIncomeAccountTreeALCdn;
	}

	@DataField(pos = 19)
	private Double netInvestmentIncomeAccountTreeILAcc;
	public Double getNetInvestmentIncomeAccountTreeILAcc() {
		return netInvestmentIncomeAccountTreeILAcc;
	}
	public void setNetInvestmentIncomeAccountTreeILAcc(Double netInvestmentIncomeAccountTreeILAcc) {
		this.netInvestmentIncomeAccountTreeILAcc = netInvestmentIncomeAccountTreeILAcc;
	}

	@DataField(pos = 20)
	private Double netInvestmentIncomeAccountTreeILCdn;
	public Double getNetInvestmentIncomeAccountTreeILCdn() {
		return netInvestmentIncomeAccountTreeILCdn;
	}
	public void setNetInvestmentIncomeAccountTreeILCdn(Double netInvestmentIncomeAccountTreeILCdn) {
		this.netInvestmentIncomeAccountTreeILCdn = netInvestmentIncomeAccountTreeILCdn;
	}

	@DataField(pos = 21)
	private Double netOperatingIncomeAccountTreeAcc;
	public Double getNetOperatingIncomeAccountTreeAcc() {
		return netOperatingIncomeAccountTreeAcc;
	}
	public void setNetOperatingIncomeAccountTreeAcc(Double netOperatingIncomeAccountTreeAcc) {
		this.netOperatingIncomeAccountTreeAcc = netOperatingIncomeAccountTreeAcc;
	}

	@DataField(pos = 22)
	private Double netOperatingIncomeAccountTreeCdn;
	public Double getNetOperatingIncomeAccountTreeCdn() {
		return netOperatingIncomeAccountTreeCdn;
	}
	public void setNetOperatingIncomeAccountTreeCdn(Double netOperatingIncomeAccountTreeCdn) {
		this.netOperatingIncomeAccountTreeCdn = netOperatingIncomeAccountTreeCdn;
	}

	@DataField(pos = 23)
	private Double netRealizedCapitalGainLossAccountTreeAcc;
	public Double getNetRealizedCapitalGainLossAccountTreeAcc() {
		return netRealizedCapitalGainLossAccountTreeAcc;
	}
	public void setNetRealizedCapitalGainLossAccountTreeAcc(Double netRealizedCapitalGainLossAccountTreeAcc) {
		this.netRealizedCapitalGainLossAccountTreeAcc = netRealizedCapitalGainLossAccountTreeAcc;
	}

	@DataField(pos = 24)
	private Double netRealizedCapitalGainLossAccountTreeCdn;
	public Double getNetRealizedCapitalGainLossAccountTreeCdn() {
		return netRealizedCapitalGainLossAccountTreeCdn;
	}
	public void setNetRealizedCapitalGainLossAccountTreeCdn(Double netRealizedCapitalGainLossAccountTreeCdn) {
		this.netRealizedCapitalGainLossAccountTreeCdn = netRealizedCapitalGainLossAccountTreeCdn;
	}

	@DataField(pos = 25)
	private Double otherInvestmentExpensesAccountTreeAcc;
	public Double getOtherInvestmentExpensesAccountTreeAcc() {
		return otherInvestmentExpensesAccountTreeAcc;
	}
	public void setOtherInvestmentExpensesAccountTreeAcc(Double otherInvestmentExpensesAccountTreeAcc) {
		this.otherInvestmentExpensesAccountTreeAcc = otherInvestmentExpensesAccountTreeAcc;
	}

	@DataField(pos = 26)
	private Double otherInvestmentExpensesAccountTreeCdn;
	public Double getOtherInvestmentExpensesAccountTreeCdn() {
		return otherInvestmentExpensesAccountTreeCdn;
	}
	public void setOtherInvestmentExpensesAccountTreeCdn(Double otherInvestmentExpensesAccountTreeCdn) {
		this.otherInvestmentExpensesAccountTreeCdn = otherInvestmentExpensesAccountTreeCdn;
	}

	@DataField(pos = 27)
	private Double performanceFeesAccountTreeAcc;
	public Double getPerformanceFeesAccountTreeAcc() {
		return performanceFeesAccountTreeAcc;
	}
	public void setPerformanceFeesAccountTreeAcc(Double performanceFeesAccountTreeAcc) {
		this.performanceFeesAccountTreeAcc = performanceFeesAccountTreeAcc;
	}

	@DataField(pos = 28)
	private Double performanceFeesAccountTreeCdn;
	public Double getPerformanceFeesAccountTreeCdn() {
		return performanceFeesAccountTreeCdn;
	}
	public void setPerformanceFeesAccountTreeCdn(Double performanceFeesAccountTreeCdn) {
		this.performanceFeesAccountTreeCdn = performanceFeesAccountTreeCdn;
	}

	@DataField(pos = 29)
	private Double rEIGrossRealizedIncomeAccountTreeAcc;
	public Double getREIGrossRealizedIncomeAccountTreeAcc() {
		return rEIGrossRealizedIncomeAccountTreeAcc;
	}
	public void setREIGrossRealizedIncomeAccountTreeAcc(Double rEIGrossRealizedIncomeAccountTreeAcc) {
		this.rEIGrossRealizedIncomeAccountTreeAcc = rEIGrossRealizedIncomeAccountTreeAcc;
	}

	@DataField(pos = 30)
	private Double rEIGrossRealizedIncomeAccountTreeCdn;
	public Double getREIGrossRealizedIncomeAccountTreeCdn() {
		return rEIGrossRealizedIncomeAccountTreeCdn;
	}
	public void setREIGrossRealizedIncomeAccountTreeCdn(Double rEIGrossRealizedIncomeAccountTreeCdn) {
		this.rEIGrossRealizedIncomeAccountTreeCdn = rEIGrossRealizedIncomeAccountTreeCdn;
	}

	@DataField(pos = 31)
	private Double rEINetRealizedIncomeAccountTreeALAcc;
	public Double getREINetRealizedIncomeAccountTreeALAcc() {
		return rEINetRealizedIncomeAccountTreeALAcc;
	}
	public void setREINetRealizedIncomeAccountTreeALAcc(Double rEINetRealizedIncomeAccountTreeALAcc) {
		this.rEINetRealizedIncomeAccountTreeALAcc = rEINetRealizedIncomeAccountTreeALAcc;
	}

	@DataField(pos = 32)
	private Double rEINetRealizedIncomeAccountTreeALCdn;
	public Double getREINetRealizedIncomeAccountTreeALCdn() {
		return rEINetRealizedIncomeAccountTreeALCdn;
	}
	public void setREINetRealizedIncomeAccountTreeALCdn(Double rEINetRealizedIncomeAccountTreeALCdn) {
		this.rEINetRealizedIncomeAccountTreeALCdn = rEINetRealizedIncomeAccountTreeALCdn;
	}

	@DataField(pos = 33)
	private Double rEINetRealizedIncomeAccountTreeILAcc;
	public Double getREINetRealizedIncomeAccountTreeILAcc() {
		return rEINetRealizedIncomeAccountTreeILAcc;
	}
	public void setREINetRealizedIncomeAccountTreeILAcc(Double rEINetRealizedIncomeAccountTreeILAcc) {
		this.rEINetRealizedIncomeAccountTreeILAcc = rEINetRealizedIncomeAccountTreeILAcc;
	}

	@DataField(pos = 34)
	private Double rEINetRealizedIncomeAccountTreeILCdn;
	public Double getREINetRealizedIncomeAccountTreeILCdn() {
		return rEINetRealizedIncomeAccountTreeILCdn;
	}
	public void setREINetRealizedIncomeAccountTreeILCdn(Double rEINetRealizedIncomeAccountTreeILCdn) {
		this.rEINetRealizedIncomeAccountTreeILCdn = rEINetRealizedIncomeAccountTreeILCdn;
	}

	@DataField(pos = 35)
	private Double rEIUnrealizedIncomeAccountTreeAcc;
	public Double getREIUnrealizedIncomeAccountTreeAcc() {
		return rEIUnrealizedIncomeAccountTreeAcc;
	}
	public void setREIUnrealizedIncomeAccountTreeAcc(Double rEIUnrealizedIncomeAccountTreeAcc) {
		this.rEIUnrealizedIncomeAccountTreeAcc = rEIUnrealizedIncomeAccountTreeAcc;
	}

	@DataField(pos = 36)
	private Double rEIUnrealizedIncomeAccountTreeCdn;
	public Double getREIUnrealizedIncomeAccountTreeCdn() {
		return rEIUnrealizedIncomeAccountTreeCdn;
	}
	public void setREIUnrealizedIncomeAccountTreeCdn(Double rEIUnrealizedIncomeAccountTreeCdn) {
		this.rEIUnrealizedIncomeAccountTreeCdn = rEIUnrealizedIncomeAccountTreeCdn;
	}

	@DataField(pos = 37)
	private Double transactionCostsAccountTreeAcc;
	public Double getTransactionCostsAccountTreeAcc() {
		return transactionCostsAccountTreeAcc;
	}
	public void setTransactionCostsAccountTreeAcc(Double transactionCostsAccountTreeAcc) {
		this.transactionCostsAccountTreeAcc = transactionCostsAccountTreeAcc;
	}

	@DataField(pos = 38)
	private Double transactionCostsAccountTreeCdn;
	public Double getTransactionCostsAccountTreeCdn() {
		return transactionCostsAccountTreeCdn;
	}
	public void setTransactionCostsAccountTreeCdn(Double transactionCostsAccountTreeCdn) {
		this.transactionCostsAccountTreeCdn = transactionCostsAccountTreeCdn;
	}

	@DataField(pos = 39)
	private Double undistributedIncomeAccountTreeAcc;
	public Double getUndistributedIncomeAccountTreeAcc() {
		return undistributedIncomeAccountTreeAcc;
	}
	public void setUndistributedIncomeAccountTreeAcc(Double undistributedIncomeAccountTreeAcc) {
		this.undistributedIncomeAccountTreeAcc = undistributedIncomeAccountTreeAcc;
	}

	@DataField(pos = 40)
	private Double undistributedIncomeAccountTreeCdn;
	public Double getUndistributedIncomeAccountTreeCdn() {
		return undistributedIncomeAccountTreeCdn;
	}
	public void setUndistributedIncomeAccountTreeCdn(Double undistributedIncomeAccountTreeCdn) {
		this.undistributedIncomeAccountTreeCdn = undistributedIncomeAccountTreeCdn;
	}

	@DataField(pos = 41)
	private Double unrealizedFXGainLossAccountTreeAcc;
	public Double getUnrealizedFXGainLossAccountTreeAcc() {
		return unrealizedFXGainLossAccountTreeAcc;
	}
	public void setUnrealizedFXGainLossAccountTreeAcc(Double unrealizedFXGainLossAccountTreeAcc) {
		this.unrealizedFXGainLossAccountTreeAcc = unrealizedFXGainLossAccountTreeAcc;
	}

	@DataField(pos = 42)
	private Double unrealizedFXGainLossAccountTreeCdn;
	public Double getUnrealizedFXGainLossAccountTreeCdn() {
		return unrealizedFXGainLossAccountTreeCdn;
	}
	public void setUnrealizedFXGainLossAccountTreeCdn(Double unrealizedFXGainLossAccountTreeCdn) {
		this.unrealizedFXGainLossAccountTreeCdn = unrealizedFXGainLossAccountTreeCdn;
	}

	@DataField(pos = 43)
	private Double rEIGrossRealizedIncomeAccountTreeALAcc;
	public Double getREIGrossRealizedIncomeAccountTreeALAcc() {
		return rEIGrossRealizedIncomeAccountTreeALAcc;
	}
	public void setREIGrossRealizedIncomeAccountTreeALAcc(Double rEIGrossRealizedIncomeAccountTreeALAcc) {
		this.rEIGrossRealizedIncomeAccountTreeALAcc = rEIGrossRealizedIncomeAccountTreeALAcc;
	}

	@DataField(pos = 44)
	private Double rEIGrossRealizedIncomeAccountTreeALCdn;
	public Double getREIGrossRealizedIncomeAccountTreeALCdn() {
		return rEIGrossRealizedIncomeAccountTreeALCdn;
	}
	public void setREIGrossRealizedIncomeAccountTreeALCdn(Double rEIGrossRealizedIncomeAccountTreeALCdn) {
		this.rEIGrossRealizedIncomeAccountTreeALCdn = rEIGrossRealizedIncomeAccountTreeALCdn;
	}

	@DataField(pos = 45)
	private Double netSalesProceedsCdn;
	public Double getNetSalesProceedsCdn() {
		return netSalesProceedsCdn;
	}
	public void setNetSalesProceedsCdn(Double netSalesProceedsCdn) {
		this.netSalesProceedsCdn = netSalesProceedsCdn;
	}

	@DataField(pos = 46)
	private Double netSalesProceedsAcc;
	public Double getNetSalesProceedsAcc() {
		return netSalesProceedsAcc;
	}
	public void setNetSalesProceedsAcc(Double netSalesProceedsAcc) {
		this.netSalesProceedsAcc = netSalesProceedsAcc;
	}

	@DataField(pos = 47)
	private Double netSalesProceedsCdnTotal;
	public Double getNetSalesProceedsCdnTotal() {
		return netSalesProceedsCdnTotal;
	}
	public void setNetSalesProceedsCdnTotal(Double netSalesProceedsCdnTotal) {
		this.netSalesProceedsCdnTotal = netSalesProceedsCdnTotal;
	}

	@DataField(pos = 48)
	private Double netSalesProceedsAccTotal;
	public Double getNetSalesProceedsAccTotal() {
		return netSalesProceedsAccTotal;
	}
	public void setNetSalesProceedsAccTotal(Double netSalesProceedsAccTotal) {
		this.netSalesProceedsAccTotal = netSalesProceedsAccTotal;
	}

	@DataField(pos = 49)
	private Double cashDistributionsFromOperationsCdn;
	public Double getCashDistributionsFromOperationsCdn() {
		return cashDistributionsFromOperationsCdn;
	}
	public void setCashDistributionsFromOperationsCdn(Double cashDistributionsFromOperationsCdn) {
		this.cashDistributionsFromOperationsCdn = cashDistributionsFromOperationsCdn;
	}

	@DataField(pos = 50)
	private Double cashDistributionsFromOperationsAcc;
	public Double getCashDistributionsFromOperationsAcc() {
		return cashDistributionsFromOperationsAcc;
	}
	public void setCashDistributionsFromOperationsAcc(Double cashDistributionsFromOperationsAcc) {
		this.cashDistributionsFromOperationsAcc = cashDistributionsFromOperationsAcc;
	}

	@DataField(pos = 51)
	private Double distributableIncomeAcc;
	public Double getDistributableIncomeAcc() {
		return distributableIncomeAcc;
	}
	public void setDistributableIncomeAcc(Double distributableIncomeAcc) {
		this.distributableIncomeAcc = distributableIncomeAcc;
	}

	@DataField(pos = 52)
	private Double distributableIncomeCdn;
	public Double getDistributableIncomeCdn() {
		return distributableIncomeCdn;
	}
	public void setDistributableIncomeCdn(Double distributableIncomeCdn) {
		this.distributableIncomeCdn = distributableIncomeCdn;
	}

} 

