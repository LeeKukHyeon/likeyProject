package ks44team03.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaymentController {
	/* 결제전 */
	@GetMapping("/paymentDetail")
	public String getPaymentDetail() {
		return "payment/paymentDetail";
	}
	
	/* 결제완료 */
	@GetMapping("/paymentComplete")
	public String getPaymentComplete() {
		return "payment/paymentComplete";
	}

}
