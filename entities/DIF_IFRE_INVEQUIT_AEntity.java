package com.cppib.ifrdh.entity;

import java.util.Date;
import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;
import javax.persistence.*;

@CsvRecord(separator = "\\|", autospanLine = true)
@Entity
@Table(name="DIF_IFRE_INVEQUIT_A")
public class DIF_IFRE_INVEQUIT_AEntity {

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
	private String aSSETCODE;
	public String getASSETCODE() {
		return aSSETCODE;
	}
	public void setASSETCODE(String aSSETCODE) {
		this.aSSETCODE = aSSETCODE;
	}

	@DataField(pos = 2)
	private String aSSETCODE_D;
	public String getASSETCODE_D() {
		return aSSETCODE_D;
	}
	public void setASSETCODE_D(String aSSETCODE_D) {
		this.aSSETCODE_D = aSSETCODE_D;
	}

	@DataField(pos = 3)
	private Double gross_Invested_Equity_Less_Debt;
	public Double getGross_Invested_Equity_Less_Debt() {
		return gross_Invested_Equity_Less_Debt;
	}
	public void setGross_Invested_Equity_Less_Debt(Double gross_Invested_Equity_Less_Debt) {
		this.gross_Invested_Equity_Less_Debt = gross_Invested_Equity_Less_Debt;
	}

	@DataField(pos = 4)
	private Double capital_Additions_not_in_Commitment;
	public Double getCapital_Additions_not_in_Commitment() {
		return capital_Additions_not_in_Commitment;
	}
	public void setCapital_Additions_not_in_Commitment(Double capital_Additions_not_in_Commitment) {
		this.capital_Additions_not_in_Commitment = capital_Additions_not_in_Commitment;
	}

	@DataField(pos = 5)
	private Double expenses_inside_commitment;
	public Double getExpenses_inside_commitment() {
		return expenses_inside_commitment;
	}
	public void setExpenses_inside_commitment(Double expenses_inside_commitment) {
		this.expenses_inside_commitment = expenses_inside_commitment;
	}

	@DataField(pos = 6)
	private Double capital_Calls_for_Debt;
	public Double getCapital_Calls_for_Debt() {
		return capital_Calls_for_Debt;
	}
	public void setCapital_Calls_for_Debt(Double capital_Calls_for_Debt) {
		this.capital_Calls_for_Debt = capital_Calls_for_Debt;
	}

	@DataField(pos = 7)
	private Double temporary_ROC;
	public Double getTemporary_ROC() {
		return temporary_ROC;
	}
	public void setTemporary_ROC(Double temporary_ROC) {
		this.temporary_ROC = temporary_ROC;
	}

	@DataField(pos = 8)
	private Double permanent_ROC;
	public Double getPermanent_ROC() {
		return permanent_ROC;
	}
	public void setPermanent_ROC(Double permanent_ROC) {
		this.permanent_ROC = permanent_ROC;
	}

	@DataField(pos = 9)
	private Double aL_Invested;
	public Double getAL_Invested() {
		return aL_Invested;
	}
	public void setAL_Invested(Double aL_Invested) {
		this.aL_Invested = aL_Invested;
	}

	@DataField(pos = 10)
	private String f10;
	public String getF10() {
		return f10;
	}
	public void setF10(String f10) {
		this.f10 = f10;
	}

	@DataField(pos = 11)
	private String f11;
	public String getF11() {
		return f11;
	}
	public void setF11(String f11) {
		this.f11 = f11;
	}

	@DataField(pos = 12)
	private String f12;
	public String getF12() {
		return f12;
	}
	public void setF12(String f12) {
		this.f12 = f12;
	}

	@DataField(pos = 13)
	private Double net_Invested_Equity;
	public Double getNet_Invested_Equity() {
		return net_Invested_Equity;
	}
	public void setNet_Invested_Equity(Double net_Invested_Equity) {
		this.net_Invested_Equity = net_Invested_Equity;
	}

	@DataField(pos = 14)
	private Double gross_Invested_Equity;
	public Double getGross_Invested_Equity() {
		return gross_Invested_Equity;
	}
	public void setGross_Invested_Equity(Double gross_Invested_Equity) {
		this.gross_Invested_Equity = gross_Invested_Equity;
	}

	@DataField(pos = 15)
	private Date aSOFDATE;
	public Date getASOFDATE() {
		return aSOFDATE;
	}
	public void setASOFDATE(Date aSOFDATE) {
		this.aSOFDATE = aSOFDATE;
	}

	@DataField(pos = 16)
	private String f16;
	public String getF16() {
		return f16;
	}
	public void setF16(String f16) {
		this.f16 = f16;
	}

	@DataField(pos = 17)
	private String f17;
	public String getF17() {
		return f17;
	}
	public void setF17(String f17) {
		this.f17 = f17;
	}

	@DataField(pos = 18)
	private String f18;
	public String getF18() {
		return f18;
	}
	public void setF18(String f18) {
		this.f18 = f18;
	}

	@DataField(pos = 19)
	private String f19;
	public String getF19() {
		return f19;
	}
	public void setF19(String f19) {
		this.f19 = f19;
	}

	@DataField(pos = 20)
	private String f20;
	public String getF20() {
		return f20;
	}
	public void setF20(String f20) {
		this.f20 = f20;
	}

	@DataField(pos = 21)
	private String f21;
	public String getF21() {
		return f21;
	}
	public void setF21(String f21) {
		this.f21 = f21;
	}

	@DataField(pos = 22)
	private String f22;
	public String getF22() {
		return f22;
	}
	public void setF22(String f22) {
		this.f22 = f22;
	}

	@DataField(pos = 23)
	private String f23;
	public String getF23() {
		return f23;
	}
	public void setF23(String f23) {
		this.f23 = f23;
	}

	@DataField(pos = 24)
	private String f24;
	public String getF24() {
		return f24;
	}
	public void setF24(String f24) {
		this.f24 = f24;
	}

	@DataField(pos = 25)
	private String f25;
	public String getF25() {
		return f25;
	}
	public void setF25(String f25) {
		this.f25 = f25;
	}

	@DataField(pos = 26)
	private String f26;
	public String getF26() {
		return f26;
	}
	public void setF26(String f26) {
		this.f26 = f26;
	}

	@DataField(pos = 27)
	private String f27;
	public String getF27() {
		return f27;
	}
	public void setF27(String f27) {
		this.f27 = f27;
	}

	@DataField(pos = 28)
	private String f28;
	public String getF28() {
		return f28;
	}
	public void setF28(String f28) {
		this.f28 = f28;
	}

	@DataField(pos = 29)
	private String f29;
	public String getF29() {
		return f29;
	}
	public void setF29(String f29) {
		this.f29 = f29;
	}

	@DataField(pos = 30)
	private String f30;
	public String getF30() {
		return f30;
	}
	public void setF30(String f30) {
		this.f30 = f30;
	}

	@DataField(pos = 31)
	private String f31;
	public String getF31() {
		return f31;
	}
	public void setF31(String f31) {
		this.f31 = f31;
	}

	@DataField(pos = 32)
	private String f32;
	public String getF32() {
		return f32;
	}
	public void setF32(String f32) {
		this.f32 = f32;
	}

	@DataField(pos = 33)
	private String f33;
	public String getF33() {
		return f33;
	}
	public void setF33(String f33) {
		this.f33 = f33;
	}

	@DataField(pos = 34)
	private String f34;
	public String getF34() {
		return f34;
	}
	public void setF34(String f34) {
		this.f34 = f34;
	}

	@DataField(pos = 35)
	private String f35;
	public String getF35() {
		return f35;
	}
	public void setF35(String f35) {
		this.f35 = f35;
	}

	@DataField(pos = 36)
	private String f36;
	public String getF36() {
		return f36;
	}
	public void setF36(String f36) {
		this.f36 = f36;
	}

	@DataField(pos = 37)
	private String f37;
	public String getF37() {
		return f37;
	}
	public void setF37(String f37) {
		this.f37 = f37;
	}

	@DataField(pos = 38)
	private String f38;
	public String getF38() {
		return f38;
	}
	public void setF38(String f38) {
		this.f38 = f38;
	}

	@DataField(pos = 39)
	private String f39;
	public String getF39() {
		return f39;
	}
	public void setF39(String f39) {
		this.f39 = f39;
	}

	@DataField(pos = 40)
	private String f40;
	public String getF40() {
		return f40;
	}
	public void setF40(String f40) {
		this.f40 = f40;
	}

	@DataField(pos = 41)
	private String f41;
	public String getF41() {
		return f41;
	}
	public void setF41(String f41) {
		this.f41 = f41;
	}

	@DataField(pos = 42)
	private String f42;
	public String getF42() {
		return f42;
	}
	public void setF42(String f42) {
		this.f42 = f42;
	}

	@DataField(pos = 43)
	private String f43;
	public String getF43() {
		return f43;
	}
	public void setF43(String f43) {
		this.f43 = f43;
	}

	@DataField(pos = 44)
	private String f44;
	public String getF44() {
		return f44;
	}
	public void setF44(String f44) {
		this.f44 = f44;
	}

	@DataField(pos = 45)
	private String f45;
	public String getF45() {
		return f45;
	}
	public void setF45(String f45) {
		this.f45 = f45;
	}

	@DataField(pos = 46)
	private String f46;
	public String getF46() {
		return f46;
	}
	public void setF46(String f46) {
		this.f46 = f46;
	}

	@DataField(pos = 47)
	private String f47;
	public String getF47() {
		return f47;
	}
	public void setF47(String f47) {
		this.f47 = f47;
	}

	@DataField(pos = 48)
	private String f48;
	public String getF48() {
		return f48;
	}
	public void setF48(String f48) {
		this.f48 = f48;
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

} 

