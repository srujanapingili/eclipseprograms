package com.logic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Store.class);
		Store s = (Store) context.getBean("meth");
		System.out.println("sss" + s.getName());

	}

}
