package ks44team03.admin.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ks44team03.admin.service.AdminOrderService;
import ks44team03.dto.GoodsInfo;
import ks44team03.dto.OrderInfo;

@Controller
public class AdminOrderController {

	private AdminOrderService orderService; 
	
	public AdminOrderController(AdminOrderService orderService) {
		this.orderService = orderService;
	}
	
	@GetMapping("/friendsOrderList")
	public String orderList(Model model) {
		
		List<GoodsInfo> friendsOrderList = orderService.getFriendsOrderList();
		
		model.addAttribute("friendsOrderList", friendsOrderList);
		model.addAttribute("title", "프렌즈 주문서목록");
		return "orderList/friendsOrderList";
	}
	
	@GetMapping("goodsInfo")
	public String goodsInfo(Model model) {
		
		model.addAttribute("title", "상품 상세정보");
		return "orderList/goodsInfo";
	}
	//adminPage 이용자주문서 목록
	@GetMapping("/adminOrderList")
	public String adminOrderList(Model model) {
		
		List<OrderInfo> orderList = orderService.getOrderList();
		
		model.addAttribute("orderList", orderList);
		model.addAttribute("title", "이용자 주문목록");
		return "orderList/adminOrderList";
	}
	//adminPage (임시저장)이용자주문서 목록
	@GetMapping("/adminTempOrderList")
	public String adminTempOrderList(Model model) {
		
		List<OrderInfo> tempOrderList = orderService.getTempOrderList();
		
		model.addAttribute("tempOrderList", tempOrderList);
		model.addAttribute("title", "(임시저장)이용자 주문목록");
		return "orderList/adminTempOrderList";
	}
	@PostMapping("/adminOrderList")
	//adminPage 주문서목록 검색조회
	public String getOrderList(@RequestParam(name="searchKey", defaultValue = "buyOrderCode") String searchKey
							  ,@RequestParam(name="searchValue", required = false, defaultValue = "") String searchValue
							  ,Model model) {
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("searchKey", searchKey);
		paramMap.put("searchValue", searchValue);
		
		List<OrderInfo> orderList = orderService.getSearchOrderList(paramMap);
		
		model.addAttribute("title", "주문서목록조회");
		model.addAttribute("orderList", orderList);
		
		return "orderList/adminOrderList";
	}
	@PostMapping("/adminTempOrderList")
	//adminPage (임시저장)주문서목록 검색조회
	public String getTempOrderList(@RequestParam(name="searchKey", defaultValue = "buyOrderCode") String searchKey
							  ,@RequestParam(name="searchValue", required = false, defaultValue = "") String searchValue
							  ,Model model) {
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("searchKey", searchKey);
		paramMap.put("searchValue", searchValue);
		
		List<OrderInfo> tempOrderList = orderService.getSearchTempOrderList(paramMap);
		
		model.addAttribute("title", "주문서목록조회");
		model.addAttribute("tempOrderList", tempOrderList);
		
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
	@PostMapping("/deliveryOrderList")
	//adminPage 배송대행 주문서목록 검색조회
	public String getDeliveryOrderList(@RequestParam(name="searchKey", defaultValue = "goodsInfoCode") String searchKey
							  ,@RequestParam(name="searchValue", required = false, defaultValue = "") String searchValue
							  ,Model model) {
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("searchKey", searchKey);
		paramMap.put("searchValue", searchValue);
		
		List<OrderInfo> deliveryOrderList = orderService.getSearchDeliveryOrderList(paramMap);
		System.out.println("searchKey ::::::::::::"+ searchKey);
		System.out.println("searchValue ::::::::::::"+ searchValue);
		
		model.addAttribute("title", "주문서목록조회");
		model.addAttribute("deliveryOrderList", deliveryOrderList);
		
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
	@PostMapping("/buyProgressOrderList")
	//adminPage 구매대행 주문서목록 검색조회
	public String getBuyProgressOrderList(@RequestParam(name="searchKey", defaultValue = "goodsInfoCode") String searchKey
							  ,@RequestParam(name="searchValue", required = false, defaultValue = "") String searchValue
							  ,Model model) {
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("searchKey", searchKey);
		paramMap.put("searchValue", searchValue);
		
		List<OrderInfo> buyProgressOrderList = orderService.getSearchBuyProgressOrderList(paramMap);
		System.out.println("searchKey ::::::::::::"+ searchKey);
		System.out.println("searchValue ::::::::::::"+ searchValue);
		
		model.addAttribute("title", "주문서목록조회");
		model.addAttribute("buyProgressOrderList", buyProgressOrderList);
		
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
	@PostMapping("/waitingForwardingList")
	//adminPage 출고대기/결제대기 주문서목록 검색조회
	public String getWaitingForwardingList(@RequestParam(name="searchKey", defaultValue = "incomingCode") String searchKey
							  ,@RequestParam(name="searchValue", required = false, defaultValue = "") String searchValue
							  ,Model model) {
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("searchKey", searchKey);
		paramMap.put("searchValue", searchValue);
		
		List<GoodsInfo> waitingForwardingList = orderService.getSearchWaitingForwardingList(paramMap);
		System.out.println("searchKey ::::::::::::"+ searchKey);
		System.out.println("searchValue ::::::::::::"+ searchValue);
		
		model.addAttribute("title", "주문서목록조회");
		model.addAttribute("waitingForwardingList", waitingForwardingList);
		
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
	@PostMapping("/completedForwardingList")
	//adminPage 출고대기/결제완료 주문서목록 검색조회
	public String getCompletedForwardingList(@RequestParam(name="searchKey", defaultValue = "incomingCode") String searchKey
							  ,@RequestParam(name="searchValue", required = false, defaultValue = "") String searchValue
							  ,Model model) {
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("searchKey", searchKey);
		paramMap.put("searchValue", searchValue);
		
		List<GoodsInfo> completedForwardingList = orderService.getSearchCompletedForwardingList(paramMap);
		System.out.println("searchKey ::::::::::::"+ searchKey);
		System.out.println("searchValue ::::::::::::"+ searchValue);
		
		model.addAttribute("title", "주문서목록조회");
		model.addAttribute("completedForwardingList", completedForwardingList);
		
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
	@PostMapping("/holdForwardingList")
	//adminPage 출고보류 주문서목록 검색조회
	public String getHoldForwardingList(@RequestParam(name="searchKey", defaultValue = "incomingCode") String searchKey
							  ,@RequestParam(name="searchValue", required = false, defaultValue = "") String searchValue
							  ,Model model) {
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("searchKey", searchKey);
		paramMap.put("searchValue", searchValue);
		
		List<GoodsInfo> holdForwardingList = orderService.getSearchHoldForwardingList(paramMap);
		System.out.println("searchKey ::::::::::::"+ searchKey);
		System.out.println("searchValue ::::::::::::"+ searchValue);
		
		model.addAttribute("title", "주문서목록조회");
		model.addAttribute("holdForwardingList", holdForwardingList);
		
		return "orderList/forwarding/holdForwardingList";
	}
}
