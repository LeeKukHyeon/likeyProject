package ks44team03.dto;

public class CouponList {

	private String couponCode; //쿠폰코드
	private String couponName; //쿠폰 이름
	private String couponPrice; //쿠폰 할인 가격
	private String couponDate; //쿠폰 등록 날짜
	
	public String getCouponCode() {
		return couponCode;
	}
	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}
	public String getCouponName() {
		return couponName;
	}
	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}
	public String getCouponPrice() {
		return couponPrice;
	}
	public void setCouponPrice(String couponPrice) {
		this.couponPrice = couponPrice;
	}
	public String getCouponDate() {
		return couponDate;
	}
	public void setCouponDate(String couponDate) {
		this.couponDate = couponDate;
	}
	@Override
	public String toString() {
		return "CouponList [couponCode=" + couponCode + ", couponName=" + couponName + ", couponPrice=" + couponPrice
				+ ", couponDate=" + couponDate + "]";
	}
	
	
}
