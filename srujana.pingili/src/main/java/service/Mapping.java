package service;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import access.Student;

public class Mapping {
	public Student retriveStu(HttpServletRequest request, HttpServletResponse response) {
		int id1=request.getParameter(id);
		String name1=request.getParameter("name");
		String city1=request.getParameter("city");
		Student stu=new Student(id1,name1,city1);
		return stu;
	}
}
