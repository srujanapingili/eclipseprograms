package com.Tek.General;

public class CharLikeInteger {
	public char method() {
		   char beforeIncrement='a';
		System.out.println("the charater is  "+beforeIncrement);
beforeIncrement++;
		
	return beforeIncrement;
	}

	public static void main(String[] args) {
		CharLikeInteger obj=new CharLikeInteger();
		
	
		System.out.println("the charater after the increment is  "+ obj.method());
	}

}
