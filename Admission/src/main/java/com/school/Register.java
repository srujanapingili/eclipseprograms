package com.school;

import java.util.List;

public interface Register {
	public Student getOneStudent(String name);

	public List<Student> getAllStudent();

	public void saveOneStudent(Student student);

	public void updateOneStudent(Student student);

	public void deleteOneStudent(String name);

	public void deleteAllStudent();

	public boolean isStudentExist(Student student);
}
