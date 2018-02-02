package com.ifrdh.column2property.models;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="NormTables")
public class NormTablesEntity {

	@Id
	private String tableName;
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	private String orderedId;
	public String getOrderedId() {
		return orderedId;
	}
	public void setOrderedId(String orderedId) {
		this.orderedId = orderedId;
	}

	private Boolean isNormalizing;
	public Boolean getIsNormalizing() {
		return isNormalizing;
	}
	public void setIsNormalizing(Boolean isNormalizing) {
		this.isNormalizing = isNormalizing;
	}

	private int ColumnNumberRequired;
	public int getColumnNumberRequired() {
		return ColumnNumberRequired;
	}
	public void setColumnNumberRequired(int columnNumberRequired) {
		ColumnNumberRequired = columnNumberRequired;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "table", targetEntity = NormalizationTablesSpecEntity.class)
    private Set<NormalizationTablesSpecEntity> columns;


//	private List<NormalizationTablesSpecEntity> columns;

	//@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "table", targetEntity = NormalizationTablesSpecEntity.class)
//	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "table")
//	public List<NormalizationTablesSpecEntity> getColumns() {
//	    return columns;
//    }
//
//    public void setColumns(List<NormalizationTablesSpecEntity> columns) {
//        this.columns = columns;
//    }
}

