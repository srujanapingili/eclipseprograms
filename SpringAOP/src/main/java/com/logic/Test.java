package com.logic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Service service = (Service) context.getBean("first");
		System.out.println("*********");
		service.getName();
		System.out.println("**********");
		service.getCity();
		System.out.println("**********");
		try {
			service.exception();

		} catch (Exception e) {

		}

	}

}
