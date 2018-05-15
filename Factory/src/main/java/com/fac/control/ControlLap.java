package com.fac.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fac.Laptop;
import com.fac.depen.KeyBoard;

@Controller
public class ControlLap {
	
	@Autowired
	KeyBoard key;
	public KeyBoard getKey() {
		return key;
	}
	public void setKey(KeyBoard key) {
		this.key = key;
	}
	@RequestMapping(value="/")
	public String meth() {
		
		System.out.println(getKey().getAlphabet());
		ApplicationContext context=new ClassPathXmlApplicationContext(Laptop.class);
		KeyBoard lap=(KeyBoard) context.getBean("srujana");
		return "Lapto";
	}

}
