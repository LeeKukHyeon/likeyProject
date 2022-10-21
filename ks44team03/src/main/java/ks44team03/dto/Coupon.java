package ks44team03.dto;

public class Coupon {
	
	private String csCode; //쿠폰현황 코드
	private String cCode;//쿠폰코드
	private String userId; // 회원 아이디
	private String cDate;//쿠폰발급날짜
	private String cEDate;//쿠폰소멸날짜
	private String cUseDate;//쿠폰사용날짜
	private String cUse; // 쿠폰 사용 여부
	
	private CouponList couponInfo; //쿠폰 리스트
	
	private UserInfo userInfo; //유저리스트
	
	
	
	
	public UserInfo getUserInfo() {
		return userInfo;
	}



	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}



	public CouponList getCouponInfo() {
		return couponInfo;
	}
	
	
	
	public void setCouponInfo(CouponList couponInfo) {
		this.couponInfo = couponInfo;
	}
	
	
	
	public String getCsCode() {
		return csCode;
	}
	public void setCsCode(String csCode) {
		this.csCode = csCode;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getcUse() {
		return cUse;
	}
	public void setcUse(String cUse) {
		this.cUse = cUse;
	}
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
		return "Coupon [csCode=" + csCode + ", cCode=" + cCode + ", userId=" + userId + ", cDate=" + cDate + ", cEDate="
				+ cEDate + ", cUseDate=" + cUseDate + ", cUse=" + cUse + ", couponInfo=" + couponInfo + ", userInfo="
				+ userInfo + "]";
	}
	
	
	
}
