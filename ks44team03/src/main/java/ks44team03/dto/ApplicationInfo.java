package ks44team03.dto;

import java.util.Arrays;

public class ApplicationInfo {

	private String locCd;					//물류센터
	private String shipMethod;				//운송방법 (항공 또는 해상)
	private String shipType;				//일반출고냐 라이키패스냐
	               		
	private String mallOrderNo;				//주문번호
	private String mallCd;					//구매사이트
	private String image;					//상품이미지
	private String packageBrand[];			//상품브랜드
	private String packageUnitprice[];		//상품개별가격
	private String packagePrice[];			//상품총가격
	private String packageName[];			//상품명
	private String packageQty[];			//수량
	private String packageCate[];			//품목
	private String packageColor[];			//컬러
	private String trackingNum[];			//트레킹넘버
	private String packageSize[];			//사이즈
	private String boxRemoveFlag;			//신발/박스 제거
	private String polybagFlag;				//폴리백 포장
	private String billRemoveFlag;			//인보이스/기프트박스 제거
	private String photoFlag;				//사진 촬영
	private String inspectionFlag;			//정밀검수
	private String aircapFlag;				//신발/박스 제거
	private String totalPrice;				//상품 총가격
	
	private String recipientName;			//수령인
	private String usageCd;					//사용구분
	private String recipientJoominNo;		//개인통관고유부호
	private String recipientPhone1;			//연락처
	private String sample6Postcode;			//우편번호
	private String sample6Address;			//주소
	private String sample6Detailaddress;	//상세주소
	private String sample6Extraaddress;		//참고항목
	private String ivcTyCd;					//배송사 선택
	private String shipRequest;				//배송시 요청사항
	public String getLocCd() {
		return locCd;
	}
	public void setLocCd(String locCd) {
		this.locCd = locCd;
	}
	public String getShipMethod() {
		return shipMethod;
	}
	public void setShipMethod(String shipMethod) {
		this.shipMethod = shipMethod;
	}
	public String getShipType() {
		return shipType;
	}
	public void setShipType(String shipType) {
		this.shipType = shipType;
	}
	public String getMallOrderNo() {
		return mallOrderNo;
	}
	public void setMallOrderNo(String mallOrderNo) {
		this.mallOrderNo = mallOrderNo;
	}
	public String getMallCd() {
		return mallCd;
	}
	public void setMallCd(String mallCd) {
		this.mallCd = mallCd;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String[] getPackageBrand() {
		return packageBrand;
	}
	public void setPackageBrand(String[] packageBrand) {
		this.packageBrand = packageBrand;
	}
	public String[] getPackageUnitprice() {
		return packageUnitprice;
	}
	public void setPackageUnitprice(String[] packageUnitprice) {
		this.packageUnitprice = packageUnitprice;
	}
	public String[] getPackagePrice() {
		return packagePrice;
	}
	public void setPackagePrice(String[] packagePrice) {
		this.packagePrice = packagePrice;
	}
	public String[] getPackageName() {
		return packageName;
	}
	public void setPackageName(String[] packageName) {
		this.packageName = packageName;
	}
	public String[] getPackageQty() {
		return packageQty;
	}
	public void setPackageQty(String[] packageQty) {
		this.packageQty = packageQty;
	}
	public String[] getPackageCate() {
		return packageCate;
	}
	public void setPackageCate(String[] packageCate) {
		this.packageCate = packageCate;
	}
	public String[] getPackageColor() {
		return packageColor;
	}
	public void setPackageColor(String[] packageColor) {
		this.packageColor = packageColor;
	}
	public String[] getTrackingNum() {
		return trackingNum;
	}
	public void setTrackingNum(String[] trackingNum) {
		this.trackingNum = trackingNum;
	}
	public String[] getPackageSize() {
		return packageSize;
	}
	public void setPackageSize(String[] packageSize) {
		this.packageSize = packageSize;
	}
	public String getBoxRemoveFlag() {
		return boxRemoveFlag;
	}
	public void setBoxRemoveFlag(String boxRemoveFlag) {
		this.boxRemoveFlag = boxRemoveFlag;
	}
	public String getPolybagFlag() {
		return polybagFlag;
	}
	public void setPolybagFlag(String polybagFlag) {
		this.polybagFlag = polybagFlag;
	}
	public String getBillRemoveFlag() {
		return billRemoveFlag;
	}
	public void setBillRemoveFlag(String billRemoveFlag) {
		this.billRemoveFlag = billRemoveFlag;
	}
	public String getPhotoFlag() {
		return photoFlag;
	}
	public void setPhotoFlag(String photoFlag) {
		this.photoFlag = photoFlag;
	}
	public String getInspectionFlag() {
		return inspectionFlag;
	}
	public void setInspectionFlag(String inspectionFlag) {
		this.inspectionFlag = inspectionFlag;
	}
	public String getAircapFlag() {
		return aircapFlag;
	}
	public void setAircapFlag(String aircapFlag) {
		this.aircapFlag = aircapFlag;
	}
	public String getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getRecipientName() {
		return recipientName;
	}
	public void setRecipientName(String recipientName) {
		this.recipientName = recipientName;
	}
	public String getUsageCd() {
		return usageCd;
	}
	public void setUsageCd(String usageCd) {
		this.usageCd = usageCd;
	}
	public String getRecipientJoominNo() {
		return recipientJoominNo;
	}
	public void setRecipientJoominNo(String recipientJoominNo) {
		this.recipientJoominNo = recipientJoominNo;
	}
	public String getRecipientPhone1() {
		return recipientPhone1;
	}
	public void setRecipientPhone1(String recipientPhone1) {
		this.recipientPhone1 = recipientPhone1;
	}
	public String getSample6Postcode() {
		return sample6Postcode;
	}
	public void setSample6Postcode(String sample6Postcode) {
		this.sample6Postcode = sample6Postcode;
	}
	public String getSample6Address() {
		return sample6Address;
	}
	public void setSample6Address(String sample6Address) {
		this.sample6Address = sample6Address;
	}
	public String getSample6Detailaddress() {
		return sample6Detailaddress;
	}
	public void setSample6Detailaddress(String sample6Detailaddress) {
		this.sample6Detailaddress = sample6Detailaddress;
	}
	public String getSample6Extraaddress() {
		return sample6Extraaddress;
	}
	public void setSample6Extraaddress(String sample6Extraaddress) {
		this.sample6Extraaddress = sample6Extraaddress;
	}
	public String getIvcTyCd() {
		return ivcTyCd;
	}
	public void setIvcTyCd(String ivcTyCd) {
		this.ivcTyCd = ivcTyCd;
	}
	public String getShipRequest() {
		return shipRequest;
	}
	public void setShipRequest(String shipRequest) {
		this.shipRequest = shipRequest;
	}
	@Override
	public String toString() {
		return "ApplicationInfo [locCd=" + locCd + ", shipMethod=" + shipMethod + ", shipType=" + shipType
				+ ", mallOrderNo=" + mallOrderNo + ", mallCd=" + mallCd + ", image=" + image + ", packageBrand="
				+ Arrays.toString(packageBrand) + ", packageUnitprice=" + Arrays.toString(packageUnitprice)
				+ ", packagePrice=" + Arrays.toString(packagePrice) + ", packageName=" + Arrays.toString(packageName)
				+ ", packageQty=" + Arrays.toString(packageQty) + ", packageCate=" + Arrays.toString(packageCate)
				+ ", packageColor=" + Arrays.toString(packageColor) + ", trackingNum=" + Arrays.toString(trackingNum)
				+ ", packageSize=" + Arrays.toString(packageSize) + ", boxRemoveFlag=" + boxRemoveFlag
				+ ", polybagFlag=" + polybagFlag + ", billRemoveFlag=" + billRemoveFlag + ", photoFlag=" + photoFlag
				+ ", inspectionFlag=" + inspectionFlag + ", aircapFlag=" + aircapFlag + ", totalPrice=" + totalPrice
				+ ", recipientName=" + recipientName + ", usageCd=" + usageCd + ", recipientJoominNo="
				+ recipientJoominNo + ", recipientPhone1=" + recipientPhone1 + ", sample6Postcode=" + sample6Postcode
				+ ", sample6Address=" + sample6Address + ", sample6Detailaddress=" + sample6Detailaddress
				+ ", sample6Extraaddress=" + sample6Extraaddress + ", ivcTyCd=" + ivcTyCd + ", shipRequest="
				+ shipRequest + "]";
	}
	
	

	

}

