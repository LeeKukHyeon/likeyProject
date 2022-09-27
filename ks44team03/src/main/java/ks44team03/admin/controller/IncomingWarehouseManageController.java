package ks44team03.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IncomingWarehouseManageController {

	@GetMapping("/incomingNodata")
	public String regNoDataIncoming() {
		return "incoming/incomingNodata";
	}
	
	@GetMapping("/incomingNodata2")
	public String regNoDataIncoming2() {
		return "incoming/incomingNodata2";
	}
	
}
