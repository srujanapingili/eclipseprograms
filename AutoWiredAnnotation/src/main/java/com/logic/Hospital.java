package com.logic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class Hospital {

	@RequestMapping(value="/")
	public String meth() {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Patient patient=(Patient) context.getBean(Patient.class);
		patient.get();
		return "srujana";

	}

}
