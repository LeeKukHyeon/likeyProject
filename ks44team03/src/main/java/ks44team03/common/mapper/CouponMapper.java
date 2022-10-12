package ks44team03.common.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks44team03.dto.Coupon;

@Mapper
public interface CouponMapper {

	//관리자 페이지 쿠폰 리스트
	public List<Coupon> couponList();
	
}
