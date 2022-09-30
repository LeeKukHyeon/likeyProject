package ks44team03.common.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ks44team03.common.service.CustomerScheduleService;
import ks44team03.dto.ScheduleCenter;

@Controller
public class CustomerScheduleController {
	
	private CustomerScheduleService customerScheduleService;
	
	public CustomerScheduleController (CustomerScheduleService customerScheduleService) {
		this.customerScheduleService = customerScheduleService;
		
	}
	
	@PostConstruct
	public void customerScheduleService() {
		
		
	}
	
	
	//배송스케줄 게시물 수정
	@GetMapping("/deliveryScheduleModify")
	public String modifySchedule(@RequestParam(value = "scheduleNumCode", required = false) String scheduleNumCode ,Model model) {
		
		// 게시물 내용
		ScheduleCenter scheduleRead = customerScheduleService.getScheduleRead(scheduleNumCode);
		
		model.addAttribute("scheduleRead", scheduleRead);
		
		return "/customerService/schedule/deliveryScheduleModify";
	}
	
	
	//배송스케줄 등록
	@PostMapping("/deliveryScheduleRegister")
	public String regSchedule(ScheduleCenter scheduleCenter) {
		
		customerScheduleService.regSchedule(scheduleCenter);
		
		
		return "redirect:/deliveryScheduleSearch";
	}
	
	
	//배송스케줄 등록
	@GetMapping("/deliveryScheduleRegister")
	public String regScheduleForm(Model model) {
		
		return "/customerService/schedule/deliveryScheduleRegister";
	}
	
	//배송스케줄 게시글 조회
	@GetMapping("/deliveryScheduleSearchRead")
	public String viewDeliverySchedule(@RequestParam(value = "scheduleNumCode") String scheduleNumCode ,Model model) {
		
		// 게시물 내용
		ScheduleCenter scheduleRead = customerScheduleService.getScheduleRead(scheduleNumCode);
		
		System.out.println(scheduleRead + "::: 스케줄 번호 받아오는지 확인");
		
		model.addAttribute("scheduleRead", scheduleRead);
	
	
		return "/customerService/schedule/deliveryScheduleSearchRead";
	}
	
	// 배송스케줄 목록 조회
	@GetMapping("/deliveryScheduleSearch")
	public String viewDeliveryScheduleList(Model model) {
	
		List<ScheduleCenter> ScheduleList = customerScheduleService.getScheduleList();		
	
		model.addAttribute("ScheduleList", ScheduleList);
	
		return "/customerService/schedule/deliveryScheduleSearch";
	}
}
