package ks44team03.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SignUp {
	
	private String uId; //이용자 아이디
	private String uGradeCode; //회원 등급 코드
	private String nextGrade; // 다음 회원 등급
	private int needBuy; // 더 사야하는 갯수
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
	
}
