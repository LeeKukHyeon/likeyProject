package ks44team03.user.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ks44team03.dto.Community;
import ks44team03.user.mapper.CommunityMapper;
import ks44team03.user.service.CommunityService;

@Controller
public class CommunityController {

	private CommunityService communityService;
	
	public CommunityController(CommunityService communityService) {
		this.communityService = communityService;
	}
// ------------------- 이용후기 게시판 관련 맵핑 state ---------------------------------------------
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
// ------------------- 정보공유 게시판 관련 맵핑 end ---------------------------------------------
	
// ------------------- 정보공유 게시판 관련 맵핑 state ---------------------------------------------
	// 정보공유 게시판 목록
	@GetMapping("/postbordeList")
	public String getPostbordeList(Model model) {
		
		List<Community> postbordeList = communityService.getPostbordeList();
		
		model.addAttribute("postbordeList", postbordeList);
		model.addAttribute("title", "정보공유");
		return "community/postbordeList";
	}
	// 정보공유 상세정보
	@GetMapping("/postbordeInfo")
	public String getPostbordeInfo(@RequestParam(name="communityNum")String communityNum,
								Model model) {
		
		Community postbordeInfo = communityService.getPostbordeInfo(communityNum);
		
		model.addAttribute("postbordeInfo", postbordeInfo);
		model.addAttribute("title", "이용후기");
		return "community/postbordeInfo";
	}
	// 정보공유 등록
	@PostMapping("/postbordeRegister")
	public String addPostborde(Community community) {
		
		communityService.addPostborde(community);
		
		return "redirect:/postbordeList";
	}
	// 정보공유 등록
	@GetMapping("/postbordeRegister")
	public String addPostbordeForm(Model model) {
		
		model.addAttribute("title", "정보공유 등록");
		return "community/postbordeRegister";
	}
// ------------------- 정보공유 게시판 관련 맵핑 end ---------------------------------------------
}
