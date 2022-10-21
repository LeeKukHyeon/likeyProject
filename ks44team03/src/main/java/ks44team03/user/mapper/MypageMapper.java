package ks44team03.user.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ks44team03.dto.Coupon;
import ks44team03.dto.GoodsInfo;
import ks44team03.dto.Grade;
import ks44team03.dto.MyPageCount;
import ks44team03.dto.Nodata;
import ks44team03.dto.OrderInfo;
import ks44team03.dto.UserInfo;
import ks44team03.dto.ShipOrderApi;

@Mapper
public interface MypageMapper {
	public List<UserInfo> getUserInfo(String u_id);

	public List<Grade> nextGrade(String u_id);

	public int couponCount(String u_id);
	
	//쿠폰 정보 가져오기
	public List<Coupon> couponCheck(String id);

	// 임시저장 수정
	public List<GoodsInfo> applicationEdit(String buyOrderCode);
	 

	/* 목록조회 임시저장 */
	public List<ShipOrderApi> shipOrderTemp(Map<String, Object> searchMap);

	/* 목록조회 */
	public List<ShipOrderApi> shipOrderApi(Map<String, Object> searchMap);

	/* 무게측정 및 출고보류 갯수 */
	public int weightCheckPostponeCount(String u_id);

	/* 무게측정 및 출고대기/결제대기 갯수 */
	public int weightCheckPaymentCount(String u_id);

	/* 무게측정 및 출고대기/결제대기 갯수 */
	public int weightCheckNopaymentCount(String u_id);

	/* 도착완료 갯수 */
	public int allArrivedCount(String u_id);

	/* 일부입고 갯수 */
	public int partialIncomingCount(String u_id);

	/* 창고도착 갯수 */
	public int warehouseArrivalCount(String u_id);

	/* 구매대행 신청완료 갯수 */
	public int purchaseApplication(String u_id);

	/* 배송대행 신청완료 갯수 */
	public int packageForwardingApplication(String u_id);

	/* 노데이터 리스트 */
	public List<Nodata> nodataList(String u_id);

	/* 달별 노데이터 갯수 */
	public List<MyPageCount> monthNodataCount(String u_id);

	public int nodataCount(String u_id);

	public int forwardingCount(String u_id);

	public int arrivalCount(String u_id);

	public int completedApplication(String u_id);

	public List<MyPageCount> count(String u_id);

	public int temp(String u_id);

	public int thisMonthCount(String u_id);

	public int lastMonthCount(String u_id);

}
