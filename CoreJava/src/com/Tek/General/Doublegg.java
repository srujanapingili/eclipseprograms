package com.Tek.General;

public class Doublegg {
public double circle(double radi) {
double pi=3.14;
double radius =pi*radi*radi;
return radius;
}
	public static void main(String[] args) {
		Doublegg dou=new Doublegg();
		double result= dou.circle(7);
System.out.println("the radius of the circle is:  "+result);

	}

}
