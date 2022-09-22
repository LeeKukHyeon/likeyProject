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
	
	@GetMapping("/applicationDetail")
	public String applicationDetailList() {
		return "myPage/applicationDetailSearch";
	}
	
	
	
	@GetMapping("/memberModify")
	public String modifyMemberInfo() {
		return "myPage/member/memberModify";
	}
	
	@GetMapping("/myAddrList")
	public String myaddrList() {
		return "myPage/member/myAddrList";
	}
		
	
	@GetMapping("/mypageScreen")
	public String mypage() {
		
		
	
		
		return "myPage/member/mypageScreen";
	}
}
