package com.spring.more.orders.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.more.orders.service.DeliveryService;
import com.spring.more.orders.service.DeliveryVO;

@Service("deliveryService")
public class DeliveryServiceImpl implements DeliveryService {

	@Autowired
	private DeliveryDAO deliveryDAO;

	public DeliveryServiceImpl() {
		System.out.println("DeliveryServiceImpl() 객체 생성");
	}
	
	// 배송지 등록
	@Override
	public void insertDelivery(DeliveryVO vo) {
		deliveryDAO.insertDelivery(vo);

	}

	// 배송지 삭제	
	@Override
	public void deleteDelivery(DeliveryVO vo) {
		deliveryDAO.deleteDelivery(vo);
	}
	
	// 배송지 전체 조회
	@Override
	public List<DeliveryVO> getDeliveryList(DeliveryVO vo) {
		return deliveryDAO.getDeliveryList(vo);
	}

	// 기본 배송지 조회
	@Override
	public List<DeliveryVO> getOneDeliveryList(DeliveryVO vo) {
		return deliveryDAO.getOneDeliveryList(vo);
	}

}
