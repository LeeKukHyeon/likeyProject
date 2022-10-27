package ks44team03.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value = "/user")
public class IntroductionController {
	/**
	 * 배송대행 소개 화면
	 */
	@GetMapping("/aboutDa")
	public String aboutDa() {
		return "introduction/aboutDa";
	}
	
	/**
	 * 구매대행 소개 화면
	 */
	@GetMapping("/aboutPa")
	public String aboutPa() {
		return "introduction/aboutPa";
	}
	
	/**
	 * 프렌즈 구매대행 소개 화면
	 */
	@GetMapping("/aboutFriendsPa")
	public String aboutFPa() {
		return "introduction/aboutFriendsPa";
	}

}
