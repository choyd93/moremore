package com.spring.more.project.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.more.project.service.ReviewService;
import com.spring.more.project.service.ReviewVO;

// @Service : @Component 상속확장 어노테이션
//		비즈니스 로직 처리 서비스 영역에 사용
@Service("reviewService")
public class ReviewServiceImpl implements ReviewService {
	@Autowired //타입이 일치하는 객체(인스턴스) 주입
	private ReviewDAO reviewDAO;

	public ReviewServiceImpl() {
		System.out.println(">> ReviewServiceImpl() 객체 생성");
	}
	
	// 리뷰 등록
	@Override
	public void insertReview(ReviewVO vo) {
		reviewDAO.insertReview(vo);
		
	}
	
	// 리뷰 수정
	@Override
	public void updateReview(ReviewVO vo) {
		reviewDAO.updateReview(vo);
	}

	// 리뷰 삭제
	@Override
	public void deleteReview(ReviewVO vo) {
		reviewDAO.deleteReview(vo);
	}

	@Override
	public List<ReviewVO> getReviewList(ReviewVO vo) {
		return reviewDAO.getReviewList(vo);
	}

	@Override
	public List<ReviewVO> reviewConfirmUser(ReviewVO vo) {
		return reviewDAO.reviewConfirmUser(vo);
	}
	
	// 별점평균 조회용
	@Override
	public List<ReviewVO> reviewAvg(ReviewVO vo) {
		return reviewDAO.reviewAvg(vo);
	}
	
	

}
