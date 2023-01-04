package com.mybankshopos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.mybankshopos.entity.Customer;
import com.mybankshopos.service.CustomerService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/customer")

public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	@GetMapping
	public ResponseEntity<List<Customer>> toList(){
		List<Customer> obj = service.toList();
		return new ResponseEntity<List<Customer>>(obj, HttpStatus.OK);
	}
	
	@PostMapping 
	public ResponseEntity<Void> toRegister(@RequestBody Customer customer){
		Customer obj = service.toRegister(customer);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@PutMapping
	public ResponseEntity<Customer> upDate(@RequestBody Customer customer){
		Customer obj = service.upDate(customer);
		return new ResponseEntity<Customer>(obj, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(Integer id) throws Exception{
		Customer obj= service.ToListForId(id);
		if(obj == null) {
			throw new Exception("No se encontró el cliente");
		}
		service.delete(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
		
	
}
