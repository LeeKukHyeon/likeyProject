package ks44team03.common.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ks44team03.common.service.CustomerNoticeService;
import ks44team03.dto.NoticeCenter;

@Controller
public class CustomerNoticeController {
	
	private CustomerNoticeService customerNoticeService;
	
	public CustomerNoticeController(CustomerNoticeService customerNoticeService) {
		this.customerNoticeService = customerNoticeService;
		
	}
	
	//공지사항 수정
	@PostMapping("/noticeModify")
	public String modifyNotice(NoticeCenter noticeCenter) {
		
		customerNoticeService.modifyNotice(noticeCenter);
		System.out.println(noticeCenter + "수정하는 게시물 값 받아오는가?");

		
		return "redirect:/noticeSearch";
	}
	
	
	//공지사항 수정
	@GetMapping("/noticeModify")
	public String modifyNotice(@RequestParam(value = "noticeNumCode", required = false) String noticeNumCode, Model model) {
		
		//게시물 내용
		NoticeCenter noticeRead = customerNoticeService.getNoticeRead(noticeNumCode);
		
		System.out.println(noticeRead +":: 받아오는 공지사항 제목 확인");
		
		model.addAttribute("noticeRead", noticeRead);
		
		return "/customerService/notice/noticeModify";
	}
	
	//공지사항 등록
	@PostMapping("/noticeRegister")
	public String regNotice(NoticeCenter noticeCenter) {
		
		customerNoticeService.regNotice(noticeCenter);
		
		return "redirect:/noticeSearch";
	}
	
	
	//공지사항 등록
	@GetMapping("/noticeRegister")
	public String regNotice(Model model) {
		
		return "/customerService/notice/noticeRegister";
	}
	
	//공지사항 게시글 조회
	@GetMapping("/noticeRead")
	public String viewNotice(@RequestParam(value = "noticeNumCode") String noticeNumCode, Model model) {
		
		// 게시물 내용
		NoticeCenter noticeRead = customerNoticeService.getNoticeRead(noticeNumCode);
		
		System.out.println(noticeRead +":: 받아오는 공지사항 제목 확인");
		
		model.addAttribute("noticeRead", noticeRead);
		
		return "/customerService/notice/noticeRead";
	}
	
	
	
	// 공지사항 게시물 목록 조회
	@GetMapping("/noticeSearch")
	public String viewNoticeList(Model model) {
	
		
		List<NoticeCenter> noticeList = customerNoticeService.getNoticeList();
		  
		model.addAttribute("noticeList", noticeList);
		 
		return "/customerService/notice/noticeSearch";
	}
}
