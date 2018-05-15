package com.atlanta;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Link {
@Bean(name="sravya")
	public First first(){
		return new First();
	}
	
}
