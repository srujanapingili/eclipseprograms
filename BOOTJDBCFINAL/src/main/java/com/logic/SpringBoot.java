package com.logic;

import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBoot {

	public static void main(String[] args) throws SQLException {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBoot.class, args);

		DataBase databaseOperations = (DataBase) context.getBean("databaseInit");

		databaseOperations.queryEmployees();

		databaseOperations.insertEmployee(new Employee(100, "David", 45));

		System.out.print("After insert, ");
		databaseOperations.queryEmployees();

	}
}