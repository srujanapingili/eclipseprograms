package tekGroup;

public class Details {
	public int a;
	public String name;
	public String city;

	public Details(int x, String y, String z) {
		this.a = x;
		this.name = y;
		this.city = z;
	}

	public void setA(int a) {
		this.a = a;
	}

	public void setName(String s) {
		this.name = s;

	}

	public void setCity(String s2) {
		this.city = s2;

	}

	public int getA() {
		return a;
	}

	public String getName() {
		return name;

	}

	public String getCity() {
		return city;
	}
}
