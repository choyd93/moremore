package com.spring.more.project.service;

public class StockVO {
	private String goods_no;
	
	private String goods_stock;

	public String getGoods_no() {
		return goods_no;
	}

	public void setGoods_no(String goods_no) {
		this.goods_no = goods_no;
	}

	public String getGoods_stock() {
		return goods_stock;
	}

	public void setGoods_stock(String goods_stock) {
		this.goods_stock = goods_stock;
	}

	@Override
	public String toString() {
		return "StockVO [goods_no=" + goods_no + ", goods_stock=" + goods_stock + "]";
	}
}
