package ks44team03.dto;

public class Department {

	
	private String departmentCode; //부서코드
	private String departmentName; //부서 명
	private String workplaceCode; //사업장코드
	private String departmentDate; //부서 적용날짜
	
	
	public String getDepartmentCode() {
		return departmentCode;
	}
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getWorkplaceCode() {
		return workplaceCode;
	}
	public void setWorkplaceCode(String workplaceCode) {
		this.workplaceCode = workplaceCode;
	}
	public String getDepartmentDate() {
		return departmentDate;
	}
	public void setDepartmentDate(String departmentDate) {
		this.departmentDate = departmentDate;
	}
	
	@Override
	public String toString() {
		return "Department [departmentCode=" + departmentCode + ", departmentName=" + departmentName
				+ ", workplaceCode=" + workplaceCode + ", departmentDate=" + departmentDate + "]";
	}
	
}
