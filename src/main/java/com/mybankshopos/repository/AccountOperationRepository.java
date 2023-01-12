package com.mybankshopos.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.mybankshopos.entity.AccountOperation;


public interface AccountOperationRepository extends JpaRepository<AccountOperation, Long> {
	List<AccountOperation> findByBankAccountId(String accountId);
	
	Page<AccountOperation> findByBankAccountIdOrderByOperationDateDesc(String accountId, Pageable pageable);
}
