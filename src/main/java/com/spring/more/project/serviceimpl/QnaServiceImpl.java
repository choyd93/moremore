package com.spring.more.project.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.more.project.service.ProjectService;
import com.spring.more.project.service.ProjectVO;
import com.spring.more.project.service.QnaService;
import com.spring.more.project.service.QnaVO;

@Service("QnaService")
public class QnaServiceImpl implements QnaService {
	@Autowired
	private QnaDAO qnaDAO;

	@Override
	public QnaVO fundingAdminInquiryManageOne(QnaVO vo) {
		return qnaDAO.fundingAdminInquiryManageOne(vo);
	}

	@Override
	public List<QnaVO> newInquiryHistory() {
		return qnaDAO.newInquiryHistory();
	}

	@Override
	public List<QnaVO> fundingAdminInquiryManage() {
		return qnaDAO.fundingAdminInquiryManage();
	}
	
//	@Override
//	public int insertQna(QnaVO vo) {
//		return qnaDAO.insertQna(vo);
//	}
//
//	@Override
//	public int updateQna(QnaVO vo) {
//		return qnaDAO.updateQna(vo);
//	}
//
//	@Override
//	public int deleteQna(QnaVO vo) {
//		return qnaDAO.deleteQna(vo);
//	}
	
	// 은해누나
	@Override
	public void insertQna(QnaVO vo) {
		qnaDAO.insertQna(vo);	
		
	}

	@Override
	public void updateQna(QnaVO vo) {
		qnaDAO.updateQna(vo);
		
	}

	@Override
	public void deleteQna(QnaVO vo) {
		qnaDAO.deleteQna(vo);
	}

	@Override
	public QnaVO getOneQna(QnaVO vo) {
		return qnaDAO.getOneQna(vo);
	}

	@Override
	public int getQnaListCnt(String pro_no) {
		return qnaDAO.getQnaListCnt(pro_no);	
	}

	@Override
	public List<QnaVO> getQnaList (Map map) {
		return qnaDAO.getQnaList(map);
	}

	@Override
	public int qnaListCount() {
		return qnaDAO.qnaListCount();
	}

	@Override
	public List<QnaVO> fundingAdminInquiryManage(Map<String, Integer> map) {
		return qnaDAO.fundingAdminInquiryManage(map);
	}

	@Override
	public void fundingAdminQnaAnswer(QnaVO vo) {
		qnaDAO.fundingAdminQnaAnswer(vo);
	}
	
}
