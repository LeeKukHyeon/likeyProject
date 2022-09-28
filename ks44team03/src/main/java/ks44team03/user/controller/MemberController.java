package ks44team03.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class MemberController {

	@GetMapping("/loginForm")
	public String loginProcess() {
		return "login/loginForm";
	}
	
	@GetMapping("/findIdPw")
	public String findIdPw() {
		return "login/findIdPw";
	}
	
	/*
	 * // 회원가입 페이지 이동
	 * 
	 * @GetMapping ("/userForm") public String SignUp(){ return
	 * "registration/userForm"; } // 회원가입 진행
	 * 
	 * @PostMapping ("/signup_action") public String SignUp(@Validated){
	 * 
	 * }
	 */
}












