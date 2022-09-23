package ks44team03.dto;

public class Workplace {

	private String workplaceCode; //사업장코드
	private String companyNumber; //사업자등록번호
	private String workPlaceName; //사업장 명 
	private String workplaceRepresentative; //대표자성명
	private String workplaceDelegateNum; //사업장대표자 주민등록번호
	private String workplaceAddr; //사업장주소
	private String workplaceCate; //회사종목
	private String workplaceBirth; //개업날짜
	
	
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
