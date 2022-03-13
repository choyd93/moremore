package com.spring.more.orders.service;

public class PaymentVO {
	private String payment_no;
	private String order_no;
	private String payment_price;
	private String payment_regdate;
	private String payment_bankname;
	private String payment_cardid;
	private String payment_type;
	private String delivery_price;
	private String payment_dona;
	
	public String getPayment_no() {
		return payment_no;
	}
	public void setPayment_no(String payment_no) {
		this.payment_no = payment_no;
	}
	public String getOrder_no() {
		return order_no;
	}
	public void setOrder_no(String order_no) {
		this.order_no = order_no;
	}
	public String getPayment_price() {
		return payment_price;
	}
	public void setPayment_price(String payment_price) {
		this.payment_price = payment_price;
	}
	public String getPayment_regdate() {
		return payment_regdate;
	}
	public void setPayment_regdate(String payment_regdate) {
		this.payment_regdate = payment_regdate;
	}
	public String getPayment_bankname() {
		return payment_bankname;
	}
	public void setPayment_bankname(String payment_bankname) {
		this.payment_bankname = payment_bankname;
	}
	public String getPayment_cardid() {
		return payment_cardid;
	}
	public void setPayment_cardid(String payment_cardid) {
		this.payment_cardid = payment_cardid;
	}
	public String getPayment_type() {
		return payment_type;
	}
	public void setPayment_type(String payment_type) {
		this.payment_type = payment_type;
	}
	public String getDelivery_price() {
		return delivery_price;
	}
	public void setDelivery_price(String delivery_price) {
		this.delivery_price = delivery_price;
	}
	public String getPayment_dona() {
		return payment_dona;
	}
	public void setPayment_dona(String payment_dona) {
		this.payment_dona = payment_dona;
	}
	
	@Override
	public String toString() {
		return "PaymentVO [payment_no=" + payment_no + ", order_no=" + order_no + ", payment_price=" + payment_price
				+ ", payment_regdate=" + payment_regdate + ", payment_bankname=" + payment_bankname
				+ ", payment_cardid=" + payment_cardid + ", payment_type=" + payment_type + ", delivery_price="
				+ delivery_price + ", payment_dona=" + payment_dona + "]";
	}
	
}
