package ks44team03.user.service;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import ks44team03.common.mapper.CommonMapper;
import ks44team03.common.mapper.FileMapper;
import ks44team03.dto.Community;

import ks44team03.user.controller.CommunityController;
import ks44team03.user.mapper.CommunityMapper;
import ks44team03.dto.FileDto;
import ks44team03.common.util.FileUtil;


@Service
public class CommunityService {
	
	private static final Logger log = LoggerFactory.getLogger(CommunityController.class);
	
	private final FileUtil fileUtil;
	private final FileMapper fileMapper;
	private final CommunityMapper communityMapper;
	private final CommonMapper commonMapper;
	

	public CommunityService(CommunityMapper communityMapper, CommonMapper commonMapper,FileUtil fileUtil, FileMapper fileMapper) {

		this.communityMapper = communityMapper;
		this.commonMapper = commonMapper;


		this.fileUtil = fileUtil;
		this.fileMapper = fileMapper;

	}
	// ---------------------------------- 이용후기 관련 Service State --------------------------------------		
	// 이용후기 등록
	public void addReview(Community community,MultipartFile[] multipartFile, String fileRealPath, boolean isLocalhost) {
		String newCommunityCode = commonMapper.getCommonPkNumCode("community", "cm_num");
		
		community.setCommunityNum(newCommunityCode);
		
		
		/* log.info("community 입니다------------"+ community); */
		int result = communityMapper.addReview(community);
		
		List<FileDto> fileList= fileUtil.parseFileInfo(multipartFile, fileRealPath , isLocalhost,newCommunityCode);
		
		
		
		if(fileList != null) {
			
			fileMapper.addFile(fileList);
		}
		
		log.info("이용후기 등록결과 : " + result);
	}
	
	// 이용후기 게시판 목록
	public List<Community> getReviewList(){
		
		List<Community> reviewList = communityMapper.getReviewList();
		log.info("reviewList 입니다------------------" + reviewList);
		return reviewList;
	}
	
	// 이용후기 게시판 목록검색
	public List<Community> getSearchReviewList(Map<String, Object> paramMap){
		
		List<Community> reviewList = communityMapper.getSearchReviewList(paramMap);
		
		return reviewList; 
	}
	
	//이용후기 상세정보
	public Community getReviewInfo(String communityNum) {
		
		communityMapper.getCountHit(communityNum);
		Community reviewInfo = communityMapper.getReviewInfo(communityNum);
		return reviewInfo;
	}
	// 이용후기 아이디체크
	public boolean reviewListIdCheck(String communityId) {
		boolean result = communityMapper.reviewListIdCheck(communityId);
		
		log.info("communityId 아이디체크 :::" + result);
		return result;
	}
	// 이용후기 수정
	public void modifyReview(Community community) {
		communityMapper.modifyReview(community);
	}
	// 이용후기 삭제
	public void removeReview(String communityNum) {
		communityMapper.removeReview(communityNum);
	}
	
	// 특정 커뮤니티 글 조회
	public Community getCommunityInfoByNum(String communityNum) {
		
		Community community = communityMapper.getCommunityInfoByNum(communityNum);
		
		log.info("community ::::::::: 특정 커뮤니티 글 조회 ::::::::::" + community);
		return community;
	}
	
// ---------------------------------- 이용후기 관련 Service End --------------------------------------	
	
	// 게시판 유효성 검사
	public boolean checkUserPw(String checkUserId, String checkUserPw) {
		boolean result = communityMapper.checkUserPw(checkUserId, checkUserPw);
		
		log.info("checkUserId 중복체크 ::::" + result);
		return result;
	}
	
// ---------------------------------- 정보공유 관련 Service State --------------------------------------		
	// 정보공유 등록
	public void addPostborde(Community community,MultipartFile[] multipartFile, String fileRealPath, boolean isLocalhost) {
		String newCommunityCode = commonMapper.getCommonPkNumCode("community", "cm_num");
		
		community.setCommunityNum(newCommunityCode);
		
		
		/* log.info("community 입니다------------"+ community); */
		int result = communityMapper.addPostborde(community);
		
		List<FileDto> fileList= fileUtil.parseFileInfo(multipartFile, fileRealPath , isLocalhost,newCommunityCode);
		
		
		
		if(fileList != null) {
			
			fileMapper.addFile(fileList);
		}
		
		log.info("정보공유 등록결과 : " + result);
	}
	
	// 정보공유 게시판 목록
	public List<Community> getPostbordeList(){
		
		List<Community> postbordeList = communityMapper.getPostbordeList();
		log.info("postbordeList 입니다 --------------" + postbordeList);
		return postbordeList;
	}
	// 정보공유 게시판 목록검색
	public List<Community> getSearchPostbordeList(Map<String, Object> paramMap){
		
		List<Community> postbordeList = communityMapper.getSearchPostbordeList(paramMap);
		
		return postbordeList; 
	}
	//정보공유 상세정보
	public Community getPostbordeInfo(String communityNum) {
		
		communityMapper.getCountHit(communityNum);
		Community postbordeInfo = communityMapper.getPostbordeInfo(communityNum);
		return postbordeInfo;
	}
	// 정보공유 아이디체크
	public boolean postbordeListIdCheck(String communityId) {
		boolean result = communityMapper.postbordeListIdCheck(communityId);
		
		log.info("communityId 아이디체크 :::" + result);
		return result;
	}
	
	// 정보공유 수정
	public void modifyPostborde(Community community) {
		communityMapper.modifyPostborde(community);
	}
	
	// 정보공유 삭제
		public void removePostborde(String communityNum) {
			communityMapper.removePostborde(communityNum);
		}
// ---------------------------------- 정보공유 관련 Service End --------------------------------------
}
