package ks44team03.admin.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ks44team03.admin.service.ForwardingService;
import ks44team03.dto.IncomingInfo;

@Controller
public class ForwardingController {

	private static final Logger log = LoggerFactory.getLogger(ForwardingController.class);

	private ForwardingService forwardingService;


	public ForwardingController(ForwardingService forwardingService) {
		this.forwardingService = forwardingService;

	}
 
	//출고 등록 대기 목록
 	@GetMapping("/forwardingRegister")
 	public String regForwardingList(@RequestParam(value="goodsInfoCode", required = false) String goodsInfoCode, Model model) {
	 	List<IncomingInfo> regForwardingList = forwardingService.regForwardingList();

	 	log.info("goodsInfoCode ::::" + goodsInfoCode);

	 	model.addAttribute("title", "출고 등록");
	 	model.addAttribute("regForwardingList",regForwardingList);
	 	
	 	return "forwardingManagement/forwardingRegister";
 	}
 	
 	//출고 등록
 	@PostMapping("/regForwarding")
 	public String regForwarding(IncomingInfo incomingInfo, String goodsInfoCode) {
 		
 		int result = forwardingService.regForwarding(incomingInfo, goodsInfoCode);
 		
 	return "redirect:/forwardingList";
 	}
 
 	//출고 등록 모달 - 특정 상품코드 조회
	@GetMapping("/forwardingGoodsInfoByCode")
	@ResponseBody
	public Map<String,Object> forwardingGoodsInfoByCode(@RequestParam(value="goodsInfoCode") String goodsInfoCode){
		Map<String, Object> goodsInfo = forwardingService.forwardingGoodsInfoByCode(goodsInfoCode);
		return goodsInfo;
	}
	
	//출고완료 상품목록
	@GetMapping("/forwardingList") 
	public String forwardingList(Model model) {
	  List<IncomingInfo> forwardingList = forwardingService.forwardingList();
	  
	  model.addAttribute("title", "출고완료 상품목록"); 
	  model.addAttribute("forwardingList",forwardingList); 
	  return "forwardingManagement/forwardingList";
	 }
	
 }
