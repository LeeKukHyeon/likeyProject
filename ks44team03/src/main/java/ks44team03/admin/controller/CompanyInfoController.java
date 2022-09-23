package ks44team03.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class CompanyInfoController {
	
	
	@GetMapping("/adminPage")
	public String adminPage(Model model) {
		
		model.addAttribute("title", "관리자페이지");
		
		return "adminPage";
	}
	
	@GetMapping("/choiceCompany")
	public String choiceCompany(Model model) {
		
		model.addAttribute("title", "관리등록 선택");
		
		return "company/choiceCompany";
	}
	
	@GetMapping("/companyRegister") 
	public String addCompany(Model model) {
	  
		model.addAttribute("title", "회사등록");
	  
		return "company/companyRegister"; 
	}
	
	@GetMapping("workplace/workPlaceRegister")
	public String workPlaceRegister(Model model) {
		
		model.addAttribute("title", "사업장등록");
		
		return "company/workplace/workPlaceRegister";
	}
	
	@GetMapping("department/departmentRegister")
	public String departmentRegister(Model model) {
		
		model.addAttribute("title", "부서등록");
		
		return "company/department/departmentRegister";
	}
	
	@GetMapping("employee/employeeRegister")
	public String employeeRegister(Model model) {
		
		model.addAttribute("title", "사원등록");
		
		return "company/employee/employeeRegister";
	}
	
}
