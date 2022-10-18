package ks44team03.dto;

public class Employee {

	private String employeeCode; //사원코드
	private String employeeLevelCode; //권한 코드
	private String departmentCode; //부서코드
	private String employeeName; //사원이름
	private String employeePw; //비밀번호
	private String employeeDate; //입사일	
	private String employeeResignDate; //퇴사일
	
	private ManagementLevel managementLevelDto; //권한 DTO
	private WorkPlace workPlaceDto; // 사업장 DTO
	
	public String getEmployeeCode() {
		return employeeCode;
	}
	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}
	public String getEmployeeLevelCode() {
		return employeeLevelCode;
	}
	public void setEmployeeLevelCode(String employeeLevelCode) {
		this.employeeLevelCode = employeeLevelCode;
	}
	public String getDepartmentCode() {
		return departmentCode;
	}
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeePw() {
		return employeePw;
	}
	public void setEmployeePw(String employeePw) {
		this.employeePw = employeePw;
	}
	public String getEmployeeDate() {
		return employeeDate;
	}
	public void setEmployeeDate(String employeeDate) {
		this.employeeDate = employeeDate;
	}
	public String getEmployeeResignDate() {
		return employeeResignDate;
	}
	public void setEmployeeResignDate(String employeeResignDate) {
		this.employeeResignDate = employeeResignDate;
	}
	public ManagementLevel getManagementLevelDto() {
		return managementLevelDto;
	}
	public void setManagementLevelDto(ManagementLevel managementLevelDto) {
		this.managementLevelDto = managementLevelDto;
	}
	public WorkPlace getWorkPlaceDto() {
		return workPlaceDto;
	}
	public void setWorkPlaceDto(WorkPlace workPlaceDto) {
		this.workPlaceDto = workPlaceDto;
	}
	
	@Override
	public String toString() {
		return "Employee [employeeCode=" + employeeCode + ", employeeLevelCode=" + employeeLevelCode
				+ ", departmentCode=" + departmentCode + ", employeeName=" + employeeName + ", employeePw=" + employeePw
				+ ", employeeDate=" + employeeDate + ", employeeResignDate=" + employeeResignDate
				+ ", managementLevelDto=" + managementLevelDto + ", workPlaceDto=" + workPlaceDto + "]";
	}

	

}
