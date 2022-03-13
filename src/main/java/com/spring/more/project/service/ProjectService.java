package com.spring.more.project.service;

import java.util.List;
import java.util.Map;

import com.spring.more.users.service.UsersVO;

public interface ProjectService {
	// 영동
	public ProjectVO selectOneProject(String pro_no);
	public List<ProjectVO> bestItemList();
	public List<ProjectVO> recommendItemList();
	public List<ProjectVO> hashTagItemList(); 
	public List<ProjectVO> searchFunding(ProjectVO vo); 
	public List<ProjectVO> searchItemList(String pro_stitle); 

//	// 안쓸듯
	public int insertProject(ProjectVO vo);
	public int deleteProject(ProjectVO vo);
	
	
	// 태용
	public void insertFunding (ProjectVO vo); 
	public ProjectVO getOneOfProjects (ProjectVO vo);
//	public void updateProject(ProjectVO vo);
	public List<ProjectVO> getListAll();
	List<ProjectVO> paging(Map<String, String> map);
	public List<ProjectVO> getOneList(ProjectVO vo);
	int totalPage(String total);
	public List<GoodsVO> getGoodsList(String pro_no);
	public void updateGoods(GoodsVO gVO);
	public void InsertGoods(GoodsVO gVO);
	public void updateCloseProject(ProjectVO vo);
	
	// 은해누나
//	void insertProject(ProjectVO vo);
	void updateProject(ProjectVO vo);
//	void deleteProject(ProjectVO vo);
	ProjectVO getOneProject(ProjectVO vo);
	List<ProjectVO> getProjectList(String pro_no);
	
	// 최종통합 은해누나
	public String getWishList(ProjectVO vo);
	public List<ProjectVO> getSupporterList(ProjectVO pro);
	public String getInvestmentAmount(ProjectVO pro);
	public String getInvestorNumber(ProjectVO pro);
	
	
	//굿즈리스트
	List<GoodsVO> getProGoodsList(ProjectVO vo);
	public List<UsersVO> getCompanyInformation(ProjectVO pro);
	
	
	

	void insertWishList(WishListVO wvo);
	void deleteWishList(WishListVO wvo);
//	List<WishProVO> getWishList();
//	List<WishProVO> getWishList(WishProVO wpvo);
	WishListVO checkWishlist(WishListVO wvo);
	public List<ProjectVO> fundingCateItemList(Map<String, String> map);
	
}
