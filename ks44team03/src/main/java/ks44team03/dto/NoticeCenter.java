package ks44team03.dto;

public class NoticeCenter {
	
	private String noticeNumCode; //공지사항 번호
	private String employeeCode; //사원코드
	private String noticeTitle; //공지사항제목
	private String noticeContent; //공지사항내용
	private String noticeImg; //공지사항이미지
	private String noticeDate; //공지사항등록일자
	private String noticeView; //공지사항조회수
	
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
