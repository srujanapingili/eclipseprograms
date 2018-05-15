package com.logic;

import java.util.List;

public interface Samples {
	public Employee getOneEmployee(String id);

	public List<Employee> getAllEmployees();

	public void insertOneEmployee(Employee e);

	public void insertAllEmployes(List<Employee> e2);
}
