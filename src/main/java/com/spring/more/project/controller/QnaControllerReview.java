package com.spring.more.project.controller;


import java.util.HashMap;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.spring.more.project.service.ProjectVO;
import com.spring.more.project.service.QnaPaging;
import com.spring.more.project.service.QnaService;
import com.spring.more.project.service.QnaVO;
import com.spring.more.users.service.UsersVO;

@Controller
@SessionAttributes("qnadList") // qna 라는 이름의 Model 있으면 session에 저장
@RequestMapping(value="/project")
public class QnaControllerReview {
	@Autowired
	private QnaService qnaService;

	public QnaControllerReview() {
		System.out.println("--->> QnaController() 객체생성");
	}
	
	
	@RequestMapping("/getQnaListStart.do")
		//public String getQnaListPage(String pro_no, Model model) {
	public String getQnaListPage(HttpSession session, @RequestParam(value = "q_menu_index", required = false) String q_menu_index) {//@RequestBody ProjectVO pro
			/* String pro_no = (String) session.getAttribute("pro_no"); */
		ProjectVO pro = (ProjectVO) session.getAttribute("pro");
		System.out.println("getQnaListPage pro_no : " + pro.getPro_no());
		session.setAttribute("pro_no", pro.getPro_no());
		if (q_menu_index == null) {
			session.setAttribute("q_menu_index", 1);
		} else {
			session.setAttribute("q_menu_index", q_menu_index);
		}
		//model.addAttribute("pro_no", pro_no);
		return "redirect:getQnaList.do";
	}
	
	
	@RequestMapping("/getQnaList.do")
	// @ResponseBody
	public String getQnaList(HttpSession session, @RequestParam(value = "cPage", required = false) String cPage, UsersVO vo, Model model) {
		String pro_no = (String) session.getAttribute("pro_no");//임시 프로젝트 번호
		System.out.println("getQnaList pro_no : " + pro_no);

		/// ---------- 목록, 페이징 구현 -------------
		// 페이징을 위한 객체 생성
		QnaPaging p = new QnaPaging();

		// 1. 전체게시물 수량구하기
		p.setTotalRecord(qnaService.getQnaListCnt(pro_no));
		p.setTotalPage();
		System.out.println("> 전체 게시글 수 : " + p.getTotalRecord());//총 게시물 갯수
		System.out.println("> 전체 페이지 수 : " + p.getTotalPage());//전체 페이지 갯수

		// 2. 현재페이지 구하기
		if (cPage != null) {
			p.setNowPage(Integer.parseInt(cPage));//@RequestParam 으로 받은 현재페이지 정보
		}
		System.out.println("> cPage : " + cPage);
		System.out.println("> paging nowPage : " + p.getNowPage());//현재페이지

		// 3. 현재페이지에 표시할 게시글 시작번호,끝번호 구하기
		if (p.getTotalRecord() < 10) { 
			p.setNumPerPage(p.getTotalRecord());
			//표시되는 게시물 갯수(10) 보다 총 게시물 갯수가 적으면 
			//총 게시물 갯수가 NumPerPage(표시되는 게시물 갯수)가 되게
		} else {
			p.setNumPerPage(10); //표시되는 게시물 갯수(10) 이상이면 10으로 설정
		}
		System.out.println("--->>p.getNumPerPage() : " + p.getNumPerPage());
		p.setEnd(p.getNowPage() * p.getNumPerPage()); // 현재페이지 * 페이지당게시글 수
		p.setBegin(p.getEnd() - p.getNumPerPage() + 1); // 끝페이지 - 페이지당게시글 수

		if (p.getEnd() <= 1) { // 마지막 게시글번호가 총 게시글 수와 같게
			p.setEnd(p.getTotalRecord());
		}

		System.out.println(">>시작번호(begin) : " + p.getBegin()); // 현재페이지번호 * 페이지당게시글 수
		System.out.println(">>끝번호(end) : " + p.getEnd());
		System.out.println("Integer.toString(p.getBegin()) : " + Integer.toString(p.getBegin()));

		// (선택적) 3-1. 끝번호가 데이터 건수보다 많아지면 데이터 건수와 동일한 번호로 설정
		if (p.getEnd() > p.getTotalRecord()) {
			p.setEnd(p.getTotalRecord());
		}
		if (p.getEnd() == 0)
			p.setEnd(1);
		System.out.println(">>시작번호(begin) : " + p.getBegin()); // 현재페이지번호 * 페이지당게시글 수
		System.out.println(">>끝번호(end) : " + p.getEnd());

		System.out.println(">>p.getPagePerBlock() : " + p.getPagePerBlock());

		// ----------- 볼록 계산하기 ------------------
		// 4. 볼록의 시작페이지,끝페이지 구하기
		// 시작페이지 구하기
		int nowPage = p.getNowPage();
		int beginPage = (nowPage - 1) / p.getPagePerBlock() * p.getPagePerBlock() + 1;
		p.setBeginPage(beginPage);
		p.setEndPage(p.getBeginPage() + p.getPagePerBlock() - 1);
		if (p.getTotalRecord() < 100) {
			p.setEndPage(p.getTotalPage());
		}

		// 4-1
		// 4-1. 끝페이지(endPage)가 전체페이지 수(totalPage) 보다 크면
		// 끝페이지를 전체페이지 수로 변경 처리
		if (p.getEndPage() > p.getTotalPage()) {
			p.setEndPage(p.getTotalPage());
		}

		System.out.println(">> beginPage : " + p.getBeginPage());
		System.out.println(">> endPage : " + p.getEndPage());
		System.out.println("---user.getUser_no()--- : " + vo.getUser_no());

		// ------------------------
		System.out.println(">>> 문의글 전체목록 보여주기");
		System.out.println(":: getQnaList() pro_no : " + pro_no);
		Map<String, String> map = new HashMap();
		map.put("begin", Integer.toString(p.getBegin()));
		map.put("end", Integer.toString(p.getEnd()));
		map.put("pro_no", pro_no);

		List<QnaVO> qnaList = qnaService.getQnaList(map);
		System.out.println(":: getQnaList() qnadList : " + qnaList);

		model.addAttribute("qnaList", qnaList);
		model.addAttribute("pvo", p);
		model.addAttribute("cPage", cPage);
		System.out.println("qnaList : " + qnaList);

		return "/project/funding_pro.jsp";
		//return "getReviewList.do";
	}
	

	// 문의글 작성하기
	@RequestMapping("/insertQna.do")
	// @RequestMapping(value = "/insertQna.do", method = RequestMethod.POST)
	public String insertQna(QnaVO vo) {
		System.out.println(">>> 게시글 입력");
		System.out.println("insert vo : " + vo);
		//vo.setQna_secret("비공개");

		qnaService.insertQna(vo);
		System.out.println("인서트 성공");
		return "redirect:getQnaList.do";
	}

	// 리턴타입 : ModelAndView -> String
	// 전달할 데이터 저장 : ModelAndView -> Model
	@RequestMapping("/getOneQna.do")
	@ResponseBody
	public QnaVO getOneQna(@RequestBody QnaVO vo,Model model) {
		//public QnaVO getBoard(@RequestParam("qna_no") String qna_no, Model model) {
		System.out.println(">>> 게시글 상세 보여주기");
		QnaVO qna = qnaService.getOneQna(vo);
		String regdate = qna.getQna_regdate().substring(0, 10);
		System.out.println("::::::::::::::::::::----regdate : " + regdate);
		qna.setQna_regdate(regdate);
		System.out.println(":: getOneQna qna : " + qna);
		
		model.addAttribute("qna", qna); // Model 객체 사용 View로 데이터 전달
		return qna;
	}
	
	@RequestMapping("/deleteQna.do")
	@ResponseBody
	public String deleteQna(@RequestBody QnaVO vo,Model model) {
		//public QnaVO getBoard(@RequestParam("qna_no") String qna_no, Model model) {
		System.out.println(">>> 게시글 삭제");
		qnaService.deleteQna(vo);
		System.out.println(":: deleteQna result : " + "1");
		
		model.addAttribute("result", "1"); // Model 객체 사용 View로 데이터 전달
		return "getQnaList.do";
	}
	
	@RequestMapping("/modifyQna.do")
	public String modifyQna(@RequestBody QnaVO vo,Model model) {
		System.out.println(">>> 게시글 수정");
		qnaService.updateQna(vo);
		System.out.println(":: modifyQna result : " + "1");
		
		model.addAttribute("result", "1"); // Model 객체 사용 View로 데이터 전달
		return "getQnaList.do";
	}
}
