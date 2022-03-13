package com.spring.more.project.controller;

import java.util.HashMap;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.more.project.service.CategoryService;
import com.spring.more.project.service.CategoryVO;
import com.spring.more.project.service.ProjectVO;


@Controller
public class CategoryController {
	@Autowired
	private CategoryService cs;
	
	@ModelAttribute("cateList")
	public Map<String, String> openFundingCategory () {
		Map<String, String> map = new HashMap<String, String>();
		List<CategoryVO> list = cs.getCategoryList();
		for(int i = 0; i < list.size(); i++ ) {
			map.put(list.get(i).getPro_cateNo(), list.get(i).getPro_cateName());
		}
		return map;
	}
	
	@RequestMapping("funding_submit.do")
	public String openFundingList (ProjectVO vo, Model model) {
		String company_no = cs.getCompany_no(vo);
		model.addAttribute("company_no", company_no);
		return "openFunding.jsp";
	}
	
	@RequestMapping("cateSetting.do")
	public String readyCateToUpdate (Model model, HttpServletRequest req, ProjectVO vo) {
		System.out.println(req.getAttribute("projectOne"));
		model.addAttribute("projectOne", req.getAttribute("projectOne"));
		return "onGoingUpdate.jsp";
	}
	
//	@RequestMapping("")
//	public List<CategoryVO> getCategoryList () {
//		return cs.getCategoryList();
//	}
}
