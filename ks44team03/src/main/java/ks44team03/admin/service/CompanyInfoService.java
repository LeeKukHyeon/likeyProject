package ks44team03.admin.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks44team03.admin.mapper.CompanyInfoMapper;
import ks44team03.dto.CompanyInfo;

@Service
@Transactional
public class CompanyInfoService {

	//의존성 주입
	private CompanyInfoMapper companyInfoMapper;
	
	public CompanyInfoService(CompanyInfoMapper companyInfoMapper) {
		this.companyInfoMapper = companyInfoMapper;
	}
	
	@PostConstruct
	public void companyInfoService() {
		System.out.println("companyInfoService bean 생성");
	}
	
	public void addCompany (CompanyInfo companyInfo) {
		
		System.out.println("companyInfo 입니다---------"+ companyInfo);
		int result = companyInfoMapper.addCompany(companyInfo);
		
		System.out.println("회사 등록 결과 : " + result);
	}
	
	 public List<CompanyInfo> getCompanyList(){
	  
	 List<CompanyInfo> companyList = companyInfoMapper.getCompanyList();
	 
	 return companyList; 
	 
	 }
	 
}
