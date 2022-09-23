package ks44team03.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CommunityController {

	@GetMapping("/reviewList")
	public String reviewList(Model model) {
		
		model.addAttribute("title", "이용후기");
		return "community/reviewList";
	}
	
	@GetMapping("/postborde")
	public String postborde(Model model) {
		
		model.addAttribute("title", "정보공유");
		return "community/postborde";
	}
	
}
