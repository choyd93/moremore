package com.spring.more.project.service;

import java.util.List;

public interface ProjectService {
	public ProjectVO selectOneProject(String pro_no);
	public List<ProjectVO> selectAllProject();
	public int insertProject(ProjectVO vo);
	public int updateProject(ProjectVO vo);
	public int deleteProject(ProjectVO vo);
}
