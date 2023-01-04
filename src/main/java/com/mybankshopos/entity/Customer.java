package com.mybankshopos.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "Document Type", nullable = false)
	private String documentType;

	@Column(name = "Document Number", nullable = false, unique = true)
	private int documentNumber;

	@Column(name = "Name", length = 60, nullable = false)
	private String name;

	@Column(name = "Last Name", length = 60, nullable = false)
	private String lastName;

	@Column(name = "Email", length = 60, nullable = false, unique = true)
	private String email;
	
	@Column(name = "Date Birth", nullable = false)
	private String dateBirth;
	
	
	@OneToMany(mappedBy = "customer")
	@JsonManagedReference
	private List<Product> product;


	public Customer() {
	}
	
	


	public Customer(Long id, String documentType, int documentNumber, String name, String lastName, String email,
			String dateBirth, String products, List<Product> product) {
		super();
		this.id = id;
		this.documentType = documentType;
		this.documentNumber = documentNumber;
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.dateBirth = dateBirth;
		this.product = product;
	}




	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDocumentType() {
		return documentType;
	}


	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}


	public int getDocumentNumber() {
		return documentNumber;
	}


	public void setDocumentNumber(int documentNumber) {
		this.documentNumber = documentNumber;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getDateBirth() {
		return dateBirth;
	}


	public void setDateBirth(String dateBirth) {
		this.dateBirth = dateBirth;
	}

	
	public List<Product> getProducts() {
		return product;
	}


	public void setProducts(List<Product> products) {
		this.product = products;
	}


	

}
