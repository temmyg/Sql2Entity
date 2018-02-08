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
import java.util.Date;
import java.util.Date;
import java.util.Date;
import java.util.Date;
import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;
import javax.persistence.*;

@CsvRecord(separator = "\\|", autospanLine = true)
@Entity
@Table(name="Enrichment_PhaseII")
public class Enrichment_PhaseIIEntity {

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
	private Date commitmentstartdate;
	public Date getCommitmentstartdate() {
		return commitmentstartdate;
	}
	public void setCommitmentstartdate(Date commitmentstartdate) {
		this.commitmentstartdate = commitmentstartdate;
	}

	@DataField(pos = 2)
	private Double cdn_capital_calls_for_debt;
	public Double getCdn_capital_calls_for_debt() {
		return cdn_capital_calls_for_debt;
	}
	public void setCdn_capital_calls_for_debt(Double cdn_capital_calls_for_debt) {
		this.cdn_capital_calls_for_debt = cdn_capital_calls_for_debt;
	}

	@DataField(pos = 3)
	private String investmentstagecurrent;
	public String getInvestmentstagecurrent() {
		return investmentstagecurrent;
	}
	public void setInvestmentstagecurrent(String investmentstagecurrent) {
		this.investmentstagecurrent = investmentstagecurrent;
	}

	@DataField(pos = 4)
	private Double acc_mtd_capital_return_unl;
	public Double getAcc_mtd_capital_return_unl() {
		return acc_mtd_capital_return_unl;
	}
	public void setAcc_mtd_capital_return_unl(Double acc_mtd_capital_return_unl) {
		this.acc_mtd_capital_return_unl = acc_mtd_capital_return_unl;
	}

	@DataField(pos = 5)
	private String reiallocational;
	public String getReiallocational() {
		return reiallocational;
	}
	public void setReiallocational(String reiallocational) {
		this.reiallocational = reiallocational;
	}

	@DataField(pos = 6)
	private Double cdn_mtd_fx_return_unl;
	public Double getCdn_mtd_fx_return_unl() {
		return cdn_mtd_fx_return_unl;
	}
	public void setCdn_mtd_fx_return_unl(Double cdn_mtd_fx_return_unl) {
		this.cdn_mtd_fx_return_unl = cdn_mtd_fx_return_unl;
	}

	@DataField(pos = 7)
	private Double netoperatingincomeaccounttreeacc;
	public Double getNetoperatingincomeaccounttreeacc() {
		return netoperatingincomeaccounttreeacc;
	}
	public void setNetoperatingincomeaccounttreeacc(Double netoperatingincomeaccounttreeacc) {
		this.netoperatingincomeaccounttreeacc = netoperatingincomeaccounttreeacc;
	}

	@DataField(pos = 8)
	private Date ownershipdate_dif_ifre_assets;
	public Date getOwnershipdate_dif_ifre_assets() {
		return ownershipdate_dif_ifre_assets;
	}
	public void setOwnershipdate_dif_ifre_assets(Date ownershipdate_dif_ifre_assets) {
		this.ownershipdate_dif_ifre_assets = ownershipdate_dif_ifre_assets;
	}

	@DataField(pos = 9)
	private Double performancefeesaccounttreeacc;
	public Double getPerformancefeesaccounttreeacc() {
		return performancefeesaccounttreeacc;
	}
	public void setPerformancefeesaccounttreeacc(Double performancefeesaccounttreeacc) {
		this.performancefeesaccounttreeacc = performancefeesaccounttreeacc;
	}

	@DataField(pos = 10)
	private Double debtvaluationaccounttreeacc;
	public Double getDebtvaluationaccounttreeacc() {
		return debtvaluationaccounttreeacc;
	}
	public void setDebtvaluationaccounttreeacc(Double debtvaluationaccounttreeacc) {
		this.debtvaluationaccounttreeacc = debtvaluationaccounttreeacc;
	}

	@DataField(pos = 11)
	private Double reinetrealizedincomeaccounttreealacc;
	public Double getReinetrealizedincomeaccounttreealacc() {
		return reinetrealizedincomeaccounttreealacc;
	}
	public void setReinetrealizedincomeaccounttreealacc(Double reinetrealizedincomeaccounttreealacc) {
		this.reinetrealizedincomeaccounttreealacc = reinetrealizedincomeaccounttreealacc;
	}

	@DataField(pos = 12)
	private String partneril;
	public String getPartneril() {
		return partneril;
	}
	public void setPartneril(String partneril) {
		this.partneril = partneril;
	}

	@DataField(pos = 13)
	private String sectorfocuslevel2;
	public String getSectorfocuslevel2() {
		return sectorfocuslevel2;
	}
	public void setSectorfocuslevel2(String sectorfocuslevel2) {
		this.sectorfocuslevel2 = sectorfocuslevel2;
	}

	@DataField(pos = 14)
	private Date projstabdate;
	public Date getProjstabdate() {
		return projstabdate;
	}
	public void setProjstabdate(Date projstabdate) {
		this.projstabdate = projstabdate;
	}

	@DataField(pos = 15)
	private String sector_focus_dif_ifre_df2;
	public String getSector_focus_dif_ifre_df2() {
		return sector_focus_dif_ifre_df2;
	}
	public void setSector_focus_dif_ifre_df2(String sector_focus_dif_ifre_df2) {
		this.sector_focus_dif_ifre_df2 = sector_focus_dif_ifre_df2;
	}

	@DataField(pos = 16)
	private String sold_investment;
	public String getSold_investment() {
		return sold_investment;
	}
	public void setSold_investment(String sold_investment) {
		this.sold_investment = sold_investment;
	}

	@DataField(pos = 17)
	private Double acc_capital_calls_for_debt;
	public Double getAcc_capital_calls_for_debt() {
		return acc_capital_calls_for_debt;
	}
	public void setAcc_capital_calls_for_debt(Double acc_capital_calls_for_debt) {
		this.acc_capital_calls_for_debt = acc_capital_calls_for_debt;
	}

	@DataField(pos = 18)
	private Double cdn_ytd_total_return;
	public Double getCdn_ytd_total_return() {
		return cdn_ytd_total_return;
	}
	public void setCdn_ytd_total_return(Double cdn_ytd_total_return) {
		this.cdn_ytd_total_return = cdn_ytd_total_return;
	}

	@DataField(pos = 19)
	private Double cdn_mtd_fx_return;
	public Double getCdn_mtd_fx_return() {
		return cdn_mtd_fx_return;
	}
	public void setCdn_mtd_fx_return(Double cdn_mtd_fx_return) {
		this.cdn_mtd_fx_return = cdn_mtd_fx_return;
	}

	@DataField(pos = 20)
	private Double distributableincomeacc;
	public Double getDistributableincomeacc() {
		return distributableincomeacc;
	}
	public void setDistributableincomeacc(Double distributableincomeacc) {
		this.distributableincomeacc = distributableincomeacc;
	}

	@DataField(pos = 21)
	private Double cdn_qtd_total_return_unl;
	public Double getCdn_qtd_total_return_unl() {
		return cdn_qtd_total_return_unl;
	}
	public void setCdn_qtd_total_return_unl(Double cdn_qtd_total_return_unl) {
		this.cdn_qtd_total_return_unl = cdn_qtd_total_return_unl;
	}

	@DataField(pos = 22)
	private Double acc_ytd_capital_return_unl;
	public Double getAcc_ytd_capital_return_unl() {
		return acc_ytd_capital_return_unl;
	}
	public void setAcc_ytd_capital_return_unl(Double acc_ytd_capital_return_unl) {
		this.acc_ytd_capital_return_unl = acc_ytd_capital_return_unl;
	}

	@DataField(pos = 23)
	private Double acc_qtd_fx_return_unl;
	public Double getAcc_qtd_fx_return_unl() {
		return acc_qtd_fx_return_unl;
	}
	public void setAcc_qtd_fx_return_unl(Double acc_qtd_fx_return_unl) {
		this.acc_qtd_fx_return_unl = acc_qtd_fx_return_unl;
	}

	@DataField(pos = 24)
	private Double netinvestmentincomeaccounttreeilacc;
	public Double getNetinvestmentincomeaccounttreeilacc() {
		return netinvestmentincomeaccounttreeilacc;
	}
	public void setNetinvestmentincomeaccounttreeilacc(Double netinvestmentincomeaccounttreeilacc) {
		this.netinvestmentincomeaccounttreeilacc = netinvestmentincomeaccounttreeilacc;
	}

	@DataField(pos = 25)
	private Double acc_qtd_total_return;
	public Double getAcc_qtd_total_return() {
		return acc_qtd_total_return;
	}
	public void setAcc_qtd_total_return(Double acc_qtd_total_return) {
		this.acc_qtd_total_return = acc_qtd_total_return;
	}

	@DataField(pos = 26)
	private Double cdn_qtd_fx_return;
	public Double getCdn_qtd_fx_return() {
		return cdn_qtd_fx_return;
	}
	public void setCdn_qtd_fx_return(Double cdn_qtd_fx_return) {
		this.cdn_qtd_fx_return = cdn_qtd_fx_return;
	}

	@DataField(pos = 27)
	private Double cdn_ytd_total_return_unl;
	public Double getCdn_ytd_total_return_unl() {
		return cdn_ytd_total_return_unl;
	}
	public void setCdn_ytd_total_return_unl(Double cdn_ytd_total_return_unl) {
		this.cdn_ytd_total_return_unl = cdn_ytd_total_return_unl;
	}

	@DataField(pos = 28)
	private Double asset_carrying_value_dif_ifre_df3;
	public Double getAsset_carrying_value_dif_ifre_df3() {
		return asset_carrying_value_dif_ifre_df3;
	}
	public void setAsset_carrying_value_dif_ifre_df3(Double asset_carrying_value_dif_ifre_df3) {
		this.asset_carrying_value_dif_ifre_df3 = asset_carrying_value_dif_ifre_df3;
	}

	@DataField(pos = 29)
	private Double netsalesproceedsacc;
	public Double getNetsalesproceedsacc() {
		return netsalesproceedsacc;
	}
	public void setNetsalesproceedsacc(Double netsalesproceedsacc) {
		this.netsalesproceedsacc = netsalesproceedsacc;
	}

	@DataField(pos = 30)
	private Double acc_mtd_income_return;
	public Double getAcc_mtd_income_return() {
		return acc_mtd_income_return;
	}
	public void setAcc_mtd_income_return(Double acc_mtd_income_return) {
		this.acc_mtd_income_return = acc_mtd_income_return;
	}

	@DataField(pos = 31)
	private Double asset_carrying_value_dif_ifre_df2;
	public Double getAsset_carrying_value_dif_ifre_df2() {
		return asset_carrying_value_dif_ifre_df2;
	}
	public void setAsset_carrying_value_dif_ifre_df2(Double asset_carrying_value_dif_ifre_df2) {
		this.asset_carrying_value_dif_ifre_df2 = asset_carrying_value_dif_ifre_df2;
	}

	@DataField(pos = 32)
	private Double cdn_mtd_income_return_unl;
	public Double getCdn_mtd_income_return_unl() {
		return cdn_mtd_income_return_unl;
	}
	public void setCdn_mtd_income_return_unl(Double cdn_mtd_income_return_unl) {
		this.cdn_mtd_income_return_unl = cdn_mtd_income_return_unl;
	}

	@DataField(pos = 33)
	private Date actualconstdate;
	public Date getActualconstdate() {
		return actualconstdate;
	}
	public void setActualconstdate(Date actualconstdate) {
		this.actualconstdate = actualconstdate;
	}

	@DataField(pos = 34)
	private Double undistributedincomeaccounttreeacc;
	public Double getUndistributedincomeaccounttreeacc() {
		return undistributedincomeaccounttreeacc;
	}
	public void setUndistributedincomeaccounttreeacc(Double undistributedincomeaccounttreeacc) {
		this.undistributedincomeaccounttreeacc = undistributedincomeaccounttreeacc;
	}

	@DataField(pos = 35)
	private Double totalactualdevelopmentcosts;
	public Double getTotalactualdevelopmentcosts() {
		return totalactualdevelopmentcosts;
	}
	public void setTotalactualdevelopmentcosts(Double totalactualdevelopmentcosts) {
		this.totalactualdevelopmentcosts = totalactualdevelopmentcosts;
	}

	@DataField(pos = 36)
	private Double cdn_qtd_income_return;
	public Double getCdn_qtd_income_return() {
		return cdn_qtd_income_return;
	}
	public void setCdn_qtd_income_return(Double cdn_qtd_income_return) {
		this.cdn_qtd_income_return = cdn_qtd_income_return;
	}

	@DataField(pos = 37)
	private Date windupdate;
	public Date getWindupdate() {
		return windupdate;
	}
	public void setWindupdate(Date windupdate) {
		this.windupdate = windupdate;
	}

	@DataField(pos = 38)
	private String investmentstructurelevel2;
	public String getInvestmentstructurelevel2() {
		return investmentstructurelevel2;
	}
	public void setInvestmentstructurelevel2(String investmentstructurelevel2) {
		this.investmentstructurelevel2 = investmentstructurelevel2;
	}

	@DataField(pos = 39)
	private Double developmentmarginperc;
	public Double getDevelopmentmarginperc() {
		return developmentmarginperc;
	}
	public void setDevelopmentmarginperc(Double developmentmarginperc) {
		this.developmentmarginperc = developmentmarginperc;
	}

	@DataField(pos = 40)
	private Date projconstcompletiondate;
	public Date getProjconstcompletiondate() {
		return projconstcompletiondate;
	}
	public void setProjconstcompletiondate(Date projconstcompletiondate) {
		this.projconstcompletiondate = projconstcompletiondate;
	}

	@DataField(pos = 41)
	private Double equitymultiple;
	public Double getEquitymultiple() {
		return equitymultiple;
	}
	public void setEquitymultiple(Double equitymultiple) {
		this.equitymultiple = equitymultiple;
	}

	@DataField(pos = 42)
	private Double acc_ytd_income_return;
	public Double getAcc_ytd_income_return() {
		return acc_ytd_income_return;
	}
	public void setAcc_ytd_income_return(Double acc_ytd_income_return) {
		this.acc_ytd_income_return = acc_ytd_income_return;
	}

	@DataField(pos = 43)
	private Double assetmanagementfeesaccounttreecdn;
	public Double getAssetmanagementfeesaccounttreecdn() {
		return assetmanagementfeesaccounttreecdn;
	}
	public void setAssetmanagementfeesaccounttreecdn(Double assetmanagementfeesaccounttreecdn) {
		this.assetmanagementfeesaccounttreecdn = assetmanagementfeesaccounttreecdn;
	}

	@DataField(pos = 44)
	private String reiallocationil;
	public String getReiallocationil() {
		return reiallocationil;
	}
	public void setReiallocationil(String reiallocationil) {
		this.reiallocationil = reiallocationil;
	}

	@DataField(pos = 45)
	private Double cdn_mtd_capital_return_unl;
	public Double getCdn_mtd_capital_return_unl() {
		return cdn_mtd_capital_return_unl;
	}
	public void setCdn_mtd_capital_return_unl(Double cdn_mtd_capital_return_unl) {
		this.cdn_mtd_capital_return_unl = cdn_mtd_capital_return_unl;
	}

	@DataField(pos = 46)
	private Date firstfundingdate;
	public Date getFirstfundingdate() {
		return firstfundingdate;
	}
	public void setFirstfundingdate(Date firstfundingdate) {
		this.firstfundingdate = firstfundingdate;
	}

	@DataField(pos = 47)
	private Double occupied_area;
	public Double getOccupied_area() {
		return occupied_area;
	}
	public void setOccupied_area(Double occupied_area) {
		this.occupied_area = occupied_area;
	}

	@DataField(pos = 48)
	private Double cdn_gross_invested_equity_less_debt;
	public Double getCdn_gross_invested_equity_less_debt() {
		return cdn_gross_invested_equity_less_debt;
	}
	public void setCdn_gross_invested_equity_less_debt(Double cdn_gross_invested_equity_less_debt) {
		this.cdn_gross_invested_equity_less_debt = cdn_gross_invested_equity_less_debt;
	}

	@DataField(pos = 49)
	private Double cdn_ytd_fx_return;
	public Double getCdn_ytd_fx_return() {
		return cdn_ytd_fx_return;
	}
	public void setCdn_ytd_fx_return(Double cdn_ytd_fx_return) {
		this.cdn_ytd_fx_return = cdn_ytd_fx_return;
	}

	@DataField(pos = 50)
	private Double cdn_qtd_capital_return_unl;
	public Double getCdn_qtd_capital_return_unl() {
		return cdn_qtd_capital_return_unl;
	}
	public void setCdn_qtd_capital_return_unl(Double cdn_qtd_capital_return_unl) {
		this.cdn_qtd_capital_return_unl = cdn_qtd_capital_return_unl;
	}

	@DataField(pos = 51)
	private Double assetvaluationaccounttreecdn;
	public Double getAssetvaluationaccounttreecdn() {
		return assetvaluationaccounttreecdn;
	}
	public void setAssetvaluationaccounttreecdn(Double assetvaluationaccounttreecdn) {
		this.assetvaluationaccounttreecdn = assetvaluationaccounttreecdn;
	}

	@DataField(pos = 52)
	private Date asofdate;
	public Date getAsofdate() {
		return asofdate;
	}
	public void setAsofdate(Date asofdate) {
		this.asofdate = asofdate;
	}

	@DataField(pos = 53)
	private Double unrealizedfxgainlossaccounttreeacc;
	public Double getUnrealizedfxgainlossaccounttreeacc() {
		return unrealizedfxgainlossaccounttreeacc;
	}
	public void setUnrealizedfxgainlossaccounttreeacc(Double unrealizedfxgainlossaccounttreeacc) {
		this.unrealizedfxgainlossaccounttreeacc = unrealizedfxgainlossaccounttreeacc;
	}

	@DataField(pos = 54)
	private Double acc_mtd_capital_return;
	public Double getAcc_mtd_capital_return() {
		return acc_mtd_capital_return;
	}
	public void setAcc_mtd_capital_return(Double acc_mtd_capital_return) {
		this.acc_mtd_capital_return = acc_mtd_capital_return;
	}

	@DataField(pos = 55)
	private Double netsalesproceedscdn;
	public Double getNetsalesproceedscdn() {
		return netsalesproceedscdn;
	}
	public void setNetsalesproceedscdn(Double netsalesproceedscdn) {
		this.netsalesproceedscdn = netsalesproceedscdn;
	}

	@DataField(pos = 56)
	private Double acc_permanent_roc;
	public Double getAcc_permanent_roc() {
		return acc_permanent_roc;
	}
	public void setAcc_permanent_roc(Double acc_permanent_roc) {
		this.acc_permanent_roc = acc_permanent_roc;
	}

	@DataField(pos = 57)
	private Double cdn_cost_of_asset;
	public Double getCdn_cost_of_asset() {
		return cdn_cost_of_asset;
	}
	public void setCdn_cost_of_asset(Double cdn_cost_of_asset) {
		this.cdn_cost_of_asset = cdn_cost_of_asset;
	}

	@DataField(pos = 58)
	private Double acc_qtd_income_return_unl;
	public Double getAcc_qtd_income_return_unl() {
		return acc_qtd_income_return_unl;
	}
	public void setAcc_qtd_income_return_unl(Double acc_qtd_income_return_unl) {
		this.acc_qtd_income_return_unl = acc_qtd_income_return_unl;
	}

	@DataField(pos = 59)
	private Double cashdistributionsfromoperationscdn;
	public Double getCashdistributionsfromoperationscdn() {
		return cashdistributionsfromoperationscdn;
	}
	public void setCashdistributionsfromoperationscdn(Double cashdistributionsfromoperationscdn) {
		this.cashdistributionsfromoperationscdn = cashdistributionsfromoperationscdn;
	}

	@DataField(pos = 60)
	private Double cdn_mtd_total_return_unl;
	public Double getCdn_mtd_total_return_unl() {
		return cdn_mtd_total_return_unl;
	}
	public void setCdn_mtd_total_return_unl(Double cdn_mtd_total_return_unl) {
		this.cdn_mtd_total_return_unl = cdn_mtd_total_return_unl;
	}

	@DataField(pos = 61)
	private Double interestexpenseaccounttreeacc;
	public Double getInterestexpenseaccounttreeacc() {
		return interestexpenseaccounttreeacc;
	}
	public void setInterestexpenseaccounttreeacc(Double interestexpenseaccounttreeacc) {
		this.interestexpenseaccounttreeacc = interestexpenseaccounttreeacc;
	}

	@DataField(pos = 62)
	private Double developmentyield;
	public Double getDevelopmentyield() {
		return developmentyield;
	}
	public void setDevelopmentyield(Double developmentyield) {
		this.developmentyield = developmentyield;
	}

	@DataField(pos = 63)
	private Double netinvestmentincomeaccounttreeilcdn;
	public Double getNetinvestmentincomeaccounttreeilcdn() {
		return netinvestmentincomeaccounttreeilcdn;
	}
	public void setNetinvestmentincomeaccounttreeilcdn(Double netinvestmentincomeaccounttreeilcdn) {
		this.netinvestmentincomeaccounttreeilcdn = netinvestmentincomeaccounttreeilcdn;
	}

	@DataField(pos = 64)
	private Double performancefeesaccounttreecdn;
	public Double getPerformancefeesaccounttreecdn() {
		return performancefeesaccounttreecdn;
	}
	public void setPerformancefeesaccounttreecdn(Double performancefeesaccounttreecdn) {
		this.performancefeesaccounttreecdn = performancefeesaccounttreecdn;
	}

	@DataField(pos = 65)
	private Double acc_qtd_capital_return_unl;
	public Double getAcc_qtd_capital_return_unl() {
		return acc_qtd_capital_return_unl;
	}
	public void setAcc_qtd_capital_return_unl(Double acc_qtd_capital_return_unl) {
		this.acc_qtd_capital_return_unl = acc_qtd_capital_return_unl;
	}

	@DataField(pos = 66)
	private Double acc_ytd_capital_return;
	public Double getAcc_ytd_capital_return() {
		return acc_ytd_capital_return;
	}
	public void setAcc_ytd_capital_return(Double acc_ytd_capital_return) {
		this.acc_ytd_capital_return = acc_ytd_capital_return;
	}

	@DataField(pos = 67)
	private Double cdn_ytd_fx_return_unl;
	public Double getCdn_ytd_fx_return_unl() {
		return cdn_ytd_fx_return_unl;
	}
	public void setCdn_ytd_fx_return_unl(Double cdn_ytd_fx_return_unl) {
		this.cdn_ytd_fx_return_unl = cdn_ytd_fx_return_unl;
	}

	@DataField(pos = 68)
	private Double acc_ytd_fx_return;
	public Double getAcc_ytd_fx_return() {
		return acc_ytd_fx_return;
	}
	public void setAcc_ytd_fx_return(Double acc_ytd_fx_return) {
		this.acc_ytd_fx_return = acc_ytd_fx_return;
	}

	@DataField(pos = 69)
	private Double debt_carrying_value_dif_ifre_df3;
	public Double getDebt_carrying_value_dif_ifre_df3() {
		return debt_carrying_value_dif_ifre_df3;
	}
	public void setDebt_carrying_value_dif_ifre_df3(Double debt_carrying_value_dif_ifre_df3) {
		this.debt_carrying_value_dif_ifre_df3 = debt_carrying_value_dif_ifre_df3;
	}

	@DataField(pos = 70)
	private Date datelastrenovated;
	public Date getDatelastrenovated() {
		return datelastrenovated;
	}
	public void setDatelastrenovated(Date datelastrenovated) {
		this.datelastrenovated = datelastrenovated;
	}

	@DataField(pos = 71)
	private Double debt_carrying_value_dif_ifre_df2;
	public Double getDebt_carrying_value_dif_ifre_df2() {
		return debt_carrying_value_dif_ifre_df2;
	}
	public void setDebt_carrying_value_dif_ifre_df2(Double debt_carrying_value_dif_ifre_df2) {
		this.debt_carrying_value_dif_ifre_df2 = debt_carrying_value_dif_ifre_df2;
	}

	@DataField(pos = 72)
	private String countryregionil;
	public String getCountryregionil() {
		return countryregionil;
	}
	public void setCountryregionil(String countryregionil) {
		this.countryregionil = countryregionil;
	}

	@DataField(pos = 73)
	private Double reinetrealizedincomeaccounttreealcdn;
	public Double getReinetrealizedincomeaccounttreealcdn() {
		return reinetrealizedincomeaccounttreealcdn;
	}
	public void setReinetrealizedincomeaccounttreealcdn(Double reinetrealizedincomeaccounttreealcdn) {
		this.reinetrealizedincomeaccounttreealcdn = reinetrealizedincomeaccounttreealcdn;
	}

	@DataField(pos = 74)
	private String investment_manager_dif_ifre_df2;
	public String getInvestment_manager_dif_ifre_df2() {
		return investment_manager_dif_ifre_df2;
	}
	public void setInvestment_manager_dif_ifre_df2(String investment_manager_dif_ifre_df2) {
		this.investment_manager_dif_ifre_df2 = investment_manager_dif_ifre_df2;
	}

	@DataField(pos = 75)
	private Date actualconstcompletiondate;
	public Date getActualconstcompletiondate() {
		return actualconstcompletiondate;
	}
	public void setActualconstcompletiondate(Date actualconstcompletiondate) {
		this.actualconstcompletiondate = actualconstcompletiondate;
	}

	@DataField(pos = 76)
	private Date dispositiondate;
	public Date getDispositiondate() {
		return dispositiondate;
	}
	public void setDispositiondate(Date dispositiondate) {
		this.dispositiondate = dispositiondate;
	}

	@DataField(pos = 77)
	private Double cdn_ytd_income_return_unl;
	public Double getCdn_ytd_income_return_unl() {
		return cdn_ytd_income_return_unl;
	}
	public void setCdn_ytd_income_return_unl(Double cdn_ytd_income_return_unl) {
		this.cdn_ytd_income_return_unl = cdn_ytd_income_return_unl;
	}

	@DataField(pos = 78)
	private Double cdn_qtd_capital_return;
	public Double getCdn_qtd_capital_return() {
		return cdn_qtd_capital_return;
	}
	public void setCdn_qtd_capital_return(Double cdn_qtd_capital_return) {
		this.cdn_qtd_capital_return = cdn_qtd_capital_return;
	}

	@DataField(pos = 79)
	private String investment_aggregation_grouped_entity_dif_ifre_df2;
	public String getInvestment_aggregation_grouped_entity_dif_ifre_df2() {
		return investment_aggregation_grouped_entity_dif_ifre_df2;
	}
	public void setInvestment_aggregation_grouped_entity_dif_ifre_df2(String investment_aggregation_grouped_entity_dif_ifre_df2) {
		this.investment_aggregation_grouped_entity_dif_ifre_df2 = investment_aggregation_grouped_entity_dif_ifre_df2;
	}

	@DataField(pos = 80)
	private String countryregional;
	public String getCountryregional() {
		return countryregional;
	}
	public void setCountryregional(String countryregional) {
		this.countryregional = countryregional;
	}

	@DataField(pos = 81)
	private Double local_cost_of_debt;
	public Double getLocal_cost_of_debt() {
		return local_cost_of_debt;
	}
	public void setLocal_cost_of_debt(Double local_cost_of_debt) {
		this.local_cost_of_debt = local_cost_of_debt;
	}

	@DataField(pos = 82)
	private Double reiunrealizedincomeaccounttreeacc;
	public Double getReiunrealizedincomeaccounttreeacc() {
		return reiunrealizedincomeaccounttreeacc;
	}
	public void setReiunrealizedincomeaccounttreeacc(Double reiunrealizedincomeaccounttreeacc) {
		this.reiunrealizedincomeaccounttreeacc = reiunrealizedincomeaccounttreeacc;
	}

	@DataField(pos = 83)
	private Double cdn_ytd_capital_return_unl;
	public Double getCdn_ytd_capital_return_unl() {
		return cdn_ytd_capital_return_unl;
	}
	public void setCdn_ytd_capital_return_unl(Double cdn_ytd_capital_return_unl) {
		this.cdn_ytd_capital_return_unl = cdn_ytd_capital_return_unl;
	}

	@DataField(pos = 84)
	private Double acc_gross_invested_equity_less_debt;
	public Double getAcc_gross_invested_equity_less_debt() {
		return acc_gross_invested_equity_less_debt;
	}
	public void setAcc_gross_invested_equity_less_debt(Double acc_gross_invested_equity_less_debt) {
		this.acc_gross_invested_equity_less_debt = acc_gross_invested_equity_less_debt;
	}

	@DataField(pos = 85)
	private Date actualstabdate;
	public Date getActualstabdate() {
		return actualstabdate;
	}
	public void setActualstabdate(Date actualstabdate) {
		this.actualstabdate = actualstabdate;
	}

	@DataField(pos = 86)
	private Double cdn_mtd_capital_return;
	public Double getCdn_mtd_capital_return() {
		return cdn_mtd_capital_return;
	}
	public void setCdn_mtd_capital_return(Double cdn_mtd_capital_return) {
		this.cdn_mtd_capital_return = cdn_mtd_capital_return;
	}

	@DataField(pos = 87)
	private Double acc_mtd_fx_return;
	public Double getAcc_mtd_fx_return() {
		return acc_mtd_fx_return;
	}
	public void setAcc_mtd_fx_return(Double acc_mtd_fx_return) {
		this.acc_mtd_fx_return = acc_mtd_fx_return;
	}

	@DataField(pos = 88)
	private Double commitment_dif_ifre_df3;
	public Double getCommitment_dif_ifre_df3() {
		return commitment_dif_ifre_df3;
	}
	public void setCommitment_dif_ifre_df3(Double commitment_dif_ifre_df3) {
		this.commitment_dif_ifre_df3 = commitment_dif_ifre_df3;
	}

	@DataField(pos = 89)
	private Double cdn_temporary_roc;
	public Double getCdn_temporary_roc() {
		return cdn_temporary_roc;
	}
	public void setCdn_temporary_roc(Double cdn_temporary_roc) {
		this.cdn_temporary_roc = cdn_temporary_roc;
	}

	@DataField(pos = 90)
	private Double commitment_dif_ifre_df2;
	public Double getCommitment_dif_ifre_df2() {
		return commitment_dif_ifre_df2;
	}
	public void setCommitment_dif_ifre_df2(Double commitment_dif_ifre_df2) {
		this.commitment_dif_ifre_df2 = commitment_dif_ifre_df2;
	}

	@DataField(pos = 91)
	private Double acc_mtd_fx_return_unl;
	public Double getAcc_mtd_fx_return_unl() {
		return acc_mtd_fx_return_unl;
	}
	public void setAcc_mtd_fx_return_unl(Double acc_mtd_fx_return_unl) {
		this.acc_mtd_fx_return_unl = acc_mtd_fx_return_unl;
	}

	@DataField(pos = 92)
	private String fvhierarchyil;
	public String getFvhierarchyil() {
		return fvhierarchyil;
	}
	public void setFvhierarchyil(String fvhierarchyil) {
		this.fvhierarchyil = fvhierarchyil;
	}

	@DataField(pos = 93)
	private Double acc_qtd_fx_return;
	public Double getAcc_qtd_fx_return() {
		return acc_qtd_fx_return;
	}
	public void setAcc_qtd_fx_return(Double acc_qtd_fx_return) {
		this.acc_qtd_fx_return = acc_qtd_fx_return;
	}

	@DataField(pos = 94)
	private Double acc_qtd_capital_return;
	public Double getAcc_qtd_capital_return() {
		return acc_qtd_capital_return;
	}
	public void setAcc_qtd_capital_return(Double acc_qtd_capital_return) {
		this.acc_qtd_capital_return = acc_qtd_capital_return;
	}

	@DataField(pos = 95)
	private Double cppibownershipperc;
	public Double getCppibownershipperc() {
		return cppibownershipperc;
	}
	public void setCppibownershipperc(Double cppibownershipperc) {
		this.cppibownershipperc = cppibownershipperc;
	}

	@DataField(pos = 96)
	private Double cdn_qtd_income_return_unl;
	public Double getCdn_qtd_income_return_unl() {
		return cdn_qtd_income_return_unl;
	}
	public void setCdn_qtd_income_return_unl(Double cdn_qtd_income_return_unl) {
		this.cdn_qtd_income_return_unl = cdn_qtd_income_return_unl;
	}

	@DataField(pos = 97)
	private Double acc_ytd_fx_return_unl;
	public Double getAcc_ytd_fx_return_unl() {
		return acc_ytd_fx_return_unl;
	}
	public void setAcc_ytd_fx_return_unl(Double acc_ytd_fx_return_unl) {
		this.acc_ytd_fx_return_unl = acc_ytd_fx_return_unl;
	}

	@DataField(pos = 98)
	private Double acc_qtd_income_return;
	public Double getAcc_qtd_income_return() {
		return acc_qtd_income_return;
	}
	public void setAcc_qtd_income_return(Double acc_qtd_income_return) {
		this.acc_qtd_income_return = acc_qtd_income_return;
	}

	@DataField(pos = 99)
	private Double cdn_cost_of_debt;
	public Double getCdn_cost_of_debt() {
		return cdn_cost_of_debt;
	}
	public void setCdn_cost_of_debt(Double cdn_cost_of_debt) {
		this.cdn_cost_of_debt = cdn_cost_of_debt;
	}

	@DataField(pos = 100)
	private Double reinetrealizedincomeaccounttreeilacc;
	public Double getReinetrealizedincomeaccounttreeilacc() {
		return reinetrealizedincomeaccounttreeilacc;
	}
	public void setReinetrealizedincomeaccounttreeilacc(Double reinetrealizedincomeaccounttreeilacc) {
		this.reinetrealizedincomeaccounttreeilacc = reinetrealizedincomeaccounttreeilacc;
	}

	@DataField(pos = 101)
	private String ilevel_dif_ifre_assets;
	public String getIlevel_dif_ifre_assets() {
		return ilevel_dif_ifre_assets;
	}
	public void setIlevel_dif_ifre_assets(String ilevel_dif_ifre_assets) {
		this.ilevel_dif_ifre_assets = ilevel_dif_ifre_assets;
	}

	@DataField(pos = 102)
	private Date finalapprovaldate;
	public Date getFinalapprovaldate() {
		return finalapprovaldate;
	}
	public void setFinalapprovaldate(Date finalapprovaldate) {
		this.finalapprovaldate = finalapprovaldate;
	}

	@DataField(pos = 103)
	private Double cdn_qtd_fx_return_unl;
	public Double getCdn_qtd_fx_return_unl() {
		return cdn_qtd_fx_return_unl;
	}
	public void setCdn_qtd_fx_return_unl(Double cdn_qtd_fx_return_unl) {
		this.cdn_qtd_fx_return_unl = cdn_qtd_fx_return_unl;
	}

	@DataField(pos = 104)
	private Double cdn_expenses_inside_commitment;
	public Double getCdn_expenses_inside_commitment() {
		return cdn_expenses_inside_commitment;
	}
	public void setCdn_expenses_inside_commitment(Double cdn_expenses_inside_commitment) {
		this.cdn_expenses_inside_commitment = cdn_expenses_inside_commitment;
	}

	@DataField(pos = 105)
	private Double otherinvestmentexpensesaccounttreecdn;
	public Double getOtherinvestmentexpensesaccounttreecdn() {
		return otherinvestmentexpensesaccounttreecdn;
	}
	public void setOtherinvestmentexpensesaccounttreecdn(Double otherinvestmentexpensesaccounttreecdn) {
		this.otherinvestmentexpensesaccounttreecdn = otherinvestmentexpensesaccounttreecdn;
	}

	@DataField(pos = 106)
	private String currencyexposureil;
	public String getCurrencyexposureil() {
		return currencyexposureil;
	}
	public void setCurrencyexposureil(String currencyexposureil) {
		this.currencyexposureil = currencyexposureil;
	}

	@DataField(pos = 107)
	private Double transactioncostsaccounttreeacc;
	public Double getTransactioncostsaccounttreeacc() {
		return transactioncostsaccounttreeacc;
	}
	public void setTransactioncostsaccounttreeacc(Double transactioncostsaccounttreeacc) {
		this.transactioncostsaccounttreeacc = transactioncostsaccounttreeacc;
	}

	@DataField(pos = 108)
	private Double reigrossrealizedincomeaccounttreeacc;
	public Double getReigrossrealizedincomeaccounttreeacc() {
		return reigrossrealizedincomeaccounttreeacc;
	}
	public void setReigrossrealizedincomeaccounttreeacc(Double reigrossrealizedincomeaccounttreeacc) {
		this.reigrossrealizedincomeaccounttreeacc = reigrossrealizedincomeaccounttreeacc;
	}

	@DataField(pos = 109)
	private Double netoperatingincomeaccounttreecdn;
	public Double getNetoperatingincomeaccounttreecdn() {
		return netoperatingincomeaccounttreecdn;
	}
	public void setNetoperatingincomeaccounttreecdn(Double netoperatingincomeaccounttreecdn) {
		this.netoperatingincomeaccounttreecdn = netoperatingincomeaccounttreecdn;
	}

	@DataField(pos = 110)
	private Double total_area_dif_ifre_df2;
	public Double getTotal_area_dif_ifre_df2() {
		return total_area_dif_ifre_df2;
	}
	public void setTotal_area_dif_ifre_df2(Double total_area_dif_ifre_df2) {
		this.total_area_dif_ifre_df2 = total_area_dif_ifre_df2;
	}

	@DataField(pos = 111)
	private Double reiunrealizedincomeaccounttreecdn;
	public Double getReiunrealizedincomeaccounttreecdn() {
		return reiunrealizedincomeaccounttreecdn;
	}
	public void setReiunrealizedincomeaccounttreecdn(Double reiunrealizedincomeaccounttreecdn) {
		this.reiunrealizedincomeaccounttreecdn = reiunrealizedincomeaccounttreecdn;
	}

	@DataField(pos = 112)
	private Double netrealizedcapitalgainlossaccounttreecdn;
	public Double getNetrealizedcapitalgainlossaccounttreecdn() {
		return netrealizedcapitalgainlossaccounttreecdn;
	}
	public void setNetrealizedcapitalgainlossaccounttreecdn(Double netrealizedcapitalgainlossaccounttreecdn) {
		this.netrealizedcapitalgainlossaccounttreecdn = netrealizedcapitalgainlossaccounttreecdn;
	}

	@DataField(pos = 113)
	private String assetcode;
	public String getAssetcode() {
		return assetcode;
	}
	public void setAssetcode(String assetcode) {
		this.assetcode = assetcode;
	}

	@DataField(pos = 114)
	private Date reforecastconstcompletiondate;
	public Date getReforecastconstcompletiondate() {
		return reforecastconstcompletiondate;
	}
	public void setReforecastconstcompletiondate(Date reforecastconstcompletiondate) {
		this.reforecastconstcompletiondate = reforecastconstcompletiondate;
	}

	@DataField(pos = 115)
	private Double cdn_permanent_roc;
	public Double getCdn_permanent_roc() {
		return cdn_permanent_roc;
	}
	public void setCdn_permanent_roc(Double cdn_permanent_roc) {
		this.cdn_permanent_roc = cdn_permanent_roc;
	}

	@DataField(pos = 116)
	private Double cdn_qtd_total_return;
	public Double getCdn_qtd_total_return() {
		return cdn_qtd_total_return;
	}
	public void setCdn_qtd_total_return(Double cdn_qtd_total_return) {
		this.cdn_qtd_total_return = cdn_qtd_total_return;
	}

	@DataField(pos = 117)
	private Double assetvaluationaccounttreeacc;
	public Double getAssetvaluationaccounttreeacc() {
		return assetvaluationaccounttreeacc;
	}
	public void setAssetvaluationaccounttreeacc(Double assetvaluationaccounttreeacc) {
		this.assetvaluationaccounttreeacc = assetvaluationaccounttreeacc;
	}

	@DataField(pos = 118)
	private Double netinvestmentincomeaccounttreealacc;
	public Double getNetinvestmentincomeaccounttreealacc() {
		return netinvestmentincomeaccounttreealacc;
	}
	public void setNetinvestmentincomeaccounttreealacc(Double netinvestmentincomeaccounttreealacc) {
		this.netinvestmentincomeaccounttreealacc = netinvestmentincomeaccounttreealacc;
	}

	@DataField(pos = 119)
	private String cppibinvestmententity;
	public String getCppibinvestmententity() {
		return cppibinvestmententity;
	}
	public void setCppibinvestmententity(String cppibinvestmententity) {
		this.cppibinvestmententity = cppibinvestmententity;
	}

	@DataField(pos = 120)
	private Double acc_ytd_income_return_unl;
	public Double getAcc_ytd_income_return_unl() {
		return acc_ytd_income_return_unl;
	}
	public void setAcc_ytd_income_return_unl(Double acc_ytd_income_return_unl) {
		this.acc_ytd_income_return_unl = acc_ytd_income_return_unl;
	}

	@DataField(pos = 121)
	private Double acc_ytd_total_return;
	public Double getAcc_ytd_total_return() {
		return acc_ytd_total_return;
	}
	public void setAcc_ytd_total_return(Double acc_ytd_total_return) {
		this.acc_ytd_total_return = acc_ytd_total_return;
	}

	@DataField(pos = 122)
	private Date reforecaststabdate;
	public Date getReforecaststabdate() {
		return reforecaststabdate;
	}
	public void setReforecaststabdate(Date reforecaststabdate) {
		this.reforecaststabdate = reforecaststabdate;
	}

	@DataField(pos = 123)
	private String investment_structure_dif_ifre_df2;
	public String getInvestment_structure_dif_ifre_df2() {
		return investment_structure_dif_ifre_df2;
	}
	public void setInvestment_structure_dif_ifre_df2(String investment_structure_dif_ifre_df2) {
		this.investment_structure_dif_ifre_df2 = investment_structure_dif_ifre_df2;
	}

	@DataField(pos = 124)
	private Double acc_expenses_inside_commitment;
	public Double getAcc_expenses_inside_commitment() {
		return acc_expenses_inside_commitment;
	}
	public void setAcc_expenses_inside_commitment(Double acc_expenses_inside_commitment) {
		this.acc_expenses_inside_commitment = acc_expenses_inside_commitment;
	}

	@DataField(pos = 125)
	private Double netinvestmentincomeaccounttreealcdn;
	public Double getNetinvestmentincomeaccounttreealcdn() {
		return netinvestmentincomeaccounttreealcdn;
	}
	public void setNetinvestmentincomeaccounttreealcdn(Double netinvestmentincomeaccounttreealcdn) {
		this.netinvestmentincomeaccounttreealcdn = netinvestmentincomeaccounttreealcdn;
	}

	@DataField(pos = 126)
	private String investmentstageatacquisition;
	public String getInvestmentstageatacquisition() {
		return investmentstageatacquisition;
	}
	public void setInvestmentstageatacquisition(String investmentstageatacquisition) {
		this.investmentstageatacquisition = investmentstageatacquisition;
	}

	@DataField(pos = 127)
	private Double undistributedincomeaccounttreecdn;
	public Double getUndistributedincomeaccounttreecdn() {
		return undistributedincomeaccounttreecdn;
	}
	public void setUndistributedincomeaccounttreecdn(Double undistributedincomeaccounttreecdn) {
		this.undistributedincomeaccounttreecdn = undistributedincomeaccounttreecdn;
	}

	@DataField(pos = 128)
	private Double acc_qtd_total_return_unl;
	public Double getAcc_qtd_total_return_unl() {
		return acc_qtd_total_return_unl;
	}
	public void setAcc_qtd_total_return_unl(Double acc_qtd_total_return_unl) {
		this.acc_qtd_total_return_unl = acc_qtd_total_return_unl;
	}

	@DataField(pos = 129)
	private Double otherinvestmentexpensesaccounttreeacc;
	public Double getOtherinvestmentexpensesaccounttreeacc() {
		return otherinvestmentexpensesaccounttreeacc;
	}
	public void setOtherinvestmentexpensesaccounttreeacc(Double otherinvestmentexpensesaccounttreeacc) {
		this.otherinvestmentexpensesaccounttreeacc = otherinvestmentexpensesaccounttreeacc;
	}

	@DataField(pos = 130)
	private Double equity_carrying_value_dif_ifre_df2;
	public Double getEquity_carrying_value_dif_ifre_df2() {
		return equity_carrying_value_dif_ifre_df2;
	}
	public void setEquity_carrying_value_dif_ifre_df2(Double equity_carrying_value_dif_ifre_df2) {
		this.equity_carrying_value_dif_ifre_df2 = equity_carrying_value_dif_ifre_df2;
	}

	@DataField(pos = 131)
	private Double equity_carrying_value_dif_ifre_df3;
	public Double getEquity_carrying_value_dif_ifre_df3() {
		return equity_carrying_value_dif_ifre_df3;
	}
	public void setEquity_carrying_value_dif_ifre_df3(Double equity_carrying_value_dif_ifre_df3) {
		this.equity_carrying_value_dif_ifre_df3 = equity_carrying_value_dif_ifre_df3;
	}

	@DataField(pos = 132)
	private String markettype;
	public String getMarkettype() {
		return markettype;
	}
	public void setMarkettype(String markettype) {
		this.markettype = markettype;
	}

	@DataField(pos = 133)
	private Double acc_mtd_total_return_unl;
	public Double getAcc_mtd_total_return_unl() {
		return acc_mtd_total_return_unl;
	}
	public void setAcc_mtd_total_return_unl(Double acc_mtd_total_return_unl) {
		this.acc_mtd_total_return_unl = acc_mtd_total_return_unl;
	}

	@DataField(pos = 134)
	private Date cppibclosedate;
	public Date getCppibclosedate() {
		return cppibclosedate;
	}
	public void setCppibclosedate(Date cppibclosedate) {
		this.cppibclosedate = cppibclosedate;
	}

	@DataField(pos = 135)
	private String countryexposureil;
	public String getCountryexposureil() {
		return countryexposureil;
	}
	public void setCountryexposureil(String countryexposureil) {
		this.countryexposureil = countryexposureil;
	}

	@DataField(pos = 136)
	private Double capital_additions_dif_ifre_df3;
	public Double getCapital_additions_dif_ifre_df3() {
		return capital_additions_dif_ifre_df3;
	}
	public void setCapital_additions_dif_ifre_df3(Double capital_additions_dif_ifre_df3) {
		this.capital_additions_dif_ifre_df3 = capital_additions_dif_ifre_df3;
	}

	@DataField(pos = 137)
	private Double capital_additions_dif_ifre_df2;
	public Double getCapital_additions_dif_ifre_df2() {
		return capital_additions_dif_ifre_df2;
	}
	public void setCapital_additions_dif_ifre_df2(Double capital_additions_dif_ifre_df2) {
		this.capital_additions_dif_ifre_df2 = capital_additions_dif_ifre_df2;
	}

	@DataField(pos = 138)
	private Double allocation;
	public Double getAllocation() {
		return allocation;
	}
	public void setAllocation(Double allocation) {
		this.allocation = allocation;
	}

	@DataField(pos = 139)
	private Double netrealizedcapitalgainlossaccounttreeacc;
	public Double getNetrealizedcapitalgainlossaccounttreeacc() {
		return netrealizedcapitalgainlossaccounttreeacc;
	}
	public void setNetrealizedcapitalgainlossaccounttreeacc(Double netrealizedcapitalgainlossaccounttreeacc) {
		this.netrealizedcapitalgainlossaccounttreeacc = netrealizedcapitalgainlossaccounttreeacc;
	}

	@DataField(pos = 140)
	private Double acc_mtd_total_return;
	public Double getAcc_mtd_total_return() {
		return acc_mtd_total_return;
	}
	public void setAcc_mtd_total_return(Double acc_mtd_total_return) {
		this.acc_mtd_total_return = acc_mtd_total_return;
	}

	@DataField(pos = 141)
	private Double acc_mtd_income_return_unl;
	public Double getAcc_mtd_income_return_unl() {
		return acc_mtd_income_return_unl;
	}
	public void setAcc_mtd_income_return_unl(Double acc_mtd_income_return_unl) {
		this.acc_mtd_income_return_unl = acc_mtd_income_return_unl;
	}

	@DataField(pos = 142)
	private Double assetmanagementfeesaccounttreeacc;
	public Double getAssetmanagementfeesaccounttreeacc() {
		return assetmanagementfeesaccounttreeacc;
	}
	public void setAssetmanagementfeesaccounttreeacc(Double assetmanagementfeesaccounttreeacc) {
		this.assetmanagementfeesaccounttreeacc = assetmanagementfeesaccounttreeacc;
	}

	@DataField(pos = 143)
	private Double unrealizedfxgainlossaccounttreecdn;
	public Double getUnrealizedfxgainlossaccounttreecdn() {
		return unrealizedfxgainlossaccounttreecdn;
	}
	public void setUnrealizedfxgainlossaccounttreecdn(Double unrealizedfxgainlossaccounttreecdn) {
		this.unrealizedfxgainlossaccounttreecdn = unrealizedfxgainlossaccounttreecdn;
	}

	@DataField(pos = 144)
	private Double cdn_mtd_income_return;
	public Double getCdn_mtd_income_return() {
		return cdn_mtd_income_return;
	}
	public void setCdn_mtd_income_return(Double cdn_mtd_income_return) {
		this.cdn_mtd_income_return = cdn_mtd_income_return;
	}

	@DataField(pos = 145)
	private Double acc_temporary_roc;
	public Double getAcc_temporary_roc() {
		return acc_temporary_roc;
	}
	public void setAcc_temporary_roc(Double acc_temporary_roc) {
		this.acc_temporary_roc = acc_temporary_roc;
	}

	@DataField(pos = 146)
	private Date predmaturitydate;
	public Date getPredmaturitydate() {
		return predmaturitydate;
	}
	public void setPredmaturitydate(Date predmaturitydate) {
		this.predmaturitydate = predmaturitydate;
	}

	@DataField(pos = 147)
	private Double interestexpenseaccounttreecdn;
	public Double getInterestexpenseaccounttreecdn() {
		return interestexpenseaccounttreecdn;
	}
	public void setInterestexpenseaccounttreecdn(Double interestexpenseaccounttreecdn) {
		this.interestexpenseaccounttreecdn = interestexpenseaccounttreecdn;
	}

	@DataField(pos = 148)
	private Double partnerownershipil;
	public Double getPartnerownershipil() {
		return partnerownershipil;
	}
	public void setPartnerownershipil(Double partnerownershipil) {
		this.partnerownershipil = partnerownershipil;
	}

	@DataField(pos = 149)
	private Double cdn_ytd_income_return;
	public Double getCdn_ytd_income_return() {
		return cdn_ytd_income_return;
	}
	public void setCdn_ytd_income_return(Double cdn_ytd_income_return) {
		this.cdn_ytd_income_return = cdn_ytd_income_return;
	}

	@DataField(pos = 150)
	private Double transactioncostsaccounttreecdn;
	public Double getTransactioncostsaccounttreecdn() {
		return transactioncostsaccounttreecdn;
	}
	public void setTransactioncostsaccounttreecdn(Double transactioncostsaccounttreecdn) {
		this.transactioncostsaccounttreecdn = transactioncostsaccounttreecdn;
	}

	@DataField(pos = 151)
	private Date valuationeffdate;
	public Date getValuationeffdate() {
		return valuationeffdate;
	}
	public void setValuationeffdate(Date valuationeffdate) {
		this.valuationeffdate = valuationeffdate;
	}

	@DataField(pos = 152)
	private Double acc_ytd_total_return_unl;
	public Double getAcc_ytd_total_return_unl() {
		return acc_ytd_total_return_unl;
	}
	public void setAcc_ytd_total_return_unl(Double acc_ytd_total_return_unl) {
		this.acc_ytd_total_return_unl = acc_ytd_total_return_unl;
	}

	@DataField(pos = 153)
	private String reportingcurrencyal;
	public String getReportingcurrencyal() {
		return reportingcurrencyal;
	}
	public void setReportingcurrencyal(String reportingcurrencyal) {
		this.reportingcurrencyal = reportingcurrencyal;
	}

	@DataField(pos = 154)
	private Double distributableincomecdn;
	public Double getDistributableincomecdn() {
		return distributableincomecdn;
	}
	public void setDistributableincomecdn(Double distributableincomecdn) {
		this.distributableincomecdn = distributableincomecdn;
	}

	@DataField(pos = 155)
	private Double reigrossrealizedincomeaccounttreecdn;
	public Double getReigrossrealizedincomeaccounttreecdn() {
		return reigrossrealizedincomeaccounttreecdn;
	}
	public void setReigrossrealizedincomeaccounttreecdn(Double reigrossrealizedincomeaccounttreecdn) {
		this.reigrossrealizedincomeaccounttreecdn = reigrossrealizedincomeaccounttreecdn;
	}

	@DataField(pos = 156)
	private Double reinetrealizedincomeaccounttreeilcdn;
	public Double getReinetrealizedincomeaccounttreeilcdn() {
		return reinetrealizedincomeaccounttreeilcdn;
	}
	public void setReinetrealizedincomeaccounttreeilcdn(Double reinetrealizedincomeaccounttreeilcdn) {
		this.reinetrealizedincomeaccounttreeilcdn = reinetrealizedincomeaccounttreeilcdn;
	}

	@DataField(pos = 157)
	private Double cashdistributionsfromoperationsacc;
	public Double getCashdistributionsfromoperationsacc() {
		return cashdistributionsfromoperationsacc;
	}
	public void setCashdistributionsfromoperationsacc(Double cashdistributionsfromoperationsacc) {
		this.cashdistributionsfromoperationsacc = cashdistributionsfromoperationsacc;
	}

	@DataField(pos = 158)
	private Double debtvaluationaccounttreecdn;
	public Double getDebtvaluationaccounttreecdn() {
		return debtvaluationaccounttreecdn;
	}
	public void setDebtvaluationaccounttreecdn(Double debtvaluationaccounttreecdn) {
		this.debtvaluationaccounttreecdn = debtvaluationaccounttreecdn;
	}

	@DataField(pos = 159)
	private Double allocations_to_be_converted;
	public Double getAllocations_to_be_converted() {
		return allocations_to_be_converted;
	}
	public void setAllocations_to_be_converted(Double allocations_to_be_converted) {
		this.allocations_to_be_converted = allocations_to_be_converted;
	}

	@DataField(pos = 160)
	private String reportingcurrencyil;
	public String getReportingcurrencyil() {
		return reportingcurrencyil;
	}
	public void setReportingcurrencyil(String reportingcurrencyil) {
		this.reportingcurrencyil = reportingcurrencyil;
	}

	@DataField(pos = 161)
	private Date debtmaturitydate;
	public Date getDebtmaturitydate() {
		return debtmaturitydate;
	}
	public void setDebtmaturitydate(Date debtmaturitydate) {
		this.debtmaturitydate = debtmaturitydate;
	}

	@DataField(pos = 162)
	private Double cdn_ytd_capital_return;
	public Double getCdn_ytd_capital_return() {
		return cdn_ytd_capital_return;
	}
	public void setCdn_ytd_capital_return(Double cdn_ytd_capital_return) {
		this.cdn_ytd_capital_return = cdn_ytd_capital_return;
	}

	@DataField(pos = 163)
	private Double cdn_mtd_total_return;
	public Double getCdn_mtd_total_return() {
		return cdn_mtd_total_return;
	}
	public void setCdn_mtd_total_return(Double cdn_mtd_total_return) {
		this.cdn_mtd_total_return = cdn_mtd_total_return;
	}

	@DataField(pos = 164)
	private Double local_cost_of_asset;
	public Double getLocal_cost_of_asset() {
		return local_cost_of_asset;
	}
	public void setLocal_cost_of_asset(Double local_cost_of_asset) {
		this.local_cost_of_asset = local_cost_of_asset;
	}

	@DataField(pos = 165)
	private Double assetcode_1;
	public Double getAssetcode_1() {
		return assetcode_1;
	}
	public void setAssetcode_1(Double assetcode_1) {
		this.assetcode_1 = assetcode_1;
	}

	@DataField(pos = 166)
	private Double countryregionil_countryregional;
	public Double getCountryregionil_countryregional() {
		return countryregionil_countryregional;
	}
	public void setCountryregionil_countryregional(Double countryregionil_countryregional) {
		this.countryregionil_countryregional = countryregionil_countryregional;
	}

	@DataField(pos = 167)
	private Double assetcode_2;
	public Double getAssetcode_2() {
		return assetcode_2;
	}
	public void setAssetcode_2(Double assetcode_2) {
		this.assetcode_2 = assetcode_2;
	}

	@DataField(pos = 168)
	private Double reportingcurrencyal_reportingcurrencyil;
	public Double getReportingcurrencyal_reportingcurrencyil() {
		return reportingcurrencyal_reportingcurrencyil;
	}
	public void setReportingcurrencyal_reportingcurrencyil(Double reportingcurrencyal_reportingcurrencyil) {
		this.reportingcurrencyal_reportingcurrencyil = reportingcurrencyal_reportingcurrencyil;
	}

	@DataField(pos = 169)
	private Double aCC_Equity_Exposure;
	public Double getACC_Equity_Exposure() {
		return aCC_Equity_Exposure;
	}
	public void setACC_Equity_Exposure(Double aCC_Equity_Exposure) {
		this.aCC_Equity_Exposure = aCC_Equity_Exposure;
	}

	@DataField(pos = 170)
	private Double cDN_Equity_Exposure;
	public Double getCDN_Equity_Exposure() {
		return cDN_Equity_Exposure;
	}
	public void setCDN_Equity_Exposure(Double cDN_Equity_Exposure) {
		this.cDN_Equity_Exposure = cDN_Equity_Exposure;
	}

	@DataField(pos = 171)
	private Double cDN_Gross_Invested_Equity;
	public Double getCDN_Gross_Invested_Equity() {
		return cDN_Gross_Invested_Equity;
	}
	public void setCDN_Gross_Invested_Equity(Double cDN_Gross_Invested_Equity) {
		this.cDN_Gross_Invested_Equity = cDN_Gross_Invested_Equity;
	}

	@DataField(pos = 172)
	private Double aCC_Gross_Invested_Equity;
	public Double getACC_Gross_Invested_Equity() {
		return aCC_Gross_Invested_Equity;
	}
	public void setACC_Gross_Invested_Equity(Double aCC_Gross_Invested_Equity) {
		this.aCC_Gross_Invested_Equity = aCC_Gross_Invested_Equity;
	}

	@DataField(pos = 173)
	private Double cDN_Invested_Commitment;
	public Double getCDN_Invested_Commitment() {
		return cDN_Invested_Commitment;
	}
	public void setCDN_Invested_Commitment(Double cDN_Invested_Commitment) {
		this.cDN_Invested_Commitment = cDN_Invested_Commitment;
	}

	@DataField(pos = 174)
	private Double aCC_Invested_Commitment;
	public Double getACC_Invested_Commitment() {
		return aCC_Invested_Commitment;
	}
	public void setACC_Invested_Commitment(Double aCC_Invested_Commitment) {
		this.aCC_Invested_Commitment = aCC_Invested_Commitment;
	}

	@DataField(pos = 175)
	private Double cDN_Net_Invested_Equity;
	public Double getCDN_Net_Invested_Equity() {
		return cDN_Net_Invested_Equity;
	}
	public void setCDN_Net_Invested_Equity(Double cDN_Net_Invested_Equity) {
		this.cDN_Net_Invested_Equity = cDN_Net_Invested_Equity;
	}

	@DataField(pos = 176)
	private Double aCC_Net_Invested_Equity;
	public Double getACC_Net_Invested_Equity() {
		return aCC_Net_Invested_Equity;
	}
	public void setACC_Net_Invested_Equity(Double aCC_Net_Invested_Equity) {
		this.aCC_Net_Invested_Equity = aCC_Net_Invested_Equity;
	}

	@DataField(pos = 177)
	private Double cDN_Uncommitted_Allocation;
	public Double getCDN_Uncommitted_Allocation() {
		return cDN_Uncommitted_Allocation;
	}
	public void setCDN_Uncommitted_Allocation(Double cDN_Uncommitted_Allocation) {
		this.cDN_Uncommitted_Allocation = cDN_Uncommitted_Allocation;
	}

	@DataField(pos = 178)
	private Double aCC_Uncommitted_Allocation;
	public Double getACC_Uncommitted_Allocation() {
		return aCC_Uncommitted_Allocation;
	}
	public void setACC_Uncommitted_Allocation(Double aCC_Uncommitted_Allocation) {
		this.aCC_Uncommitted_Allocation = aCC_Uncommitted_Allocation;
	}

	@DataField(pos = 179)
	private Double cDN_Unfunded_Commitment_UFC;
	public Double getCDN_Unfunded_Commitment_UFC() {
		return cDN_Unfunded_Commitment_UFC;
	}
	public void setCDN_Unfunded_Commitment_UFC(Double cDN_Unfunded_Commitment_UFC) {
		this.cDN_Unfunded_Commitment_UFC = cDN_Unfunded_Commitment_UFC;
	}

	@DataField(pos = 180)
	private Double aCC_Unfunded_Commitment_UFC;
	public Double getACC_Unfunded_Commitment_UFC() {
		return aCC_Unfunded_Commitment_UFC;
	}
	public void setACC_Unfunded_Commitment_UFC(Double aCC_Unfunded_Commitment_UFC) {
		this.aCC_Unfunded_Commitment_UFC = aCC_Unfunded_Commitment_UFC;
	}

} 

