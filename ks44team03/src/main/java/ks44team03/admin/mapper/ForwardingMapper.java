package ks44team03.admin.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ks44team03.dto.IncomingInfo;

@Mapper
public interface ForwardingMapper {
	
	//출고 등록 대기 리스트
	public List<IncomingInfo> regForwardingList();
	
	//출고등록 모달 - 특정 상품코드 조회
	public Map<String, Object> forwardingGoodsInfoByCode(String goodsInfoCode);
	
}