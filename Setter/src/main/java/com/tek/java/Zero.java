package com.tek.java;

public class Zero {
	String name;
	int a;

	public String getName() {
		return name;
	}

	public Zero(String name) {
		this.name = name;
	}

	public Zero(int a) {
		this.a = a;
	}

	public Zero(String name, int a) {
		this.name = name;
		this.a = a;
	}

	public void method() {
		System.out.println("zero is " + name + a);
	}
}
