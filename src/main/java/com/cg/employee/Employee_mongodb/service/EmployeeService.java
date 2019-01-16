package com.cg.employee.Employee_mongodb.service;

import java.util.List;
import java.util.Optional;

import com.cg.employee.Employee_mongodb.emp.Employee;







public interface EmployeeService {

	public void addNewEmployee(Employee employee);
	
	List<Employee> getAllEmployees();

	public void updateEmployee(Employee employee);

	/*public void deleteEmployee(int empId);*/

	public Optional<Employee> findById(int empId);
}