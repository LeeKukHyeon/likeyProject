package ks44team03.admin.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ks44team03.dto.IncomingInfo;

@Mapper
public interface ForwardingMapper {
	
	//출고 등록 대기 리스트
	public List<IncomingInfo> regForwardingList();
	
	//출고 등록
	public int regForwarding(IncomingInfo incominginfo);
	
	//출고등록 모달 - 특정 상품코드 조회
	public Map<String, Object> forwardingGoodsInfoByCode(String goodsInfoCode);
	
	//출고완료 상품목록
	public List<IncomingInfo> forwardingList(); 
	
	//출고완료 상태 업데이트
	public void updateForwarding(String goodsInfoCode);
}