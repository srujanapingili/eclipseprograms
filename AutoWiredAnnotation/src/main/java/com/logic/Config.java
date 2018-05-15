package com.logic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


public class Config {
	@Bean
	public Patient patient() {
		Patient pa = new Patient();
		return pa;
	}

	@Bean
	public Info in() {
		Info i = new Info();
		i.setName("aruna");
		i.setAge(49);
		i.setAmount(450);
		return i;
	}
}
