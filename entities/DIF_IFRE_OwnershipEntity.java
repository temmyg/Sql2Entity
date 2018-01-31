package com.cppib.ifrdh.entity;

import java.util.Date;
import java.util.Date;
import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;
import javax.persistence.*;

@CsvRecord(separator = "\\|", autospanLine = true)
@Entity
@Table(name="DIF_IFRE_Ownership")
public class DIF_IFRE_OwnershipEntity {

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
	private Date asofDate;
	public Date getAsofDate() {
		return asofDate;
	}
	public void setAsofDate(Date asofDate) {
		this.asofDate = asofDate;
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
	private Date ownershipDate;
	public Date getOwnershipDate() {
		return ownershipDate;
	}
	public void setOwnershipDate(Date ownershipDate) {
		this.ownershipDate = ownershipDate;
	}

	@DataField(pos = 4)
	private Double cPPIBOwnershipPerc;
	public Double getCPPIBOwnershipPerc() {
		return cPPIBOwnershipPerc;
	}
	public void setCPPIBOwnershipPerc(Double cPPIBOwnershipPerc) {
		this.cPPIBOwnershipPerc = cPPIBOwnershipPerc;
	}

	@DataField(pos = 5)
	private String iLevel;
	public String getILevel() {
		return iLevel;
	}
	public void setILevel(String iLevel) {
		this.iLevel = iLevel;
	}

} 

