package ks44team03.user.mapper;

import ks44team03.dto.ApplicationInfo;
import ks44team03.dto.OrderInfo;

public interface OrderMapper {

	//주문서 정보 등록처리
	public int addOrderInfo(ApplicationInfo order);
}
