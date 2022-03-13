package com.spring.more.users.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.more.users.service.UsersService;
import com.spring.more.users.service.UsersVO;

@Controller
public class UsersAjaxController {

	@Autowired
	private UsersService us;
	
	@RequestMapping(value="chkIdAndEmail.do", method= RequestMethod.POST)
	@ResponseBody
	public Map<String,String> chkIdOrEmail (@RequestBody UsersVO vo) {
		System.out.println(vo.getUser_id());
		Map<String, String> map = new HashMap<String, String>();
		
		if (vo.getUser_id() != null && vo.getUser_id().trim() != "") {
			map.put("user_id",vo.getUser_id());
			String id = us.chk_idOrEmail(map);
			if (id != null && id.trim() != "") {
				map.put("id","notEmptyId");
				return map;
			} else {
				map.put("id","emptyId");
				return map;
			}
			
		} 
		if (vo.getUser_email() != null && vo.getUser_email().trim() != "") {
			map.put("user_email",vo.getUser_email());
			if (us.chk_idOrEmail(map) != null && us.chk_idOrEmail(map).trim() != "") {
				map.put("email","notEmptyEmail");
				return map;
			} else {
				map.put("email","emptyEmail");
				return map;
			}
		}
		map.put("empty","empty");
		return map;
	}
}
