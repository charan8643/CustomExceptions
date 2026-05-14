package com.Banking.Controller;



import java.util.Optional;


import org.springframework.web.bind.annotation.*;

import com.Banking.Entity.Account;
import com.Banking.Exceptions.AccountNotFoundException;
import com.Banking.Service.AccountService;


@RestController
@RequestMapping("/accounts")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    // ✅ CREATE ACCOUNT
    @PostMapping
    public Account createAccount(@RequestBody Account account) {
        return accountService.createAccount(account);
    }

    // ✅ GET ACCOUNT BY ID
    
    @GetMapping("/{id}")
    public Account getAccountById(@PathVariable int id)  {
        return accountService.getAccountById(id);
    }
    
    
    

    // ✅ UPDATE ACCOUNT
    @PutMapping("/{id}")
    public Account updateAccount(@PathVariable int id, @RequestBody Account account) throws AccountNotFoundException {
        return accountService.updateAccount(id, account);
    }
    
    @DeleteMapping("/{id}")
    public Account deleteAccount(int id ) {
    	return accountService.deleteAccount(id);
    }
}

