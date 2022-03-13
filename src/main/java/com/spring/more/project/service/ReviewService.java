package com.spring.more.project.service;

import java.util.List;

public interface ReviewService {
	void insertReview(ReviewVO vo);
	void updateReview(ReviewVO vo);
	void deleteReview(ReviewVO vo);
	List<ReviewVO> getReviewList(ReviewVO vo);
	List<ReviewVO> reviewConfirmUser(ReviewVO vo); // 주문 내역 조회용 
	List<ReviewVO> reviewAvg(ReviewVO vo); // 별점 평균 조회용
}
