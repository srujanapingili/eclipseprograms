package com.logic;

import org.springframework.context.annotation.Bean;

public class Beans {
	@Bean
	public Depen ss() {
		Depen de = new Depen();
		return de;
	}

	@Bean
	public Iphone getS() {
		Iphone i = new Iphone();
		i.setName("srujana");
		return i;
	}

}
