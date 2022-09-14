package ks44team03.dto;

public class CompanyInfo {

	private String companyCode;
	private String companyNum;
	private String companyName;
	private String companyDelegateNum;
	private String companyAddr;
	private String companyCate;
	private String companyBirth;
	private String companyInfoName;
	
	
	public String getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	public String getCompanyNum() {
		return companyNum;
	}
	public void setCompanyNum(String companyNum) {
		this.companyNum = companyNum;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyDelegateNum() {
		return companyDelegateNum;
	}
	public void setCompanyDelegateNum(String companyDelegateNum) {
		this.companyDelegateNum = companyDelegateNum;
	}
	public String getCompanyAddr() {
		return companyAddr;
	}
	public void setCompanyAddr(String companyAddr) {
		this.companyAddr = companyAddr;
	}
	public String getCompanyCate() {
		return companyCate;
	}
	public void setCompanyCate(String companyCate) {
		this.companyCate = companyCate;
	}
	public String getCompanyBirth() {
		return companyBirth;
	}
	public void setCompanyBirth(String companyBirth) {
		this.companyBirth = companyBirth;
	}
	public String getCompanyInfoName() {
		return companyInfoName;
	}
	public void setCompanyInfoName(String companyInfoName) {
		this.companyInfoName = companyInfoName;
	}
	
	@Override
	public String toString() {
		return "CompanyInfo [companyCode=" + companyCode + ", companyNum=" + companyNum + ", companyName=" + companyName
				+ ", companyDelegateNum=" + companyDelegateNum + ", companyAddr=" + companyAddr + ", companyCate="
				+ companyCate + ", companyBirth=" + companyBirth + ", companyInfoName=" + companyInfoName + "]";
	}
	
}
