package ks44team03.common.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks44team03.common.mapper.CommonMapper;
import ks44team03.common.mapper.CustomerFaqMapper;
import ks44team03.dto.FaqCenter;

@Service
public class CustomerFaqService {
	
	//의존성 주입
	
	private CustomerFaqMapper customerFaqMapper;
	private CommonMapper commonMapper;
	
	public CustomerFaqService(CustomerFaqMapper customerFaqMapper , CommonMapper commonMapper) {
		this.customerFaqMapper = customerFaqMapper;
		this.commonMapper = commonMapper;
	}
	
	
	public List<FaqCenter> faqList(){
		
		List<FaqCenter> faqList = customerFaqMapper.faqList();
		
		return faqList;
		
	}
}
