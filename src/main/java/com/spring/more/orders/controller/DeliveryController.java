package com.spring.more.orders.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.spring.more.orders.service.DeliveryService;
import com.spring.more.orders.service.DeliveryVO;

@Controller
@RequestMapping("/orders")
public class DeliveryController {

	@Autowired
	   private DeliveryService deliveryService;
	
	// 배송지 등록
	@RequestMapping("/addressInsert.do")
	public String insertDelivery(DeliveryVO vo) {
		System.out.println("배송지 insert vo : " + vo);
		
		deliveryService.insertDelivery(vo);
		
		return "redirect:orders.jsp";
	}
	
	// 전체 배송지 조회
	@RequestMapping("/addressSelect.do")
	@ResponseBody
	public List<DeliveryVO> selectDelivery(@RequestBody DeliveryVO vo) {
		
		System.out.println("배송지 select vo : " + vo);
		List<DeliveryVO> deliveryList = deliveryService.getDeliveryList(vo);
		System.out.println(">>>>>::::::::deliveryList <<<<<::::::" + deliveryList );
		
		return deliveryList;
	}
	
	// 기본 배송지 조회
	@RequestMapping("/basic_address_Select.do")
	@ResponseBody
	public List<DeliveryVO> selectOneDelivery(@RequestBody DeliveryVO vo) {
		
		System.out.println("selectOneDelivery : " + vo);
		List<DeliveryVO> deliveryOneList = deliveryService.getOneDeliveryList(vo);
		System.out.println("------ << deliveryOneList >> -------- " + deliveryOneList );
		
		return deliveryOneList;
	}
	
	
	// 배송지 삭제
	@RequestMapping("/addressDelete.do")
	@ResponseBody
	public String deleteDelivery(@RequestBody DeliveryVO vo, Model model) {
		System.out.println(">>> 게시글 삭제 vo : " + vo);

		deliveryService.deleteDelivery(vo);
		model.addAttribute("reviewDelete", vo);

		return "orders.jsp";
	}
	
//	Ajax 사용안함 	
//	@RequestMapping("/addressDataSend.do")
//	public String addressDataSend(@RequestBody DeliveryVO vo, HttpSession session) {
//		
//		System.out.println("배송지 addressDataSend vo : " + vo);
//		
//		session.setAttribute("dvo", vo);
//		
//		DeliveryVO dvo = (DeliveryVO) session.getAttribute("dvo");
//		System.out.println("==========================================");
//		System.out.println("===== >>>> deliveryVO <<<< ====  : " + dvo);
//		System.out.println("==========================================");
//		
//		return "redirect:orders.jsp";
//	}
	
	
	
}
