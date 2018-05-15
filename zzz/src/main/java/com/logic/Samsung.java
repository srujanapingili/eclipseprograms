package com.logic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("s")
public class Samsung implements Phone {
	public void cost() {
		System.out.println("$200");

	}

	public void model() {
		System.out.println("less");
	}
}
