package ks44team03.dto;

import java.util.Arrays;

public class ApplicationInfo {

	private String loc_cd;		 			//물류센터
	private String ship_method; 			//운송방법 (항공 또는 해상)
	private String ship_type;				//일반출고냐 라이키패스냐
	
	private String mall_order_no; 			//주문번호
	private String mall_cd; 				//구매사이트
	private String image;   				//상품이미지
	private String package_brand[]; 		//상품브랜드
	private String package_unitprice[];		//상품개별가격
	private String package_price[];			//상품총가격
	private String package_name[];			//상품명
	private String package_qty[];			//수량
	private String package_cate[];			//품목
	private String package_color[]; 		//컬러
	private String tracking_num[];			//트레킹넘버
	private String package_size[];			//사이즈
	private String box_remove_flag; 		//신발/박스 제거
	private String polybag_flag; 			//폴리백 포장
	private String bill_remove_flag; 		//인보이스/기프트박스 제거
	private String photo_flag; 				//사진 촬영
	private String inspection_flag; 		//정밀검수
	private String aircap_flag; 			//신발/박스 제거
	private String total_price; 			//상품 총가격
	
	private String recipient_name; 			//수령인
	private String usage_cd; 				//사용구분
	private String recipient_joomin_no; 	//개인통관고유부호
	private String recipient_phone1;		//연락처
	private String sample6_postcode;		//우편번호
	private String sample6_address;			//주소
	private String sample6_detailAddress;	//상세주소
	private String sample6_extraAddress;	//참고항목
	private String IVC_TY_CD;				//배송사 선택
	private String ship_request;			//배송시 요청사항
	
	public String getLoc_cd() {
		return loc_cd;
	}
	public void setLoc_cd(String loc_cd) {
		this.loc_cd = loc_cd;
	}
	public String getShip_method() {
		return ship_method;
	}
	public void setShip_method(String ship_method) {
		this.ship_method = ship_method;
	}
	public String getShip_type() {
		return ship_type;
	}
	public void setShip_type(String ship_type) {
		this.ship_type = ship_type;
	}
	public String getMall_order_no() {
		return mall_order_no;
	}
	public void setMall_order_no(String mall_order_no) {
		this.mall_order_no = mall_order_no;
	}
	public String getMall_cd() {
		return mall_cd;
	}
	public void setMall_cd(String mall_cd) {
		this.mall_cd = mall_cd;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String[] getPackage_brand() {
		return package_brand;
	}
	public void setPackage_brand(String[] package_brand) {
		this.package_brand = package_brand;
	}
	public String[] getPackage_unitprice() {
		return package_unitprice;
	}
	public void setPackage_unitprice(String[] package_unitprice) {
		this.package_unitprice = package_unitprice;
	}
	public String[] getPackage_price() {
		return package_price;
	}
	public void setPackage_price(String[] package_price) {
		this.package_price = package_price;
	}
	public String[] getPackage_name() {
		return package_name;
	}
	public void setPackage_name(String[] package_name) {
		this.package_name = package_name;
	}
	public String[] getPackage_qty() {
		return package_qty;
	}
	public void setPackage_qty(String[] package_qty) {
		this.package_qty = package_qty;
	}
	public String[] getPackage_cate() {
		return package_cate;
	}
	public void setPackage_cate(String[] package_cate) {
		this.package_cate = package_cate;
	}
	public String[] getPackage_color() {
		return package_color;
	}
	public void setPackage_color(String[] package_color) {
		this.package_color = package_color;
	}
	public String[] getTracking_num() {
		return tracking_num;
	}
	public void setTracking_num(String[] tracking_num) {
		this.tracking_num = tracking_num;
	}
	public String[] getPackage_size() {
		return package_size;
	}
	public void setPackage_size(String[] package_size) {
		this.package_size = package_size;
	}
	public String getBox_remove_flag() {
		return box_remove_flag;
	}
	public void setBox_remove_flag(String box_remove_flag) {
		this.box_remove_flag = box_remove_flag;
	}
	public String getPolybag_flag() {
		return polybag_flag;
	}
	public void setPolybag_flag(String polybag_flag) {
		this.polybag_flag = polybag_flag;
	}
	public String getBill_remove_flag() {
		return bill_remove_flag;
	}
	public void setBill_remove_flag(String bill_remove_flag) {
		this.bill_remove_flag = bill_remove_flag;
	}
	public String getPhoto_flag() {
		return photo_flag;
	}
	public void setPhoto_flag(String photo_flag) {
		this.photo_flag = photo_flag;
	}
	public String getInspection_flag() {
		return inspection_flag;
	}
	public void setInspection_flag(String inspection_flag) {
		this.inspection_flag = inspection_flag;
	}
	public String getAircap_flag() {
		return aircap_flag;
	}
	public void setAircap_flag(String aircap_flag) {
		this.aircap_flag = aircap_flag;
	}
	public String getTotal_price() {
		return total_price;
	}
	public void setTotal_price(String total_price) {
		this.total_price = total_price;
	}
	public String getRecipient_name() {
		return recipient_name;
	}
	public void setRecipient_name(String recipient_name) {
		this.recipient_name = recipient_name;
	}
	public String getUsage_cd() {
		return usage_cd;
	}
	public void setUsage_cd(String usage_cd) {
		this.usage_cd = usage_cd;
	}
	public String getRecipient_joomin_no() {
		return recipient_joomin_no;
	}
	public void setRecipient_joomin_no(String recipient_joomin_no) {
		this.recipient_joomin_no = recipient_joomin_no;
	}
	public String getRecipient_phone1() {
		return recipient_phone1;
	}
	public void setRecipient_phone1(String recipient_phone1) {
		this.recipient_phone1 = recipient_phone1;
	}
	public String getSample6_postcode() {
		return sample6_postcode;
	}
	public void setSample6_postcode(String sample6_postcode) {
		this.sample6_postcode = sample6_postcode;
	}
	public String getSample6_address() {
		return sample6_address;
	}
	public void setSample6_address(String sample6_address) {
		this.sample6_address = sample6_address;
	}
	public String getSample6_detailAddress() {
		return sample6_detailAddress;
	}
	public void setSample6_detailAddress(String sample6_detailAddress) {
		this.sample6_detailAddress = sample6_detailAddress;
	}
	public String getSample6_extraAddress() {
		return sample6_extraAddress;
	}
	public void setSample6_extraAddress(String sample6_extraAddress) {
		this.sample6_extraAddress = sample6_extraAddress;
	}
	public String getIVC_TY_CD() {
		return IVC_TY_CD;
	}
	public void setIVC_TY_CD(String iVC_TY_CD) {
		IVC_TY_CD = iVC_TY_CD;
	}
	public String getShip_request() {
		return ship_request;
	}
	public void setShip_request(String ship_request) {
		this.ship_request = ship_request;
	}
	
	@Override
	public String toString() {
		return "ApplicationInfo [loc_cd=" + loc_cd + ", ship_method=" + ship_method + ", ship_type=" + ship_type
				+ ", mall_order_no=" + mall_order_no + ", mall_cd=" + mall_cd + ", image=" + image + ", package_brand="
				+ Arrays.toString(package_brand) + ", package_unitprice=" + Arrays.toString(package_unitprice)
				+ ", package_price=" + Arrays.toString(package_price) + ", package_name="
				+ Arrays.toString(package_name) + ", package_qty=" + Arrays.toString(package_qty) + ", package_cate="
				+ Arrays.toString(package_cate) + ", package_color=" + Arrays.toString(package_color)
				+ ", tracking_num=" + Arrays.toString(tracking_num) + ", package_size=" + Arrays.toString(package_size)
				+ ", box_remove_flag=" + box_remove_flag + ", polybag_flag=" + polybag_flag + ", bill_remove_flag="
				+ bill_remove_flag + ", photo_flag=" + photo_flag + ", inspection_flag=" + inspection_flag
				+ ", aircap_flag=" + aircap_flag + ", total_price=" + total_price + ", recipient_name=" + recipient_name
				+ ", usage_cd=" + usage_cd + ", recipient_joomin_no=" + recipient_joomin_no + ", recipient_phone1="
				+ recipient_phone1 + ", sample6_postcode=" + sample6_postcode + ", sample6_address=" + sample6_address
				+ ", sample6_detailAddress=" + sample6_detailAddress + ", sample6_extraAddress=" + sample6_extraAddress
				+ ", IVC_TY_CD=" + IVC_TY_CD + ", ship_request=" + ship_request + "]";
	}
	
	
	

	

}

