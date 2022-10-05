package ks44team03.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ks44team03.user.service.CommunityService;

@Controller
public class CommunityController {

	private CommunityService communityService;
	
	public CommunityController(CommunityService communityService) {
		this.communityService = communityService;
	}
	
	@GetMapping("/reviewList")
	public String reviewList(Model model) {
		
		
		
		model.addAttribute("title", "이용후기");
		return "community/reviewList";
		
	}
}
