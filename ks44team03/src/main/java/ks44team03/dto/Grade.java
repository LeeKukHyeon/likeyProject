package ks44team03.dto;

public class Grade {
	
	private String gradeCode;
	private String gradeName;
	private float rate; 
	private int transactionNumber; 
	private String gradeDate;
	private String nextGrade;
	private int needBuy;
	
	public String getGradeCode() {
		return gradeCode;
	}
	public void setGradeCode(String gradeCode) {
		this.gradeCode = gradeCode;
	}
	public String getGradeName() {
		return gradeName;
	}
	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	public int getTransactionNumber() {
		return transactionNumber;
	}
	public void setTransactionNumber(int transactionNumber) {
		this.transactionNumber = transactionNumber;
	}
	public String getGradeDate() {
		return gradeDate;
	}
	public void setGradeDate(String gradeDate) {
		this.gradeDate = gradeDate;
	}
	public String getNextGrade() {
		return nextGrade;
	}
	public void setNextGrade(String nextGrade) {
		this.nextGrade = nextGrade;
	}
	public int getNeedBuy() {
		return needBuy;
	}
	public void setNeedBuy(int needBuy) {
		this.needBuy = needBuy;
	}
	
	@Override
	public String toString() {
		return "Grade [gradeCode=" + gradeCode + ", gradeName=" + gradeName + ", rate=" + rate + ", transactionNumber="
				+ transactionNumber + ", gradeDate=" + gradeDate + ", nextGrade=" + nextGrade + ", needBuy=" + needBuy
				+ "]";
	}
	
	
	
	
	
	

	

	
	
}
