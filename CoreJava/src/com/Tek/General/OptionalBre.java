package com.Tek.General;

public class OptionalBre {
	public void noBreak() {
		for(int no=0;no<6;no++) {
			switch(no) {
			case 0:
			case 1:System.out.println("apple");
			break;
			case 2:System.out.println("banana");
			case 3:System.out.println("carrot");
			break;
			default: System.out.println("mango");
			}
		}
	}

	public static void main(String[] args) {
		OptionalBre bre=new OptionalBre();
		bre.noBreak();
	

	}

}
