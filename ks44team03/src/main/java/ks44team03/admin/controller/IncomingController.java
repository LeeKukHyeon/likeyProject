package ks44team03.admin.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ks44team03.admin.service.IncomingService;
import ks44team03.dto.Criteria;
import ks44team03.dto.GoodsInfo;
import ks44team03.dto.OrderInfo;
import ks44team03.dto.PageMakerDTO;


@Controller
public class IncomingController {

	private static final Logger log = LoggerFactory.getLogger(CompanyInfoController.class);
	
	private IncomingService incomingService;
	
	
	public IncomingController(IncomingService incomingService) {
		this.incomingService = incomingService;
		
	}
	
	
	//도착등록 ajax
	@PostMapping("incomingGoodsDetailRegister")
	@ResponseBody
	public int incomingGoodsDetailRegister(@RequestParam(value = "goodsInfoCode")String goodsInfoCode) {
		
		int incomingGoodsDetailRegister = incomingService.incomingGoodsDetailRegister(goodsInfoCode);
	
		return incomingGoodsDetailRegister;
	}
	
	
	
	//ajax 호출
	
	@PostMapping("/goodsDetail")
	@ResponseBody
	public List<GoodsInfo> goodsDetail(@RequestParam(value = "code") String code) {
			
			List<GoodsInfo> goodsDetail = incomingService.goodsDetail(code);
			
		
			return goodsDetail;
	}

	//입고 등록
	@GetMapping("/incomingRegister") 
	public String regIncoming(@RequestParam(value="goodsInfoCode", required = false) String goodsInfoCode, Model model) {
	  List<GoodsInfo> regIncoming = incomingService.regIncoming();
	  
	  log.info("goodsInfoCode ::::" + goodsInfoCode);
	  
	  model.addAttribute("title", "입고 등록"); 
	  model.addAttribute("regIncoming",regIncoming); 
	  return "incoming/incomingRegister";
	 }
	
	//입고 도착 상품 체크박스로 등록
	@PostMapping ("incomingCheck")
	public String incomingCheck(@RequestParam(name = "check", required=false) String[] checks) {
	
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("checks", checks);
		incomingService.incomingCheck(paramMap);
		return "redirect:incomingGoodsList";
	}
	
	
	//입고전 상품목록
	@GetMapping("incomingGoodsList")
	public String incomingGoodsList(Model model,
		@RequestParam(value = "buyOrderCode",required = false) String buyOrderCode,
		@RequestParam(name = "searchKey",required=false ) String searchKey,
		@RequestParam(name = "searchValue",required=false ) String searchValue,
		Criteria cri) {		
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("searchKey", searchKey);
		paramMap.put("searchValue", searchValue);
		paramMap.put("buyOrderCode", buyOrderCode);
		paramMap.put("cri", cri);
		
		int getTotal = incomingService.getListPaging(buyOrderCode);
		
		List<GoodsInfo> incomingGoodsList = incomingService.incomingGoodsList(paramMap);
		
		
		PageMakerDTO pageMake = new PageMakerDTO(cri, getTotal);
		model.addAttribute("buyOrderCode",buyOrderCode);
		model.addAttribute("pageMake",pageMake);
		
		model.addAttribute("incomingGoodsList", incomingGoodsList);
		return "incoming/incomingGoodsList";
	}
	
	
	//보관료 발생 목록 조회
	
	@GetMapping("storageCharge")
	public String storageCharge(Model model, 
			@RequestParam(name = "searchKey",required=false ) String searchKey,
			@RequestParam(name = "searchValue",required=false ) String searchValue) {
		System.out.println(searchKey);
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("searchKey", searchKey);
		paramMap.put("searchValue", searchValue);
		List<GoodsInfo> storageCharge = incomingService.storageCharge(paramMap); 
		
		model.addAttribute("title", "보관료 발생 조회"); 
		model.addAttribute("storageCharge",storageCharge); 
		return "incoming/storageCharge"; 
		
	}
	//배송완료 상품 목록 조회
	
	@GetMapping("deliveryComplete")
	public String deliveryComplete(Model model, 
			@RequestParam(name = "searchKey",required=false ) String searchKey,
			@RequestParam(name = "searchValue",required=false ) String searchValue) {
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("searchKey", searchKey);
		paramMap.put("searchValue", searchValue);
		List<GoodsInfo> deliveryComplete = incomingService.deliveryComplete(paramMap); 
		
		model.addAttribute("title", "배송완료 상품목록 조회"); 
		model.addAttribute("deliveryComplete",deliveryComplete); 
		return "incoming/deliveryComplete"; 
		
	}
	
	//배송중인 상품 목록 조회
	
		@GetMapping("inTransit")
		public String inTransit(Model model, 
				@RequestParam(name = "searchKey",required=false ) String searchKey,
				@RequestParam(name = "searchValue",required=false ) String searchValue) {
				
				Map<String, Object> paramMap = new HashMap<String, Object>();
				paramMap.put("searchKey", searchKey);
				paramMap.put("searchValue", searchValue);
				List<GoodsInfo> inTransit = incomingService.inTransit(paramMap); 
							
				model.addAttribute("title", "배송중인 상품목록 조회"); 
				model.addAttribute("inTransit",inTransit); 
				return "incoming/inTransit"; 
			
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
			@RequestParam(name = "searchValue",required=false ) String searchValue,
			@RequestParam(name = "check", required=false) String[] checks
			) {
		
		if (checks != null) {
			for(String check :  checks) {
				incomingService.regGoodsIncoming(check);
			}
		}
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("searchKey", searchKey);
		paramMap.put("searchValue", searchValue);
		List<OrderInfo> incomingOrderList = incomingService.incomingOrderList(paramMap);
		model.addAttribute("title", "도착확인");
		model.addAttribute("incomingOrderList", incomingOrderList);
	
		return "incoming/incomingList";
	}
	
	//입고등록 모달 - 특정 상품코드 조회
	@GetMapping("/incomingGoodsInfoByCode")
	@ResponseBody
	public Map<String,Object> incomingGoodsInfoByCode(@RequestParam(value="goodsInfoCode") String goodsInfoCode){
		Map<String, Object> goodsInfo = incomingService.incomingGoodsInfoByCode(goodsInfoCode);
		return goodsInfo;
	}
	
}
