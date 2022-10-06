package ks44team03.dto;

public class DeliveryCurrentState {
	
	private String deliveryStatus;
	private String goodsInfoCode;
	private String timeTracking;
	private String statInfo;
	
	public String getDeliveryStatus() {
		return deliveryStatus;
	}
	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}
	public String getGoodsInfoCode() {
		return goodsInfoCode;
	}
	public void setGoodsInfoCode(String goodsInfoCode) {
		this.goodsInfoCode = goodsInfoCode;
	}
	public String getTimeTracking() {
		return timeTracking;
	}
	public void setTimeTracking(String timeTracking) {
		this.timeTracking = timeTracking;
	}
	public String getStatInfo() {
		return statInfo;
	}
	public void setStatInfo(String statInfo) {
		this.statInfo = statInfo;
	}
	
	@Override
	public String toString() {
		return "DeliveryCurrentState [deliveryStatus=" + deliveryStatus + ", goodsInfoCode=" + goodsInfoCode
				+ ", timeTracking=" + timeTracking + ", statInfo=" + statInfo + "]";
	}
	
	
}
