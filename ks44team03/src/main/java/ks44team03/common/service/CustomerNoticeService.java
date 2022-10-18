package ks44team03.common.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks44team03.common.mapper.CommonMapper;
import ks44team03.common.mapper.CustomerNoticeMapper;
import ks44team03.dto.NoticeCenter;

@Service
@Transactional
public class CustomerNoticeService {
	
	
	//의존성 주입
	private CustomerNoticeMapper customerNoticeMapper;
	private CommonMapper commonMapper;
	
	public CustomerNoticeService(CustomerNoticeMapper customerNoticeMapper, CommonMapper commonMapper) {
		this.customerNoticeMapper = customerNoticeMapper;
		this.commonMapper = commonMapper;
	}
	
	
	//배송스케줄 조회수 카운트
	public void countView(String noticeNumCode) {
		
		customerNoticeMapper.countView(noticeNumCode);
		
	}
	
	
	//공지사항 검색
	public List<NoticeCenter> noticeSearch(Map<String, Object> paramMap){
		
		List<NoticeCenter> noticeSearch = customerNoticeMapper.noticeSearch(paramMap);
		
		return noticeSearch;
	}
	
	
	//공지사항 삭제
	public void deleteNotice(String noticeNumCode) {
		
		customerNoticeMapper.deleteNotice(noticeNumCode);
		
	}
	
	
	//공지사항 수정
	public void modifyNotice(NoticeCenter noticeCenter) {
		
		customerNoticeMapper.modifyNotice(noticeCenter);
	}
	
	
	// 공지사항 등록
	public void regNotice(NoticeCenter noticeCenter){
	
		String newNoticeCode = commonMapper.getCommonPkNumCode("notice_center", "notice_num");
		noticeCenter.setNoticeNumCode(newNoticeCode);
		
		int result = customerNoticeMapper.regNotice(noticeCenter);
		
	}
	
	// 공지사항 게시물 조회
	public NoticeCenter getNoticeRead(String noticeNumCode) {
		
		NoticeCenter noticeRead = customerNoticeMapper.getNoticeRead(noticeNumCode);
		
		return noticeRead;
	
	}
	

	// 공지사항 게시물 목록 조회
	public List<NoticeCenter> getNoticeList(){
	  
		List<NoticeCenter> noticeList = customerNoticeMapper.getNoticeList();
	  
		return noticeList; }
	
}
