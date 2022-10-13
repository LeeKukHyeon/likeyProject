package ks44team03.dto;

public class CouponList {

	private String couponCode;
	private String couponName;
	private String couponPrice;
	private String couponDate;
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
