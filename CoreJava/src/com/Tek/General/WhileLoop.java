package com.Tek.General;

public class WhileLoop {
	public void loop() {
		int value=0;
		while(value<4) {
			System.out.println("the value is  "+value);
			value++;
		}
	}

	public static void main(String[] args) {
		WhileLoop whi=new WhileLoop();
		whi.loop();

	}

}
