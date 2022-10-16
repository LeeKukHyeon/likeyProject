package ks44team03.common.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks44team03.dto.Coupon;
import ks44team03.dto.CouponList;

@Mapper
public interface CouponMapper {
	
	//회원이 보유한 쿠폰 리스트 확인
	public List<Coupon> couponUserList();
	
	//관리자 페이지 쿠폰 등록
	public int couponAdd(CouponList couponList);
	
	//관리자 페이지 등록한 쿠폰 리스트
	public List<CouponList> couponList();
}
