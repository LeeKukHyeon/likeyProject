package ks44team03.user.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ks44team03.dto.Community;

@Mapper
public interface CommunityMapper {
	
	// 이용후기 등록
	public int addReview(Community community);
	
	// 이용후기 목록
	public List<Community> getReviewList();
	
	// 이용후기 목록검색
	public List<Community> getSearchReviewList(Map<String, Object> searchMap);
	
	// 이용후기 상세정보
	public Community getReviewInfo(String communityNum);
	
	// 이용후기 아이디체크
	public boolean reviewListIdCheck(String communityId);
	
	// 정보공유 등록
	public int addPostborde(Community community); 
	
	// 정보공유 목록
	public List<Community> getPostbordeList();
	
	// 정보공유 목록검색
	public List<Community> getSearchPostbordeList(Map<String, Object> searchMap);
		
	// 정보공유 상세정보
	public Community getPostbordeInfo(String communityNum);
	
	// 글조회시 조회수 증가
	public void getCountHit(String communityNum);
}
