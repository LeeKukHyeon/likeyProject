package ks44team03.admin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ks44team03.admin.service.OrderService;
import ks44team03.dto.GoodsInfo;
import ks44team03.dto.OrderInfo;

@Controller
public class AdminOrderController {

	private OrderService orderService; 
	
	public AdminOrderController(OrderService orderService) {
		this.orderService = orderService;
	}
	
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
	//관리자 이용자주문서 목록
	@GetMapping("/adminOrderList")
	public String adminOrderList(Model model) {
		
		List<OrderInfo> orderList = orderService.getOrderList();
		
		model.addAttribute("orderList", orderList);
		model.addAttribute("title", "이용자 주문목록");
		return "orderList/adminOrderList";
	}
	//관리자 (임시저장)이용자주문서 목록
	@GetMapping("/adminTempOrderList")
	public String adminTempOrderList(Model model) {
		
		List<OrderInfo> tempOrderList = orderService.getTempOrderList();
		
		model.addAttribute("tempOrderList", tempOrderList);
		model.addAttribute("title", "(임시저장)이용자 주문목록");
		return "orderList/adminTempOrderList";
	}
	//adminPage 배송대행 주문서 목록조회
	@GetMapping("/deliveryOrderList")
	public String deliveryOrderList(Model model) {
		
		List<OrderInfo> deliveryOrderList = orderService.getDeliveryOrderList();
		
		model.addAttribute("deliveryOrderList", deliveryOrderList);
		model.addAttribute("title", "신청완료 배송대행 주문서 목록조회");
		return "orderList/delivery/deliveryOrderList";
	}
	//adminPage 구매대행 주문서 목록조회
	@GetMapping("/buyProgressOrderList")
	public String buyProgressOrderList(Model model) {
		
		List<OrderInfo> buyProgressOrderList = orderService.getBuyProgressOrderList();
		
		model.addAttribute("buyProgressOrderList", buyProgressOrderList);
		model.addAttribute("title", "신청완료 구매대행 주문서 목록조회");
		return "orderList/buyProgress/buyProgressOrderList";
	}
	//adminPage 출고대기/결제대기 주문서 목록조회
	@GetMapping("/waitingForwardingList")
	public String waitingForwardingList(Model model) {
		
		List<GoodsInfo> waitingForwardingList = orderService.getWaitingForwardingList();
		
		model.addAttribute("waitingForwardingList", waitingForwardingList);
		model.addAttribute("title", "출고대기/결제대기 주문서 목록조회");
		return "orderList/forwarding/waitingForwardingList";
	}
	//adminPage 출고대기/결제완료 주문서 목록조회
	@GetMapping("/completedForwardingList")
	public String completedForwardingList(Model model) {
		
		List<GoodsInfo> completedForwardingList = orderService.getCompletedForwardingList();
		
		model.addAttribute("completedForwardingList", completedForwardingList);
		model.addAttribute("title", "출고대기/결제완료 주문서 목록조회");
		return "orderList/forwarding/completedForwardingList";
	}
	//adminPage 출고보류 주문서 목록조회
	@GetMapping("/holdForwardingList")
	public String holdForwardingList(Model model) {
		
		List<GoodsInfo> holdForwardingList = orderService.getHoldForwardingList();
		
		model.addAttribute("holdForwardingList", holdForwardingList);
		model.addAttribute("title", "출고보류 주문서 목록조회");
		return "orderList/forwarding/holdForwardingList";
	}
}
