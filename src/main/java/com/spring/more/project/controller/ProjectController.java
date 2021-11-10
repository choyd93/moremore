package com.spring.more.project.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.spring.more.project.service.ProjectService;
import com.spring.more.project.service.ProjectVO;

@Controller
public class ProjectController {
	@Autowired
	private ProjectService projectService;
	
	// 테스트 
	
	@RequestMapping(value = "/projectItemList.do", method = RequestMethod.POST)
	@ResponseBody
	public List<ProjectVO> selectAllProject(ProjectVO vo, Model model) {
		List<ProjectVO> projectList = projectService.selectAllProject();
		model.addAttribute("projectList", projectList);
		return projectList;
	}
//	
//	@RequestMapping(value = "/signup.do", method = RequestMethod.POST)
//	public String signup(ProjectVO vo, Model model) {
//		projectService.insertProject(vo);
//		model.addAttribute("loginUsers", vo);
//		return "signupSuccess.jsp";
//		//return "login.jsp";
//	}
//	
//	@RequestMapping(value = "/signup.do", method = RequestMethod.GET)
//	public String signupView() {
//		return "signup.jsp";
//	}
//	
//	@RequestMapping(value = "/login.do", method = RequestMethod.GET)
//	public String loginView() {
//		return "login.jsp";
//	}
//	
//	
//	@RequestMapping(value = "/logout.do", method = RequestMethod.GET)
//	public String logout(SessionStatus status, HttpSession session) {
//		status.setComplete();
//		session.invalidate();
//        
//        return "login.jsp";        
//    }
//	
//	@RequestMapping(value = "/updateUsers.do", method = RequestMethod.POST)
//	public String updateUsers(ProjectVO vo, Model model) {
//		projectService.updateProject(vo);
//		model.addAttribute("loginUsers", vo);
//		return "updateUserSuccess.jsp";
//	}
//	

	
}