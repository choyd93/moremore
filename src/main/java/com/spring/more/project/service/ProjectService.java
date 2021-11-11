package com.spring.more.project.service;

import java.util.List;

public interface ProjectService {
	public ProjectVO selectOneProject(String pro_no);
	public List<ProjectVO> bestItemList();
	public List<ProjectVO> recommendItemList();
	public List<ProjectVO> hashTagItemList(); 
	public List<ProjectVO> searchFunding(ProjectVO vo); 
	public List<ProjectVO> searchItemList(String pro_stitle); 

	public int insertProject(ProjectVO vo);
	public int updateProject(ProjectVO vo);
	public int deleteProject(ProjectVO vo);
}
