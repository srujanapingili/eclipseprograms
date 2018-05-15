package com.Tek.General;

public class Test {

	public static void main(String[] args) {
Parent p=new Parent();
Child_2 ch=new Child_2();
p.rose();
ch.rose();
ch=(Child_2)p;
ch.rose();

	}

}
