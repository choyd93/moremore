package com.spring.more.users.service;

import java.util.List;

public interface UsersService {
	public UsersVO selectOneUsers(String user_id);
	public List<UsersVO> selectAllUsers();
	public int insertUsers(UsersVO vo);
	public int updateUsers(UsersVO vo);
	public int deleteUsers(UsersVO vo);
	public UsersVO checkIdPassword(String user_id, String user_pwd);

}
