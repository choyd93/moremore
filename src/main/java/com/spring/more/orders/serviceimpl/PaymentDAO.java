package com.spring.more.orders.serviceimpl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.more.orders.service.OrderListVO;
import com.spring.more.orders.service.OrdersPayDataVO;
import com.spring.more.orders.service.PaymentDataVO;
import com.spring.more.orders.service.PaymentVO;
import com.spring.more.orders.service.WishProVO;
import com.spring.more.project.service.GoodsVO;
import com.spring.more.project.service.ProjectVO;
import com.spring.more.project.service.WishListVO;

@Repository
public class PaymentDAO {
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public PaymentDataVO homeCurrentSalesStatus() {
		return mybatis.selectOne("payment.homeCurrentSalesStatus");
	}
	
	public PaymentDataVO homeSalesRelatedStatus() {
		return mybatis.selectOne("payment.homeSalesRelatedStatus");
	}
	
	public PaymentDataVO homeSalesRelatedStatusMonthly() {
		return mybatis.selectOne("payment.homeSalesRelatedStatusMonthly");
	}
	
	public List<OrdersPayDataVO> homeRecentTransaction() {
		return mybatis.selectList("payment.homeRecentTransaction");
	}
	
	public List<OrdersPayDataVO> fundingAdminPaymentStatus() {
		return mybatis.selectList("payment.fundingAdminPaymentStatus");
	}
	
	public List<PaymentVO> homeTotlaSalesStatus() {
		return mybatis.selectList("payment.homeTotlaSalesStatus");
	}

	public List<PaymentVO> homePopularGoods() {
		return mybatis.selectList("payment.homePopularGoods");
	}
	
	public List<PaymentVO> homeSexRatio() {
		return mybatis.selectList("payment.homeSexRatio");
	}
	
	///민정누나
	// 구매 펀딩 리스트 조회
		public List<OrderListVO> getOrderList(OrderListVO olvo) {
			System.out.println(" DAO > getOrderList() 펀딩 리스트 " + olvo.toString());
			return mybatis.selectList("payment.getOrderList", olvo);
		}
		
	// 좋아요
		// 좋아요 등록
		public void insertWishList(WishListVO wvo) {
			//System.out.println(" DAO > insertWishList() 좋아요 등록"+ wvo.toString());
			mybatis.insert("payment.insertWishList", wvo);
		}
		
		// 좋아요 취소
		public void deleteWishList(WishListVO wvo) {
			//System.out.println(" DAO > deleteWishList() 좋아요 삭제"+ wvo.toString());
			mybatis.delete("payment.deleteWishList", wvo);
		}
		
		// 좋아요 리스트
		public List<WishProVO> getWishList() {
			return null;
		}
		
		public List<WishProVO> getWishList(WishProVO wpvo) {
			System.out.println(" DAO > getWishList() 좋아요 리스트 " + wpvo.toString());
			return mybatis.selectList("payment.getWishList", wpvo);
		}
		
		public void updateOrderStatus(OrderListVO olvo) { // 추가 부분
			System.out.println("updateOrderStatus userDAO"+mybatis.update("payment.updateOrderStatus", olvo));
			
		}

		public OrderListVO getOrder(OrderListVO olvo) { // 추가 부분
			return mybatis.selectOne("payment.getOrder", olvo);
		}
		
		// 은해누나
		public GoodsVO getOneGoods(GoodsVO vo) {
			return mybatis.selectOne("payment.getOneGoods", vo);
		}

		public List<OrdersPayDataVO> fundingAdminPaymentStatus(Map<String, String> map) {
			return mybatis.selectList("payment.fundingAdminPaymentStatus",map);
		}

		public int paymentListCount() {
			return mybatis.selectOne("payment.paymentListCount");
		}

		public void orderDetailReturnUpdate(OrdersPayDataVO vo) {
			mybatis.update("payment.orderDetailReturnUpdate", vo);
		}

		public List<GoodsVO> getGoodsOrderEaList(ProjectVO vo) {
			return mybatis.selectList("ordersDAO.getGoodsOrderEaList", vo);
		}

}