package ks44team03.common.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks44team03.dto.FaqCenter;

@Mapper
public interface CustomerFaqMapper {

	//자주하는 질문 게시물 목록 조회
	public List<FaqCenter> faqList();
	
}
