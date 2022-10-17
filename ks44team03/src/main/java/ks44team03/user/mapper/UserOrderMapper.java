package ks44team03.user.mapper;

import org.apache.ibatis.annotations.Mapper;

import ks44team03.dto.ApplicationInfo;
import ks44team03.dto.OrderInfo;

@Mapper
public interface UserOrderMapper {

	//주문서 정보 등록처리
	public int addOrderInfo(ApplicationInfo order);
}
