package com.Tek.General;

public class StringSwitch {
	public void string() {
		String stri="laptop";
		switch(stri) {
		case "phone":
			System.out.println("the thing is phone ");
		case "tv":
		System.out.println("the thing is tv");
		case "laptop":
		System.out.println("the thing is laptop");
		break;
		default: System.out.println("the thing is not matching");
		}
	}

	public static void main(String[] args) {
	StringSwitch swiss=new StringSwitch();
	swiss.string();
	}

}
