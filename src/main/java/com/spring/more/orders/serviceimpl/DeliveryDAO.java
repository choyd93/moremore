package com.spring.more.orders.serviceimpl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.more.orders.service.DeliveryVO;

@Repository
public class DeliveryDAO {
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public DeliveryDAO() {
		System.out.println("> DeliveryDAO() 객체 생성 <");
	}
	
	// 배송지 추가
	public void insertDelivery(DeliveryVO vo) {
		mybatis.insert("deliveryDAO.insertDelivery", vo);
	}

	// 배송지 삭제
	public void deleteDelivery(DeliveryVO vo) {
		System.out.println(">> deleteDelivery() 메서드 실행");
		mybatis.delete("deliveryDAO.deleteDelivery", vo);
	}
	
	// 배송지 전체 조회
	public List<DeliveryVO> getDeliveryList(DeliveryVO vo) {
		return mybatis.selectList("deliveryDAO.selectDelivery", vo);
	}

	// 기본 배송지 조회
	public List<DeliveryVO> getOneDeliveryList(DeliveryVO vo) {
		return mybatis.selectList("deliveryDAO.selectOneDelivery", vo);
	}

	
}
