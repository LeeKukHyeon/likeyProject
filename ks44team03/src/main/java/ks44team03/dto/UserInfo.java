package ks44team03.dto;

public class UserInfo {
	
	private String uId; //이용자 아이디
	private String uGradeCode; //회원 등급 코드
	private String nextGrade; // 다음 회원 등급
	private int needBuy; // 더 사야하는 갯수
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


	private String uPw; //비밀번호
	private String uPostCode; //사서함번호(UK)
	private String uName; //  이름
	private String uLevel; // 
	private String uAddr; //주소
	private String uEmail; //이메일
	private String uBirth; // 생년월일
	private String uPhone; //전화번호
	private String uNick; //별명
	private String uInsertDate; //회원등록날짜
	private String uDormant; //휴면계정 여부
	private int payCompletedCount; //결제 완료 이용 누적 건수
	private String friendsAccount; //프렌즈 구매대행자 계좌정보
	private String bankName; //계좌은행명
	
	
	public String getuId() {
		return uId;
	}
	public void setuId(String uId) {
		this.uId = uId;
	}
	public String getuGradeCode() {
		return uGradeCode;
	}
	public void setuGradeCode(String uGradeCode) {
		this.uGradeCode = uGradeCode;
	}
	public String getuPw() {
		return uPw;
	}
	public void setuPw(String uPw) {
		this.uPw = uPw;
	}
	public String getuPostCode() {
		return uPostCode;
	}
	public void setuPostCode(String uPostCode) {
		this.uPostCode = uPostCode;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuLevel() {
		return uLevel;
	}
	public void setuLevel(String uLevel) {
		this.uLevel = uLevel;
	}
	public String getuAddr() {
		return uAddr;
	}
	public void setuAddr(String uAddr) {
		this.uAddr = uAddr;
	}
	public String getuEmail() {
		return uEmail;
	}
	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}
	public String getuBirth() {
		return uBirth;
	}
	public void setuBirth(String uBirth) {
		this.uBirth = uBirth;
	}
	public String getuPhone() {
		return uPhone;
	}
	public void setuPhone(String uPhone) {
		this.uPhone = uPhone;
	}
	public String getuNick() {
		return uNick;
	}
	public void setuNick(String uNick) {
		this.uNick = uNick;
	}
	public String getuInsertDate() {
		return uInsertDate;
	}
	public void setuInsertDate(String uInsertDate) {
		this.uInsertDate = uInsertDate;
	}
	public String getuDormant() {
		return uDormant;
	}
	public void setuDormant(String uDormant) {
		this.uDormant = uDormant;
	}
	public int getPayCompletedCount() {
		return payCompletedCount;
	}
	public void setPayCompletedCount(int payCompletedCount) {
		this.payCompletedCount = payCompletedCount;
	}
	public String getFriendsAccount() {
		return friendsAccount;
	}
	public void setFriendsAccount(String friendsAccount) {
		this.friendsAccount = friendsAccount;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	
	@Override
	public String toString() {
		return "UserInfo [uId=" + uId + ", uGradeCode=" + uGradeCode + ", nextGrade=" + nextGrade + ", needBuy="
				+ needBuy + ", uPw=" + uPw + ", uPostCode=" + uPostCode + ", uName=" + uName + ", uLevel=" + uLevel
				+ ", uAddr=" + uAddr + ", uEmail=" + uEmail + ", uBirth=" + uBirth + ", uPhone=" + uPhone + ", uNick="
				+ uNick + ", uInsertDate=" + uInsertDate + ", uDormant=" + uDormant + ", payCompletedCount="
				+ payCompletedCount + ", friendsAccount=" + friendsAccount + ", bankName=" + bankName + "]";
	}
	
	
	
	
	
	
	
	
}
