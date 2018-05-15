package com.Tek.General;

public class EmptyLoop {
	public void noBody() {
		int first,second;
		first=10;
		second=20;
		while(++first<--second);
		System.out.println("the midpoint is:"+second);
		
	}

	public static void main(String[] args) {
	EmptyLoop emp=new EmptyLoop();
	emp.noBody();

	}

}
