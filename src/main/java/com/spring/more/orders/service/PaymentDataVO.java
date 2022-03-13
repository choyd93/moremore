package com.spring.more.orders.service;

public class PaymentDataVO {
	//펀딩 관리자 메인 데이터
	private String current_sales_status; // 금일 매출 현황
	private String current_sales_number_of_cases; // 금일 판매 건수
	private String weekly_sales_number_of_cases; //주별 판매 건수
	private String monthly_sales_number_of_cases; // 월별 판매 건수
	private String weekly_sales_amount;// 주별 판매금액
	private String monthly_sales_amount; // 월별 판매금액
	
	public PaymentDataVO () {}

	public PaymentDataVO(String current_sales_status, String current_sales_number_of_cases,
			String weekly_sales_number_of_cases, String monthly_sales_number_of_cases, String weekly_sales_amount,
			String monthly_sales_amount) {
		super();
		this.current_sales_status = current_sales_status;
		this.current_sales_number_of_cases = current_sales_number_of_cases;
		this.weekly_sales_number_of_cases = weekly_sales_number_of_cases;
		this.monthly_sales_number_of_cases = monthly_sales_number_of_cases;
		this.weekly_sales_amount = weekly_sales_amount;
		this.monthly_sales_amount = monthly_sales_amount;
	}

	public String getCurrent_sales_status() {
		return current_sales_status;
	}

	public void setCurrent_sales_status(String current_sales_status) {
		this.current_sales_status = current_sales_status;
	}

	public String getCurrent_sales_number_of_cases() {
		return current_sales_number_of_cases;
	}

	public void setCurrent_sales_number_of_cases(String current_sales_number_of_cases) {
		this.current_sales_number_of_cases = current_sales_number_of_cases;
	}

	public String getWeekly_sales_number_of_cases() {
		return weekly_sales_number_of_cases;
	}

	public void setWeekly_sales_number_of_cases(String weekly_sales_number_of_cases) {
		this.weekly_sales_number_of_cases = weekly_sales_number_of_cases;
	}

	public String getMonthly_sales_number_of_cases() {
		return monthly_sales_number_of_cases;
	}

	public void setMonthly_sales_number_of_cases(String monthly_sales_number_of_cases) {
		this.monthly_sales_number_of_cases = monthly_sales_number_of_cases;
	}

	public String getWeekly_sales_amount() {
		return weekly_sales_amount;
	}

	public void setWeekly_sales_amount(String weekly_sales_amount) {
		this.weekly_sales_amount = weekly_sales_amount;
	}

	public String getMonthly_sales_amount() {
		return monthly_sales_amount;
	}

	public void setMonthly_sales_amount(String monthly_sales_amount) {
		this.monthly_sales_amount = monthly_sales_amount;
	}

	@Override
	public String toString() {
		return "PaymentDataVO [current_sales_status=" + current_sales_status + ", current_sales_number_of_cases="
				+ current_sales_number_of_cases + ", weekly_sales_number_of_cases=" + weekly_sales_number_of_cases
				+ ", monthly_sales_number_of_cases=" + monthly_sales_number_of_cases + ", weekly_sales_amount="
				+ weekly_sales_amount + ", monthly_sales_amount=" + monthly_sales_amount + "]";
	}
	
}
