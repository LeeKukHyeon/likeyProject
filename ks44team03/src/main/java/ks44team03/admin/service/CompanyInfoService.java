package ks44team03.admin.service;

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
	
	public void addCompany (CompanyInfo companyInfo) {
		
		int result = companyInfoMapper.addCompany(companyInfo);
		
		System.out.println("회사 등록 결과 : " + result);
		
	}
}
