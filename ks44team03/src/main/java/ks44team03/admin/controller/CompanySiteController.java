package ks44team03.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CompanySiteController {
	
	@GetMapping("test")
	public String adminModifySite1(Model model) {
		model.addAttribute("title", "가입한 쇼핑몰사이트 수정");
		return "main";
	}
	
	
	@GetMapping("shoppingModify")
	public String adminModifySite(Model model) {
		model.addAttribute("title", "가입한 쇼핑몰사이트 수정");
		return "procurement/shopping/shoppingModify";
	}
	
	@GetMapping("shoppingRegister")
	public String adminRegSite(Model model) {
		model.addAttribute("title", "가입한 쇼핑몰사이트 등록");
		return "procurement/shopping/shoppingRegister";
	}
	
	@GetMapping("shoppingSearch")
	public String adminSiteList(Model model) {
		model.addAttribute("title", "쇼핑몰사이트목록정보조회");
		return "procurement/shopping/shoppingSearch";
	}
}
