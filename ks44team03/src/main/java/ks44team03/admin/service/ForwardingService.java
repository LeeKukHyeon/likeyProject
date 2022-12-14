package ks44team03.admin.service;
 
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks44team03.admin.controller.ForwardingController;
import ks44team03.admin.mapper.ForwardingMapper;
import ks44team03.common.mapper.CommonMapper;
import ks44team03.dto.IncomingInfo;

@Service
@Transactional
public class ForwardingService {

	private static final Logger log = LoggerFactory.getLogger(ForwardingController.class);
	//의존성 주입
	private final ForwardingMapper forwardingMapper;
	private final CommonMapper commonMapper;

	public ForwardingService(ForwardingMapper forwardingMapper, CommonMapper commonMapper) {
		this.forwardingMapper = forwardingMapper;
		this.commonMapper = commonMapper;
	}

	//출고 등록 대기 목록
	public List<IncomingInfo> regForwardingList(){
		List<IncomingInfo> regForwardingList = forwardingMapper.regForwardingList();

		return regForwardingList;
	}
	
	//출고 등록
	public int regForwarding(IncomingInfo incominginfo, String goodsInfoCode) {
		forwardingMapper.updateForwarding(goodsInfoCode);
		
		int result = forwardingMapper.regForwarding(incominginfo);
		
		return result;
	}
  
	//출고등록 모달 - 특정 상품코드 조회
	public Map<String, Object> forwardingGoodsInfoByCode(String goodsInfoCode){
		return forwardingMapper.forwardingGoodsInfoByCode(goodsInfoCode);
	}
	
	//출고완료 상품목록
		public List<IncomingInfo> forwardingList(){
			List<IncomingInfo> forwardingList = forwardingMapper.forwardingList();
			
			return forwardingList;
		}
  
 }
 