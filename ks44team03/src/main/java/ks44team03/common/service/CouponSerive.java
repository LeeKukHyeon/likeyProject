package ks44team03.common.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks44team03.common.mapper.CouponMapper;
import ks44team03.dto.Coupon;

@Service
public class CouponSerive {
	
	
	//의존성 주입
	private CouponMapper couponMapper;
	
	public CouponSerive (CouponMapper couponMapper) {
		this.couponMapper = couponMapper;
	}
	
	
	public List<Coupon> couponList(){
		
		List<Coupon> couponList = couponMapper.couponList();
				
		return couponList;
	}

	
	
}
