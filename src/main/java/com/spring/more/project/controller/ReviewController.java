package com.spring.more.project.controller;

import java.io.IOException;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.more.project.service.ReviewService;
import com.spring.more.project.service.ReviewVO;

@Controller
@RequestMapping(value="/project")
public class ReviewController {
	
	@Autowired
	private ReviewService reviewService;
	
	public ReviewController() {
		System.out.println(">> ReviewController()객체 생성");
	}
	
	
	// 댓글 전체 조회 
	@RequestMapping("/getReviewList.do") // jsp파일과 연결해서 가져옴
	@ResponseBody // response 객체의 몸체에 데이터 전달(순수하게 데이터만 받아옴) 
	public List<ReviewVO> getReviewList(@RequestBody ReviewVO vo) {
		System.out.println("getReviewList() vo : " + vo);
		List<ReviewVO> reviewList = reviewService.getReviewList(vo); // ReviewService로 이동 연결
		System.out.println("reviewList : " + reviewList);
		
		return reviewList;
	}
	
	// 로그인한 사람이 주문내역을 가지고 있는 조회
	@RequestMapping("/reviewConfirmUser.do") // jsp파일과 연결해서 가져옴
	@ResponseBody // response 객체의 몸체에 데이터 전달(순수하게 데이터만 받아옴) 
	public List<ReviewVO> reviewConfirmUser(@RequestBody ReviewVO vo) {
		System.out.println("reviewConfirmUser() vo : " + vo);
		List<ReviewVO> reviewConfirmUser = reviewService.reviewConfirmUser(vo); // ReviewService로 이동 연결
		System.out.println("reviewConfirmUser : " + reviewConfirmUser);
		
		return reviewConfirmUser;
	}
	
	// 댓글 입력
	@RequestMapping("/reviewInsert.do")
	@ResponseBody
	public String reviewInsert(@RequestBody ReviewVO vo, Model model) throws IllegalStateException, IOException {
		System.out.println(">>> 게시글 입력");
		System.out.println("insert vo : " + vo);
		
		reviewService.insertReview(vo);
		model.addAttribute("reviewInsert", vo);
		
		return "/project/funding_review.jsp"; // 제이슨형식 문자열 응답받는 데이터가 제이슨이아님 일반문자열 중ㅇ괄호안에 키 쌍따옴표로 묶잉ㄴ 형식
		// return "{'funding_review.jsp ' : funding_review.jsp}";
	}	

	// 댓글 수정
	@RequestMapping("/reviewUpdate.do")
	@ResponseBody
	public String reviewUpdate(@RequestBody ReviewVO vo, Model model) throws IllegalStateException, IOException {
		System.out.println(">>> 게시글 수정");
		System.out.println("update vo : " + vo);
		
		reviewService.updateReview(vo);
		model.addAttribute("reviewUpdate", vo);
		
		return "/project/funding_review.jsp";
	}	
	
	// 댓글 삭제
	@RequestMapping("/reviewDelete.do")
	@ResponseBody
	public String reviewDelete(@RequestBody ReviewVO vo,  Model model) throws IllegalStateException, IOException {
		System.out.println(">>> 게시글 삭제");

		reviewService.deleteReview(vo);
		model.addAttribute("reviewDelete", vo);

		return "/project/funding_review.jsp";
	}
	
	// 별점 평균 조회
	@RequestMapping("/reviewAvg.do") // jsp파일과 연결해서 가져옴
	@ResponseBody // response 객체의 몸체에 데이터 전달(순수하게 데이터만 받아옴)
	public List<ReviewVO> reviewAvg(@RequestBody ReviewVO vo) {
		System.out.println("reviewAvg() vo : " + vo);
		List<ReviewVO> reviewAvg = reviewService.reviewAvg(vo); // ReviewService로 이동 연결
		System.out.println("reviewList : " + reviewAvg);

		return reviewAvg;
	}

}
