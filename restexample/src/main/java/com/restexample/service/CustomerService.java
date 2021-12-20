package com.restexample.service;

import java.util.List;

import com.restexample.entities.Customer;

public interface CustomerService {
	
	public List<Customer> getAllCustomer();
	public Customer addCustomer(Customer customer);

}
