package com.Tek.General;

public class BoolType {

	private boolean test = true;

	public void method1() {
		System.out.println("the test is " + test);
		if (test)
			System.out.println("the character is  " + test);
		System.out.println("5<0" + (5 < 0));
	}

	public static void main(String[] args) {
		BoolType bool = new BoolType();
		bool.method1();

	}

}
