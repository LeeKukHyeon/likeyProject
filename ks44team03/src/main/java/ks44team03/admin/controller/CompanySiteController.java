package ks44team03.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CompanySiteController {
	
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
