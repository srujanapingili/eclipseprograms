package otherpack;

public class Demo {
	public Student createStudent(String s1, String s2, String s3) {
		Student student = new Student(s1, s2, s3);
		student.setNumber(s1);
		student.setName(s2);
		student.setCity(s3);
		return student;

	}

	public static void main(String[] args) {
		Demo demo = new Demo();
		Student sg = demo.createStudent("67", "srujana", "atlanta");
		System.out.println(sg);

	}

}
