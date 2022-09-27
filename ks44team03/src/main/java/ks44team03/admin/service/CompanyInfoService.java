package ks44team03.admin.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks44team03.admin.controller.CompanyInfoController;
import ks44team03.admin.mapper.CompanyInfoMapper;
import ks44team03.common.mapper.CommonMapper;
import ks44team03.dto.CompanyInfo;

@Service
@Transactional
public class CompanyInfoService {

	private static final Logger log = LoggerFactory.getLogger(CompanyInfoController.class);
	//의존성 주입
	private final CompanyInfoMapper companyInfoMapper;
	private final CommonMapper commonMapper;
	
	public CompanyInfoService(CompanyInfoMapper companyInfoMapper, CommonMapper commonMapper) {
		this.companyInfoMapper = companyInfoMapper;
		this.commonMapper = commonMapper;
	}
	
	@PostConstruct
	public void companyInfoService() {
		System.out.println("companyInfoService bean 생성");
	}
	
	public void addCompany (CompanyInfo companyInfo) {
		String newCompanyCode = commonMapper.getCommonPkCode("company_info", "ci_code");
		companyInfo.setCompanyCode(newCompanyCode);
		
		log.info("companyInfo 입니다---------"+ companyInfo);
		
		int result = companyInfoMapper.addCompany(companyInfo);
		
		log.info("회사 등록 결과 : " + result);
	}
	// 회사 목록 조회
	 public List<CompanyInfo> getCompanyList(){
	  
	 List<CompanyInfo> companyList = companyInfoMapper.getCompanyList();
	 
	 log.info("companyList 리스트~~~~~~~~~~"+ companyList);
	 return companyList; 
	 
	 }
	 
}
