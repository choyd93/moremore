package com.spring.more.orders.service;

import java.util.List;
import java.util.Map;

import com.spring.more.project.service.GoodsVO;
import com.spring.more.project.service.ProjectVO;
import com.spring.more.project.service.WishListVO;


public interface PaymentService {
	public PaymentDataVO homeCurrentSalesStatus();
	public PaymentDataVO homeSalesRelatedStatus();
	public PaymentDataVO homeSalesRelatedStatusMonthly();

	public List<PaymentVO> homeTotlaSalesStatus();
	public List<PaymentVO> homePopularGoods();
	public List<PaymentVO> homeSexRatio();
	public List<OrdersPayDataVO> homeRecentTransaction();
	public List<OrdersPayDataVO> fundingAdminPaymentStatus();

	
	/// 민정누나 파트
	List<OrderListVO> getOrderList(OrderListVO olvo);
	
	void insertWishList(WishListVO wvo);
	void deleteWishList(WishListVO wvo);
	List<WishProVO> getWishList();
	List<WishProVO> getWishList(WishProVO wpvo);
	
	void updateOrderStatus(OrderListVO olvo); // 추가 부분
	OrderListVO getOneOrder(OrderListVO olvo); // 추가 부분
	
	
	// 은해누나 -> 오더스 여기다 넣음
	GoodsVO getOneGoods(GoodsVO vo);
	public List<GoodsVO> getGoodsOrderEaList(ProjectVO vo);
	
	// 동햄
	public List<OrdersPayDataVO> fundingAdminPaymentStatus(Map<String, String> map);
	public int paymentListCount();
	public void orderDetailReturnUpdate(OrdersPayDataVO vo);
	
}
