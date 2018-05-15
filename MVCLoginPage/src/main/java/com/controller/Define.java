package com.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
@Configuration

@ComponentScan(basePackages="com.logic")
public class Define {
		@Bean
		public InternalResourceViewResolver resolver() {
			InternalResourceViewResolver re=new InternalResourceViewResolver();
			re.setPrefix("/WEB-INF/");
			re.setSuffix(".jsp");
			return re;
		}

	}

