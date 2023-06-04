package com.hsbc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hsbc.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	
}
