package com.spring.more.orders.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.more.orders.service.OrderListVO;
import com.spring.more.orders.service.OrdersPayDataVO;
import com.spring.more.orders.service.PaymentDataVO;
import com.spring.more.orders.service.PaymentService;
import com.spring.more.orders.service.PaymentVO;
import com.spring.more.orders.service.WishProVO;
import com.spring.more.project.service.GoodsVO;
import com.spring.more.project.service.ProjectVO;
import com.spring.more.project.service.WishListVO;

@Service("paymentService")
public class PaymentServiceImpl implements PaymentService {
	@Autowired
	private PaymentDAO paymentDAO;
	
	@Override
	public PaymentDataVO homeCurrentSalesStatus() {
		return paymentDAO.homeCurrentSalesStatus();
	}
	
	@Override
	public PaymentDataVO homeSalesRelatedStatus() {
		return paymentDAO.homeSalesRelatedStatus();
	}
	
	@Override
	public PaymentDataVO homeSalesRelatedStatusMonthly() {
		return paymentDAO.homeSalesRelatedStatusMonthly();
	}
	
	@Override
	public List<OrdersPayDataVO> homeRecentTransaction() {
		return paymentDAO.homeRecentTransaction();
	}
	
	@Override
	public List<OrdersPayDataVO> fundingAdminPaymentStatus() {
		return paymentDAO.fundingAdminPaymentStatus();
	}

	@Override
	public List<PaymentVO> homeTotlaSalesStatus() {
		return paymentDAO.homeTotlaSalesStatus();
	}

	@Override
	public List<PaymentVO> homePopularGoods() {
		return paymentDAO.homePopularGoods();
	}

	@Override
	public List<PaymentVO> homeSexRatio() {
		return paymentDAO.homeSexRatio();
	}


	
	
	//민정누나 파트

	@Override
	public List<OrderListVO> getOrderList(OrderListVO olvo) {
		System.out.println("OrderListServiceImpl - 입력된 데이터 확인하기: " + olvo.toString());
		System.out.println("OrderListServiceImpl - DB에서 불러온 데이터 확인하기 " + paymentDAO.getOrderList(olvo));
		
		return paymentDAO.getOrderList(olvo);
	}
	
	// 좋아요
	@Override
	public void insertWishList(WishListVO wvo) {
		
		paymentDAO.insertWishList(wvo);
	}

	@Override
	public void deleteWishList(WishListVO wvo) {
		
		paymentDAO.deleteWishList(wvo);
	}
	
	@Override
	public List<WishProVO> getWishList() {
		return paymentDAO.getWishList();
	}
	
	@Override
	public List<WishProVO> getWishList(WishProVO wpvo) {
		System.out.println("WishListServiceImpl - 입력된 데이터 확인하기: "+ wpvo.toString());
		System.out.println("WishListServiceImpl - DB에서 불러온 데이터 확인하기"+paymentDAO.getWishList(wpvo));
		return paymentDAO.getWishList(wpvo);
	}
	@Override
	public void updateOrderStatus(OrderListVO olvo) { // 추가 부분
		paymentDAO.updateOrderStatus(olvo);
	}

	@Override
	public OrderListVO getOneOrder(OrderListVO olvo) { // 추가 부분
		
		return paymentDAO.getOrder(olvo);
	}
	
	
	// 은해누나
	@Override
	public GoodsVO getOneGoods(GoodsVO vo) {
		return paymentDAO.getOneGoods(vo);
	}

	@Override
	public List<OrdersPayDataVO> fundingAdminPaymentStatus(Map<String, String> map) {
		
		return paymentDAO.fundingAdminPaymentStatus(map);
	}

	@Override
	public int paymentListCount() {
		return paymentDAO.paymentListCount();
	}

	@Override
	public void orderDetailReturnUpdate(OrdersPayDataVO vo) {
		paymentDAO.orderDetailReturnUpdate(vo);
	}

	@Override
	public List<GoodsVO> getGoodsOrderEaList(ProjectVO vo) {
		return paymentDAO.getGoodsOrderEaList(vo);
	}
	
}
