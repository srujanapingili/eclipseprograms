package com.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Depen {
	@Autowired
	public Iphone ph;

	public Iphone getPh() {
		return ph;
	}

	public void setPh(Iphone ph) {
		this.ph = ph;
	}

	public void method() {
		System.out.println("hhhhhh");
	}

}
