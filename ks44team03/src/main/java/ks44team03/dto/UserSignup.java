package ks44team03.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserSignup {
	
	   private String userId;    //이용자 아이디
	   private String userPw;    //이용자 비밀번호
	   private String userName;   //이용자 이름
	   private String userNick;     //이용자 닉네임
	   private String userAddr;     //이용자 주소
	   private String userEmail;    //이용자 이메일
	   private String userBirth;    //이용자 생일
	   private String userPhone;    //이용자 전화번호
}
