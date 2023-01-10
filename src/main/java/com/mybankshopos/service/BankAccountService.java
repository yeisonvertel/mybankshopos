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
    CurrentBankAccountDTO saveCurrentBankAccount(double initialBalance, double overDraft, Long customerId) throws CustomerNotFoundException;
    SavingBankAccountDTO saveSavingBankAccount(double initialBalance, double interestRate, Long customerId) throws CustomerNotFoundException;
    List<CustomerDTO> listCustomers();
    BankAccountDTO getBankAccount(String accountId) throws BankAccountNotFoundException;
    void debit(String accountId, double amount, String description) throws BankAccountNotFoundException, BalanceNotSufficientException;
    void credit(String accountId, double amount, String description) throws BankAccountNotFoundException;
    void transfer(String accountIdSource, String accountIdDestination, double amount) throws BankAccountNotFoundException, BalanceNotSufficientException;

    List<BankAccountDTO> bankAccountList();

    CustomerDTO getCustomer(Long customerId) throws CustomerNotFoundException;

    CustomerDTO updateCustomer(CustomerDTO customerDTO);

    void deleteCustomer(Long customerId);

    List<AccountOperationDTO> accountHistory(String accountId);

    AccountHistoryDTO getAccountHistory(String accountId, int page, int size) throws BankAccountNotFoundException;

    List<CustomerDTO> searchCustomers(String keyword);
}
