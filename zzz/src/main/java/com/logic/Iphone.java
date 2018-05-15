package com.logic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("i")
public class Iphone implements Phone {
	public void cost() {
		System.out.println("$700");
	}

	public void model() {
		System.out.println("more");
	}

}
