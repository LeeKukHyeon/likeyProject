package ks44team03.dto;

public class Option {
	private String optionCode;
	private String buyOrderCode; // buy_order_code 주문정보코드
	private String optionSelect;
	public String getOptionCode() {
		return optionCode;
	}
	public void setOptionCode(String optionCode) {
		this.optionCode = optionCode;
	}
	public String getBuyOrderCode() {
		return buyOrderCode;
	}
	public void setBuyOrderCode(String buyOrderCode) {
		this.buyOrderCode = buyOrderCode;
	}
	public String getOptionSelect() {
		return optionSelect;
	}
	public void setOptionSelect(String optionSelect) {
		this.optionSelect = optionSelect;
	}
	@Override
	public String toString() {
		return "Option [optionCode=" + optionCode + ", buyOrderCode=" + buyOrderCode + ", optionSelect=" + optionSelect
				+ "]";
	}
	
	
}
