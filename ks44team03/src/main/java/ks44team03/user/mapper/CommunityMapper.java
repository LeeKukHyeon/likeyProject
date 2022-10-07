package ks44team03.user.mapper;

import org.apache.ibatis.annotations.Mapper;

import ks44team03.dto.Community;

@Mapper
public interface CommunityMapper {
	
	// 이용후기 등록
	public int addReview(Community community);
	
}
