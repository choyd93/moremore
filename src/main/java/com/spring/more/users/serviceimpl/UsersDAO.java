package com.spring.more.users.serviceimpl;

import java.util.HashMap;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.more.users.service.UsersVO;

@Repository
public class UsersDAO {
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public UsersVO selectOneUsers(String user_id) {
		return mybatis.selectOne("users.selectOneUsers", user_id);
	}

	public List<UsersVO> selectAllUsers() {
		return mybatis.selectList("users.selectOneUsers");
	}

	public int insertUsers(UsersVO vo) {
//		Map<String, String> map = new HashMap<String, String>();
//		map.put("user_name", vo.getUser_name());
//		map.put("user_id", vo.getUser_id());
//		map.put("user_pwd", vo.getUser_pwd());
//		map.put("user_phone", vo.getUser_phone());
//		map.put("user_email", vo.getUser_email());
//		map.put("user_gender", vo.getUser_gender());
//		map.put("user_address", vo.getUser_address());
//		map.put("user_address_number", vo.getUser_address_number());

//		System.out.println(map);
		System.out.println(vo);
		return mybatis.insert("users.insertUsers", vo);
	}

	public int updateUsers(UsersVO vo) {
		System.out.println(vo);
		return mybatis.update("users.updateUsers", vo);
	}

	public int deleteUsers(UsersVO vo) {
		return mybatis.update("users.deleteUsers", vo);
	}

	public UsersVO checkIdPassword(String user_id, String user_pwd) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("user_id", user_id);
		map.put("user_pwd", user_pwd);
		return mybatis.selectOne("users.checkIdPassword", map);
	}
	
	// 은해누나
	public UsersVO getUsers(UsersVO vo) {
		System.out.println(">> myBatis로 getUsers() 실행");
		return mybatis.selectOne("UsersDAO.getUsers", vo);
		
	}
	
	// 태용 -- 이메일체크
	public String chk_idOrEmail(Map<String, String> map) {
		return mybatis.selectOne("users.chkIdOrEmail", map);
	}

}