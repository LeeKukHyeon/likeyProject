package ks44team03.common.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks44team03.common.mapper.CustomerNoticeMapper;
import ks44team03.dto.NoticeCenter;

@Service
@Transactional
public class CustomerNoticeService {
	
	//의존성 주입
	private CustomerNoticeMapper customerNoticeMapper;
	
	public CustomerNoticeService(CustomerNoticeMapper customerNoticeMapper) {
		this.customerNoticeMapper = customerNoticeMapper;
	}
	
	// 공지사항 등록
	public void regNotice(NoticeCenter csNotice){
	
		String result = customerNoticeMapper.regNotice(csNotice);
	
		System.out.println(result);
		
	}
	
	// 공지사항 게시물 조회
	public NoticeCenter getNoticeCenterRead(String noticeNumCode) {
		
		NoticeCenter noticeCenter = customerNoticeMapper.getNoticeCenterRead(noticeNumCode);
		
		return noticeCenter;
		
	}
	

	// 공지사항 게시물 목록 조회
	public List<NoticeCenter> getNoticeCenterList(){
	  
		List<NoticeCenter> noticeList = customerNoticeMapper.getNoticeCenterList();
	  
		return noticeList; }
	
}
