package ks44team03.common.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks44team03.common.controller.CustomerScheduleController;
import ks44team03.common.mapper.CommonMapper;
import ks44team03.common.mapper.CustomerScheduleMapper;
import ks44team03.dto.ScheduleCenter;

@Service
@Transactional
public class CustomerScheduleService {

	
	private static final Logger log = LoggerFactory.getLogger(CustomerScheduleController.class);
	
	//의존성 주입
	private CustomerScheduleMapper customerScheduleMapper;
	private CommonMapper commonMapper;
	
	public CustomerScheduleService (CustomerScheduleMapper customerScheduleMaper , CommonMapper commonMapper) {
		this.customerScheduleMapper = customerScheduleMaper;
		this.commonMapper = commonMapper;
	}
	
	
	//배송스케줄 게시물 삭제
	public int deleteSchedule(String scheduleNumCode) {
		customerScheduleMapper.deleteSchedule(scheduleNumCode);
			
		int resultRemove = 0;
		
		resultRemove += customerScheduleMapper.deleteSchedule(scheduleNumCode);

		return resultRemove;
		
	}
	
	
	//배송스케줄 게시물 수정
	public void modifySchedule(ScheduleCenter scheduleCenter) {
		customerScheduleMapper.modifySchedule(scheduleCenter);
	}
	
	//배송스케줄 게시물 등록
	public void regSchedule(ScheduleCenter scheduleCenter) {
		
		String newScheduleCode = commonMapper.getCommonPkNumCode("delivery_schedule", "schedule_num");
		scheduleCenter.setScheduleNumCode(newScheduleCode);
		log.info(scheduleCenter + "::::::: 배송스케줄 추가 scheduleCenter");
		
		int result = customerScheduleMapper.regSchedule(scheduleCenter);
		
		log.info(result  + "::::::: 배송스케줄 추가 result");
	}	
		
	
	
	//배송스케줄 게시물 조회
	public ScheduleCenter getScheduleRead(String scheduleNumCode) {
		
		ScheduleCenter scheduleCenter = customerScheduleMapper.getScheduleRead(scheduleNumCode);
		
		return scheduleCenter;
	}
	
	
	// 배송스케줄 게시물 목록 조회
	public List<ScheduleCenter> getScheduleList(){
	
		List<ScheduleCenter> ScheduleList = customerScheduleMapper.getScheduleList();
	
		return 	ScheduleList;
	}
	
}
