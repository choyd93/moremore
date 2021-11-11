package com.spring.more.project.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.spring.more.project.service.ProjectService;
import com.spring.more.project.service.ProjectVO;

@Controller
public class ProjectController {
	@Autowired
	private ProjectService projectService;
	
	// 인기 프로젝트 
	@RequestMapping(value = "/bestItemList.do", method = RequestMethod.POST)
	@ResponseBody
	public List<ProjectVO> bestItemList(ProjectVO vo, Model model) {
		List<ProjectVO> projectList = projectService.bestItemList();
		model.addAttribute("projectList", projectList);
		return projectList;
	}
	
	// 추천 프로젝트
	@RequestMapping(value = "/recommendItemList.do", method = RequestMethod.POST)
	@ResponseBody
	public List<ProjectVO> recommendItemList(ProjectVO vo, Model model) {
		List<ProjectVO> projectList = projectService.recommendItemList();
		model.addAttribute("projectList", projectList);
		return projectList;
	}
	
	// 메인 해시태그 첫 화면
	@RequestMapping(value = "/hashTagItemList.do", method = RequestMethod.POST)
	@ResponseBody
	public List<ProjectVO> hashTagItemList(ProjectVO vo, Model model) {
		List<ProjectVO> projectList = projectService.hashTagItemList();
		model.addAttribute("projectList", projectList);
		return projectList;
	}
	
	// 메인 페이지 해시태그 버튼 클릭시 화면
	@RequestMapping(value = "/hashTagItemCateList.do", method = RequestMethod.GET)
	@ResponseBody
	public List<ProjectVO> hashTagItemCateList(@RequestParam(value = "cate") String cate, ProjectVO vo, Model model) {
		if(cate.equals("1")) {
			List<ProjectVO> projectList = projectService.bestItemList();
			model.addAttribute("projectList", projectList);
			return projectList;
		} else if (cate.equals("2")){
			List<ProjectVO> projectList = projectService.recommendItemList();
			model.addAttribute("projectList", projectList);
			return projectList;
		} else if (cate.equals("3")){
			List<ProjectVO> projectList = projectService.hashTagItemList();
			model.addAttribute("projectList", projectList);
			return projectList;
		} else {
			return null;
		}
	}
	
	// 검색한 키워드 jsp로 넘기기
	@RequestMapping(value = "/searchFunding.do", method = RequestMethod.GET)
	public String searchFunding(ProjectVO vo, Model model) {
		System.out.println(vo);
		System.out.println(vo.getPro_stitle());

//		List<ProjectVO> projectList = projectService.searchFunding(vo);
//		model.addAttribute("projectList", projectList);
//		System.out.println("projectList : " + projectList);

		model.addAttribute("keyword", vo.getPro_stitle());

		return "fundingSearch.jsp";
	}
	
	// 검색하기
	@RequestMapping(value = "/searchItemList.do", method = RequestMethod.GET)
	@ResponseBody
	public List<ProjectVO> searchItemList(@RequestParam(value = "keyword") String keyword, ProjectVO vo, Model model) {
		
		System.out.println("searchItemList.do 실행~~");
		System.out.println("keyword : " + keyword);
		String pro_stitle = keyword;
		System.out.println("pro_stitle : " + pro_stitle);

		List<ProjectVO> projectList = projectService.searchItemList(pro_stitle);
		System.out.println("projectList : " + projectList);

		model.addAttribute("projectList", projectList);
//		System.out.println("projectList : " + projectList);

		return projectList;
	}
	
	
	
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