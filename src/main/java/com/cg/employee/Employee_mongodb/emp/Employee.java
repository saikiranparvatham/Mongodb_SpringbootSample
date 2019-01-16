package com.cg.employee.Employee_mongodb.emp;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Employee {
	@Id
	private int empId;
	
	public Employee(int empId, String empName, double salary) {
		
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		
	}
	public String empName;
	private  double salary;
	
	
	
	public Employee() {
		
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
