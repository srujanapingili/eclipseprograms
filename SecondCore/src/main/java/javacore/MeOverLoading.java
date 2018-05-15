package javacore;
public class MeOverLoading {
	public void add() {
		System.out.println("without parameter method");
	}
	public void add(double first) {
		System.out.println("integer parameter method");
	}
	public int add(int first, int second) {
		System.out.println("the integer with int return type");
		int third = first + second;
		return third;
	}
	public static void main(String[] args) {
		MeOverLoading me = new MeOverLoading();
		me.add();
		me.add(7.9);
		System.out.println(me.add(0, 9));
	}
}
