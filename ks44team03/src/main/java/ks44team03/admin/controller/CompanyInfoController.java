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
	
	// 회사관리 등록 관련 맵핑 - 처음
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
	
	@GetMapping("/workPlaceRegister")
	public String workPlaceRegister(Model model) {
		
		model.addAttribute("title", "사업장등록");
		
		return "company/workplace/workPlaceRegister";
	}
	
	@GetMapping("/departmentRegister")
	public String departmentRegister(Model model) {
		
		model.addAttribute("title", "부서등록");
		
		return "company/department/departmentRegister";
	}
	
	@GetMapping("/employeeRegister")
	public String employeeRegister(Model model) {
		
		model.addAttribute("title", "사원등록");
		
		return "company/employee/employeeRegister";
	}
	// 회사관리 등록 관련 맵핑 - 끝
	
	// 회사관리 목록조회 관련 맵핑 - 처음
	@GetMapping("/companyManagement")
	public String companyManagement(Model model) {
		
		model.addAttribute("title", "회사관리");
		
		return "company/companyManagement";
	}
	
	@GetMapping("/companyList")
	public String companyList(Model model) {
		
		model.addAttribute("title", "회사목록");
		
		return "company/companyList";
	}
	
	@GetMapping("/workPlaceList")
	public String workPlaceList(Model model) {
		
		model.addAttribute("title", "사업장 목록");
		return "company/workplace/workPlaceList";
	}
	
	@GetMapping("/employeeList")
	public String employeeList(Model model) {
		
		model.addAttribute("title", "사원 목록");
		return "company/employee/employeeList";
	}
	@GetMapping("/departmentList")
	public String departmentList(Model model) {
	
		model.addAttribute("title", "부서 목록");
		return "company/department/departmentList";
	}
	// 회사관리 등록 관련 맵핑 - 끝
}
