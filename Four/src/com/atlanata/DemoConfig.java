package com.atlanata;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoConfig {
	@Bean(name="customer")
	public Demo demo() {
		return new Demo();
	}

}
