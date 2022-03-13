package com.spring.more.project.service;

public class GoodsVO {
	private String goods_no;
	private String pro_no;
	private String goods_title;
	private String goods_content;
	private String goods_price;
	private String goods_type;
	private String goods_stock;

	// rownum 추가
	private String goods_rnum;

	// 수량 담아줄 필드
	private String goods_ea;

	// 후원금
	private String donation_price;

	// 비공개
	private String private_name;
	
	//-----------주문용 변수--------------
	private String goods_no1;
	private String goods_no2;
	private String goods_no3;
	private String goods_rnum1;
	private String goods_rnum2;
	private String goods_rnum3;
	private String goods_ea1;
	private String goods_ea2;
	private String goods_ea3;
	private String goods_price1;
	private String goods_price2;
	private String goods_price3;
	private String goods_title1;
	private String goods_title2;
	private String goods_title3;
	//---------------------------------
	
	//주문테이블 판매수량 
		private String order_ea;
	

	public GoodsVO() {}

	// pro_no 1개 생성자
	public GoodsVO(String pro_no) {
		this.pro_no = pro_no;
	}

	public GoodsVO(String goods_no, String pro_no, String goods_title, String goods_content, String goods_price,
			String goods_type, String goods_stock, String goods_rnum) {
		this.goods_no = goods_no;
		this.pro_no = pro_no;
		this.goods_title = goods_title;
		this.goods_content = goods_content;
		this.goods_price = goods_price;
		this.goods_type = goods_type;
		this.goods_stock = goods_stock;
		this.goods_rnum = goods_rnum;
	}
	
	//------------  주문용 생성자 ----------------
	public GoodsVO(String pro_no, String donation_price, String private_name, String goods_no1, String goods_no2,
			String goods_no3, String goods_rnum1, String goods_rnum2, String goods_rnum3, String goods_ea1,
			String goods_ea2, String goods_ea3, String goods_price1, String goods_price2, String goods_price3,
			String goods_title1, String goods_title2, String goods_title3) {
		this.pro_no = pro_no;
		this.donation_price = donation_price;
		this.private_name = private_name;
		this.goods_no1 = goods_no1;
		this.goods_no2 = goods_no2;
		this.goods_no3 = goods_no3;
		this.goods_rnum1 = goods_rnum1;
		this.goods_rnum2 = goods_rnum2;
		this.goods_rnum3 = goods_rnum3;
		this.goods_ea1 = goods_ea1;
		this.goods_ea2 = goods_ea2;
		this.goods_ea3 = goods_ea3;
		this.goods_price1 = goods_price1;
		this.goods_price2 = goods_price2;
		this.goods_price3 = goods_price3;
		this.goods_title1 = goods_title1;
		this.goods_title2 = goods_title2;
		this.goods_title3 = goods_title3;
		
	}

	
	public GoodsVO(String goods_ea , String goods_rnum, String goods_no, String pro_no, String goods_price, String goods_title) {
		this.goods_ea = goods_ea;
		this.goods_no = goods_no;
		this.pro_no = pro_no;
		this.goods_rnum = goods_rnum;
		this.goods_price = goods_price;
		this.goods_title = goods_title;
	}
	
	public GoodsVO(String donation_price, String private_name) {
		this.donation_price = donation_price;
		this.private_name = private_name;
	}
	//----------------------------------------------------------------------

	public String getGoods_no() {
		return goods_no;
	}

	public void setGoods_no(String goods_no) {
		this.goods_no = goods_no;
	}

	public String getPro_no() {
		return pro_no;
	}

	public void setPro_no(String pro_no) {
		this.pro_no = pro_no;
	}

	public String getGoods_title() {
		return goods_title;
	}

	public void setGoods_title(String goods_title) {
		this.goods_title = goods_title;
	}

	public String getGoods_content() {
		return goods_content;
	}

	public void setGoods_content(String goods_content) {
		this.goods_content = goods_content;
	}

	public String getGoods_price() {
		return goods_price;
	}

	public void setGoods_price(String goods_price) {
		this.goods_price = goods_price;
	}

	public String getGoods_type() {
		return goods_type;
	}

	public void setGoods_type(String goods_type) {
		this.goods_type = goods_type;
	}

	public String getGoods_stock() {
		return goods_stock;
	}

	public void setGoods_stock(String goods_stock) {
		this.goods_stock = goods_stock;
	}

	public String getGoods_rnum() {
		return goods_rnum;
	}

	public void setGoods_rnum(String goods_rnum) {
		this.goods_rnum = goods_rnum;
	}

	public String getGoods_ea() {
		return goods_ea;
	}

	public void setGoods_ea(String goods_ea) {
		this.goods_ea = goods_ea;
	}

	public String getDonation_price() {
		return donation_price;
	}

	public void setDonation_price(String donation_price) {
		this.donation_price = donation_price;
	}

	public String getPrivate_name() {
		return private_name;
	}

	public void setPrivate_name(String private_name) {
		this.private_name = private_name;
	}
	
	//--------------------------------------------
	public String getGoods_no1() {
		return goods_no1;
	}

	public void setGoods_no1(String goods_no1) {
		this.goods_no1 = goods_no1;
	}

	public String getGoods_no2() {
		return goods_no2;
	}

	public void setGoods_no2(String goods_no2) {
		this.goods_no2 = goods_no2;
	}

	public String getGoods_no3() {
		return goods_no3;
	}

	public void setGoods_no3(String goods_no3) {
		this.goods_no3 = goods_no3;
	}

	public String getGoods_rnum1() {
		return goods_rnum1;
	}

	public void setGoods_rnum1(String goods_rnum1) {
		this.goods_rnum1 = goods_rnum1;
	}

	public String getGoods_rnum2() {
		return goods_rnum2;
	}

	public void setGoods_rnum2(String goods_rnum2) {
		this.goods_rnum2 = goods_rnum2;
	}

	public String getGoods_rnum3() {
		return goods_rnum3;
	}

	public void setGoods_rnum3(String goods_rnum3) {
		this.goods_rnum3 = goods_rnum3;
	}

	public String getGoods_ea1() {
		return goods_ea1;
	}

	public void setGoods_ea1(String goods_ea1) {
		this.goods_ea1 = goods_ea1;
	}

	public String getGoods_ea2() {
		return goods_ea2;
	}

	public void setGoods_ea2(String goods_ea2) {
		this.goods_ea2 = goods_ea2;
	}

	public String getGoods_ea3() {
		return goods_ea3;
	}

	public void setGoods_ea3(String goods_ea3) {
		this.goods_ea3 = goods_ea3;
	}

	public String getGoods_price1() {
		return goods_price1;
	}

	public void setGoods_price1(String goods_price1) {
		this.goods_price1 = goods_price1;
	}

	public String getGoods_price2() {
		return goods_price2;
	}

	public void setGoods_price2(String goods_price2) {
		this.goods_price2 = goods_price2;
	}

	public String getGoods_price3() {
		return goods_price3;
	}

	public void setGoods_price3(String goods_price3) {
		this.goods_price3 = goods_price3;
	}
	
	public String getGoods_title1() {
		return goods_title1;
	}

	public void setGoods_title1(String goods_title1) {
		this.goods_title1 = goods_title1;
	}

	public String getGoods_title2() {
		return goods_title2;
	}

	public void setGoods_title2(String goods_title2) {
		this.goods_title2 = goods_title2;
	}

	public String getGoods_title3() {
		return goods_title3;
	}

	public void setGoods_title3(String goods_title3) {
		this.goods_title3 = goods_title3;
	}

	//------------------------------------------------

	public String getOrder_ea() {
		return order_ea;
	}

	public void setOrder_ea(String order_ea) {
		this.order_ea = order_ea;
	}
	
	@Override
	public String toString() {
		return "GoodsVO [goods_no=" + goods_no + ", pro_no=" + pro_no + ", goods_title=" + goods_title
				+ ", goods_content=" + goods_content + ", goods_price=" + goods_price + ", goods_type=" + goods_type
				+ ", goods_stock=" + goods_stock + ", goods_rnum=" + goods_rnum + ", goods_ea=" + goods_ea
				+ ", donation_price=" + donation_price + ", private_name=" + private_name + ", goods_no1="
				+ goods_no1 + ", goods_no2=" + goods_no2 + ", goods_no3=" + goods_no3 + ", goods_rnum1="
				+ goods_rnum1 + ", goods_rnum2=" + goods_rnum2 + ", goods_rnum3=" + goods_rnum3 + ", goods_ea1="
				+ goods_ea1 + ", goods_ea2=" + goods_ea2 + ", goods_ea3=" + goods_ea3 + ", goods_price1="
				+ goods_price1 + ", goods_price2=" + goods_price2 + ", goods_price3=" + goods_price3
				+ ", goods_title1=" + goods_title1 + ", goods_title2=" + goods_title2 + ", goods_title3="
				+ goods_title3 + ", order_ea=" + order_ea + "]";
	}



}