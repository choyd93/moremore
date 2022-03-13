package com.spring.more.project.serviceimpl;

import java.util.HashMap;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.more.project.service.GoodsVO;
import com.spring.more.project.service.QnaVO;

@Repository
public class GoodsDAO {
	@Autowired
	private SqlSessionTemplate mybatis;

	public GoodsVO selectOneGoods(String goods_no) {
		return mybatis.selectOne("goods.selectOneGoods", goods_no);
	}

	public List<GoodsVO> fundingAdminInventoryManageList() {
		return mybatis.selectList("goods.fundingAdminInventoryManageList");
	}

	public void fundingAdminInventoryManageUpdate(String goodsNo, String inventoryNum) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("goodsNo", goodsNo);
		map.put("inventoryNum", inventoryNum);
		mybatis.update("goods.fundingAdminInventoryManageUpdate", map);
	}

	public int insertGoods(GoodsVO vo) {
		return mybatis.selectOne("goods.insertGoods", vo);
	}

	public int updateGoods(GoodsVO vo) {
		return mybatis.selectOne("goods.updateGoods", vo);
	}

	public int deleteGoods(GoodsVO vo) {
		return mybatis.selectOne("goods.deleteGoods", vo);
	}

	public List<GoodsVO> fundingAdminInventoryManageList(Map<String, Integer> map) {
		return mybatis.selectList("goods.fundingAdminInventoryManageList", map);
	}

	public int goodsListCount() {
		return mybatis.selectOne("goods.goodsListCount");
	}

}