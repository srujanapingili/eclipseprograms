package com.Tek.General;

public class ForComma {
	public void comma() {
		int fir,sec;
		for(fir=1,sec=5;fir<sec;fir++,sec--) {
			System.out.println("first value is "+fir);
			System.out.println("second value is   "+sec);
		}
	}

	public static void main(String[] args) {
		ForComma fc=new ForComma();
		fc.comma();

	}

}
