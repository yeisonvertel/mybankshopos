package com.mybankshopos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mybankshopos.entity.Product;


public interface ProductRepository extends JpaRepository<Product, Integer> {
	

}
