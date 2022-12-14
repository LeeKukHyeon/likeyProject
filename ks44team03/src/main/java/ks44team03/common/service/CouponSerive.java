package ks44team03.common.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import ks44team03.common.mapper.CommonMapper;
import ks44team03.common.mapper.CouponMapper;
import ks44team03.dto.Coupon;
import ks44team03.dto.CouponList;

@Service
public class CouponSerive {
	
	
	//의존성 주입
	private CouponMapper couponMapper;
	private CommonMapper commonMapper;
	
	public CouponSerive (CouponMapper couponMapper , CommonMapper commonMapper) {
		this.couponMapper = couponMapper;
		this.commonMapper = commonMapper;
	}
	
	// 쿠폰 삭제
	public int couponDelete(String couponCode) {
		
		int couponDelete = couponMapper.couponDelete(couponCode);
		
		return couponDelete;
	}
	
	
	//쿠폰 보유 리스트에서 검색
	public List<Coupon> couponSearch(Map<String, Object> paramMap){
		
		List<Coupon> couponSearch = couponMapper.couponSearch(paramMap);
		
		return couponSearch;
		
	}
	
	//회원이 보유한 쿠폰 리스트 확인
	public List<Coupon> couponUserList(){
		
		List<Coupon> couponuserList = couponMapper.couponUserList();
		
		return couponuserList;
	}
	
	//관리자 페이지 쿠폰 등록
	public void couponAdd(CouponList couponList) {
		
		String newCouponCode = commonMapper.getCommonPkCode("coupon", "c_code");
		couponList.setCouponCode(newCouponCode);		
		
		int result = couponMapper.couponAdd(couponList);
	}
	
	//관리자 페이지 등록한 쿠폰 리스트
	public List<CouponList> couponList(){
		
		List<CouponList> couponList = couponMapper.couponList();
				
		return couponList;
	}
}
