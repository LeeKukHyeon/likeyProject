package ks44team03.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ks44team03.user.service.MemberService;


@Controller
public class MemberController {
	//로그인페이지로 이동
	@GetMapping("loginForm")
	public String loginForm() {
		return "/login/loginForm";
	}
	//아이디 비밀번호 찾기 페이지로 이동
	@GetMapping("/findIdPw")
	public String findIdPw() {
		return "login/findIdPw";
	}
	
	// 회원가입 페이지 이동
	@GetMapping("/userForm")
	public String userForm() { 
		return "registration/userForm";
	} 
	
	@Autowired
	MemberService ms; // 멤버서비스 class
  
   // 회원가입 시 아이디 중복 검사
   @PostMapping("/checkid")
   @ResponseBody
   public int checkid(@RequestParam("id") String id) {

      if (id.equals(ms.checkID(id))) {
         return 1;
      }
      return 0;
   }
}












