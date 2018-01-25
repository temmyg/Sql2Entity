package com.cppib.ifrdh.entity;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;
import javax.persistence.*;

@CsvRecord(separator = "\\|", autospanLine = true)
@Entity
@Table(name="InvestranCashFlow")
public class InvestranCashFlowEntity {
	@DataField(pos = 1)
	private String deal_ID;
	@DataField(pos = 2)
	private String legal_Entity;
	@DataField(pos = 3)
	private String model_Portfolio;
	@DataField(pos = 4)
	private String sCD_ID;
	@DataField(pos = 5)
	private String investment_Taxonomy;
	@DataField(pos = 6)
	private String investment_Structure_1;
	@DataField(pos = 7)
	private String investment_Structure_2;
	@DataField(pos = 8)
	private String investment_Structure_3;
	@DataField(pos = 9)
	private String investment_Structure_4;
	@DataField(pos = 10)
	private String investment_Structure_5;
	@DataField(pos = 11)
	private String investment_Structure_6;
	@DataField(pos = 12)
	private String family;
	@DataField(pos = 13)
	private String reporting_Name;
	@DataField(pos = 14)
	private String deal_Name;
	@DataField(pos = 15)
	private String deal_Currency;
	@DataField(pos = 16)
	private String deal_Commitment;
	@DataField(pos = 17)
	private String primary_Investment_Category;
	@DataField(pos = 18)
	private String developed_or_Emerging_Markets;
	@DataField(pos = 19)
	private String financial_Statement_Classification;
	@DataField(pos = 20)
	private String active_or_Liquidated;
	@DataField(pos = 21)
	private String liquidation_Date;
	@DataField(pos = 22)
	private String risk_Rating;
	@DataField(pos = 23)
	private String cPP_Closing_Date;
	@DataField(pos = 24)
	private String board_Seat_Count;
	@DataField(pos = 25)
	private String follow_On;
	@DataField(pos = 26)
	private String primary_FO;
	@DataField(pos = 27)
	private String secondary_FO;
	@DataField(pos = 28)
	private String industry_Focus;
	@DataField(pos = 29)
	private String geographic_Focus;
	@DataField(pos = 30)
	private String vintage_Year;
	@DataField(pos = 31)
	private String investing_Entity;
	@DataField(pos = 32)
	private String primary_PI;
	@DataField(pos = 33)
	private String stock_Distribution;
	@DataField(pos = 34)
	private String equity_ownership_Perc;
	@DataField(pos = 35)
	private String cPPIB_CC_rating;
	@DataField(pos = 36)
	private String adjusted_Beta;
	@DataField(pos = 37)
	private String pCI_Strategy;
} 

