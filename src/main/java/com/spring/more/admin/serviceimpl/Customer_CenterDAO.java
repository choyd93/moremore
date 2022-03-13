package com.spring.more.admin.serviceimpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.more.admin.service.Customer_CenterVO;
import com.spring.more.project.service.ProjectVO;
import com.spring.more.users.service.UsersVO;

@Repository
public class Customer_CenterDAO {

	@Autowired
	private SqlSessionTemplate mapper;
	
	
	public Map<String, Object> adminMain() {
		System.out.println(">> ::DAO에서 adminMain()실행!");
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		System.out.println("dddddd");
		String cntNew = mapper.selectOne("customer_Center.cntNew").toString();
		System.out.println(cntNew);
		String cntTot = mapper.selectOne("customer_Center.cntTot").toString();
		System.out.println(cntTot);
		String cntOut = mapper.selectOne("customer_Center.cntOut").toString();
		System.out.println(cntOut);
		String waitProj = mapper.selectOne("customer_Center.waitProj").toString();
		System.out.println(waitProj);
		String ingProj = mapper.selectOne("customer_Center.ingProj").toString();
		System.out.println(ingProj);
		String endProj = mapper.selectOne("customer_Center.endProj").toString();
		System.out.println(endProj);
		String cntSales = mapper.selectOne("customer_Center.cntSales").toString();
		System.out.println(cntSales);
		String cntPayment = mapper.selectOne("customer_Center.cntPayment").toString();
		System.out.println(cntPayment);
		String cntCancel = mapper.selectOne("customer_Center.cntCancel").toString();
		System.out.println(cntCancel);
		//이거 추가한거 
		List<Map<String, Object>> today = mapper.selectList("customer_Center.todaySale");
		
		map.put("cntNew", cntNew);
		map.put("cntTot", cntTot);
		map.put("cntOut", cntOut);
		map.put("waitProj", waitProj);
		map.put("ingProj", ingProj);
		map.put("endProj", endProj);
		map.put("cntSale", cntSales);
		map.put("cntPayment", cntPayment);
		map.put("cntCancel", cntCancel);
		map.put("today",today );
		
		return map;
	}


	public List<UsersVO> getUserList(UsersVO vo) { 
		System.out.println("DAO > getUserList()실행");
		List<UsersVO> list = mapper.selectList("customer_Center.getUserList",vo);
		return list;
	}


	public List<ProjectVO> getProjectList(ProjectVO vo) {
		System.out.println("DAO > getProjectList()실행");
		List<ProjectVO> list = mapper.selectList("customer_Center.getProjectList",vo);
		return list;
	}


	public List<Customer_CenterVO> centerList(Customer_CenterVO vo) {
		System.out.println("DAO > CenterList()실행");
		List<Customer_CenterVO> list = mapper.selectList("customer_Center.CenterList",vo);
		return list;
	}


	public void insertNotice(Customer_CenterVO vo) {
		System.out.println("DAO > insertNotice()실행");
		mapper.insert("customer_Center.insertNotice",vo);
	}


	public Customer_CenterVO detailNotice(Customer_CenterVO vo) {
		System.out.println("DAO > detailNotice()실행");
		Customer_CenterVO nn= mapper.selectOne("customer_Center.detailNotice",vo);
		return nn;
	}


	public void updateNotice(Customer_CenterVO vo) {
		System.out.println("DAO > updateNotice()실행");
		mapper.update("customer_Center.updateNotice",vo);
	}


	public void deleteNotice(Customer_CenterVO vo) {
		System.out.println("DAO > deleterNotice()실행");
		mapper.delete("customer_Center.deleteNotice",vo);
		
	}

	public ProjectVO getProj(ProjectVO vo) {
		System.out.println("DAO > getProj()실행");
		ProjectVO pro = mapper.selectOne("customer_Center.getProj",vo);
		return pro;
	}
	
	public Map<String, Object> datePick(Map<String, String> date) {
		System.out.println("DAO > datePick()실행");
		Map<String, Object> map = new HashMap<String, Object>();
		//기간별 매출금액 과 건수
		List<Map<String,Object>> sales = mapper.selectList("customer_Center.datePick", date);
		map.put("sales",sales);
		
		//기간별 반품완료 금액과 건수 
		List<Map<String,Object>> cancel = mapper.selectList("customer_Center.dateCancel", date);
		map.put("cancel",cancel);
		
		//기간별 프로젝트별 매출 순위 
		List<Map<String, Object>> rankProj = mapper.selectList("customer_Center.rankProj",date);		
		map.put("rankProj",rankProj);
		
		//기간별 구매금액이 많은 유저 순위
		List<Map<String, Object>> rankUser = mapper.selectList("customer_Center.rankUser",date);
		map.put("rankUser", rankUser);
		
		//카테고리별 결제건수, 매출, 판매된 수량  
		List<Map<String, Object>> category = mapper.selectList("customer_Center.category",date);
		map.put("category",category);
		
		//여자가 구매한 매출 금액 
		List<Map<String, Object>> womanSale = mapper.selectList("customer_Center.womanTotal",date);
		map.put("womanSale",womanSale);
		
		return map;
	}


	public int cntTot() {
		return mapper.selectOne("customer_Center.cntTot");
	}


	public int cntProj() {
		return mapper.selectOne("customer_Center.cntProj");
	}


	public int cntNotice() {
		return mapper.selectOne("customer_Center.cntNotice");
	}


}
