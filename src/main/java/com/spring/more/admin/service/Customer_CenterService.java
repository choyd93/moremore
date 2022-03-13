package com.spring.more.admin.service;

import java.util.List;

import java.util.Map;

import com.spring.more.project.service.ProjectVO;
import com.spring.more.users.service.UsersVO;

public interface Customer_CenterService {
	//AdminMain
	Map<String, Object> adminMain();
	//userList
	List<UsersVO> getUserList(UsersVO vo);
	//projectList
	List<ProjectVO> getProjectList(ProjectVO vo);
	//customerSenterList
	List<Customer_CenterVO> centerList(Customer_CenterVO vo);
	//insertNotice
	void insertNotice(Customer_CenterVO vo);
	//공지사항 상세보기
	Customer_CenterVO detailNotice(Customer_CenterVO vo);
	//공지사항 수정 
	void updateNotice(Customer_CenterVO vo);
	//공지사항 삭제 
	void deleteNotice(Customer_CenterVO vo);
	//프로젝트 상세보기 
	ProjectVO getProj(ProjectVO vo);
	//---------------------------------------------------------------
	//기간별 매출조회
	Map<String, Object> datePick(Map<String, String> date);
	//총 회원수 
	int cntTot();
	//총 프로젝트 수 
	int getProjectCnt();
	//총 공지사항 글 수 
	int cntNotice();
	
	
	

}
