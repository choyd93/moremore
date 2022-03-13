package com.spring.more.project.serviceimpl;

import java.util.HashMap;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.more.project.service.GoodsVO;
import com.spring.more.project.service.ProjectVO;
import com.spring.more.project.service.WishListVO;
import com.spring.more.users.service.UsersVO;

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

	public int deleteProject(ProjectVO vo) {
		return mybatis.update("project.deleteProject", vo);
	}
	
	public void insertFunding(ProjectVO vo) {
		
		mybatis.insert("more.insertFunding", vo);
	}

	public ProjectVO getOneOfLists(ProjectVO vo) {
		return mybatis.selectOne("more.selectOne", vo);
	}

	public void updateProject(ProjectVO vo) {
		mybatis.update("more.updateFunding", vo);
	}

	public List<ProjectVO> getListAll() {
		return mybatis.selectList("more.selectList");
	}
	
	public List<ProjectVO> paging (Map<String, String> map) {
		return mybatis.selectList("more.paging", map);
	}

	public List<ProjectVO> getOneList(ProjectVO vo) {
		return mybatis.selectList("more.selectOneList", vo);
	}

	public int getTotalPage(String total) {
		return mybatis.selectOne("more.totalPage", total);
	}

	public List<GoodsVO> getGoodsList(String pro_no) {
		return mybatis.selectList("more.getGoodsList", pro_no);
	}

	public void updateGoods(GoodsVO gVO) {
		mybatis.update("more.updateGoods",gVO);
	}

	public void insertGoods(GoodsVO gVO) {
		mybatis.insert("more.insertGoods",gVO);		
	}
	
	// 은해누나
	public ProjectVO getOneProject(ProjectVO vo) {
		return mybatis.selectOne("project.getOneProject", vo);
	}
	
	public List<GoodsVO> getProGoodsList(ProjectVO vo) {
		return mybatis.selectList("project.getProGoodsList", vo);
	}
	
	// 투자자구하기
	public String getInvestorNumber(ProjectVO vo) {
		return mybatis.selectOne("project.getInvestorNumber", vo);
	}

	// 투자금액 구하기
	public String getInvestmentAmount(ProjectVO vo) {
		return mybatis.selectOne("project.getInvestmentAmount", vo);
	}

	// 좋아요
	public String getWishList(ProjectVO vo) {
		return mybatis.selectOne("project.getWishList", vo);
	}

	// 회사정보 추가
	public List<UsersVO> getCompanyInformation(ProjectVO vo) {
		return mybatis.selectList("project.getCompanyInformation", vo);
	}

	// 서포터 정보
	public List<ProjectVO> getSupporterList(ProjectVO vo) {
		return mybatis.selectList("project.getSupporterList", vo);
	}
	

	public void updateCloseProject(ProjectVO vo) {
		mybatis.update("more.updateCloseProject", vo);
	}
	
	// 좋아요 등록
		public void insertWishList(WishListVO wvo) {
			//System.out.println(" DAO > insertWishList() 좋아요 등록"+ wvo.toString());
			mybatis.insert("payment.insertWishList", wvo);
		}
		
		// 좋아요 취소
		public void deleteWishList(WishListVO wvo) {
			//System.out.println(" DAO > deleteWishList() 좋아요 삭제"+ wvo.toString());
			mybatis.delete("payment.deleteWishList", wvo);
		}
		// 좋아요 체크
		public WishListVO getOneWishList(WishListVO wvo) {
			return mybatis.selectOne("payment.getOneWishList",wvo);
		}

		public List<ProjectVO> fundingCateItemList(Map<String, String> map) {
			return mybatis.selectList("project.fundingCateItemList",map);
		}
	

}