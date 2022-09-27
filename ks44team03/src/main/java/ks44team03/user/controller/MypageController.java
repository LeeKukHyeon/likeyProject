package ks44team03.user.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ks44team03.admin.service.CompanyInfoService;
import ks44team03.dto.Grade;
import ks44team03.dto.UserInfo;
import ks44team03.user.service.MypageService;

@Controller
public class MypageController {
	
	private MypageService mypageService;
		
	
	public MypageController(MypageService mypageService) {
		this.mypageService = mypageService;
	}


	
	@GetMapping("/applicationEdit")
	public String applicationEdit() {
		return "myPage/applicationEdit";
	}
	
	@GetMapping("/applicationDetail")
	public String applicationDetailList() {
		return "myPage/applicationDetailSearch";
	}
	
	
	

	@GetMapping("/myAddrList")
	public String myAddrList() {
		
		
		return "myPage/member/myAddrList";
	}
	
	
	
	@GetMapping("/memberModify")
	public String modifyMemberInfo() {
		
		
		return "myPage/member/memberModify";
	}
	

	
	@GetMapping("/mypageScreen")
	public String mypage(Model model) {
		String u_id = "id001"; 
		List<UserInfo> userInfo = mypageService.getUserList(u_id);
		List<Grade> grade = mypageService.nextGrade(u_id);
		
		model.addAttribute("userInfo", userInfo);
		
		model.addAttribute("grade", grade);
		return "myPage/member/mypageScreen";
	}
}
