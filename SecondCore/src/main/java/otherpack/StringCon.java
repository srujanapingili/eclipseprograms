package otherpack;

public class StringCon {
public void m1() {
	String s1="java";
	s1=s1.concat("language");
	System.out.println(s1);
}
public static void main(String[] args) {
	StringCon sc=new StringCon();
	sc.m1();
	}

}
