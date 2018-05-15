package javacore;
public class Method {
	int age;
	int weight;
	int height;

	public void set(int a, int w, int h) {
		age = a;
		weight = w;
		height = h;
	}

	public int cal() {
		return age * weight * height;
	}

	public static void main(String[] args) {
		Method meth = new Method();
		meth.set(1, 2, 3);
		meth.cal();
		System.out.println(meth.cal());

	}

}
