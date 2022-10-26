package ks44team03.admin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import ks44team03.admin.service.IncomingWarehouseManageService;
import ks44team03.dto.Nodata;

@Controller
public class IncomingWarehouseManageController {
	
	private static final Logger log = LoggerFactory.getLogger(IncomingController.class);
	
	private IncomingWarehouseManageService incomingWarehouseManageService;
	
	public IncomingWarehouseManageController(IncomingWarehouseManageService incomingWarehouseManageService ) {
		this.incomingWarehouseManageService = incomingWarehouseManageService;
	}
	
	//노데이터 화면
	@GetMapping("/incomingNodata")
	public String incomingNodata() {
		return "incoming/incomingNodata";
	}
	
	//노데이터 입고등록
	@PostMapping("/regNodata")
	public String regNodata(Nodata nodata) {
		incomingWarehouseManageService.regNodata(nodata);
		
		log.info("---------------------노데이터-------------------");
		
	return "redirect:incomingNodata";
	}
	
}
