package ks44team03.admin.mapper;

import org.apache.ibatis.annotations.Mapper;

import ks44team03.dto.CompanyInfo;

@Mapper
public interface CompanyInfoMapper {

	
	//회사 등록
	public int addCompany(CompanyInfo companyInfo);
}
