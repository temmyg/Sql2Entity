package com.cppib.ifrdh.entity;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;
import javax.persistence.*;

@CsvRecord(separator = "\\|", autospanLine = true)
@Entity
@Table(name="EnrichmentRequirement")
public class EnrichmentRequirementEntity {

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
	private String columnName;
	public String getColumnName() {
		return columnName;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	@DataField(pos = 2)
	private String iFRETableName;
	public String getIFRETableName() {
		return iFRETableName;
	}
	public void setIFRETableName(String iFRETableName) {
		this.iFRETableName = iFRETableName;
	}

	@DataField(pos = 3)
	private String presentationName;
	public String getPresentationName() {
		return presentationName;
	}
	public void setPresentationName(String presentationName) {
		this.presentationName = presentationName;
	}

	@DataField(pos = 4)
	private Boolean isCalculated;
	public Boolean getIsCalculated() {
		return isCalculated;
	}
	public void setIsCalculated(Boolean isCalculated) {
		this.isCalculated = isCalculated;
	}

} 

