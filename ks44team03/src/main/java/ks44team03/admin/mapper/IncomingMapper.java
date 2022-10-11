package ks44team03.admin.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ks44team03.dto.GoodsInfo;
import ks44team03.dto.Incoming;
import ks44team03.dto.OrderInfo;

@Mapper
public interface IncomingMapper {
	/*
	 * //입고 등록 public int regIncoming(Incoming incoming);
	 */
	//입고 등록 222222
	public List<GoodsInfo> regIncoming2();
	
	//특정 상품코드 출력
	public GoodsInfo getIncomingGoodsInfo(String goodsInfoCode);
	
	//오류입고 목록
	public List<GoodsInfo> errorIncoming();
	
	//전체입고 목록
	public List<OrderInfo> arrivedAll();
	
	//일부입고 목록
	public List<OrderInfo> partialArrival();
	
	//입고전 상품 목록
	public List<GoodsInfo> incomingGoodsList(String buyOrderCode);
	
	//창고 도착 목록
	public List<GoodsInfo> arriveWarehouse();
	
	//입고전 주문 목록
	public List<OrderInfo> incomingOrderList(Map<String, Object> paramMap);
	
	//입고 현황 조회
	/* public List<Incoming> incomingCurrentState(); */
	
	//입고등록 모달 - 특정 상품코드 조회
	public Map<String, Object> incomingGoodsInfoByCode(String goodsInfoCode);
}
