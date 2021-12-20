
package com.restexample.service;

import java.util.List;

import com.restexample.entities.Employee;


public interface EmployeeService {
	public List<Employee> getEmployees();
	public List<Employee> getAllEmployees();
	
	public Boolean addEmployee(Employee employee);
	
	public Employee getEmployeeByID(Integer empId);
}