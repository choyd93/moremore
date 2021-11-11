package com.spring.more.project.serviceimpl;

import java.util.HashMap;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.more.project.service.ProjectVO;

@Repository
public class ProjectDAO {
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public ProjectVO selectOneProject(String pro_no) {
		return mybatis.selectOne("project.selectOneProject", pro_no);
	}

	public List<ProjectVO> bestItemList() {
		return mybatis.selectList("project.bestItemList");
	}
	
	public List<ProjectVO> recommendItemList() {
		return mybatis.selectList("project.recommendItemList");
	}
	
	public List<ProjectVO> hashTagItemList() {
		return mybatis.selectList("project.hashTagItemList");
	}
	
	public List<ProjectVO> searchFunding(ProjectVO vo) {
		return mybatis.selectList("project.searchFunding", vo);
	}
	
	public List<ProjectVO> searchItemList(String pro_stitle) {
		return mybatis.selectList("project.searchItemList", pro_stitle);
	}

	public int insertProject(ProjectVO vo) {
//		Map<String, String> map = new HashMap<String, String>();
//		map.put("user_name", vo.getUser_name());
//		map.put("user_id", vo.getUser_id());
//		map.put("user_pwd", vo.getUser_pwd());
//		map.put("user_phone", vo.getUser_phone());
//		map.put("user_email", vo.getUser_email());
//		map.put("user_gender", vo.getUser_gender());
//		map.put("user_address", vo.getUser_address());
//		map.put("user_address_number", vo.getUser_address_number());

//		System.out.println(map);
		System.out.println(vo);
		return mybatis.insert("project.insertProject", vo);
	}

	public int updateProject(ProjectVO vo) {
		System.out.println(vo);
		return mybatis.update("project.updateProject", vo);
	}

	public int deleteProject(ProjectVO vo) {
		return mybatis.update("project.deleteProject", vo);
	}

}