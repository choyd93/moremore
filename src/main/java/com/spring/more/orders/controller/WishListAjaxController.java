package com.spring.more.orders.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.more.orders.service.PaymentService;
import com.spring.more.orders.service.WishProVO;


@Controller
public class WishListAjaxController {

	@Autowired
	private PaymentService paymentService;
	
	@RequestMapping("/getWishList.do")
	@ResponseBody
	public List<WishProVO> getAjaxWishlist(WishProVO wpvo) {
		System.out.println("WishListAjaxController getAjaxWishlist LINE 30: "+wpvo.getUser_no());
		
		List<WishProVO> wishlist = paymentService.getWishList(wpvo);
		
		System.out.println(wishlist);
		return wishlist;
	}
}
