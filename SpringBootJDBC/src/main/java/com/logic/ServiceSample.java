package com.logic;

import java.util.List;

import javax.activation.DataSource;
import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class ServiceSample implements Samples {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Employee getOneEmployee(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertOneEmployee(Employee emp) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO employee " + "(empId, empName) VALUES (?, ?)";
		getJdbcTemplate.update(sql, new Object[] { emp.getId(), emp.getName() });

	}

	@Override
	public void insertAllEmployes(List<Employee> e2) {
		// TODO Auto-generated method stub

	}

}
