package com.spring.more.project.service;

import java.util.List;
import java.util.Map;

public interface QnaService {
	public QnaVO fundingAdminInquiryManageOne(QnaVO vo); // 펀딩 문의관리 상세페이지
	public List<QnaVO> newInquiryHistory(); // 신규 문의 내역
	public List<QnaVO> fundingAdminInquiryManage(); // 펀딩 문의관리 리스트

//	public int insertQna(QnaVO vo);
//	public int updateQna(QnaVO vo);
//	public int deleteQna(QnaVO vo);
	
	
	// 은해누나 
	void insertQna(QnaVO vo);
	void updateQna(QnaVO vo);
	void deleteQna(QnaVO vo);
	QnaVO getOneQna(QnaVO vo);
	List<QnaVO> getQnaList(Map map);
	int getQnaListCnt(String pro_no);
	
	// 1118-dong
	public int qnaListCount();
	public List<QnaVO> fundingAdminInquiryManage(Map<String, Integer> map);
	public void fundingAdminQnaAnswer(QnaVO vo);
}
