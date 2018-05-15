package javacore;
public class ParaCon {
	private int age;
	private int weight;
	private int height;

	ParaCon(int one, int two, int three) {
		age = one;
		weight = two;
		height = three;
	}

	public void meth() {
		System.out.println("the calculation is" + age * weight * height);
	}

	public static void main(String[] args) {
		ParaCon par = new ParaCon(10, 10, 10);
		ParaCon par3 = new ParaCon(20, 20, 20);
		par.meth();
		par3.meth();
	}

}
