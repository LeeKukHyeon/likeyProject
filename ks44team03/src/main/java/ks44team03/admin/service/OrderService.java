package ks44team03.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks44team03.admin.mapper.OrderMapper;
import ks44team03.dto.DeliveryCurrentState;
import ks44team03.dto.GoodsInfo;
import ks44team03.dto.OrderInfo;

@Service
@Transactional
public class OrderService {
	
	private final OrderMapper orderMapper;
	
	public OrderService(OrderMapper orderMapper) {
		this.orderMapper = orderMapper;
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
	//adminPage 구매대행 주문서 목록조회
	public List<OrderInfo> getBuyProgressOrderList(){
		
		List<OrderInfo> buyProgressOrderList = orderMapper.getBuyProgressOrderList();
		return buyProgressOrderList;
	}
	//adminPage 출고대기/결제대기 주문서 목록조회
	public List<GoodsInfo> getWaitingForwardingList(){
		
		List<GoodsInfo> waitingForwardingList = orderMapper.getWaitingForwardingList();
		return waitingForwardingList;
	}
	//adminPage 출고대기/결제완료 주문서 목록조회
	public List<GoodsInfo> getCompletedForwardingList(){
		
		List<GoodsInfo> completedForwardingList = orderMapper.getCompletedForwardingList();
		return completedForwardingList;
	}
	//adminPage 출고보류 주문서 목록조회
	public List<GoodsInfo> getHoldForwardingList(){
		
		List<GoodsInfo> holdForwardingList = orderMapper.getHoldForwardingList();
		return holdForwardingList;
	}
}
