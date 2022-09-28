package ks44team03.common.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ks44team03.common.service.CustomerScheduleService;
import ks44team03.dto.ScheduleCenter;

@Controller
public class CustomerScheduleController {
	
	private CustomerScheduleService customerScheduleService;
	
	public CustomerScheduleController (CustomerScheduleService customerScheduleService) {
		this.customerScheduleService = customerScheduleService;
		
	}
	
	
	//배송스케줄 게시글 조회
	@GetMapping("/deliveryScheduleSearchRead")
	public String viewDeliverySchedule(Model model) {
		return "/customerService/deliveryScheduleSearchRead";
	}
	
	//배송스케줄 등록
	@GetMapping("/deliveryScheduleRegister")
	public String regDeliverySchedule(Model model) {
		return "/customerService/deliveryScheduleRegister";
	}
	
	// 배송스케줄 목록 조회
	@GetMapping("/deliveryScheduleSearch")
	public String viewDeliveryScheduleList(Model model) {
		
		List<ScheduleCenter> ScheduleList = customerScheduleService.getScheduleCenterList();		
		
		model.addAttribute("ScheduleList", ScheduleList);
		
		return "/customerService/deliveryScheduleSearch";
	}
}
