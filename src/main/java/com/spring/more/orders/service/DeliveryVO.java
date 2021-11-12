package com.spring.more.orders.service;

public class DeliveryVO {
	private String delivery_no;
	
	private String delivery_name;
	private String delivery_address;
	private String delivery_address_number;
	private String delivery_phone;
	private String delivery_arrival_date;
	private String delivery_class;
	
	
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
	public String getDelivery_phone() {
		return delivery_phone;
	}
	public void setDelivery_phone(String delivery_phone) {
		this.delivery_phone = delivery_phone;
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
	
	@Override
	public String toString() {
		return "DeliveryVO [delivery_no=" + delivery_no + ", delivery_name=" + delivery_name + ", delivery_address="
				+ delivery_address + ", delivery_address_number=" + delivery_address_number + ", delivery_phone="
				+ delivery_phone + ", delivery_arrival_date=" + delivery_arrival_date + ", delivery_class="
				+ delivery_class + "]";
	}
	
	
	
}
