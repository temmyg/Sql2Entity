package com.cppib.ifrdh.entity;

import java.util.Date;
import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;
import javax.persistence.*;

@CsvRecord(separator = "\\|", autospanLine = true)
@Entity
@Table(name="DIF_IFRE_Attributes")
public class DIF_IFRE_AttributesEntity {

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
	private String yardiAttribute;
	public String getYardiAttribute() {
		return yardiAttribute;
	}
	public void setYardiAttribute(String yardiAttribute) {
		this.yardiAttribute = yardiAttribute;
	}

	@DataField(pos = 3)
	private String yardiAttributeName;
	public String getYardiAttributeName() {
		return yardiAttributeName;
	}
	public void setYardiAttributeName(String yardiAttributeName) {
		this.yardiAttributeName = yardiAttributeName;
	}

	@DataField(pos = 4)
	private String permissibleValues;
	public String getPermissibleValues() {
		return permissibleValues;
	}
	public void setPermissibleValues(String permissibleValues) {
		this.permissibleValues = permissibleValues;
	}

} 

