package com.restexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.restexample.entities.Customer;
import com.restexample.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	
	@GetMapping(value="/customers",produces= {MediaType.APPLICATION_XML_VALUE})
	public List<Customer> getAllCustomer(){
		List<Customer> customerList= customerService.getAllCustomer();
		//return customerService.getAllCustomer();
	    return customerList;
	}
	
	//@PostMapping("/customers")
	@PostMapping(value = "/customers",consumes= {MediaType.APPLICATION_JSON_VALUE},produces= {MediaType.APPLICATION_XML_VALUE})
	public Customer addCustomer(@RequestBody Customer customer) {
		
		return customerService.addCustomer(customer);
		
	}

}
