package otherpack;

public class SubClass extends Super {
	int b=20;
	public static void main(String[] args) {
		Super sc=new SubClass();
		//SubClass sc2=(SubClass)sc;
				System.out.println(sc.a);
	}

}
