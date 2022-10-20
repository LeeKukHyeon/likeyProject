package ks44team03.common.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import ks44team03.common.mapper.CommonMapper;
import ks44team03.common.mapper.CustomerQuestionMapper;
import ks44team03.dto.QuestionCenter;
import ks44team03.dto.UserInfo;

@Service
public class CustomerQuestionService {
	
	//의존성 주입
	private CustomerQuestionMapper customerQuestionMapper;
	private CommonMapper commonMapper;
	
	public CustomerQuestionService(CustomerQuestionMapper customerQuestionMapper , CommonMapper commonMapper) {
		this.customerQuestionMapper = customerQuestionMapper;
		this.commonMapper = commonMapper;
	}
	
	//내문의내역 페이지 내용 검색
	public List<QuestionCenter> myQuestionSearch(Map<String, Object> paramMap){
		
		List<QuestionCenter> myQuestionList = customerQuestionMapper.myQuestionSearch(paramMap);
		
		return myQuestionList;
	}
	
	//1:1문의 검색
	public List<QuestionCenter> searchQuestion(Map<String, Object> paramMap){
		
		List<QuestionCenter> searchQuestion = customerQuestionMapper.searchQuestion(paramMap);
		
		return searchQuestion;
	}
	
	//1:1문의 삭제
	public int deleteQuestion(String mtmNumCode) {
		
		int result = customerQuestionMapper.deleteQuestion(mtmNumCode);
		
		return result;
	}
	
	//관리자 답변 등록
	public void regAnswer(QuestionCenter questionCenter) {
	
	customerQuestionMapper.regAnswer(questionCenter);

	}
		
	//관리자페이지에서 문의 클릭시 처리상태 처리중으로 변경
	public void changeSituation(QuestionCenter questionCenter) {
		
	customerQuestionMapper.changeSituation(questionCenter);
		
	}
	
	//1:1문의 수정
	public void myQuestionModify(QuestionCenter questionCenter) {
		
		customerQuestionMapper.myQuestionModify(questionCenter);
	}
	
	
	// 1:1문의 등록
	public void regQuestion(QuestionCenter questionCenter) {

		String newQuestionCode = commonMapper.getCommonPkNumCode("question_center", "mtm_num_code");
		questionCenter.setMtmNumCode(newQuestionCode);
		
		int result = customerQuestionMapper.regQuestion(questionCenter);
	}
	
	//1:1문의 게시글 조회,나의 문의 게시글 보기
	public QuestionCenter getQuestionRead(String mtmNumCode) {
		
		QuestionCenter QuestionRead =  customerQuestionMapper.getQuestionRead(mtmNumCode);
		
		return QuestionRead;
	}
	
		
	//1:1 문의 목록 관리자 조회,나의문의내역
	public List<QuestionCenter> getQuestionList(){
		
		List<QuestionCenter> QuestionList = customerQuestionMapper.getQuestionList();
		
		return QuestionList;
		
	}
}
