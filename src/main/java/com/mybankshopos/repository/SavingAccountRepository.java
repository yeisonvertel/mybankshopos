package com.mybankshopos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mybankshopos.entity.SavingAccount;



public interface SavingAccountRepository extends JpaRepository<SavingAccount, String> {

}
