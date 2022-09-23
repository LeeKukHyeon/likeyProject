package ks44team03.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerNoticeController {

	
	@GetMapping("/noticeRegister")
	public String regNotice(Model model) {
		return "/CustomerService/noticeRegister";
	}
	
	@GetMapping("/noticeSearch")
	public String viewNotice(Model model) {
		return "/CustomerService/noticeSearch";
	}
}
