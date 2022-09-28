package ks44team03.dto;

public class Coupon {
	
	private String cCode;//쿠폰코드
	private String cDate;//쿠폰발급날짜
	private String cEDate;//쿠폰소멸날짜
	private String cUseDate;//쿠폰사용날짜

	public String getcCode() {
		return cCode;
	}
	public void setcCode(String cCode) {
		this.cCode = cCode;
	}
	public String getcDate() {
		return cDate;
	}
	public void setcDate(String cDate) {
		this.cDate = cDate;
	}
	public String getcEDate() {
		return cEDate;
	}
	public void setcEDate(String cEDate) {
		this.cEDate = cEDate;
	}
	public String getcUseDate() {
		return cUseDate;
	}
	public void setcUseDate(String cUseDate) {
		this.cUseDate = cUseDate;
	}
	
	
	@Override
	public String toString() {
		return "Coupon [cCode=" + cCode + ", cDate=" + cDate + ", cEDate=" + cEDate + ", cUseDate=" + cUseDate
				+ ", couponCount=" +  "]";
	}
	

	
}
