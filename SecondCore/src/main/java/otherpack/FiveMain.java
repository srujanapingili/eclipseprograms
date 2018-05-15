package otherpack;
public class FiveMain {
	public static void main(String[] args) {
		Five f = new Five();
		FiveTwo ft = new FiveTwo();
		int x = f.m1(6);
		System.out.println(x);
		String g = ft.m2("hello");
		System.out.println(g);
	}
}
