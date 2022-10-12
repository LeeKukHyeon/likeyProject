package ks44team03.dto;

public class OrderInfo {
	private String buyOrderCode;
	private String logisticsCenter;
	private String userPoboxCode;
	private String id;
	private String transportation;
	private String nation;
	private String orderNum;
	private String userName;
	private String phone;
	private String postNum;
	private String addr;
	private String totalPrice;
	private String goodsOrderDate;	
	private String step1;	
	private String step2;	
	private String step3;	
	private String DesiredCourier;
	private String buyWay;
	private String request;
	private String friendsDeCheck  ;
	private int commission;
	
	public String getBuyOrderCode() {
		return buyOrderCode;
	}
	public void setBuyOrderCode(String buyOrderCode) {
		this.buyOrderCode = buyOrderCode;
	}
	public String getLogisticsCenter() {
		return logisticsCenter;
	}
	public void setLogisticsCenter(String logisticsCenter) {
		this.logisticsCenter = logisticsCenter;
	}
	public String getUserPoboxCode() {
		return userPoboxCode;
	}
	public void setUserPoboxCode(String userPoboxCode) {
		this.userPoboxCode = userPoboxCode;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTransportation() {
		return transportation;
	}
	public void setTransportation(String transportation) {
		this.transportation = transportation;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPostNum() {
		return postNum;
	}
	public void setPostNum(String postNum) {
		this.postNum = postNum;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getGoodsOrderDate() {
		return goodsOrderDate;
	}
	public void setGoodsOrderDate(String goodsOrderDate) {
		this.goodsOrderDate = goodsOrderDate;
	}
	public String getStep1() {
		return step1;
	}
	public void setStep1(String step1) {
		this.step1 = step1;
	}
	public String getStep2() {
		return step2;
	}
	public void setStep2(String step2) {
		this.step2 = step2;
	}
	public String getStep3() {
		return step3;
	}
	public void setStep3(String step3) {
		this.step3 = step3;
	}
	public String getDesiredCourier() {
		return DesiredCourier;
	}
	public void setDesiredCourier(String desiredCourier) {
		DesiredCourier = desiredCourier;
	}
	public String getBuyWay() {
		return buyWay;
	}
	public void setBuyWay(String buyWay) {
		this.buyWay = buyWay;
	}
	public String getRequest() {
		return request;
	}
	public void setRequest(String request) {
		this.request = request;
	}
	public String getFriendsDeCheck() {
		return friendsDeCheck;
	}
	public void setFriendsDeCheck(String friendsDeCheck) {
		this.friendsDeCheck = friendsDeCheck;
	}
	public int getCommission() {
		return commission;
	}
	public void setCommission(int commission) {
		this.commission = commission;
	}
	
	@Override
	public String toString() {
		return "OrderInfo [buyOrderCode=" + buyOrderCode + ", logisticsCenter=" + logisticsCenter + ", userPoboxCode="
				+ userPoboxCode + ", id=" + id + ", transportation=" + transportation + ", nation=" + nation
				+ ", orderNum=" + orderNum + ", userName=" + userName + ", phone=" + phone + ", postNum=" + postNum
				+ ", addr=" + addr + ", totalPrice=" + totalPrice + ", goodsOrderDate=" + goodsOrderDate + ", step1="
				+ step1 + ", step2=" + step2 + ", step3=" + step3 + ", DesiredCourier=" + DesiredCourier + ", buyWay="
				+ buyWay + ", request=" + request + ", friendsDeCheck=" + friendsDeCheck + ", commission=" + commission
				+ "]";
	}
	
}
