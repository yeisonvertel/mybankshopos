package com.mybankshopos.dto;

import java.util.Date;

import lombok.Data;

@Data
public class CustomerDTO {
  
	private Long id;
	private String documentType;
	private int numberType;
	private Date dateBirth;
	private String name;
	private String lastName;
	private String email;
    
    
	public CustomerDTO() {
	}
	
	public CustomerDTO(Long id, String documentType, int numberType, Date dateBirth, String name, String lastName,
			String email) {
		super();
		this.id = id;
		this.documentType = documentType;
		this.numberType = numberType;
		this.dateBirth = dateBirth;
		this.name = name;
		this.lastName = lastName;
		this.email = email;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public int getNumberType() {
		return numberType;
	}

	public void setNumberType(int numberType) {
		this.numberType = numberType;
	}

	public Date getDateBirth() {
		return dateBirth;
	}

	public void setDateBirth(Date dateBirth) {
		this.dateBirth = dateBirth;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	  
    
}
