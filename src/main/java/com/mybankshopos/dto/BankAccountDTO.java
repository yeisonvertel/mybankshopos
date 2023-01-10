package com.mybankshopos.dto;

import lombok.Data;

@Data
public class BankAccountDTO {
    private String type;

	public BankAccountDTO() {
		super();
	}

	public BankAccountDTO(String type) {
		super();
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
    
    
}
