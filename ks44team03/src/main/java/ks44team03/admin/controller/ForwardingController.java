package ks44team03.admin.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
 	
 	//출고등록 모달 - 특정 상품코드 조회
	@GetMapping("/forwardingGoodsInfoByCode")
	@ResponseBody
	public Map<String,Object> forwardingGoodsInfoByCode(@RequestParam(value="goodsInfoCode") String goodsInfoCode){
		Map<String, Object> goodsInfo = forwardingService.forwardingGoodsInfoByCode(goodsInfoCode);
		return goodsInfo;
	}
 }
