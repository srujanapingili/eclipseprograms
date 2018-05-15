package com.Tek.General;

public class ArrayWithoutNew {
	public void method3(){
		int numbers[]= {2,6,8,10};
		System.out.println("the  0 index value is   "+ numbers[3]);
	}

	public static void main(String[] args) {
		ArrayWithoutNew without=new ArrayWithoutNew();
		without.method3();

	}

}
