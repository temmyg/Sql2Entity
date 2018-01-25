package com.cppib.ifrdh.entity;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;
import javax.persistence.*;

@CsvRecord(separator = "\\|", autospanLine = true)
@Entity
@Table(name="DIF_ASCAP18")
public class DIF_ASCAP18Entity {

	int Id

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	public int getId() {
		return Id
	}
	public void setId(int Id) {
		this.Id = Id
	}
	@DataField(pos = 1)
	private String assetCode;
	@DataField(pos = 2)
	private Date asOfDate;
	@DataField(pos = 3)
	private double nOI;
	@DataField(pos = 4)
	private double uNDINC;
	@DataField(pos = 5)
	private double dTEXP;
	@DataField(pos = 6)
	private double gNLOSS;
	@DataField(pos = 7)
	private double tRANEXP;
	@DataField(pos = 8)
	private double nI;
	@DataField(pos = 9)
	private double iNVEXP;
	@DataField(pos = 10)
	private double cAPVAL;
	@DataField(pos = 11)
	private double dTVAL;
	@DataField(pos = 12)
	private double dTFX;
	@DataField(pos = 13)
	private double aSFX;
	@DataField(pos = 14)
	private double mTD_Capital_Return;
	@DataField(pos = 15)
	private double mTD_Capital_Return_Unl;
	@DataField(pos = 16)
	private double mTD_FX_Return;
	@DataField(pos = 17)
	private double mTD_FX_Return_Unl;
	@DataField(pos = 18)
	private double mTD_Income_Return;
	@DataField(pos = 19)
	private double mTD_Income_Return_Unl;
	@DataField(pos = 20)
	private double mTD_Total_Return;
	@DataField(pos = 21)
	private double mTD_Total_Return_Unl;
	@DataField(pos = 22)
	private double iNCTAX;
	@DataField(pos = 23)
	private double qTD_CAPITAL_RETURN;
	@DataField(pos = 24)
	private double yTD_CAPITAL_RETURN;
	@DataField(pos = 25)
	private double qTD_CAPITAL_RETURN_UNL;
	@DataField(pos = 26)
	private double yTD_CAPITAL_RETURN_UNL;
	@DataField(pos = 27)
	private double qTD_FX_RETURN;
	@DataField(pos = 28)
	private double yTD_FX_RETURN;
	@DataField(pos = 29)
	private double qTD_FX_RETURN_UNL;
	@DataField(pos = 30)
	private double yTD_FX_RETURN_UNL;
	@DataField(pos = 31)
	private double qTD_INCOME_RETURN;
	@DataField(pos = 32)
	private double yTD_INCOME_RETURN;
	@DataField(pos = 33)
	private double qTD_INCOME_RETURN_UNL;
	@DataField(pos = 34)
	private double yTD_INCOME_RETURN_UNL;
} 

