package ks44team03.admin.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ks44team03.dto.DeliveryCurrentState;
import ks44team03.dto.GoodsInfo;
import ks44team03.dto.OrderInfo;

@Mapper
public interface AdminOrderMapper {
	
	// friends 주문서 목록
	public List<GoodsInfo> getgetFriendsOrderList();
	
	//adminPage 이용자 주문서 목록조회
	public List<OrderInfo> getOrderList();
	
	//adminPage (임시저장)이용자 주문서 목록조회
	public List<OrderInfo> getTempOrderList();
	
	//adminPage 주문서목록 검색
	public List<OrderInfo> getSearchOrderList(Map<String, Object> searchMap);
	
	//adminPage (임시저장)주문서목록 검색
	public List<OrderInfo> getSearchTempOrderList(Map<String, Object> searchMap);
	
	//adminPage GoodsInfo List 목록조회
	public List<GoodsInfo> getGoodsInfoList();
	
	//adminPage DeliveryCurrentState List 목록조회
	public List<DeliveryCurrentState> getDeliveryCurrentStateList();
	
	//adminPage 배송대행 주문서 목록조회
	public List<OrderInfo> getDeliveryOrderList();
	
	//adminPage 배송대행 주문서목록 검색조회
	public List<OrderInfo> getSearchDeliveryOrderList(Map<String, Object> searchMap);
	
	//adminPage 구매대행 주문서 목록조회
	public List<OrderInfo> getBuyProgressOrderList();
	
	//adminPage 구매대행 주문서목록 검색조회
	public List<OrderInfo> getSearchBuyProgressOrderList(Map<String, Object> searchMap);
		
	//adminPage 출고대기/결제대기 주문서 목록조회
	public List<GoodsInfo> getWaitingForwardingList();
	
	//adminPage 출고대기/결제대기 주문서목록 검색조회
	public List<GoodsInfo> getSearchWaitingForwardingList(Map<String, Object> searchMap);
		
	//adminPage 출고대기/결제완료 주문서 목록조회
	public List<GoodsInfo> getCompletedForwardingList();
	
	//adminPage 출고대기/결제완료 주문서목록 검색조회
	public List<GoodsInfo> getSearchCompletedForwardingList(Map<String, Object> searchMap);
		
	//adminPage 출고보류 목록조회
	public List<GoodsInfo> getHoldForwardingList();
	
	//adminPage 출고보류 주문서목록 검색조회
	public List<GoodsInfo> getSearchHoldForwardingList(Map<String, Object> searchMap);
}
