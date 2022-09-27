package ks44team03.dto;

import org.springframework.data.annotation.Id;
@getter
public class Login {
	@Id
	private String u_id; //이용자 아이디
	private String u_pw; //이용자 비밀번호
	private String u_name; //이용자 이름
	private String u_nick; //이용자 닉네임
	private String u_addr; //이용자 주소
	private String u_email; //이용자 이메일
	private String u_birth; //이용자 생일
	private String u_phone; //이용자 전화번호
	
}
