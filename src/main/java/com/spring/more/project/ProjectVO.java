package com.spring.more.project;

public class ProjectVO {
	private String pro_no;
	private String user_no;
	private String pro_cateno;
	private String company_no;
	private String pro_title;
	private String pro_stitle;
	private String pro_gprice;
	private String pro_thumbnail_path;
	private String pro_img_path;
	private String pro_start_dt;
	private String pro_close_dt;
	private String pro_hashtag;
	private String pro_status;
	private String pro_count;
	private String pro_type;
	
	public ProjectVO() {
		System.out.println(">> ProjectVO() 객체 생성");
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

	public String getPro_cateno() {
		return pro_cateno;
	}

	public void setPro_cateno(String pro_cateno) {
		this.pro_cateno = pro_cateno;
	}

	public String getCompany_no() {
		return company_no;
	}

	public void setCompany_no(String company_no) {
		this.company_no = company_no;
	}

	public String getPro_title() {
		return pro_title;
	}

	public void setPro_title(String pro_title) {
		this.pro_title = pro_title;
	}

	public String getPro_stitle() {
		return pro_stitle;
	}

	public void setPro_stitle(String pro_stitle) {
		this.pro_stitle = pro_stitle;
	}

	public String getPro_gprice() {
		return pro_gprice;
	}

	public void setPro_gprice(String pro_gprice) {
		this.pro_gprice = pro_gprice;
	}

	public String getPro_thumbnail_path() {
		return pro_thumbnail_path;
	}

	public void setPro_thumbnail_path(String pro_thumbnail_path) {
		this.pro_thumbnail_path = pro_thumbnail_path;
	}

	public String getPro_img_path() {
		return pro_img_path;
	}

	public void setPro_img_path(String pro_img_path) {
		this.pro_img_path = pro_img_path;
	}

	public String getPro_start_dt() {
		return pro_start_dt;
	}

	public void setPro_start_dt(String pro_start_dt) {
		this.pro_start_dt = pro_start_dt;
	}

	public String getPro_close_dt() {
		return pro_close_dt;
	}

	public void setPro_close_dt(String pro_close_dt) {
		this.pro_close_dt = pro_close_dt;
	}

	public String getPro_hashtag() {
		return pro_hashtag;
	}

	public void setPro_hashtag(String pro_hashtag) {
		this.pro_hashtag = pro_hashtag;
	}

	public String getPro_status() {
		return pro_status;
	}

	public void setPro_status(String pro_status) {
		this.pro_status = pro_status;
	}

	public String getPro_count() {
		return pro_count;
	}

	public void setPro_count(String pro_count) {
		this.pro_count = pro_count;
	}

	public String getPro_type() {
		return pro_type;
	}

	public void setPro_type(String pro_type) {
		this.pro_type = pro_type;
	}

	@Override
	public String toString() {
		return "ProjectVO [PRO_NO=" + pro_no + ", user_no=" + user_no + ", pro_cateno=" + pro_cateno + ", company_no="
				+ company_no + ", pro_title=" + pro_title + ", pro_stitle=" + pro_stitle + ", pro_gprice=" + pro_gprice
				+ ", pro_thumbnail_path=" + pro_thumbnail_path + ", pro_img_path=" + pro_img_path + ", pro_start_dt="
				+ pro_start_dt + ", pro_close_dt=" + pro_close_dt + ", pro_hashtag=" + pro_hashtag + ", pro_status="
				+ pro_status + ", pro_count=" + pro_count + ", pro_type=" + pro_type + "]";
	}
	

}
