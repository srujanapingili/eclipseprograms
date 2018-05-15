package com.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Patient {
	@Autowired
	Info info;
	String disease;

	public Info getInfo() {
		return info;
	}

	public void setInfo(Info info) {
		this.info = info;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public void get() {
		System.out.println("the patiet name is " + getInfo().getName() + "age is " + getInfo().getAge()
				+ "amount to pay" + getInfo().getAmount());
	}
}
