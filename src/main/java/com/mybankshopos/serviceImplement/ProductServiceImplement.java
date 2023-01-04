package com.mybankshopos.serviceImplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybankshopos.entity.Product;
import com.mybankshopos.repository.ProductRepository;
import com.mybankshopos.service.ProductService;

@Service
public class ProductServiceImplement implements ProductService{
	
	
	@Autowired
	ProductRepository repository;

	@Override
	public List<Product> toList() {
		return repository.findAll();
	}

	@Override
	public Product toRegister(Product product) {
		return repository.save(product);
	}

	@Override
	public Product upDate(Product product) {
		return repository.save(product);
	}

	@Override
	public void delete(Integer code) {
		repository.deleteById(code);
		
	}

	@Override
	public Product ToListForId(Integer code) {
		return repository.findById(code).orElse(null);
	}

}
