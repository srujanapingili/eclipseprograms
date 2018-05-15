package constructor;

public class Second extends Parent {
	public String id;

	public Second() {
		super();
	}

	public Second(String name, String city) {
		super(name, city);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
