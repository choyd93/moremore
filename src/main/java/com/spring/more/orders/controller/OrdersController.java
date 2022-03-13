package com.spring.more.orders.controller;

import java.util.ArrayList;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.more.orders.service.PaymentService;
import com.spring.more.project.service.GoodsVO;

@Controller
@RequestMapping("/orders")
public class OrdersController {
	
	@Autowired
	private PaymentService paymentService;
	
	public OrdersController() {
		System.out.println(">> OrdersController() 객체 생성");
	}
	
	@RequestMapping("/ordersSelect.do")
	public String ordersSelect(Model model) {
		System.out.println(">> orderSelect ");
		
		return "redirect:orders_select.jsp";
	}
	
	@RequestMapping("/ordersOne.do")
	public String ordersOne(@RequestBody GoodsVO vo, HttpSession session) {
		System.out.println(">> ordersOne>>> ");
		System.out.println("----------->>-->> vo : " + vo);
		GoodsVO gvo = paymentService.getOneGoods(vo);
		System.out.println("--------->>>>orderSelect gvo :" + gvo);
		
		session.setAttribute("gvo", gvo);
		return "redirect:orders_select.jsp";
	}
	
	@RequestMapping("/orders.do")
	   public String orders(HttpSession session, @RequestBody GoodsVO vo) {
		System.out.println(">>>>>>>>>>>>orders>>>>>>>>>>> ");
		System.out.println("============---------------------------");
	      System.out.println("vo : " + vo);
	      List<GoodsVO> selectList = new ArrayList<GoodsVO>();
	      GoodsVO vo1 = new GoodsVO(vo.getGoods_ea1(), vo.getGoods_rnum1(), vo.getGoods_no1(), vo.getPro_no(), vo.getGoods_price1(), vo.getGoods_title1());
	      GoodsVO vo2 = new GoodsVO(vo.getGoods_ea2(), vo.getGoods_rnum2(), vo.getGoods_no2(), vo.getPro_no(), vo.getGoods_price2(), vo.getGoods_title2());
	      GoodsVO vo3 = new GoodsVO(vo.getGoods_ea3(), vo.getGoods_rnum3(), vo.getGoods_no3(), vo.getPro_no(), vo.getGoods_price3(), vo.getGoods_title3());
	      GoodsVO privName_donaPrice = new GoodsVO(vo.getDonation_price(), vo.getPrivate_name());
	      selectList.add(vo1);
	      selectList.add(vo2);
	      selectList.add(vo3);
	      System.out.println("=====---------=======-------->>selectList : " + selectList);
	      
	      session.setAttribute("selectList", selectList);
	      session.setAttribute("privName_donaPrice", privName_donaPrice);
	      System.out.println("============---------------------------");
	      return "redirect:orders.jsp";
	}
	
}
