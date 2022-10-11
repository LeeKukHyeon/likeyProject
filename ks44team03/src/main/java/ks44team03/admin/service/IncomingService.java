package ks44team03.admin.service;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks44team03.admin.controller.IncomingController;
import ks44team03.admin.mapper.IncomingMapper;
import ks44team03.common.mapper.CommonMapper;
import ks44team03.dto.GoodsInfo;
import ks44team03.dto.Incoming;
import ks44team03.dto.OrderInfo;

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
	
	
	//오류 입고
	public List<GoodsInfo> errorIncoming(){
		List<GoodsInfo> errorIncoming = incomingMapper.errorIncoming();
		
		return errorIncoming;
	}
	
	//전체 입고
	public List<OrderInfo> arrivedAll(){
		List<OrderInfo> arrivedAll = incomingMapper.arrivedAll();
		
		return arrivedAll;
	}
	
	//일부 입고
	public List<OrderInfo> partialArrival(){
		List<OrderInfo> partialArrival = incomingMapper.partialArrival();
		
		return partialArrival;
	}
	
	//창고 도착
	public List<GoodsInfo> arriveWarehouse(){
		List<GoodsInfo> arriveWarehouse = incomingMapper.arriveWarehouse();
		
		return arriveWarehouse;
	}
	/*
	 * //입고 등록 public void regIncoming(Incoming incoming) {
	 * 
	 * String newIncomingCode = commonMapper.getCommonPkCode("incoming",
	 * "incoming_code"); incoming.setIncomingCode(newIncomingCode);
	 * 
	 * 
	 * log.info("입고 등록 ------- incoming" + incoming); int result =
	 * incomingMapper.regIncoming(incoming);
	 * 
	 * log.info("입고 등록 결과 : " + result); }
	 */
	
	//입고 등록 222222
	public List<GoodsInfo> regIncoming2(){
		List<GoodsInfo> regIncoming2 = incomingMapper.regIncoming2();
		
		log.info("regIncoming2 ::::::" + regIncoming2);
		return regIncoming2;
	}
	
	//특정 상품코드 출력
	public GoodsInfo getIncomingGoodsInfo(String goodsInfoCode) {
		
		GoodsInfo incomingGoodsInfoCode = incomingMapper.getIncomingGoodsInfo(goodsInfoCode);
		
		return incomingGoodsInfoCode;
		
	}
	
	//입고 전 상품목록
	public List<GoodsInfo> incomingGoodsList(String buyOrderCode){
		List<GoodsInfo> incomingGoodsList = incomingMapper.incomingGoodsList(buyOrderCode);
		return incomingGoodsList;
	}
	
	//입고 전 주문목록
	public List<OrderInfo> incomingOrderList(Map<String, Object> paramMap){
		List<OrderInfo> incomingOrderList = incomingMapper.incomingOrderList(paramMap);
		return incomingOrderList;
	}
	
	//입고 현황 조회
	/*
	 * public List<Incoming> incomingCurrentState() {
	 * 
	 * List<Incoming> incomingCurrentState = incomingMapper.incomingCurrentState();
	 * log.info("입고 현황 조회 리스트 ------- incomingList" + incomingCurrentState);
	 * 
	 * return incomingCurrentState; }
	 */
	
	//입고등록 모달 - 특정 상품코드 조회
	public Map<String, Object> incomingGoodsInfoByCode(String goodsInfoCode){
		return incomingMapper.incomingGoodsInfoByCode(goodsInfoCode);
	}
}
