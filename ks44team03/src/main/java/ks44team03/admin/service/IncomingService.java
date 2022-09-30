package ks44team03.admin.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks44team03.admin.controller.IncomingController;
import ks44team03.admin.mapper.IncomingMapper;
import ks44team03.common.mapper.CommonMapper;
import ks44team03.dto.Incoming;

@Service
@Transactional
public class IncomingService {

	private static final Logger log = LoggerFactory.getLogger(IncomingController.class);
	//의존성 주입
	private final IncomingMapper incomingMapper;
	private final CommonMapper commonMapper;
	
	public IncomingService(IncomingMapper incomingMapper, CommonMapper commonMapper) {
		this.incomingMapper = incomingMapper;
		this.commonMapper = commonMapper;
	}
	
	//입고 등록
	public void regIncoming(Incoming incoming) {

		String newIncomingCode = commonMapper.getCommonPkCode("incoming", "incoming_code");
		incoming.setIncomingCode(newIncomingCode);
		
		log.info("입고 등록 ------- incoming" + incoming);
		int result = incomingMapper.regIncoming(incoming);
		
		log.info("입고 등록 결과 : " + result);
	}
	
	//입고 현황 조회
	public List<Incoming> incomingCurrentState() {

		List<Incoming> incomingCurrentState = incomingMapper.incomingCurrentState();
		log.info("입고 현황 조회 리스트 ------- incomingList" + incomingCurrentState);

		return incomingCurrentState;
	}
	
	
}
