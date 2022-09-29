package ks44team03.dto;

public class Department {

	
	private String departmentCode; //부서코드
	private String deWorkPlaceCode; //사업장코드
	private String deWorkPlaceName; // 사업장 명
	private String departmentName; //부서 명
	private String departmentDate; //부서 적용날짜
	
	private WorkPlace workPlaceDto; // 사업장 DTO

	public String getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	public String getDeWorkPlaceCode() {
		return deWorkPlaceCode;
	}

	public void setDeWorkPlaceCode(String deWorkPlaceCode) {
		this.deWorkPlaceCode = deWorkPlaceCode;
	}

	public String getDeWorkPlaceName() {
		return deWorkPlaceName;
	}

	public void setDeWorkPlaceName(String deWorkPlaceName) {
		this.deWorkPlaceName = deWorkPlaceName;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentDate() {
		return departmentDate;
	}

	public void setDepartmentDate(String departmentDate) {
		this.departmentDate = departmentDate;
	}

	public WorkPlace getWorkPlaceDto() {
		return workPlaceDto;
	}

	public void setWorkPlaceDto(WorkPlace workPlaceDto) {
		this.workPlaceDto = workPlaceDto;
	}

	@Override
	public String toString() {
		return "Department [departmentCode=" + departmentCode + ", deWorkPlaceCode=" + deWorkPlaceCode
				+ ", deWorkPlaceName=" + deWorkPlaceName + ", departmentName=" + departmentName + ", departmentDate="
				+ departmentDate + ", workPlaceDto=" + workPlaceDto + "]";
	}
	
	
	

}
