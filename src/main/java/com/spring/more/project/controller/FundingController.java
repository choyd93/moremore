package com.spring.more.project.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.spring.more.project.service.ProjectService;
import com.spring.more.project.service.GoodsVO;
import com.spring.more.project.service.ProjectVO;
import com.spring.more.project.service.ProjectService;

@Controller
public class FundingController {
	@Autowired
	private ProjectService projectService;
	
	@RequestMapping(value = "/insertFunding.do", method = RequestMethod.POST)
	public String insertFunding(ProjectVO vo, MultipartHttpServletRequest mhsr, GoodsVO GVO, Model model) throws IllegalStateException, IOException {
		System.out.println("유저넘버 : " + vo.getUser_no());

		UUID randomId = UUID.randomUUID();
		// 썸네일 사진
		MultipartFile mf = mhsr.getFile("pro_thumbnail_path_fake");
		String oriThumb = randomId + mf.getOriginalFilename();
		vo.setPro_thumbnail_path("img/thumb/" + oriThumb);
		mf.transferTo(new File("/Users/youngdong/Desktop/코딩 학습/util/70_Spring/moremore/src/main/webapp/img/thumb/" + randomId+oriThumb));
		
		
		// 메인 사진
		List<MultipartFile> listFile = mhsr.getFiles("pro_img_path_fake");
		for(MultipartFile chkMf : listFile) {
			String path = chkMf.getOriginalFilename();
			chkMf.transferTo(new File("/Users/youngdong/Desktop/코딩 학습/util/70_Spring/moremore/src/main/webapp/img/main_img/" + path));
		}
		projectService.insertFunding(vo);
		
			for (int i = 0; i < 3; i++) {
				GVO.setGoods_title(mhsr.getParameterValues("goods_title")[i]);
				GVO.setGoods_content(mhsr.getParameterValues("goods_content")[i]);
				GVO.setGoods_price(mhsr.getParameterValues("goods_price")[i]);
				GVO.setGoods_no(vo.getUser_no());
				projectService.InsertGoods(GVO);
			}
//			model.addAttribute("goods", goodsList);
			
		
		
		return "completeInsertProject2.jsp";
	}
	@RequestMapping("updateCloseProject.do")
	public String updateCloseProject (ProjectVO vo, HttpServletRequest req) {
		if (req.getParameter("reasonTOCloseProject_content") == null) {
			projectService.updateCloseProject(vo);
		} else {
			vo.setReasonTOCloseProject(req.getParameter("reasonTOCloseProject_content"));
			projectService.updateCloseProject(vo);
		}
		
		return "completeUpdateCloseProject.jsp";
	}
	
	@RequestMapping("updateProject.do")
	public String goUpdateProject (ProjectVO vo, Model model) {
		ProjectVO list = projectService.getOneOfProjects(vo);
		model.addAttribute("project", list);
		return "updateProject.jsp";
	}
	// 여기서부터 루트 확인하면 됨.
	// 난 업데이트프로젝트.jsp에서 데이터 수정 후 여기까지 옴.
	@RequestMapping("readyCateToUpdate.do")
	public String getOneOfProjects (ProjectVO vo, Model model) {
		ProjectVO list = projectService.getOneOfProjects(vo);
		model.addAttribute("projectOne", list);
	//		Map<String,String> cateList = (Map<String,String>) req.getAttribute("cateList");
		List<GoodsVO> GoodsList = projectService.getGoodsList(vo.getPro_no()); 
		model.addAttribute("Goods", GoodsList);
		System.out.println(GoodsList + " <<< goods");
		return "cateSetting.do";
	}
	
	@RequestMapping(value="completeUpdateProject.do", method = RequestMethod.POST)
	public String completeUpdateProject(ProjectVO vo, MultipartHttpServletRequest mhsr, GoodsVO GVO, HttpServletRequest request) throws IllegalStateException, IOException {
			
			List<MultipartFile> list = mhsr.getFiles("pro_img_path_fake");
			String uploadPath = request.getSession().getServletContext().getRealPath("/src/main/webapp/");
			
			UUID randomId = UUID.randomUUID();
			if (mhsr.getFile("pro_thumbnail_path_fake") != null) {
				MultipartFile thumbMf = mhsr.getFile("pro_thumbnail_path_fake");
				String name = randomId+thumbMf.getOriginalFilename();
				thumbMf.transferTo(new File("/Users/youngdong/Desktop/코딩 학습/util/70_Spring/moremore/src/main/webapp/img/thumb/"+name));
				vo.setPro_thumbnail_path("img/thumb/"+name);
			}
			
			String uploadPath_img = request.getSession().getServletContext().getRealPath("/src/main/webapp/");
			if (list != null) {
				for (MultipartFile mf : list) {
					if (!mf.getOriginalFilename().trim().equals("")) {					
						String path = mf.getOriginalFilename();
						mf.transferTo(new File("/Users/youngdong/Desktop/코딩 학습/util/70_Spring/moremore/src/main/webapp/img/main_img/" + path));
					}
				}
			}
			
				List<GoodsVO> goodsList = new ArrayList<GoodsVO>();
				for (int i = 0; i < 3; i++) {
					GVO.setGoods_title(mhsr.getParameterValues("goods_title")[i]);
					System.out.println("1 + : 타이틀 - " + mhsr.getParameterValues("goods_title")[i]);
					GVO.setGoods_content(mhsr.getParameterValues("goods_content")[i]);
					System.out.println("2 + : 내용 - " + mhsr.getParameterValues("goods_content")[i]);
					GVO.setGoods_price(mhsr.getParameterValues("goods_price")[i]);
					System.out.println("3 + : 가격 - " + mhsr.getParameterValues("goods_price")[i]);
					GVO.setGoods_no(mhsr.getParameterValues("goods_no")[i]);
					System.out.println("4 + : 넘버 - " + mhsr.getParameterValues("goods_no")[i]);
					goodsList.add(GVO);
				}
				projectService.updateGoods(GVO);
			
			projectService.updateProject(vo);
		return "completeUpdateProject.jsp";
	}
	
	@RequestMapping("closeProject.do")
	public String CloseProject (ProjectVO vo, Model model, HttpServletRequest req) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("user_no",vo.getUser_no());
		if (req.getParameter("min") == null) {
			map.put("min","0");
			map.put("max","10");
		} else {
			map.put("min",req.getParameter("min"));
			map.put("max",req.getParameter("max"));
		}
		List<ProjectVO> size = projectService.getOneList(vo);
		List<ProjectVO> list = projectService.paging(map);
		model.addAttribute("project", list);
		model.addAttribute("totalPage",size.size());
		if (req.getAttribute("nowPage") != null) {
			model.addAttribute("nowPage", req.getAttribute("nowPage"));
		}
		return "closeProject.jsp";
	}
	
	@RequestMapping("paging_update.do")
	public String updateProject (ProjectVO vo, Model model, HttpServletRequest req) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("user_no",vo.getUser_no());
		if (req.getParameter("min") == null) {
			map.put("min","0");
			map.put("max","10");
		} else {
			map.put("min",req.getParameter("min"));
			map.put("max",req.getParameter("max"));
		}
		List<ProjectVO> size = projectService.getOneList(vo);
		List<ProjectVO> list = projectService.paging(map);
		model.addAttribute("project", list);
		model.addAttribute("totalPage",size.size());
		if (req.getAttribute("nowPage") != null) {
			model.addAttribute("nowPage", req.getAttribute("nowPage"));
		}
		return "update_page_go.jsp";
	}
	
	@RequestMapping("closeProject_application.do")
	public String closeProject_application (ProjectVO vo, Model model) {
		ProjectVO list = projectService.getOneOfProjects(vo);
		model.addAttribute("project", list);
		return "closeProject_application.jsp";
	}
	
}
