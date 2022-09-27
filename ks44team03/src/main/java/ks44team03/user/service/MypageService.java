package ks44team03.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks44team03.admin.mapper.CompanyInfoMapper;
import ks44team03.dto.CompanyInfo;
import ks44team03.dto.Grade;
import ks44team03.dto.UserInfo;
import ks44team03.user.mapper.MypageMapper;



@Service
public class MypageService {
	//의존성 주입
		private MypageMapper mypageMapper;
		
		
		public MypageService(MypageMapper mypageMapper) {
			this.mypageMapper = mypageMapper;
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
