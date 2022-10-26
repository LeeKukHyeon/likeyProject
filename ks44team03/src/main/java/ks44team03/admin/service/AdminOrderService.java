package ks44team03.admin.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks44team03.admin.mapper.AdminOrderMapper;
import ks44team03.dto.DeliveryCurrentState;
import ks44team03.dto.GoodsInfo;
import ks44team03.dto.OrderInfo;

@Service
@Transactional
public class AdminOrderService {
	
	private final AdminOrderMapper orderMapper;
	
	public AdminOrderService(AdminOrderMapper orderMapper) {
		this.orderMapper = orderMapper;
	}
	
	// friends 주문서 상품 상세정보
	public GoodsInfo getGoodsInfoBy(String goodsInfoCode) {
		
		GoodsInfo goodsInfoBy = orderMapper.getGoodsInfoBy(goodsInfoCode);
		
		return goodsInfoBy;
	}
	
	// friends 주문서 목록
	public List<GoodsInfo> getFriendsOrderList(){
		
		List<GoodsInfo> friendsOrderList = orderMapper.getgetFriendsOrderList();
		return friendsOrderList;
	}
	
	//adminPage 이용자 주문서 목록조회
	public List<OrderInfo> getOrderList(){
		
		List<OrderInfo> orderList = orderMapper.getOrderList();
		return orderList;
	}
	//adminPage (임시저장)이용자 주문서 목록조회
	public List<OrderInfo> getTempOrderList(){
		
		List<OrderInfo> tempOrderList = orderMapper.getTempOrderList();
		return tempOrderList;
	}
	//adminPage 주문서목록 검색조회
	public List<OrderInfo> getSearchOrderList(Map<String, Object> paramMap){
		List<OrderInfo> orderList = orderMapper.getSearchOrderList(paramMap);
		return orderList;
	}
	//adminPage (임시저장)주문서목록 검색조회
	public List<OrderInfo> getSearchTempOrderList(Map<String, Object> paramMap){
		List<OrderInfo> orderList = orderMapper.getSearchTempOrderList(paramMap);
		return orderList;
	}
	
	//adminPage GoodsInfo List 목록조회
	public List<GoodsInfo> getGoodsInfoList(){
		
		List<GoodsInfo> goodsInfoList = orderMapper.getGoodsInfoList();
		return goodsInfoList;
	}
	//adminPage DeliveryCurrentState List 목록조회
	public List<DeliveryCurrentState> getDeliveryCurrentStateList(){
		
		List<DeliveryCurrentState> deliveryCurrentStateList = orderMapper.getDeliveryCurrentStateList();
		return deliveryCurrentStateList;
	}
	//adminPage 배송대행 주문서 목록조회
	public List<OrderInfo> getDeliveryOrderList(){
		
		List<OrderInfo> deliveryOrderList = orderMapper.getDeliveryOrderList();
		return deliveryOrderList;
	}
	//adminPage 배송대행 주문서목록 검색조회
		public List<OrderInfo> getSearchDeliveryOrderList(Map<String, Object> paramMap){
			List<OrderInfo> orderList = orderMapper.getSearchDeliveryOrderList(paramMap);
			return orderList;
		}
	//adminPage 구매대행 주문서 목록조회
	public List<OrderInfo> getBuyProgressOrderList(){
		
		List<OrderInfo> buyProgressOrderList = orderMapper.getBuyProgressOrderList();
		return buyProgressOrderList;
	}
	//adminPage 구매대행 주문서목록 검색조회
	public List<OrderInfo> getSearchBuyProgressOrderList(Map<String, Object> paramMap){
		List<OrderInfo> orderList = orderMapper.getSearchBuyProgressOrderList(paramMap);
		return orderList;
	}
	//adminPage 출고대기/결제대기 주문서 목록조회
	public List<GoodsInfo> getWaitingForwardingList(){
		
		List<GoodsInfo> waitingForwardingList = orderMapper.getWaitingForwardingList();
		return waitingForwardingList;
	}
	//adminPage 출고대기/결제대기 주문서목록 검색조회
	public List<GoodsInfo> getSearchWaitingForwardingList(Map<String, Object> paramMap){
		List<GoodsInfo> waitingForwardingList = orderMapper.getSearchWaitingForwardingList(paramMap);
		return waitingForwardingList;
	}
	//adminPage 출고대기/결제완료 주문서 목록조회
	public List<GoodsInfo> getCompletedForwardingList(){
		
		List<GoodsInfo> completedForwardingList = orderMapper.getCompletedForwardingList();
		return completedForwardingList;
	}
	//adminPage 출고대기/결제완료 주문서목록 검색조회
	public List<GoodsInfo> getSearchCompletedForwardingList(Map<String, Object> paramMap){
		List<GoodsInfo> completedForwardingList = orderMapper.getSearchCompletedForwardingList(paramMap);
		return completedForwardingList;
	}
	//adminPage 출고보류 주문서 목록조회
	public List<GoodsInfo> getHoldForwardingList(){
		
		List<GoodsInfo> holdForwardingList = orderMapper.getHoldForwardingList();
		return holdForwardingList;
	}
	//adminPage 출고보류 주문서목록 검색조회
	public List<GoodsInfo> getSearchHoldForwardingList(Map<String, Object> paramMap){
		List<GoodsInfo> holdForwardingList = orderMapper.getSearchHoldForwardingList(paramMap);
		return holdForwardingList;
	}
}
