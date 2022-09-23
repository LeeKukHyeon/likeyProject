package ks44team03.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {
	
	@GetMapping ("userSignUp")
	public String userSignUp(){
		return "/registration/userForm";
	}
}
