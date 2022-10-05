package ks44team03.admin.service;

import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks44team03.admin.controller.CompanyInfoController;
import ks44team03.admin.mapper.CompanyInfoMapper;
import ks44team03.common.mapper.CommonMapper;
import ks44team03.dto.CompanyInfo;
import ks44team03.dto.Department;
import ks44team03.dto.Employee;
import ks44team03.dto.ManagementLevel;
import ks44team03.dto.WorkPlace;

@Service
@Transactional
public class CompanyInfoService {

	private static final Logger log = LoggerFactory.getLogger(CompanyInfoController.class);
	//의존성 주입
	private final CompanyInfoMapper companyInfoMapper;
	private final CommonMapper commonMapper;
	
	public CompanyInfoService(CompanyInfoMapper companyInfoMapper, CommonMapper commonMapper) {
		this.companyInfoMapper = companyInfoMapper;
		this.commonMapper = commonMapper;
	}
	
	@PostConstruct
	public void companyInfoService() {
		System.out.println("companyInfoService bean 생성");
	}
	// 회사등록 사업자등록번호 중복검사
	public boolean companyNumCheck(String companyNum) {
		boolean result = companyInfoMapper.companyNumCheck(companyNum);
		
		log.info("companyNum 중복체크 : " + result);
		return result;
	}
	
	// 회사 등록
	public void addCompany(CompanyInfo companyInfo) {
		String newCompanyCode = commonMapper.getCommonPkCode("company_info", "ci_code");
		companyInfo.setCompanyCode(newCompanyCode);
		
		log.info("companyInfo 입니다---------"+ companyInfo);
		int result = companyInfoMapper.addCompany(companyInfo);
		
		log.info("회사 등록 결과 : " + result);
	}
	// 회사 목록 검색
	public List<CompanyInfo> getSearchCompanyList(Map<String, Object> paramMap){
		List<CompanyInfo> companyList = companyInfoMapper.getSearchCompanyList(paramMap);
		return companyList;
	}
	// 회사 목록 조회
	public List<CompanyInfo> getCompanyList(){
	  
		List<CompanyInfo> companyList = companyInfoMapper.getCompanyList();
	 	log.info("companyList 리스트~~~~~~~~~~"+ companyList);
	 	return companyList;
	 }
	// 사업장 등록
	public void addWorkPlace(WorkPlace workPlace) {
		String newWorkPlaceCode = commonMapper.getCommonPkCode("work_place", "wp_code");
		workPlace.setWorkPlaceCode(newWorkPlaceCode);
		
		log.info("workPlace 입니다-----------"+ workPlace);
		int result = companyInfoMapper.addWorkPlace(workPlace);
		
		log.info("사업장 등록 결과 : " + result);
	}
	
	// 사업장 수정
	public void modifyWorkPlace(WorkPlace workPlace) {
		companyInfoMapper.modifyWorkPlace(workPlace);
	}
	// 특정사업장 목록 조회
	public WorkPlace getWorkPlaceInfoByCode(String workPlaceCode) {
		
		WorkPlace workPlace = companyInfoMapper.getWorkPlaceInfoByCode(workPlaceCode);
		
		return workPlace;
	}
	
	// 사업장 목록 검색
		public List<WorkPlace> getSearchWorkPlaceList(Map<String, Object> paramMap){
			List<WorkPlace> workPlaceList = companyInfoMapper.getSearchWorkPlaceList(paramMap);
			return workPlaceList;
		}
	// 사업장 목록 조회
	public List<WorkPlace> getWorkPlaceList(){
		
		List<WorkPlace> workPlaceList = companyInfoMapper.getWorkPlaceList();
		log.info("workPlaceList 리스트~~~~~~~~~~"+ workPlaceList);
		
		return workPlaceList;
	}
	
// -------------------------------- 부서관련 Service 처음 -------------------------------------------------------	
	// 부서 등록
	public void addDepartment(Department department) {
		String newDepartmentCode = commonMapper.getCommonPkCode("department", "de_code");
		department.setDepartmentCode(newDepartmentCode);
		
		log.info("department 입니다 ----------------" + department);
		int result = companyInfoMapper.addDepartment(department);
		
		log.info("부서 등록 결과 : " + result);
	}
	
	// 부서 수정
	public void modifyDepartment(Department department) {
		companyInfoMapper.modifyDepartment(department);
	}
	// 특정부서 목록 조회
	public Department getDepartmentInfoByCode(String departmentCode) {
		
		Department department = companyInfoMapper.getDepartmentInfoByCode(departmentCode);
		
		return department;
	}
	
	// 부서 목록 검색
	public List<Department> getSearchDepartmentList(Map<String, Object> paramMap){
		List<Department> departmentList = companyInfoMapper.getSearchDepartmentList(paramMap);
		return departmentList;
	}
	// 부서 목록 조회
	public List<Department> getDepartmentList(){
		
		List<Department> departmentList = companyInfoMapper.getDepartmentList();
		log.info("departmentList 리스트~~~~~~~~~~~~" + departmentList);
		
		return departmentList;
	}	
// -------------------------------- 부서관련 Service 끝 -------------------------------------------------------	
	
// -------------------------------- 사원관련 Service 처음 -------------------------------------------------------
	// 사원 등록
	public void addEmployee(Employee employee) {
		String newEmployeeCode = commonMapper.getCommonPkCode("employee_info", "e_code");
		employee.setEmployeeCode(newEmployeeCode);
		
		log.info("employee 입니다 ------------------" + employee);
		int result = companyInfoMapper.addEmployee(employee);
		
		log.info("사원 등록 결과 : " + result);
	}
	// 사원 수정
	public void modifyEmployee(Employee employee) {
		companyInfoMapper.modifyEmployee(employee);
		
		log.info("사원 정보 수정~~!@!~@!~"+ employee);
	}
	// 특정사원 목록 조회
	public Employee getEmployeeInfoByCode(String employeeCode) {
		
		Employee employee = companyInfoMapper.getEmployeeInfoByCode(employeeCode);
		
		log.info("특정 사원목록 :::::" + employee);
		
		return employee;
	}
	// 사원 목록 검색
	public List<Employee> getSearchEmployeeList(Map<String, Object> paramMap){
		List<Employee> employeeList = companyInfoMapper.getSearchEmployeeList(paramMap);
		return employeeList;
	}
	// 사원 목록 조회
	public List<Employee> getEmployeeList(){
		
		List<Employee> employeeList = companyInfoMapper.getEmployeeList();
		log.info("employeeList 리스트~~~~~~~~~~~~" + employeeList);
		
		return employeeList;
	}
	// 사원 권한목록 조회
	public List<ManagementLevel> getManagementLevelList(){
		
		List<ManagementLevel> managementLevelList = companyInfoMapper.getManagementLevelList();
		log.info("managementLevelList 리스트~~~~~~~~~~~~" + managementLevelList);
		
		return managementLevelList;
	}
// -------------------------------- 사원관련 Service 끝 -------------------------------------------------------
}
