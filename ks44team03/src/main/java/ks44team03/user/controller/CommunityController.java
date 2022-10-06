package ks44team03.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import ks44team03.dto.Community;
import ks44team03.user.service.CommunityService;

@Controller
public class CommunityController {

	private CommunityService communityService;
	
	public CommunityController(CommunityService communityService) {
		this.communityService = communityService;
	}
	// 이용후기 게시판 목록
	@GetMapping("/reviewList")
	public String reviewList(Model model) {
		
		model.addAttribute("title", "이용후기");
		return "community/reviewList";
	}
	
	// 이용후기 등록
	@PostMapping("/reviewRegister")
	public String addReview(Community community) {
		
		communityService.addReview(community);
		
		return"redirect:/reviewList";
	}
	@GetMapping("/reviewRegister")
	public String addReviewForm(Model model) {
		
		model.addAttribute("title", "이용후기 등록");
		return "community/reviewRegister";
	}
}
