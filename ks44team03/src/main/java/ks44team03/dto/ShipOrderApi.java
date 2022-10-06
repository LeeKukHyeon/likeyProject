package ks44team03.dto;

public class ShipOrderApi {
	private String logisticsCenter;
	private String goodsOrderDate;
	private String trackingNum;
	private String groupingDelivery;
	private String goodsUrl;
	private String gName;
	private int totalPrice;
	private String orderState;
	private String statInfo;
	private String userName;
	private String buyOrderCode;
	public String getLogisticsCenter() {
		return logisticsCenter;
	}
	public void setLogisticsCenter(String logisticsCenter) {
		this.logisticsCenter = logisticsCenter;
	}
	public String getGoodsOrderDate() {
		return goodsOrderDate;
	}
	public void setGoodsOrderDate(String goodsOrderDate) {
		this.goodsOrderDate = goodsOrderDate;
	}
	public String getTrackingNum() {
		return trackingNum;
	}
	public void setTrackingNum(String trackingNum) {
		this.trackingNum = trackingNum;
	}
	public String getGroupingDelivery() {
		return groupingDelivery;
	}
	public void setGroupingDelivery(String groupingDelivery) {
		this.groupingDelivery = groupingDelivery;
	}
	public String getGoodsUrl() {
		return goodsUrl;
	}
	public void setGoodsUrl(String goodsUrl) {
		this.goodsUrl = goodsUrl;
	}
	public String getgName() {
		return gName;
	}
	public void setgName(String gName) {
		this.gName = gName;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getOrderState() {
		return orderState;
	}
	public void setOrderState(String orderState) {
		this.orderState = orderState;
	}
	public String getStatInfo() {
		return statInfo;
	}
	public void setStatInfo(String statInfo) {
		this.statInfo = statInfo;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getBuyOrderCode() {
		return buyOrderCode;
	}
	public void setBuyOrderCode(String buyOrderCode) {
		this.buyOrderCode = buyOrderCode;
	}
	
	@Override
	public String toString() {
		return "ShipOrderApi [logisticsCenter=" + logisticsCenter + ", goodsOrderDate=" + goodsOrderDate
				+ ", trackingNum=" + trackingNum + ", groupingDelivery=" + groupingDelivery + ", goodsUrl=" + goodsUrl
				+ ", gName=" + gName + ", totalPrice=" + totalPrice + ", orderState=" + orderState + ", statInfo="
				+ statInfo + ", userName=" + userName + ", buyOrderCode=" + buyOrderCode + "]";
	}
	
	
	
}

