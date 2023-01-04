package com.mybankshopos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mybankshopos.entity.Product;
import com.mybankshopos.service.ProductService;


@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@GetMapping
	public ResponseEntity<List<Product>> toList(){
		List<Product> obj = service.toList();
		return new ResponseEntity<List<Product>>(obj, HttpStatus.OK);
	}
	
	@PostMapping 
	public ResponseEntity<Product> toRegister(@RequestBody Product product){
		Product obj = service.toRegister(product);
		return new ResponseEntity<Product>(obj, HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<Product> upDate(@RequestBody Product product){
		Product obj = service.upDate(product);
		return new ResponseEntity<Product>(obj, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(Integer id) throws Exception{
		Product obj= service.ToListForId(id);
		if(obj == null) {
			throw new Exception("No se encontró el producto");
		}
		service.delete(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Product> ToListForId(@PathVariable("id") Integer code) throws Exception{
		Product obj= service.ToListForId(code);
		if(obj == null) {
			throw new Exception("No se encontró el producto");
		}
		service.delete(code);
		return new ResponseEntity<Product>(obj, HttpStatus.OK);
	}
		

}
