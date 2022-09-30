package ks44team03.admin.controller;

import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



import ks44team03.admin.service.CompanyInfoService;
import ks44team03.dto.CompanyInfo;
import ks44team03.dto.Department;
import ks44team03.dto.Employee;
import ks44team03.dto.ManagementLevel;
import ks44team03.dto.WorkPlace;


@Controller

public class CompanyInfoController {
	
	private static final Logger log = LoggerFactory.getLogger(CompanyInfoController.class);
	
	private CompanyInfoService companyInfoService;
	
	public CompanyInfoController(CompanyInfoService companyInfoService) {
		this.companyInfoService = companyInfoService;
	}
	
	@GetMapping("/adminPage")
	public String adminPage(Model model) {
		
		model.addAttribute("title", "관리자페이지");
		
		return "adminPage";
	}
	
	// 회사관리 등록 관련 맵핑 ----------- 처음 -------------------------------------------------------------------------------------
	@GetMapping("/choiceCompany")
	public String choiceCompany(Model model) {
		
		model.addAttribute("title", "관리등록 선택");
		
		return "company/choiceCompany";
	}
	// 회사 등록
	@PostMapping("/companyRegister")
	public String addCompany(CompanyInfo companyInfo) {
		
		log.info("회사등록 입력한 값 ::: {}" + companyInfo);
		companyInfoService.addCompany(companyInfo);
		
		return"redirect:/companyList";
	}
	// 회사 등록
	@GetMapping("/companyRegister") 
	public String addCompanyForm(Model model) {
		
		
		model.addAttribute("title", "회사등록");
	  
		return "company/companyRegister"; 
	}
	// 사업장등록
	@PostMapping("/workPlaceRegister")
	public String addWorkPlace(WorkPlace workPlace) {
		
		log.info("사업장등록 입력한 값 ::: {}" + workPlace);
		companyInfoService.addWorkPlace(workPlace);
		
		return "redirect:/workPlaceList";
	}
	// 사업장등록 (사업장 등록시 회사 사업자등록번호 가져옴)
	@GetMapping("/workPlaceRegister")
	public String addWorkPlaceForm(Model model) {
		List<CompanyInfo> companyList = companyInfoService.getCompanyList();
		
		model.addAttribute("title", "사업장등록");
		model.addAttribute("companyList", companyList);
		
		return "company/workplace/workPlaceRegister";
	}
	// 부서등록
	@PostMapping("/departmentRegister")
	public String addDepartment(Department department) {
		
		log.info("부서등록 입력한 값  :::: {}" + department);
		companyInfoService.addDepartment(department);
		
		return "redirect:/departmentList";
	}
	// 부서등록
	@GetMapping("/departmentRegister")
	public String addDepartmentForm(Model model) {
		List<WorkPlace> workPlaceList = companyInfoService.getWorkPlaceList();
		
		model.addAttribute("title", "부서등록");
		model.addAttribute("workPlaceList", workPlaceList);
		
		return "company/department/departmentRegister";
	}
	// 사원등록
	@PostMapping("/employeeRegister")
	public String addEmployee(Employee employee) {
		
		log.info("사원등록 입력한 값 :::: {}" + employee);
		companyInfoService.addEmployee(employee);
		
		return "redirect:/employeeList";
	}
	// 사원등록
	@GetMapping("/employeeRegister")
	public String addEmployeeForm(Model model) {
		List<ManagementLevel> managementLevelList = companyInfoService.getManagementLevelList();
		List<Department> departmentList = companyInfoService.getDepartmentList();
		
		model.addAttribute("title", "사원등록");
		model.addAttribute("managementLevelList", managementLevelList);
		model.addAttribute("departmentList", departmentList);
		
		return "company/employee/employeeRegister";
	}
	// 회사관리 등록 관련 맵핑 ----------- 끝 -------------------------------------------------------------------------------------
	
	
	// 회사관리 목록조회 관련 맵핑 ----------- 처음 -------------------------------------------------------------------------------------
	@GetMapping("/companyManagement")
	public String companyManagement(Model model) {
		
		model.addAttribute("title", "회사관리");
		
		return "company/companyManagement";
	}
	// 회사 목록조회
	@GetMapping("/companyList")
	public String getCompanyList(Model model) {
		
		List<CompanyInfo> companyList = companyInfoService.getCompanyList();
		
		log.info("회사 목록 ::::: {}", companyList);

		model.addAttribute("companyList", companyList);
		model.addAttribute("title", "회사목록");
		
		return "company/companyList";
	}
	// 사업장 목록조회
	@GetMapping("/workPlaceList")
	public String workPlaceList(Model model) {
		
		List<WorkPlace> workPlaceList = companyInfoService.getWorkPlaceList();
		
		model.addAttribute("workPlaceList", workPlaceList);
		model.addAttribute("title", "사업장 목록");
		
		return "company/workPlace/workPlaceList";
	}
	// 부서 목록조회
	@GetMapping("/departmentList")
	public String departmentList(Model model) {
	
		List<Department> departmentList = companyInfoService.getDepartmentList();
		List<WorkPlace> workPlaceList = companyInfoService.getWorkPlaceList();
		
		model.addAttribute("departmentList", departmentList);
		model.addAttribute("workPlaceList", workPlaceList);
		model.addAttribute("title", "부서 목록");
		return "company/department/departmentList";
	}
	
	// 사원 목록조회
	@GetMapping("/employeeList")
	public String employeeList(Model model) {
		
		List<Employee> employeeList = companyInfoService.getEmployeeList();
		
		model.addAttribute("employeeList", employeeList);
		model.addAttribute("title", "사원 목록");
		return "company/employee/employeeList";
	}
	// 회사관리 목록조회 관련 맵핑 ----------- 끝 -------------------------------------------------------------------------------------
}
