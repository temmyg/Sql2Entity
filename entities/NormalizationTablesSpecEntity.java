package com.cppib.ifrdh.entity;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;
import javax.persistence.*;

@CsvRecord(separator = "\\|", autospanLine = true)
@Entity
@Table(name="NormalizationTablesSpec")
public class NormalizationTablesSpecEntity {

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
	private String originalTable;
	public String getOriginalTable() {
		return originalTable;
	}
	public void setOriginalTable(String originalTable) {
		this.originalTable = originalTable;
	}

	@DataField(pos = 3)
	private String dataType;
	public String getDataType() {
		return dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	@DataField(pos = 4)
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

} 

