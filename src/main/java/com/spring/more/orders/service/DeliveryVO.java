package com.spring.more.orders.service;

public class DeliveryVO {
	
	private String delivery_no;
	private String delivery_name;
	private String delivery_address;
	private String delivery_address_number;
	private String delivery_address_phone;
	private String delivery_arrival_date;
	private String delivery_class;
	private String user_no;
	
	public DeliveryVO() {}
	
	
	// 기본 배송지 설정을 위한 생성자
	public DeliveryVO(String user_no) {
		this.user_no = user_no;
	}

	public DeliveryVO(String delivery_name, String delivery_address, String delivery_address_number,
			String delivery_address_phone) {
		this.delivery_name = delivery_name;
		this.delivery_address = delivery_address;
		this.delivery_address_number = delivery_address_number;
		this.delivery_address_phone = delivery_address_phone;
	}
	
	
	public String getDelivery_no() {
		return delivery_no;
	}
		

	public void setDelivery_no(String delivery_no) {
		this.delivery_no = delivery_no;
	}

	public String getDelivery_name() {
		return delivery_name;
	}

	public void setDelivery_name(String delivery_name) {
		this.delivery_name = delivery_name;
	}

	public String getDelivery_address() {
		return delivery_address;
	}

	public void setDelivery_address(String delivery_address) {
		this.delivery_address = delivery_address;
	}

	public String getDelivery_address_number() {
		return delivery_address_number;
	}

	public void setDelivery_address_number(String delivery_address_number) {
		this.delivery_address_number = delivery_address_number;
	}

	public String getDelivery_address_phone() {
		return delivery_address_phone;
	}

	public void setDelivery_address_phone(String delivery_address_phone) {
		this.delivery_address_phone = delivery_address_phone;
	}

	public String getDelivery_arrival_date() {
		return delivery_arrival_date;
	}

	public void setDelivery_arrival_date(String delivery_arrival_date) {
		this.delivery_arrival_date = delivery_arrival_date;
	}

	public String getDelivery_class() {
		return delivery_class;
	}

	public void setDelivery_class(String delivery_class) {
		this.delivery_class = delivery_class;
	}

	public String getUser_no() {
		return user_no;
	}

	public void setUser_no(String user_no) {
		this.user_no = user_no;
	}

//	@Override
//	public String toString() {
//		return "DeliveryVO [delivery_name=" + delivery_name + ", delivery_address=" + delivery_address
//				+ ", delivery_address_number=" + delivery_address_number + ", delivery_address_phone="
//				+ delivery_address_phone + "]";
//	}

	@Override
	public String toString() {
		return "DeliveryVO [delivery_no=" + delivery_no + ", delivery_name=" + delivery_name + ", delivery_address="
				+ delivery_address + ", delivery_address_number=" + delivery_address_number
				+ ", delivery_address_phone=" + delivery_address_phone + ", delivery_arrival_date="
				+ delivery_arrival_date + ", delivery_class=" + delivery_class + ", user_no=" + user_no + "]";
	}

	public String deliveryString() {
		return "DeliveryVO [delivery_no=" + delivery_no + ", delivery_name=" + delivery_name + ", delivery_address="
				+ delivery_address + ", delivery_address_number=" + delivery_address_number
				+ ", delivery_address_phone=" + delivery_address_phone + ", delivery_arrival_date="
				+ delivery_arrival_date + ", delivery_class=" + delivery_class + "]";
	}
	
	
	
}
