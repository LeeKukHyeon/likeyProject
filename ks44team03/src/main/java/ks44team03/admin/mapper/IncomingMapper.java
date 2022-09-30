package ks44team03.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks44team03.dto.Incoming;

@Mapper
public interface IncomingMapper {
	
	//입고 등록
	public int regIncoming(Incoming incoming);
	
	//입고 현황 조회
	public List<Incoming> incomingCurrentState();
}
