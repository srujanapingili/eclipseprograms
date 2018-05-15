package javacore;
public class ConstructorOver {
	public int age;
	public int weight;
	public ConstructorOver() {
		age = 5;
		weight = 10;
	}
	public ConstructorOver(int x, int y) {
		age = x;
		weight = y;
		System.out.println("constructor overloading");
	}
	public void method() {
		System.out.println("the value is  " + age * weight);
	}
	public static void main(String[] args) {
		ConstructorOver con = new ConstructorOver();
		ConstructorOver con1 = new ConstructorOver(6, 8);
		con.method();
		con1.method();
	}
}
