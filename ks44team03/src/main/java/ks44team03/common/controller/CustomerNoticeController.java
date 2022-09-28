package ks44team03.common.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ks44team03.common.service.CustomerNoticeService;
import ks44team03.dto.NoticeCenter;

@Controller
public class CustomerNoticeController {
	
	private CustomerNoticeService customerNoticeService;
	
	public CustomerNoticeController(CustomerNoticeService customerNoticeService) {
		this.customerNoticeService = customerNoticeService;
		
	}
	
	//공지사항 게시글
	@GetMapping("/noticeSearchRead")
	public String noticeSearchRead(@RequestParam(value = "noticeTitle", required = false) String noticeTitle, Model model) {
		
		// 게시물 내용
		NoticeCenter noticeRead = customerNoticeService.getNoticeCenterRead(noticeTitle);
		
		System.out.println(noticeRead +":: 겟미ㅜㄹ냉-ㅛㅇ확일202023022034234032032032032023032023");
		
		model.addAttribute("noticeRead", noticeRead);
		
		return "/customerService/noticeSearchRead";
	}
	
	
	//공지사항 등록
	@GetMapping("/noticeRegister")
	public String regNotice(Model model) {
		return "/customerService/noticeRegister";
	}
	
	
	// 공지사항 게시물 목록 조회
	@GetMapping("/noticeSearch")
	public String viewNoticeList(Model model) {
	
		
		List<NoticeCenter> noticeList = customerNoticeService.getNoticeCenterList();
		  
		model.addAttribute("noticeList", noticeList);
		 
		return "/customerService/noticeSearch";
	}
}
