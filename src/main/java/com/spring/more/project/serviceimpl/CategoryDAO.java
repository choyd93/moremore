package com.spring.more.project.serviceimpl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.more.project.service.CategoryVO;
import com.spring.more.project.service.ProjectVO;

@Repository
public class CategoryDAO {

	@Autowired
	private SqlSessionTemplate ssTemplate;
	
	public List<CategoryVO> getCategoryList() {
		List<CategoryVO> list = ssTemplate.selectList("more.getAllList");
		return list;
	}

	public String getCompany_no(ProjectVO vo) {
		return ssTemplate.selectOne("more.getComapanyNoOne", vo);
	}
}
