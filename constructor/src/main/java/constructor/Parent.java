package constructor;

public abstract class Parent {
	public String name;
	public String city;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Parent() {

	}

	public Parent(String name, String city) {
		this.name = name;
		this.city = city;
	}

	public String toString() {
		return name + " " + city;
	}

}
