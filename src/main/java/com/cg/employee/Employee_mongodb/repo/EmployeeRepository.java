package com.cg.employee.Employee_mongodb.repo;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cg.employee.Employee_mongodb.emp.Employee;


@Repository
public interface EmployeeRepository extends MongoRepository<Employee,Integer> {
	public Employee findByEmpName(String empName);
}
