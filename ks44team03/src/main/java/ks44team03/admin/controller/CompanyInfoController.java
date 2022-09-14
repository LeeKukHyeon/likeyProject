package ks44team03.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/company")
public class CompanyInfoController {
	
	
	@GetMapping("/choiceCompany")
	public String choiceCompany(Model model) {
		
		model.addAttribute("title", "선택");
		
		return "company/choiceCompany";
	}
	
	@GetMapping("/companyRegister") 
	public String addCompany(Model model) {
	  
		model.addAttribute("title", "회사등록");
	  
		return "company/companyRegister"; 
	}
	  
	
}
