package com.spring.more.project.serviceimpl;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.more.project.service.CategoryService;
import com.spring.more.project.service.CategoryVO;
import com.spring.more.project.service.ProjectVO;


@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryDAO cd;
	
	@Override
	public List<CategoryVO> getCategoryList() {
		return cd.getCategoryList();
	}

	@Override
	public String getCompany_no(ProjectVO vo) {
		return cd.getCompany_no(vo);
	}

}
