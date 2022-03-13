package com.spring.more.project.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.more.project.service.GoodsService;
import com.spring.more.project.service.GoodsVO;

@Service("GoodsService")
public class GoodsServiceImpl implements GoodsService {
	@Autowired
	private GoodsDAO goodsDAO;

	@Override
	public GoodsVO selectOneGoods(String goods_no) {
		return goodsDAO.selectOneGoods(goods_no);
	}

	@Override
	public List<GoodsVO> fundingAdminInventoryManageList() {
		return goodsDAO.fundingAdminInventoryManageList();
	}

	@Override
	public int insertGoods(GoodsVO vo) {
		return goodsDAO.insertGoods(vo);
	}

	@Override
	public int updateGoods(GoodsVO vo) {
		return goodsDAO.updateGoods(vo);
	}

	@Override
	public int deleteGoods(GoodsVO vo) {
		return goodsDAO.deleteGoods(vo);
	}

	@Override
	public void fundingAdminInventoryManageUpdate(String goodsNo, String inventoryNum) {
		goodsDAO.fundingAdminInventoryManageUpdate(goodsNo, inventoryNum);
	}

	@Override
	public int goodsListCount() {
		return goodsDAO.goodsListCount();
	}

	@Override
	public List<GoodsVO> fundingAdminInventoryManageList(Map<String, Integer> map) {
		return goodsDAO.fundingAdminInventoryManageList(map);
	}

}
