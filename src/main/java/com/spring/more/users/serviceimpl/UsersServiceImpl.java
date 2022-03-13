package com.spring.more.users.serviceimpl;

import java.util.List;
import java.util.Map;

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
	
	// 은해누나
	@Override
	public UsersVO getOneUsers(UsersVO vo) {
		return usersDAO.getUsers(vo);
	}

	@Override
	public List<UsersVO> getUsersList() {
		return null;
	}
	
	// 태용
	@Override
	public String chk_idOrEmail(Map<String, String> map) {
		return usersDAO.chk_idOrEmail(map);
	}

}
