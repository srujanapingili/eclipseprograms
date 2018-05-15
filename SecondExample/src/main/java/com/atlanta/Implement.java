package com.atlanta;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Implement {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("confi.xml");
		Result result=(Result)context.getBean("srujana");
		result.tyre();
		

	}

}
