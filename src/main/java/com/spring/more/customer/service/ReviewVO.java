package com.spring.more.customer.service;

public class ReviewVO {
	private String review_no;
	private String user_no;
	private String pro_no;
	private String review_content;
	private String review_score;
	private String review_regdate;
	
	public ReviewVO() {
		System.out.println(">> ReviewVO() 객체 생성");
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

	@Override
	public String toString() {
		return "ReviewVO [review_no=" + review_no + ", user_no=" + user_no + ", pro_no=" + pro_no + ", review_content="
				+ review_content + ", review_score=" + review_score + ", review_regdate=" + review_regdate + "]";
	}
	

}
