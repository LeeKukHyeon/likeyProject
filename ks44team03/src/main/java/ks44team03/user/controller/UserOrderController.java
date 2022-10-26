package ks44team03.user.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ks44team03.dto.ApplicationInfo;
import ks44team03.user.service.UserOrderService;

@Controller
@RequestMapping(value = "/user")
public class UserOrderController {
	
	private final UserOrderService orderService;
	
	public UserOrderController(@Qualifier(value ="userOrderService")UserOrderService orderService) {
		this.orderService = orderService;
	}
	
	/**
	 * 배송대행 주문서 등록화면
	 */
	@GetMapping("/applicationFormRegister")
	public String applicationFormRegister() {
		return "applicationForm/applicationFormRegister";
	}
	
	/**
	 * 구매대행 주문서 등록화면
	 */
	@GetMapping("/applicationFormRegisterPa")
	public String applicationFormRegisterPa() {
		return "applicationForm/applicationFormRegisterPa";
	}
	
	/**
	 * 프렌즈구매대행 주문서 등록화면
	 */
	@GetMapping("/friendsApplicationFormRegister")
	public String ApplicationFormRegister() {
		return "applicationForm/friendsApplicationFormRegister";
	}
	
	
	
	/**
	 * 주문서 내 신청완료 버튼 클릭시 주문서 작성 완료 및 마이페이지로 이동
	 */
	@PostMapping("/submitOdf")
	public String submiOdf(ApplicationInfo applicationInfo ) {		
		// int result = orderService.addOrderInfo(applicationInfo);
		return "myPage/member/mypageScreen"; 
	}

	/**
	 * 주문서 내 이미지 업로드
	 */
	@PostMapping("/user/shipping_img_upload.html?idx=")
	@ResponseBody
	public int imgUpload(@RequestParam("id") String id) {
		//if (id.equals(orderService.checkID(id))) {
		//	return 1;
		//}else {
			return 0;
		//}
	  }
	

}
