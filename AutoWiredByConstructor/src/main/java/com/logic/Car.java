package com.logic;

public class Car {
	Tyre tyre;
	Tyre t;

	public Tyre getTyre() {
		return tyre;
	}

	public Car(Tyre tyre, Tyre t) {
		this.tyre = tyre;
	}

	public void sound() {
		System.out.println("balck color car rate is   " + getTyre().getBlack());
		System.out.println("white color car rate is   " + getTyre().getWhite());
	}
}
