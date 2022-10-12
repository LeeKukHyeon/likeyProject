package ks44team03.dto;

public class FaqCenter {
	
	private String faqNumCode; //자주하는질문 순서 코드
	private String employeeCode; //사원코드
	private String faqMainCate; //대분류
	private String faqSubCate; //소분류
	private String faqTitle; //자주하는질문 제목
	private String faqContent; //자주하는질문 내용
	private String faqImg; //자주하는질문 관련 이미지
	private String faqDate; //자주하는질문 등록 한 날짜
	
	public String getFaqNumCode() {
		return faqNumCode;
	}
	public void setFaqNumCode(String faqNumCode) {
		this.faqNumCode = faqNumCode;
	}
	public String getEmployeeCode() {
		return employeeCode;
	}
	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}
	public String getFaqMainCate() {
		return faqMainCate;
	}
	public void setFaqMainCate(String faqMainCate) {
		this.faqMainCate = faqMainCate;
	}
	public String getFaqSubCate() {
		return faqSubCate;
	}
	public void setFaqSubCate(String faqSubCate) {
		this.faqSubCate = faqSubCate;
	}
	public String getFaqTitle() {
		return faqTitle;
	}
	public void setFaqTitle(String faqTitle) {
		this.faqTitle = faqTitle;
	}
	public String getFaqContent() {
		return faqContent;
	}
	public void setFaqContent(String faqContent) {
		this.faqContent = faqContent;
	}
	public String getFaqImg() {
		return faqImg;
	}
	public void setFaqImg(String faqImg) {
		this.faqImg = faqImg;
	}
	public String getFaqDate() {
		return faqDate;
	}
	public void setFaqDate(String faqDate) {
		this.faqDate = faqDate;
	}
	@Override
	public String toString() {
		return "FaqCenter [faqNumCode=" + faqNumCode + ", employeeCode=" + employeeCode + ", faqMainCate=" + faqMainCate
				+ ", faqSubCate=" + faqSubCate + ", faqTitle=" + faqTitle + ", faqContent=" + faqContent + ", faqImg="
				+ faqImg + ", faqDate=" + faqDate + "]";
	}
	
}
