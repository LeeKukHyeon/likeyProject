package ks44team03.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IntroductionController {

	@GetMapping("/aboutDa")
	public String aboutDa() {
		return "introduction/aboutDa";
	}
	
	@GetMapping("/aboutPa")
	public String aboutPa() {
		return "introduction/aboutPa";
	}

	@GetMapping("/aboutFriendsPa")
	public String aboutFPa() {
		return "introduction/aboutFriendsPa";
	}

}
