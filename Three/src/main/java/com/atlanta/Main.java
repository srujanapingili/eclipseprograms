package com.atlanta;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class Main {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext("Link.class");
		Idefine define=(Idefine)context.getBean("sravya");
		define.method("srujana");
	}

	}


