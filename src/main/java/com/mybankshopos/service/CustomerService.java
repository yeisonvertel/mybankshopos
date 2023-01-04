package com.mybankshopos.service;

import java.util.List;
import com.mybankshopos.entity.Customer;

public interface CustomerService {
	
	List<Customer> toList();
	Customer toRegister(Customer customer);
	Customer upDate(Customer customer);
	void delete(Integer code);
	Customer ToListForId(Integer code);
}
