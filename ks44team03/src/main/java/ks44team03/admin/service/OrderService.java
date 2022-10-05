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
}
