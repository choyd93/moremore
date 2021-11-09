package com.spring.more.users.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.more.users.service.UsersService;
import com.spring.more.users.service.UsersVO;

@Service("usersService")
public class UsersServiceImpl implements UsersService {
	@Autowired
	private UsersDAO usersDAO;
	
	@Override
	public UsersVO selectOneUsers(String user_id) {
		return usersDAO.selectOneUsers(user_id);
	}

	@Override
	public List<UsersVO> selectAllUsers() {
		return usersDAO.selectAllUsers();
	}

	@Override
	public int insertUsers(UsersVO vo) {
		return usersDAO.insertUsers(vo);
	}

	@Override
	public int updateUsers(UsersVO vo) {
		return usersDAO.updateUsers(vo);
	}

	@Override
	public int deleteUsers(UsersVO vo) {
		return usersDAO.deleteUsers(vo);
	}

	@Override
	public UsersVO checkIdPassword(String user_id, String user_pwd) {
		return usersDAO.checkIdPassword(user_id, user_pwd);
	}

}
