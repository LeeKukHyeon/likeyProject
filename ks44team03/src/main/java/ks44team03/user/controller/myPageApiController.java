package ks44team03.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class myPageApiController {
	
	
	@PostMapping("api/nodataListApi")
	public String bcd(Model model) {
		model.addAttribute("title", "title");
		return "myPage/myPageApi/nodataList";
	}
	
	
	@PostMapping("shipStepInfo")
	public String abc(@RequestParam(name="q_ship_step_type", defaultValue = "") String test) {
		System.out.println(test+"-----------------");
		
		if (test.equals("noDataCnt")){
			return "myPage/myPageApi/nodataApi";
		}else if (test.equals("Imsi")) {
			return "myPage/myPageApi/tempApi";
		}else if (test.equals("orderType1")) {
			
			return "myPage/myPageApi/orderType1";
		}else if (test.equals("buyingItem")) {
				
				return "myPage/myPageApi/buyingItem";
		}else if (test.equals("Arrived")) {
			
			return "myPage/myPageApi/arrived";
		}else if (test.equals("PartialStock")) {
			
			return "myPage/myPageApi/partialStock";
		}else if (test.equals("AllIn")) {
			
			return "myPage/myPageApi/allIn";
		}else if (test.equals("Err")) {
			
			return "myPage/myPageApi/err";
		}
			
		
		
		return null;
	}
}
