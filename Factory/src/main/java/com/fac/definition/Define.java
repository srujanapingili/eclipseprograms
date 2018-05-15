package com.fac.definition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages="com.fac")
public class Define {
	@Bean
	public InternalResourceViewResolver solver() {
		InternalResourceViewResolver re = new InternalResourceViewResolver();
		re.setPrefix("com.fac.service");
		re.setSuffix(".java");
		return re;
	}

}
