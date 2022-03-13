package com.spring.more.admin.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.more.admin.service.Customer_CenterService;
import com.spring.more.admin.service.Customer_CenterVO;
import com.spring.more.project.service.ProjectVO;
import com.spring.more.users.service.UsersVO;

@Service("customer_CenterService")
public class Customer_CenterServiceImpl implements Customer_CenterService{
	@Autowired
	private Customer_CenterDAO customer_CenterDAO;
	
	public Customer_CenterServiceImpl() {
		System.out.println(":: Customer_CenterServiceImpl() 객체생성");
	}
	
	@Override
	public Map<String, Object> adminMain() {
		Map<String, Object> map = customer_CenterDAO.adminMain();
		return map;
	}

	@Override
	public List<UsersVO> getUserList(UsersVO vo) {
		System.out.println("Service > getUserList() 실행");
		List<UsersVO> list = customer_CenterDAO.getUserList(vo);
		return list;
	}

	@Override
	public List<ProjectVO> getProjectList(ProjectVO vo) {
		System.out.println("Service > getProjectList() 실행");
		List<ProjectVO> list = customer_CenterDAO.getProjectList(vo);
		return list;
	}

	@Override
	public List<Customer_CenterVO> centerList(Customer_CenterVO vo) {
		System.out.println("Service > centerList() 실행");
		List<Customer_CenterVO> list = customer_CenterDAO.centerList(vo);
		return list;
	}

	@Override
	public void insertNotice(Customer_CenterVO vo) {
		System.out.println("Service > insertNotice()실행");
		customer_CenterDAO.insertNotice(vo);
		
	}

	@Override
	public Customer_CenterVO detailNotice(Customer_CenterVO vo) {
		System.out.println("Service > detailNotice()실행");
		Customer_CenterVO nn = customer_CenterDAO.detailNotice(vo);
		
		return nn;
	}

	@Override
	public void updateNotice(Customer_CenterVO vo) {
		System.out.println("Service > updateNotice()실행");
		customer_CenterDAO.updateNotice(vo);
	}

	@Override
	public void deleteNotice(Customer_CenterVO vo) {
		System.out.println("Service > deleteNotice()실행");
		customer_CenterDAO.deleteNotice(vo);
		
	}

	@Override
	public ProjectVO getProj(ProjectVO vo) {
		System.out.println("Service > getProj()실행");
		ProjectVO pro = customer_CenterDAO.getProj(vo);
		
		return pro;
	}

	@Override
	public Map<String, Object> datePick(Map<String, String> date) {
		System.out.println("Service > datePick()실행");
		Map<String, Object> map = customer_CenterDAO.datePick(date);
		
		return map;
	}

	@Override
	public int cntTot() {
		return customer_CenterDAO.cntTot();
	}

	@Override
	public int getProjectCnt() {
		return customer_CenterDAO.cntProj();
	}

	@Override
	public int cntNotice() {
		return customer_CenterDAO.cntNotice();
	}
	

}
