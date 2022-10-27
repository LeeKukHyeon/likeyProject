package ks44team03.admin.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ks44team03.admin.service.CompanyInfoService;
import ks44team03.dto.CompanyInfo;
import ks44team03.dto.Department;
import ks44team03.dto.Employee;
import ks44team03.dto.ManagementLevel;
import ks44team03.dto.WorkPlace;

@RequestMapping("/admin")
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
	
	// 관리자 로그인
	@PostMapping("/adminLogin")
	public String adminLogin(@RequestParam("aId") String aId
							,@RequestParam("aPw") String aPw
							,RedirectAttributes reAttr
							,HttpSession session) {
		
		log.info("aId :::::::::" + aId);
		log.info("aPw :::::::::" + aPw);
		Employee employeeInfo = companyInfoService.adminLogin(aId);
		
		if(employeeInfo != null) {
			String checkPw = employeeInfo.getEmployeePw();
			
			if(aPw != null && checkPw.equals(aPw)) {
				session.setAttribute("SID", aId);
				session.setAttribute("SLEVEL", employeeInfo.getEmployeeLevelCode());
				// 회원의 정보가 일치하면
				return "adminPage";
				
			}
		}
		return "adminPage";
	}
	@GetMapping("/adminLogout")
	public String adminLogout(HttpSession session) {
		session.invalidate();
		
		return "redirect:/adminPage";
	}
	

	// 회사등록 유효성 검사
	@GetMapping("/companyNumCheck")
	@ResponseBody
	public boolean companyNumCheck(@RequestParam(name="companyNum")String companyNum) {
		
		boolean result = companyInfoService.companyNumCheck(companyNum);
		
		return result;
	}
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
	
	//회사관리 수정 관련 맵핑 ------------------ 처음 ------------------------------------------------------------------------------------
	//회사 수정
	@PostMapping("/modifyCompany")
	public String modifyCompany(CompanyInfo companyCode) {
		
		companyInfoService.modifyCompany(companyCode);
		
		return "redirect:/companyList";
	}
	//회사 수정
	@GetMapping("/modifyCompany")
	public String modifyCompany(@RequestParam(value="companyCode", required = false)String companyCode, Model model) {
		
		CompanyInfo companyCodeInfo = companyInfoService.getCompanyInfoByCode(companyCode);
		
		List<CompanyInfo> companyList = companyInfoService.getCompanyList();
		
		model.addAttribute("title", "회사 수정");
		model.addAttribute("companyCodeInfo", companyCodeInfo);
		model.addAttribute("companyList", companyList);
		
		return "company/modifyCompany";
	}
	//사업장 수정
	@PostMapping("/modifyWorkPlace")
	public String modifyWorkPlace(WorkPlace workPlace) {
		
		companyInfoService.modifyWorkPlace(workPlace);
		
		return "redirect:/workPlaceList";
	}
	//사업장 수정
	@GetMapping("/modifyWorkPlace")
	public String modifyWorkPlace(@RequestParam(value="workPlaceCode", required = false) String workPlaceCode
												,Model model) {
		
		WorkPlace workPlaceCodeInfo = companyInfoService.getWorkPlaceInfoByCode(workPlaceCode);
		
		List<WorkPlace> workPlaceList = companyInfoService.getWorkPlaceList();
		
		model.addAttribute("title", "사업장 정보 수정");
		model.addAttribute("workPlaceCodeInfo", workPlaceCodeInfo);
		model.addAttribute("workPlaceList", workPlaceList);
		
		return "company/workPlace/modifyWorkPlace";
	}
	
	//부서 수정
		@PostMapping("/modifyDepartment")
		public String modifyDepartment(Department department) {
			
			companyInfoService.modifyDepartment(department);
			
			return "redirect:/departmentList";
		}
		//부서 수정
		@GetMapping("/modifyDepartment")
		public String modifyDepartment(@RequestParam(value="departmentCode", required = false) String departmentCode
													,Model model) {
			
			Department departmentCodeInfo = companyInfoService.getDepartmentInfoByCode(departmentCode);
			
			List<Department> departmentList = companyInfoService.getDepartmentList();
			
			model.addAttribute("title", "부서 정보 수정");
			model.addAttribute("departmentCodeInfo", departmentCodeInfo);
			model.addAttribute("departmentList", departmentList);
			
			return "company/department/modifyDepartment";
		}
		//사원 수정
		@PostMapping("/modifyEmployee")
		public String modifyEmployee(Employee employee) {
			
			companyInfoService.modifyEmployee(employee);
			
			return "redirect:/employeeList";
		}
		//사원 수정
		@GetMapping("/modifyEmployee")
		public String modifyEmployee(@RequestParam(value="employeeCode", required = false) String employeeCode
													,Model model) {
			
			Employee employeeCodeInfo = companyInfoService.getEmployeeInfoByCode(employeeCode);
			List<Department> departmentList = companyInfoService.getDepartmentList();
			List<Employee> employeeList = companyInfoService.getEmployeeList();
			List<ManagementLevel> managementLevelList = companyInfoService.getManagementLevelList();
			
			model.addAttribute("title", "부서 정보 수정");
			model.addAttribute("employeeCodeInfo", employeeCodeInfo);
			model.addAttribute("managementLevelList", managementLevelList);
			model.addAttribute("employeeList", employeeList);
			model.addAttribute("departmentList", departmentList);
			
			return "company/employee/modifyEmployee";
		}
	//회사관리 수정 관련 맵핑 ------------------ 끝 ------------------------------------------------------------------------------------

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
	// 회사 목록검색 조회
	@PostMapping("/companyList")
	public String getCompanyList(@RequestParam(name="searchKey", defaultValue = "companyNum") String searchKey
								,@RequestParam(name="searchValue", required = false, defaultValue = "") String searchValue
								,Model model){
	  /*<option value="companyInfoName">대표자성명</option>
		<option value="companyName">회사명</option>
		<option value="companyAddr">회사주소</option>
		<option value="companyCate">회사종목</option>
		<option value="companyBirth">설립날짜</option>*/
		/*
		 * if("companyNum".equals(searchKey)) { searchKey = "company_number"; }else
		 * if("companyInfoName".equals(searchKey)) { searchKey = "ci_name"; }else
		 * if("companyName".equals(searchKey)) { searchKey = "company_name"; }else
		 * if("companyAddr".equals(searchKey)) { searchKey = "company_addr"; }else
		 * if("companyCate".equals(searchKey)) { searchKey = "company_cate"; }else {
		 * searchKey = "company_birth"; }
		 */
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("searchKey", searchKey);
		paramMap.put("searchValue", searchValue);
		
		List<CompanyInfo> companyList = companyInfoService.getSearchCompanyList(paramMap);
		
		model.addAttribute("title", "회사목록조회");
		model.addAttribute("companyList", companyList);
		
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
	
	// 사업장 목록검색 조회
	@PostMapping("/workPlaceList")
	public String getWorkPlaceList(@RequestParam(name="searchKey", defaultValue = "companyNumber") String searchKey
								,@RequestParam(name="searchValue", required = false, defaultValue = "") String searchValue
								,Model model){

		if("WpCompanyNumber".equals(searchKey)) {
			searchKey = "wp_company_number";
		}else if("workPlaceName".equals(searchKey)) {
			searchKey = "wp_company_name";
		}else if("workPlaceRepresentative".equals(searchKey)) {
			searchKey = "wp_name";
		}else if("workPlaceAddr".equals(searchKey)) {
			searchKey = "wp_addr";
		}else if("workPlaceCate".equals(searchKey)) {
			searchKey = "wp_cate";
		}else {
			searchKey = "wp_birth";
		}
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("searchKey", searchKey);
		paramMap.put("searchValue", searchValue);
		
		List<WorkPlace> workPlaceList = companyInfoService.getSearchWorkPlaceList(paramMap);
		
		model.addAttribute("title", "사업장목록조회");
		model.addAttribute("workPlaceList", workPlaceList);
		
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
	// 부서 목록검색 조회
		@PostMapping("/departmentList")
		public String getDepartmentList(@RequestParam(name="searchKey", defaultValue = "departmentCode") String searchKey
									,@RequestParam(name="searchValue", required = false, defaultValue = "") String searchValue
									,Model model){

			if("departmentCode".equals(searchKey)) {
				searchKey = "de_code";
			}else if("workPlaceDto.workPlaceName".equals(searchKey)) {
				searchKey = "wp_company_name";
			}else if("departmentName".equals(searchKey)) {
				searchKey = "de_name";
			}else {
				searchKey = "de_date";
			}
			
			Map<String, Object> paramMap = new HashMap<String, Object>();
			paramMap.put("searchKey", searchKey);
			paramMap.put("searchValue", searchValue);
			
			List<Department> departmentList = companyInfoService.getSearchDepartmentList(paramMap);
			
			model.addAttribute("title", "부서목록조회");
			model.addAttribute("departmentList", departmentList);
			
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
	// 사원 목록검색 조회
	@PostMapping("/employeeList")
	public String getEmployeeList(@RequestParam(name="searchKey", defaultValue = "employeeCode") String searchKey
								,@RequestParam(name="searchValue", required = false, defaultValue = "") String searchValue
								,Model model){

		if("employeeCode".equals(searchKey)) {
			searchKey = "e_code";
		}else if("managementLevelDto.eLevelName".equals(searchKey)) {
			searchKey = "e_level";
		}else if("departmentCode".equals(searchKey)) {
			searchKey = "de_code";
		}else if("employeeName".equals(searchKey)) {
			searchKey = "e_name";
		}else if("employeeDate".equals(searchKey)) {
			searchKey = "e_date";
		}else {
			searchKey = "resign_date";
		}
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("searchKey", searchKey);
		paramMap.put("searchValue", searchValue);
		
		List<Employee> employeeList = companyInfoService.getSearchEmployeeList(paramMap);
		
		model.addAttribute("title", "사원목록조회");
		model.addAttribute("employeeList", employeeList);
		
		return "company/employee/employeeList";
	}
	
	// 회사관리 목록조회 관련 맵핑 ----------- 끝 -------------------------------------------------------------------------------------
}
