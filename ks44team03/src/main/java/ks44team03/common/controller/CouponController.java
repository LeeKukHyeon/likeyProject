package ks44team03.common.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ks44team03.common.service.CouponSerive;
import ks44team03.dto.Coupon;

@Controller
public class CouponController {
	
	//의존성 주입
	private CouponSerive couponSerive;
	
	public CouponController(CouponSerive couponSerive) {
		this.couponSerive = couponSerive;
	}
	
	
	
	//관리자 페이지 쿠폰 리스트 , 등록
	@GetMapping("/couponAdmin")
	public String couponAdmin(Model model) {
		
		List<Coupon> couponList = couponSerive.couponList();
		
		model.addAttribute("couponList", couponList);
		
		return "/couponManagementAdmin/couponAdmin";
	}

	@GetMapping("couponCheck")
	public String couponList() {
		return "/myPage/couponCheck/availableCouponCheck";
	}
	
}
