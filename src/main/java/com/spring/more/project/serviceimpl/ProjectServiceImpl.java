package com.spring.more.project.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.more.project.service.GoodsVO;
import com.spring.more.project.service.ProjectService;
import com.spring.more.project.service.ProjectVO;
import com.spring.more.project.service.WishListVO;
import com.spring.more.users.service.UsersVO;

@Service("projectService")
public class ProjectServiceImpl implements ProjectService {
	@Autowired
	private ProjectDAO projectDAO;

	@Override
	public ProjectVO selectOneProject(String pro_no) {
		return projectDAO.selectOneProject(pro_no);
	}

	@Override
	public List<ProjectVO> bestItemList() {
		return projectDAO.bestItemList();
	}
	
	@Override
	public List<ProjectVO> recommendItemList() {
		return projectDAO.recommendItemList();
	}
	
	@Override
	public List<ProjectVO> hashTagItemList() {
		return projectDAO.hashTagItemList();
	}
	
	@Override
	public List<ProjectVO> searchFunding(ProjectVO vo) {
		return projectDAO.searchFunding(vo);
	}
	
	@Override
	public List<ProjectVO> searchItemList(String pro_stitle) {
		return projectDAO.searchItemList(pro_stitle);
	}
	
	@Override
	public int insertProject(ProjectVO vo) {
		return projectDAO.insertProject(vo);
	}

	@Override
	public int deleteProject(ProjectVO vo) {
		return projectDAO.deleteProject(vo);
	}

	@Override
	public void insertFunding(ProjectVO vo) {
		projectDAO.insertFunding(vo);
	}

	@Override
	public ProjectVO getOneOfProjects(ProjectVO vo) {
		return projectDAO.getOneOfLists(vo);
	}
	
	@Override
	public void updateProject (ProjectVO vo) {
		projectDAO.updateProject(vo);
	}

	@Override
	public List<ProjectVO> getListAll() {
		return projectDAO.getListAll();
	}
	@Override
	public List<ProjectVO> paging (Map<String, String> map) {
		return projectDAO.paging(map);
	}

	@Override
	public List<ProjectVO> getOneList(ProjectVO vo) {
		return projectDAO.getOneList(vo);
	}
	@Override
	public int totalPage (String total) {
		return projectDAO.getTotalPage(total);
	}

	@Override
	public List<GoodsVO> getGoodsList(String pro_no) {
		return projectDAO.getGoodsList(pro_no);
	}

	@Override
	public void updateGoods(GoodsVO gVO) {
		projectDAO.updateGoods(gVO);
		
	}

	@Override
	public void InsertGoods(GoodsVO gVO) {
		projectDAO.insertGoods(gVO);		
	}

	@Override
	public void updateCloseProject(ProjectVO vo) {
		projectDAO.updateCloseProject(vo);
	}
	
	// 은해누나
	@Override
	public ProjectVO getOneProject(ProjectVO vo) {
		return projectDAO.getOneProject(vo);
	}
	@Override
	public List<GoodsVO> getProGoodsList(ProjectVO vo) {
		return projectDAO.getProGoodsList(vo);
	}

	@Override
	public List<ProjectVO> getProjectList(String pro_no) {
		return null;
	}

	// 좋아요
	@Override
	public String getWishList(ProjectVO vo) {
		return projectDAO.getWishList(vo);
	}

	// 서포터 정보
	@Override
	public List<ProjectVO> getSupporterList(ProjectVO vo) {
		return projectDAO.getSupporterList(vo);
	}

	// 투자금액 구하기
	@Override
	public String getInvestmentAmount(ProjectVO vo) {
		return projectDAO.getInvestmentAmount(vo);
	}

	// 투자자 구하기
	@Override
	public String getInvestorNumber(ProjectVO vo) {
		return projectDAO.getInvestorNumber(vo);
	}

	// 회사정보
	@Override
	public List<UsersVO> getCompanyInformation(ProjectVO vo) {
		return projectDAO.getCompanyInformation(vo);
	}

	@Override
	public void insertWishList(WishListVO wvo) {
		
		projectDAO.insertWishList(wvo);
	}

	@Override
	public void deleteWishList(WishListVO wvo) {
		
		projectDAO.deleteWishList(wvo);
	}
	
//	@Override
//	public List<WishProVO> getWishList() {
//		return wishlistDAO.getWishList();
//	}
//	
//	@Override
//	public List<WishProVO> getWishList(WishProVO wpvo) {
//		System.out.println("WishListServiceImpl - 입력된 데이터 확인하기: "+ wpvo.toString());
//		System.out.println("WishListServiceImpl - DB에서 불러온 데이터 확인하기"+wishlistDAO.getWishList(wpvo));
//		return wishlistDAO.getWishList(wpvo);
//	}
	
	
	public WishListVO checkWishlist(WishListVO wvo) {
		System.out.println("WishListServiceImpl - checkWishlist 입력된 데이터 확인하기: "+ wvo.toString());
		System.out.println("WishListServiceImpl - checkWishlist DB에서 불러온 데이터 확인하기"+projectDAO.getOneWishList(wvo));	
		return projectDAO.getOneWishList(wvo);
	}

	@Override
	public List<ProjectVO> fundingCateItemList(Map<String, String> map) {
		return projectDAO.fundingCateItemList(map);
	}
	
	
	
}
