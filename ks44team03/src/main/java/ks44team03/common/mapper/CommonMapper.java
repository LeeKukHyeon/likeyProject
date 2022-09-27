package ks44team03.common.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommonMapper {
	
	public String getCommonPkCode(String tableName, String columnName);
}
