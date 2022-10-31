package ks44team03.common.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ks44team03.common.service.CustomerQuestionService;
import ks44team03.dto.NoticeCenter;
import ks44team03.dto.QuestionCenter;
import ks44team03.dto.UserInfo;

@Controller
public class CustomerQuestionController {

	
	private CustomerQuestionService customerQuestionService;
	
	public CustomerQuestionController(CustomerQuestionService customerQuestionService) {
		this.customerQuestionService = customerQuestionService;
		
	}
		
	@PostConstruct
	public void customerQuestionService() {
		
	}
	

	
	//내문의내역 페이지 내용 검색
	@PostMapping("/user/myQuestionList")
	public String myQuestionSearch(@RequestParam(value = "searchKey" ) String sk , @RequestParam(value = "searchValue") String sv , Model model) {
		
		if ("mtmContent".equals(sk)) {
			sk= "mtm_content";
		}
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("sk", sk);
		paramMap.put("sv", sv);
		
		System.out.println(sk + "받아오는 sk 값 확인");
		System.out.println(sv + "받아오는 sv 값 확인");
		
		List<QuestionCenter> QuestionList = customerQuestionService.myQuestionSearch(paramMap);
		
		model.addAttribute("QuestionList", QuestionList);
		model.addAttribute("sv", sv);
		
		return "user/customerService/question/myQuestionList";
	}
	
	//1:1문의 검색
	@PostMapping("/personalQuestionSearchAdmin")
	public String searchQuestion(@RequestParam(value = "searchKey" , defaultValue = "mtmTitle") String sk,
								@RequestParam(value = "searchValue" , defaultValue = "") String sv , Model model) {
		
		if("mtmTitle".equals(sk)) {
			sk = "mtm_title";
		}else if ("userId".equals(sk)) {
			sk= "id";
		}else if ("mtmContent".equals(sk)) {
			sk= "mtm_content";
		}
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("sk", sk);
		paramMap.put("sv", sv);
		
		List<QuestionCenter> QuestionList = customerQuestionService.searchQuestion(paramMap);
		System.out.println(QuestionList + " 검색했을때 받아오는값임!@#!@$!#$!#$!@#$@#$@#$!@#$!@$#!@");
		
		model.addAttribute("QuestionList", QuestionList);
		model.addAttribute("sv", sv);
	
		return "customerService/question/personalQuestionSearchAdmin";
	}
	
	//1:1문의 삭제 어드민 답변에서
	@PostMapping("/deleteQuestionAdmin")
	@ResponseBody
	public int deleteQuestionAdmin(@RequestParam(value = "mtmNumCode")String mtmNumCode) {
		
		int result = customerQuestionService.deleteQuestionAdmin(mtmNumCode);
		
		return result;
		
	}
		
	
	//1:1문의 삭제
	@PostMapping("/user/deleteQuestion")
	@ResponseBody
	public int deleteQuestion(@RequestParam(value = "mtmNumCode")String mtmNumCode) {
		
		int result = customerQuestionService.deleteQuestion(mtmNumCode);
		
		return result;
		
	}
	
	//1:1문의 수정
	@PostMapping("/user/myQuestionModify")
	public String myQuestionModify(QuestionCenter questionCenter) {
		
		customerQuestionService.myQuestionModify(questionCenter);
		System.out.println(questionCenter + ":::::::::::::::::: 1:1문의 수정 값 받아오는거");
		
		
		return "redirect:/user/myQuestionList";
		
	}
	
	//1:1문의 수정
	@GetMapping("/user/myQuestionModify")
	public String myQuestionModify(@RequestParam(value = "mtmNumCode") String mtmNumCode, Model model) {
		
		//1:1문의 내용
		QuestionCenter QuestionRead = customerQuestionService.getQuestionRead(mtmNumCode);

		model.addAttribute("QuestionRead", QuestionRead);
		
		return "customerService/question/myQuestionModify";
	}
	
	
	//1:1문의 등록
	@PostMapping("/user/personalQuestionRegister")
	public String regQuestion(QuestionCenter questionCenter) {
		
		
		customerQuestionService.regQuestion(questionCenter);
		System.out.println(questionCenter + "처리상태 테스트 @$@#$@!Q$!@$#");
		
		
		return "redirect:/user/myQuestionList";
	}
	

	// 1:1문의 등록
	@GetMapping("/user/personalQuestionRegister")
	public String regCustomerQuestion() {
		
		
		return "customerService/question/personalQuestionRegister";
	}
	
	//나의 문의 게시글 보기
	@GetMapping("/user/myQuestionRead")
	public String viewMyQuestion(@RequestParam(value = "mtmNumCode") String mtmNumCode, Model model) {
		
		QuestionCenter QuestionRead = customerQuestionService.getQuestionRead(mtmNumCode);
		
		System.out.println(QuestionRead + "QuestionCenter DTO 확인");
		
		model.addAttribute("QuestionRead", QuestionRead);
		
		return "customerService/question/myQuestionRead";
	}

	
	//1:1문의 답변 & 1:1문의 관리자 수정
	@PostMapping("/personalQuestionAnswerRegister")
	public String regAnswer(QuestionCenter questionCenter) {
		
		customerQuestionService.regAnswer(questionCenter);
		System.out.println(questionCenter + "답변 값을 받아오느짖다 ㅗ러새ㅣ확인앟ㄴㅇㄱㄴ하는거임");
		
		return "redirect:/personalQuestionSearchAdmin";
		
	}
		
	//1:1문의 게시글 관리자 조회 , 관리자페이지에서 문의 클릭시 처리상태 처리중으로 변경
	@GetMapping("/personalQuestionAnswerRegister")
	public String regResponseCustomerQuestion(@RequestParam(value = "mtmNumCode") String mtmNumCode,  QuestionCenter questionCenter ,  Model model ) {
		
		QuestionCenter QuestionRead = customerQuestionService.getQuestionRead(mtmNumCode);
		customerQuestionService.changeSituation(questionCenter);
		
		
		System.out.println(QuestionRead + "QuestionCenter DTO 확인");
		
		
		model.addAttribute("QuestionRead", QuestionRead);
		
		
		return "customerService/question/personalQuestionAnswerRegister";
	}
	
	//나의 문의 내역 보기
	@GetMapping("/user/myQuestionList")
	public String viewMyQuestion(Model model) {
		
		List<QuestionCenter> QuestionList = customerQuestionService.getQuestionList();
		System.out.println();

		model.addAttribute("QuestionList", QuestionList);
		
		return "customerService/question/myQuestionList";
	}
	
	//1:1 문의 목록 관리자 조회
	@GetMapping("/personalQuestionSearchAdmin")
	public String viewQuestionListAdmin(Model model) {
		
		List<QuestionCenter> QuestionList = customerQuestionService.getQuestionList();

	
		System.out.println(QuestionList + "QuestionList DTO 확인");
		model.addAttribute("QuestionList", QuestionList);

		
		return "customerService/question/personalQuestionSearchAdmin";
	}
	
}
