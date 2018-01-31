package com.cppib.ifrdh.entity;

import java.util.Date;
import java.util.Date;
import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;
import javax.persistence.*;

@CsvRecord(separator = "\\|", autospanLine = true)
@Entity
@Table(name="DIF_IFRE_CommitmentAllocation")
public class DIF_IFRE_CommitmentAllocationEntity {

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
	private Date aSOFDATE;
	public Date getASOFDATE() {
		return aSOFDATE;
	}
	public void setASOFDATE(Date aSOFDATE) {
		this.aSOFDATE = aSOFDATE;
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
	private Date dTDATE;
	public Date getDTDATE() {
		return dTDATE;
	}
	public void setDTDATE(Date dTDATE) {
		this.dTDATE = dTDATE;
	}

	@DataField(pos = 4)
	private Double cOMMITMENTS;
	public Double getCOMMITMENTS() {
		return cOMMITMENTS;
	}
	public void setCOMMITMENTS(Double cOMMITMENTS) {
		this.cOMMITMENTS = cOMMITMENTS;
	}

	@DataField(pos = 5)
	private Double aLLOCATION;
	public Double getALLOCATION() {
		return aLLOCATION;
	}
	public void setALLOCATION(Double aLLOCATION) {
		this.aLLOCATION = aLLOCATION;
	}

	@DataField(pos = 6)
	private Double currentAllocation;
	public Double getCurrentAllocation() {
		return currentAllocation;
	}
	public void setCurrentAllocation(Double currentAllocation) {
		this.currentAllocation = currentAllocation;
	}

	@DataField(pos = 7)
	private Double currentCommitment;
	public Double getCurrentCommitment() {
		return currentCommitment;
	}
	public void setCurrentCommitment(Double currentCommitment) {
		this.currentCommitment = currentCommitment;
	}

	@DataField(pos = 8)
	private String iLevel;
	public String getILevel() {
		return iLevel;
	}
	public void setILevel(String iLevel) {
		this.iLevel = iLevel;
	}

} 

