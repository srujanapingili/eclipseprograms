package com.school;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;
@Service("register")
public class StudentService implements Register {
	private static List<Student> students;
	private static final AtomicLong all = new AtomicLong();
	static {
		students = giveInformation();
	}

	private static List<Student> giveInformation() {
		List<Student> stu = new ArrayList<Student>();
		stu.add(new Student("srujana", 23, 3000, "srujana@gmail.com"));
		stu.add(new Student("mounika", 30, 5000, "mounika@gmail.com"));
		return stu;
	}

	public Student getOneStudent(String name) {
		for (Student stu : students) {
			if (stu.getName() == name)
				return stu;
		}
		return null;
	}

	public List<Student> getAllStudent() {
		return students;
	}

	public void saveOneStudent(Student student) {
		students.add(student);

	}

	public void updateOneStudent(Student student) {
		int index = students.indexOf(student);
		students.set(index, student);

	}

	public void deleteOneStudent(String name) {
		for (Iterator<Student> iterator = students.iterator(); iterator.hasNext();) {
			Student stud = iterator.next();
			if (stud.getName() == name) {
				iterator.remove();
			}

		}

	}

	public void deleteAllStudent() {
		students.clear();

	}

	public boolean isStudentExist(Student student) {
		return getOneStudent(student.getName()) != null;
	}

}
