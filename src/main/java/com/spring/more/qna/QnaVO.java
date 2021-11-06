package com.spring.more.qna;

public class QnaVO {
	private String qna_no;
	private String user_no;
	private String pro_no;
	private String qna_name;
	private String qna_content;
	private String qna_attr;
	private String qna_regdate;
	private String qna_secret;
	private String qna_status;
	
	public QnaVO() {
		System.out.println(">> QnaVO() 객체 생성");
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

	@Override
	public String toString() {
		return "QnaVO [qna_no=" + qna_no + ", user_no=" + user_no + ", pro_no=" + pro_no + ", qna_name=" + qna_name
				+ ", qna_content=" + qna_content + ", qna_attr=" + qna_attr + ", qna_regdate=" + qna_regdate
				+ ", qna_secret=" + qna_secret + ", qna_status=" + qna_status + "]";
	}
	
	
}
