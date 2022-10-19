package ks44team03.admin.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ks44team03.dto.CompanyInfo;
import ks44team03.dto.Department;
import ks44team03.dto.Employee;
import ks44team03.dto.ManagementLevel;
import ks44team03.dto.WorkPlace;

@Mapper
public interface CompanyInfoMapper {

	
	//특정 사원목록 조회
	public Employee adminLogin(String aId);
	
	//회사 등록
	public int addCompany(CompanyInfo companyInfo);
	
	//회사 수정
	public int modifyCompany(CompanyInfo companyCode);
	
	//특정 회사 정보 조회
	public CompanyInfo getCompanyInfoByCode(String companyCode);
	
	//회사등록 사업자등록번호 중복체크
	public boolean companyNumCheck(String companyNum);
	
	//회사 목록 검색
	public List<CompanyInfo> getSearchCompanyList(Map<String, Object> searchMap);
	
	//회사 목록 조회
	public List<CompanyInfo> getCompanyList();
	
	//사업장 등록
	public int addWorkPlace(WorkPlace workPlace);
	
	//사업장 수정
	public int modifyWorkPlace(WorkPlace workPlace);
	
	//특정 사업장 정보 조회
	public WorkPlace getWorkPlaceInfoByCode(String workPlaceCode);
	
	//사업장 목록 검색
	public List<WorkPlace> getSearchWorkPlaceList(Map<String, Object> searchMap);
	
	//사업장 목록 조회
	public List<WorkPlace> getWorkPlaceList();
	
	//부서 등록
	public int addDepartment(Department department);
	
	//특정 부서 정보 조회
	public Department getDepartmentInfoByCode(String departmentCode);
	
	//부서 수정
	public int modifyDepartment(Department department);
	
	//부서 목록 검색
	public List<Department> getSearchDepartmentList(Map<String, Object> searchMap);
	
	//부서 목록 조회
	public List<Department> getDepartmentList();
	
	//사원 등록
	public int addEmployee(Employee employee);
	
	//특정 사원 정보 조회
	public Employee getEmployeeInfoByCode(String employeeCode);

	//사원 수정
	public int modifyEmployee(Employee employee);
	
	//사원 목록 검색
	public List<Employee> getSearchEmployeeList(Map<String, Object> searchMap);
	
	//사원 목록 조회
	public List<Employee> getEmployeeList();
	
	//사원 권한목록 조회
	public List<ManagementLevel> getManagementLevelList();
}
