package com.hsbc.serviceImpl;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hsbc.dao.CustomerRepository;
import com.hsbc.model.Customer;
import com.hsbc.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customer saveCustomer(Customer customer) {
		Customer customer2;
		if(!Objects.isNull(customer)) {
			int amount = Integer.parseInt(customer.getAmount());
			if(amount >= 500) {
				customer2 = customerRepository.save(customer);
			}
			
		}
		return ;
	}

	@Override
	public Customer getCustomer(int accountNumber) {
		
		return null;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer deleteCustomer(int accountNumber) {
		// TODO Auto-generated method stub
		return null;
	}

}
