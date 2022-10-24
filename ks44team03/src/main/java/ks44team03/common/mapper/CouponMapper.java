package ks44team03.common.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ks44team03.dto.Coupon;
import ks44team03.dto.CouponList;

@Mapper
public interface CouponMapper {
	
	//쿠폰 삭제
	public int couponDelete(String couponCode);
	
	//쿠폰 보유 리스트에서 검색
	public List<Coupon> couponSearch(Map<String, Object> searchMap);
	
	//회원이 보유한 쿠폰 리스트 확인
	public List<Coupon> couponUserList();
	
	//관리자 페이지 쿠폰 등록
	public int couponAdd(CouponList couponList);
	
	//관리자 페이지 등록한 쿠폰 리스트
	public List<CouponList> couponList();
}
