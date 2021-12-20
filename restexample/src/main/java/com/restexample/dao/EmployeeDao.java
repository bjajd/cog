package com.restexample.dao;

import org.springframework.data.repository.CrudRepository;

import com.restexample.entities.Employee;

public interface EmployeeDao extends CrudRepository<Employee, Integer> {

}
