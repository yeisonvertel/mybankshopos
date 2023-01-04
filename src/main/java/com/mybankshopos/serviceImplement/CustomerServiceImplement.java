package com.mybankshopos.serviceImplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybankshopos.entity.Customer;
import com.mybankshopos.repository.CustomerRepository;
import com.mybankshopos.service.CustomerService;


@Service
public class CustomerServiceImplement implements CustomerService{
	
	@Autowired
	CustomerRepository repository;

	@Override
	public List<Customer> toList() {
		return repository.findAll();
	}

	@Override
	public Customer toRegister(Customer customer) {
		return repository.save(customer);
	}

	@Override
	public Customer upDate(Customer customer) {
		
		
		return repository.save(customer);
	}

	@Override
	public void delete(Integer code) {
		repository.deleteById(code);
	}

	@Override
	public Customer ToListForId(Integer code) {
		return repository.findById(code).orElse(null);
	}

}
