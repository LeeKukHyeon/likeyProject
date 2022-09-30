package ks44team03.admin.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import ks44team03.admin.service.IncomingService;
import ks44team03.dto.Incoming;

@Controller
public class IncomingController {
	
	private static final Logger log = LoggerFactory.getLogger(CompanyInfoController.class);
	
	private IncomingService incomingService;
	
	public IncomingController(IncomingService incomingService) {
		this.incomingService = incomingService;
	}
	
	@PostMapping("/incomingRegister")
	public String regIncoming(Incoming incoming) {
		
		log.info("입력한 값 ::: {}", incoming);
		incomingService.regIncoming(incoming);
		
		return"redirect:/incomingSearch";
	}
	
	@GetMapping("/incomingRegister")
	public String regIncoming(Model model) {
		
		model.addAttribute("title", "입고 등록");
		
		return "incoming/incomingRegister";
	}
	
	//입고 현황 조회
	@GetMapping("/incomingSearch")
	public String incomingCurrentState(Model model) {
		
		List<Incoming> incomingSearch = incomingService.incomingCurrentState();
		
		log.info("입고 목록 ::::: {}", incomingSearch);
		
		model.addAttribute("incomingSearch", incomingSearch);
		model.addAttribute("title", "입고 현황 조회");
		
		return "incoming/incomingSearch";
	}
}
