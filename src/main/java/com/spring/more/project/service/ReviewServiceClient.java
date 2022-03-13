package com.spring.more.project.service;

import org.springframework.context.support.GenericXmlApplicationContext;

public class ReviewServiceClient {

	public static void main(String[] args) {
		System.out.println("--- 스프링 컨테이너 구동전 ----");
		//1. 스프링 컨테이너 구동(스프링 설정 파일 읽어서)
		GenericXmlApplicationContext container
				= new GenericXmlApplicationContext("applicationContext.xml");
		
		System.out.println("--- 스프링 컨테이너 구동후 ----");
		
		//2. 스프링 컨테이너 사용 : 생성된 객체 요청(lookup)
		ReviewService reviewService = (ReviewService) container.getBean("reviewService");
		
		//3. 스프링 컨테이너 종료(close)
		container.close();

	}

}