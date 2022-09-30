package ks44team03.common.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks44team03.dto.QuestionCenter;

@Mapper
public interface CustomerQuestionMapper {
	
	//1:1문의 게시글 등록
	public int regQuestion(QuestionCenter questionCenter);
	
	//1:1문의 게시글 조회
	public QuestionCenter getQuestionRead(String mtmNumCode);
	
	//1:1 문의 목록 관리자 조회
	public List<QuestionCenter> getQuestionList();
	
}
