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
		Map<String, String> map = new HashMap<String, String>();
		map.put("id", vo.getUser_id());
		map.put("password", vo.getUser_pwd());
		map.put("name", vo.getUser_name());
		map.put("email", vo.getUser_email());
		System.out.println(map);
		return mybatis.insert("users.insertUsers", vo);
	}

	public int updateUsers(UsersVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteUsers(String user_id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public UsersVO checkIdPassword(String user_id, String user_pwd) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("user_id", user_id);
		map.put("user_pwd", user_pwd);
		return mybatis.selectOne("users.checkIdPassword", map);
	}

}