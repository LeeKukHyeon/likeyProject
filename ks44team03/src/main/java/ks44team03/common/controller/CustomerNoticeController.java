package ks44team03.common.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ks44team03.common.service.CustomerNoticeService;
import ks44team03.dto.CsNotice;

@Controller
public class CustomerNoticeController {
	
	private CustomerNoticeService customerNoticeService;
	
	public CustomerNoticeController(CustomerNoticeService customerNoticeService) {
		this.customerNoticeService = customerNoticeService;
		
	}
	
	//공지사항 게시글
	@GetMapping("/noticeSearchRead")
	public String viewNotice(Model model) {
		return "/customerService/noticeSearchRead";
	}
	
	
	//공지사항 등록
	@GetMapping("/noticeRegister")
	public String regNotice(Model model) {
		return "/customerService/noticeRegister";
	}
	
	
	// 공지사항 조회
	@GetMapping("/noticeSearch")
	public String viewNoticeList(Model model) {
		
		/*
		 * List<CsNotice> noticeList = customerNoticeService.getCsNoticeList();
		 * 
		 * model.addAttribute("noticeList", noticeList);
		 */
		return "/customerService/noticeSearch";
	}
}
