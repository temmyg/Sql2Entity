package com.cppib.ifrdh.entity;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;
import javax.persistence.*;

@CsvRecord(separator = "\\|", autospanLine = true)
@Entity
@Table(name="DIF_RIQCD")
public class DIF_RIQCDEntity {

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
	private String f1;
	public String getF1() {
		return f1;
	}
	public void setF1(String f1) {
		this.f1 = f1;
	}

	@DataField(pos = 2)
	private String performance_table_;
	public String getPerformance_table_() {
		return performance_table_;
	}
	public void setPerformance_table_(String performance_table_) {
		this.performance_table_ = performance_table_;
	}

	@DataField(pos = 3)
	private String performance_Table_1;
	public String getPerformance_Table_1() {
		return performance_Table_1;
	}
	public void setPerformance_Table_1(String performance_Table_1) {
		this.performance_Table_1 = performance_Table_1;
	}

	@DataField(pos = 4)
	private String performance_Table_2;
	public String getPerformance_Table_2() {
		return performance_Table_2;
	}
	public void setPerformance_Table_2(String performance_Table_2) {
		this.performance_Table_2 = performance_Table_2;
	}

	@DataField(pos = 5)
	private String performance_Table_3;
	public String getPerformance_Table_3() {
		return performance_Table_3;
	}
	public void setPerformance_Table_3(String performance_Table_3) {
		this.performance_Table_3 = performance_Table_3;
	}

	@DataField(pos = 6)
	private String performance_Table_4;
	public String getPerformance_Table_4() {
		return performance_Table_4;
	}
	public void setPerformance_Table_4(String performance_Table_4) {
		this.performance_Table_4 = performance_Table_4;
	}

	@DataField(pos = 7)
	private String performance_Table_5;
	public String getPerformance_Table_5() {
		return performance_Table_5;
	}
	public void setPerformance_Table_5(String performance_Table_5) {
		this.performance_Table_5 = performance_Table_5;
	}

	@DataField(pos = 8)
	private String performance_Table_6;
	public String getPerformance_Table_6() {
		return performance_Table_6;
	}
	public void setPerformance_Table_6(String performance_Table_6) {
		this.performance_Table_6 = performance_Table_6;
	}

	@DataField(pos = 9)
	private String performance_Table_7;
	public String getPerformance_Table_7() {
		return performance_Table_7;
	}
	public void setPerformance_Table_7(String performance_Table_7) {
		this.performance_Table_7 = performance_Table_7;
	}

	@DataField(pos = 10)
	private String performance_Table_8;
	public String getPerformance_Table_8() {
		return performance_Table_8;
	}
	public void setPerformance_Table_8(String performance_Table_8) {
		this.performance_Table_8 = performance_Table_8;
	}

	@DataField(pos = 11)
	private String performance_Table_9;
	public String getPerformance_Table_9() {
		return performance_Table_9;
	}
	public void setPerformance_Table_9(String performance_Table_9) {
		this.performance_Table_9 = performance_Table_9;
	}

	@DataField(pos = 12)
	private String performance_Table_10;
	public String getPerformance_Table_10() {
		return performance_Table_10;
	}
	public void setPerformance_Table_10(String performance_Table_10) {
		this.performance_Table_10 = performance_Table_10;
	}

	@DataField(pos = 13)
	private String performance_Table_11;
	public String getPerformance_Table_11() {
		return performance_Table_11;
	}
	public void setPerformance_Table_11(String performance_Table_11) {
		this.performance_Table_11 = performance_Table_11;
	}

	@DataField(pos = 14)
	private String performance_;
	public String getPerformance_() {
		return performance_;
	}
	public void setPerformance_(String performance_) {
		this.performance_ = performance_;
	}

	@DataField(pos = 15)
	private String gL_;
	public String getGL_() {
		return gL_;
	}
	public void setGL_(String gL_) {
		this.gL_ = gL_;
	}

	@DataField(pos = 16)
	private String gL_1;
	public String getGL_1() {
		return gL_1;
	}
	public void setGL_1(String gL_1) {
		this.gL_1 = gL_1;
	}

	@DataField(pos = 17)
	private String gL_2;
	public String getGL_2() {
		return gL_2;
	}
	public void setGL_2(String gL_2) {
		this.gL_2 = gL_2;
	}

	@DataField(pos = 18)
	private String gL_3;
	public String getGL_3() {
		return gL_3;
	}
	public void setGL_3(String gL_3) {
		this.gL_3 = gL_3;
	}

	@DataField(pos = 19)
	private String gL_4;
	public String getGL_4() {
		return gL_4;
	}
	public void setGL_4(String gL_4) {
		this.gL_4 = gL_4;
	}

	@DataField(pos = 20)
	private String gL_5;
	public String getGL_5() {
		return gL_5;
	}
	public void setGL_5(String gL_5) {
		this.gL_5 = gL_5;
	}

	@DataField(pos = 21)
	private String gL_6;
	public String getGL_6() {
		return gL_6;
	}
	public void setGL_6(String gL_6) {
		this.gL_6 = gL_6;
	}

	@DataField(pos = 22)
	private String gL_7;
	public String getGL_7() {
		return gL_7;
	}
	public void setGL_7(String gL_7) {
		this.gL_7 = gL_7;
	}

	@DataField(pos = 23)
	private String gL_8;
	public String getGL_8() {
		return gL_8;
	}
	public void setGL_8(String gL_8) {
		this.gL_8 = gL_8;
	}

	@DataField(pos = 24)
	private String gL_9;
	public String getGL_9() {
		return gL_9;
	}
	public void setGL_9(String gL_9) {
		this.gL_9 = gL_9;
	}

	@DataField(pos = 25)
	private String gL_10;
	public String getGL_10() {
		return gL_10;
	}
	public void setGL_10(String gL_10) {
		this.gL_10 = gL_10;
	}

	@DataField(pos = 26)
	private String gL_11;
	public String getGL_11() {
		return gL_11;
	}
	public void setGL_11(String gL_11) {
		this.gL_11 = gL_11;
	}

	@DataField(pos = 27)
	private String gL_12;
	public String getGL_12() {
		return gL_12;
	}
	public void setGL_12(String gL_12) {
		this.gL_12 = gL_12;
	}

	@DataField(pos = 28)
	private String difference_;
	public String getDifference_() {
		return difference_;
	}
	public void setDifference_(String difference_) {
		this.difference_ = difference_;
	}

	@DataField(pos = 29)
	private String difference_1;
	public String getDifference_1() {
		return difference_1;
	}
	public void setDifference_1(String difference_1) {
		this.difference_1 = difference_1;
	}

	@DataField(pos = 30)
	private String difference_2;
	public String getDifference_2() {
		return difference_2;
	}
	public void setDifference_2(String difference_2) {
		this.difference_2 = difference_2;
	}

	@DataField(pos = 31)
	private String difference_3;
	public String getDifference_3() {
		return difference_3;
	}
	public void setDifference_3(String difference_3) {
		this.difference_3 = difference_3;
	}

	@DataField(pos = 32)
	private String difference_4;
	public String getDifference_4() {
		return difference_4;
	}
	public void setDifference_4(String difference_4) {
		this.difference_4 = difference_4;
	}

	@DataField(pos = 33)
	private String difference_5;
	public String getDifference_5() {
		return difference_5;
	}
	public void setDifference_5(String difference_5) {
		this.difference_5 = difference_5;
	}

	@DataField(pos = 34)
	private String difference_6;
	public String getDifference_6() {
		return difference_6;
	}
	public void setDifference_6(String difference_6) {
		this.difference_6 = difference_6;
	}

	@DataField(pos = 35)
	private String difference_7;
	public String getDifference_7() {
		return difference_7;
	}
	public void setDifference_7(String difference_7) {
		this.difference_7 = difference_7;
	}

	@DataField(pos = 36)
	private String difference_8;
	public String getDifference_8() {
		return difference_8;
	}
	public void setDifference_8(String difference_8) {
		this.difference_8 = difference_8;
	}

	@DataField(pos = 37)
	private String difference_9;
	public String getDifference_9() {
		return difference_9;
	}
	public void setDifference_9(String difference_9) {
		this.difference_9 = difference_9;
	}

	@DataField(pos = 38)
	private String difference_10;
	public String getDifference_10() {
		return difference_10;
	}
	public void setDifference_10(String difference_10) {
		this.difference_10 = difference_10;
	}

	@DataField(pos = 39)
	private String difference_11;
	public String getDifference_11() {
		return difference_11;
	}
	public void setDifference_11(String difference_11) {
		this.difference_11 = difference_11;
	}

	@DataField(pos = 40)
	private String difference_12;
	public String getDifference_12() {
		return difference_12;
	}
	public void setDifference_12(String difference_12) {
		this.difference_12 = difference_12;
	}

	@DataField(pos = 41)
	private String yTD_Income_Return_Levered;
	public String getYTD_Income_Return_Levered() {
		return yTD_Income_Return_Levered;
	}
	public void setYTD_Income_Return_Levered(String yTD_Income_Return_Levered) {
		this.yTD_Income_Return_Levered = yTD_Income_Return_Levered;
	}

	@DataField(pos = 42)
	private String yTD_Capital_Return_Levered;
	public String getYTD_Capital_Return_Levered() {
		return yTD_Capital_Return_Levered;
	}
	public void setYTD_Capital_Return_Levered(String yTD_Capital_Return_Levered) {
		this.yTD_Capital_Return_Levered = yTD_Capital_Return_Levered;
	}

	@DataField(pos = 43)
	private String yTD_FX_Return_Levered;
	public String getYTD_FX_Return_Levered() {
		return yTD_FX_Return_Levered;
	}
	public void setYTD_FX_Return_Levered(String yTD_FX_Return_Levered) {
		this.yTD_FX_Return_Levered = yTD_FX_Return_Levered;
	}

	@DataField(pos = 44)
	private String yTD_Total_Return_Levered;
	public String getYTD_Total_Return_Levered() {
		return yTD_Total_Return_Levered;
	}
	public void setYTD_Total_Return_Levered(String yTD_Total_Return_Levered) {
		this.yTD_Total_Return_Levered = yTD_Total_Return_Levered;
	}

	@DataField(pos = 45)
	private String yTD_Income_Return_Unlevered;
	public String getYTD_Income_Return_Unlevered() {
		return yTD_Income_Return_Unlevered;
	}
	public void setYTD_Income_Return_Unlevered(String yTD_Income_Return_Unlevered) {
		this.yTD_Income_Return_Unlevered = yTD_Income_Return_Unlevered;
	}

	@DataField(pos = 46)
	private String yTD_Capital_Return_Unlevered;
	public String getYTD_Capital_Return_Unlevered() {
		return yTD_Capital_Return_Unlevered;
	}
	public void setYTD_Capital_Return_Unlevered(String yTD_Capital_Return_Unlevered) {
		this.yTD_Capital_Return_Unlevered = yTD_Capital_Return_Unlevered;
	}

	@DataField(pos = 47)
	private String yTD_FX_Retrun_Unlevered;
	public String getYTD_FX_Retrun_Unlevered() {
		return yTD_FX_Retrun_Unlevered;
	}
	public void setYTD_FX_Retrun_Unlevered(String yTD_FX_Retrun_Unlevered) {
		this.yTD_FX_Retrun_Unlevered = yTD_FX_Retrun_Unlevered;
	}

	@DataField(pos = 48)
	private String yTD_Total_Return_Unlevered;
	public String getYTD_Total_Return_Unlevered() {
		return yTD_Total_Return_Unlevered;
	}
	public void setYTD_Total_Return_Unlevered(String yTD_Total_Return_Unlevered) {
		this.yTD_Total_Return_Unlevered = yTD_Total_Return_Unlevered;
	}

	@DataField(pos = 49)
	private String f49;
	public String getF49() {
		return f49;
	}
	public void setF49(String f49) {
		this.f49 = f49;
	}

	@DataField(pos = 50)
	private String f50;
	public String getF50() {
		return f50;
	}
	public void setF50(String f50) {
		this.f50 = f50;
	}

	@DataField(pos = 51)
	private String f51;
	public String getF51() {
		return f51;
	}
	public void setF51(String f51) {
		this.f51 = f51;
	}

	@DataField(pos = 52)
	private String f52;
	public String getF52() {
		return f52;
	}
	public void setF52(String f52) {
		this.f52 = f52;
	}

	@DataField(pos = 53)
	private String f53;
	public String getF53() {
		return f53;
	}
	public void setF53(String f53) {
		this.f53 = f53;
	}

	@DataField(pos = 54)
	private String f54;
	public String getF54() {
		return f54;
	}
	public void setF54(String f54) {
		this.f54 = f54;
	}

	@DataField(pos = 55)
	private String f55;
	public String getF55() {
		return f55;
	}
	public void setF55(String f55) {
		this.f55 = f55;
	}

	@DataField(pos = 56)
	private String f56;
	public String getF56() {
		return f56;
	}
	public void setF56(String f56) {
		this.f56 = f56;
	}

	@DataField(pos = 57)
	private String f57;
	public String getF57() {
		return f57;
	}
	public void setF57(String f57) {
		this.f57 = f57;
	}

	@DataField(pos = 58)
	private String f58;
	public String getF58() {
		return f58;
	}
	public void setF58(String f58) {
		this.f58 = f58;
	}

	@DataField(pos = 59)
	private String f59;
	public String getF59() {
		return f59;
	}
	public void setF59(String f59) {
		this.f59 = f59;
	}

	@DataField(pos = 60)
	private String f60;
	public String getF60() {
		return f60;
	}
	public void setF60(String f60) {
		this.f60 = f60;
	}

	@DataField(pos = 61)
	private String f61;
	public String getF61() {
		return f61;
	}
	public void setF61(String f61) {
		this.f61 = f61;
	}

	@DataField(pos = 62)
	private String f62;
	public String getF62() {
		return f62;
	}
	public void setF62(String f62) {
		this.f62 = f62;
	}

	@DataField(pos = 63)
	private String f63;
	public String getF63() {
		return f63;
	}
	public void setF63(String f63) {
		this.f63 = f63;
	}

	@DataField(pos = 64)
	private String f64;
	public String getF64() {
		return f64;
	}
	public void setF64(String f64) {
		this.f64 = f64;
	}

	@DataField(pos = 65)
	private String f65;
	public String getF65() {
		return f65;
	}
	public void setF65(String f65) {
		this.f65 = f65;
	}

	@DataField(pos = 66)
	private String f66;
	public String getF66() {
		return f66;
	}
	public void setF66(String f66) {
		this.f66 = f66;
	}

	@DataField(pos = 67)
	private String f67;
	public String getF67() {
		return f67;
	}
	public void setF67(String f67) {
		this.f67 = f67;
	}

	@DataField(pos = 68)
	private String f68;
	public String getF68() {
		return f68;
	}
	public void setF68(String f68) {
		this.f68 = f68;
	}

	@DataField(pos = 69)
	private String f69;
	public String getF69() {
		return f69;
	}
	public void setF69(String f69) {
		this.f69 = f69;
	}

	@DataField(pos = 70)
	private String f70;
	public String getF70() {
		return f70;
	}
	public void setF70(String f70) {
		this.f70 = f70;
	}

} 

