package com.hsbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hsbc.model.Customer;
import com.hsbc.service.CustomerService;

import jakarta.validation.Valid;

@RestController
public class CustmorController {
	
	@Autowired
	private CustomerService customerService;

	@PostMapping("/saveCustomer")
	public Customer saveCustomer(@Valid @RequestBody Customer customer) {
		System.out.println(customer);
		return customerService.saveCustomer(customer);
	}
}
