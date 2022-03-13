package com.spring.more.orders.service;

// 매출관리(결제현황) - orderVO와 paymentVO 통합 
public class OrdersPayDataVO {
	
	private String order_date; // 주문일 ordersVO
	private String user_no; // 회원번호 ordersVO
	private String payment_price; // 결제금액 paymentVO
	private String payment_type; // 결제 타입 paymentVO
	private String payment_status; // 결제진행상태 ordersVO
	private String payment_delivery_status; // 배송현황 ordersVO
	private String payment_bankname; // 은행명
	private String rnum; // 순번
	
	private String order_status; // 주문현황
	private String order_no; // 주문번호
	
	//검색을 위한 변수 
	private String searchCondition;
	private String searchKeyword;
	
	public OrdersPayDataVO () {}

	public OrdersPayDataVO(String order_date, String user_no, String payment_price, String payment_type,
			String payment_status, String payment_delivery_status, String payment_bankname, String rnum,
			String order_status, String order_no, String searchCondition, String searchKeyword) {
		super();
		this.order_date = order_date;
		this.user_no = user_no;
		this.payment_price = payment_price;
		this.payment_type = payment_type;
		this.payment_status = payment_status;
		this.payment_delivery_status = payment_delivery_status;
		this.payment_bankname = payment_bankname;
		this.rnum = rnum;
		this.order_status = order_status;
		this.order_no = order_no;
		this.searchCondition = searchCondition;
		this.searchKeyword = searchKeyword;
	}



	public String getOrder_date() {
		return order_date;
	}

	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}

	public String getUser_no() {
		return user_no;
	}

	public void setUser_no(String user_no) {
		this.user_no = user_no;
	}

	public String getPayment_price() {
		return payment_price;
	}

	public void setPayment_price(String payment_price) {
		this.payment_price = payment_price;
	}

	public String getPayment_type() {
		return payment_type;
	}

	public void setPayment_type(String payment_type) {
		this.payment_type = payment_type;
	}

	public String getPayment_status() {
		return payment_status;
	}

	public void setPayment_status(String payment_status) {
		this.payment_status = payment_status;
	}

	public String getPayment_delivery_status() {
		return payment_delivery_status;
	}

	public void setPayment_delivery_status(String payment_delivery_status) {
		this.payment_delivery_status = payment_delivery_status;
	}

	public String getPayment_bankname() {
		return payment_bankname;
	}

	public void setPayment_bankname(String payment_bankname) {
		this.payment_bankname = payment_bankname;
	}

	public String getRnum() {
		return rnum;
	}

	public void setRnum(String rnum) {
		this.rnum = rnum;
	}

	public String getOrder_status() {
		return order_status;
	}

	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}

	public String getOrder_no() {
		return order_no;
	}

	public void setOrder_no(String order_no) {
		this.order_no = order_no;
	}

	public String getSearchCondition() {
		return searchCondition;
	}

	public void setSearchCondition(String searchCondition) {
		this.searchCondition = searchCondition;
	}

	public String getSearchKeyword() {
		return searchKeyword;
	}

	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}

	@Override
	public String toString() {
		return "OrdersPayDataVO [order_date=" + order_date + ", user_no=" + user_no + ", payment_price=" + payment_price
				+ ", payment_type=" + payment_type + ", payment_status=" + payment_status + ", payment_delivery_status="
				+ payment_delivery_status + ", payment_bankname=" + payment_bankname + ", rnum=" + rnum
				+ ", order_status=" + order_status + ", order_no=" + order_no + ", searchCondition=" + searchCondition
				+ ", searchKeyword=" + searchKeyword + "]";
	}

	
}