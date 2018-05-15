package otherpack;

public class Car implements Engine {
	public void run() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		Car car = new Car();
		car.run();
	}
}
