package com.restexample.dao;

import org.springframework.data.repository.CrudRepository;

import com.restexample.entities.Customer;
import com.restexample.entities.Employee;

public interface CustomerDao extends CrudRepository<Customer, Integer> {

}
