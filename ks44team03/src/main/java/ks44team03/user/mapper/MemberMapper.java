package ks44team03.user.mapper;

import org.apache.ibatis.annotations.Mapper;
import ks44team03.dto.MemberDTO;

@Mapper
public interface MemberMapper{
	
	public int signup(MemberDTO member);
	
}