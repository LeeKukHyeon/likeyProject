package ks44team03.user.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	public String getReviewList(Model model) {
		
		List<Community> reviewList = communityService.getReviewList();
		
		System.out.println("reviewList :::: {}"+ reviewList);
		model.addAttribute("reviewList", reviewList);
		model.addAttribute("title", "이용후기");
		
		return "community/reviewList";
	}
	// 이용후기 상세정보
	@GetMapping("/reviewInfo")
	public String getReviewInfo(@RequestParam(name="communityNum")String communityNum,
								Model model) {
		
		Community reviewInfo = communityService.getReviewInfo(communityNum);
		
		model.addAttribute("reviewInfo", reviewInfo);
		model.addAttribute("title", "이용후기");
		return "community/reviewInfo";
	}
	
	// 이용후기 등록
	@PostMapping("/reviewRegister")
	public String addReview(Community community) {
		
		communityService.addReview(community);
		
		return"redirect:/reviewList";
	}
	// 이용후기 등록
	@GetMapping("/reviewRegister")
	public String addReviewForm(Model model) {
		
		model.addAttribute("title", "이용후기 등록");
		return "community/reviewRegister";
	}
}
