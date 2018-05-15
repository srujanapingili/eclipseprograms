package com.school;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControlStudent {
	@Autowired
	Register register;

	@RequestMapping("/value")
	public List<Student> allStudents() {
		List<Student> s = register.getAllStudent();
		return s;
	}

}
