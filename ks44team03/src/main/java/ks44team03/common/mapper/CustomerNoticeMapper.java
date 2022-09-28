package ks44team03.common.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks44team03.dto.NoticeCenter;

@Mapper
public interface CustomerNoticeMapper {
	
	
	//공지사항 등록
	public String regNotice(NoticeCenter csNotice);
	
	//공지사항 게시물 조회
	public NoticeCenter getNoticeRead(String noticeTitle);
	
	//공지사항 게시물 목록 조회 
	public List<NoticeCenter> getNoticeCenterList();
	
	
}
