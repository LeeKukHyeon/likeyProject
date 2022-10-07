package ks44team03.dto;

public class PageMakeDTO {
	
	/*시작 페이지*/
	private int startPage;
	
	/*끝 페이지*/
	private int endPage;
	
	/*이전 페이지, 다음 페이지 존재유무*/
	private boolean prev, next;
	
	/*전체 게시물 수*/
	private int total;
	
	/*현재 페이지, 페이지당 게시물 표시수 정보*/
	private Criteria cri;
	
	
}
