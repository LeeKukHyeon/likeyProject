package ks44team03.common.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ks44team03.common.service.CouponSerive;
import ks44team03.dto.Coupon;
import ks44team03.dto.CouponList;

@Controller
public class CouponController {
	
	//의존성 주입
	private CouponSerive couponSerive;
	
	public CouponController(CouponSerive couponSerive) {
		this.couponSerive = couponSerive;
	}
	
	
	// 쿠폰 삭제
	@GetMapping("/couponDelete")
	@ResponseBody
	public int couponDelete(@RequestParam(value = "couponCode") String couponCode) {
		
		int couponDelete = couponSerive.couponDelete(couponCode);
		
		return couponDelete;
	}
	
	//쿠폰 보유 리스트에서 검색
	@PostMapping("/couponUserList")
	public String couponSearch(@RequestParam(value = "searchKey" , defaultValue = "userId") String sk,
								@RequestParam(value = "searchValue" , defaultValue = "") String sv,
								Model model){
		
		if("userId".equals(sk)) {
			sk = "cs.u_id";
		}else if ("couponName".equals(sk)){
			sk = "c.c_name";
		}
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("sk", sk);
		paramMap.put("sv", sv);
		
		List<Coupon> couponUserList = couponSerive.couponSearch(paramMap);
		System.out.println(couponUserList + "couponSearch 검색확인!@@!@@@%^!%^@$@%^%!$@^%!$^%@$1%#!@");
		
		model.addAttribute("couponUserList", couponUserList);
		model.addAttribute("sv", sv);
		
		return "couponManagementAdmin/couponUserList";
	}
	
	////회원이 보유한 쿠폰 리스트 확인
	@GetMapping("/couponUserList")
	public String couponUserList(Model model) {

		List<Coupon> couponUserList = couponSerive.couponUserList();
		System.out.println(couponUserList + "쿠폰 리스트 받아오는 값을 확인");
		
		model.addAttribute("couponUserList", couponUserList);
		
		return "couponManagementAdmin/couponUserList";
	}
	
	//관리자 페이지 등록한 쿠폰 리스트, 등록
	@PostMapping("/couponAdmin")
	public String couponAdd(CouponList couponList) {
		
		couponSerive.couponAdd(couponList);
		System.out.println(couponList + "받아오는 쿠폰 등록값 체크합니다 @@@#!#$!$@$$@*&$@*&$@&*@*&@*&!");
		
		return "redirect:/couponAdmin";
		
	}
	
	//관리자 페이지 등록한 쿠폰 리스트
	@GetMapping("/couponAdmin")
	public String couponAdmin(Model model) {
		
		List<CouponList> couponList = couponSerive.couponList();
		
		model.addAttribute("couponList", couponList);
		
		return "couponManagementAdmin/couponAdmin";
	}
	
	
	@GetMapping("couponCheck")
	public String couponList() {
		return "/myPage/couponCheck/availableCouponCheck";
	}
	
}
