package com.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Depen {
	@Autowired
	@Qualifier("i")
	public Phone ph;

	public Phone getPh() {
		return ph;
	}

	public void setPh(Phone ph) {
		this.ph = ph;
	}

	public void method() {
		ph.cost();
		ph.model();
	}

}
