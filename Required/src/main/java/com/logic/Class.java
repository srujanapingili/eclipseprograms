package com.logic;

import org.springframework.stereotype.Component;

@Component
public class Class {
	Employer em;

	public Employer getEm() {
		return em;
	}

	public void setEm(Employer em) {
		this.em = em;
	}
	public void method() {
		System.out.println("ghghg" +getEm().getCity());
	}

}
