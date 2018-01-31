package com.ifrdh.column2property.models;

import javax.persistence.*;

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

	private String columnName;
	public String getColumnName() {
		return columnName;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

//	private String originalTable;
//	public String getOriginalTable() {
//		return originalTable;
//	}
//	public void setOriginalTable(String originalTable) {
//		this.originalTable = originalTable;
//	}

	private String dataType;
	public String getDataType() {
		return dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	private NormTablesEntity table;

	@JoinColumn(name = "originalTable")
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	public NormTablesEntity getTable() {
		return table;
	}

	public void setTable(NormTablesEntity table) {
		this.table = table;
	}
}
