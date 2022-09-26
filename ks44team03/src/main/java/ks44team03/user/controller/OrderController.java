package ks44team03.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OrderController {
	
	@GetMapping("/applicationFormRegister")
	public String applicationFormRegister() {
		return "applicationForm/applicationFormRegister";
	}
	
	@GetMapping("/friendsApplicationFormRegister")
	public String fApplicationFormRegister() {
		return "applicationForm/friendsApplicationFormRegister";
	}
	
}
