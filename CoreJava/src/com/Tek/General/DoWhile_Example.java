package com.Tek.General;

public class DoWhile_Example {
	public void customer() throws java.io.IOException {
		char select;
		do {
			System.out.println("press 1 to listen the telugu songs");
			System.out.println("press 2 to listen the hindi songs");
			System.out.println("press 3 to listen the english song");
			System.out.println("choose the one option");
			select = (char) System.in.read();
		} while (select < '1' || select > '3');
		switch (select) {
		case '1':
			System.out.println("the telugu song is   :");
			break;
		case '2':
			System.out.println("the hindi song is  :");
			break;
		case '3':
			System.out.println("the english song is   :");
			break;
		}
	}

	public static void main(String[] args) throws java.io.IOException {
		DoWhile_Example phone = new DoWhile_Example();
		phone.customer();
	}

}
