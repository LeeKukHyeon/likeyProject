package ks44team03.admin.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ks44team03.dto.Criteria;
import ks44team03.dto.ErrorIncoming;
import ks44team03.dto.GoodsInfo;
import ks44team03.dto.OrderInfo;

@Mapper
public interface IncomingMapper {

	
	//ajax로 상품도착등록
	public int incomingGoodsDetailRegister(String goodsInfoCode);
	

	//입고 등록 대기 리스트
	public List<GoodsInfo> regIncomingList();
	

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
	
	//오류입고 목록
	public List<GoodsInfo> errorIncoming();
	
	//전체입고 목록
	public List<OrderInfo> arrivedAll();
	
	//일부입고 목록
	public List<OrderInfo> partialArrival();
	
	/*입고된 상품목록 등록 체크박스*/
	public int incomingCheck(Map<String, Object> paramMap);
	
	/*입고전 상품 목록(페이지 적용)*/
	public int getListPaging(String buyOrderCode);	
	
	//입고전 상품 목록
	public List<GoodsInfo> incomingGoodsList(Map<String, Object> paramMap);
	
	//창고 도착 목록
	public List<GoodsInfo> arriveWarehouse();
	
	//입고전 주문 목록
	public List<OrderInfo> incomingOrderList(Map<String, Object> paramMap);
	
	//입고등록 모달 - 특정 상품코드 조회
	public Map<String, Object> incomingGoodsInfoByCode(String goodsInfoCode);
	
	//오류입고 처리내역
	public List<ErrorIncoming> errorIncomingList();

	//입고등록 화면 > 오류입고 모달 - 특정 상품코드 조회
	public Map<String, Object> errorIncomingGoodsInfoByCode(String errorGoodsInfoCode);
	
	//오류입고
	public int regErrorIncoming(ErrorIncoming errorIncoming);
}
