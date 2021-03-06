package com.cppib.ifrdh.entity;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;
import javax.persistence.*;

@CsvRecord(separator = "\\|", autospanLine = true)
@Entity
public class InvestranCashFlow {
	@DataField(prop = 1)
	private String deal_ID
	@DataField(prop = 2)
	private String legal_Entity
	@DataField(prop = 3)
	private String model_Portfolio
	@DataField(prop = 4)
	private String sCD_ID
	@DataField(prop = 5)
	private String investment_Taxonomy
	@DataField(prop = 6)
	private String investment_Structure_1
	@DataField(prop = 7)
	private String investment_Structure_2
	@DataField(prop = 8)
	private String investment_Structure_3
	@DataField(prop = 9)
	private String investment_Structure_4
	@DataField(prop = 10)
	private String investment_Structure_5
	@DataField(prop = 11)
	private String investment_Structure_6
	@DataField(prop = 12)
	private String family
	@DataField(prop = 13)
	private String reporting_Name
	@DataField(prop = 14)
	private String deal_Name
	@DataField(prop = 15)
	private String deal_Currency
	@DataField(prop = 16)
	private String deal_Commitment
	@DataField(prop = 17)
	private String primary_Investment_Category
	@DataField(prop = 18)
	private String financial_Statement_Classification
	@DataField(prop = 19)
	private String active_or_Liquidated
	@DataField(prop = 20)
	private String liquidation_Date
	@DataField(prop = 21)
	private String risk_Rating
	@DataField(prop = 22)
	private String cPP_Closing_Date
	@DataField(prop = 23)
	private String board_Seat_Count
	@DataField(prop = 24)
	private String industry_Focus
	@DataField(prop = 25)
	private String geographic_Focus
	@DataField(prop = 26)
	private String vintage_Year
	@DataField(prop = 27)
	private String investing_Entity
	@DataField(prop = 28)
	private String primary_PI
	@DataField(prop = 29)
	private String stock_Distribution
	@DataField(prop = 30)
	private String equity_ownership_Perc
	@DataField(prop = 31)
	private String cPPIB_CC_rating
	@DataField(prop = 32)
	private String adjusted_Beta
	@DataField(prop = 33)
	private String pCI_Strategy
} 

