package com.spring.more.project.service;

public class GoodsVO {
	private String goods_no;
	private String pro_no;
	private String goods_title;
	private String goods_content;
	private String goods_price;
	private String goods_type;
	
	public String getGoods_no() {
		return goods_no;
	}
	public void setGoods_no(String goods_no) {
		this.goods_no = goods_no;
	}
	public String getPro_no() {
		return pro_no;
	}
	public void setPro_no(String pro_no) {
		this.pro_no = pro_no;
	}
	public String getGoods_title() {
		return goods_title;
	}
	public void setGoods_title(String goods_title) {
		this.goods_title = goods_title;
	}
	public String getGoods_content() {
		return goods_content;
	}
	public void setGoods_content(String goods_content) {
		this.goods_content = goods_content;
	}
	public String getGoods_price() {
		return goods_price;
	}
	public void setGoods_price(String goods_price) {
		this.goods_price = goods_price;
	}
	public String getGoods_type() {
		return goods_type;
	}
	public void setGoods_type(String goods_type) {
		this.goods_type = goods_type;
	}
	
	@Override
	public String toString() {
		return "GoodsVO [goods_no=" + goods_no + ", pro_no=" + pro_no + ", goods_title=" + goods_title
				+ ", goods_content=" + goods_content + ", goods_price=" + goods_price + ", goods_type=" + goods_type
				+ "]";
	}
	
	
}
