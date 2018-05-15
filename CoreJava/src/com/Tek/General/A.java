package com.Tek.General;

public class A {
	public A() {
		m1("srujana");
	}

	public void m1(String s) {
		B b = new B();
		String x = b.m2(s);
		System.out.println(x);
	}

	public static void main(String[] args) {
	A a=new A();
	}
}
