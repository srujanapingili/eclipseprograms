package com.Tek.General;

public class ArrayWithNew {
	public void method2() {
		char alpha[];
		alpha = new char[2];
		alpha[0] = 'i';
		alpha[1] = 'h';
		System.out.println("the letter is " + alpha[0]);
	}

	public static void main(String args[]) {
		ArrayWithNew array = new ArrayWithNew();
		array.method2();
	}

}
