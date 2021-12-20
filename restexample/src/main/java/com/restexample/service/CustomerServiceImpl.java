
package com.restexample.service;
import java.util.List;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restexample.dao.CustomerDao;
import com.restexample.entities.Customer;

@Service

public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomerDao customerDao;
	@Override
	public List<Customer> getAllCustomer(){
		return (List<Customer>) customerDao.findAll();
	}
	
	@Override
	public Customer addCustomer(Customer customer) {
		return customerDao.save(customer);
	}
	
}