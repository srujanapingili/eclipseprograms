package com.logic.tek;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration

@ComponentScan(basePackages="com.logic")
public class Dispatcher  {
	@Bean
	public InternalResourceViewResolver resolver() {
		InternalResourceViewResolver re=new InternalResourceViewResolver();
		re.setPrefix("/WEB-INF/");
		re.setSuffix(".jsp");
		return re;
	}

}
