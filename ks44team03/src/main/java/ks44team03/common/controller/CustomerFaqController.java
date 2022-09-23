package ks44team03.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerFaqController {

	@GetMapping("/faqSearch")
	public String faqSearch(Model model) {
		return "/CustomerService/faqSearch";
	}
}
