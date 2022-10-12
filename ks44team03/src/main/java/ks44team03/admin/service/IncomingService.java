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
	
	//ajax로 상품도착등록 업데이트
	public int incomingGoodsDetailRegister(String goodsInfoCode) {
		int incomingGoodsDetailRegister = incomingMapper.incomingGoodsDetailRegister(goodsInfoCode);
		
		return incomingGoodsDetailRegister;
	}
	
	//ajax호출
	public List<GoodsInfo> goodsDetail(String code){
		List<GoodsInfo> goodsDetail = incomingMapper.goodsDetail(code);
		return goodsDetail;
	}
	
	//배송완료 상품목록 조회
	public List<GoodsInfo> storageCharge(Map<String, Object> paramMap){
		List<GoodsInfo> storageCharge = incomingMapper.storageCharge(paramMap);
		
		return storageCharge;
	}
	
	//배송완료 상품목록 조회
	public List<GoodsInfo> deliveryComplete(Map<String, Object> paramMap){
		List<GoodsInfo> deliveryComplete = incomingMapper.deliveryComplete(paramMap);
		
		return deliveryComplete;
	}
	
	//배송중인 상품목록 조회
	public List<GoodsInfo> inTransit(Map<String, Object> paramMap){
		List<GoodsInfo> inTransit = incomingMapper.inTransit(paramMap);
		
		return inTransit;
	}
	
	//상품도착등록
	public int regGoodsIncoming(String check){
		int regGoodsIncoming = incomingMapper.regGoodsIncoming(check);
		
		return regGoodsIncoming;
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
	
	//입고 등록
	public void regIncoming(Incoming incoming) {
		
		String newIncomingCode = commonMapper.getCommonPkCode("incoming", "incoming_code");
		incoming.setIncomingCode(newIncomingCode);
		
		
		log.info("입고 등록 ------- incoming" + incoming);
		int result = incomingMapper.regIncoming(incoming);
		
		log.info("입고 등록 결과 : " + result);
	}
	
	//입고 전 상품목록 숫자
	public int getListPaging(String buyOrderCode){
		int getListPaging = incomingMapper.getListPaging(buyOrderCode);
		return getListPaging;
	}
	
	//입고 전 상품목록
	public List<GoodsInfo> incomingGoodsList(Map<String, Object> paramMap){
		List<GoodsInfo> incomingGoodsList = incomingMapper.incomingGoodsList(paramMap);
		return incomingGoodsList;
	}
	
	//입고 전 주문목록
	public List<OrderInfo> incomingOrderList(Map<String, Object> paramMap){
		List<OrderInfo> incomingOrderList = incomingMapper.incomingOrderList(paramMap);
		return incomingOrderList;
	}
	
	//입고 현황 조회
	public List<Incoming> incomingCurrentState() {

		List<Incoming> incomingCurrentState = incomingMapper.incomingCurrentState();
		log.info("입고 현황 조회 리스트 ------- incomingList" + incomingCurrentState);

		return incomingCurrentState;
	}
	
	
}
