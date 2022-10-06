package ks44team03.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MemberDTO {

      private String uId;    //이용자 아이디
      private String uPw;    //이용자 비밀번호
      private String uName;   //이용자 이름
      private String uNick;     //이용자 닉네임
      private String uEmail;    //이용자 이메일
      private String yy;    //이용자 생일
      private String mm;    //이용자 생일
      private String dd;    //이용자 생일
      private String countryCode;    //이용자 전화번호
      private String hp;    //이용자 전화번호
      
      
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
	
	
}
