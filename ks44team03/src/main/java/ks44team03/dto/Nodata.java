package ks44team03.dto;

public class Nodata {
	private String nodataManageCode;	//노데이터 입고 코드
	private String nodUserPoboxCode;	//사서함 번호	
	private String nodOrderFormYn;		//신청서 작성 여부
	private String nodTrackingNum;		//운송장 번호
	private String nodECode;			//처리한 직원
	private String nodId;				//아이디
	private String nodRecipient;		//수취인명
	private String nodPic;				//개봉한 물품 사진
	private String nodArrivalDate;		//입고일
	private String nodTrackingCompany;	//배송회사
	private String nodDiscardDate;		//폐기일
	private String nodUserCheck;		//이용자 확인 여부
	
	public String getNodataManageCode() {
		return nodataManageCode;
	}
	public void setNodataManageCode(String nodataManageCode) {
		this.nodataManageCode = nodataManageCode;
	}
	public String getNodUserPoboxCode() {
		return nodUserPoboxCode;
	}
	public void setNodUserPoboxCode(String nodUserPoboxCode) {
		this.nodUserPoboxCode = nodUserPoboxCode;
	}
	public String getNodOrderFormYn() {
		return nodOrderFormYn;
	}
	public void setNodOrderFormYn(String nodOrderFormYn) {
		this.nodOrderFormYn = nodOrderFormYn;
	}
	public String getNodTrackingNum() {
		return nodTrackingNum;
	}
	public void setNodTrackingNum(String nodTrackingNum) {
		this.nodTrackingNum = nodTrackingNum;
	}
	public String getNodECode() {
		return nodECode;
	}
	public void setNodECode(String nodECode) {
		this.nodECode = nodECode;
	}
	public String getNodId() {
		return nodId;
	}
	public void setNodId(String nodId) {
		this.nodId = nodId;
	}
	public String getNodRecipient() {
		return nodRecipient;
	}
	public void setNodRecipient(String nodRecipient) {
		this.nodRecipient = nodRecipient;
	}
	public String getNodPic() {
		return nodPic;
	}
	public void setNodPic(String nodPic) {
		this.nodPic = nodPic;
	}
	public String getNodArrivalDate() {
		return nodArrivalDate;
	}
	public void setNodArrivalDate(String nodArrivalDate) {
		this.nodArrivalDate = nodArrivalDate;
	}
	public String getNodTrackingCompany() {
		return nodTrackingCompany;
	}
	public void setNodTrackingCompany(String nodTrackingCompany) {
		this.nodTrackingCompany = nodTrackingCompany;
	}
	public String getNodDiscardDate() {
		return nodDiscardDate;
	}
	public void setNodDiscardDate(String nodDiscardDate) {
		this.nodDiscardDate = nodDiscardDate;
	}
	public String getNodUserCheck() {
		return nodUserCheck;
	}
	public void setNodUserCheck(String nodUserCheck) {
		this.nodUserCheck = nodUserCheck;
	}
	
	@Override
	public String toString() {
		return "Nodata [nodataManageCode=" + nodataManageCode + ", nodUserPoboxCode=" + nodUserPoboxCode
				+ ", nodOrderFormYn=" + nodOrderFormYn + ", nodTrackingNum=" + nodTrackingNum + ", nodECode=" + nodECode
				+ ", nodId=" + nodId + ", nodRecipient=" + nodRecipient + ", nodPic=" + nodPic + ", nodArrivalDate="
				+ nodArrivalDate + ", nodTrackingCompany=" + nodTrackingCompany + ", nodDiscardDate=" + nodDiscardDate
				+ ", nodUserCheck=" + nodUserCheck + "]";
	}

}
