package ks44team03.user.service;

import java.util.List;
import org.springframework.stereotype.Service;

import ks44team03.user.mapper.MemberMapper;
import ks44team03.dto.MemberDTO;
import ks44team03.dto.UserInfo;

@Service
public class MemberService {
	
	private MemberMapper memberMapper;
	
	public MemberService(MemberMapper memberMapper) {
		this.memberMapper = memberMapper;
	}
	
	// 특정회원 조회
	public UserInfo getMemberInfoById(String uId) {
		UserInfo userInfo = memberMapper.getMemberInfoById(uId);
	      return userInfo;
	}
	
	// 회원가입 정보 등록처리
	public int userSignup(MemberDTO member) {
		int result = memberMapper.signup(member);
		return result;
	}
	
	// 아이디 중복 검사
	public String checkID(String uid) {
		String checkIdUser = memberMapper.checkIdUser(uid);
		return checkIdUser;
		
		}
	
	// 닉네임 중복 검사
	public String checkNick(String uNick) {
		String checkNickUser = memberMapper.checkNickUser(uNick);
		return checkNickUser;
	}

}
 