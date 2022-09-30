package ks44team03.user.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks44team03.dto.Grade;
import ks44team03.dto.MyPageCount;
import ks44team03.dto.Nodata;
import ks44team03.dto.OrderInfo;
import ks44team03.dto.UserInfo;

@Mapper
public interface MypageMapper {
	public List<UserInfo> getUserInfo(String u_id);
	public List<Grade> nextGrade(String u_id);
	public int couponCount(String u_id);
	/*아직 사용안함*/public List<OrderInfo> orderInfo(String u_id);
	
	
	
	public List<Nodata> nodataList(String u_id);
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


