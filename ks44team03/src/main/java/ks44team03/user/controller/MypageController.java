package ks44team03.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class MypageController {
	
	
	
	@GetMapping("/mypage")
	public String mypage() {
		
		
		return "myPage/mypage";
	}
}
