package com.logic;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

public class Store {

	@Value("susjj")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Bean()
	public Store meth() {
		return new Store();
	}

}
