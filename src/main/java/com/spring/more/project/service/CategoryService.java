package com.spring.more.project.service;

import java.util.List;

public interface CategoryService {
	public List<CategoryVO> getCategoryList();

	public String getCompany_no(ProjectVO vo);
}	
