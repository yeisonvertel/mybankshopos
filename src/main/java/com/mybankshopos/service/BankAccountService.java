package com.mybankshopos.service;

import java.util.List;

import com.mybankshopos.dto.AccountHistoryDTO;
import com.mybankshopos.dto.AccountOperationDTO;
import com.mybankshopos.dto.BankAccountDTO;
import com.mybankshopos.dto.CurrentBankAccountDTO;
import com.mybankshopos.dto.CustomerDTO;
import com.mybankshopos.dto.SavingBankAccountDTO;
import com.mybankshopos.excepciones.BalanceNotSufficientException;
import com.mybankshopos.excepciones.BankAccountNotFoundException;
import com.mybankshopos.excepciones.CustomerNotFoundException;


public interface BankAccountService {
	
	CustomerDTO saveCustomer(CustomerDTO customerDTO);
	
	CustomerDTO updateCustomer(CustomerDTO customerDTO);
	
	List<CustomerDTO> listCustomers();
	
	void deleteCustomer(Long customerId);
	
	CustomerDTO getCustomer(Long customerId) throws CustomerNotFoundException;
	
	CurrentBankAccountDTO saveCurrentBankAccount(double initialBalance, double overDraft, Long customerId) throws CustomerNotFoundException;
	
	SavingBankAccountDTO saveSavingBankAccount(double initialBalance, double interestRate, Long customerId) throws CustomerNotFoundException;
	
	BankAccountDTO getBankAccount(String accountId) throws BankAccountNotFoundException;
	
	void debit(String accountId, double amount, String description) throws BankAccountNotFoundException, BalanceNotSufficientException;
	
	void credit(String accountId, double amount, String description) throws BankAccountNotFoundException;
	
	void transfert(String accountIdSource, String accountIdDestination, double amount) throws BankAccountNotFoundException, BalanceNotSufficientException;
	
	List<BankAccountDTO> listBankAccount();
	
	List<AccountOperationDTO> historique(String accountId);
	
	AccountHistoryDTO getAccountHistory(String accountId, int page, int size) throws BankAccountNotFoundException;
	
	List<CustomerDTO> searchCustomers(String keyword);
}
