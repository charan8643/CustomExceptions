package com.Banking.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Banking.Entity.Account;

public interface AccountRepo extends JpaRepository<Account, Integer>{

}
