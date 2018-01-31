package com.ifrdh.column2property.models;

import javax.persistence.*;
import java.util.List;

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

	private String isNormalizing;
	public String getIsNormalizing() {
		return isNormalizing;
	}
	public void setIsNormalizing(String isNormalizing) {
		this.isNormalizing = isNormalizing;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "table", targetEntity = NormalizationTablesSpecEntity.class)
	List<NormalizationTablesSpecEntity> columns;
} 

