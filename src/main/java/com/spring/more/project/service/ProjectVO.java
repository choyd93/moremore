package com.spring.more.project.service;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(value= {"searchCondition","searchKeyword"})

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
	
	// 추가
	private String reasonTOCloseProject;
	
	//페이징 위한 변수 -------------------------------------
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
	
	
	//검색 변수 
	private String searchCondition;
	private String searchKeyword;
	
	// 은해누나
	//상품 상세페이지용 필드
	private String pro_catename;
	private String company_name;
	
	// 서포터
	private String user_name;
	private String private_name;
	private String payment_price;
	
	public ProjectVO() {
		System.out.println(">> ProjectVO() 객체 생성");
	}
	public ProjectVO(String pro_no) {
		this.pro_no = pro_no;
	}
	

	

	public ProjectVO(String pro_no, String user_no, String pro_cateno, String company_no, String pro_title,
			String pro_stitle, String pro_gprice, String pro_thumbnail_path, String pro_img_path, String pro_start_dt,
			String pro_close_dt, String pro_hashtag, String pro_status, String pro_count, String pro_type,
			String reasonTOCloseProject, int begin, int end, String searchCondition, String searchKeyword,
			String pro_catename, String company_name, String user_name, String private_name, String payment_price) {
		super();
		this.pro_no = pro_no;
		this.user_no = user_no;
		this.pro_cateno = pro_cateno;
		this.company_no = company_no;
		this.pro_title = pro_title;
		this.pro_stitle = pro_stitle;
		this.pro_gprice = pro_gprice;
		this.pro_thumbnail_path = pro_thumbnail_path;
		this.pro_img_path = pro_img_path;
		this.pro_start_dt = pro_start_dt;
		this.pro_close_dt = pro_close_dt;
		this.pro_hashtag = pro_hashtag;
		this.pro_status = pro_status;
		this.pro_count = pro_count;
		this.pro_type = pro_type;
		this.reasonTOCloseProject = reasonTOCloseProject;
		this.begin = begin;
		this.end = end;
		this.searchCondition = searchCondition;
		this.searchKeyword = searchKeyword;
		this.pro_catename = pro_catename;
		this.company_name = company_name;
		this.user_name = user_name;
		this.private_name = private_name;
		this.payment_price = payment_price;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPrivate_name() {
		return private_name;
	}

	public void setPrivate_name(String private_name) {
		this.private_name = private_name;
	}

	public String getPayment_price() {
		return payment_price;
	}

	public void setPayment_price(String payment_price) {
		this.payment_price = payment_price;
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

	public String getReasonTOCloseProject() {
		return reasonTOCloseProject;
	}

	public void setReasonTOCloseProject(String reasonTOCloseProject) {
		this.reasonTOCloseProject = reasonTOCloseProject;
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


	//--------------- 조인용 ------------------
	public String getPro_catename() {
		return pro_catename;
	}

	public void setPro_catename(String pro_catename) {
		this.pro_catename = pro_catename;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	
	@Override
	public String toString() {
		return "ProjectVO [pro_no=" + pro_no + ", user_no=" + user_no + ", pro_cateno=" + pro_cateno + ", company_no="
				+ company_no + ", pro_title=" + pro_title + ", pro_stitle=" + pro_stitle + ", pro_gprice=" + pro_gprice
				+ ", pro_thumbnail_path=" + pro_thumbnail_path + ", pro_img_path=" + pro_img_path + ", pro_start_dt="
				+ pro_start_dt + ", pro_close_dt=" + pro_close_dt + ", pro_hashtag=" + pro_hashtag + ", pro_status="
				+ pro_status + ", pro_count=" + pro_count + ", pro_type=" + pro_type + ", reasonTOCloseProject="
				+ reasonTOCloseProject + ", searchCondition=" + searchCondition + ", searchKeyword=" + searchKeyword
				+ "]";
	}
	
}
