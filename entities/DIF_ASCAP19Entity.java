package com.cppib.ifrdh.entity;

import java.util.Date;
import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;
import javax.persistence.*;

@CsvRecord(separator = "\\|", autospanLine = true)
@Entity
@Table(name="DIF_ASCAP19")
public class DIF_ASCAP19Entity {

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
	private String assetCode;
	public String getAssetCode() {
		return assetCode;
	}
	public void setAssetCode(String assetCode) {
		this.assetCode = assetCode;
	}

	@DataField(pos = 2)
	private Date asOfDate;
	public Date getAsOfDate() {
		return asOfDate;
	}
	public void setAsOfDate(Date asOfDate) {
		this.asOfDate = asOfDate;
	}

	@DataField(pos = 3)
	private Double nOI;
	public Double getNOI() {
		return nOI;
	}
	public void setNOI(Double nOI) {
		this.nOI = nOI;
	}

	@DataField(pos = 4)
	private Double uNDINC;
	public Double getUNDINC() {
		return uNDINC;
	}
	public void setUNDINC(Double uNDINC) {
		this.uNDINC = uNDINC;
	}

	@DataField(pos = 5)
	private Double dTEXP;
	public Double getDTEXP() {
		return dTEXP;
	}
	public void setDTEXP(Double dTEXP) {
		this.dTEXP = dTEXP;
	}

	@DataField(pos = 6)
	private Double gNLOSS;
	public Double getGNLOSS() {
		return gNLOSS;
	}
	public void setGNLOSS(Double gNLOSS) {
		this.gNLOSS = gNLOSS;
	}

	@DataField(pos = 7)
	private Double tRANEXP;
	public Double getTRANEXP() {
		return tRANEXP;
	}
	public void setTRANEXP(Double tRANEXP) {
		this.tRANEXP = tRANEXP;
	}

	@DataField(pos = 8)
	private Double nI;
	public Double getNI() {
		return nI;
	}
	public void setNI(Double nI) {
		this.nI = nI;
	}

	@DataField(pos = 9)
	private Double iNVEXP;
	public Double getINVEXP() {
		return iNVEXP;
	}
	public void setINVEXP(Double iNVEXP) {
		this.iNVEXP = iNVEXP;
	}

	@DataField(pos = 10)
	private Double cAPVAL;
	public Double getCAPVAL() {
		return cAPVAL;
	}
	public void setCAPVAL(Double cAPVAL) {
		this.cAPVAL = cAPVAL;
	}

	@DataField(pos = 11)
	private Double dTVAL;
	public Double getDTVAL() {
		return dTVAL;
	}
	public void setDTVAL(Double dTVAL) {
		this.dTVAL = dTVAL;
	}

	@DataField(pos = 12)
	private Double dTFX;
	public Double getDTFX() {
		return dTFX;
	}
	public void setDTFX(Double dTFX) {
		this.dTFX = dTFX;
	}

	@DataField(pos = 13)
	private Double aSFX;
	public Double getASFX() {
		return aSFX;
	}
	public void setASFX(Double aSFX) {
		this.aSFX = aSFX;
	}

	@DataField(pos = 14)
	private Double mTD_Capital_Return;
	public Double getMTD_Capital_Return() {
		return mTD_Capital_Return;
	}
	public void setMTD_Capital_Return(Double mTD_Capital_Return) {
		this.mTD_Capital_Return = mTD_Capital_Return;
	}

	@DataField(pos = 15)
	private Double mTD_Capital_Return_Unl;
	public Double getMTD_Capital_Return_Unl() {
		return mTD_Capital_Return_Unl;
	}
	public void setMTD_Capital_Return_Unl(Double mTD_Capital_Return_Unl) {
		this.mTD_Capital_Return_Unl = mTD_Capital_Return_Unl;
	}

	@DataField(pos = 16)
	private Double mTD_FX_Return;
	public Double getMTD_FX_Return() {
		return mTD_FX_Return;
	}
	public void setMTD_FX_Return(Double mTD_FX_Return) {
		this.mTD_FX_Return = mTD_FX_Return;
	}

	@DataField(pos = 17)
	private Double mTD_FX_Return_Unl;
	public Double getMTD_FX_Return_Unl() {
		return mTD_FX_Return_Unl;
	}
	public void setMTD_FX_Return_Unl(Double mTD_FX_Return_Unl) {
		this.mTD_FX_Return_Unl = mTD_FX_Return_Unl;
	}

	@DataField(pos = 18)
	private Double mTD_Income_Return;
	public Double getMTD_Income_Return() {
		return mTD_Income_Return;
	}
	public void setMTD_Income_Return(Double mTD_Income_Return) {
		this.mTD_Income_Return = mTD_Income_Return;
	}

	@DataField(pos = 19)
	private Double mTD_Income_Return_Unl;
	public Double getMTD_Income_Return_Unl() {
		return mTD_Income_Return_Unl;
	}
	public void setMTD_Income_Return_Unl(Double mTD_Income_Return_Unl) {
		this.mTD_Income_Return_Unl = mTD_Income_Return_Unl;
	}

	@DataField(pos = 20)
	private Double mTD_Total_Return;
	public Double getMTD_Total_Return() {
		return mTD_Total_Return;
	}
	public void setMTD_Total_Return(Double mTD_Total_Return) {
		this.mTD_Total_Return = mTD_Total_Return;
	}

	@DataField(pos = 21)
	private Double mTD_Total_Return_Unl;
	public Double getMTD_Total_Return_Unl() {
		return mTD_Total_Return_Unl;
	}
	public void setMTD_Total_Return_Unl(Double mTD_Total_Return_Unl) {
		this.mTD_Total_Return_Unl = mTD_Total_Return_Unl;
	}

	@DataField(pos = 22)
	private Double iNCTAX;
	public Double getINCTAX() {
		return iNCTAX;
	}
	public void setINCTAX(Double iNCTAX) {
		this.iNCTAX = iNCTAX;
	}

	@DataField(pos = 23)
	private Double qTD_CAPITAL_RETURN;
	public Double getQTD_CAPITAL_RETURN() {
		return qTD_CAPITAL_RETURN;
	}
	public void setQTD_CAPITAL_RETURN(Double qTD_CAPITAL_RETURN) {
		this.qTD_CAPITAL_RETURN = qTD_CAPITAL_RETURN;
	}

	@DataField(pos = 24)
	private Double yTD_CAPITAL_RETURN;
	public Double getYTD_CAPITAL_RETURN() {
		return yTD_CAPITAL_RETURN;
	}
	public void setYTD_CAPITAL_RETURN(Double yTD_CAPITAL_RETURN) {
		this.yTD_CAPITAL_RETURN = yTD_CAPITAL_RETURN;
	}

	@DataField(pos = 25)
	private Double qTD_CAPITAL_RETURN_UNL;
	public Double getQTD_CAPITAL_RETURN_UNL() {
		return qTD_CAPITAL_RETURN_UNL;
	}
	public void setQTD_CAPITAL_RETURN_UNL(Double qTD_CAPITAL_RETURN_UNL) {
		this.qTD_CAPITAL_RETURN_UNL = qTD_CAPITAL_RETURN_UNL;
	}

	@DataField(pos = 26)
	private Double yTD_CAPITAL_RETURN_UNL;
	public Double getYTD_CAPITAL_RETURN_UNL() {
		return yTD_CAPITAL_RETURN_UNL;
	}
	public void setYTD_CAPITAL_RETURN_UNL(Double yTD_CAPITAL_RETURN_UNL) {
		this.yTD_CAPITAL_RETURN_UNL = yTD_CAPITAL_RETURN_UNL;
	}

	@DataField(pos = 27)
	private Double qTD_FX_RETURN;
	public Double getQTD_FX_RETURN() {
		return qTD_FX_RETURN;
	}
	public void setQTD_FX_RETURN(Double qTD_FX_RETURN) {
		this.qTD_FX_RETURN = qTD_FX_RETURN;
	}

	@DataField(pos = 28)
	private Double yTD_FX_RETURN;
	public Double getYTD_FX_RETURN() {
		return yTD_FX_RETURN;
	}
	public void setYTD_FX_RETURN(Double yTD_FX_RETURN) {
		this.yTD_FX_RETURN = yTD_FX_RETURN;
	}

	@DataField(pos = 29)
	private Double qTD_FX_RETURN_UNL;
	public Double getQTD_FX_RETURN_UNL() {
		return qTD_FX_RETURN_UNL;
	}
	public void setQTD_FX_RETURN_UNL(Double qTD_FX_RETURN_UNL) {
		this.qTD_FX_RETURN_UNL = qTD_FX_RETURN_UNL;
	}

	@DataField(pos = 30)
	private Double yTD_FX_RETURN_UNL;
	public Double getYTD_FX_RETURN_UNL() {
		return yTD_FX_RETURN_UNL;
	}
	public void setYTD_FX_RETURN_UNL(Double yTD_FX_RETURN_UNL) {
		this.yTD_FX_RETURN_UNL = yTD_FX_RETURN_UNL;
	}

	@DataField(pos = 31)
	private Double qTD_INCOME_RETURN;
	public Double getQTD_INCOME_RETURN() {
		return qTD_INCOME_RETURN;
	}
	public void setQTD_INCOME_RETURN(Double qTD_INCOME_RETURN) {
		this.qTD_INCOME_RETURN = qTD_INCOME_RETURN;
	}

	@DataField(pos = 32)
	private Double yTD_INCOME_RETURN;
	public Double getYTD_INCOME_RETURN() {
		return yTD_INCOME_RETURN;
	}
	public void setYTD_INCOME_RETURN(Double yTD_INCOME_RETURN) {
		this.yTD_INCOME_RETURN = yTD_INCOME_RETURN;
	}

	@DataField(pos = 33)
	private Double qTD_INCOME_RETURN_UNL;
	public Double getQTD_INCOME_RETURN_UNL() {
		return qTD_INCOME_RETURN_UNL;
	}
	public void setQTD_INCOME_RETURN_UNL(Double qTD_INCOME_RETURN_UNL) {
		this.qTD_INCOME_RETURN_UNL = qTD_INCOME_RETURN_UNL;
	}

	@DataField(pos = 34)
	private Double yTD_INCOME_RETURN_UNL;
	public Double getYTD_INCOME_RETURN_UNL() {
		return yTD_INCOME_RETURN_UNL;
	}
	public void setYTD_INCOME_RETURN_UNL(Double yTD_INCOME_RETURN_UNL) {
		this.yTD_INCOME_RETURN_UNL = yTD_INCOME_RETURN_UNL;
	}

} 

