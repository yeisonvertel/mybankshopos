package com.mybankshopos.dto;

import lombok.Data;
import java.util.Date;

import com.mybankshopos.enums.OperationType;

@Data
public class AccountOperationDTO {
    private Long id;
    private Date operationDate;
    private double amount;
    private OperationType type;
    private String description;
	
    public AccountOperationDTO() {

	}

	public AccountOperationDTO(Long id, Date operationDate, double amount, OperationType type, String description) {
		super();
		this.id = id;
		this.operationDate = operationDate;
		this.amount = amount;
		this.type = type;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getOperationDate() {
		return operationDate;
	}

	public void setOperationDate(Date operationDate) {
		this.operationDate = operationDate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public OperationType getType() {
		return type;
	}

	public void setType(OperationType type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
    
    
    
    
}

