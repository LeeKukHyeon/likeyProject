package ks44team03.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MypageController {
	
	@GetMapping("/mem_edit")
	public String memEdit() {
		return "myPage/mem_edit";
	}
	
	@GetMapping("/myaddr_list")
	public String myaddrList() {
		return "myPage/myaddr_list";
	}
		
	
	@GetMapping("/mypage")
	public String mypage() {
		
		
		return "myPage/mypage";
	}
}
