package ks44team03.dto;

public class Incoming {
	
	private String incomingCode;	//입고관리코드
	private String goodsInfoCode;	//상품정보코드
	private String eCode;			//사원코드
	private String trackingNum;		//운송장 번호
	private String userPoboxCode;	//사서함 번호
	private int volume;				//입고물품 부피
	private double weight;			//입고물품 중량(kg)
	private String likeyPass;		//라이키패스 가입여부
	private String photoSave;		//입고물품 사진
	private String arrivalDate;		//입고일
	
	
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
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getLikeyPass() {
		return likeyPass;
	}
	public void setLikeyPass(String likeyPass) {
		this.likeyPass = likeyPass;
	}
	public String getPhotoSave() {
		return photoSave;
	}
	public void setPhotoSave(String photoSave) {
		this.photoSave = photoSave;
	}
	public String getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	
	@Override
	public String toString() {
		return "Incoming [incomingCode=" + incomingCode + ", goodsInfoCode=" + goodsInfoCode + ", eCode=" + eCode
				+ ", trackingNum=" + trackingNum + ", userPoboxCode=" + userPoboxCode + ", volume=" + volume
				+ ", weight=" + weight + ", likeyPass=" + likeyPass + ", photoSave=" + photoSave + ", arrivalDate="
				+ arrivalDate + "]";
	}
	
}
