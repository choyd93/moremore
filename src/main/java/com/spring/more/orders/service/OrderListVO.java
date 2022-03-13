package com.spring.more.orders.service;

public class OrderListVO {
// 유저가 참여한 펀딩 목록 조회
// PROJECT, ORDERS, GOODS, PAYMENT, ORDER_DETAIL 테이블 조인
	
	private String pro_no;
	private String user_no;
	private String pro_title;
	private String pro_thumbnail_path;
	private String pro_status;
	
	private String order_status; // 변경 부분
	
	private String order_no;
	private String order_date;
	private String payment_status;
	
	private String goods_title;
	private String payment_price;
	private String order_ea;
	
	public String getOrder_status() {
		return order_status;
	}

	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}

	public OrderListVO() {}

	public OrderListVO(String pro_no, String user_no, String pro_title, String pro_thumbnail_path, String pro_status,
			String order_status, String order_no, String order_date, String payment_status, String goods_title,
			String payment_price, String order_ea) {
		super();
		this.pro_no = pro_no;
		this.user_no = user_no;
		this.pro_title = pro_title;
		this.pro_thumbnail_path = pro_thumbnail_path;
		this.pro_status = pro_status;
		this.order_status = order_status;
		this.order_no = order_no;
		this.order_date = order_date;
		this.payment_status = payment_status;
		this.goods_title = goods_title;
		this.payment_price = payment_price;
		this.order_ea = order_ea;
	}

	public String getPro_no() {
		return pro_no;
	}
	public void setPro_no(String pro_no) {
		this.pro_no = pro_no;
	}

	public String getUser_no() {
		return user_no;
	}
	public void setUser_no(String user_no) {
		this.user_no = user_no;
	}

	public String getPro_title() {
		return pro_title;
	}
	public void setPro_title(String pro_title) {
		this.pro_title = pro_title;
	}
	
	public String getPro_thumbnail_path() {
		return pro_thumbnail_path;
	}
	public void setPro_thumbnail_path(String pro_thumbnail_path) {
		this.pro_thumbnail_path = pro_thumbnail_path;
	}

	public String getPro_status() {
		return pro_status;
	}
	public void setPro_status(String pro_status) {
		this.pro_status = pro_status;
	}

	public String getOrder_no() {
		return order_no;
	}
	public void setOrder_no(String order_no) {
		this.order_no = order_no;
	}

	public String getOrder_date() {
		return order_date;
	}
	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}

	public String getPayment_status() {
		return payment_status;
	}
	public void setPayment_status(String payment_status) {
		this.payment_status = payment_status;
	}

	public String getGoods_title() {
		return goods_title;
	}
	public void setGoods_title(String goods_title) {
		this.goods_title = goods_title;
	}

	public String getPayment_price() {
		return payment_price;
	}
	public void setPayment_price(String payment_price) {
		this.payment_price = payment_price;
	}

	public String getOrder_ea() {
		return order_ea;
	}
	public void setOrder_ea(String order_ea) {
		this.order_ea = order_ea;
	}

	@Override
	public String toString() {
		return "OrderListVO [pro_no=" + pro_no + ", user_no=" + user_no + ", pro_title=" + pro_title
				+ ", pro_thumbnail_path=" + pro_thumbnail_path + ", pro_status=" + pro_status + ", order_status="
				+ order_status + ", order_no=" + order_no + ", order_date=" + order_date + ", payment_status="
				+ payment_status + ", goods_title=" + goods_title + ", payment_price=" + payment_price + ", order_ea="
				+ order_ea + "]";
	}

	

}
