package com.cppib.ifrdh.entity;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;
import javax.persistence.*;

@CsvRecord(separator = "\\|", autospanLine = true)
@Entity
@Table(name="NormTables")
public class NormTablesEntity {

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
	private String tableName;
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	@DataField(pos = 2)
	private String orderedId;
	public String getOrderedId() {
		return orderedId;
	}
	public void setOrderedId(String orderedId) {
		this.orderedId = orderedId;
	}

	@DataField(pos = 3)
	private String isNormalizing;
	public String getIsNormalizing() {
		return isNormalizing;
	}
	public void setIsNormalizing(String isNormalizing) {
		this.isNormalizing = isNormalizing;
	}

} 

