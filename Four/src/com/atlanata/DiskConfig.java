package com.atlanata;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DiskConfig {
	@Bean(name="owner")
	public Disk disk() {
		return new Disk();
	}

}
