package ks44team03.common.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks44team03.dto.ScheduleCenter;

@Mapper
public interface CustomerScheduleMapper {

	//배송스케줄 조회수 카운트
	public void countView(String scheduleNumCode);
	
	//배송스케줄 게시물 삭제
	public int deleteSchedule(String scheduleNumCode);
	
	//배송스케줄 게시물 수정
	public int modifySchedule(ScheduleCenter scheduleCenter);
	
	//배송스케줄 게시물 등록
	public int regSchedule(ScheduleCenter scheduleCenter);
	
	//배송스케줄 게시물 조회
	public ScheduleCenter getScheduleRead(String scheduleNumCode);
	
	//배송스케줄 게시물 목록 조회
	public List<ScheduleCenter> getScheduleList();
	
}
