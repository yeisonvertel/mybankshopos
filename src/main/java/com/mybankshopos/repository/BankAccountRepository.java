package com.mybankshopos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mybankshopos.entity.BankAccount;

public interface BankAccountRepository extends JpaRepository<BankAccount,String>{

}
