package ks44team03.common.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks44team03.common.mapper.CustomerQuestionMapper;
import ks44team03.dto.QuestionCenter;

@Service
public class CustomerQuestionService {
	
	//의존성 주입
	private CustomerQuestionMapper customerQuestionMapper;
	
	public CustomerQuestionService(CustomerQuestionMapper customerQuestionMapper) {
		this.customerQuestionMapper = customerQuestionMapper;
		
	}
	
	//1:1문의 게시글 조회
	public QuestionCenter getQuestionRead(String mtmNumCode) {
		
		QuestionCenter QuesionRead =  customerQuestionMapper.getQuestionRead(mtmNumCode);
		
		return QuesionRead;
	}
	
	
		
	//1:1 문의 목록 관리자 조회
	public List<QuestionCenter> getQuestionList(){
		
		List<QuestionCenter> QuestionList = customerQuestionMapper.getQuestionList();
		
		return QuestionList;
		
	}
	

}
