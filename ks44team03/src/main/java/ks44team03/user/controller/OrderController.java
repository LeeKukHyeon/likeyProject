package ks44team03.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import ks44team03.dto.ApplicationInfo;
import ks44team03.user.service.OrderService;

@Controller
public class OrderController {
	
	@GetMapping("/applicationFormRegister")
	public String applicationFormRegister() {
		return "applicationForm/applicationFormRegister";
	}
	
	@GetMapping("/friendsApplicationFormRegister")
	public String fApplicationFormRegister() {
		return "applicationForm/friendsApplicationFormRegister";
	}
	
	
	
	// 주문서 내 신청완료 버튼 클릭시 주문서 작성 완료 및 마이페이지로 이동
	@PostMapping("/submitOdf")
	public String submiOdf(ApplicationInfo order) {
		
		System.out.println(order + "aplicationinfo"); 
		
		/* int result = OrderService.addOrderInfo(order); */
		return "myPage/member/mypageScreen"; 
	}

	// 주문서 내 이미지 업로드
	

}
