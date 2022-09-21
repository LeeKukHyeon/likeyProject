package ks44team03.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class MypageController {
	
	
	@PostMapping("/api/shipStepInfo")
	public String test() {
		return "api/ship_step_info_api";
	}
	
	@GetMapping("/mypage")
	public String mypage() {
		
		
		return "myPage/mypage";
	}
}
