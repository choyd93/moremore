package com.spring.more.users.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.spring.more.users.service.UsersService;
import com.spring.more.users.service.UsersVO;

// 세션 자동으로 저장해주는 어노테이션
@SessionAttributes("loginUsers")
@Controller
public class UsersController {
	@Autowired
	private UsersService usersService;
	
	@RequestMapping(value = "/signup.do", method = RequestMethod.POST)
	public String signup(UsersVO vo, Model model) {
		usersService.insertUsers(vo);
		model.addAttribute("signupUsers", vo);
		return "signupSuccess.jsp";
		//return "login.jsp";
	}
	
	@RequestMapping(value = "/signup.do", method = RequestMethod.GET)
	public String signupView() {
		return "signup.jsp";
	}
	
	@RequestMapping(value = "/login.do", method = RequestMethod.GET)
	public String loginView() {
		return "login.jsp";
	}
	
	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public String login(UsersVO vo, Model model, HttpServletRequest request) {		
		UsersVO loginUsers = usersService.checkIdPassword(vo.getUser_id(), vo.getUser_pwd());
		if (loginUsers != null) {
			model.addAttribute("loginUsers", loginUsers);
			return "loginSuccess.jsp";
		} else {
			return "loginFail.jsp";
		}
	}
	
	@RequestMapping(value = "/logout.do", method = RequestMethod.GET)
	public String logout(SessionStatus status, HttpSession session) {
		status.setComplete();
		session.invalidate();
        
        return "home.jsp";        
    }

}