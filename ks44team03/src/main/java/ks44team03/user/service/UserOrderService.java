package ks44team03.user.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks44team03.dto.ApplicationInfo;
import ks44team03.dto.OrderInfo;
import ks44team03.user.mapper.UserOrderMapper;

@Service
@Transactional
public class UserOrderService {
	
	private final UserOrderMapper orderMapper;
	
	public UserOrderService(UserOrderMapper userOrderMapper) {
		this.orderMapper = userOrderMapper;
	}
	// 주문서 정보 등록처리
	public int addOrderInfo(ApplicationInfo order) {
		int result = orderMapper.addOrderInfo(order);
		return result;
	}
}