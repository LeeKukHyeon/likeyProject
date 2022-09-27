package ks44team03.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerScheduleController {
	
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
	
	
	// 배송스케줄 조회
	@GetMapping("/deliveryScheduleSearch")
	public String viewDeliveryScheduleList(Model model) {
		return "/customerService/deliveryScheduleSearch";
	}
}
