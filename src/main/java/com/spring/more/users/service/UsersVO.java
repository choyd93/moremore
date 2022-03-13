package com.spring.more.users.service;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(value= {"searchCondition","searchKeyword"})

public class UsersVO {
	private String user_no;
	private String user_id;
	private String user_pwd;
	private String user_name;
	private String user_phone;
	private String user_email;
	private String user_gender;
	private String user_joindate;
	private String user_type;
	private String user_address;
	private String user_address_number;
	private String user_address_detail;
	private String user_withdrawal_reason;
	
	//검색조건용 필드 추가 
	private String searchCondition;
	private String searchKeyword;
	
	// 회사정보 
		private String company_name;
	

		//페이징 처리 필드 --------------------------
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
		

	public UsersVO() {}

	// 은해누나
	public UsersVO(String user_id, String user_pwd) {
		this.user_id = user_id;
		this.user_pwd = user_pwd;
	}
	//
	
	
	
	public String getUser_no() {
		return user_no;
	}

	public UsersVO(String user_no, String user_id, String user_pwd, String user_name, String user_phone,
			String user_email, String user_gender, String user_joindate, String user_type, String user_address,
			String user_address_number, String user_address_detail, String user_withdrawal_reason,
			String searchCondition, String searchKeyword, String company_name, int begin, int end) {
		super();
		this.user_no = user_no;
		this.user_id = user_id;
		this.user_pwd = user_pwd;
		this.user_name = user_name;
		this.user_phone = user_phone;
		this.user_email = user_email;
		this.user_gender = user_gender;
		this.user_joindate = user_joindate;
		this.user_type = user_type;
		this.user_address = user_address;
		this.user_address_number = user_address_number;
		this.user_address_detail = user_address_detail;
		this.user_withdrawal_reason = user_withdrawal_reason;
		this.searchCondition = searchCondition;
		this.searchKeyword = searchKeyword;
		this.company_name = company_name;
		this.begin = begin;
		this.end = end;
	}
	public void setUser_no(String user_no) {
		this.user_no = user_no;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_pwd() {
		return user_pwd;
	}

	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_phone() {
		return user_phone;
	}

	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_gender() {
		return user_gender;
	}

	public void setUser_gender(String user_gender) {
		this.user_gender = user_gender;
	}

	public String getUser_joindate() {
		return user_joindate;
	}

	public void setUser_joindate(String user_joindate) {
		this.user_joindate = user_joindate;
	}

	public String getUser_type() {
		return user_type;
	}

	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}

	public String getUser_address() {
		return user_address;
	}

	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}

	public String getUser_address_number() {
		return user_address_number;
	}

	public void setUser_address_number(String user_address_number) {
		this.user_address_number = user_address_number;
	}

	public String getUser_address_detail() {
		return user_address_detail;
	}

	public void setUser_address_detail(String user_address_detail) {
		this.user_address_detail = user_address_detail;
	}

	public String getUser_withdrawal_reason() {
		return user_withdrawal_reason;
	}

	public void setUser_withdrawal_reason(String user_withdrawal_reason) {
		this.user_withdrawal_reason = user_withdrawal_reason;
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

	public String getCompany_name() {
			return company_name;
		}
		public void setCompany_name(String company_name) {
			this.company_name = company_name;
		}
		@Override
		public String toString() {
			return "UsersVO [user_no=" + user_no + ", user_id=" + user_id + ", user_pwd=" + user_pwd + ", user_name="
					+ user_name + ", user_phone=" + user_phone + ", user_email=" + user_email + ", user_gender="
					+ user_gender + ", user_joindate=" + user_joindate + ", user_type=" + user_type + ", user_address="
					+ user_address + ", user_address_number=" + user_address_number + ", user_address_detail="
					+ user_address_detail + ", user_withdrawal_reason=" + user_withdrawal_reason + ", searchCondition="
					+ searchCondition + ", searchKeyword=" + searchKeyword + ", company_name=" + company_name
					+ ", begin=" + begin + ", end=" + end + "]";
		}


}
