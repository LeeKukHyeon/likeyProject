package ks44team03.dto;

public class Employee {

	private String employeeCode; //사원코드
	private String employeeLevel; //권한코드
	private String departmentCode; //부서코드
	private String employeeName; //사원이름
	private String employeePw; //비밀번호
	private String employeeDate; //입사일	
	private String employeeResignDate; //퇴사일
	
	
	public String getEmployeeCode() {
		return employeeCode;
	}
	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}
	public String getEmployeeLevel() {
		return employeeLevel;
	}
	public void setEmployeeLevel(String employeeLevel) {
		this.employeeLevel = employeeLevel;
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
	
	@Override
	public String toString() {
		return "Employee [employeeCode=" + employeeCode + ", employeeLevel=" + employeeLevel + ", departmentCode="
				+ departmentCode + ", employeeName=" + employeeName + ", employeePw=" + employeePw + ", employeeDate="
				+ employeeDate + ", employeeResignDate=" + employeeResignDate + "]";
	}

}
