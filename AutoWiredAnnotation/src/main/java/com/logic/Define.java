package com.logic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
@Configuration
@ComponentScan(basePackages="com.logic")
public class Define {
			@Bean
		public InternalResourceViewResolver solver() {
			InternalResourceViewResolver re = new InternalResourceViewResolver();
			return re;
		}
}
