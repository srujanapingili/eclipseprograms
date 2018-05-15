package com.school;

public class Student {
	public String name;
	public int age;
	public long cellNumber;
	public String gmail;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + (int) (cellNumber ^ (cellNumber >>> 32));
		result = prime * result + ((gmail == null) ? 0 : gmail.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (cellNumber != other.cellNumber)
			return false;
		if (gmail == null) {
			if (other.gmail != null)
				return false;
		} else if (!gmail.equals(other.gmail))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public long getCellNumber() {
		return cellNumber;
	}

	public void setCellNumber(long cellNumber) {
		this.cellNumber = cellNumber;
	}

	public String getGmail() {
		return gmail;
	}

	public void setGmail(String gmail) {
		this.gmail = gmail;
	}

	public Student(String name, int age, long cellNumber, String gmail) {
		this.name = name;
		this.age = age;
		this.cellNumber = cellNumber;
		this.gmail = gmail;
	}

	public String toString() {
		return "The student details are: name is" + name + "age is" + age + "cellNumber is" + cellNumber + "gmail id is"
				+ gmail;
	}
}
