package ks44team03.user.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import ks44team03.common.mapper.CommonMapper;
import ks44team03.dto.Community;
import ks44team03.user.controller.CommunityController;
import ks44team03.user.mapper.CommunityMapper;

@Service
public class CommunityService {
	
	private static final Logger log = LoggerFactory.getLogger(CommunityController.class);
	
	private final CommunityMapper communityMapper;
	private final CommonMapper commonMapper;
	
	public CommunityService(CommunityMapper communityMapper, CommonMapper commonMapper) {
		this.communityMapper = communityMapper;
		this.commonMapper = commonMapper;
	}
	
	// 이용후기 등록
	public void addReview(Community community) {
		String newCommunityCode = commonMapper.getCommonPkNumCode("community", "cm_num");
		community.setCommunityNum(newCommunityCode);
		
		log.info("community 입니다------------"+ community);
		int result = communityMapper.addReview(community);
		
		log.info("이용후기 등록결과 : " + result);
	}
}
