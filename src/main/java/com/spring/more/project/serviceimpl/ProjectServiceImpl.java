package com.spring.more.project.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.more.project.service.ProjectService;
import com.spring.more.project.service.ProjectVO;

@Service("projectService")
public class ProjectServiceImpl implements ProjectService {
	@Autowired
	private ProjectDAO projectDAO;

	@Override
	public ProjectVO selectOneProject(String pro_no) {
		return projectDAO.selectOneProject(pro_no);
	}

	@Override
	public List<ProjectVO> bestItemList() {
		return projectDAO.bestItemList();
	}
	
	@Override
	public List<ProjectVO> recommendItemList() {
		return projectDAO.recommendItemList();
	}
	
	@Override
	public List<ProjectVO> hashTagItemList() {
		return projectDAO.hashTagItemList();
	}
	
	@Override
	public List<ProjectVO> searchFunding(ProjectVO vo) {
		return projectDAO.searchFunding(vo);
	}
	
	@Override
	public List<ProjectVO> searchItemList(String pro_stitle) {
		return projectDAO.searchItemList(pro_stitle);
	}
	
	@Override
	public int insertProject(ProjectVO vo) {
		return projectDAO.insertProject(vo);
	}

	@Override
	public int updateProject(ProjectVO vo) {
		return projectDAO.updateProject(vo);
	}

	@Override
	public int deleteProject(ProjectVO vo) {
		return projectDAO.deleteProject(vo);
	}
	
}
