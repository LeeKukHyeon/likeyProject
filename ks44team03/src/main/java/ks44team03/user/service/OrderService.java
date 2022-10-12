package ks44team03.user.service;

import ks44team03.dto.ApplicationInfo;
import ks44team03.dto.OrderInfo;
import ks44team03.user.mapper.OrderMapper;

public class OrderService {
	
	private OrderMapper orderMapper;
	
	public OrderService(OrderMapper orderMapper) {
		this.orderMapper = orderMapper;
	}
	// 주문서 정보 등록처리
	public int addOrderInfo(ApplicationInfo order) {
		int result = orderMapper.addOrderInfo(order);
		return result;
	}
}