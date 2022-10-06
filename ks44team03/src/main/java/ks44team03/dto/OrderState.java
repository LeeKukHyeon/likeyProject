package ks44team03.dto;

// 주문상태 DTO
public class OrderState {
	
	private String orderStatus; // order_status     주문상태코드
	private String buyOrderCode; // buy_order_code 주문정보코드
	private String timeTracking; // time_tracking   배송상태정보등록날짜
	private String orderState; // order_state		  주문상태
	
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getBuyOrderCode() {
		return buyOrderCode;
	}
	public void setBuyOrderCode(String buyOrderCode) {
		this.buyOrderCode = buyOrderCode;
	}
	public String getTimeTracking() {
		return timeTracking;
	}
	public void setTimeTracking(String timeTracking) {
		this.timeTracking = timeTracking;
	}
	public String getOrderState() {
		return orderState;
	}
	public void setOrderState(String orderState) {
		this.orderState = orderState;
	}
	
	@Override
	public String toString() {
		return "OrderState [orderStatus=" + orderStatus + ", buyOrderCode=" + buyOrderCode + ", timeTracking="
				+ timeTracking + ", orderState=" + orderState + "]";
	}
	
	
}
