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
import com.spring.more.project.service.GoodsService;
import com.spring.more.project.service.GoodsVO;

@Controller
public class GoodsController {
	@Autowired
	private GoodsService goodsService;

	// 재고 관리 리스트
	@RequestMapping(value = "/fundingAdminInventoryManageList.do", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> fundingAdminInventoryManageList(@RequestParam(required = false) String cPage, GoodsVO vo,
			Paging p, Model model) {
		System.out.println(" page : " + p);

		// 1. 전체 게시물의 수량 구하기
		p.setTotalRecord(goodsService.goodsListCount());
		// 2. 전체 페이지 수량 구하기
		p.setTotalPage();

		// 3. 현재 페이지 구하기(리퀘스트 파람 사용)
		System.out.println(" cPage : " + cPage);

		if (cPage != null) {
			p.setNowPage(Integer.parseInt(cPage));
		}
		System.out.println("> cPage : " + cPage);
		System.out.println("> paging nowPage : " + p.getNowPage());

		// 3. 현재 페이지에 표시할 게시글 시작번호(begin), 끝번호(end) 구하기
		p.setEnd(p.getNowPage() * p.getNumPerPage()); // 현재페이지번호 * 페이지당게시글 수
		p.setBegin(p.getEnd() - p.getNumPerPage() + 1);

		// (선택적) 3-1. 끝 번호가 데이터 건수보다 많아지면 데이터 건수와 동일한 번호로 설정
		if (p.getEnd() > p.getTotalRecord()) {
			p.setEnd(p.getTotalRecord());
		}
		System.out.println(">> 시작번호(begin) : " + p.getBegin());
		System.out.println(">> 끝번호(end) : " + p.getEnd());

		// ---- 블록(block) 계산하기 ----------------
		// 4. 블록의 시작페이지, 끝페이지 구하기(현재페이지 번호 사용)
		// 시작페이지 구하기
		int nowPage = p.getNowPage();
		int beginPage = (nowPage - 1) / p.getPagePerBlock() * p.getPagePerBlock() + 1;
		p.setBeginPage(beginPage);
		p.setEndPage(p.getBeginPage() + p.getPagePerBlock() - 1);

		// 4-1. 끝페이지(endPage)가 전체페이지 수(totalPage) 보다 크면
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

		List<GoodsVO> goodsList = goodsService.fundingAdminInventoryManageList(map);
		model.addAttribute("goodsList", goodsList);

		Map<String, Object> map1 = new HashMap<String, Object>();
		map1.put("list", goodsList);
		map1.put("plist", p);

		return map1;
	}

	//
	@RequestMapping(value = "/fundingAdminInventoryManageUpdate.do", method = RequestMethod.GET)
	public String fundingAdminInventoryManageUpdate(@RequestParam(value = "goodsNo") String goodsNo,
			@RequestParam(value = "inventoryNum") String inventoryNum, GoodsVO vo, Model model) {
		System.out.println("goodsNo : " + goodsNo);
		System.out.println("inventoryNum : " + inventoryNum);
		goodsService.fundingAdminInventoryManageUpdate(goodsNo, inventoryNum);
		return "updateInventoryNumSuccess.jsp";
	}

}