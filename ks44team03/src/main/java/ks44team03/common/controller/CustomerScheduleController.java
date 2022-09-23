package ks44team03.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerScheduleController {

	@GetMapping("/deliveryScheduleRegister")
	public String regDeliverySchedule(Model model) {
		return "/CustomerService/deliveryScheduleRegister";
	}
	
	@GetMapping("/schedule")
	public String viewDeliverySchedule(Model model) {
		return "/CustomerService/schedule";
	}
}
