package com.restexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restexample.entities.Employee;
import com.restexample.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/greet/{name}")
	public String displayGreetings(@PathVariable String name) {
			return "Hello "+name;
	}
	
	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		return employeeService.getEmployees();
		}
	
	@PostMapping("/addemployee")
	public String addEmployee(@RequestBody Employee employee) {
		
		Boolean isEmployeeAdded = employeeService.addEmployee(employee);
		if(isEmployeeAdded) {
			return "Employee added";
		}
			else {
				return "unable to add";
			}
		
	}
}
