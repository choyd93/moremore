package com.spring.more.orders.service;

public class WishProVO {
	// 위시리스트, 프로젝트 테이블 조인 VO

	private String pro_no;
	private String user_no;
	
	private String pro_thumbnail_path;
	private String pro_title;
	private String pro_close_dt;
	private String pro_status;
	
	public WishProVO() {}

	public WishProVO(String pro_no, String user_no, String pro_thumbnail_path, String pro_title, String pro_close_dt,
			String pro_status) {
		super();
		this.pro_no = pro_no;
		this.user_no = user_no;
		this.pro_thumbnail_path = pro_thumbnail_path;
		this.pro_title = pro_title;
		this.pro_close_dt = pro_close_dt;
		this.pro_status = pro_status;
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

	public String getPro_thumbnail_path() {
		return pro_thumbnail_path;
	}
	public void setPro_thumbnail_path(String pro_thumbnail_path) {
		this.pro_thumbnail_path = pro_thumbnail_path;
	}

	public String getPro_title() {
		return pro_title;
	}
	public void setPro_title(String pro_title) {
		this.pro_title = pro_title;
	}

	public String getPro_close_dt() {
		return pro_close_dt;
	}
	public void setPro_close_dt(String pro_close_dt) {
		this.pro_close_dt = pro_close_dt;
	}

	public String getPro_status() {
		return pro_status;
	}
	public void setPro_status(String pro_status) {
		this.pro_status = pro_status;
	}

	@Override
	public String toString() {
		return "WishProVO [pro_no=" + pro_no + ", user_no=" + user_no 
				+ ", pro_thumbnail_path=" + pro_thumbnail_path + ", pro_title=" + pro_title 
				+ ", pro_close_dt=" + pro_close_dt + ", pro_status=" + pro_status + "]";
	}

}
