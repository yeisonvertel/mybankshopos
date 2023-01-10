package com.mybankshopos.entity;



import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("CA")
@Data @NoArgsConstructor @AllArgsConstructor

public class CurrentAccount extends BankAccount {
	
	private double overDraft;

	public CurrentAccount() {
	}

	public CurrentAccount(double overDraft) {
		super();
		this.overDraft = overDraft;
	}

	public double getOverDraft() {
		return overDraft;
	}

	public void setOverDraft(double overDraft) {
		this.overDraft = overDraft;
	}
	
	
	
	

}
