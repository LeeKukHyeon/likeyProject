package ks44team03.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerQuestionController {

	//1:1 문의 관리자 답변 등록
	@GetMapping("/personalQuestionAnswerRegister")
	public String regResponseCustomerQuestion(Model model) {
		return "/customerService/personalQuestionAnswerRegister";
	}
	
	//1:1 문의 관리자 조회
	@GetMapping("/personalQuestionSearchAdmin")
	public String viewCustomerQuestionAdmin(Model model) {
		return "/customerService/personalQuestionSearchAdmin";
	}
	
	
	// 1:1문의 등록
	@GetMapping("/personalQuestionRegister")
	public String regCustomerQuestion(Model model) {
		return "customerService/personalQuestionRegister";
	}
}
