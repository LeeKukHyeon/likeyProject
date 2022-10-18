package ks44team03.dto;

public class MemberDTO {

      private String uId;    //이용자 아이디
      private String uPw;    //이용자 비밀번호
      private String uName;   //이용자 이름
      private String uNick;     //이용자 닉네임
      private String uEmail;    //이용자 이메일
      private int yy;    //이용자 생일
      private int mm;    //이용자 생일
      private int dd;    //이용자 생일
      private int countryCode;    //이용자 전화번호
      private int hp;    //이용자 전화번호
	public String getuId() {
		return uId;
	}
	public void setuId(String uId) {
		this.uId = uId;
	}
	public String getuPw() {
		return uPw;
	}
	public void setuPw(String uPw) {
		this.uPw = uPw;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuNick() {
		return uNick;
	}
	public void setuNick(String uNick) {
		this.uNick = uNick;
	}
	public String getuEmail() {
		return uEmail;
	}
	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}
	public int getYy() {
		return yy;
	}
	public void setYy(int yy) {
		this.yy = yy;
	}
	public int getMm() {
		return mm;
	}
	public void setMm(int mm) {
		this.mm = mm;
	}
	public int getDd() {
		return dd;
	}
	public void setDd(int dd) {
		this.dd = dd;
	}
	public int getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(int countryCode) {
		this.countryCode = countryCode;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	@Override
	public String toString() {
		return "MemberDTO [uId=" + uId + ", uPw=" + uPw + ", uName=" + uName + ", uNick=" + uNick + ", uEmail=" + uEmail
				+ ", yy=" + yy + ", mm=" + mm + ", dd=" + dd + ", countryCode=" + countryCode + ", hp=" + hp + "]";
	}
}
