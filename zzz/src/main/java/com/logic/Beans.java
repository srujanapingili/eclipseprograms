package com.logic;

import org.springframework.context.annotation.Bean;

public class Beans {
	@Bean
	public Depen ss() {
		Depen de = new Depen();
		return de;
	}

	@Bean
	public Iphone imeth() {
		Iphone i = new Iphone();
		return i;
	}

	@Bean
	public Samsung smeth() {
		Samsung i = new Samsung();
		return i;
	}
}
