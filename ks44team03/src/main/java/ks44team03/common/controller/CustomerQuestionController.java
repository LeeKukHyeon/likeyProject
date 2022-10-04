package ks44team03.common.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ks44team03.common.service.CustomerQuestionService;
import ks44team03.dto.QuestionCenter;

@Controller
public class CustomerQuestionController {

	
	private CustomerQuestionService customerQuestionService;
	
	public CustomerQuestionController(CustomerQuestionService customerQuestionService) {
		this.customerQuestionService = customerQuestionService;
		
		
	}
	
	@PostConstruct
	public void customerQuestionService() {
		
	}
	
	
	//1:1문의 수정
	@PostMapping("/myQuestionModify")	
	public String myQuestionModify(QuestionCenter questionCenter) {
		
		customerQuestionService.myQuestionModify(questionCenter);
		System.out.println(questionCenter + ":::::::::::::::::: 1:1문의 수정 값 받아오는거");
		
		
		return "redirect:/myQuestionList";
		
	}
	
	//관리자페이지에서 문의 클릭시 처리상태 처리중으로 변경
	@PostMapping("/personalQuestionAnswerRegister")
	public String changeSituation(QuestionCenter questionCenter) {
		
		customerQuestionService.changeSituation(questionCenter);
		
		return "/customerService/question/personalQuestionAnswerRegister";
		
		
	}
	
	
	
	//1:1문의 수정
	@GetMapping("/myQuestionModify")
	public String myQuestionModify(@RequestParam(value = "mtmNumCode") String mtmNumCode, Model model) {
		
		//1:1문의 내용
		QuestionCenter QuestionRead = customerQuestionService.getQuestionRead(mtmNumCode);

		model.addAttribute("QuestionRead", QuestionRead);
		
		return "/customerService/question/myQuestionModify";
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
		
		System.out.println(QuestionList + "QuestionList DTO 확인");
		model.addAttribute("QuestionList", QuestionList);
		
		return "/customerService/question/personalQuestionSearchAdmin";
	}
	
}
