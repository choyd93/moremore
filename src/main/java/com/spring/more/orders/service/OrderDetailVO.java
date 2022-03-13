package com.spring.more.orders.service;

public class OrderDetailVO {
	private String order_detail_no;
	private String goods_no;
	private String order_no;
	private String delivery_no;
	private String order_ea;
	private String order_status;
	
	public String getOrder_detail_no() {
		return order_detail_no;
	}
	public void setOrder_detail_no(String order_detail_no) {
		this.order_detail_no = order_detail_no;
	}
	public String getGoods_no() {
		return goods_no;
	}
	public void setGoods_no(String goods_no) {
		this.goods_no = goods_no;
	}
	public String getOrder_no() {
		return order_no;
	}
	public void setOrder_no(String order_no) {
		this.order_no = order_no;
	}
	public String getDelivery_no() {
		return delivery_no;
	}
	public void setDelivery_no(String delivery_no) {
		this.delivery_no = delivery_no;
	}
	public String getOrder_ea() {
		return order_ea;
	}
	public void setOrder_ea(String order_ea) {
		this.order_ea = order_ea;
	}
	public String getOrder_status() {
		return order_status;
	}
	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}
	
	@Override
	public String toString() {
		return "OrderDetailVO [order_detail_no=" + order_detail_no + ", goods_no=" + goods_no + ", order_no=" + order_no
				+ ", delivery_no=" + delivery_no + ", order_ea=" + order_ea + ", order_status=" + order_status + "]";
	}
	
	
}
