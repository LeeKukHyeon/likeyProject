package ks44team03.dto;

public class Department {

	
	private String departmentCode;
	private String departmentName;
	private String workplaceCode;
	private String departmentDate;
	
	
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
