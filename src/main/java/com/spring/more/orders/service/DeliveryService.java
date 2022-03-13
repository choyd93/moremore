package com.spring.more.orders.service;

import java.util.List;

public interface DeliveryService {
	
	void insertDelivery(DeliveryVO vo);
	void deleteDelivery(DeliveryVO vo);
	List<DeliveryVO> getDeliveryList(DeliveryVO vo);
	List<DeliveryVO> getOneDeliveryList(DeliveryVO vo);
	
}
