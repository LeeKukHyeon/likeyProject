package ks44team03.dto;

public class QuestionCenter {

	private String mtmNumCode; // 1:1문의 등록 순번
	private String userId; // 회원아이디
	private String employeeCode; //사원코드
	private String mtmCate; //1:1문의 분류
	private String mtmTitle; //1:1문의 제목
	private String mtmContent; //1:1문의  내용
	private String mtmAnswer; // 1:1문의 답변
	private String mtmImg; //1:1문의 이미지
	private String mtmDate; //1:1문의 등록일
	private String mtmSituation; //1:1문의 처리상태
	
	public String getMtmAnswer() {
		return mtmAnswer;
	}
	public void setMtmAnswer(String mtmAnswer) {
		this.mtmAnswer = mtmAnswer;
	}
	public String getMtmNumCode() {
		return mtmNumCode;
	}
	public void setMtmNumCode(String mtmNumCode) {
		this.mtmNumCode = mtmNumCode;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getEmployeeCode() {
		return employeeCode;
	}
	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}
	public String getMtmCate() {
		return mtmCate;
	}
	public void setMtmCate(String mtmCate) {
		this.mtmCate = mtmCate;
	}
	public String getMtmTitle() {
		return mtmTitle;
	}
	public void setMtmTitle(String mtmTitle) {
		this.mtmTitle = mtmTitle;
	}
	public String getMtmContent() {
		return mtmContent;
	}
	public void setMtmContent(String mtmContent) {
		this.mtmContent = mtmContent;
	}
	public String getMtmImg() {
		return mtmImg;
	}
	public void setMtmImg(String mtmImg) {
		this.mtmImg = mtmImg;
	}
	public String getMtmDate() {
		return mtmDate;
	}
	public void setMtmDate(String mtmDate) {
		this.mtmDate = mtmDate;
	}
	public String getMtmSituation() {
		return mtmSituation;
	}
	public void setMtmSituation(String mtmSituation) {
		this.mtmSituation = mtmSituation;
	}
	@Override
	public String toString() {
		return "QuestionCenter [mtmNumCode=" + mtmNumCode + ", userId=" + userId + ", employeeCode=" + employeeCode
				+ ", mtmCate=" + mtmCate + ", mtmTitle=" + mtmTitle + ", mtmContent=" + mtmContent + ", mtmAnswer="
				+ mtmAnswer + ", mtmImg=" + mtmImg + ", mtmDate=" + mtmDate + ", mtmSituation=" + mtmSituation + "]";
	}
	
}
