package ks44team03.dto;

public class MyPageCount {
	
	private int lastMonthCount;
	private int thisMonthCount;
	private int temp;
	private int completedApplication;
	public int getLastMonthCount() {
		return lastMonthCount;
	}
	public void setLastMonthCount(int lastMonthCount) {
		this.lastMonthCount = lastMonthCount;
	}
	public int getThisMonthCount() {
		return thisMonthCount;
	}
	public void setThisMonthCount(int thisMonthCount) {
		this.thisMonthCount = thisMonthCount;
	}
	public int getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}
	public int getCompletedApplication() {
		return completedApplication;
	}
	public void setCompletedApplication(int completedApplication) {
		this.completedApplication = completedApplication;
	}
	@Override
	public String toString() {
		return "MyPageCount [lastMonthCount=" + lastMonthCount + ", thisMonthCount=" + thisMonthCount + ", temp=" + temp
				+ ", completedApplication=" + completedApplication + "]";
	}

	
	
}
