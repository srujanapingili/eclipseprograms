package com.logic;

public class Service {
	String name;
	String city;
	public void getName() {
		System.out.println(this.name);
	}
	public void setName(String name) {
		this.name = name;
	}
	public void getCity() {
		System.out.println(this.city);
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void exception() {
		throw new IllegalArgumentException();
	}
	

}
