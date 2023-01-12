package com.mybankshopos.entity;

import java.util.Date;
import java.util.List;

import com.mybankshopos.enums.AccountStatus;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("SA")
public class SavingAccount extends BankAccount {
	
	private double interestRate; //taux d'interet

	
	
	public SavingAccount(String id, double balance, Date createdAt, AccountStatus status, Customer customer,
			List<AccountOperation> accountOperations, double interestRate) {
		super(id, balance, createdAt, status, customer, accountOperations);
		this.interestRate = interestRate;
	}
	public SavingAccount() {
		super();
		
	}
	public SavingAccount(String id, double balance, Date createdAt, AccountStatus status, Customer customer,
			List<AccountOperation> accountOperations) {
		super(id, balance, createdAt, status, customer, accountOperations);
		
	}

	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	
}
