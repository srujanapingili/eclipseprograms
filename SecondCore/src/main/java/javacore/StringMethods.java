package javacore;

public class StringMethods {
	String str1 = "srujana";
	String str2 = "sravya";
	String str3 = "mounika";
	public static void main(String[] args) {
		StringMethods sm = new StringMethods();
		if (sm.str1.equals(sm.str2))
			System.out.println("hhh");
		else
			System.out.println("rr");
		String g = "good";
		char c = g.charAt(3);
		System.out.println(c);
		char d = sm.str1.charAt(2);
		System.out.println(d);
		System.out.println(g.length());
		System.out.println(sm.str1.length());
	}
	}
