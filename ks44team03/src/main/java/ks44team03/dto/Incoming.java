package ks44team03.dto;

public class Incoming {
	
	private String incomingCode;	//입고관리코드
	private String goodsInfoCode;	//상품정보코드
	private String eCode;			//사원코드
	private String name;			//수령인
	private String trackingNum;		//운송장 번호
	private String userPoboxCode;	//사서함 번호
	private String buyWay;			//서비스 종류
	private char likeyPass;			//라이키패스 여부
	private String arrivalDate;		//입고일
	private int volumeWidth;		//입고물품 가로길이(cm)
	private int volumeLength;		//입고물품 세로길이(cm)
	private int volumeHeight;		//입고물품 높이길이(cm)
	private int width;				//입고물품 중량(kg)
	public String getIncomingCode() {
		return incomingCode;
	}
	public void setIncomingCode(String incomingCode) {
		this.incomingCode = incomingCode;
	}
	public String getGoodsInfoCode() {
		return goodsInfoCode;
	}
	public void setGoodsInfoCode(String goodsInfoCode) {
		this.goodsInfoCode = goodsInfoCode;
	}
	public String geteCode() {
		return eCode;
	}
	public void seteCode(String eCode) {
		this.eCode = eCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTrackingNum() {
		return trackingNum;
	}
	public void setTrackingNum(String trackingNum) {
		this.trackingNum = trackingNum;
	}
	public String getUserPoboxCode() {
		return userPoboxCode;
	}
	public void setUserPoboxCode(String userPoboxCode) {
		this.userPoboxCode = userPoboxCode;
	}
	public String getBuyWay() {
		return buyWay;
	}
	public void setBuyWay(String buyWay) {
		this.buyWay = buyWay;
	}
	public char getLikeyPass() {
		return likeyPass;
	}
	public void setLikeyPass(char likeyPass) {
		this.likeyPass = likeyPass;
	}
	public String getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public int getVolumeWidth() {
		return volumeWidth;
	}
	public void setVolumeWidth(int volumeWidth) {
		this.volumeWidth = volumeWidth;
	}
	public int getVolumeLength() {
		return volumeLength;
	}
	public void setVolumeLength(int volumeLength) {
		this.volumeLength = volumeLength;
	}
	public int getVolumeHeight() {
		return volumeHeight;
	}
	public void setVolumeHeight(int volumeHeight) {
		this.volumeHeight = volumeHeight;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	@Override
	public String toString() {
		return "Incoming [incomingCode=" + incomingCode + ", goodsInfoCode=" + goodsInfoCode + ", eCode=" + eCode
				+ ", name=" + name + ", trackingNum=" + trackingNum + ", userPoboxCode=" + userPoboxCode + ", buyWay="
				+ buyWay + ", likeyPass=" + likeyPass + ", arrivalDate=" + arrivalDate + ", volumeWidth=" + volumeWidth
				+ ", volumeLength=" + volumeLength + ", volumeHeight=" + volumeHeight + ", width=" + width + "]";
	}
	
}
