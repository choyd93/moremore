package com.spring.more.orders.service;

public class OrdersVO {
	private String order_no;
	private String pro_no;
	private String user_no;
	private String delivery_no;
	private String payment_status;
	private String order_date;
	private String payment_delivery_status;
	private String private_name;
	
	public OrdersVO() {}

	public OrdersVO(String order_no, String pro_no, String user_no, String delivery_no, String payment_status,
			String order_date, String payment_delivery_status, String private_name) {
		super();
		this.order_no = order_no;
		this.pro_no = pro_no;
		this.user_no = user_no;
		this.delivery_no = delivery_no;
		this.payment_status = payment_status;
		this.order_date = order_date;
		this.payment_delivery_status = payment_delivery_status;
		this.private_name = private_name;
	}

	public String getOrder_no() {
		return order_no;
	}
	public void setOrder_no(String order_no) {
		this.order_no = order_no;
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

	public String getDelivery_no() {
		return delivery_no;
	}
	public void setDelivery_no(String delivery_no) {
		this.delivery_no = delivery_no;
	}

	public String getPayment_status() {
		return payment_status;
	}
	public void setPayment_status(String payment_status) {
		this.payment_status = payment_status;
	}

	public String getOrder_date() {
		return order_date;
	}
	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}

	public String getPayment_delivery_status() {
		return payment_delivery_status;
	}
	public void setPayment_delivery_status(String payment_delivery_status) {
		this.payment_delivery_status = payment_delivery_status;
	}

	public String getPrivate_name() {
		return private_name;
	}
	public void setPrivate_name(String private_name) {
		this.private_name = private_name;
	}

	@Override
	public String toString() {
		return "OrdersVO [order_no=" + order_no + ", pro_no=" + pro_no + ", user_no=" + user_no + ", delivery_no="
				+ delivery_no + ", payment_status=" + payment_status + ", order_date=" + order_date
				+ ", payment_delivery_status=" + payment_delivery_status + ", private_name=" + private_name + "]";
	}
	
}
