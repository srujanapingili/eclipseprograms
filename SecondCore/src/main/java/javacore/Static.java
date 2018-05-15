package javacore;

public class Static {
	static int a = 10;
	static int m1() {
		System.out.println("m1");
		return 10;
	}
	static {
		System.out.println("static block");
		System.out.println(a);
	}
	public static void main(String[] args) {
		System.out.println("the main method");
		System.out.println(a);
		System.out.println(m1());
	}
}
