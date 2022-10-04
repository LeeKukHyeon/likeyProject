package ks44team03.dao;

import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import ks44team03.dto.MemberDTO;

@Mapper
public class MemberDAO {
	/*
	 * // 일반 member 추가
	 * 
	 * @Insert("INSERT INTO user_member (u_id, u_pw, u_name, u_addr, u_email, u_birth, u_phone, u_nick)"
	 * +
	 * "values(#{uId}, #{uPw}, #{uName}, #{uAddr}, #{uEmail}, #{uBirth}, #{uPhone}, #{uNick})"
	 * ) int insertUserMember(MemberDTO dto);
	 * 
	 * // 일반 유저 아이디 중복 검사
	 * 
	 * @Select("SELECT u_id FROM user_member WHERE u_id= #{uId}") String
	 * checkIdUser(@Param("uId")String uId);
	 */
}
