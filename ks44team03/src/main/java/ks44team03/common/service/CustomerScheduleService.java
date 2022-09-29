package ks44team03.common.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks44team03.common.mapper.CustomerScheduleMapper;
import ks44team03.dto.ScheduleCenter;

@Service
@Transactional
public class CustomerScheduleService {

	//의존성 주입
	private CustomerScheduleMapper customerScheduleMapper;
	
	public CustomerScheduleService (CustomerScheduleMapper customerScheduleMaper) {
		this.customerScheduleMapper = customerScheduleMaper;
	}
	
	//배송스케줄 게시물 조회
	public ScheduleCenter getScheduleRead(int scheduleNumCode) {
		
		ScheduleCenter scheduleRead = customerScheduleMapper.getScheduleRead(scheduleNumCode);
		
		return scheduleRead;
	}
	
	
	// 배송스케줄 게시물 목록 조회
	public List<ScheduleCenter> getScheduleList(){
	
		List<ScheduleCenter> ScheduleList = customerScheduleMapper.getScheduleList();
	
		return 	ScheduleList;
	}
	
}
