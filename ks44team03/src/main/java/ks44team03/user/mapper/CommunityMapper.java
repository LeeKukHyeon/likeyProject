package ks44team03.user.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks44team03.dto.Community;

@Mapper
public interface CommunityMapper {
	
	// 이용후기 등록
	public int addReview(Community community);
	
	// 이용후기 목록
	public List<Community> getReviewList();
	
	// 이용후기 상세정보
	public Community getReviewInfo(String communityNum);
}
