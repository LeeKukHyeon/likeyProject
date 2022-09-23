package ks44team03.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IncomingController {
	
	@GetMapping("/incomingRegister")
	public String regIncoming() {
		return "incoming/incomingRegister";
	}
}
