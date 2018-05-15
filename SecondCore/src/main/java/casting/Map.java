package casting;

import java.util.*;
public class Map{
	public static void main(String[] args) {
		
	
	

List<String> l1= new ArrayList();
l1.add("foo");
List<String> l2=l1;
List<String> l3= new ArrayList<String>(l1);
l1.clear();
l2.add("bar");
System.out.println(l1);
System.out.println(l2);
System.out.println(l3);
int x=4;
int y=4;
if((x>2||y++ ==4)&&++y ==5) {
	x=1;
	System.out.println(x);
	System.out.println(y);
}
	}
}