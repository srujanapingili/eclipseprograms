package casting;

import java.util.ArrayList;
import java.util.List;

public class Student {
	public String name;
	public String id;
	public String city;

	Student(String s1, String s2, String s3) {
		this.name = s1;
		this.id = s2;
		this.city = s3;
	}

	public static void main(String[] args) {

		Student s1 = new Student("navya", "1", "atlanta");
		List<Student> l1 = new ArrayList<Student>();
		l1.add(s1);
		Student s2 = new Student("sneha", "2", "texas");
		l1.add(s2);
		Student s3 = new Student("devika", "3", "dekota");
		l1.add(s3);
		System.out.println(l1);

	}

}
