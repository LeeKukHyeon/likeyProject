package ks44team03.dto;

public class IncomingInfo {
	

	private String incomingCode;		//incoming_code 	입고 관리 코드
	private String goodsInfoCode;		//goods_info_code 	상품정보 코드
	private String eCode;				//e_code 			사원 코드
	private String reqOptionImpli;		//req_option_impli  요청 옵션 이행 여부
	private String photoSave;			//photo_save		사진촬영 저장
	private String incomingWeight;		//weight			무게측정
	private String incomingVolume;		//volume			부피측정
	private String incomingPostpone;	//postpone			고객요청 출고보류
	private String sumPost;				//sum_post 			묶음 배송
	private String sendOut;				//send_out			출고 날짜
	private String incomingApproval;	//approval			관리자 출고승인여부
	private String outTrackingNum;		//out_tracking_num	출고 운송장번호
	private String outCompany;			//out_company		출고 배송회사
	
	private GoodsInfo goodsInfoDto; 	// 굿즈인포DTO 

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

	public String getReqOptionImpli() {
		return reqOptionImpli;
	}

	public void setReqOptionImpli(String reqOptionImpli) {
		this.reqOptionImpli = reqOptionImpli;
	}

	public String getPhotoSave() {
		return photoSave;
	}

	public void setPhotoSave(String photoSave) {
		this.photoSave = photoSave;
	}

	public String getIncomingWeight() {
		return incomingWeight;
	}

	public void setIncomingWeight(String incomingWeight) {
		this.incomingWeight = incomingWeight;
	}

	public String getIncomingVolume() {
		return incomingVolume;
	}

	public void setIncomingVolume(String incomingVolume) {
		this.incomingVolume = incomingVolume;
	}

	public String getIncomingPostpone() {
		return incomingPostpone;
	}

	public void setIncomingPostpone(String incomingPostpone) {
		this.incomingPostpone = incomingPostpone;
	}

	public String getSumPost() {
		return sumPost;
	}

	public void setSumPost(String sumPost) {
		this.sumPost = sumPost;
	}

	public String getSendOut() {
		return sendOut;
	}

	public void setSendOut(String sendOut) {
		this.sendOut = sendOut;
	}

	public String getIncomingApproval() {
		return incomingApproval;
	}

	public void setIncomingApproval(String incomingApproval) {
		this.incomingApproval = incomingApproval;
	}

	public String getOutTrackingNum() {
		return outTrackingNum;
	}

	public void setOutTrackingNum(String outTrackingNum) {
		this.outTrackingNum = outTrackingNum;
	}

	public String getOutCompany() {
		return outCompany;
	}

	public void setOutCompany(String outCompany) {
		this.outCompany = outCompany;
	}

	public GoodsInfo getGoodsInfoDto() {
		return goodsInfoDto;
	}

	public void setGoodsInfoDto(GoodsInfo goodsInfoDto) {
		this.goodsInfoDto = goodsInfoDto;
	}

	@Override
	public String toString() {
		return "IncomingInfo [incomingCode=" + incomingCode + ", goodsInfoCode=" + goodsInfoCode + ", eCode=" + eCode
				+ ", reqOptionImpli=" + reqOptionImpli + ", photoSave=" + photoSave + ", incomingWeight="
				+ incomingWeight + ", incomingVolume=" + incomingVolume + ", incomingPostpone=" + incomingPostpone
				+ ", sumPost=" + sumPost + ", sendOut=" + sendOut + ", incomingApproval=" + incomingApproval
				+ ", outTrackingNum=" + outTrackingNum + ", outCompany=" + outCompany + ", goodsInfoDto=" + goodsInfoDto
				+ "]";
	}
	
	
}	
