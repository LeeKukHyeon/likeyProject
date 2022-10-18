package ks44team03.dto;

import java.util.List;

public class CompanyInfo {

	private String companyCode; //회사코드
	private String companyNum; //사업자등록번호
	private String companyInfoName; //대표자성명
	private String companyDelegateNum; //대표자주민등록번호
	private String companyAddr; //회사주소
	private String companyCate; //회사종목
	private String companyBirth; //회사설립날짜
	private String companyName; //회사명
	
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
	public String getCompanyInfoName() {
		return companyInfoName;
	}
	public void setCompanyInfoName(String companyInfoName) {
		this.companyInfoName = companyInfoName;
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
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	@Override
	public String toString() {
		return "CompanyInfo [companyCode=" + companyCode + ", companyNum=" + companyNum + ", companyInfoName="
				+ companyInfoName + ", companyDelegateNum=" + companyDelegateNum + ", companyAddr=" + companyAddr
				+ ", companyCate=" + companyCate + ", companyBirth=" + companyBirth + ", companyName=" + companyName
				+ "]";
	}
	
	
	
	
}
