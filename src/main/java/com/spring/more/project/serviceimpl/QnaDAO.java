package com.spring.more.project.serviceimpl;

import java.util.HashMap;


import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.more.project.service.QnaVO;


@Repository
public class QnaDAO {
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public QnaVO fundingAdminInquiryManageOne(QnaVO vo) {
		return mybatis.selectOne("qna.fundingAdminInquiryManageOne", vo);
	}

	public List<QnaVO> newInquiryHistory() {
		return mybatis.selectList("qna.newInquiryHistory");
	}
	
	public List<QnaVO> fundingAdminInquiryManage() {
		return mybatis.selectList("qna.fundingAdminInquiryManage");
	}

//	public int insertQna(QnaVO vo) {
//		return mybatis.selectOne("qna.insertQna", vo);
//	}
//
//	public int updateQna(QnaVO vo) {
//		return mybatis.selectOne("qna.updateQna", vo);
//	}
//
//	public int deleteQna(QnaVO vo) {
//		return mybatis.selectOne("qna.deleteQna", vo);
//	}

	// 은해누나
	public List<QnaVO> getQnaList(Map map) {
		return mybatis.selectList("qna.getQnaList", map);
	}

	public int getQnaListCnt(String pro_no) {
		return mybatis.selectOne("qna.getQnaListCnt", pro_no);
	}

	public void insertQna(QnaVO vo) {
		mybatis.insert("qna.insertQna", vo);
	}

	public QnaVO getOneQna(QnaVO vo) {
		return mybatis.selectOne("qna.getOneQna", vo);
	}

	public void deleteQna(QnaVO vo) {
		mybatis.delete("qna.deleteQna", vo);
	}

	public void updateQna(QnaVO vo) {
		mybatis.update("qna.updateQna", vo);
	}

	public int qnaListCount() {
		return mybatis.selectOne("qna.qnaListCount");
	}
	public List<QnaVO> fundingAdminInquiryManage(Map<String, Integer> map) {
		return mybatis.selectList("qna.fundingAdminInquiryManage",map);
	}

	public void fundingAdminQnaAnswer(QnaVO vo) {
		mybatis.update("qna.fundingAdminQnaAnswer",vo);
	}
}