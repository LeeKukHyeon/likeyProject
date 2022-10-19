package ks44team03.common.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ks44team03.dto.QuestionCenter;
import ks44team03.dto.UserInfo;

@Mapper
public interface CustomerQuestionMapper {
	
	//내문의내역 페이지 내용 검색
	public List<QuestionCenter> myQuestionSearch(Map<String, Object> searchMap);
	
	//ass 테스트
	public List<UserInfo> memberInfo();
	
	//1:1문의 검색
	public List<QuestionCenter> searchQuestion(Map<String, Object> searchMap);
	
	//1:1문의 삭제
	public int deleteQuestion(String mtmNumCode);
	
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
