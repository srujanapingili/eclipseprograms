package college;

public class Student {
	public int id;
	public String name;
	public String city;

	public Student(int a, String s1, String s3) {
		this.id = a;
		this.name = s1;
		this.city = s3;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

}
