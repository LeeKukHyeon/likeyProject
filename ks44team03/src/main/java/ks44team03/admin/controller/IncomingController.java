package ks44team03.admin.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ks44team03.admin.service.IncomingService;
import ks44team03.dto.GoodsInfo;
import ks44team03.dto.Incoming;
import ks44team03.dto.OrderInfo;

@Controller
public class IncomingController {

	private static final Logger log = LoggerFactory.getLogger(CompanyInfoController.class);
	
	private IncomingService incomingService;
	
	public IncomingController(IncomingService incomingService) {
		this.incomingService = incomingService;
	}

	/*
	 * @PostMapping("/incomingRegister") public String regIncoming(Incoming
	 * incoming) {
	 * 
	 * log.info("입력한 값 ::: {}", incoming); incomingService.regIncoming(incoming);
	 * 
	 * return "redirect:/incomingSearch"; }
	 */
	//입고 등록 22222222222222
	@GetMapping("/incomingRegister2") 
	public String regIncoming2(@RequestParam(value="goodsInfoCode", required = false) String goodsInfoCode, Model model) {
	  List<GoodsInfo> regIncoming2 = incomingService.regIncoming2();
	  
	  GoodsInfo incomingGoodsInfo = incomingService.getIncomingGoodsInfo(goodsInfoCode);
	  log.info("incomingGoodsInfo ::::::"+ incomingGoodsInfo);
	  log.info("goodsInfoCode ::::" + goodsInfoCode);
	  
	  model.addAttribute("incomingGoodsInfo", incomingGoodsInfo);
	  model.addAttribute("title", "입고 등록"); 
	  model.addAttribute("regIncoming2",regIncoming2); 
	  model.addAttribute("incomingGoodsInfo",incomingGoodsInfo); 
	  return "incoming/incomingRegister2";
	 }
	
	
	//입고 전 상품목록
	@GetMapping("/incomingGoodsList")
	public String incomingGoodsList(Model model, @RequestParam(value = "buyOrderCode") String buyOrderCode) {
	List<GoodsInfo> incomingGoodsList = incomingService.incomingGoodsList(buyOrderCode);
	System.out.println("incomingGoodsList::::::"+ incomingGoodsList);
	model.addAttribute("incomingGoodsList", incomingGoodsList);
	return "incoming/incomingGoodsList";
	}
	
	
	//오류 입고
	
	@GetMapping("/errorIncoming")
	public String errorIncoming(Model model) {
		List<GoodsInfo> errorIncoming = incomingService.errorIncoming(); 
		
		model.addAttribute("title", "오류 입고"); 
		model.addAttribute("errorIncoming",errorIncoming); 
		return "incoming/errorIncoming"; }
	
	//전체 입고
	
	@GetMapping("/arrivedAll")
	public String arrivedAll(Model model) {
		List<OrderInfo> arrivedAll = incomingService.arrivedAll(); 
		
		model.addAttribute("title", "전체 입고"); 
	model.addAttribute("arrivedAll",arrivedAll); 
	return "incoming/arrivedAll"; }
	
	  //일부입고
	  
	@GetMapping("/partialArrival") 
	public String partialArrival(Model model) {
		List<OrderInfo> partialArrival = incomingService.partialArrival(); 
	 
		model.addAttribute("title", "일부 입고"); 
		model.addAttribute("partialArrival",partialArrival); 
	  return "incoming/partialArrival"; }
	  
	  // 창고도착
	  
	@GetMapping("/arriveWarehouse") 
	public String arriveWarehouse(Model model) {
	  List<GoodsInfo> arriveWarehouse = incomingService.arriveWarehouse();
	  
	  model.addAttribute("title", "창고 도착"); 
	  model.addAttribute("arriveWarehouse",arriveWarehouse); 
	  return "incoming/arriveWarehouse"; }
	 
	
	// 도착확인
	@GetMapping("/incomingList")
	public String incomingList(Model model,
			@RequestParam(name = "searchKey",required=false ) String searchKey,
			@RequestParam(name = "searchValue",required=false ) String searchValue
			) {
		
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("searchKey", searchKey);
		paramMap.put("searchValue", searchValue);
		List<OrderInfo> incomingOrderList = incomingService.incomingOrderList(paramMap);
		model.addAttribute("title", "도착확인");
		model.addAttribute("incomingOrderList", incomingOrderList);
	
		return "incoming/incomingList";
	}
	
	@GetMapping("/incomingRegister")
	public String regIncoming(Model model) {
	
		model.addAttribute("title", "입고 등록");
	
		return "incoming/incomingRegister";
	}
	
	//입고등록 모달 - 특정 상품코드 조회
	@GetMapping("/incomingGoodsInfoByCode")
	@ResponseBody
	public Map<String,Object> incomingGoodsInfoByCode(@RequestParam(value="goodsInfoCode") String goodsInfoCode){
		Map<String, Object> goodsInfo = incomingService.incomingGoodsInfoByCode(goodsInfoCode);
		return goodsInfo;
	}
}
