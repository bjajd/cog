/**
 * 
 */
package com.restexample.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.restexample.entities.Employee;

@Component
public class EmployeeServiceImpl implements EmployeeService {

 @Override
public List<Employee> getEmployees() {
// TODO Auto-generated method stub
List<Employee> empList = new ArrayList();
Employee emp = new Employee();
emp.setEmpId(15);
emp.setEmpName("Naren");
empList.add(emp);

 Employee emp1 = new Employee();
emp1.setEmpId(16);
emp1.setEmpName("Rakesh");
empList.add(emp1);
return empList;
}

 @Override
public List<Employee> getAllEmployees() {
List<Employee> empList = new ArrayList();
Employee emp = new Employee();
emp.setEmpId(17);
emp.setEmpName("Purushottam");
empList.add(emp);

 Employee emp1 = new Employee();
emp1.setEmpId(18);
emp1.setEmpName("Likhitha");
empList.add(emp1);
return empList;
}

 @Override
public Boolean addEmployee(Employee employee) {
// TODO Auto-generated method stub
List<Employee> emplist = new ArrayList();
if(employee.getEmpId() >1) {
emplist.add(employee);
}else {
return false;
}
return true;
}

 @Override
public Employee getEmployeeByID(Integer empId) {
//Search DB with the ID and return the Employee object
Employee employee = new Employee();
employee.setEmpId(15);
employee.setEmpName("Prabhat");
if(employee.getEmpId() == empId) {
return employee;
}else {
return null;
}
}

}



















/*
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.helloworldmvc.dao.EmployeeRepository;
import com.helloworldmvc.model.Employee;


@Component
public class EmployeeServiceImpl implements EmployeeService {
/*	@Autowired
	EmployeeRepository employeeRepository;

 @Override
	public List<Employee> getEmployees() {
	List<Employee> empList = (List<Employee>) employeeRepository.findAll();
	return empList;
	}

 @Override
	public List<Employee> getAllEmployees() {
	List<Employee> empList = (List<Employee>) employeeRepository.findAll();
	return empList;
	}

 @Override
	public Boolean addEmployee(Employee employee) {
	Employee emp = employeeRepository.save(employee);
	if(emp != null) {
	return true;
	}
	return false;
	}

 @Override
	public Employee getEmployeeByID(Integer empId) {
	return employeeRepository.findById(empId).orElseThrow(EntityNotFoundException::new);
	}

}

	*//*
	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		List<Employee> empList = new ArrayList();
		Employee emp = new Employee();
		emp.setEmpId(15);
		emp.setEmpName("Naren");
		empList.add(emp);

		Employee emp1 = new Employee();
		emp1.setEmpId(16);
		emp1.setEmpName("Rakesh");
		empList.add(emp1);
		
		return empList;
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> empList = new ArrayList();
		Employee emp = new Employee();
		emp.setEmpId(17);
		emp.setEmpName("Purushottam");
		empList.add(emp);

		Employee emp1 = new Employee();
		emp1.setEmpId(18);
		emp1.setEmpName("Likhitha");
		empList.add(emp1);
		
		return empList;
	}

	@Override
	public Boolean addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		List<Employee> emplist = new ArrayList();
		if(employee.getEmpId() >1) {
			emplist.add(employee);
		}else {
			return false;
		}
		return true;
	}

	@Override
	public Employee getEmployeeByID(Integer empId) {
		//Search DB with the ID and return the Employee object
		Employee employee = new Employee();
		employee.setEmpId(18);
		employee.setEmpName("Jiya");
		if(employee.getEmpId() == empId) {
		
			return employee;
		}else {
			return null;
		}
	
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployeeByID(Integer empId) {
		// TODO Auto-generated method stub
		return null;
	}
}
*/
