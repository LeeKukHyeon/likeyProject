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
		if (test.equals("noDataCnt")){
			return "myPage/myPageApi/nodataApi";
		}
		else if (test.equals("Imsi")) {
			return "myPage/myPageApi/tempApi";
		}
		
		return null;
	}
}
