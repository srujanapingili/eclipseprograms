package otherpack;

public class OneTwo {

	public void m1(One s) {

		String ss = s.s + "hi";
		System.out.println(ss);
	}

	public static void main(String[] args) {
		OneTwo ot = new OneTwo();
		One obj = new One();
		ot.m1(obj);
	}

}
