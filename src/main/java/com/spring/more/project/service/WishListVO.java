package com.spring.more.project.service;

public class WishListVO {
	private String pro_no;
	private String user_no;
	private String wish_no;
	
	public String getWish_no() {
		return wish_no;
	}
	public void setWish_no(String wish_no) {
		this.wish_no = wish_no;
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
	
	@Override
	public String toString() {
		return "WishListVO [pro_no=" + pro_no + ", user_no=" + user_no + ", wish_no=" + wish_no + "]";
	}
	
	
	
}
