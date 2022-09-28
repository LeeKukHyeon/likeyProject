package ks44team03.dto;

public class CsSchedule {
	
	private String scheduleNumCode; //배송스케줄 번호
	private String employeeCode; //사원코드
	private String scheduleTitle; //배송스케줄제목
	private String scheduleContent; //배송스케줄내용
	private String scheduleImg; //배송스케줄이미지
	private String scheduleDate; //배송스케줄등록일자
	private String scheduleView; //배송스케줄조회수
	
	public String getScheduleNumCode() {
		return scheduleNumCode;
	}
	public void setScheduleNumCode(String scheduleNumCode) {
		this.scheduleNumCode = scheduleNumCode;
	}
	public String getEmployeeCode() {
		return employeeCode;
	}
	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}
	public String getScheduleTitle() {
		return scheduleTitle;
	}
	public void setScheduleTitle(String scheduleTitle) {
		this.scheduleTitle = scheduleTitle;
	}
	public String getScheduleContent() {
		return scheduleContent;
	}
	public void setScheduleContent(String scheduleContent) {
		this.scheduleContent = scheduleContent;
	}
	public String getScheduleImg() {
		return scheduleImg;
	}
	public void setScheduleImg(String scheduleImg) {
		this.scheduleImg = scheduleImg;
	}
	public String getScheduleDate() {
		return scheduleDate;
	}
	public void setScheduleDate(String scheduleDate) {
		this.scheduleDate = scheduleDate;
	}
	public String getScheduleView() {
		return scheduleView;
	}
	public void setScheduleView(String scheduleView) {
		this.scheduleView = scheduleView;
	}
	@Override
	public String toString() {
		return "CsSchedule [scheduleNumCode=" + scheduleNumCode + ", employeeCode=" + employeeCode + ", scheduleTitle="
				+ scheduleTitle + ", scheduleContent=" + scheduleContent + ", scheduleImg=" + scheduleImg
				+ ", scheduleDate=" + scheduleDate + ", scheduleView=" + scheduleView + "]";
	}
	

}
