package ks44team03.admin.mapper;

import org.apache.ibatis.annotations.Mapper;

import ks44team03.dto.Nodata;

@Mapper
public interface IncomingWarehouseManageMapper {
	
	//노데이터 입고등록
	public int regNodata(Nodata nodata);

}
