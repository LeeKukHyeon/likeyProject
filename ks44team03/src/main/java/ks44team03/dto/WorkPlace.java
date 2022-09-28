package ks44team03.dto;

public class WorkPlace {

	private String workPlaceCode; //사업장코드
	private String wpCompanyNumber; //사업자등록번호
	private String workPlaceName; //사업장 명 
	private String workPlaceRepresentative; //대표자성명
	private String workPlaceDelegateNum; //사업장대표자 주민등록번호
	private String workPlaceAddr; //사업장주소
	private String workPlaceCate; //회사종목
	private String workPlaceBirth; //개업날짜
	
	/*
	 * private CompanyInfo companyInfoDto; //회사정보 DTO
	 */
	public String getWorkPlaceCode() {
		return workPlaceCode;
	}

	public void setWorkPlaceCode(String workPlaceCode) {
		this.workPlaceCode = workPlaceCode;
	}

	public String getWpCompanyNumber() {
		return wpCompanyNumber;
	}

	public void setWpCompanyNumber(String wpCompanyNumber) {
		this.wpCompanyNumber = wpCompanyNumber;
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
		return "WorkPlace [workPlaceCode=" + workPlaceCode + ", wpCompanyNumber=" + wpCompanyNumber + ", workPlaceName="
				+ workPlaceName + ", workPlaceRepresentative=" + workPlaceRepresentative + ", workPlaceDelegateNum="
				+ workPlaceDelegateNum + ", workPlaceAddr=" + workPlaceAddr + ", workPlaceCate=" + workPlaceCate
				+ ", workPlaceBirth=" + workPlaceBirth + "]";
	}

	/*
	 * public CompanyInfo getCompanyInfoDto() { return companyInfoDto; }
	 * 
	 * public void setCompanyInfoDto(CompanyInfo companyInfoDto) {
	 * this.companyInfoDto = companyInfoDto; }
	 */

	
	
	
		
}
