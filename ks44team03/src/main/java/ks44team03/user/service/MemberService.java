package ks44team03.user.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ks44team03.user.mapper.MemberMapper;
import ks44team03.dao.MemberDAO;
import ks44team03.dto.MemberDTO;

@Service
public class MemberService {
	
	private MemberMapper memberMapper;
	
	public MemberService(MemberMapper memberMapper) {
		this.memberMapper = memberMapper;
	}
	public int userSignup(MemberDTO member) {
		int result = memberMapper.signup(member);
		return result;
	}
	/*
	 * @Autowired private MemberDAO mdao;
	 * 
	 * // 아이디 중복 검사 public String checkID(String uid) {
	 * 
	 * return mdao.checkIdUser(uId); }
	 * 
	 */  
	
}
 