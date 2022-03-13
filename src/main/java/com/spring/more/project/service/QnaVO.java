package com.spring.more.project.service;

public class QnaVO {
	private String qna_no;
	private String user_no;
	private String pro_no;
	private String qna_name;
	private String qna_content;
	private String qna_attr; // 삭제 필요
	private String qna_regdate;
	private String qna_secret;
	private String qna_status;    
	private String q_no; // 삭제 필요 
	
	//join용 필드
	private String user_name; //회원이름
	private String user_phone; // 회원 전화번호
	private String user_email; // 회원 이메일

	private String pro_title; //펀딩 상품 제목(이름)
	private String rnum; // ROWNUM 정렬 글번호
	
	// 추가 변수
	private String qna_answer_content; // 관리자 답변
	private String qna_answer_regdate; // 관리자 답변 등록 일시

	//검색을 위한 변수 
	private String searchCondition;
	private String searchKeyword;
	
	//--------------------------------------------
	
	public QnaVO() {
		System.out.println(">> QnaVO() 객체 생성");
	}

	public QnaVO(String qna_no, String user_no, String pro_no, String qna_name, String qna_content, String qna_attr,
			String qna_regdate, String qna_secret, String qna_status, String q_no, String user_name, String user_phone,
			String user_email, String pro_title, String rnum, String qna_answer_content, String qna_answer_regdate,
			String searchCondition, String searchKeyword) {
		super();
		this.qna_no = qna_no;
		this.user_no = user_no;
		this.pro_no = pro_no;
		this.qna_name = qna_name;
		this.qna_content = qna_content;
		this.qna_attr = qna_attr;
		this.qna_regdate = qna_regdate;
		this.qna_secret = qna_secret;
		this.qna_status = qna_status;
		this.q_no = q_no;
		this.user_name = user_name;
		this.user_phone = user_phone;
		this.user_email = user_email;
		this.pro_title = pro_title;
		this.rnum = rnum;
		this.qna_answer_content = qna_answer_content;
		this.qna_answer_regdate = qna_answer_regdate;
		this.searchCondition = searchCondition;
		this.searchKeyword = searchKeyword;
	}

	public String getQna_no() {
		return qna_no;
	}

	public void setQna_no(String qna_no) {
		this.qna_no = qna_no;
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

	public String getQna_name() {
		return qna_name;
	}

	public void setQna_name(String qna_name) {
		this.qna_name = qna_name;
	}

	public String getQna_content() {
		return qna_content;
	}

	public void setQna_content(String qna_content) {
		this.qna_content = qna_content;
	}

	public String getQna_attr() {
		return qna_attr;
	}

	public void setQna_attr(String qna_attr) {
		this.qna_attr = qna_attr;
	}

	public String getQna_regdate() {
		return qna_regdate;
	}

	public void setQna_regdate(String qna_regdate) {
		this.qna_regdate = qna_regdate;
	}

	public String getQna_secret() {
		return qna_secret;
	}

	public void setQna_secret(String qna_secret) {
		this.qna_secret = qna_secret;
	}

	public String getQna_status() {
		return qna_status;
	}

	public void setQna_status(String qna_status) {
		this.qna_status = qna_status;
	}

	public String getQ_no() {
		return q_no;
	}

	public void setQ_no(String q_no) {
		this.q_no = q_no;
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

	public String getPro_title() {
		return pro_title;
	}

	public void setPro_title(String pro_title) {
		this.pro_title = pro_title;
	}

	public String getRnum() {
		return rnum;
	}

	public void setRnum(String rnum) {
		this.rnum = rnum;
	}

	public String getQna_answer_content() {
		return qna_answer_content;
	}

	public void setQna_answer_content(String qna_answer_content) {
		this.qna_answer_content = qna_answer_content;
	}

	public String getQna_answer_regdate() {
		return qna_answer_regdate;
	}

	public void setQna_answer_regdate(String qna_answer_regdate) {
		this.qna_answer_regdate = qna_answer_regdate;
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
		return "QnaVO [qna_no=" + qna_no + ", user_no=" + user_no + ", pro_no=" + pro_no + ", qna_name=" + qna_name
				+ ", qna_content=" + qna_content + ", qna_attr=" + qna_attr + ", qna_regdate=" + qna_regdate
				+ ", qna_secret=" + qna_secret + ", qna_status=" + qna_status + ", q_no=" + q_no + ", user_name="
				+ user_name + ", user_phone=" + user_phone + ", user_email=" + user_email + ", pro_title=" + pro_title
				+ ", rnum=" + rnum + ", qna_answer_content=" + qna_answer_content + ", qna_answer_regdate="
				+ qna_answer_regdate + ", searchCondition=" + searchCondition + ", searchKeyword=" + searchKeyword
				+ "]";
	}

}