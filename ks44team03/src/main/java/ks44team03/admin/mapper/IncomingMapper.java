package ks44team03.admin.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ks44team03.dto.Criteria;
import ks44team03.dto.GoodsInfo;
import ks44team03.dto.Incoming;
import ks44team03.dto.OrderInfo;

@Mapper
public interface IncomingMapper {
	
	//ajax 호출
	public List<GoodsInfo> goodsDetail(String code);
	
	//보관료 발생 상품 조회
	public List<GoodsInfo> storageCharge(Map<String, Object> paramMap);
	
	//배송완료 상품목록 조회
	public List<GoodsInfo> deliveryComplete(Map<String, Object> paramMap);
	
	//배송중인 상품목록 조회
	public List<GoodsInfo> inTransit(Map<String, Object> paramMap);
	
	//상품 도착 등록
	public int regGoodsIncoming(String check);
	
	//입고 등록
	public int regIncoming(Incoming incoming);
	
	//오류입고 목록
	public List<GoodsInfo> errorIncoming();
	
	//전체입고 목록
	public List<OrderInfo> arrivedAll();
	
	//일부입고 목록
	public List<OrderInfo> partialArrival();
	
	/*입고전 상품 목록(페이지 적용)*/
	
	
	
	public int getListPaging(String buyOrderCode);	
	
	//입고전 상품 목록
	public List<GoodsInfo> incomingGoodsList(Map<String, Object> paramMap);
	
	//창고 도착 목록
	public List<GoodsInfo> arriveWarehouse();
	
	//입고전 주문 목록
	public List<OrderInfo> incomingOrderList(Map<String, Object> paramMap);
	
	//입고 현황 조회
	public List<Incoming> incomingCurrentState();
}
