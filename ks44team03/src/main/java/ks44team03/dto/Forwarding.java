package ks44team03.dto;

public class Forwarding {

	private int number;				//글번호
	private String goodsInfoCode;	//상품정보코드
	private String name;			//수령인
	private String transportation;	//운송수단
	private String outCompany;		//배송회사
	private String outTrackingNum;	//운송장 번호
	private char reqOptionImpli;	//요청옵션 이행여부
	private char postpone;			//출고보류 여부
	private char sumPost;			//묶음배송 여부
	private char approval;			//관리자 출고승인 여부
	private String outDate;			//출고일
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getGoodsInfoCode() {
		return goodsInfoCode;
	}
	public void setGoodsInfoCode(String goodsInfoCode) {
		this.goodsInfoCode = goodsInfoCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTransportation() {
		return transportation;
	}
	public void setTransportation(String transportation) {
		this.transportation = transportation;
	}
	public String getOutCompany() {
		return outCompany;
	}
	public void setOutCompany(String outCompany) {
		this.outCompany = outCompany;
	}
	public String getOutTrackingNum() {
		return outTrackingNum;
	}
	public void setOutTrackingNum(String outTrackingNum) {
		this.outTrackingNum = outTrackingNum;
	}
	public char getReqOptionImpli() {
		return reqOptionImpli;
	}
	public void setReqOptionImpli(char reqOptionImpli) {
		this.reqOptionImpli = reqOptionImpli;
	}
	public char getPostpone() {
		return postpone;
	}
	public void setPostpone(char postpone) {
		this.postpone = postpone;
	}
	public char getSumPost() {
		return sumPost;
	}
	public void setSumPost(char sumPost) {
		this.sumPost = sumPost;
	}
	public char getApproval() {
		return approval;
	}
	public void setApproval(char approval) {
		this.approval = approval;
	}
	public String getOutDate() {
		return outDate;
	}
	public void setOutDate(String outDate) {
		this.outDate = outDate;
	}
	@Override
	public String toString() {
		return "Forwarding [number=" + number + ", goodsInfoCode=" + goodsInfoCode + ", name=" + name
				+ ", transportation=" + transportation + ", outCompany=" + outCompany + ", outTrackingNum="
				+ outTrackingNum + ", reqOptionImpli=" + reqOptionImpli + ", postpone=" + postpone + ", sumPost="
				+ sumPost + ", approval=" + approval + ", outDate=" + outDate + "]";
	}
	
}
