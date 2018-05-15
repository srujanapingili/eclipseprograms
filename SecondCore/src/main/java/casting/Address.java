
package casting;

import java.util.ArrayList;
import java.util.List;

public class Address {
	public String name;
	public String id;
	public String city;

	Address(String s1, String s2, String s3) {
		this.name = s1;
		this.id = s2;
		this.city = s3;
	}

	public static void main(String[] args) {

		Address s1 = new Address("aishu", "1", "atlanta");
		List<Address> l1 = new ArrayList<Address>();
		l1.add(s1);
		Address s2 = new Address("mounika", "2", "texas");
		l1.add(s2);
		Address s3 = new Address("navya sri", "3", "dekota");
		l1.add(s3);
		System.out.println(l1);

	}

}
