package com.mybankshopos.service;

import java.util.List;

import com.mybankshopos.entity.Product;

public interface ProductService {
	
	List<Product> toList();
	Product toRegister(Product product);
	Product upDate(Product product);
	void delete(Integer code);
	Product ToListForId(Integer code);
	
	

}
