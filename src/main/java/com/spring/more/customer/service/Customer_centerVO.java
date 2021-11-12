package com.spring.more.customer.service;

public class Customer_centerVO {
	private String customer_no;
	private String user_no;
	private String customer_subject;
	private String customer_content;
	private String customer_image;
	private String customer_regdate;
	private String customer_category;
	
	public String getCustomer_no() {
		return customer_no;
	}
	public void setCustomer_no(String customer_no) {
		this.customer_no = customer_no;
	}
	public String getUser_no() {
		return user_no;
	}
	public void setUser_no(String user_no) {
		this.user_no = user_no;
	}
	public String getCustomer_subject() {
		return customer_subject;
	}
	public void setCustomer_subject(String customer_subject) {
		this.customer_subject = customer_subject;
	}
	public String getCustomer_content() {
		return customer_content;
	}
	public void setCustomer_content(String customer_content) {
		this.customer_content = customer_content;
	}
	public String getCustomer_image() {
		return customer_image;
	}
	public void setCustomer_image(String customer_image) {
		this.customer_image = customer_image;
	}
	public String getCustomer_regdate() {
		return customer_regdate;
	}
	public void setCustomer_regdate(String customer_regdate) {
		this.customer_regdate = customer_regdate;
	}
	public String getCustomer_category() {
		return customer_category;
	}
	public void setCustomer_category(String customer_category) {
		this.customer_category = customer_category;
	}
	
	@Override
	public String toString() {
		return "Customer_centerVO [customer_no=" + customer_no + ", user_no=" + user_no + ", customer_subject="
				+ customer_subject + ", customer_content=" + customer_content + ", customer_secret="
				+ ", customer_image=" + customer_image + ", customer_regdate=" + customer_regdate
				+ ", customer_category=" + customer_category + "]";
	}
	
}
