package com.logic;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DataBase {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void queryEmployees() {
		System.out.println("Query employees");
		String sql = "SELECT ID, NAME, AGE FROM EMPLOYEE";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
		for (Map<String, Object> row : list) {
			System.out.println(row.get("name"));
		}
	}

	public void insertEmployee(final Employee employee) throws SQLException {
	        System.out.println("Insert employee " + employee);
	        String sql = "INSERT into EMPLOYEE(ID, NAME, AGE) VALUES (?, ?, ?)";
	        jdbcTemplate.update(
	                sql,
	                new Object[] { employee.getId(), employee.getName(),
	                        employee.getAge() });

}
}