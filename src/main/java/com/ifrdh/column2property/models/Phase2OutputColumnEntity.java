package com.ifrdh.column2property.models;

import org.apache.commons.lang3.BooleanUtils;

import javax.persistence.*;
import javax.print.attribute.IntegerSyntax;

@Entity
@Table(name="Phase2OutputColumn")
public class Phase2OutputColumnEntity {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	int Id;

	public int getId() {
		return Id;
	}
	public void setId(int Id) {
		this.Id = Id;
	}


	private String phase2ColumnName;
	public String getPhase2ColumnName() {
		return phase2ColumnName;
	}
	public void setPhase2ColumnName(String phase2ColumnName) {
		this.phase2ColumnName = phase2ColumnName;
	}


	private String phase2TableName;
	public String getPhase2TableName() {
		return phase2TableName;
	}
	public void setPhase2TableName(String phase2TableName) {
		this.phase2TableName = phase2TableName;
	}


	private String displayName;
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}


	private Integer orderNumberInSheet;
	public Integer getOrderNumberInSheet() {
		return orderNumberInSheet;
	}
	public void setOrderNumberInSheet(Integer orderNumberInSheet) {
		this.orderNumberInSheet = orderNumberInSheet;
	}


	private Integer sheetOrdinalNo;
	public Integer getSheetOrdinalNo() {
		return sheetOrdinalNo;
	}
	public void setSheetOrdinalNo(Integer sheetOrdinalNo) {
		this.sheetOrdinalNo = sheetOrdinalNo;
	}


	private Boolean isDirectOutput;
	public Boolean getisDirectOutput() {
		return isDirectOutput;
	}
	public void setisDirectOutput(Boolean isDirectOutput) {
		this.isDirectOutput = isDirectOutput;
	}

	private Boolean inTotal;
	public Boolean getInTotal() {
		return inTotal;
	}
	public void setInTotal(Boolean inTotal) {
		this.inTotal = inTotal;
	}

	private int excelFileId;

	public int getExcelFileId() {
		return excelFileId;
	}

	public void setExcelFileId(int excelFileId) {
		this.excelFileId = excelFileId;
	}

	private String cellStyle;

	public String getCellStyle() {
		return cellStyle;
	}

	public void setCellStyle(String cellStyle) {
		this.cellStyle = cellStyle;
	}

}

