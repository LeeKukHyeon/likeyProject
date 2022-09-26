package ks44team03.admin.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import ks44team03.admin.service.CompanyInfoService;
import ks44team03.dto.CompanyInfo;


@Controller

public class CompanyInfoController {
	
	private static final Logger log = LoggerFactory.getLogger(CompanyInfoController.class);
	
	private CompanyInfoService companyInfoService;
	
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
	
	@PostMapping("/companyRegister")
	public String addCompany(CompanyInfo companyInfo) {
		
		log.info("입력한 값 ::: {}", companyInfo);
		
		companyInfoService.addCompany(companyInfo);
		
		return"redirect:/company/companyList";
	}
	
	@GetMapping("/companyRegister") 
	public String addCompanyForm(Model model) {
		
		
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
	public String getCompanyList(Model model) {
		/* List<CompanyInfo> companyList = companyInfoService.getCompanyList(); */
		/* log.info("회사 목록 ::::: {}", companyList); */
		
		/* model.addAttribute("companyList", companyList); */
		
		
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
