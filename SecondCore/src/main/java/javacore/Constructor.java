package javacore;
public class Constructor {
	public int weight;
	public int height;
	public int age;

	Constructor() {
		System.out.println("oen the construtor");
		weight = 1;
		age = 3;
	}

	public void me() {
		System.out.println(weight * height * age);
	}

	public static void main(String[] args) {
		Constructor cons = new Constructor();
		Constructor cons2 = new Constructor();
		cons.me();
		cons2.me();
	}
}
