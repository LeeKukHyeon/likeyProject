package ks44team03.user.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ks44team03.dto.MemberDTO;
import ks44team03.user.service.MemberService;
import ks44team03.user.service.MypageService;

@Controller
public class MemberController {
	
	private MemberService memberService;
	
	public MemberController(MemberService memberService) {
		this.memberService = memberService;
	}
	
	// 로그인페이지로 이동
	@GetMapping("loginForm")
	public String loginForm() {
		return "/login/loginForm";
	}

	// 아이디 비밀번호 찾기 페이지로 이동
	@GetMapping("/findIdPw")
	public String findIdPw() {
		return "login/findIdPw";
	}

	// 회원가입 페이지 이동
	@GetMapping("/userForm")
	public String userForm() {
		return "registration/userForm";
	}
	
	
	// 회원가입 버튼 클릭시 이동
	  @PostMapping("/signup")
	  public String signup(MemberDTO member) {
		  System.out.println(member + "member");
		  int result = memberService.userSignup(member);
		  System.out.println(result); 
		  return "/login/loginForm";
		  }
	 


	
	  // 회원가입 시 아이디 중복 검사
	  
	  @PostMapping("/checkid")
	  
	  @ResponseBody public int checkid(@RequestParam("id") String id) {
	  
	  if (id.equals(ms.checkID(id))) { return 1; } return 0; }
	 
}
