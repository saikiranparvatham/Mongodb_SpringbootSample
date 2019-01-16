package com.cg.employee.Employee_mongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.cg.employee.Employee_mongodb.repo.EmployeeRepository;

@SpringBootApplication
@ComponentScan("com")
public class EmployeeMongodbApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeMongodbApplication.class, args);
	}

}

