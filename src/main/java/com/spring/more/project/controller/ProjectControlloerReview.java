package com.spring.more.project.controller;

import java.util.List;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.spring.more.orders.service.PaymentService;
import com.spring.more.project.service.GoodsVO;
import com.spring.more.project.service.ProjectService;
import com.spring.more.project.service.ProjectVO;

import com.spring.more.project.service.WishListVO;
import com.spring.more.users.service.UsersVO;

@Controller
@RequestMapping(value = "/project")
@SessionAttributes("pro")
public class ProjectControlloerReview {

	@Autowired
	private ProjectService projectService;
	@Autowired
	private PaymentService ordersService;

	public ProjectControlloerReview() {
		System.out.println(">> ProjectControlloer() 객체생성");
	}

	@RequestMapping("/goProjectStart.do")
	public String goProjectStart(ProjectVO vo, Model model) {
		System.out.println("--->> goProjectStart() 실행");
		// GoodsVO goodsvo = new GoodsVO(vo.getPro_no());

		System.out.println(":: goProjectStart() ProjectVO vo: " + vo);
//		 System.out.println(":: goProjectStart() GoodsVO vo: " + goodsvo); 
		/* vo.setPro_no(pro_no); */
		// System.out.println(":: getOneProject() vo: " + vo);
		/* model.addAttribute("pro", pro); */
		model.addAttribute("vo", vo);
		// model.addAttribute("goodsvo", goodsvo);

		return "goProject.do";
	}

	
	
	@RequestMapping("/goProject.do")
	public String getOneProject(@ModelAttribute ProjectVO vo, Model model, HttpSession session) {
		System.out.println("--->> getOneProject() 실행");
		System.out.println(":: getOneProject() -- 1 넣기전 vo.getPro_no(): " + vo.getPro_no());
//		vo = new ProjectVO("12");

		System.out.println(":: getOneProject() ProjectVO vo: " + vo);

		ProjectVO pro = projectService.getOneProject(vo);
		System.out.println(":: getOneProject() pro: " + pro);
		// ----------------------------------------------------------------------------

		// 금액 콤마(,)표시
		// int gPrice = Integer.parseInt(pro.getPro_gprice());
		// System.out.println("pro.getPro_gprice() : " + pro.getPro_gprice());

		// 상세이미지 처리
		String proImg = pro.getPro_img_path();
		String[] proImgs = proImg.split("\\^");
		// 확인용
		int i = 1;
		for (String img : proImgs) {
			System.out.println(i + " : " + img);
			i++;
		}
		System.out.println("----------------------------");

		// 옵션(굿즈)
		List<GoodsVO> goodsList = projectService.getProGoodsList(pro);
		for (GoodsVO gvo : goodsList) {
			System.out.println(i + " : " + gvo);
			i++;
		}

		// 옵션 재고 정보 객체 리스트
		List<GoodsVO> goodsEaList = ordersService.getGoodsOrderEaList(pro);
		System.out.println(" >____>_______>_____goodsEaList : " + goodsEaList);
		for (GoodsVO goodsEavo : goodsEaList) {
			System.out.println(i + " : " + goodsEavo);
			i++;
		}
		// 투자자 구하기
		String investor = projectService.getInvestorNumber(pro);
		// 투자금액
		String funding_investment_amount = projectService.getInvestmentAmount(pro);

		// 판매 재고

		// 좋아요 갯수
		// String wishList_ea = projectService.getWishList(pro);

		// 회사정보
		List<UsersVO> companyInformation = projectService.getCompanyInformation(pro);
		System.out.println("companyInformation : " + companyInformation);

		// 서포터 -> 이름,
		List<ProjectVO> getSupporterList = projectService.getSupporterList(pro);
		System.out.println(">>>>>>>> getSupporterList <<<<<<<<< : " + getSupporterList);

		session.setAttribute("goodsList", goodsList);
		session.setAttribute("goodsEaList", goodsEaList);
		session.setAttribute("proImgs", proImgs);
		session.setAttribute("investor", investor); // 투자자
		session.setAttribute("funding_investment_amount", funding_investment_amount); // 투자금액
		// session.setAttribute("wishList_ea", wishList_ea); // 좋아요 갯수
		session.setAttribute("companyInformation", companyInformation); // 회사정보
		session.setAttribute("getSupporterList", getSupporterList); // 서포터
		// session.setAttribute("dDay", dDay);
		model.addAttribute("pro", pro);
//		model.addAttribute("goodsvo", goodsvo);

		return "getQnaListStart.do";
	}
	
	// 좋아요---------------------------------------------------

			// 좋아요
			@RequestMapping(value = "/wishlistInsert.do", method = RequestMethod.POST)
			public String insertWishList(WishListVO wvo) {
				System.out.println(">>> 컨트롤러 wishlistInsert 실행");
				projectService.insertWishList(wvo);
				return "funding_pro.jsp";
			}

			// 좋아요 취소
			@RequestMapping("/wishlistDelete.do")
			public String deleteWishList(WishListVO wvo) {
				System.out.println(">>> 컨트롤러 wishlistDelete 실행");
				projectService.deleteWishList(wvo);
				return "funding_pro.jsp";
			}
			// 좋아요 조회
			@RequestMapping(value="/getWishConfirm.do", method=RequestMethod.POST)
			@ResponseBody
			public WishListVO getOneAjaxWishList(WishListVO wvo) {
				
				System.out.println(">>> 컨트롤러 getWishList 조회중..." +projectService.checkWishlist(wvo));
				
				return projectService.checkWishlist(wvo);
				
			} 
			// -------------------------------------------------------
		//좋아요 갯수 조회
		@RequestMapping("/getWishListCnt.do")
		@ResponseBody
		public String getWishListCnt(@RequestBody ProjectVO vo) {
			// 좋아요 갯수
			String wishList_ea = projectService.getWishList(vo);
			System.out.println("wishList_ea : " + wishList_ea);
			return wishList_ea;
		}

}
