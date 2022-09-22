package ks44team03.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CouponController {
	
	@GetMapping("availableCouponCheck")
	public String couponList() {
		return "myPage/couponCheck/availableCouponCheck";
	}
}
