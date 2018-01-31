package com.cppib.ifrdh.entity;

import java.util.Date;
import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;
import javax.persistence.*;

@CsvRecord(separator = "\\|", autospanLine = true)
@Entity
@Table(name="DIF_IFRE_DF2")
public class DIF_IFRE_DF2Entity {

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
	private String aSSETCODE;
	public String getASSETCODE() {
		return aSSETCODE;
	}
	public void setASSETCODE(String aSSETCODE) {
		this.aSSETCODE = aSSETCODE;
	}

	@DataField(pos = 2)
	private String aSSETCODE_D;
	public String getASSETCODE_D() {
		return aSSETCODE_D;
	}
	public void setASSETCODE_D(String aSSETCODE_D) {
		this.aSSETCODE_D = aSSETCODE_D;
	}

	@DataField(pos = 3)
	private String investment_Structure;
	public String getInvestment_Structure() {
		return investment_Structure;
	}
	public void setInvestment_Structure(String investment_Structure) {
		this.investment_Structure = investment_Structure;
	}

	@DataField(pos = 4)
	private String investment_Strategy;
	public String getInvestment_Strategy() {
		return investment_Strategy;
	}
	public void setInvestment_Strategy(String investment_Strategy) {
		this.investment_Strategy = investment_Strategy;
	}

	@DataField(pos = 5)
	private String geographic_Focus;
	public String getGeographic_Focus() {
		return geographic_Focus;
	}
	public void setGeographic_Focus(String geographic_Focus) {
		this.geographic_Focus = geographic_Focus;
	}

	@DataField(pos = 6)
	private String sector_Focus;
	public String getSector_Focus() {
		return sector_Focus;
	}
	public void setSector_Focus(String sector_Focus) {
		this.sector_Focus = sector_Focus;
	}

	@DataField(pos = 7)
	private String funding_Benchmark;
	public String getFunding_Benchmark() {
		return funding_Benchmark;
	}
	public void setFunding_Benchmark(String funding_Benchmark) {
		this.funding_Benchmark = funding_Benchmark;
	}

	@DataField(pos = 8)
	private String business_Unit;
	public String getBusiness_Unit() {
		return business_Unit;
	}
	public void setBusiness_Unit(String business_Unit) {
		this.business_Unit = business_Unit;
	}

	@DataField(pos = 9)
	private String currency;
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@DataField(pos = 10)
	private String performance_Benchmark;
	public String getPerformance_Benchmark() {
		return performance_Benchmark;
	}
	public void setPerformance_Benchmark(String performance_Benchmark) {
		this.performance_Benchmark = performance_Benchmark;
	}

	@DataField(pos = 11)
	private String compensation_Benchmark;
	public String getCompensation_Benchmark() {
		return compensation_Benchmark;
	}
	public void setCompensation_Benchmark(String compensation_Benchmark) {
		this.compensation_Benchmark = compensation_Benchmark;
	}

	@DataField(pos = 12)
	private String hold_Period;
	public String getHold_Period() {
		return hold_Period;
	}
	public void setHold_Period(String hold_Period) {
		this.hold_Period = hold_Period;
	}

	@DataField(pos = 13)
	private String investment_Manager;
	public String getInvestment_Manager() {
		return investment_Manager;
	}
	public void setInvestment_Manager(String investment_Manager) {
		this.investment_Manager = investment_Manager;
	}

	@DataField(pos = 14)
	private Double commitment;
	public Double getCommitment() {
		return commitment;
	}
	public void setCommitment(Double commitment) {
		this.commitment = commitment;
	}

	@DataField(pos = 15)
	private Double allocations_TO_BE_CONVERTED;
	public Double getAllocations_TO_BE_CONVERTED() {
		return allocations_TO_BE_CONVERTED;
	}
	public void setAllocations_TO_BE_CONVERTED(Double allocations_TO_BE_CONVERTED) {
		this.allocations_TO_BE_CONVERTED = allocations_TO_BE_CONVERTED;
	}

	@DataField(pos = 16)
	private Double gross_Invested_Equity_Source_to_be_converted;
	public Double getGross_Invested_Equity_Source_to_be_converted() {
		return gross_Invested_Equity_Source_to_be_converted;
	}
	public void setGross_Invested_Equity_Source_to_be_converted(Double gross_Invested_Equity_Source_to_be_converted) {
		this.gross_Invested_Equity_Source_to_be_converted = gross_Invested_Equity_Source_to_be_converted;
	}

	@DataField(pos = 17)
	private Double return_of_Capital_Source_Currency_to_be_Converted;
	public Double getReturn_of_Capital_Source_Currency_to_be_Converted() {
		return return_of_Capital_Source_Currency_to_be_Converted;
	}
	public void setReturn_of_Capital_Source_Currency_to_be_Converted(Double return_of_Capital_Source_Currency_to_be_Converted) {
		this.return_of_Capital_Source_Currency_to_be_Converted = return_of_Capital_Source_Currency_to_be_Converted;
	}

	@DataField(pos = 18)
	private Double unfunded_Commitment_CAD;
	public Double getUnfunded_Commitment_CAD() {
		return unfunded_Commitment_CAD;
	}
	public void setUnfunded_Commitment_CAD(Double unfunded_Commitment_CAD) {
		this.unfunded_Commitment_CAD = unfunded_Commitment_CAD;
	}

	@DataField(pos = 19)
	private Double asset_Carrying_Value;
	public Double getAsset_Carrying_Value() {
		return asset_Carrying_Value;
	}
	public void setAsset_Carrying_Value(Double asset_Carrying_Value) {
		this.asset_Carrying_Value = asset_Carrying_Value;
	}

	@DataField(pos = 20)
	private Double debt_Carrying_Value;
	public Double getDebt_Carrying_Value() {
		return debt_Carrying_Value;
	}
	public void setDebt_Carrying_Value(Double debt_Carrying_Value) {
		this.debt_Carrying_Value = debt_Carrying_Value;
	}

	@DataField(pos = 21)
	private Double equity_Carrying_Value;
	public Double getEquity_Carrying_Value() {
		return equity_Carrying_Value;
	}
	public void setEquity_Carrying_Value(Double equity_Carrying_Value) {
		this.equity_Carrying_Value = equity_Carrying_Value;
	}

	@DataField(pos = 22)
	private Double exposure;
	public Double getExposure() {
		return exposure;
	}
	public void setExposure(Double exposure) {
		this.exposure = exposure;
	}

	@DataField(pos = 23)
	private Double occupied_Area;
	public Double getOccupied_Area() {
		return occupied_Area;
	}
	public void setOccupied_Area(Double occupied_Area) {
		this.occupied_Area = occupied_Area;
	}

	@DataField(pos = 24)
	private Double total_Area;
	public Double getTotal_Area() {
		return total_Area;
	}
	public void setTotal_Area(Double total_Area) {
		this.total_Area = total_Area;
	}

	@DataField(pos = 25)
	private String sold_Investment;
	public String getSold_Investment() {
		return sold_Investment;
	}
	public void setSold_Investment(String sold_Investment) {
		this.sold_Investment = sold_Investment;
	}

	@DataField(pos = 26)
	private String developed_vs_Emerging;
	public String getDeveloped_vs_Emerging() {
		return developed_vs_Emerging;
	}
	public void setDeveloped_vs_Emerging(String developed_vs_Emerging) {
		this.developed_vs_Emerging = developed_vs_Emerging;
	}

	@DataField(pos = 27)
	private Double temporary_Return_of_Capital_Source_Currency_to_be_Converted;
	public Double getTemporary_Return_of_Capital_Source_Currency_to_be_Converted() {
		return temporary_Return_of_Capital_Source_Currency_to_be_Converted;
	}
	public void setTemporary_Return_of_Capital_Source_Currency_to_be_Converted(Double temporary_Return_of_Capital_Source_Currency_to_be_Converted) {
		this.temporary_Return_of_Capital_Source_Currency_to_be_Converted = temporary_Return_of_Capital_Source_Currency_to_be_Converted;
	}

	@DataField(pos = 28)
	private Double permanent_Return_of_Capital_Source_Currency_to_be_Converted;
	public Double getPermanent_Return_of_Capital_Source_Currency_to_be_Converted() {
		return permanent_Return_of_Capital_Source_Currency_to_be_Converted;
	}
	public void setPermanent_Return_of_Capital_Source_Currency_to_be_Converted(Double permanent_Return_of_Capital_Source_Currency_to_be_Converted) {
		this.permanent_Return_of_Capital_Source_Currency_to_be_Converted = permanent_Return_of_Capital_Source_Currency_to_be_Converted;
	}

	@DataField(pos = 29)
	private String mR_Sector;
	public String getMR_Sector() {
		return mR_Sector;
	}
	public void setMR_Sector(String mR_Sector) {
		this.mR_Sector = mR_Sector;
	}

	@DataField(pos = 30)
	private Double equity_Book_Value;
	public Double getEquity_Book_Value() {
		return equity_Book_Value;
	}
	public void setEquity_Book_Value(Double equity_Book_Value) {
		this.equity_Book_Value = equity_Book_Value;
	}

	@DataField(pos = 31)
	private Double expenses_Inside_Commitment;
	public Double getExpenses_Inside_Commitment() {
		return expenses_Inside_Commitment;
	}
	public void setExpenses_Inside_Commitment(Double expenses_Inside_Commitment) {
		this.expenses_Inside_Commitment = expenses_Inside_Commitment;
	}

	@DataField(pos = 32)
	private Double capital_Additions;
	public Double getCapital_Additions() {
		return capital_Additions;
	}
	public void setCapital_Additions(Double capital_Additions) {
		this.capital_Additions = capital_Additions;
	}

	@DataField(pos = 33)
	private String investment_Aggregation_Grouped_Entity;
	public String getInvestment_Aggregation_Grouped_Entity() {
		return investment_Aggregation_Grouped_Entity;
	}
	public void setInvestment_Aggregation_Grouped_Entity(String investment_Aggregation_Grouped_Entity) {
		this.investment_Aggregation_Grouped_Entity = investment_Aggregation_Grouped_Entity;
	}

	@DataField(pos = 34)
	private String f34;
	public String getF34() {
		return f34;
	}
	public void setF34(String f34) {
		this.f34 = f34;
	}

	@DataField(pos = 35)
	private String f35;
	public String getF35() {
		return f35;
	}
	public void setF35(String f35) {
		this.f35 = f35;
	}

	@DataField(pos = 36)
	private String f36;
	public String getF36() {
		return f36;
	}
	public void setF36(String f36) {
		this.f36 = f36;
	}

	@DataField(pos = 37)
	private String f37;
	public String getF37() {
		return f37;
	}
	public void setF37(String f37) {
		this.f37 = f37;
	}

	@DataField(pos = 38)
	private String f38;
	public String getF38() {
		return f38;
	}
	public void setF38(String f38) {
		this.f38 = f38;
	}

	@DataField(pos = 39)
	private String f39;
	public String getF39() {
		return f39;
	}
	public void setF39(String f39) {
		this.f39 = f39;
	}

	@DataField(pos = 40)
	private String f40;
	public String getF40() {
		return f40;
	}
	public void setF40(String f40) {
		this.f40 = f40;
	}

	@DataField(pos = 41)
	private String f41;
	public String getF41() {
		return f41;
	}
	public void setF41(String f41) {
		this.f41 = f41;
	}

	@DataField(pos = 42)
	private String f42;
	public String getF42() {
		return f42;
	}
	public void setF42(String f42) {
		this.f42 = f42;
	}

	@DataField(pos = 43)
	private String f43;
	public String getF43() {
		return f43;
	}
	public void setF43(String f43) {
		this.f43 = f43;
	}

	@DataField(pos = 44)
	private String f44;
	public String getF44() {
		return f44;
	}
	public void setF44(String f44) {
		this.f44 = f44;
	}

	@DataField(pos = 45)
	private String f45;
	public String getF45() {
		return f45;
	}
	public void setF45(String f45) {
		this.f45 = f45;
	}

	@DataField(pos = 46)
	private String f46;
	public String getF46() {
		return f46;
	}
	public void setF46(String f46) {
		this.f46 = f46;
	}

	@DataField(pos = 47)
	private String f47;
	public String getF47() {
		return f47;
	}
	public void setF47(String f47) {
		this.f47 = f47;
	}

	@DataField(pos = 48)
	private String f48;
	public String getF48() {
		return f48;
	}
	public void setF48(String f48) {
		this.f48 = f48;
	}

	@DataField(pos = 49)
	private String f49;
	public String getF49() {
		return f49;
	}
	public void setF49(String f49) {
		this.f49 = f49;
	}

	@DataField(pos = 50)
	private String f50;
	public String getF50() {
		return f50;
	}
	public void setF50(String f50) {
		this.f50 = f50;
	}

	@DataField(pos = 51)
	private String f51;
	public String getF51() {
		return f51;
	}
	public void setF51(String f51) {
		this.f51 = f51;
	}

	@DataField(pos = 52)
	private String f52;
	public String getF52() {
		return f52;
	}
	public void setF52(String f52) {
		this.f52 = f52;
	}

	@DataField(pos = 53)
	private String f53;
	public String getF53() {
		return f53;
	}
	public void setF53(String f53) {
		this.f53 = f53;
	}

	@DataField(pos = 54)
	private String f54;
	public String getF54() {
		return f54;
	}
	public void setF54(String f54) {
		this.f54 = f54;
	}

	@DataField(pos = 55)
	private String f55;
	public String getF55() {
		return f55;
	}
	public void setF55(String f55) {
		this.f55 = f55;
	}

	@DataField(pos = 56)
	private String f56;
	public String getF56() {
		return f56;
	}
	public void setF56(String f56) {
		this.f56 = f56;
	}

	@DataField(pos = 57)
	private String f57;
	public String getF57() {
		return f57;
	}
	public void setF57(String f57) {
		this.f57 = f57;
	}

	@DataField(pos = 58)
	private String f58;
	public String getF58() {
		return f58;
	}
	public void setF58(String f58) {
		this.f58 = f58;
	}

	@DataField(pos = 59)
	private String f59;
	public String getF59() {
		return f59;
	}
	public void setF59(String f59) {
		this.f59 = f59;
	}

	@DataField(pos = 60)
	private String f60;
	public String getF60() {
		return f60;
	}
	public void setF60(String f60) {
		this.f60 = f60;
	}

	@DataField(pos = 61)
	private String f61;
	public String getF61() {
		return f61;
	}
	public void setF61(String f61) {
		this.f61 = f61;
	}

	@DataField(pos = 62)
	private String f62;
	public String getF62() {
		return f62;
	}
	public void setF62(String f62) {
		this.f62 = f62;
	}

	@DataField(pos = 63)
	private String f63;
	public String getF63() {
		return f63;
	}
	public void setF63(String f63) {
		this.f63 = f63;
	}

	@DataField(pos = 64)
	private String f64;
	public String getF64() {
		return f64;
	}
	public void setF64(String f64) {
		this.f64 = f64;
	}

	@DataField(pos = 65)
	private String f65;
	public String getF65() {
		return f65;
	}
	public void setF65(String f65) {
		this.f65 = f65;
	}

	@DataField(pos = 66)
	private String f66;
	public String getF66() {
		return f66;
	}
	public void setF66(String f66) {
		this.f66 = f66;
	}

	@DataField(pos = 67)
	private String f67;
	public String getF67() {
		return f67;
	}
	public void setF67(String f67) {
		this.f67 = f67;
	}

	@DataField(pos = 68)
	private String f68;
	public String getF68() {
		return f68;
	}
	public void setF68(String f68) {
		this.f68 = f68;
	}

	@DataField(pos = 69)
	private String f69;
	public String getF69() {
		return f69;
	}
	public void setF69(String f69) {
		this.f69 = f69;
	}

	@DataField(pos = 70)
	private Date aSOFDATE;
	public Date getASOFDATE() {
		return aSOFDATE;
	}
	public void setASOFDATE(Date aSOFDATE) {
		this.aSOFDATE = aSOFDATE;
	}

} 

