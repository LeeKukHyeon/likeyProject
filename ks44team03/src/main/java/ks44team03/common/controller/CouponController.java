package ks44team03.common.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
	
	////회원이 보유한 쿠폰 리스트 확인
	@GetMapping("/couponUserList")
	public String couponUserList(Model model) {

		List<Coupon> couponUserList = couponSerive.couponUserList();
		
		model.addAttribute("couponUserList", couponUserList);
		
		return "/couponManagementAdmin/couponUserList";
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
		
		return "/couponManagementAdmin/couponAdmin";
	}
	
	
	@GetMapping("couponCheck")
	public String couponList() {
		return "/myPage/couponCheck/availableCouponCheck";
	}
	
}
