package ks44team03.common.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks44team03.dto.CsNotice;

@Mapper
public interface CustomerNoticeMapper {
	
	
	//게시물 등록
	public String regNotice(CsNotice csNotice);

	
	//게시물 목록 조회 
	public List<CsNotice> getCsNoticeList();

	
}
