package ks44team03.dto;

public class ErrorIncoming {
	
	private String errorCode;		//오류입고 코드
	private String goodsInfoCode;	//상품정보 코드
	private String errorContent;	//오류입고 내역
	private int errorAmount;		//오류입고 개수
	private String errorState;		//물품 처리 상태
	private String errorCompDate;	//물품 처리 날짜
	
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getGoodsInfoCode() {
		return goodsInfoCode;
	}
	public void setGoodsInfoCode(String goodsInfoCode) {
		this.goodsInfoCode = goodsInfoCode;
	}
	public String getErrorContent() {
		return errorContent;
	}
	public void setErrorContent(String errorContent) {
		this.errorContent = errorContent;
	}
	public int getErrorAmount() {
		return errorAmount;
	}
	public void setErrorAmount(int errorAmount) {
		this.errorAmount = errorAmount;
	}
	public String getErrorState() {
		return errorState;
	}
	public void setErrorState(String errorState) {
		this.errorState = errorState;
	}
	public String getErrorCompDate() {
		return errorCompDate;
	}
	public void setErrorCompDate(String errorCompDate) {
		this.errorCompDate = errorCompDate;
	}
	
	@Override
	public String toString() {
		return "ErrorIncoming [errorCode=" + errorCode + ", goodsInfoCode=" + goodsInfoCode + ", errorContent="
				+ errorContent + ", errorAmount=" + errorAmount + ", errorState=" + errorState + ", errorCompDate="
				+ errorCompDate + "]";
	}
	
}
