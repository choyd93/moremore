package com.spring.more.users.service;

public class MemberVO {
	private String id;
	private String name;
	private String password;
	private String email;
	
	public MemberVO() { }
	
	public MemberVO(String id, String password) {
		this.id = id;
		this.password = password;
	}

	public MemberVO(String id, String name, String password, String email) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email + "]";
	}
	
}
