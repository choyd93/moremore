package com.spring.more.project.service;

public class ReviewVO {
	private String review_no;
	private String user_no;
	private String pro_no;
	private String review_content;
	private String review_score;
	private String review_regdate;
	private String user_name;
	
	// 주문 내역 조회에 필요한 변수
	private String order_no;
	private String payment_delivery_status;

	
	// 기본 생성자
	public ReviewVO() {
		System.out.println(">> ReviewVO() 객체 생성");
	}
	
	// 주문 내역에 필요한 생성자
	public ReviewVO(String user_no, String pro_no, String order_no, String payment_delivery_status) {
		this.user_no = user_no;
		this.pro_no = pro_no;
		this.order_no = order_no;
		this.payment_delivery_status = payment_delivery_status;
	}
	
	// 별점 평균에 필요한 생성자
	public ReviewVO(String review_score) {
		this.review_score = review_score;
	}
	
	public String getReview_no() {
		return review_no;
	}
	

	public void setReview_no(String review_no) {
		this.review_no = review_no;
	}

	public String getUser_no() {
		return user_no;
	}

	public void setUser_no(String user_no) {
		this.user_no = user_no;
	}

	public String getPro_no() {
		return pro_no;
	}

	public void setPro_no(String pro_no) {
		this.pro_no = pro_no;
	}

	public String getReview_content() {
		return review_content;
	}

	public void setReview_content(String review_content) {
		this.review_content = review_content;
	}

	public String getReview_score() {
		return review_score;
	}

	public void setReview_score(String review_score) {
		this.review_score = review_score;
	}

	public String getReview_regdate() {
		return review_regdate;
	}

	public void setReview_regdate(String review_regdate) {
		this.review_regdate = review_regdate;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getOrder_no() {
		return order_no;
	}

	public void setOrder_no(String order_no) {
		this.order_no = order_no;
	}

	public String getPayment_delivery_status() {
		return payment_delivery_status;
	}

	public void setPayment_delivery_status(String payment_delivery_status) {
		this.payment_delivery_status = payment_delivery_status;
	}

	@Override
	public String toString() {
		return "ReviewVO [review_no=" + review_no + ", user_no=" + user_no + ", pro_no=" + pro_no + ", review_content="
				+ review_content + ", review_score=" + review_score + ", review_regdate=" + review_regdate
				+ ", user_name=" + user_name + ", order_no=" + order_no + ", payment_delivery_status="
				+ payment_delivery_status + "]";
	}
	
	public String reviewConfirmUser() {
		return "reviewConfirmUser [user_no=" + user_no + ", pro_no=" + pro_no 
				+ ", order_no=" + order_no + ", payment_delivery_status="
				+ payment_delivery_status + "]";
	}
	

}
