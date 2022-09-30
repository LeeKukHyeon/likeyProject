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

	
	//회사 등록
	public int addCompany(CompanyInfo companyInfo);
	
	//회사 목록 검색
	public List<CompanyInfo> getSearchCompanyList(Map<String, Object> searchMap);
	
	//회사 목록 조회
	public List<CompanyInfo> getCompanyList();
	
	//사업장 등록
	public int addWorkPlace(WorkPlace workPlace);
	
	//사업장 목록 검색
	public List<WorkPlace> getSearchWorkPlaceList(Map<String, Object> searchMap);
	
	//사업장 목록 조회
	public List<WorkPlace> getWorkPlaceList();
	
	//부서 등록
	public int addDepartment(Department department);
	
	//부서 목록 검색
	public List<Department> getSearchDepartmentList(Map<String, Object> searchMap);
	
	//부서 목록 조회
	public List<Department> getDepartmentList();
	
	//사원 등록
	public int addEmployee(Employee employee);
	
	//사원 목록 검색
	public List<Employee> getSearchEmployeeList(Map<String, Object> searchMap);
	
	//사원 목록 조회
	public List<Employee> getEmployeeList();
	
	//사원 권한목록 조회
	public List<ManagementLevel> getManagementLevelList();
}
