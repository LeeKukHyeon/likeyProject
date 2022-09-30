package ks44team03.user.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ks44team03.admin.service.CompanyInfoService;
import ks44team03.dto.Grade;
import ks44team03.dto.MyPageCount;
import ks44team03.dto.Nodata;
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
		List<MyPageCount> count = mypageService.count(u_id);
		List<MyPageCount> monthNodataCount = mypageService.monthNodataCount(u_id);
		
	
	
		
		int nodataCount = mypageService.nodataCount(u_id);
		int forwardingCount = mypageService.forwardingCount(u_id);
		int completedApplication = mypageService.completedApplication(u_id);
		int couponCount = mypageService.couponCount(u_id);
		int lastMonthCount = mypageService.lastMonthCount(u_id);
		int thisMonthCount = mypageService.thisMonthCount(u_id);
		int test = lastMonthCount + thisMonthCount;
		
		int arrivalCount = mypageService.arrivalCount(u_id);
		int temp = mypageService.temp(u_id);
		int totalCount = lastMonthCount+thisMonthCount;
		
		model.addAttribute("monthNodataCount", monthNodataCount);
		model.addAttribute("nodataCount", nodataCount);
		model.addAttribute("forwardingCount", forwardingCount);
		model.addAttribute("completedApplication", completedApplication);
		model.addAttribute("temp", temp);
		model.addAttribute("totalCount", totalCount);
		model.addAttribute("thisMonthCount", thisMonthCount);
		model.addAttribute("lastMonthCount", lastMonthCount);
		model.addAttribute("arrivalCount", arrivalCount);
		model.addAttribute("userInfo", userInfo);
		
		model.addAttribute("grade", grade);
		model.addAttribute("couponCount", couponCount);
		return "myPage/member/mypageScreen";
	}
}
