package com.spring.more.project.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.more.project.service.PagingVO;
import com.spring.more.project.service.ProjectService;
import com.spring.more.project.service.ProjectVO;

@Controller
public class FundingAjaxController {

	@Autowired
	private ProjectService projectService;
	
	@RequestMapping(value="paging.do", method = RequestMethod.POST)
	@ResponseBody
	public List<ProjectVO> paging (@RequestBody PagingVO vo, ModelMap model) {
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("user_no",vo.getUser_no());
		map.put("min",vo.getMin());
		map.put("max",vo.getMax());
		List<ProjectVO> list = projectService.paging(map);
		
		int size = projectService.totalPage(vo.getUser_no());
		model.put("totalPage", size);
		return list;
	}
	
	@RequestMapping(value="paging_update.do", method = RequestMethod.POST)
	@ResponseBody
	public List<ProjectVO> paging_update (@RequestBody PagingVO vo, ModelMap model) {
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("user_no",vo.getUser_no());
		map.put("min",vo.getMin());
		map.put("max",vo.getMax());
		List<ProjectVO> list = projectService.paging(map);
		
		int size = projectService.totalPage(vo.getUser_no());
		model.put("totalPage", size);
		return list;
	}
}
