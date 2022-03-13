package com.spring.more.users.service;

import java.util.List;
import java.util.Map;

public interface UsersService {
	public UsersVO selectOneUsers(String user_id);
	public List<UsersVO> selectAllUsers();
	public int insertUsers(UsersVO vo);
	public int updateUsers(UsersVO vo);
	public int deleteUsers(UsersVO vo);
	public UsersVO checkIdPassword(String user_id, String user_pwd);
	
	// 은해누나
	UsersVO getOneUsers(UsersVO vo);
	List<UsersVO> getUsersList();
	
	//태용
	public String chk_idOrEmail(Map<String, String> map);

}
