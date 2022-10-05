package ks44team03.common.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks44team03.dto.QuestionCenter;

@Mapper
public interface CustomerQuestionMapper {
	
	//1:1문의 답변 등록
	public int regAnswer(QuestionCenter questionCenter);
	
	//관리자페이지에서 문의 클릭시 처리상태 처리중으로 변경
	public int changeSituation(QuestionCenter questionCenter);
	
	//1:1문의 수정
	public int myQuestionModify(QuestionCenter questionCenter);
	
	//1:1문의 게시글 등록
	public int regQuestion(QuestionCenter questionCenter);
	
	//1:1문의 게시글 조회, 나의 문의 게시글 보기
	public QuestionCenter getQuestionRead(String mtmNumCode);
	
	//1:1 문의 목록 관리자 조회,나의문의내역
	public List<QuestionCenter> getQuestionList();
	
}
