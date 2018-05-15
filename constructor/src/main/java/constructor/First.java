package constructor;

public class First extends Parent {
	public int id;

	public First() {
		super();
	}

	public First(String name, String city) {
		super(name, city);

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
