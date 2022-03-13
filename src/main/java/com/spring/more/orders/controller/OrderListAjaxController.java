package com.spring.more.orders.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.more.orders.service.OrderListVO;
import com.spring.more.orders.service.PaymentService;

@Controller
public class OrderListAjaxController {

	@Autowired
	private PaymentService paymentService;
	
	@RequestMapping(value="/getOrderList.do", method=RequestMethod.GET)
	@ResponseBody
	public List<OrderListVO> getAjaxOrderList(OrderListVO olvo) {
		System.out.println("OrderListAjaxController getAjaxOrderList LINE 19: "+olvo.getUser_no());
		List<OrderListVO> orderlist = paymentService.getOrderList(olvo);
		System.out.println(orderlist);
		return orderlist;
	}
	
	@RequestMapping("/requestOrderCancel.do") // 추가 부분
	@ResponseBody
	public OrderListVO requestOrderCancelAjaxOrderList(OrderListVO olvo) {
		System.out.println("OrderListAjaxController requestOrderCancelAjaxOrderList LINE 19: "+olvo.toString());
		paymentService.updateOrderStatus(olvo);
		return paymentService.getOneOrder(olvo);
	}
}
