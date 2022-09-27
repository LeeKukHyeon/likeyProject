package ks44team03.dto;

public class WorkPlace {

	private String workPlaceCode; //사업장코드
	private String companyNumber; //사업자등록번호
	private String workPlaceName; //사업장 명 
	private String workPlaceRepresentative; //대표자성명
	private String workPlaceDelegateNum; //사업장대표자 주민등록번호
	private String workPlaceAddr; //사업장주소
	private String workPlaceCate; //회사종목
	private String workPlaceBirth; //개업날짜
	
	public String getWorkPlaceCode() {
		return workPlaceCode;
	}
	public void setWorkPlaceCode(String workPlaceCode) {
		this.workPlaceCode = workPlaceCode;
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
	public String getWorkPlaceRepresentative() {
		return workPlaceRepresentative;
	}
	public void setWorkPlaceRepresentative(String workPlaceRepresentative) {
		this.workPlaceRepresentative = workPlaceRepresentative;
	}
	public String getWorkPlaceDelegateNum() {
		return workPlaceDelegateNum;
	}
	public void setWorkPlaceDelegateNum(String workPlaceDelegateNum) {
		this.workPlaceDelegateNum = workPlaceDelegateNum;
	}
	public String getWorkPlaceAddr() {
		return workPlaceAddr;
	}
	public void setWorkPlaceAddr(String workPlaceAddr) {
		this.workPlaceAddr = workPlaceAddr;
	}
	public String getWorkPlaceCate() {
		return workPlaceCate;
	}
	public void setWorkPlaceCate(String workPlaceCate) {
		this.workPlaceCate = workPlaceCate;
	}
	public String getWorkPlaceBirth() {
		return workPlaceBirth;
	}
	public void setWorkPlaceBirth(String workPlaceBirth) {
		this.workPlaceBirth = workPlaceBirth;
	}
	
	@Override
	public String toString() {
		return "WorkPlace [workPlaceCode=" + workPlaceCode + ", companyNumber=" + companyNumber + ", workPlaceName="
				+ workPlaceName + ", workPlaceRepresentative=" + workPlaceRepresentative + ", workPlaceDelegateNum="
				+ workPlaceDelegateNum + ", workPlaceAddr=" + workPlaceAddr + ", workPlaceCate=" + workPlaceCate
				+ ", workPlaceBirth=" + workPlaceBirth + "]";
	}
		
}
