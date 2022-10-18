package ks44team03.common.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ks44team03.dto.NoticeCenter;

@Mapper
public interface CustomerNoticeMapper {
	
	//공지사항 조회수 카운터
	public void countView(String noticeNumCode);
	
	//공지사항 검색
	public List<NoticeCenter> noticeSearch(Map<String, Object> searchMap);
	
	//공지사항 삭제
	public int deleteNotice(String noticeNumCode);
	
	//공지사항 수정
	public int modifyNotice(NoticeCenter noticeCenter);
	
	//공지사항 등록
	public int regNotice(NoticeCenter noticeCenter);
	
	//공지사항 게시물 조회
	public NoticeCenter getNoticeRead(String noticeNumCode);
	
	//공지사항 게시물 목록 조회 
	public List<NoticeCenter> getNoticeList();
	
	
}
