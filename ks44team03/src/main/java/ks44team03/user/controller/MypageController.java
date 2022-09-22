package ks44team03.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class MypageController {
	
	
	
	
	@GetMapping("/myAddrList")
	public String myAddrList() {
		
		
		return "myPage/member/myAddrList";
	}
	
	
	
	@GetMapping("/memberModify")
	public String modifyMemberInfo() {
		
		
		return "myPage/member/memberModify";
	}
	
	
	@GetMapping("/mypageScreen")
	public String mypage() {
		
		
		return "myPage/member/mypageScreen";
	}
}
