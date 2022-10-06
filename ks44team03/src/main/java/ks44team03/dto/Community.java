package ks44team03.dto;

public class Community {
	
	private String communityNum;
	private String communityId;
	private String communityTitle;
	private String communityContent;
	private String communityImg;
	private String communityDate;
	private String communityComment;
	private String communityCommentDate;
	private int communityView;
	
	
	public String getCommunityNum() {
		return communityNum;
	}
	public void setCommunityNum(String communityNum) {
		this.communityNum = communityNum;
	}
	public String getCommunityId() {
		return communityId;
	}
	public void setCommunityId(String communityId) {
		this.communityId = communityId;
	}
	public String getCommunityTitle() {
		return communityTitle;
	}
	public void setCommunityTitle(String communityTitle) {
		this.communityTitle = communityTitle;
	}
	public String getCommunityContent() {
		return communityContent;
	}
	public void setCommunityContent(String communityContent) {
		this.communityContent = communityContent;
	}
	public String getCommunityImg() {
		return communityImg;
	}
	public void setCommunityImg(String communityImg) {
		this.communityImg = communityImg;
	}
	public String getCommunityDate() {
		return communityDate;
	}
	public void setCommunityDate(String communityDate) {
		this.communityDate = communityDate;
	}
	public String getCommunityComment() {
		return communityComment;
	}
	public void setCommunityComment(String communityComment) {
		this.communityComment = communityComment;
	}
	public String getCommunityCommentDate() {
		return communityCommentDate;
	}
	public void setCommunityCommentDate(String communityCommentDate) {
		this.communityCommentDate = communityCommentDate;
	}
	public int getCommunityView() {
		return communityView;
	}
	public void setCommunityView(int communityView) {
		this.communityView = communityView;
	}
	
	@Override
	public String toString() {
		return "Community [communityNum=" + communityNum + ", communityId=" + communityId + ", communityTitle="
				+ communityTitle + ", communityContent=" + communityContent + ", communityImg=" + communityImg
				+ ", communityDate=" + communityDate + ", communityComment=" + communityComment
				+ ", communityCommentDate=" + communityCommentDate + ", communityView=" + communityView + "]";
	}
	
}
