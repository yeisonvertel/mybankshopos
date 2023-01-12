package com.mybankshopos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mybankshopos.entity.CurrentAccount;



public interface CurrentAccountRepository extends JpaRepository<CurrentAccount, String> {

}
