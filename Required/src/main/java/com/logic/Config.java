package com.logic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
public class Config {
	@Bean
	public Employer em() {	
	Employer e=new Employer();
	e.setName("INDIA");
		return e;
	}
	@Bean
	public Class g() {
		return new Class();
	}
	
}
