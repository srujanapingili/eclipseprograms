package com.atlanata;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunDemo {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(Total.class);
		Demo demo = (Demo) context.getBean("customer");
		demo.method("srujana");
		Disk disk = (Disk) context.getBean("owner");
		disk.method("sravya");

	}

}
