package ks44team03.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ForwardingController {
	
	@GetMapping("/forwardingRegister")
	public String regForwarding() {
		return "forwardingManagement/forwardingRegister";
	}
}
