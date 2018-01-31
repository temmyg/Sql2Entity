package com.cppib.ifrdh.entity;

import java.util.Date;
import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;
import javax.persistence.*;

@CsvRecord(separator = "\\|", autospanLine = true)
@Entity
@Table(name="DIF_IFRE_Relationships")
public class DIF_IFRE_RelationshipsEntity {

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
	private String aLAssetCode;
	public String getALAssetCode() {
		return aLAssetCode;
	}
	public void setALAssetCode(String aLAssetCode) {
		this.aLAssetCode = aLAssetCode;
	}

	@DataField(pos = 3)
	private String iLAssetCode;
	public String getILAssetCode() {
		return iLAssetCode;
	}
	public void setILAssetCode(String iLAssetCode) {
		this.iLAssetCode = iLAssetCode;
	}

} 

