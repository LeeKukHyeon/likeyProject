package ks44team03.user.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks44team03.dto.Grade;
import ks44team03.dto.UserInfo;

@Mapper
public interface MypageMapper {
	public List<UserInfo> getUserInfo(String u_id);
	public List<Grade> nextGrade(String u_id);
	public int couponCount(String u_id);
	
}


