package com.spring.more.project.serviceimpl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.more.project.service.ReviewVO;

@Repository
public class ReviewDAO {

	@Autowired
	private SqlSessionTemplate mybatis;

	public ReviewDAO() {
		System.out.println(">> ReviewDAO() 객체 생성");
	}

	// 댓글 등록
	public void insertReview(ReviewVO vo) {
		System.out.println(">> insertReview() 실행");
		mybatis.insert("reviewDAO.reviewInsert", vo);
	}

	// 댓글 등록
	public void updateReview(ReviewVO vo) {
		System.out.println(">> updateReview() 실행");
		mybatis.insert("reviewDAO.updateReview", vo);
	}

	// 댓글 삭제
	public void deleteReview(ReviewVO vo) {
		System.out.println(">> deleteReview() 실행");
		mybatis.delete("reviewDAO.reviewDelete", vo);

	}

	// 댓글 조회
	public List<ReviewVO> getReviewList(ReviewVO vo) {
		System.out.println("getReviewList() vo : " + vo);
		System.out.println(">> getReviewList() 실행");

		return mybatis.selectList("reviewDAO.getReviewList", vo);
	}

	// 구매자인지 조회
	public List<ReviewVO> reviewConfirmUser(ReviewVO vo) {
		System.out.println("reviewConfirmUser() vo : " + vo);
		System.out.println(">> reviewConfirmUser() 실행");

		return mybatis.selectList("reviewDAO.reviewConfirmUser", vo);
	}

	// 리뷰 평점 평균 조회
	public List<ReviewVO> reviewAvg(ReviewVO vo) {
		System.out.println(">> reviewAvg() vo : " + vo);
		System.out.println(">> reviewAvg 실행");

		return mybatis.selectList("reviewDAO.reviewAvg", vo);
	}

}
