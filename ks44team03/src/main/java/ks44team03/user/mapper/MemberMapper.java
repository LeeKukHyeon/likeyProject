package ks44team03.user.mapper;

import org.apache.ibatis.annotations.Mapper;

import ks44team03.dto.MemberDTO;
import ks44team03.dto.UserInfo;

@Mapper
public interface MemberMapper{
	
	// 로그인
	public UserInfo getMemberInfoById(String uId);
	
	// 회원가입 정보 등록처리
	public int signup(MemberDTO member);
	
	// 일반 유저 아이디 중복 검사
	public String checkIdUser(String uId);
	
	// 회원가입시 닉네임 중복 검사
	public String checkNickUser(String uNick);
}