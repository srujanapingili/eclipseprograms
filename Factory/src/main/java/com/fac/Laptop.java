package com.fac;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.fac.depen.KeyBoard;
@Component
public class Laptop {
	@Bean(name="srujana")
	public KeyBoard key() {
		return new KeyBoard();
	}

}
