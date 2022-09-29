package ks44team03.common.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks44team03.dto.ScheduleCenter;

@Mapper
public interface CustomerScheduleMapper {

	//배송스케줄 게시물 등록
	public int regSchedule(ScheduleCenter scheduleCenter);
	
	//배송스케줄 게시물 조회
	public ScheduleCenter getScheduleRead(int scheduleNumCode);
	
	//배송스케줄 게시물 목록 조회
	public List<ScheduleCenter> getScheduleList();
	
}
