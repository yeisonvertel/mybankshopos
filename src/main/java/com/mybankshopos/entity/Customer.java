package com.mybankshopos.entity;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String documentType;
	private int documentNumber;
	private String name;
	private String lastName;
	private String email;
	private String dateBirth;

	
	@OneToMany(mappedBy = "customer")
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private List<BankAccount> bankAccounts;


	public Customer() {
	}


	public Customer(Long id, String documentType, int documentNumber, String name, String lastName, String email,
			String dateBirth, List<BankAccount> bankAccounts) {
		super();
		this.id = id;
		this.documentType = documentType;
		this.documentNumber = documentNumber;
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.dateBirth = dateBirth;
		this.bankAccounts = bankAccounts;
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


	public List<BankAccount> getBankAccounts() {
		return bankAccounts;
	}


	public void setBankAccounts(List<BankAccount> bankAccounts) {
		this.bankAccounts = bankAccounts;
	}
	
	

	
	
}
