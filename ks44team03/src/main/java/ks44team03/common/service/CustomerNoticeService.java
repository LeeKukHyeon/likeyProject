package ks44team03.common.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks44team03.common.mapper.CustomerNoticeMapper;
import ks44team03.dto.CsNotice;

@Service
@Transactional
public class CustomerNoticeService {
	
	//의존성 주입
	private CustomerNoticeMapper customerNoticeMapper;
	
	public CustomerNoticeService(CustomerNoticeMapper customerNoticeMapper) {
		this.customerNoticeMapper = customerNoticeMapper;
	}
	
	public void regNotice(CsNotice csNotice){
	
		String result = customerNoticeMapper.regNotice(csNotice);
		
		System.out.println(result);
	 
	}
	
}
