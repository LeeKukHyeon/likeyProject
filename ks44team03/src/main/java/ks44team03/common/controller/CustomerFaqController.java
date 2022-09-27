package ks44team03.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerFaqController {

	
	//자주하는질문 등록
	@GetMapping("/faqRegister")
	public String faq1(Model model) {
		return "/customerService/faqRegister";
		
	}
	
	// 자주하는질문 조회
	@GetMapping("/faqSearch")
	public String viewFaq(Model model) {
		return "/customerService/faqSearch";
	}
}
