package com.spring.more.admin.service;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(value= {"searchCondition", "searchKeyword"})
public class Customer_CenterVO {
	private String customer_no;
	private String user_no;
	private String customer_subject;
	private String customer_content;
	private String customer_image;
	private String customer_regdate;
	private String customer_category;
	
	//페이징 위한 변수 -----------------------------
	private int begin = 0; //현재 페이지상의 시작 번호
	private int end = 0; //현재 페이지상의 마지막 번호
	
	public int getBegin() {
		return begin;
	}
	public void setBegin(int begin) {
		this.begin = begin;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	//------------------------------------------
	
	//검색을 위한 변수 
	private String searchCondition;
	private String searchKeyword;
	
	
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
	//----------

	public Customer_CenterVO() {
		System.out.println("Customer_CenterVO() 객체 생성");
	}


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
		return "Customer_CenterVO [customer_no=" + customer_no + ", user_no=" + user_no + ", customer_subject="
				+ customer_subject + ", customer_content=" + customer_content + ", customer_image=" + customer_image
				+ ", customer_regdate=" + customer_regdate + ", customer_category=" + customer_category + ", begin="
				+ begin + ", end=" + end + ", searchCondition=" + searchCondition + ", searchKeyword=" + searchKeyword
				+ "]";
	}

}
