package com.ifrdh.column2property.models;

import com.ifrdh.column2property.utils.Table2View;

import javax.persistence.*;

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

	private String columnName;
	public String getColumnName() {
		return columnName;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	private String iFRETableName;
	public String getIFRETableName() {
		return Table2View.getViewName(iFRETableName);
	}
	public void setIFRETableName(String iFRETableName) {
		this.iFRETableName = iFRETableName;
	}

	private String presentationName;
	public String getPresentationName() {
		return presentationName;
	}
	public void setPresentationName(String presentationName) {
		this.presentationName = presentationName;
	}

	private Boolean isCalculated;
	public Boolean getIsCalculated() {
		return isCalculated;
	}
	public void setIsCalculated(Boolean isCalculated) {
		this.isCalculated = isCalculated;
	}

	private Integer ordinalNumber;

	public Integer getOrdinalNumber() {
		return ordinalNumber;
	}

	public void setordinalNumber(Integer ordinalNumber) {
		this.ordinalNumber = ordinalNumber;
	}
}

