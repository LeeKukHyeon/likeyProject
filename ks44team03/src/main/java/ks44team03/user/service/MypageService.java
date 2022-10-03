package ks44team03.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks44team03.admin.mapper.CompanyInfoMapper;
import ks44team03.dto.CompanyInfo;
import ks44team03.dto.Grade;
import ks44team03.dto.MyPageCount;
import ks44team03.dto.Nodata;
import ks44team03.dto.UserInfo;
import ks44team03.user.mapper.MypageMapper;



@Service
public class MypageService {
	//의존성 주입
		private MypageMapper mypageMapper;
		
		
		public MypageService(MypageMapper mypageMapper) {
			this.mypageMapper = mypageMapper;
		}
		
		
		public List<Nodata> nodataList(String u_id){
			List<Nodata> nodataList = mypageMapper.nodataList(u_id);			
			return nodataList;
		}
		
		public List<MyPageCount> monthNodataCount(String u_id){
			List<MyPageCount> nodataCount = mypageMapper.monthNodataCount(u_id);			
			return nodataCount;
		}
		
		public List<MyPageCount> count(String u_id){
			List<MyPageCount> count = mypageMapper.count(u_id);
			
			return count;
		}
		
		/*도착완료 카운트*/
		public int allArrivedCount(String u_id) {
			int allArrivedCount = mypageMapper.allArrivedCount(u_id);
			return allArrivedCount;
		}
		
		/*일부입고 카운트*/
		public int partialIncomingCount(String u_id) {
			int partialIncomingCount = mypageMapper.partialIncomingCount(u_id);
			return partialIncomingCount;
		}
		
		/*창고도착 카운트*/
		public int warehouseArrivalCount(String u_id) {
			int warehouseArrivalCount = mypageMapper.warehouseArrivalCount(u_id);
			return warehouseArrivalCount;
		}
		
		/*구매대행 신청완료 카운트*/
		public int purchaseApplication(String u_id) {
			int purchaseApplication = mypageMapper.purchaseApplication(u_id);
			return purchaseApplication;
		}
		
		/*배송대행 신청완료 카운트*/
		public int packageForwardingApplication(String u_id) {
			int packageForwardingApplication = mypageMapper.packageForwardingApplication(u_id);
			return packageForwardingApplication;
		}
		
		public int nodataCount(String u_id) {
			int nodataCount = mypageMapper.nodataCount(u_id);
			return nodataCount;
		}
		
		public int forwardingCount(String u_id) {
			int forwardingCount = mypageMapper.forwardingCount(u_id);
			return forwardingCount;
		}
		
		public int arrivalCount(String u_id) {
			int arrivalCount = mypageMapper.arrivalCount(u_id);
			return arrivalCount;
		}
		
		public int completedApplication(String u_id) {
			int completedApplication = mypageMapper.completedApplication(u_id);
			return completedApplication;
		}
		
		public int temp(String u_id) {
			int temp = mypageMapper.temp(u_id);
			return temp;
		}
		public int thisMonthCount(String u_id) {
			int thisMonthCount = mypageMapper.thisMonthCount(u_id);
			return thisMonthCount;
		}
		
		public int lastMonthCount(String u_id) {
			int lastMonthCount = mypageMapper.lastMonthCount(u_id);
			return lastMonthCount;
		}
		
		
		
		public int couponCount(String u_id) {
			int couponCount = mypageMapper.couponCount(u_id);
			return couponCount;
		}
		
		public List<Grade> nextGrade(String u_id){
			List<Grade> nextGrade = mypageMapper.nextGrade(u_id);
			
			return nextGrade;
		}
		
		 public List<UserInfo> getUserList(String u_id){
			  
			 List<UserInfo> UserList = mypageMapper.getUserInfo(u_id);
			 
			 return UserList; 
			 
		}
			 
}
