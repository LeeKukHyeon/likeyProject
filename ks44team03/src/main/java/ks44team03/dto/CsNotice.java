package ks44team03.dto;

public class CsNotice {
	
	private String noticeNumCode;
	private String employeeCode;
	private String noticeTitle;
	private String noticeContent;
	private String noticeImg;
	private String noticeDate;
	private String noticeView;
	
	public String getNoticeNumCode() {
		return noticeNumCode;
	}
	public void setNoticeNumCode(String noticeNumCode) {
		this.noticeNumCode = noticeNumCode;
	}
	public String getEmployeeCode() {
		return employeeCode;
	}
	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}
	public String getNoticeTitle() {
		return noticeTitle;
	}
	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}
	public String getNoticeContent() {
		return noticeContent;
	}
	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}
	public String getNoticeImg() {
		return noticeImg;
	}
	public void setNoticeImg(String noticeImg) {
		this.noticeImg = noticeImg;
	}
	public String getNoticeDate() {
		return noticeDate;
	}
	public void setNoticeDate(String noticeDate) {
		this.noticeDate = noticeDate;
	}
	public String getNoticeView() {
		return noticeView;
	}
	public void setNoticeView(String noticeView) {
		this.noticeView = noticeView;
	}
	
	@Override
	public String toString() {
		return "CsNotice [noticeNumCode=" + noticeNumCode + ", employeeCode=" + employeeCode + ", noticeTitle="
				+ noticeTitle + ", noticeContent=" + noticeContent + ", noticeImg=" + noticeImg + ", noticeDate="
				+ noticeDate + ", noticeView=" + noticeView + "]";
	}

}
