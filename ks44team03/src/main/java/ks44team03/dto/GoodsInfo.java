package ks44team03.dto;

public class GoodsInfo {
	
	private String goodsInfoCode;
	private String id;
	private String buyOrderCode;
	private String groupingDelivery;
	private String gSite;
	private String goodsImgUrl;
	private String goodsImgUpload;
	private String gName;
	private String deliveryCompany; 
	private String trackingNum;
	private String gSize;
	private String gColor;
	private String goodsOption;
	private int goodsPrice;
	private int gAmount;
	private int totalPrice;
	private String likeyPass;
	private String barCode;
	private String arrival;
	private String arrivalDate;
	private String hsCode;
	private String gBrand;
	private String goodsUrl;
	private String storeName;
	private String storeLocation;
	
	private OrderInfo orderInfoDto; // OrderInfo List DTO
	private DeliveryCurrentState deliveryCurrentStateDto; // DeliveryCurrentState List DTO
	
	
	public String getGoodsInfoCode() {
		return goodsInfoCode;
	}
	public void setGoodsInfoCode(String goodsInfoCode) {
		this.goodsInfoCode = goodsInfoCode;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBuyOrderCode() {
		return buyOrderCode;
	}
	public void setBuyOrderCode(String buyOrderCode) {
		this.buyOrderCode = buyOrderCode;
	}
	public String getGroupingDelivery() {
		return groupingDelivery;
	}
	public void setGroupingDelivery(String groupingDelivery) {
		this.groupingDelivery = groupingDelivery;
	}
	public String getgSite() {
		return gSite;
	}
	public void setgSite(String gSite) {
		this.gSite = gSite;
	}
	public String getGoodsImgUrl() {
		return goodsImgUrl;
	}
	public void setGoodsImgUrl(String goodsImgUrl) {
		this.goodsImgUrl = goodsImgUrl;
	}
	public String getGoodsImgUpload() {
		return goodsImgUpload;
	}
	public void setGoodsImgUpload(String goodsImgUpload) {
		this.goodsImgUpload = goodsImgUpload;
	}
	public String getgName() {
		return gName;
	}
	public void setgName(String gName) {
		this.gName = gName;
	}
	public String getDeliveryCompany() {
		return deliveryCompany;
	}
	public void setDeliveryCompany(String deliveryCompany) {
		this.deliveryCompany = deliveryCompany;
	}
	public String getTrackingNum() {
		return trackingNum;
	}
	public void setTrackingNum(String trackingNum) {
		this.trackingNum = trackingNum;
	}
	public String getgSize() {
		return gSize;
	}
	public void setgSize(String gSize) {
		this.gSize = gSize;
	}
	public String getgColor() {
		return gColor;
	}
	public void setgColor(String gColor) {
		this.gColor = gColor;
	}
	public String getGoodsOption() {
		return goodsOption;
	}
	public void setGoodsOption(String goodsOption) {
		this.goodsOption = goodsOption;
	}
	public int getGoodsPrice() {
		return goodsPrice;
	}
	public void setGoodsPrice(int goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	public int getgAmount() {
		return gAmount;
	}
	public void setgAmount(int gAmount) {
		this.gAmount = gAmount;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getLikeyPass() {
		return likeyPass;
	}
	public void setLikeyPass(String likeyPass) {
		this.likeyPass = likeyPass;
	}
	public String getBarCode() {
		return barCode;
	}
	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public String getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public String getHsCode() {
		return hsCode;
	}
	public void setHsCode(String hsCode) {
		this.hsCode = hsCode;
	}
	public String getgBrand() {
		return gBrand;
	}
	public void setgBrand(String gBrand) {
		this.gBrand = gBrand;
	}
	public String getGoodsUrl() {
		return goodsUrl;
	}
	public void setGoodsUrl(String goodsUrl) {
		this.goodsUrl = goodsUrl;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getStoreLocation() {
		return storeLocation;
	}
	public void setStoreLocation(String storeLocation) {
		this.storeLocation = storeLocation;
	}
	public OrderInfo getOrderInfoDto() {
		return orderInfoDto;
	}
	public void setOrderInfoDto(OrderInfo orderInfoDto) {
		this.orderInfoDto = orderInfoDto;
	}
	public DeliveryCurrentState getDeliveryCurrentStateDto() {
		return deliveryCurrentStateDto;
	}
	public void setDeliveryCurrentStateDto(DeliveryCurrentState deliveryCurrentStateDto) {
		this.deliveryCurrentStateDto = deliveryCurrentStateDto;
	}
	
	@Override
	public String toString() {
		return "GoodsInfo [goodsInfoCode=" + goodsInfoCode + ", id=" + id + ", buyOrderCode=" + buyOrderCode
				+ ", groupingDelivery=" + groupingDelivery + ", gSite=" + gSite + ", goodsImgUrl=" + goodsImgUrl
				+ ", goodsImgUpload=" + goodsImgUpload + ", gName=" + gName + ", deliveryCompany=" + deliveryCompany
				+ ", trackingNum=" + trackingNum + ", gSize=" + gSize + ", gColor=" + gColor + ", goodsOption="
				+ goodsOption + ", goodsPrice=" + goodsPrice + ", gAmount=" + gAmount + ", totalPrice=" + totalPrice
				+ ", likeyPass=" + likeyPass + ", barCode=" + barCode + ", arrival=" + arrival + ", arrivalDate="
				+ arrivalDate + ", hsCode=" + hsCode + ", gBrand=" + gBrand + ", goodsUrl=" + goodsUrl + ", storeName="
				+ storeName + ", storeLocation=" + storeLocation + ", orderInfoDto=" + orderInfoDto
				+ ", deliveryCurrentStateDto=" + deliveryCurrentStateDto + "]";
	}
		
	
}

/*  goods_info_code
, id
, buy_order_code
, grouping_delivery
, g_site
, goods_img_url
, goods_img_upload
, g_name
, delivery_company
, tracking_num
, g_size
, g_color
, goods_option
, goods_price
, g_amount
, total_price
, likey_pass
, barcode
, arrival
, arrival_date
, hscode
, g_brand
, goods__url
, store_name
, store_location */