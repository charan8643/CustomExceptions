package com.Banking.Service;

import org.springframework.stereotype.Service;

import com.Banking.Entity.Account;
import com.Banking.Exceptions.AccountNotFoundException;
import com.Banking.Exceptions.BadRequestException;
import com.Banking.Repo.AccountRepo;
@Service
public class AccountService {


	    private final AccountRepo repo;

	    public AccountService(AccountRepo repo) {
	        this.repo = repo;
	    }

	    public Account createAccount(Account account) {

	        if (account == null) {
	            throw new BadRequestException("Account cannot be null");
	        }

	        if (account.getBalance() < 0) {
	            throw new BadRequestException("Balance cannot be negative");
	        }

	        return repo.save(account);
	    }

	    public Account getAccountById(int id) {
	        return repo.findById(id)
	                .orElseThrow(() ->
	                        new AccountNotFoundException("Account not found with id: " + id));
	    }

	    public Account updateAccount(int id, Account account) {

	        Account exist = repo.findById(id)
	                .orElseThrow(() ->
	                        new AccountNotFoundException("Account not found"));

	        exist.setAccountHolderName(account.getAccountHolderName());
	        exist.setBalance(account.getBalance());

	        return repo.save(exist);
	    }

	    public Account deleteAccount(int id) {

	        Account exist = repo.findById(id)
	                .orElseThrow(() ->
	                        new AccountNotFoundException("Account not found"));

	        repo.delete(exist);
			return exist;
	    }
	}


