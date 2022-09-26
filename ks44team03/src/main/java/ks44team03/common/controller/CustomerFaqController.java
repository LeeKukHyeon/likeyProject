package ks44team03.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerFaqController {

	// 1:1문의 조회
	@GetMapping("/faqSearch")
	public String viewFaq(Model model) {
		return "/customerService/faqSearch";
	}
}
