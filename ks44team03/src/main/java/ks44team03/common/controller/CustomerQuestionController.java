package ks44team03.common.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ks44team03.common.service.CustomerQuestionService;
import ks44team03.dto.QuestionCenter;
import ks44team03.dto.ScheduleCenter;

@Controller
public class CustomerQuestionController {

	
	private CustomerQuestionService customerQuestionService;
	
	public CustomerQuestionController(CustomerQuestionService customerQuestionService) {
		this.customerQuestionService = customerQuestionService;
		
	}
	
	
	//1:1문의 등록
	@PostMapping("/personalQuestionRegister")
	public String regQuestion(QuestionCenter questionCenter) {
		
		System.out.println(questionCenter + "처리상태 테스트");
		
		customerQuestionService.regQuestion(questionCenter);
		
		
		
		return "redirect:/personalQuestionSearchAdmin";
	}
	
	


	// 1:1문의 등록
	@GetMapping("/personalQuestionRegister")
	public String regCustomerQuestion(Model model) {
		
		
		return "customerService/question/personalQuestionRegister";
	}
	
	//나의 문의 게시글 보기
	@GetMapping("/MyQuestionRead")
	public String viewMyQuestion(@RequestParam(value = "mtmNumCode") String mtmNumCode, Model model) {
		
		QuestionCenter QuestionRead = customerQuestionService.getQuestionRead(mtmNumCode);
		
		System.out.println(QuestionRead + "QuestionCenter DTO 확인");
		
		model.addAttribute("QuestionRead", QuestionRead);
		
		return "/customerService/question/MyQuestionRead";
	}
	
	//1:1문의 게시글 관리자 조회
	@GetMapping("/personalQuestionAnswerRegister")
	public String regResponseCustomerQuestion(@RequestParam(value = "mtmNumCode") String mtmNumCode, Model model) {
		
		QuestionCenter QuestionRead = customerQuestionService.getQuestionRead(mtmNumCode);
		
		System.out.println(QuestionRead + "QuestionCenter DTO 확인");
		
		model.addAttribute("QuestionRead", QuestionRead);
		
		return "/customerService/question/personalQuestionAnswerRegister";
	}
	
	//나의 문의 내역 보기
	@GetMapping("/myQuestionList")
	public String viewMyQuestion(Model model) {
		
		List<QuestionCenter> QuestionList = customerQuestionService.getQuestionList();

		model.addAttribute("QuestionList", QuestionList);
		
		return "/customerService/question/myQuestionList";
	}
	
	//1:1 문의 목록 관리자 조회
	@GetMapping("/personalQuestionSearchAdmin")
	public String viewQuestionListAdmin(Model model) {
		
		List<QuestionCenter> QuestionList = customerQuestionService.getQuestionList();
		
		model.addAttribute("QuestionList", QuestionList);
		
		return "/customerService/question/personalQuestionSearchAdmin";
	}
	
}
