package ks44team03.common.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ks44team03.common.service.CustomerFaqService;
import ks44team03.dto.FaqCenter;

@Controller
public class CustomerFaqController {

	
	//의존성 주입
	
	private CustomerFaqService customerFaqService;
	
	public CustomerFaqController(CustomerFaqService customerFaqService) {
		this.customerFaqService = customerFaqService;
		
	}
	
	
	
	//자주하는질문 등록
	@GetMapping("/faqRegister")
	public String faq1(Model model) {
		return "/customerService/faq/faqRegister";
		
	}
	
	// 자주하는질문 조회
	@GetMapping("/faqSearch")
	public String faqList(Model model) {
		
		List<FaqCenter> faqList = customerFaqService.faqList();
		model.addAttribute("faqList", faqList);
		
		return "/customerService/faq/faqSearch";
	}
}
