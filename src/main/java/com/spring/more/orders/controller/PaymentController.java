package com.spring.more.orders.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.spring.more.orders.service.PaymentService;
import com.spring.more.orders.service.OrdersPayDataVO;
import com.spring.more.orders.service.PaymentDataVO;
import com.spring.more.orders.service.PaymentVO;
import com.spring.more.common.Paging;

@Controller
public class PaymentController {
	@Autowired
	private PaymentService paymentService;
	
	// 금일 매출 현황
	@RequestMapping(value = "/homeCurrentSalesStatus.do", method = RequestMethod.POST)
	@ResponseBody
	public PaymentDataVO homeCurrentSalesStatus(PaymentDataVO vo, Model model) {
		PaymentDataVO orders = paymentService.homeCurrentSalesStatus();
		model.addAttribute("orders", orders);
		return orders;
	}
	
	// 중간 펀딩 판매 정보 (판매건수/이번주 판매금액)
	@RequestMapping(value = "/homeSalesRelatedStatus.do", method = RequestMethod.POST)
	@ResponseBody
	public PaymentDataVO homeSalesRelatedStatus(PaymentDataVO vo, Model model) {
		PaymentDataVO orders = paymentService.homeSalesRelatedStatus();
		model.addAttribute("orders", orders);
		return orders;
	}
	
	// 중간 펀딩 판매 정보 (판매건수/월별 판매금액)
	@RequestMapping(value = "/homeSalesRelatedStatusMonthly.do", method = RequestMethod.POST)
	@ResponseBody
	public PaymentDataVO homeSalesRelatedStatusMonthly(PaymentDataVO vo, Model model) {
		PaymentDataVO orders = paymentService.homeSalesRelatedStatusMonthly();
		model.addAttribute("orders", orders);
		return orders;
	}
	

	// 최근 거래내역
	@RequestMapping(value = "/homeRecentTransaction.do", method = RequestMethod.POST)
	@ResponseBody
	public List<OrdersPayDataVO> homeRecentTransaction(OrdersPayDataVO vo, Model model) {
		List<OrdersPayDataVO> orderList = paymentService.homeRecentTransaction();
		model.addAttribute("orderList", orderList);
		return orderList;
	}
	
	
	// 주문 관리 리스트 (페이징 처리)
	@RequestMapping(value = "/fundingAdminPaymentStatus.do", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> fundingAdminPaymentStatus(@RequestParam(value="cPage", required = false) String cPage,
			OrdersPayDataVO vo, Paging p, ModelMap model) {
		System.out.println(" pvo : " + p);
		
		//1. 전체 게시물의 수량 구하기	
		p.setTotalRecord(paymentService.paymentListCount());
		System.out.println("여기까지 오나?");
		//2. 전체 페이지 수량 구하기 
		p.setTotalPage();
		//3. 현재 페이지 구하기
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
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("begin", String.valueOf(p.getBegin()));
		map.put("end", String.valueOf(p.getEnd()));
		
		List<OrdersPayDataVO> orderList = paymentService.fundingAdminPaymentStatus(map);
//		model.addAttribute("list", orderList);
		System.out.println("orderList : " + orderList);
		
		Map<String, Object> map1 = new HashMap<String, Object>();
		map1.put("list", orderList);
		map1.put("plist", p);
		
		return map1;
	}
	
	// 총 매출액
	@RequestMapping(value = "/homeTotlaSalesStatus.do", method = RequestMethod.POST)
	@ResponseBody
	public List<PaymentVO> homeTotlaSalesStatus(PaymentVO vo, Model model) {
		List<PaymentVO> orderList = paymentService.homeTotlaSalesStatus();
		model.addAttribute("orders", orderList);
		return orderList;
	}
	
	
	// 인기 판매
	@RequestMapping(value = "/homePopularGoods.do", method = RequestMethod.POST)
	@ResponseBody
	public List<PaymentVO> homePopularGoods(PaymentVO vo, Model model) {
		List<PaymentVO> orderList = paymentService.homePopularGoods();
		model.addAttribute("orderList", orderList);
		return orderList;
	}
	
	// 성별 비율
	@RequestMapping(value = "/homeSexRatio.do", method = RequestMethod.POST)
	@ResponseBody
	public List<PaymentVO> homeSexRatio(PaymentVO vo, Model model) {
		List<PaymentVO> orderList = paymentService.homeSexRatio();
		model.addAttribute("orderList", orderList);
		return orderList;
	}
	
	// 검색
	@RequestMapping(value = "/getSearchPayment.do", method = RequestMethod.GET)
	@ResponseBody
	public List<OrdersPayDataVO> getSearchPayment(@RequestParam(value="searchCondition", required = false) String searchCondition,
			@RequestParam(value="searchKeyword", required = false) String searchKeyword,
			OrdersPayDataVO vo, Paging p, ModelMap model) {
		System.out.println("searchCondition : " + searchCondition);
		System.out.println("searchKeyword : " + searchKeyword);
	
		Map<String, String> map = new HashMap<String, String>();
		map.put("searchCondition", searchCondition);
		map.put("searchKeyword", searchKeyword);
	
		List<OrdersPayDataVO> orderList = paymentService.fundingAdminPaymentStatus(map);
		model.addAttribute("orderList", orderList);
		return orderList;
	}
	
	// 펀딩관리자 반품완료
		@RequestMapping(value = "/orderDetailReturnUpdate.do", method = RequestMethod.GET)
		public String orderDetailReturnUpdate(@RequestParam(value="order_no", required = false) String order_no,
												OrdersPayDataVO vo, Model model) {
			System.out.println("order_no : " + order_no);
			System.out.println("vo : " + vo);
			
			paymentService.orderDetailReturnUpdate(vo);
			model.addAttribute("qnaOne", vo);
			return "orderDetailReturnUpdateSuccess.jsp";
		}
	
}