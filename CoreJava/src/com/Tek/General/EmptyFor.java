package com.Tek.General;

public class EmptyFor {
	public void noint() {
		int num=0;
		boolean boo=true;
		for(;boo;) {
			System.out.println("the value is  "+num);
			if(num==4)boo=false;
			num++;
		}
	}

	public static void main(String[] args) {
		EmptyFor ef=new EmptyFor();
		ef.noint();

	}

}
