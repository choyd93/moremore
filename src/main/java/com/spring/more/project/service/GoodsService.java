package com.spring.more.project.service;

import java.util.List;
import java.util.Map;

public interface GoodsService {
	public GoodsVO selectOneGoods(String goods_no);
	public List<GoodsVO> fundingAdminInventoryManageList();
	public void fundingAdminInventoryManageUpdate(String goodsNo, String inventoryNum);
	
	public int insertGoods(GoodsVO vo);
	public int updateGoods(GoodsVO vo);
	public int deleteGoods(GoodsVO vo);
	public int goodsListCount();
	public List<GoodsVO> fundingAdminInventoryManageList(Map<String, Integer> map);
}
