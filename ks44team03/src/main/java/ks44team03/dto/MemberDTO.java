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
      private String uAddr;     //이용자 주소
      private String uEmail;    //이용자 이메일
      private String uBirth;    //이용자 생일
      private String uPhone;    //이용자 전화번호
	
}
