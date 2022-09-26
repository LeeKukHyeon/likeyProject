package ks44team03.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminOrderController {

	@GetMapping("/orderList")
	public String orderList(Model model) {
		
		model.addAttribute("title", "프렌즈 주문서목록");
		return "orderList/orderList";
	}
	
	@GetMapping("goodsInfo")
	public String goodsInfo(Model model) {
		
		model.addAttribute("title", "상품 상세정보");
		return "orderList/goodsInfo";
	}
}
