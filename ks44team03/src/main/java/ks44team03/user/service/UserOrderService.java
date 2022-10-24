package ks44team03.user.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks44team03.common.mapper.CommonMapper;
import ks44team03.dto.ApplicationInfo;
import ks44team03.dto.OrderInfo;
import ks44team03.user.mapper.UserOrderMapper;

@Service
@Transactional
public class UserOrderService {
	
	private final UserOrderMapper orderMapper;
	private CommonMapper commonMapper;
	
	public UserOrderService(UserOrderMapper userOrderMapper, CommonMapper commonMapper) {
		this.orderMapper = userOrderMapper;
		this.commonMapper = commonMapper;
	}
	// 주문서 정보 등록처리
	public int addOrderInfo(ApplicationInfo order) {
		
		// String newBuyOrderCode = commonMapper.getCommonPkNumCode("order_info","buy_order_code");
		// order.setBuyOrderCode(newBuyOrderCode);
		
		int result = orderMapper.addOrderInfo(order);
		return result;
	}
}