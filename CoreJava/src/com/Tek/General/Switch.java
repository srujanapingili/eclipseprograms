package com.Tek.General;

public class Switch {
	public void simple() {
		for(int sample=0;sample<3;sample++) {
			switch(sample) {
			case 0: System.out.println("a one");
			break;
			case 1: System.out.println("a two");
			break;
			default:System.out.println("no number");
			}
		}
	}

	public static void main(String[] args) {
		Switch objec=new Switch();
		objec.simple();

	}

}
