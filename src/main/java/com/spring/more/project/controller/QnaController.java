package com.spring.more.project.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.spring.more.common.Paging;
import com.spring.more.project.service.QnaService;
import com.spring.more.project.service.QnaVO;

@Controller
public class QnaController {
	@Autowired
	private QnaService qnaService;
	
	// 신규 문의 내역(펀딩관리자 메인 페이지)
		@RequestMapping(value = "/newInquiryHistory.do", method = RequestMethod.POST)
		@ResponseBody
		public List<QnaVO> newInquiryHistory(QnaVO vo, Model model) {
			List<QnaVO> qnaList = qnaService.newInquiryHistory();
			model.addAttribute("qnaList", qnaList);
			return qnaList;
		}
	
	// 펀딩 관리 문의 내역 리스트
		@RequestMapping(value = "/fundingAdminInquiryManage.do", method = RequestMethod.GET)
		@ResponseBody
		public Map<String, Object> fundingAdminInquiryManage(@RequestParam(required = false) String cPage, QnaVO vo, Paging p, Model model) {
	System.out.println(" page : " + p);
			
			//1. 전체 게시물의 수량 구하기	
			p.setTotalRecord(qnaService.qnaListCount());
			//2. 전체 페이지 수량 구하기 
			p.setTotalPage();
			
			//3. 현재 페이지 구하기(리퀘스트 파람 사용)
			System.out.println(" cPage : " + cPage);
			
			if (cPage != null) {
				p.setNowPage(Integer.parseInt(cPage));
			}
			System.out.println("> cPage : " + cPage);
			System.out.println("> paging nowPage : " + p.getNowPage());
			

			//3. 현재 페이지에 표시할 게시글 시작번호(begin), 끝번호(end) 구하기
			p.setEnd(p.getNowPage() * p.getNumPerPage()); //현재페이지번호 * 페이지당게시글 수
			p.setBegin(p.getEnd() - p.getNumPerPage() + 1);
			
			//(선택적) 3-1. 끝 번호가 데이터 건수보다 많아지면 데이터 건수와 동일한 번호로 설정
			if (p.getEnd() > p.getTotalRecord()) {
				p.setEnd(p.getTotalRecord());
			}
			System.out.println(">> 시작번호(begin) : " + p.getBegin());
			System.out.println(">> 끝번호(end) : " + p.getEnd());
			
			//---- 블록(block) 계산하기 ----------------
			//4. 블록의 시작페이지, 끝페이지 구하기(현재페이지 번호 사용)
			//시작페이지 구하기
			int nowPage = p.getNowPage();
			int beginPage = (nowPage - 1) / p.getPagePerBlock() * p.getPagePerBlock() + 1;
			p.setBeginPage(beginPage);
			p.setEndPage(p.getBeginPage() + p.getPagePerBlock() - 1);
		
			//4-1. 끝페이지(endPage)가 전체페이지 수(totalPage) 보다 크면
			// 끝페이지를 전체페이지 수로 변경 처리
			if (p.getEndPage() > p.getTotalPage()) {
				p.setEndPage(p.getTotalPage());
			}
			System.out.println(">> beginPage : " + p.getBeginPage());
			System.out.println(">> endPage : " + p.getEndPage());
			
			// 페이지 처리 확인
			System.out.println(" page : " + p);
			
			Map<String, Integer> map = new HashMap<String, Integer>();
			map.put("begin", p.getBegin());
			map.put("end", p.getEnd());
			
			List<QnaVO> qnaList = qnaService.fundingAdminInquiryManage(map);
			model.addAttribute("qnaList", qnaList);
			System.out.println(qnaList.toString());
			Map<String, Object> map1 = new HashMap<String, Object>();
			map1.put("list", qnaList);
			map1.put("plist", p);
			
			return map1;
		}
	
	// 펀딩 관리 문의 내역 상세 페이지
	@RequestMapping(value = "/fundingAdminInquiryManageOne.do", method = RequestMethod.GET)
	public String fundingAdminInquiryManageOne(@RequestParam(value = "rnum") String rnum, QnaVO vo, Model model) {
		System.out.println("rnum : " + rnum);
		System.out.println("QnaVO : " + vo);

		QnaVO qnaOne = qnaService.fundingAdminInquiryManageOne(vo);
		model.addAttribute("qnaOne", qnaOne);
		return "fundingAdminInquiryManageOne.jsp";
	}
	
	// 문의 답변 작성하기 (UPDATE)
		@RequestMapping(value = "/fundingAdminQnaAnswer.do", method = RequestMethod.POST)
		public String fundingAdminQnaAnswer(QnaVO vo, Model model) {
//			System.out.println("qna_answer_content : " + qna_answer_content);
//			System.out.println("qna_no : " + qna_no);
			System.out.println("vo : " + vo);
			
			qnaService.fundingAdminQnaAnswer(vo);
			model.addAttribute("qnaOne", vo);
			return "fundingAdminQnaAnswerSuccess.jsp";
		}
	
}