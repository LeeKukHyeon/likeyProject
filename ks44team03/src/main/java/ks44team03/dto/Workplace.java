package ks44team03.dto;

public class Workplace {

	private String workplaceCode;
	private String companyNumber;
	private String workPlaceName;
	// 대표자 성명 workplaceRepresentative
	private String workplaceRepresentative;
	private String workplaceDelegateNum;
	private String workplaceAddr;
	private String workplaceCate;
	private String workplaceBirth;
	
	
	public String getWorkplaceCode() {
		return workplaceCode;
	}
	public void setWorkplaceCode(String workplaceCode) {
		this.workplaceCode = workplaceCode;
	}
	public String getCompanyNumber() {
		return companyNumber;
	}
	public void setCompanyNumber(String companyNumber) {
		this.companyNumber = companyNumber;
	}
	public String getWorkPlaceName() {
		return workPlaceName;
	}
	public void setWorkPlaceName(String workPlaceName) {
		this.workPlaceName = workPlaceName;
	}
	public String getWorkplaceRepresentative() {
		return workplaceRepresentative;
	}
	public void setWorkplaceRepresentative(String workplaceRepresentative) {
		this.workplaceRepresentative = workplaceRepresentative;
	}
	public String getWorkplaceDelegateNum() {
		return workplaceDelegateNum;
	}
	public void setWorkplaceDelegateNum(String workplaceDelegateNum) {
		this.workplaceDelegateNum = workplaceDelegateNum;
	}
	public String getWorkplaceAddr() {
		return workplaceAddr;
	}
	public void setWorkplaceAddr(String workplaceAddr) {
		this.workplaceAddr = workplaceAddr;
	}
	public String getWorkplaceCate() {
		return workplaceCate;
	}
	public void setWorkplaceCate(String workplaceCate) {
		this.workplaceCate = workplaceCate;
	}
	public String getWorkplaceBirth() {
		return workplaceBirth;
	}
	public void setWorkplaceBirth(String workplaceBirth) {
		this.workplaceBirth = workplaceBirth;
	}
	
	@Override
	public String toString() {
		return "workPlace [workplaceCode=" + workplaceCode + ", companyNumber=" + companyNumber + ", workPlaceName="
				+ workPlaceName + ", workplaceRepresentative=" + workplaceRepresentative + ", workplaceDelegateNum="
				+ workplaceDelegateNum + ", workplaceAddr=" + workplaceAddr + ", workplaceCate=" + workplaceCate
				+ ", workplaceBirth=" + workplaceBirth + "]";
	}
	
	
}
