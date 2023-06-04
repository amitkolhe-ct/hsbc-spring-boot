package com.hsbc.service;

import com.hsbc.model.Customer;

public interface CustomerService {

	public Customer saveCustomer(Customer customer);
	public Customer getCustomer(int accountNumber);
	public Customer updateCustomer(Customer customer);
	public Customer deleteCustomer(int accountNumber);
}