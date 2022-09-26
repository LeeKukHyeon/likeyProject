package ks44team03.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerNoticeController {

	@GetMapping("/notice1")
	public String notice1(Model model) {
		return "/customerService/notice1";
	}
	
	@GetMapping("/noticeRegister")
	public String regNotice(Model model) {
		return "/customerService/noticeRegister";
	}
	
	@GetMapping("/noticeSearch")
	public String viewNotice(Model model) {
		return "/customerService/noticeSearch";
	}
}
