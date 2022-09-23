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
	
	
	@GetMapping ("userSignUp")
	public String userSignUp(){
		return "/registration/userForm";
	}

}
