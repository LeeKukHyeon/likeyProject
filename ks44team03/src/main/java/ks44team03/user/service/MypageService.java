package ks44team03.user.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import ks44team03.admin.mapper.CompanyInfoMapper;
import ks44team03.dto.CompanyInfo;
import ks44team03.dto.Coupon;
import ks44team03.dto.GoodsInfo;
import ks44team03.dto.Grade;
import ks44team03.dto.MyPageCount;
import ks44team03.dto.Nodata;
import ks44team03.dto.UserInfo;
import ks44team03.dto.ShipOrderApi;
import ks44team03.user.mapper.MypageMapper;

@Service
public class MypageService {
	// 의존성 주입
	private MypageMapper mypageMapper;

	public MypageService(MypageMapper mypageMapper) {
		this.mypageMapper = mypageMapper;
	}

	
	//쿠폰정보 가져오기
	public List<Coupon> couponCheck(String id){
		List<Coupon> couponCheck = mypageMapper.couponCheck(id);
		return couponCheck;
	}
	
	 //임시저장 수정 
	public List<GoodsInfo> applicationEdit(String buyOrderCode){
	 List<GoodsInfo> applicationEdit = mypageMapper.applicationEdit(buyOrderCode);
	  return applicationEdit; 
	  }
	 
	//노데이터 리스트
	public List<Nodata> nodataList(String u_id) {
		List<Nodata> nodataList = mypageMapper.nodataList(u_id);
		return nodataList;
	}

	//이번달 노데이터 카운트
	public List<MyPageCount> monthNodataCount(String u_id) {
		List<MyPageCount> nodataCount = mypageMapper.monthNodataCount(u_id);
		return nodataCount;
	}

	//마이페이지 카운트
	public List<MyPageCount> count(String u_id) {
		List<MyPageCount> count = mypageMapper.count(u_id);

		return count;
	}

	/* 목록조회 */
	public List<ShipOrderApi> shipOrderApi(Map<String, Object> paramMap) {
		List<ShipOrderApi> shipOrderApi = null;
		if (paramMap.get("q_status_name").equals("Imsi")) {
			shipOrderApi = mypageMapper.shipOrderTemp(paramMap);
		} else{
			shipOrderApi = mypageMapper.shipOrderApi(paramMap);
		}
		return shipOrderApi;
	}

	/* 무게측정 및 출고보류 갯수 */
	public int weightCheckPostponeCount(String u_id) {

		int weightCheckPostponeCount = mypageMapper.weightCheckPostponeCount(u_id);
		return weightCheckPostponeCount;
	}

	/* 무게측정,결제완료 카운트 */
	public int weightCheckPaymentCount(String u_id) {
		int weightCheckPaymentCount = mypageMapper.weightCheckPaymentCount(u_id);
		return weightCheckPaymentCount;
	}

	/* 무게측정,결제대기 카운트 */
	public int weightCheckNopaymentCount(String u_id) {
		int weightCheckNopaymentCount = mypageMapper.weightCheckNopaymentCount(u_id);
		return weightCheckNopaymentCount;
	}

	/* 도착완료 카운트 */
	public int allArrivedCount(String u_id) {
		int allArrivedCount = mypageMapper.allArrivedCount(u_id);
		return allArrivedCount;
	}

	/* 일부입고 카운트 */
	public int partialIncomingCount(String u_id) {
		int partialIncomingCount = mypageMapper.partialIncomingCount(u_id);
		return partialIncomingCount;
	}

	/* 창고도착 카운트 */
	public int warehouseArrivalCount(String u_id) {
		int warehouseArrivalCount = mypageMapper.warehouseArrivalCount(u_id);
		return warehouseArrivalCount;
	}

	/* 구매대행 신청완료 카운트 */
	public int purchaseApplication(String u_id) {
		int purchaseApplication = mypageMapper.purchaseApplication(u_id);
		return purchaseApplication;
	}

	/* 배송대행 신청완료 카운트 */
	public int packageForwardingApplication(String u_id) {
		int packageForwardingApplication = mypageMapper.packageForwardingApplication(u_id);
		return packageForwardingApplication;
	}
	
	
	//노데이터 개수
	public int nodataCount(String u_id) {
		int nodataCount = mypageMapper.nodataCount(u_id);
		return nodataCount;
	}
	
	
	//출고보류 개수
	public int forwardingCount(String u_id) {
		int forwardingCount = mypageMapper.forwardingCount(u_id);
		return forwardingCount;
	}
	
	
	//상품도착개수
	public int arrivalCount(String u_id) {
		int arrivalCount = mypageMapper.arrivalCount(u_id);
		return arrivalCount;
	}
	
	//주문서 작성완료 조회
	public int completedApplication(String u_id) {
		int completedApplication = mypageMapper.completedApplication(u_id);
		return completedApplication;
	}
	
	//임시저장 조회
	public int temp(String u_id) {
		int temp = mypageMapper.temp(u_id);
		return temp;
	}

	//이번달이용건수 조회
	public int thisMonthCount(String u_id) {
		int thisMonthCount = mypageMapper.thisMonthCount(u_id);
		return thisMonthCount;
	}
	
	//저번달 이용건수 조회
	public int lastMonthCount(String u_id) {
		int lastMonthCount = mypageMapper.lastMonthCount(u_id);
		return lastMonthCount;
	}
	
	//쿠폰카운트 조회
	public int couponCount(String u_id) {
		int couponCount = mypageMapper.couponCount(u_id);
		return couponCount;
	}

	//다음 등급 조회
	public List<Grade> nextGrade(String u_id) {
		List<Grade> nextGrade = mypageMapper.nextGrade(u_id);

		return nextGrade;
	}
	
	//유저리스트 조회
	public List<UserInfo> getUserList(String u_id) {

		List<UserInfo> UserList = mypageMapper.getUserInfo(u_id);

		return UserList;

	}

}
