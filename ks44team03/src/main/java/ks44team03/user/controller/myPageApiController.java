package ks44team03.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class myPageApiController {
	
	@PostMapping("api/ship_step_info_api")
	public String abc() {
		return "myPage/member/ship_step_info_api";
	}
}
